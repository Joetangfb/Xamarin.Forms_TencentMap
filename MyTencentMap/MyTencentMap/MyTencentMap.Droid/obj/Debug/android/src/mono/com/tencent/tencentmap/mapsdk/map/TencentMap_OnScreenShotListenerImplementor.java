package mono.com.tencent.tencentmap.mapsdk.map;


public class TencentMap_OnScreenShotListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.tencent.tencentmap.mapsdk.map.TencentMap.OnScreenShotListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onMapScreenShot:(Landroid/graphics/Bitmap;)V:GetOnMapScreenShot_Landroid_graphics_Bitmap_Handler:Com.Tencent.Tencentmap.Mapsdk.Map.TencentMap/IOnScreenShotListenerInvoker, TencentMapBinding\n" +
			"";
		mono.android.Runtime.register ("Com.Tencent.Tencentmap.Mapsdk.Map.TencentMap/IOnScreenShotListenerImplementor, TencentMapBinding, Version=0.1.0.0, Culture=neutral, PublicKeyToken=null", TencentMap_OnScreenShotListenerImplementor.class, __md_methods);
	}


	public TencentMap_OnScreenShotListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == TencentMap_OnScreenShotListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Tencent.Tencentmap.Mapsdk.Map.TencentMap/IOnScreenShotListenerImplementor, TencentMapBinding, Version=0.1.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onMapScreenShot (android.graphics.Bitmap p0)
	{
		n_onMapScreenShot (p0);
	}

	private native void n_onMapScreenShot (android.graphics.Bitmap p0);

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
