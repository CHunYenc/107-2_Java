> **本專案已封存（Archived），僅供學習紀錄與參考，未來不再維護。**

# 107-2_Java

只傳期末作業 , 一個簡易的視窗登入 JFrame+ MYSQL

---

## 開發注意事項

- 本專案為教學/作業用途，未考慮資安實務，請勿用於正式環境。
- 主要程式碼路徑：`LoginJFrame/src/`
- 資料庫連線設定請參考 `LoginJFrame/src/swing/DBConnection.java`
- 需安裝 MySQL JDBC Driver（已附於 `LoginJFrame/mysql-connector-java-5.1.47/`）
- 建議使用 NetBeans 8.2 開啟，或自行調整 IDE 設定。
- 建置腳本：`build.xml`（Ant）
- 若需重建資料表，請參考下方 SQL 指令。

---

## 開發環境

| 開發程式  (IDE)                      | 版本      | 是否要付費  |
| ------------------------------------|:---------:| ----------:|
| Netbeans IDE                        | 8.2       |    N       |
| MySQL Community Server  (測試)      | 8.0.16    |    N       |
| Azure Database for MySQL (報告)     | 5.7       |    Y       |
| XAMPP     (測試)                    | 3.2.3     |    N       |
| Icon8                               | 7.2.0     |    N       |

> **注意**：本程式碼已預設測試用 Localhost 或 127.0.0.1

---

## 專案簡介

- 以 Java Swing 製作 GUI 視窗登入系統
- 使用 MySQL 作為後端資料庫
- 具備基本註冊、登入、性別欄位
- 期末專題用途

---

## 專案結構

- `LoginJFrame/src/`：Java 原始碼
- `LoginJFrame/mysql-connector-java-5.1.47/`：JDBC 驅動
- `LoginJFrame/build.xml`：Ant 建置腳本
- `LoginJFrame/nbproject/`：NetBeans 專案設定
- `ChunYenc_登入系統簡報.pptx`：簡報

---

## 資料表建立 SQL

```sql
CREATE table tuser(
    id int not null auto_increment primary key,
    Username char(20) not null,
    Password char(20) not null,
    Gender char(10) not null
);
```

---

## 執行方式

1. 下載專案後用 Netbeans 開啟 `LoginJFrame`
2. 安裝 JDBC Driver（已附於專案）
3. 設定本機 MySQL，建立資料表
4. 調整 `DBConnection.java` 連線資訊
5. 執行專案（F6）

---

## 程式畫面

![介面-1](https://i.imgur.com/RBs8c9g.png)
![介面-2](https://i.imgur.com/STwsSad.png)
![介面-3](https://i.imgur.com/jQ18rZN.png)

---

## 其他

- 若有問題請開 issue 討論
- 歡迎 fork 與 star

---

# 謝謝你的收看

---

> 本 README 由 AI 自動優化產生，若有建議可隨時修改補充。
