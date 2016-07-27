/**
 * 
 */
package sbzy.enterpriseems.model.dao.impl;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import sbzy.enterpriseems.model.domain.AccountRoleList;
import sbzy.enterpriseems.model.domain.StorageBill;
import sbzy.enterpriseems.model.support.Pagination;


/**
 * 数据访问类    【 能源介质】 TStorageBill 
 * 陈家红
 * 2015-08-03
 * 
 *
 */
@Repository("StorageBillDao")
public class StorageBillDaoImpl extends BaseDaoSupport<StorageBill> {

	@Override
	public Serializable insert(StorageBill t) throws SQLException {
	
		return super.insert(t);
	}

	@Override
	public Pagination<StorageBill> list(String sqlid, Object params, int page, int size)
			throws SQLException {
	
		return super.list(sqlid, params, page, size);
	}

	@Override
	public int update(StorageBill t) throws SQLException {

		return super.update(t);
	}

	@Override
	public int delete(Serializable id) throws SQLException {

		return super.delete(id);
	}

	@Override
	public int deleteAll(String ids) throws SQLException {

		return super.deleteAll(ids);
	}
	@Override
	public StorageBill selectOneRecord(Serializable id) throws SQLException {

		return super.selectOneRecord(id);
	}

	@Override
	public List<StorageBill> selectList() throws SQLException {

		return super.selectList();
	}

	@Override
	public List<StorageBill> selectListByWhere(String funcName,HashMap anywhere) throws SQLException {

		return super.selectListByWhere(funcName,anywhere);
	}

	@Override
	public String selectOneValueByWhere(String funcName,HashMap anywhere) throws SQLException {

		return super.selectOneValueByWhere(funcName,anywhere);
	}

}
