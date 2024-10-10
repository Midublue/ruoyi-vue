import request from '@/utils/request'

// 查询教职工信息列表
export function listInfo(query) {
  return request({
    url: '/system/info/list',
    method: 'get',
    params: query
  })
}

// 查询教职工信息详细
export function getInfo(dept) {
  return request({
    url: '/system/info/' + dept,
    method: 'get'
  })
}

// 新增教职工信息
export function addInfo(data) {
  return request({
    url: '/system/info',
    method: 'post',
    data: data
  })
}

// 修改教职工信息
export function updateInfo(data) {
  return request({
    url: '/system/info',
    method: 'put',
    data: data
  })
}

// 删除教职工信息
export function delInfo(dept) {
  return request({
    url: '/system/info/' + dept,
    method: 'delete'
  })
}
