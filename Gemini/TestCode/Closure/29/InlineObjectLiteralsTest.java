package com.google.javascript.jscomp;

import com.google.common.base.Supplier;
import org.junit.Before;
import org.junit.Test;

public class InlineObjectLiteralsTest extends CompilerTestCase {

  @Override
  @Before
  public void setUp() throws Exception {
    super.setUp();
    enableNormalize();
  }

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    return new InlineObjectLiterals(
        compiler,
        new Supplier<String>() {
          private int id = 0;
          @Override
          public String get() {
            return String.valueOf(id++);
          }
        });
  }

  private void testLocal(String js, String expected) {
    test("function f() { " + js + " }", "function f() { " + expected + " }");
  }

  private void testLocalSame(String js) {
    testSame("function f() { " + js + " }");
  }

  @Test
  public void testProcess_globalVariable_notInlined() {
    testSame("var a = {x: 1}; var b = a.x;");
  }

  @Test
  public void testProcess_renamePropertyFunctionName_notInlined() {
    testLocalSame("var JSCompiler_renameProperty = {x: 1}; return JSCompiler_renameProperty.x;");
  }

  @Test
  public void testProcess_primitiveVariable_notInlined() {
    testLocalSame("var a = 1; return a;");
  }

  @Test
  public void testProcess_objectPassedAsArgument_notInlined() {
    testLocalSame("var a = {x: 1}; g(a);");
  }

  @Test
  public void testProcess_objectAssignedToAnotherVariable_notInlined() {
    testLocalSame("var a = {x: 1}; var b = a; return b.x;");
  }

  @Test
  public void testProcess_objectMethodCall_notInlined() {
    testLocalSame("var a = {fn: function() {}}; a.fn();");
  }

  @Test
  public void testProcess_getterDefinedOnObject_notInlined() {
    testLocalSame("var a = {get x() { return 1; }}; return a.x;");
  }

  @Test
  public void testProcess_setterDefinedOnObject_notInlined() {
    testLocalSame("var a = {set x(val) {}}; return a.x;");
  }

  @Test
  public void testProcess_selfReferentialAssignment_notInlined() {
    testLocalSame("var a = {x: a.x}; return a.x;");
  }

  @Test
  public void testProcess_assignExpressionNotStatement_notInlined() {
    testLocalSame("var a; if (a = {x: 1}) { return a.x; }");
  }

  @Test
  public void testProcess_simpleObjectLiteral_inlined() {
    testLocal(
        "var a = {x: 1}; return a.x;",
        "var JSCompiler_object_inline_x_0 = 1; return JSCompiler_object_inline_x_0;");
  }

  @Test
  public void testProcess_multipleProperties_inlined() {
    testLocal(
        "var a = {x: 1, y: 2}; return a.x + a.y;",
        "var JSCompiler_object_inline_x_0 = 1;"
            + "var JSCompiler_object_inline_y_1 = 2;"
            + "return JSCompiler_object_inline_x_0 + JSCompiler_object_inline_y_1;");
  }

  @Test
  public void testProcess_duplicatePropertyReads_inlined() {
    testLocal(
        "var a = {x: 1}; return a.x + a.x;",
        "var JSCompiler_object_inline_x_0 = 1;"
            + "return JSCompiler_object_inline_x_0 + JSCompiler_object_inline_x_0;");
  }

  @Test
  public void testProcess_uninitializedVarThenAssigned_inlined() {
    testLocal(
        "var a; a = {x: 1}; return a.x;",
        "var JSCompiler_object_inline_x_0;"
            + "JSCompiler_object_inline_x_0 = 1, true;"
            + "return JSCompiler_object_inline_x_0;");
  }

  @Test
  public void testProcess_reassignmentSameKeys_inlined() {
    testLocal(
        "var a = {x: 1}; a = {x: 2}; return a.x;",
        "var JSCompiler_object_inline_x_0 = 1;"
            + "JSCompiler_object_inline_x_0 = 2, true;"
            + "return JSCompiler_object_inline_x_0;");
  }

  @Test
  public void testProcess_reassignmentMissingKeys_assignedUndefined() {
    testLocal(
        "var a = {x: 1, y: 2}; a = {x: 3}; return a.x + a.y;",
        "var JSCompiler_object_inline_x_0 = 1;"
            + "var JSCompiler_object_inline_y_1 = 2;"
            + "JSCompiler_object_inline_x_0 = 3, JSCompiler_object_inline_y_1 = void 0, true;"
            + "return JSCompiler_object_inline_x_0 + JSCompiler_object_inline_y_1;");
  }

  @Test
  public void testProcess_reassignmentEmptyObject_allUndefined() {
    testLocal(
        "var a = {x: 1}; a = {}; return a.x;",
        "var JSCompiler_object_inline_x_0 = 1;"
            + "JSCompiler_object_inline_x_0 = void 0, true;"
            + "return JSCompiler_object_inline_x_0;");
  }

  @Test
  public void testProcess_threeOrMorePropertiesReassignment_commaChainingHandled() {
    testLocal(
        "var a = {x: 1, y: 2, z: 3}; a = {x: 4, y: 5, z: 6}; return a.x + a.y + a.z;",
        "var JSCompiler_object_inline_x_0 = 1;"
            + "var JSCompiler_object_inline_y_1 = 2;"
            + "var JSCompiler_object_inline_z_2 = 3;"
            + "JSCompiler_object_inline_x_0 = 4, JSCompiler_object_inline_y_1 = 5, JSCompiler_object_inline_z_2 = 6, true;"
            + "return JSCompiler_object_inline_x_0 + JSCompiler_object_inline_y_1 + JSCompiler_object_inline_z_2;");
  }

  @Test
  public void testProcess_variableReferenceInValue_blacklistsReferencedVar() {
    testLocal(
        "var b = {x: 1}; var a = {y: b.x}; return a.y + b.x;",
        "var JSCompiler_object_inline_y_0 = 1;"
            + "return JSCompiler_object_inline_y_0 + 1;");
  }

  @Test
  public void testProcess_emptyObjectDeclaration_inlinedToTrue() {
    testLocal(
        "var a = {};",
        "true;");
  }

  @Test
  public void testProcess_propertyReadBeforeInitialized_inlined() {
    testLocal(
        "var a; var b = a.x; a = {x: 1};",
        "var JSCompiler_object_inline_x_0;"
            + "var b = JSCompiler_object_inline_x_0;"
            + "JSCompiler_object_inline_x_0 = 1, true;");
  }

  @Test
  public void testProcess_multipleObjectInlinesInSameScope() {
    testLocal(
        "var a = {x: 1}; var b = {y: 2}; return a.x + b.y;",
        "var JSCompiler_object_inline_x_0 = 1;"
            + "var JSCompiler_object_inline_y_1 = 2;"
            + "return JSCompiler_object_inline_x_0 + JSCompiler_object_inline_y_1;");
  }
}
