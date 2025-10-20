# ☕ Java Practice Log / Java 練習記錄  

🕒 **更新日：2025/10/20 — 第8章完成**

---

## 📖 專案介紹 / プロジェクト紹介

這個專案是我在學習《スッキリわかるJava入門 第4版》的過程中建立的練習紀錄。  
每一章節的練習程式都會上傳到這裡，作為學習進度與成長的見證。  
目標是在 **2026 年初** 能以紮實的基礎與作品集，成功轉職為 **IT／Java 開發工程師**。

このプロジェクトは、『スッキリわかるJava入門 第4版』を学習する過程で作成した練習記録です。  
各章の練習コードをアップロードし、学習の進捗と成長の証として残しています。  
目標は **2026年初頭までにJavaエンジニアとしてIT業界へ転職すること** です。

---

## 🧩 學習進度 / 学習進捗

### 🩵 第 I 部：基礎を身につけよう / 打好基礎篇

| 章節 | 主題 | 狀態 | 備註 |
|------|------|------|------|
| Chapter 1 | プログラムの書き方（程式的基本寫法） | ✅ 完成 | HelloWorld、輸出練習 |
| Chapter 2 | 式と演算子（運算式與運算子） | ✅ 完成 | if、switch、邏輯運算 |
| Chapter 3 | 条件分岐と繰り返し（條件分支與迴圈） | ✅ 完成 | while / for / do-while |
| Chapter 4 | 配列（陣列） | ✅ 完成 | for-each、二維陣列、例外處理 |
| Chapter 5 | メソッド（方法） | ✅ 完成 | return、引數、封裝、呼叫 |
| Chapter 6 | 複数クラスを用いた開発（多類別開發） | ✅ 完成 | package、import、模組化 |

---

### 💎 第 II 部：オブジェクト指向を理解しよう / 物件導向篇

| 章節 | 主題 | 狀態 | 備註 |
|------|------|------|------|
| Chapter 7 | オブジェクト指向をはじめよう（物件導向入門） | ✅ 完成 | 實例化、欄位與方法結構 |
| Chapter 8 | インスタンスとクラス（實例與類別） | ✅ 完成 | final、this、例外處理、Thread |
| Chapter 9 | さまざまなクラス機構（多樣的類別結構） | 🔜 進行予定 | 物件關係、static、enum |
| Chapter 10 | 継承（繼承） | □ 未開始 | — |
| Chapter 11 | 高度な継承（進階繼承） | □ 未開始 | — |
| Chapter 12 | 多態性（多型） | □ 未開始 | — |
| Chapter 13 | カプセル化（封裝） | □ 未開始 | — |

---

### 💠 第 III 部：より深くJavaを使いこなそう / 進階應用篇

| 章節 | 主題 | 狀態 | 備註 |
|------|------|------|------|
| Chapter 14 | Javaを支えるクラスたち（支撐Java的基礎類別） | □ 未開始 | — |
| Chapter 15 | 文字列と日付の扱い（字串與日期的處理） | □ 未開始 | — |
| Chapter 16 | コレクション（集合與容器） | □ 未開始 | — |
| Chapter 17 | 例外（例外處理） | □ 未開始 | — |
| Chapter 18 | まだまだ広がるJavaの世界（Java 的更廣世界） | □ 未開始 | — |

---

## 🕒 現在進度 / Current Progress

| 狀態 | 說明 |
|------|------|
| ✅ | 第 II 部 Chapter 8《インスタンスとクラス》已完成 |
| 🎯 | 目標：2025年11月前完成第9章～第13章，強化 OOP 實作能力 |

---

## 🧰 編譯與執行 / コンパイルと実行

```bash
▶ 有封包的檔案（例如 Chapter08） / パッケージを含むファイル（例：Chapter08）
javac -d . .\Chapter08\Main.java
java Chapter08.Main

▶ 無封包的檔案（例如 Chapter03） / パッケージを含まないファイル（例：Chapter03）
cd .\Chapter03
javac Java10.java
java Java10

▶ 一次編譯整個章節 / 章全体を一括コンパイル
javac -d . .\Chapter08\*.java
```

⚙️ 常用指令速查表 / よく使う基本コマンド一覧

