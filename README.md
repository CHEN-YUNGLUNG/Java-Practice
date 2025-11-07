☕ Java Practice Log / Java 練習記錄
📘 Java学習者 / ITエンジニア転職準備中  
💻 独学で『スッキリわかるJava入門 第4版』を完走した記録です。

🕒 更新日：2025/10/29 — 第18章完成（第7〜18章重點總整理）

📖 專案介紹 / プロジェクト紹介

```bash
這個專案是我在學習《スッキリわかるJava入門 第4版》的過程中建立的練習紀錄。
每一章節的練習程式都會上傳到這裡，作為學習進度與成長的見證。
目標是在 2026 年初 能以紮實的基礎與作品集，成功轉職為 IT／Java 開發工程師。
```

```bash
このプロジェクトは、『スッキリわかるJava入門 第4版』を学習する過程で作成した練習記録です。
各章の練習コードをアップロードし、学習の進捗と成長の証として残しています。
目標は 2026年初頭までにJavaエンジニアとしてIT業界へ転職すること です。
```

🧩 學習進度 / 学習進捗
🩵 第 I 部：基礎を身につけよう / 打好基礎篇

| 章節        | 主題                 | 狀態   | 備註                     |
| --------- | ------------------ | ---- | ---------------------- |
| Chapter 1 | プログラムの書き方（程式的基本寫法） | ✅ 完成 | HelloWorld、輸出練習        |
| Chapter 2 | 式と演算子（運算式與運算子）     | ✅ 完成 | if、switch、邏輯運算         |
| Chapter 3 | 条件分岐と繰り返し（條件分支與迴圈） | ✅ 完成 | while / for / do-while |
| Chapter 4 | 配列（陣列）             | ✅ 完成 | for-each、二維陣列          |
| Chapter 5 | メソッド（方法）           | ✅ 完成 | 參數、回傳、呼叫               |
| Chapter 6 | 複数クラスを用いた開発（多類別開發） | ✅ 完成 | package、import         |

💎 第 II 部：オブジェクト指向を理解しよう / 物件導向篇

| 章節         | 主題             | 狀態   | 備註                  |
| ---------- | -------------- | ---- | ------------------- |
| Chapter 7  | オブジェクト指向をはじめよう | ✅ 完成 | 類別設計觀念              |
| Chapter 8  | インスタンスとクラス     | ✅ 完成 | this、static、final   |
| Chapter 9  | さまざまなクラス機構     | ✅ 完成 | 列舉、巢狀類別等            |
| Chapter 10 | 継承             | ✅ 完成 | super、覆寫、暗黙の継承      |
| Chapter 11 | 高度な継承          | ✅ 完成 | abstract、interface  |
| Chapter 12 | 多態性            | ✅ 完成 | 型別提升、動態繫結           |
| Chapter 13 | カプセル化          | ✅ 完成 | getter/setter、妥當性檢查 |

💠 第 III 部：より深くJavaを使いこなそう / 進階應用篇

| 章節         | 主題             | 狀態   | 備註                            |
| ---------- | -------------- | ---- | ----------------------------- |
| Chapter 14 | Javaを支えるクラスたち  | ✅ 完成 | equals/hashCode/Objects       |
| Chapter 15 | 文字列と日付の扱い      | ✅ 完成 | String/Builder/Regex/Time API |
| Chapter 16 | コレクション         | ✅ 完成 | List/Set/Map、Generics、Big-O   |
| Chapter 17 | 例外             | ✅ 完成 | try-catch、throw vs throws、TWR |
| Chapter 18 | まだまだ広がるJavaの世界 | ✅ 完成 | IO/網路/URL/openStream          |

📂 專案結構 / プロジェクト構成（2025/10/29）

```bash
Java-Practice/
├─ .vscode/settings.json
├─ basic/ ... 
├─ Chapter01/ ... 
├─ Chapter02/ ... 
├─ Chapter03/ ... 
├─ Chapter04/ ... 
├─ Chapter05/ ... 
├─ Chapter06/ ... 
├─ Chapter08/Character/Cleric.java
├─ Chapter09/Character/Thief.java
├─ Chapter10/(Matango, PoisonMatango, Character/Cleric ...)
├─ Chapter11/(Asset, Thing, TangibleAsset ...)
├─ Chapter12/(X, Y, A, B, Main ...)
├─ Chapter13/(Hero, Sword, Wand, Wizard, Main ...)
├─ Chapter14/(Account, Main ...)
├─ Chapter15/(Split, Practice1~5 ...)
├─ Chapter16/(Hero, Hero2 ...)
├─ Chapter17/(Practice1~3 ...)
└─ README.md / structure.txt
```

