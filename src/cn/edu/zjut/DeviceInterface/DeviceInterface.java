package cn.edu.zjut.DeviceInterface;

import cn.edu.zjut.Device.Device;

/**
 * 
 * @author Administrator
 * @function 出库-入库函数接口
 *
 */
public interface DeviceInterface {
	/**
	 * 
	 * @return boolean
	 * @function 导入机器
	 */
	abstract boolean ImportDevice(Device device);
	
	/**
	 * 
	 * @param device
	 * @return
	 * @function 导出机器
	 */
	abstract boolean ExportDevice(Device device);

}
