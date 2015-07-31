using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.Content.Res;
using Android.Graphics;
using Android.Graphics.Drawables;
using Android.OS;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using Com.Tencent.Mapsdk.Raster.Model;
using Com.Tencent.Tencentmap.Mapsdk.Map;
using MyTencentMap;
using MyTencentMap.Droid;
using Xamarin.Forms;
using Xamarin.Forms.Platform.Android;
using View = Android.Views.View;

[assembly: ExportRenderer(typeof(TencentMapPage), typeof(CustomTencentMapRenderer))]
namespace MyTencentMap.Droid {
    public class CustomTencentMapRenderer : PageRenderer {

        private TencentMapPage myAMapPage;
        private LinearLayout layout1;
        private MapView mapView;
        private Bundle bundle;

        protected override void OnElementChanged(ElementChangedEventArgs<Page> e) {

            base.OnElementChanged(e);
            myAMapPage = e.NewElement as TencentMapPage;
            layout1 = new LinearLayout(this.Context);
            this.AddView(layout1);

            mapView = new MapView(this.Context) {                
                LayoutParameters = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MatchParent, ViewGroup.LayoutParams.MatchParent)
            };            
            LatLng SHANGHAI = new LatLng( 31.238068,  121.501654);            
            mapView.Map.SetCenter(SHANGHAI);

            var pins = myAMapPage.Pins;

            Drawable d = Resources.GetDrawable(Resource.Drawable.red_location);
            Bitmap bitmap = ((BitmapDrawable)d).Bitmap;
            LatLng latLng1;
            foreach (UserTaskEntInfo pin in pins) {
                latLng1 = new LatLng(pin.Longitude ?? 31.238068, pin.Latitude ?? 121.501654);                
                var markOption = new MarkerOptions();
                markOption.InvokeIcon(new BitmapDescriptor(bitmap));
                markOption.InvokeTitle(pin.Name);
                markOption.InvokePosition(latLng1);
                var fix = mapView.Map.AddMarker(markOption);
                fix.ShowInfoWindow();
            }
            mapView.Map.SetZoom(15); 
            mapView.OnCreate(bundle);
            layout1.AddView(mapView);

        }

        protected override void OnLayout(bool changed, int l, int t, int r, int b) {
            base.OnLayout(changed, l, t, r, b);
            var msw = View.MeasureSpec.MakeMeasureSpec(r - l, MeasureSpecMode.Exactly);
            var msh = View.MeasureSpec.MakeMeasureSpec(b - t, MeasureSpecMode.Exactly);
            layout1.Measure(msw, msh);
            layout1.Layout(0, 0, r - l, b - t);
        }
    }
}