▶ 編譯與執行 / コンパイルと実行

```bash
# 有封包（例：Chapter13）
javac -d . .\Chapter13\*.java
java Chapter13.Main

# 無封包（進入該資料夾後）
cd .\Chapter03
javac Java10.java
java Java10

# 一口氣編譯某章
javac -d . .\Chapter16\*.java
```

⚙️ 常用指令速查表 / よく使う基本コマンド一覧

| 指令               | 中文說明              | 日本語説明              |
| ---------------- | ----------------- | ------------------ |
| `cd .\Chapter03` | 切換到 Chapter03 資料夾 | Chapter03 フォルダに移動  |
| `cd ..`          | 回到上一層資料夾          | 一つ上の階層に戻る          |
| `dir`            | 顯示目前資料夾內容         | 現在のフォルダ内のファイル一覧を表示 |
| `pwd`            | 顯示目前所在位置          | 現在のディレクトリを表示       |

🧠 學習要點總整理 / 学習要点総まとめ

🔹 第7章：オブジェクト指向をはじめよう / 開始物件導向
📘 中文說明：

```
理解「類別（Class）」與「物件（Object）」的關係。
類別是設計圖、物件是依據設計圖生成的實體。
使用 new 關鍵字建立物件，並能呼叫其屬性與方法。
```

📗 日本語説明：

```
クラスは設計図、オブジェクトはその設計図から作られた実体です。
new キーワードでオブジェクトを生成し、メソッドやフィールドを呼び出します。
```

💻 範例：

```bash
class Hero {
    String name;
    void attack() {
        System.out.println(name + "は攻撃した！");
    }
}

public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "勇者";
        h.attack();
    }
}
```

💡 現場實務でのポイント：

```
Java 對象導向的基礎在「封裝（encapsulation）」與「責任分離（responsibility separation）」，
實務中類別通常對應一個概念或職責（例如：User、Order、Service）。

Javaのオブジェクト指向の基礎は「カプセル化（encapsulation）」と「責務の分離（responsibility separation）」にあります。
実務では、クラスは通常ひとつの概念または役割（例：User、Order、Service）を表します。
```

🔹 第8章：インスタンスとクラス / 實例與類別
📘 中文說明：

```
理解 static 關鍵字與「類別變數／實例變數」的區別。
this 代表當前物件自身，可用於區分同名參數與屬性。
```

📗 日本語説明：

```
static は「クラスに属する」ことを意味します。
this は「このオブジェクト自身」を指し、インスタンス変数と引数の区別に使われます。
```

💻 範例：

```bash
class Cleric {
    String name;
    static int maxHp = 50;
    int hp = 50;

    void heal(int hp) {
        this.hp += hp;
        if (this.hp > maxHp) this.hp = maxHp;
        System.out.println(this.name + "のHPは" + this.hp + "になった！");
    }
}
```

💡 現場實務でのポイント：

```
·static 用於公用設定或工具類別（例如 Math.random()）。
·OOP 設計中盡量避免過度依賴靜態方法，以保留彈性與測試性。

static は共通設定やユーティリティクラス（例：Math.random()）に使用します。
OOP設計では、柔軟性とテストのしやすさを保つために、静的メソッドへの過度な依存を避けることが推奨されます。
```

🔹 第9章：さまざまなクラス機構 / 各種類別機構

📘 中文說明：

```
介紹「封裝」、「靜態成員」、「列舉（enum）」與「final」。
列舉用於定義固定集合，如季節、方向等。
```

📗 日本語説明：

```
final は「再代入・継承・オーバーライドを禁止」します。
enum は定数の集合を表すクラスです。
```

💻 範例：

```bash
enum Season { SPRING, SUMMER, AUTUMN, WINTER }

public class Main {
    public static void main(String[] args) {
        Season s = Season.SUMMER;
        System.out.println(s); // SUMMER
    }
}
```

💡 現場實務でのポイント：

```
·封裝（private + getter/setter）是企業開發的基本約定。
·列舉在設定檔常用來表現業務固定值（如「狀態＝PENDING/APPROVED」）。

カプセル化（private + getter / setter）は企業開発での基本的なルールです。
列挙型（enum）は設定ファイルなどで業務上の固定値（例：「状態＝PENDING / APPROVED」）を表すのによく使われます。
```

🔹 第10章：継承 / 繼承

📘 中文說明：

```
extends 代表繼承，子類別會繼承父類別的屬性與方法。
super() 呼叫父類別建構式。
```

📗 日本語説明：

```
extends はスーパークラスを継承することを意味します。
サブクラスはスーパークラスの機能を引き継ぎ、拡張できます。
```

