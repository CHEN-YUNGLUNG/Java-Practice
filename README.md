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

🧱 無 package 的情況（可在章節資料夾內直接執行）

如果該章節的 .java 程式沒有寫 package 宣告，
代表它屬於「預設包（default package）」。

這種情況下，你可以直接在該資料夾內編譯與執行：
javac Java10.java
java Java10
📘 說明：
沒有 package 的類別會直接編譯成 Java10.class，
JVM 會在目前資料夾中找到並執行它。

📦 有 package 宣告的情況（要從專案根目錄執行）

如果你的程式開頭有：package Chapter04;
那表示這個類別屬於 Chapter04 這個 package。
這時候即使你進入 Chapter04 資料夾執行，也會出現：
Error: Could not find or load main class DNASign
Caused by: java.lang.NoClassDefFoundError: DNASign (wrong name: Chapter04/DNASign)

✅ 正確做法是「回到專案根目錄」再執行：
cd ..
javac -d . Chapter04\DNASign.java
java Chapter04.DNASign
📘 說明：

-d . 讓編譯後的 .class 檔放在對應的 package 資料夾中。

java Chapter04.DNASign 是使用「完整類別名稱（package + 類別名）」執行。

JVM 執行時會依據 package 名稱尋找對應路徑（Chapter04/DNASign.class），
所以必須在專案根目錄執行。

🔁 回上一層資料夾：
cd ..
可讓你從子資料夾（例如 Chapter03）回到上一層（專案根目錄）。

🧠 總結
狀況	                        執行位置	                        指令範例	                                    備註
沒有 package 宣告	            可在章節資料夾內	                javac Java10.java                       預設包（default package）
                                                                java Java10	                            

有 package ChapterXX; 宣告	    要在專案根目錄	                   javac -d . Chapter04\DNASign.java        使用完整類別名稱
                                                                java Chapter04.DNASign	                    

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

🧱 package がない場合（章フォルダ内で直接実行できる）

その章の .java ファイルに package 宣言がない 場合、
そのクラスは「デフォルトパッケージ（default package）」に属します。

この場合、フォルダ内でそのままコンパイル・実行できます：
javac Java10.java
java Java10
📘 補足：
package がないクラスは同じフォルダ内に Java10.class としてコンパイルされ、
JVM は現在のディレクトリから直接クラスファイルを探して実行します。

📦 package 宣言がある場合（プロジェクトのルートから実行が必要）

もしプログラムの先頭に次のような記述がある場合：
package Chapter04;
このクラスは Chapter04 というパッケージに属します。
この状態で Chapter04 フォルダ内から実行すると、次のようなエラーが発生します：
Error: Could not find or load main class DNASign
Caused by: java.lang.NoClassDefFoundError: DNASign (wrong name: Chapter04/DNASign)

✅ 正しい手順は「プロジェクトのルートディレクトリ」から実行することです：
cd ..
javac -d . Chapter04\DNASign.java
java Chapter04.DNASign
📘 補足：

-d . は、コンパイル結果の .class ファイルをパッケージ構造に沿って出力するオプションです。

java Chapter04.DNASign のように、「完全修飾クラス名（package + クラス名）」で実行する必要があります。

JVM は package 名に基づいてクラスを検索するため、Chapter04/DNASign.class を探すには
プロジェクトのルートディレクトリから実行する必要があります。

🔁 一つ上の階層へ戻る：
cd ..
これでサブフォルダ（例：Chapter03）から一つ上の階層（プロジェクトのルート）に戻ることができます。

🧠 まとめ
状況	                        実行場所	                        コマンド例	                            備考
package 宣言なし	          各章フォルダ内でOK	            javac Java10.java                   デフォルトパッケージ
                                                            java Java10	                

package ChapterXX; 宣言あり	プロジェクトルートで実行	        javac -d . Chapter04\DNASign.java      完全修飾クラス名で実行
                                                            java Chapter04.DNASign	

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