package com.lexian.manager.order.service;

import com.lexian.manager.order.bean.Orders;
import com.lexian.web.ResultHelper;

public interface OrdersService {

	ResultHelper getOrderss();

	ResultHelper getOrderDetail(int id);

	ResultHelper updateOrders(Orders orders);

	ResultHelper getOrderssByState(int state);

}
