☕ Java Practice Log / Java練習記録
📖 專案介紹 / プロジェクト紹介

這個專案是我在學習《スッキリわかるJava入門 第4版》過程中建立的練習紀錄。
每一章節的練習程式都會上傳到這裡，作為學習進度與成長的見證。
目標是在 2026 年初能以紮實的基礎與作品集，成功轉職為 IT／Java 開發工程師。

このプロジェクトは、『スッキリわかるJava入門 第4版』を学習する過程で作成した練習記録です。
各章の練習コードをアップロードし、学習の進捗と成長の証として残しています。
目標は2026年初頭までに、確かな基礎とポートフォリオを持つJavaエンジニアとしてIT業界へ転職することです。

🧩 學習進度 / 学習進捗
🩵 第 I 部：基礎を身につけよう / 打好基礎篇
| 章節        | 主題                 | 狀態    | 備註                     |
| --------- | ------------------ | ----- | ---------------------- |
| Chapter 1 | プログラムの書き方（程式的基本寫法） | ✅ 完成  | HelloWorld、輸出練習        |
| Chapter 2 | 式と演算子（運算式與運算子）     | ✅ 完成  | if、switch、邏輯運算         |
| Chapter 3 | 条件分岐と繰り返し（條件分支與迴圈） | ✅ 完成  | while / for / do-while |
| Chapter 4 | 配列（陣列）             | ✅ 完成  | for-each、二維陣列、例外處理     |
| Chapter 5 | メソッド（方法）           | ▶ 學習中 | return、引數、呼叫與封裝        |
| Chapter 6 | 複数クラスを用いた開発（多類別開發） | □ 未開始 |                        |

💎 第 II 部：オブジェクト指向を理解しよう / 物件導向篇
| 章節         | 主題                     | 狀態    | 備註 |
| ---------- | ---------------------- | ----- | -- |
| Chapter 7  | オブジェクト指向をはじめよう（物件導向入門） | □ 未開始 |    |
| Chapter 8  | インスタンスとクラス（實例與類別）      | □ 未開始 |    |
| Chapter 9  | さまざまなクラス機構（多樣的類別結構）    | □ 未開始 |    |
| Chapter 10 | 継承（繼承）                 | □ 未開始 |    |
| Chapter 11 | 高度な継承（進階繼承）            | □ 未開始 |    |
| Chapter 12 | 多態性（多型）                | □ 未開始 |    |
| Chapter 13 | カプセル化（封裝）              | □ 未開始 |    |

💠 第 III 部：より深くJavaを使いこなそう / 進階應用篇
| 章節         | 主題                         | 狀態    | 備註 |
| ---------- | -------------------------- | ----- | -- |
| Chapter 14 | Javaを支えるクラスたち（支撐Java的基礎類別） | □ 未開始 |    |
| Chapter 15 | 文字列と日付の扱い（字串與日期的處理）        | □ 未開始 |    |
| Chapter 16 | コレクション（集合與容器）              | □ 未開始 |    |
| Chapter 17 | 例外（例外處理）                   | □ 未開始 |    |
| Chapter 18 | まだまだ広がるJavaの世界（Java 的更廣世界） | □ 未開始 |    |

🕒 現在進度 / Current Progress
| 狀態 | 說明                                     |
| -- | -------------------------------------- |
| ✅  | **第 I 部 Chapter 4《配列》已完成**             |
| 🔜 | **即將開始 Chapter 5《メソッド（方法）》**           |
| 🎯 | **目標：在 11 月初前完成整本《スッキリわかるJava入門 第4版》** |

🧰 編譯與執行 / コンパイルと実行
▶ 有封包的檔案（例如 Chapter02） / パッケージを含むファイル（例：Chapter02）
javac -d . .\Chapter02\Practice1.java
java Chapter02.Practice1

▶ 無封包的檔案（例如 Chapter03） / パッケージを含まないファイル（例：Chapter03）
cd .\Chapter03
javac Java10.java
java Java10

▶ 一次編譯整個章節 / 章全体を一括コンパイル
javac -d . .\Chapter02\*.java

💡 cd 指令說明 / cd コマンドとは
🧭 中文說明：
cd 是 Change Directory（切換資料夾） 的縮寫。
用來讓終端機（PowerShell / CMD / Terminal）從目前所在資料夾移動到指定位置。
在 Java 開發中，常用來切換到 .java 檔案所在的章節資料夾以進行編譯與執行。
✅ 範例：
cd .\Chapter03
代表進入 Chapter03 資料夾。

📦 無 package 宣告（可在章節資料夾內直接執行）
javac Java10.java
java Java10
📘 說明：沒有 package 的類別屬於「預設包（default package）」，
JVM 會直接在當前資料夾中尋找 .class 檔案執行。

📦 有 package 宣告（需從專案根目錄執行）
javac -d . Chapter04\DNASign.java
java Chapter04.DNASign
📘 說明：
-d . 讓編譯後的 .class 依照 package 結構輸出。
執行時需使用「完整類別名稱（package + 類別名）」。

