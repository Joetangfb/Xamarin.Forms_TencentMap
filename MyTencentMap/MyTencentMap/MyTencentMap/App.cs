using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Xamarin.Forms;

namespace MyTencentMap {
    public class App : Application {

        public static NavigationPage NavigationTestPage;

        public App() {
            // The root page of your application
            var pins = new List<UserTaskEntInfo>() { };

            pins.Add(new UserTaskEntInfo() { Name = "上海市浦东新区陆家嘴街道乳山二村", Longitude = 31.2317331909, Latitude = 121.5170146362 });
            pins.Add(new UserTaskEntInfo() { Name = "上海市浦东新区昌邑路555弄", Longitude = 31.2431982838, Latitude = 121.5215228609 });
            pins.Add(new UserTaskEntInfo() { Name = "上海市浦东新区东昌路267号", Longitude = 31.2316324310, Latitude = 121.5063730654 });
            pins.Add(new UserTaskEntInfo() { Name = "上海市浦东新区滨江大道", Longitude = 31.2379863826, Latitude = 121.4959153979 });
            pins.Add(new UserTaskEntInfo() { Name = "上海市浦东新区即墨路", Longitude = 31.2435242682, Latitude = 121.5104350816 });
            
            NavigationTestPage = new NavigationPage(new Page1() { Pins = pins });
            MainPage = NavigationTestPage;
        }

        protected override void OnStart() {
            // Handle when your app starts
        }

        protected override void OnSleep() {
            // Handle when your app sleeps
        }

        protected override void OnResume() {
            // Handle when your app resumes
        }
    }
}
