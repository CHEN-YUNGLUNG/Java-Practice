# ☕ Java Practice Log / Java練習記録

---

## 📖 專案介紹 / プロジェクト紹介
這個專案是我在學習《スッキリわかるJava入門 第4版》過程中建立的練習紀錄。  
每一章節的練習程式都會上傳到這裡，作為學習進度與成長的見證。  
目標是在 2026 年初能以紮實的基礎與作品集，成功轉職為 IT／Java 開發工程師。  

このプロジェクトは、『スッキりわかるJava入門 第4版』を学習する過程で作成した練習記録です。  
各章の練習コードをアップロードし、学習の進捗と成長の証として残しています。  
目標は2026年初頭までに、確かな基礎とポートフォリオを持つJavaエンジニアとしてIT業界へ転職することです。

---

## 🧩 學習進度 / 学習進捗

| 章節 | 主題 | 狀態 | 備註 |
|------|------|------|------|
| 第1章 | Java 的基本概念與開發環境 | ✅ 完成 | HelloWorld、輸出練習 |
| 第2章 | 變數、型別與條件分岐 | ✅ 完成 | if、switch、邏輯運算練習 |
| 第3章 | 迴圈與運算邏輯 | ✅ 完成 | while / for / do-while 練習 |
| 第4章 | 陣列與方法 | ⏳ 進行中 | 預計下階段學習 |
| 第5章 | 類別與物件 | ⏳ 計畫中 | |
| 第6章 | 封裝與建構式 | ⏳ 計畫中 | |
| 第7章 | 繼承與多型 | ⏳ 計畫中 | |
| 第8章以後 | 專案實作與應用 | 🚀 未來目標 | |

| 章 | テーマ | 進捗 | メモ |
|----|---------|------|------|
| 第1章 | Javaの基本概念と開発環境 | ✅ 完了 | HelloWorld、出力練習 |
| 第2章 | 変数・型・条件分岐 | ✅ 完了 | if、switch、論理演算 |
| 第3章 | ループと演算ロジック | ✅ 完了 | while / for / do-while |
| 第4章 | 配列とメソッド | ⏳ 学習中 | 次のステップ予定 |
| 第5章 | クラスとオブジェクト | ⏳ 計画中 | |
| 第6章 | カプセル化とコンストラクタ | ⏳ 計画中 | |
| 第7章 | 継承とポリモーフィズム | ⏳ 計画中 | |
| 第8章以降 | プロジェクト実装と応用 | 🚀 今後の目標 | |

---

## 🧰 編譯與執行 / コンパイルと実行

### ▶ 有封包的檔案（例如 Chapter02） / パッケージを含むファイル（例：Chapter02）
```bash
javac -d . .\Chapter02\Practice1.java
java Chapter02.Practice1

▶ 無封包的檔案（例如 Chapter03） / パッケージを含まないファイル（例：Chapter03）
cd .\Chapter03
javac Java10.java
java Java10


▶ 一次編譯整個章節 / 章全体を一括コンパイル
javac -d . .\Chapter02\*.java

---

## 💡 追加補充：`cd` 指令說明 / 追加解説：`cd` コマンドとは

### 🧭 中文說明：
`cd` 是 **Change Directory（切換資料夾）** 的縮寫，  
用來讓終端機（PowerShell / CMD / Terminal）從目前所在的資料夾移動到指定位置。  

在 Java 的實際操作中，我們常用 `cd` 來切換到 `.java` 檔案所在的章節資料夾，  
方便進行編譯與執行。  

#### ✅ 範例：
```bash
cd .\Chapter03

這代表你要「進入 Chapter03 資料夾」，
讓目前的工作目錄變成：
C:\Users\TAKASHI\JavaProjects\Java-Practice\Chapter03

進入之後即可輸入：
javac Java10.java
java Java10
java Java10來編譯並執行該章節程式。

🔁 回上一層資料夾：
cd ..

💬 日本語説明：

cd は Change Directory（ディレクトリを移動する） の略です。
現在の作業フォルダから、指定したフォルダ（例：Chapter03）に移動するためのコマンドです。

Java の学習では、ソースファイルがある章のフォルダに移動してから
コンパイルや実行を行う場面でよく使われます。

✅ 例：
cd .\Chapter03
このコマンドで「Chapter03 フォルダに移動」します。
その後、以下のように入力してコンパイル・実行します：
javac Java10.java
java Java10

🔁 一つ上の階層へ戻る：
cd ..

⚙️ 常用指令速查表 / よく使う基本コマンド一覧
指令	                                    中文說明	                                    日本語説明
cd .\Chapter03	切                      換到 Chapter03 資料夾	                        Chapter03 フォルダに移動
cd ..	                                   回到上一層資料夾	                                一つ上の階層に戻る
pwd	                                顯示目前所在位置（PowerShell 專用）	              現在のディレクトリを表示（PowerShell専用）
dir	                                顯示目前資料夾內容	                             現在のフォルダ内のファイル一覧を表示


📂 專案結構 / プロジェクト構成
Java-Practice/
├─ basic/
│  ├─ App.java / App2.java / App3.java / App4.java
│  ├─ Array.java / Hello.java / Operator.java / Loop.java
│  ├─ math/
│  │  ├─ BasicMath.java
│  │  └─ geometry/
│  │     └─ Rectangle.java
│  └─ math1/
│     └─ geometry/
│        ├─ Person.java
│        └─ Point.java
├─ Chapter01/
│  └─ Practice.java
├─ Chapter02/
│  ├─ Practice1.java
│  └─ Practice2.java
└─ Chapter03/
   ├─ Java6.java ~ Java11.java
   └─ Javap.java

🧰 開發環境 / 開発環境
項目	                            說明 / 説明

💻 作業系統 / OS	                Windows 10

🧩 編輯器 / エディタ	             Visual Studio Code

🌐 版本控管 / バージョン管理	      Git + GitHub

☕ Java 環境 / Java 環境	           JDK 25（UTF-8）

⚙️ .gitattributes	               自動換行規則（LF 優先）
                                    改行コードを自動で調整（LF優先）

🧱 .gitignore	                   排除 .class 等編譯產物
                                    コンパイル生成物（.classなど）を除外

🌱 未來規劃 / 今後の計画
中文	                                                            日本語

第4章「配列とメソッド」學習中	                            第4章「配列とメソッド」を学習中

逐步加入物件導向章節（第5〜7章）	                    第5〜7章のオブジェクト指向章を順次追加予定

完成後將整合小專案（猜數字遊戲、成績管理系統等）	    修了後、小規模プロジェクト（数字当てゲーム・成績管理システムなど）を統合予定

✨ 作者 / Author

陳永隆 (Yong-Long Chen)
📍 居住地 / 居住地：日本・岐阜県可児市
🎯 目標 / 目標：2026年前轉職為 Java 開發工程師
🎯 目標 / 目標：2026年までにJavaエンジニアとして転職を目指す
💻 GitHub：CHEN-YUNGLUNG