💻 範例：

```bash
class Matango {
    int hp = 50;
}

class PoisonMatango extends Matango {
    int poisonCount = 5;
}
```

💡 現場實務でのポイント：

```
·繼承用於「is-a」關係（例：犬 is 動物）。
·若只是「has-a」關係，應使用「組合（composition）」而非繼承。

継承は「is-a」関係（例：犬は動物である）に使用します。
「has-a」関係の場合は、継承ではなく「コンポジション（composition：合成）」を使用するべきです。
```

🔹 第11章：高度な継承 / 進階繼承

📘 中文說明：

```
介面（interface）定義「必須實作的方法」，可多重實作。
抽象類別（abstract）則可定義共通屬性與部分實作。
```

📗 日本語説明：

```
interface は仕様書のようなもので、すべてのメソッドが抽象です。
abstract class は部分的な実装を持ち、共通の基盤を提供します。
```

💻 範例：

```bash
interface Thing {
    void use();
}

abstract class Asset {
    String name;
    abstract void printName();
}
```

💡 現場實務でのポイント：

```
實務上多用介面取代繼承（更靈活），例如 List, Map 等皆為介面。

実務では、継承よりもインターフェースの実装を利用することが多く、より柔軟に設計できます。
たとえば、List や Map はすべてインターフェースです。
```

🔹 第12章：多態性 / 多型

📘 中文說明：

```
多型（Polymorphism）指同一介面可對應不同實作。
讓程式可針對父類別編寫，卻能靈活呼叫子類別。
```

📗 日本語説明：

```
ポリモーフィズムとは、同じ型で異なる動作を実現できる仕組みです。
```

💻 範例：

```bash
Hero h = new Hero();
Wizard w = new Wizard();
Character c = w; // Wizard を Character として扱う
```

💡 現場實務でのポイント：

```
多型是設計模式的核心（例如策略模式、工廠模式）。

ポリモーフィズム（多態性）は設計パターンの中心概念です。
代表的な例として、ストラテジーパターン（Strategy）やファクトリーパターン（Factory）があります。
```

🔹 第13章：カプセル化 / 封裝

📘 中文說明：

```
封裝是物件導向的基礎，用 private 隱藏資料，透過 getter/setter 存取。
```

📗 日本語説明：

```
カプセル化は、データを直接操作させず安全に保護する仕組みです。
```

💻 範例：

```bash
class Hero {
    private String name;
    public void setName(String name) { this.name = name; }
    public String getName() { return this.name; }
}
```

💡 現場實務でのポイント：

```
企業開發中若直接公開欄位會導致可維護性下降。
封裝可讓類別易於修改與擴充。

企業システムでフィールドを直接公開すると、保守性が著しく低下します。
カプセル化を行うことで、クラスの拡張や修正が容易になります。
```

🔹 第14章：Javaを支えるクラスたち / 支撐Java的基礎類別

📘 中文說明：

```
Java 提供許多內建類別，例如 Object, String, Math。
所有類別都繼承自 Object。
```

📗 日本語説明：

```
すべてのクラスは Object クラスを暗黙的に継承しています。
```

💻 範例：

```bash
System.out.println("Hello".equals("hello")); // false
System.out.println(Math.max(3, 9)); // 9
```

💡 現場實務でのポイント：

```
理解 equals() vs == 是面試常考題。
equals() 比較內容，== 比較記憶體位址。

equals() と == の違いは面接でもよく問われます。
equals() は内容の比較、== はメモリアドレス（参照）の比較を意味します。
```

🔹 第15章：文字列と日付の扱い / 字串與日期的處理

📘 中文說明：

```
String 是不可變的字串類別。
日期處理使用 LocalDate, LocalDateTime, ZonedDateTime。
日期格式化可用 DateTimeFormatter。
```

📗 日本語説明：

```
String は不変オブジェクトです。
日付と時刻は java.time パッケージで扱います。
```

💻 範例：

```bash
LocalDateTime now = LocalDateTime.now();
DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
System.out.println(now.format(fmt));
```

💡 現場實務でのポイント：

```
·LocalDate 無時間、LocalDateTime 含時間、ZonedDateTime 含時區。
·正確的時間處理對伺服器應用極為重要。

LocalDate は日付のみ、LocalDateTime は日付＋時間、ZonedDateTime はさらにタイムゾーン情報を含みます。
正確な時刻処理はサーバーアプリケーションでは非常に重要です。
```

🔹 第16章：コレクション / 集合

📘 中文說明：

```
·集合類別包含 List, Set, Map。
·List：可重複、可排序
·Set：不重複
·Map：鍵值對（key-value）
```

