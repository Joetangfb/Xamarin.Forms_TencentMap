package mono.com.tencent.tencentmap.mapsdk.map;


public class OnMapLongPressListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.tencent.tencentmap.mapsdk.map.OnMapLongPressListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onMapLongPress:(Lcom/tencent/mapsdk/raster/model/LatLng;)V:GetOnMapLongPress_Lcom_tencent_mapsdk_raster_model_LatLng_Handler:Com.Tencent.Tencentmap.Mapsdk.Map.IOnMapLongPressListenerInvoker, TencentMapBinding\n" +
			"";
		mono.android.Runtime.register ("Com.Tencent.Tencentmap.Mapsdk.Map.IOnMapLongPressListenerImplementor, TencentMapBinding, Version=0.1.0.0, Culture=neutral, PublicKeyToken=null", OnMapLongPressListenerImplementor.class, __md_methods);
	}


	public OnMapLongPressListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == OnMapLongPressListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Tencent.Tencentmap.Mapsdk.Map.IOnMapLongPressListenerImplementor, TencentMapBinding, Version=0.1.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onMapLongPress (com.tencent.mapsdk.raster.model.LatLng p0)
	{
		n_onMapLongPress (p0);
	}

	private native void n_onMapLongPress (com.tencent.mapsdk.raster.model.LatLng p0);

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
