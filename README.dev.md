````md
# Secure SDLC Hub — README.dev（自用进度版）

> 仓库：`secure-sdlc-hub`  
> 目标：**2 个月内**完成可用于实习/申请展示的「安全工程化平台后端」最小闭环  
> 技术栈：Java 21 + Spring Boot + Maven（后续：PostgreSQL / Flyway / Gate / CI）

---

## 0. 今日状态
- 日期：2026-01-05
- 当前进度：Day 1 ✅（Spring Boot 骨架已能启动）
- 下一步：Day 2（接口规范化 + `.gitignore` 清理 `target/` + README 增强）
- 当前阻塞：无 / TODO：__________
- 今日证据：启动日志 & 目录结构已记录

---

## 1. 本地运行（保持可执行）
```bash
# 启动后端
./mvnw spring-boot:run

# 验证接口（按当前进度逐步补齐）
# Day 1：Hello demo
curl http://localhost:8080/hello
````

> Day 2 起将迁移到：`/health`、`/api/version`、`/api/projects`

---

## 2. 本周计划（Week 1）

### Week 1 总目标（必须达成）

* [x] Spring Boot 项目骨架可运行
* [ ] 接口规范化：`/health`、`/api/version`、`/api/projects`（projects 先空）
* [ ] `.gitignore` 生效，仓库不包含 `target/`
* [ ] docker-compose 启动 PostgreSQL（可先不连后端，避免卡住）
* [ ] README.dev 可复现启动步骤（陌生人按步骤能跑通）

### Day 1（已完成）

* [x] 初始化项目结构（Maven + `src/main` + `src/test`）
* [x] 创建 `HelloController` 与 `HelloResponse`
* [x] 本地启动成功（Tomcat 8080）
* [x] 记录启动日志与目录结构（用于 Day 2 review）

### Day 2（待完成）

* [ ] 新增/调整接口：`/health`、`/api/version`、`/api/projects`
* [ ] 增加 `.gitignore` 并清理 `target/`

  * 若 `target/` 已被提交：`git rm -r --cached target` 后再 commit
* [ ] 更新 README.dev 的 curl 验证命令
* [ ] 提交记录（建议拆两次 commit）

  * `feat: add basic platform endpoints`
  * `chore: ignore build outputs`

---

## 3. 功能路线（按 Phase，完成一个勾一个）

### Phase 0：可运行骨架（Week 1）

* [x] 可启动
* [ ] 接口规范化（health/version/projects）
* [ ] docker-compose postgres
* [ ] 基础日志（请求级别）
* [ ] 最小返回规范（是否统一 ApiResponse 之后决定）

### Phase 1：数据模型 & 导入扫描结果（Week 2）

* [ ] PostgreSQL + Flyway
* [ ] 模型：Project / ScanRun / Finding
* [ ] 导入扫描结果（先支持 1 种格式）
* [ ] findings 查询（severity/status filter）

### Phase 2：Gate 门禁（Week 3）

* [ ] gate evaluate：pass/fail + explainable reasons
* [ ] 可选：GitHub Actions demo（fail 则阻断）

### Phase 3：工程化加分项（Week 4）

* [ ] OpenAPI/Swagger
* [ ] 审计日志（状态变更可追踪）
* [ ] 统一错误码
* [ ] 基础 metrics/观测

---

## 4. 目录结构（随迭代更新）

当前：

```
src/main/java/com/example/securesdlchub/
  SecureSdlcHubApplication.java
  HelloController.java
  HelloResponse.java
```

计划：

```
src/main/java/com/example/securesdlchub/
  api/
  dto/
  domain/
  service/
  repository/
```

---

## 5. 今日学习记录（只写“我用到了什么”）

* Spring Boot 启动入口：`@SpringBootApplication`
* Controller 提供 HTTP 接口（Hello）
* Maven 构建产物在 `target/`（后续需忽略）
* 启动成功判断：Tomcat 8080 + Started xxxApplication 日志
* 当前使用 Java：21.0.7

---

## 6. 问题与排查（遇到就写，后面复用）

* [ ] 端口冲突（8080）排查：`lsof -i :8080` → 关闭占用进程
* [ ] `target/` 被提交：添加 `.gitignore` 后执行 `git rm -r --cached target` 再提交

```
```
