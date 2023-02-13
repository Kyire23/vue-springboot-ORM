package com.oumuanode.backend.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.UpdateChainWrapper;
import com.baomidou.mybatisplus.extension.kotlin.KtQueryChainWrapper;
import com.baomidou.mybatisplus.extension.kotlin.KtUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oumuanode.backend.mapper.UserLoginMapper;
import com.oumuanode.backend.pojo.UserLogin;
import com.oumuanode.backend.service.UserLoinService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

@Service
public class UserLoinServiceImpl extends ServiceImpl<UserLoginMapper, UserLogin> implements UserLoinService {
    @Override
    public boolean save(UserLogin entity) {
        return super.save(entity);
    }

    @Override
    public boolean saveBatch(Collection<UserLogin> entityList) {
        return super.saveBatch(entityList);
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<UserLogin> entityList) {
        return super.saveOrUpdateBatch(entityList);
    }

    @Override
    public boolean removeById(UserLogin entity) {
        return super.removeById(entity);
    }

    @Override
    public boolean removeByMap(Map<String, Object> columnMap) {
        return super.removeByMap(columnMap);
    }

    @Override
    public boolean remove(Wrapper<UserLogin> queryWrapper) {
        return super.remove(queryWrapper);
    }

    @Override
    public boolean removeByIds(Collection<?> list, boolean useFill) {
        return super.removeByIds(list, useFill);
    }

    @Override
    public boolean removeBatchByIds(Collection<?> list) {
        return super.removeBatchByIds(list);
    }

    @Override
    public boolean removeBatchByIds(Collection<?> list, boolean useFill) {
        return super.removeBatchByIds(list, useFill);
    }

    @Override
    public boolean updateById(UserLogin entity) {
        return super.updateById(entity);
    }

    @Override
    public boolean update(Wrapper<UserLogin> updateWrapper) {
        return super.update(updateWrapper);
    }

    @Override
    public boolean update(UserLogin entity, Wrapper<UserLogin> updateWrapper) {
        return super.update(entity, updateWrapper);
    }

    @Override
    public boolean updateBatchById(Collection<UserLogin> entityList) {
        return super.updateBatchById(entityList);
    }

    @Override
    public UserLogin getById(Serializable id) {
        return super.getById(id);
    }

    @Override
    public List<UserLogin> listByIds(Collection<? extends Serializable> idList) {
        return super.listByIds(idList);
    }

    @Override
    public List<UserLogin> listByMap(Map<String, Object> columnMap) {
        return super.listByMap(columnMap);
    }

    @Override
    public UserLogin getOne(Wrapper<UserLogin> queryWrapper) {
        return super.getOne(queryWrapper);
    }

    @Override
    public long count() {
        return super.count();
    }

    @Override
    public long count(Wrapper<UserLogin> queryWrapper) {
        return super.count(queryWrapper);
    }

    @Override
    public List<UserLogin> list(Wrapper<UserLogin> queryWrapper) {
        return super.list(queryWrapper);
    }

    @Override
    public List<UserLogin> list() {
        return super.list();
    }

    @Override
    public <E extends IPage<UserLogin>> E page(E page, Wrapper<UserLogin> queryWrapper) {
        return super.page(page, queryWrapper);
    }

    @Override
    public <E extends IPage<UserLogin>> E page(E page) {
        return super.page(page);
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<UserLogin> queryWrapper) {
        return super.listMaps(queryWrapper);
    }

    @Override
    public List<Map<String, Object>> listMaps() {
        return super.listMaps();
    }

    @Override
    public List<Object> listObjs() {
        return super.listObjs();
    }

    @Override
    public <V> List<V> listObjs(Function<? super Object, V> mapper) {
        return super.listObjs(mapper);
    }

    @Override
    public List<Object> listObjs(Wrapper<UserLogin> queryWrapper) {
        return super.listObjs(queryWrapper);
    }

    @Override
    public <V> List<V> listObjs(Wrapper<UserLogin> queryWrapper, Function<? super Object, V> mapper) {
        return super.listObjs(queryWrapper, mapper);
    }

    @Override
    public <E extends IPage<Map<String, Object>>> E pageMaps(E page, Wrapper<UserLogin> queryWrapper) {
        return super.pageMaps(page, queryWrapper);
    }

    @Override
    public <E extends IPage<Map<String, Object>>> E pageMaps(E page) {
        return super.pageMaps(page);
    }

    @Override
    public QueryChainWrapper<UserLogin> query() {
        return super.query();
    }

    @Override
    public LambdaQueryChainWrapper<UserLogin> lambdaQuery() {
        return super.lambdaQuery();
    }

    @Override
    public LambdaQueryChainWrapper<UserLogin> lambdaQuery(UserLogin entity) {
        return super.lambdaQuery(entity);
    }

    @Override
    public KtQueryChainWrapper<UserLogin> ktQuery() {
        return super.ktQuery();
    }

    @Override
    public KtUpdateChainWrapper<UserLogin> ktUpdate() {
        return super.ktUpdate();
    }

    @Override
    public UpdateChainWrapper<UserLogin> update() {
        return super.update();
    }

    @Override
    public LambdaUpdateChainWrapper<UserLogin> lambdaUpdate() {
        return super.lambdaUpdate();
    }

    @Override
    public boolean saveOrUpdate(UserLogin entity, Wrapper<UserLogin> updateWrapper) {
        return super.saveOrUpdate(entity, updateWrapper);
    }
}
