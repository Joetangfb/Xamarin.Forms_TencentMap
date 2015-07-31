package mono.com.tencent.tencentmap.mapsdk.map;


public class TencentMap_OnMapCameraChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.tencent.tencentmap.mapsdk.map.TencentMap.OnMapCameraChangeListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onCameraChange:(Lcom/tencent/mapsdk/raster/model/CameraPosition;)V:GetOnCameraChange_Lcom_tencent_mapsdk_raster_model_CameraPosition_Handler:Com.Tencent.Tencentmap.Mapsdk.Map.TencentMap/IOnMapCameraChangeListenerInvoker, TencentMapBinding\n" +
			"n_onCameraChangeFinish:(Lcom/tencent/mapsdk/raster/model/CameraPosition;)V:GetOnCameraChangeFinish_Lcom_tencent_mapsdk_raster_model_CameraPosition_Handler:Com.Tencent.Tencentmap.Mapsdk.Map.TencentMap/IOnMapCameraChangeListenerInvoker, TencentMapBinding\n" +
			"";
		mono.android.Runtime.register ("Com.Tencent.Tencentmap.Mapsdk.Map.TencentMap/IOnMapCameraChangeListenerImplementor, TencentMapBinding, Version=0.1.0.0, Culture=neutral, PublicKeyToken=null", TencentMap_OnMapCameraChangeListenerImplementor.class, __md_methods);
	}


	public TencentMap_OnMapCameraChangeListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == TencentMap_OnMapCameraChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Tencent.Tencentmap.Mapsdk.Map.TencentMap/IOnMapCameraChangeListenerImplementor, TencentMapBinding, Version=0.1.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCameraChange (com.tencent.mapsdk.raster.model.CameraPosition p0)
	{
		n_onCameraChange (p0);
	}

	private native void n_onCameraChange (com.tencent.mapsdk.raster.model.CameraPosition p0);


	public void onCameraChangeFinish (com.tencent.mapsdk.raster.model.CameraPosition p0)
	{
		n_onCameraChangeFinish (p0);
	}

	private native void n_onCameraChangeFinish (com.tencent.mapsdk.raster.model.CameraPosition p0);

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
