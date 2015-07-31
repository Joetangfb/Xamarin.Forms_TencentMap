package mono.com.tencent.tencentmap.mapsdk.map;


public class TencentMap_OnMarkerClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onMarkerClick:(Lcom/tencent/mapsdk/raster/model/Marker;)Z:GetOnMarkerClick_Lcom_tencent_mapsdk_raster_model_Marker_Handler:Com.Tencent.Tencentmap.Mapsdk.Map.TencentMap/IOnMarkerClickListenerInvoker, TencentMapBinding\n" +
			"";
		mono.android.Runtime.register ("Com.Tencent.Tencentmap.Mapsdk.Map.TencentMap/IOnMarkerClickListenerImplementor, TencentMapBinding, Version=0.1.0.0, Culture=neutral, PublicKeyToken=null", TencentMap_OnMarkerClickListenerImplementor.class, __md_methods);
	}


	public TencentMap_OnMarkerClickListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == TencentMap_OnMarkerClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Tencent.Tencentmap.Mapsdk.Map.TencentMap/IOnMarkerClickListenerImplementor, TencentMapBinding, Version=0.1.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public boolean onMarkerClick (com.tencent.mapsdk.raster.model.Marker p0)
	{
		return n_onMarkerClick (p0);
	}

	private native boolean n_onMarkerClick (com.tencent.mapsdk.raster.model.Marker p0);

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