📗 日本語説明：

```
コレクションはデータの集まりを扱う仕組みで、List・Set・Map に分類されます。
```

💻 範例：

```bash
List<String> names = new ArrayList<>(); //ダイヤモンド演算子
names.add("太郎");
names.add("花子");
System.out.println(names.get(0)); // 太郎
System.out.println(names.get(1)); // 花子
```

💡 現場實務でのポイント：

```
·ArrayList：隨機存取快，插入慢
·LinkedList：插入快，隨機慢
·HashMap：鍵查詢快但無序
·注意 equals() 和 hashCode() 的正確覆寫。

·ArrayList：ランダムアクセスが高速だが、挿入は遅い。
·LinkedList：挿入は高速だが、ランダムアクセスは遅い。
·HashMap：キー検索が高速だが、順序は保証されない。
また、equals() と hashCode() を正しくオーバーライドすることが重要です。
```

🔹 第17章：例外 / 例外處理

📘 中文說明：

```
例外（Exception）代表執行時發生異常情況。
可使用 try-catch-finally 捕捉與處理。
自訂例外可繼承 Exception 類別。
```

📗 日本語説明：

```
例外は、実行中に発生する異常な状況を表します。
try-catch 構文で安全に処理できます。
```

💻 範例：

```bash
try {
    int[] arr = {1, 2};
    System.out.println(arr[3]);
} catch (ArrayIndexOutOfBoundsException e) {
    e.printStackTrace();
}
```

💡 現場實務でのポイント：

```
·throw：拋出例外
·throws：聲明可能拋出的例外
·開發時建議記錄 log 而非單純印出錯誤。

·throw：例外を発生させる。
·throws：メソッドが例外を投げる可能性を宣言する。
開発時には単にエラーを表示するのではなく、ログとして記録することが推奨されます。
```

🔹 第18章：まだまだ広がるJavaの世界 / Java 的更廣世界

📘 中文說明：

```
學習如何與外部資源（如網頁、資料庫、GUI）整合。
URL 類別與 InputStream 可用於網路資料讀取。
```

📗 日本語説明：

```
Java はネットワーク、データベース、GUI など幅広く利用可能です。
URL クラスでウェブデータを扱うことができます。
```

💻 範例：

```bash
URL u = new URL("<https://book.impress.co.jp/>");
InputStream is = u.openStream();
```

💡 現場實務でのポイント：

```
·透過 Java API Docs 可查詢方法原型（如 openStream()）。
·真實專案會結合 I/O、HTTP、SQL、GUI 或 Spring Framework。

Java API Docs を利用すれば、メソッド定義（例：openStream()）を簡単に確認できます。
実際のプロジェクトでは、I/O、HTTP、SQL、GUI、Spring Framework などと組み合わせて使用されます。
```

📘 參考筆記 / Reference Notes

```
．equals/hashCode 契約與 Objects 工具類（Objects.equals/Objects.hash）
．StringBuilder / StringBuffer、Regex {n}, ?, \\d、indexOf vs charAt
．ZonedDateTime vs LocalDateTime／DateTimeFormatter.ofPattern() 常見格式字元
．List/Set/Map 一頁通（含 Big-O、Hash 原理、TreeMap/TreeSet 排序要件）
．Iterator.remove 精準刪除規則；日期等價是 isEqual() 而非 equals()
．throw vs throws（比喻＋實戰範式）、StackTrace 閱讀術（含 Caused by）
．try-with-resources 與 .close() 的關係與最佳實務
```

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

| 中文                            | 日本語                            |
| ----------------------------- | ------------------------------ |
| 完成第7〜18章總整理（本頁）               | 第7〜18章の総まとめ（本README）           |
| 進入 JavaFX / GUI 與 Spring Boot | JavaFX / GUI と Spring Boot 学習へ |
| 整合小專案（RPG/成績管理/抓網頁）           | ミニプロジェクト統合（RPG・成績管理・Web取得）     |
| 建立 GitHub 作品集／履歷連動            | GitHub ポートフォリオと履歴書連携           |

✨ 作者 / Author

| 項目           | 資料                   |
| ------------ | -------------------- |
| 👤 名稱 / 名前   | 陳永隆 (Yong-Long Chen) / チン・エイリュウ |
| 📍 居住地 / 居住地 | 日本・岐阜県可児市            |
| 🎯 目標 / 目標   | 2026年前轉職為 Java 開發工程師 / 2026年までにJava開発エンジニアへの転職を目指しています |
| 💻 GitHub    | CHEN-YUNGLUNG / [Java-Practice](<https://github.com/CHEN-YUNGLUNG/Java-Practice>)        |
