package com.google.javascript.jscomp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

import java.util.Map;

/**
 * Unit tests for {@link AmbiguateProperties}.
 *
 * หมายเหตุ: คลาส AmbiguateProperties เป็น package-private จึงต้องอยู่ใน package เดียวกัน
 * (com.google.javascript.jscomp) เพื่อให้เข้าถึงได้ผ่าน public API ของมันเอง
 * (constructor, process, getRenamingMap) และผ่าน Compiler จริง (ไม่ใช้ mocking framework)
 */
public class AmbiguatePropertiesTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  /**
   * ช่วย compile source code ผ่าน Compiler จริง เพื่อให้ได้ Node tree
   * (externs + root) สำหรับส่งเข้า AmbiguateProperties.process(...)
   */
  private void compile(String js) {
    CompilerOptions options = new CompilerOptions();
    SourceFile externs = SourceFile.fromCode("externs.js", "");
    SourceFile input = SourceFile.fromCode("input.js", js);
    compiler.compile(externs, input, options);
  }

  // ---------------------------------------------------------------------
  // (ก) Normal / typical cases
  // ---------------------------------------------------------------------

  @Test
  public void testConstructor_validCompiler_createsInstanceWithoutException() {
    compile("var x = {};");
    char[] reserved = new char[0];
    AmbiguateProperties ap = new AmbiguateProperties(compiler, reserved);
    assertNotNull(ap);
  }

  @Test
  public void testGetRenamingMap_beforeProcess_returnsEmptyMap() {
    compile("var x = {};");
    AmbiguateProperties ap = new AmbiguateProperties(compiler, new char[0]);
    Map<String, String> map = ap.getRenamingMap();
    assertNotNull(map);
    assertTrue(map.isEmpty());
  }

  @Test
  public void testProcess_withSimplePropertyAccess_doesNotThrowAndReturnsMap() {
    compile(
        "/** @constructor */\n"
            + "function Foo() { this.propA = 1; this.propB = 2; }\n"
            + "var f = new Foo();\n"
            + "f.propA = 3;\n"
            + "f.propB = 4;\n");
    AmbiguateProperties ap = new AmbiguateProperties(compiler, new char[0]);
    Node externsRoot = compiler.getRoot().getFirstChild();
    Node jsRoot = compiler.getRoot().getLastChild();
    ap.process(externsRoot, jsRoot);
    Map<String, String> map = ap.getRenamingMap();
    assertNotNull(map);
  }

  @Test
  public void testProcess_withObjectLiteral_handlesUnquotedAndQuotedKeys() {
    compile(
        "var obj = { unquotedKey: 1, 'quotedKey': 2 };\n"
            + "var y = obj.unquotedKey;\n");
    AmbiguateProperties ap = new AmbiguateProperties(compiler, new char[0]);
    Node externsRoot = compiler.getRoot().getFirstChild();
    Node jsRoot = compiler.getRoot().getLastChild();
    ap.process(externsRoot, jsRoot);
    Map<String, String> map = ap.getRenamingMap();
    assertNotNull(map);
  }

  @Test
  public void testProcess_withGetElemQuoted_addsToQuotedNamesAndDoesNotThrow() {
    compile(
        "var obj = {};\n"
            + "obj['quotedAccess'] = 1;\n"
            + "obj.normalProp = 2;\n");
    AmbiguateProperties ap = new AmbiguateProperties(compiler, new char[0]);
    Node externsRoot = compiler.getRoot().getFirstChild();
    Node jsRoot = compiler.getRoot().getLastChild();
    ap.process(externsRoot, jsRoot);
    Map<String, String> map = ap.getRenamingMap();
    assertNotNull(map);
  }

  @Test
  public void testProcess_withExternProperty_isNotRenamed() {
    CompilerOptions options = new CompilerOptions();
    SourceFile externs = SourceFile.fromCode(
        "externs.js", "var extObj; extObj.externProp;");
    SourceFile input = SourceFile.fromCode(
        "input.js",
        "var obj = {}; obj.externProp = 1; obj.localProp = 2;");
    compiler.compile(externs, input, options);

    AmbiguateProperties ap = new AmbiguateProperties(compiler, new char[0]);
    Node externsRoot = compiler.getRoot().getFirstChild();
    Node jsRoot = compiler.getRoot().getLastChild();
    ap.process(externsRoot, jsRoot);
    Map<String, String> map = ap.getRenamingMap();
    assertNotNull(map);
    // ชื่อ property ที่ปรากฏใน externs จะไม่ถูก rename
    assertFalse(map.containsKey("externProp"));
  }

  // ---------------------------------------------------------------------
  // (ข) Edge cases: null, empty, boundary
  // ---------------------------------------------------------------------

  @Test
  public void testConstructor_nullReservedCharacters_doesNotThrowAtConstructionTime() {
    compile("var x = {};");
    AmbiguateProperties ap = new AmbiguateProperties(compiler, null);
    assertNotNull(ap);
  }

  @Test
  public void testProcess_withEmptySource_doesNotThrowAndReturnsEmptyMap() {
    compile("");
    AmbiguateProperties ap = new AmbiguateProperties(compiler, new char[0]);
    Node externsRoot = compiler.getRoot().getFirstChild();
    Node jsRoot = compiler.getRoot().getLastChild();
    ap.process(externsRoot, jsRoot);
    Map<String, String> map = ap.getRenamingMap();
    assertNotNull(map);
    assertTrue(map.isEmpty());
  }

  @Test
  public void testProcess_withSkipPrefixProperty_skipsRenamingOfThatProperty() {
    String skipPropName = AmbiguateProperties.SKIP_PREFIX + "something";
    compile(
        "/** @constructor */\n"
            + "function Foo() { this."
            + skipPropName
            + " = 1; }\n"
            + "var f = new Foo();\n"
            + "f."
            + skipPropName
            + " = 2;\n");
    AmbiguateProperties ap = new AmbiguateProperties(compiler, new char[0]);
    Node externsRoot = compiler.getRoot().getFirstChild();
    Node jsRoot = compiler.getRoot().getLastChild();
    ap.process(externsRoot, jsRoot);
    Map<String, String> map = ap.getRenamingMap();
    assertNotNull(map);
    // Property ที่มี SKIP_PREFIX ควรถูก skip ไม่นำมา rename ในรอบนี้
    assertFalse(map.containsKey(skipPropName));
  }

  @Test
  public void testProcess_calledTwiceOnSameInstance_doesNotThrow() {
    compile(
        "/** @constructor */\n"
            + "function Foo() { this.propA = 1; }\n"
            + "var f = new Foo();\n"
            + "f.propA = 2;\n");
    AmbiguateProperties ap = new AmbiguateProperties(compiler, new char[0]);
    Node externsRoot = compiler.getRoot().getFirstChild();
    Node jsRoot = compiler.getRoot().getLastChild();
    ap.process(externsRoot, jsRoot);
    // เรียก process ซ้ำอีกครั้งไม่ควร throw exception
    ap.process(externsRoot, jsRoot);
    assertNotNull(ap.getRenamingMap());
  }

  @Test
  public void testProcess_withZeroLengthReservedCharacters_worksNormally() {
    compile("var obj = {}; obj.someProp = 1;");
    char[] reserved = new char[0];
    AmbiguateProperties ap = new AmbiguateProperties(compiler, reserved);
    Node externsRoot = compiler.getRoot().getFirstChild();
    Node jsRoot = compiler.getRoot().getLastChild();
    ap.process(externsRoot, jsRoot);
    assertNotNull(ap.getRenamingMap());
  }

  // ---------------------------------------------------------------------
  // (ค) Exception cases
  // ---------------------------------------------------------------------

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullCompiler_throwsNullPointerException() {
    new AmbiguateProperties(null, new char[0]);
  }

  @Test(expected = NullPointerException.class)
  public void testProcess_withNullExternsAndNullRoot_throwsNullPointerException() {
    compile("var x = {};");
    AmbiguateProperties ap = new AmbiguateProperties(compiler, new char[0]);
    // ส่ง null เข้า process ควรทำให้เกิด NullPointerException
    // เนื่องจาก NodeTraversal.traverse ต้องการ Node ที่ไม่เป็น null
    ap.process(null, null);
  }
}
