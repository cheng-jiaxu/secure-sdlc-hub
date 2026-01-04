# DEVLOG / Day 1（2026-01-05）

## 今日目标
- 初始化项目仓库结构，完成 Spring Boot 后端骨架搭建
- 确保项目能够本地成功启动（可作为后续功能迭代的基础）

---

## 今日完成内容（Checklist）
- [x] 创建 Spring Boot 项目骨架（Maven）
- [x] 明确包结构并落盘：
  - `com.example.securesdlchub`
- [x] 添加最小可用接口（HelloController）
- [x] 定义响应 DTO（HelloResponse）
- [x] 本地成功启动服务并监听 `8080` 端口
- [x] 运行测试类骨架已生成（`SecureSdlcHubApplicationTests`）

---

## 当前项目结构（关键部分）
- `pom.xml`
- `mvnw / mvnw.cmd`
- `src/main/java/com/example/securesdlchub/`
  - `SecureSdlcHubApplication.java`
  - `HelloController.java`
  - `HelloResponse.java`
- `src/main/resources/`
  - `application.properties`
- `src/test/java/com/example/securesdlchub/`
  - `SecureSdlcHubApplicationTests.java`

> 注：目前本地构建后产生了 `target/` 目录（后续需要通过 `.gitignore` 避免提交到 GitHub）。

---

## 启动验证（证据）
- 启动日志显示：
  - 使用 Java **21.0.7**
  - Tomcat 端口：**8080**
  - 应用启动成功：`Started SecureSdlcHubApplication ...`

---

## 今日学到的知识点（复盘）
### 1) Spring Boot 项目最小组成
- 启动类（`@SpringBootApplication`）是整个应用入口
- Controller 用于提供 HTTP 接口（目前先做最小 demo）

### 2) Maven & 项目构建产物
- Maven 项目默认输出构建产物到 `target/`
- `target/` 适合本地存在，但不应提交到仓库

### 3) 包结构与命名
- 包路径与目录结构强绑定（`com/example/securesdlchub`）
- 早期保持结构清晰，后续扩展 `controller/service/repository/dto` 会更顺

### 4) 启动成功的判断标准
- 控制台出现 `Tomcat started on port(s): 8080`
- 出现 `Started xxxApplication in ... seconds`

---

## 遇到的问题 / 注意事项
- `target/` 目录已生成：需要在 Day 2 添加 `.gitignore` 并从 git 跟踪中移除（如果误提交了）
- 目前接口还是 demo 性质：下一步要统一成平台接口风格（health/version/projects）

---

## 明日计划（Day 2）
- 把 `Hello` 接口升级为平台三件套：
  - `GET /health`
  - `GET /api/version`
  - `GET /api/projects`（先返回空）
- 增加 `.gitignore`，确保 `target/` 不进入仓库
- README 补充 `curl` 验证命令，形成可复现启动说明
