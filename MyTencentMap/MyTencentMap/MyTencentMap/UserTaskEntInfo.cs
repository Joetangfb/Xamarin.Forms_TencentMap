using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MyTencentMap {

    public class UserTaskEntInfo : BaseIntInfo {
        public string PsCode { get; set; }
        public string BaseInfo { get; set; }
        public string ProduceInfo { get; set; }
        public string TreatmentInfo { get; set; }
        public string DischargeInfo { get; set; }
        public string Address { get; set; }
        public double? Longitude { get; set; }
        public double? Latitude { get; set; }
    }

    public class BaseIntInfo : BaseInfo<int> {
    }

    public abstract class BaseInfo<TId> {

        /// <summary>
        /// 标识
        /// </summary>
        public TId Id { get; set; }

        /// <summary>
        /// 名称
        /// </summary>
        public string Name { get; set; }

    }
}