🧠 總結 / まとめ
| 狀況                        | 執行位置      | 指令範例                                                                  | 備註                   |
| ------------------------- | --------- | --------------------------------------------------------------------- | -------------------- |
| 沒有 `package` 宣告           | 可在章節資料夾內  | `bash<br>javac Java10.java<br>java Java10`                            | 預設包（default package） |
| 有 `package ChapterXX;` 宣告 | 要在專案根目錄執行 | `bash<br>javac -d . Chapter04\DNASign.java<br>java Chapter04.DNASign` | 使用完整類別名稱執行           |

| 状況                        | 実行場所         | コマンド例                                                                 | 備考          |
| ------------------------- | ------------ | --------------------------------------------------------------------- | ----------- |
| `package` 宣言なし            | 各章フォルダ内でOK   | `bash<br>javac Java10.java<br>java Java10`                            | デフォルトパッケージ  |
| `package ChapterXX;` 宣言あり | プロジェクトルートで実行 | `bash<br>javac -d . Chapter04\DNASign.java<br>java Chapter04.DNASign` | 完全修飾クラス名で実行 |

⚙️ 常用指令速查表 / よく使う基本コマンド一覧
| 指令               | 中文說明                    | 日本語説明                      |
| ---------------- | ----------------------- | -------------------------- |
| `cd .\Chapter03` | 切換到 Chapter03 資料夾       | Chapter03 フォルダに移動          |
| `cd ..`          | 回到上一層資料夾                | 一つ上の階層に戻る                  |
| `pwd`            | 顯示目前所在位置（PowerShell 專用） | 現在のディレクトリを表示（PowerShell専用） |
| `dir`            | 顯示目前資料夾內容               | 現在のフォルダ内のファイル一覧を表示         |

📂 專案結構 / プロジェクト構成
Java-Practice/
├─ .gitattributes
├─ .gitignore
├─ README.md
├─ structure.txt
├─ .vscode/
│  └─ settings.json
│
├─ basic/
│  ├─ App.java
│  ├─ App2.java
│  ├─ App3.java
│  ├─ App4.java
│  ├─ Array.java
│  ├─ BasicMath.java
│  ├─ ConditionalStatement.java
│  ├─ DataTypeConversion.java
│  ├─ DataTypeVariable.java
│  ├─ Hello.java
│  ├─ JavaPractise.java
│  ├─ Loop.java
│  ├─ LoopStatement.java
│  ├─ Operator.java
│  ├─ Test.class / Test1.class / Test2.class
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
│  ├─ Java6.java
│  ├─ Java7.java
│  ├─ Java8.java
│  ├─ Java9.java
│  ├─ Java10.java
│  ├─ Java11.java
│  └─ Javap.java
│
├─ Chapter04/
│  ├─ DNASign.java
│  ├─ Practice1.java
│  ├─ Practice2.java
│  ├─ Practice3.java
│  ├─ Practice4.java
│  └─ PracticeN.java
│
└─ Chapter05/


🧰 開發環境 / 開発環境
| 項目                  | 說明 / 説明                                 |
| ------------------- | --------------------------------------- |
| 💻 作業系統 / OS        | Windows 10                              |
| 🧩 編輯器 / エディタ       | Visual Studio Code                      |
| 🌐 版本控管 / バージョン管理   | Git + GitHub                            |
| ☕ Java 環境 / Java 環境 | JDK 25（UTF-8）                           |
| ⚙️ .gitattributes   | 自動換行規則（LF 優先） / 改行コードを自動で調整（LF優先）       |
| 🧱 .gitignore       | 排除 .class 等編譯產物 / コンパイル生成物（.classなど）を除外 |

🌱 未來規劃 / 今後の計画
| 中文                       | 日本語                                    |
| ------------------------ | -------------------------------------- |
| 第5章「メソッド（方法）」學習中         | 第5章「メソッド（方法）」を学習中                      |
| 逐步加入物件導向章節（第6〜7章）        | 第6〜7章のオブジェクト指向章を順次追加予定                 |
| 完成後將整合小專案（猜數字遊戲、成績管理系統等） | 修了後、小規模プロジェクト（数字当てゲーム・成績管理システムなど）を統合予定 |

✨ 作者 / Author
| 項目                | 資料                                                |
| ----------------- | ------------------------------------------------- |
| 👤 名稱 / Name      | 陳永隆 (Yong-Long Chen)                              |
| 📍 居住地 / Location | 日本・岐阜県可児市                                         |
| 🎯 目標 / Goal      | 2026年前轉職為 Java 開發工程師                              |
| 🎯 目標 / 目標        | 2026年までにJavaエンジニアとして転職を目指す                        |
| 💻 GitHub         | [CHEN-YUNGLUNG](https://github.com/CHEN-YUNGLUNG) |
