using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace MyTencentMap {

    public class TencentMapPage : ContentPage {

        public static BindableProperty PinsProperty =
                    BindableProperty.Create<TencentMapPage, IEnumerable>(p => p.Pins, default(IEnumerable));

        public IEnumerable Pins {
            get {
                return (IEnumerable)GetValue(PinsProperty);
            }
            set {
                this.SetValue(PinsProperty, value);
            }
        }
    }
}
