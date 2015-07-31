package mono.com.tencent.tencentmap.mapsdk.map;


public class TencentMap_OnMapClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapClickListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onMapClick:(Lcom/tencent/mapsdk/raster/model/LatLng;)V:GetOnMapClick_Lcom_tencent_mapsdk_raster_model_LatLng_Handler:Com.Tencent.Tencentmap.Mapsdk.Map.TencentMap/IOnMapClickListenerInvoker, TencentMapBinding\n" +
			"";
		mono.android.Runtime.register ("Com.Tencent.Tencentmap.Mapsdk.Map.TencentMap/IOnMapClickListenerImplementor, TencentMapBinding, Version=0.1.0.0, Culture=neutral, PublicKeyToken=null", TencentMap_OnMapClickListenerImplementor.class, __md_methods);
	}


	public TencentMap_OnMapClickListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == TencentMap_OnMapClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Tencent.Tencentmap.Mapsdk.Map.TencentMap/IOnMapClickListenerImplementor, TencentMapBinding, Version=0.1.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onMapClick (com.tencent.mapsdk.raster.model.LatLng p0)
	{
		n_onMapClick (p0);
	}

	private native void n_onMapClick (com.tencent.mapsdk.raster.model.LatLng p0);

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
