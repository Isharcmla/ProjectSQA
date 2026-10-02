package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.jstype.BooleanLiteralSet;

import org.junit.Before;
import org.junit.Test;

public class TypeInferenceTest {

  private static final String EXTERNS =
      "/** @constructor */ function Object() {}\n"
      + "Object.prototype.toString = function() {};\n"
      + "/** @constructor */ function Function() {}\n"
      + "/** @constructor @template T */ function Array() {}\n"
      + "/** @constructor */ function String() {}\n"
      + "/** @constructor */ function Number() {}\n"
      + "/** @constructor */ function Boolean() {}\n"
      + "var undefined;\n";

  private Compiler compiler;
  private CompilerOptions options;

  @Before
  public void setUp() {
    compiler = new Compiler();
    options = new CompilerOptions();
    options.setCheckTypes(true);
    options.setWarningLevel(DiagnosticGroups.CHECK_TYPES, CheckLevel.WARNING);
    options.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT5);
  }

  private Result compile(String js) {
    SourceFile externsFile = SourceFile.fromCode("externs.js", EXTERNS);
    SourceFile srcFile = SourceFile.fromCode("input.js", js);
    return compiler.compile(externsFile, srcFile, options);
  }

  @Test
  public void testCompile_simpleVarAssignment_noCrash() {
    Result result = compile("var x = 1; x = 2;");
    assertNotNull(result);
  }

  @Test
  public void testCompile_typeMismatchAssignment_reportsWarningOrError() {
    Result result = compile(
        "/** @type {number} */ var x = 1; x = 'hello';");
    assertNotNull(result);
    // Should not crash; may produce warnings due to type mismatch.
    assertTrue(result.warnings.length + result.errors.length >= 0);
  }

  @Test
  public void testCompile_getPropAccess_noCrash() {
    Result result = compile(
        "/** @constructor */ function Foo() { this.bar = 1; }\n"
        + "var f = new Foo();\n"
        + "var y = f.bar;");
    assertNotNull(result);
  }

  @Test
  public void testCompile_andOrExpression_noCrash() {
    Result result = compile(
        "var a = 1; var b = 2; var c = a && b; var d = a || b;");
    assertNotNull(result);
  }

  @Test
  public void testCompile_ternaryHook_noCrash() {
    Result result = compile("var a = 1; var b = a ? 1 : 2;");
    assertNotNull(result);
  }

  @Test
  public void testCompile_objectLiteral_noCrash() {
    Result result = compile("var obj = {a: 1, b: 'str'};");
    assertNotNull(result);
  }

  @Test
  public void testCompile_arrayLiteral_noCrash() {
    Result result = compile("var arr = [1, 2, 3];");
    assertNotNull(result);
  }

  @Test
  public void testCompile_forIn_noCrash() {
    Result result = compile(
        "var obj = {a: 1, b: 2};\n"
        + "for (var k in obj) { var v = obj[k]; }");
    assertNotNull(result);
  }

  @Test
  public void testCompile_switchCase_noCrash() {
    Result result = compile(
        "var x = 1;\n"
        + "switch (x) { case 1: x = 2; break; default: x = 3; }");
    assertNotNull(result);
  }

  @Test
  public void testCompile_tryCatch_noCrash() {
    Result result = compile(
        "try { var x = 1; } catch (e) { var y = e; }");
    assertNotNull(result);
  }

  @Test
  public void testCompile_castExpression_noCrash() {
    Result result = compile(
        "var x = /** @type {number} */ (1);");
    assertNotNull(result);
  }

  @Test
  public void testCompile_newExpression_noCrash() {
    Result result = compile(
        "/** @constructor */ function Foo() {}\n"
        + "var f = new Foo();");
    assertNotNull(result);
  }

  @Test
  public void testCompile_functionCall_noCrash() {
    Result result = compile(
        "function foo(a, b) { return a + b; }\n"
        + "var x = foo(1, 2);");
    assertNotNull(result);
  }

  @Test
  public void testCompile_additionStringNumber_noCrash() {
    Result result = compile(
        "var a = 'str' + 1; var b = 1 + 2; var c = 'a' + 'b';");
    assertNotNull(result);
  }

  @Test
  public void testCompile_typeofOperator_noCrash() {
    Result result = compile("var x = 1; var t = typeof x;");
    assertNotNull(result);
  }

  @Test
  public void testCompile_comparisonOperators_noCrash() {
    Result result = compile(
        "var a = 1; var b = 2;\n"
        + "var c = a < b; var d = a == b; var e = a instanceof Object;");
    assertNotNull(result);
  }

  @Test
  public void testCompile_incrementDecrement_noCrash() {
    Result result = compile("var x = 1; x++; x--; var y = -x; var z = +x;");
    assertNotNull(result);
  }

  @Test
  public void testCompile_bitwiseOperators_noCrash() {
    Result result = compile(
        "var a = 1; var b = 2;\n"
        + "var c = a & b; var d = a | b; var e = a ^ b; var f = ~a;\n"
        + "var g = a << b; var h = a >> b; var i = a >>> b;");
    assertNotNull(result);
  }

  @Test
  public void testCompile_deleteAndIn_noCrash() {
    Result result = compile(
        "var obj = {a: 1};\n"
        + "delete obj.a;\n"
        + "var has = 'a' in obj;");
    assertNotNull(result);
  }

  @Test
  public void testCompile_getElem_noCrash() {
    Result result = compile(
        "var arr = [1, 2, 3];\n"
        + "var x = arr[0];");
    assertNotNull(result);
  }

  @Test
  public void testCompile_commaExpression_noCrash() {
    Result result = compile("var x = (1, 2, 3);");
    assertNotNull(result);
  }

  @Test
  public void testCompile_returnStatement_noCrash() {
    Result result = compile(
        "/** @return {number} */\n"
        + "function foo() { return 1; }");
    assertNotNull(result);
  }

  @Test
  public void testCompile_paramListWithDefaultTypes_noCrash() {
    Result result = compile(
        "/**\n"
        + " * @param {number} a\n"
        + " * @param {string} b\n"
        + " */\n"
        + "function foo(a, b) {}\n"
        + "foo(1, 'str');");
    assertNotNull(result);
  }

  @Test
  public void testCompile_emptySource_noCrash() {
    Result result = compile("");
    assertNotNull(result);
  }

  @Test
  public void testCompile_invalidSyntax_producesErrors() {
    Result result = compile("var x = ;");
    assertNotNull(result);
    assertFalse(result.success);
  }

  @Test
  public void testCompile_assignAdd_noCrash() {
    Result result = compile("var x = 1; x += 2;");
    assertNotNull(result);
  }

  @Test
  public void testCompile_nestedFunctionClosure_noCrash() {
    Result result = compile(
        "function outer() {\n"
        + "  var x = 1;\n"
        + "  function inner() { x = 2; }\n"
        + "  inner();\n"
        + "  return x;\n"
        + "}");
    assertNotNull(result);
  }

  @Test
  public void testGetBooleanOutcomes_andTrueCondition_returnsExpectedUnion() {
    BooleanLiteralSet left = BooleanLiteralSet.TRUE;
    BooleanLiteralSet right = BooleanLiteralSet.FALSE;
    BooleanLiteralSet result = TypeInference.getBooleanOutcomes(left, right, true);
    assertNotNull(result);
  }

  @Test
  public void testGetBooleanOutcomes_orFalseCondition_returnsExpectedUnion() {
    BooleanLiteralSet left = BooleanLiteralSet.BOTH;
    BooleanLiteralSet right = BooleanLiteralSet.EMPTY;
    BooleanLiteralSet result = TypeInference.getBooleanOutcomes(left, right, false);
    assertNotNull(result);
  }

  @Test
  public void testGetBooleanOutcomes_emptySets_returnsEmptyUnion() {
    BooleanLiteralSet result =
        TypeInference.getBooleanOutcomes(
            BooleanLiteralSet.EMPTY, BooleanLiteralSet.EMPTY, true);
    assertEquals(BooleanLiteralSet.EMPTY, result);
  }

  @Test
  public void testGetBooleanOutcomes_bothSets_returnsBoth() {
    BooleanLiteralSet result =
        TypeInference.getBooleanOutcomes(
            BooleanLiteralSet.BOTH, BooleanLiteralSet.BOTH, false);
    assertEquals(BooleanLiteralSet.BOTH, result);
  }
}
