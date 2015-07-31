package mono.com.tencent.tencentmap.mapsdk.map;


public class OnLoadedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.tencent.tencentmap.mapsdk.map.OnLoadedListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onMapLoaded:()V:GetOnMapLoadedHandler:Com.Tencent.Tencentmap.Mapsdk.Map.IOnLoadedListenerInvoker, TencentMapBinding\n" +
			"";
		mono.android.Runtime.register ("Com.Tencent.Tencentmap.Mapsdk.Map.IOnLoadedListenerImplementor, TencentMapBinding, Version=0.1.0.0, Culture=neutral, PublicKeyToken=null", OnLoadedListenerImplementor.class, __md_methods);
	}


	public OnLoadedListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == OnLoadedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Tencent.Tencentmap.Mapsdk.Map.IOnLoadedListenerImplementor, TencentMapBinding, Version=0.1.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onMapLoaded ()
	{
		n_onMapLoaded ();
	}

	private native void n_onMapLoaded ();

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
