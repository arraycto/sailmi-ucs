/**
 * Copyright (c) 2018-2028, Chill Zhuang 庄骞 (smallchill@163.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sailmi.system.wrapper;

import com.sailmi.system.entity.SystemEntity;
import com.sailmi.system.vo.SystemVO;
import lombok.AllArgsConstructor;
import com.sailmi.core.mp.support.BaseEntityWrapper;
import com.sailmi.core.tool.utils.BeanUtil;


/**
 * 系统表，租户->系统->企业，关系为，平台可以有多个租户，一个租户可以创建多个系统，一个系统，可以有多个client，一个企业可以入驻到多个系统中。企业可以采购多个服务\r\n包装类,返回视图层所需的字段
 *
 * @author sailmi
 * @since 2020-09-09
 */
public class SystemWrapper extends BaseEntityWrapper<SystemEntity, SystemVO>  {

    public static SystemWrapper build() {
        return new SystemWrapper();
    }

	@Override
	public SystemVO entityVO(SystemEntity system) {
		SystemVO systemVO = BeanUtil.copy(system, SystemVO.class);
		return systemVO;
	}

}