| 指令               | 中文說明              | 日本語説明              |
| ---------------- | ----------------- | ------------------ |
| `cd .\Chapter03` | 切換到 Chapter03 資料夾 | Chapter03 フォルダに移動  |
| `cd ..`          | 回到上一層資料夾          | 一つ上の階層に戻る          |
| `dir`            | 顯示目前資料夾內容         | 現在のフォルダ内のファイル一覧を表示 |
| `pwd`            | 顯示目前所在位置          | 現在のディレクトリを表示       |

```bash
📂 專案結構 / プロジェクト構成（2025/10/20 最新版）
Java-Practice/
├─ .gitattributes
├─ .gitignore
├─ README.md
├─ structure.txt
│
├─ .vscode/
│  └─ settings.json
│
├─ basic/
│  ├─ App.java / App2.java / App3.java / App4.java
│  ├─ Array.java / Operator.java / Loop.java
│  ├─ ConditionalStatement.java / DataTypeConversion.java
│  ├─ Hello.java / JavaPractise.java
│  │
│  ├─ math/
│  │  ├─ BasicMath.java
│  │  └─ geometry/
│  │     └─ Rectangle.java
│  │
│  └─ math1/
│     └─ geometry/
│        ├─ Person.java
│        └─ Point.java
│
├─ Chapter01/
│  └─ Practice.java
│
├─ Chapter02/
│  ├─ Practice1.java
│  └─ Practice2.java
│
├─ Chapter03/
│  ├─ Java6.java ~ Java11.java
│  └─ Javap.java
│
├─ Chapter04/
│  ├─ DNASign.java
│  ├─ Practice1~4.java / PracticeN.java
│
├─ Chapter05/
│  ├─ Practice1~5.java / PracticeF.java
│
├─ Chapter06/
│  ├─ Main.java
│  └─ comment/
│     ├─ Kouhan.java
│     └─ Zenhan.java
│
└─ Chapter08/
   ├─ Main.java
   └─ Character/
      └─ Cleric.java
```

📘 參考筆記 / Reference Notes

| 主題                                    | 說明                               |
| ------------------------------------- | -------------------------------- |
| this 關鍵字的用法與差異                        | 「this = 這個物件」，避免欄位與參數名稱衝突，強化可讀性  |
| super 關鍵字與父類別呼叫                       | 用於呼叫父類別的建構式或方法，與 this 對比解說       |
| Java 例外處理詳解（throws vs try-catch）      | 介紹例外傳遞與捕捉、最佳實務、常見錯誤              |
| Thread.sleep() 與 InterruptedException | 多執行緒中暫停執行與中斷處理的機制                |
| RepositoryException 自訂例外              | 結合 `super(message, cause)` 的應用範例 |

💻 開發環境 / 開発環境

| 項目                | 說明                 |
| ----------------- | ------------------ |
| 💻 作業系統 / OS      | Windows 11         |
| 🧩 編輯器 / エディタ     | Visual Studio Code |
| ☕ Java 環境         | JDK 25（UTF-8）      |
| 🌐 版本控管           | Git + GitHub       |
| ⚙️ .gitattributes | 自動換行規則（LF 優先）      |
| 🧱 .gitignore     | 排除 .class 等編譯產物    |

🌱 未來規劃 / 今後の計画

| 中文                          | 日本語                           |
| --------------------------- | ----------------------------- |
| 強化 OOP 章節（第9〜13章）           | 第9〜13章のオブジェクト指向を強化            |
| 完成後整合小專案（猜數字、RPG、成績管理）      | 修了後、ミニプロジェクト（RPG・成績管理など）を制作予定 |
| 整理教學筆記成系列 PDF / GitHub Wiki | 学習ノートをPDF・Wiki形式に整理予定         |

✨ 作者 / Author

| 項目           | 資料                                                |
| ------------ | ------------------------------------------------- |
| 👤 名稱 / 名前   | 陳永隆 (Yong-Long Chen)                              |
| 📍 居住地 / 居住地 | 日本・岐阜県可児市                                         |
| 🎯 目標 / 目標   | 2026年前轉職為 Java 開發工程師                              |
| 💻 GitHub    | [CHEN-YUNGLUNG](https://github.com/CHEN-YUNGLUNG) |
