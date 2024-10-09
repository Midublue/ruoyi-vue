


<template>
<!-- 首页 -->
  <div class="dashboard-container">
    <div class="welcome-message">
      <h1>河传人事管理系统</h1>
      <p>首页</p>
    </div>

    <el-row :gutter="20">
      <el-col :span="8">
        <el-card class="box-card">
          <div slot="header" class="clearfix">
            <span>员工统计</span>
          </div>
          <div>这里是员工统计信息。</div>
        </el-card>
      </el-col>
      <el-col :span="8">
        <el-card class="box-card">
          <div slot="header" class="clearfix">
            <span>最新通知</span>
          </div>
          <div>这里是最新通知内容。</div>
        </el-card>
      </el-col>
      <el-col :span="8">
        <el-card class="box-card">
          <div slot="header" class="clearfix">
            <span>待办事项</span>
          </div>
          <div>这里是待办事项列表。</div>
        </el-card>
      </el-col>
    </el-row>
  </div>
</template>

<script>
export default {
  name: 'Dashboard',
  data() {
    return {};
  },
  created() {
    // 初始化数据
  },
  methods: {
    // 自定义方法
  }
};
</script>

<style scoped>
.dashboard-container {
  padding: 20px;
}

.welcome-message {
  text-align: center;
  margin-bottom: 20px;
}

.box-card {
  margin-bottom: 20px;
}
</style>