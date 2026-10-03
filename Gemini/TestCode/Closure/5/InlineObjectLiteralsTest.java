package com.google.javascript.jscomp;

import com.google.common.base.Supplier;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InlineObjectLiteralsTest extends CompilerTestCase {

  private boolean customConvention = false;

  @Override
  @Before
  public void setUp() throws Exception {
    super.setUp();
    enableNormalize();
    customConvention = false;
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

  @Override
  protected CodingConvention getCodingConvention() {
    if (customConvention) {
      return new GoogleCodingConvention() {
        @Override
        public boolean isExported(String name) {
          return name.startsWith("_exported") || super.isExported(name);
        }
      };
    }
    return super.getCodingConvention();
  }

  @Test
  public void testVarPrefixConstant() {
    Assert.assertEquals("JSCompiler_object_inline_", InlineObjectLiterals.VAR_PREFIX);
  }

  @Test
  public void testObjectLiteralInlining_simple() {
    test(
        "function f() { var a = {x: 1}; return a.x; }",
        "function f() { var JSCompiler_object_inline_x_0 = 1; return JSCompiler_object_inline_x_0; }");
  }

  @Test
  public void testObjectLiteralInlining_multipleKeys() {
    test(
        "function f() { var a = {x: 1, y: 2}; return a.x + a.y; }",
        "function f() { "
            + "var JSCompiler_object_inline_x_0 = 1; "
            + "var JSCompiler_object_inline_y_1 = 2; "
            + "return JSCompiler_object_inline_x_0 + JSCompiler_object_inline_y_1; }");
  }

  @Test
  public void testObjectLiteralInlining_globalScopeForbidden() {
    testSame("var a = {x: 1}; a.x;");
  }

  @Test
  public void testObjectLiteralInlining_exportedVarForbidden() {
    customConvention = true;
    testSame("function f() { var _exported_a = {x: 1}; return _exported_a.x; }");
  }

  @Test
  public void testObjectLiteralInlining_specialRenamePropertyVarForbidden() {
    testSame("function f() { var JSCompiler_renameProperty = {x: 1}; return JSCompiler_renameProperty.x; }");
  }

  @Test
  public void testObjectLiteralInlining_methodCallOnPropertyForbidden() {
    testSame("function f() { var a = {fn: function() {}}; a.fn(); }");
  }

  @Test
  public void testObjectLiteralInlining_unassignedVarThenAssigned() {
    test(
        "function f() { var a; a = {x: 1}; return a.x; }",
        "function f() { "
            + "var JSCompiler_object_inline_x_0; "
            + "JSCompiler_object_inline_x_0 = 1, true; "
            + "return JSCompiler_object_inline_x_0; }");
  }

  @Test
  public void testObjectLiteralInlining_nonObjectLiteralAssignmentForbidden() {
    testSame("function f() { var a = 5; return a; }");
    testSame("function f() { var a = {x: 1}; a = 5; return a.x; }");
  }

  @Test
  public void testObjectLiteralInlining_getterSetterForbidden() {
    testSame("function f() { var a = { get x() { return 1; } }; return a.x; }");
    testSame("function f() { var a = { set x(v) {} }; return a.x; }");
  }

  @Test
  public void testObjectLiteralInlining_selfReferentialForbidden() {
    testSame("function f() { var a = {x: a.x}; return a.x; }");
    testSame("function f() { var a = {x: a}; return a.x; }");
  }

  @Test
  public void testObjectLiteralInlining_propertyAssignLhs() {
    test(
        "function f() { var a = {x: 1}; a.y = 2; return a.x + a.y; }",
        "function f() { "
            + "var JSCompiler_object_inline_x_0 = 1; "
            + "var JSCompiler_object_inline_y_1; "
            + "JSCompiler_object_inline_y_1 = 2; "
            + "return JSCompiler_object_inline_x_0 + JSCompiler_object_inline_y_1; }");
  }

  @Test
  public void testObjectLiteralInlining_undeclaredPropertyReadForbidden() {
    testSame("function f() { var a = {x: 1}; return a.y; }");
  }

  @Test
  public void testObjectLiteralInlining_passedAsParameterForbidden() {
    testSame("function f() { var a = {x: 1}; g(a); }");
  }

  @Test
  public void testObjectLiteralInlining_assignedToAnotherVarForbidden() {
    testSame("function f() { var a = {x: 1}; var b = a; }");
  }

  @Test
  public void testObjectLiteralInlining_multipleAssignmentsAndMissingKeys() {
    test(
        "function f() { "
            + "var a = {x: 1, y: 2}; "
            + "a = {x: 3}; "
            + "return a.x + a.y; }",
        "function f() { "
            + "var JSCompiler_object_inline_x_0 = 1; "
            + "var JSCompiler_object_inline_y_1 = 2; "
            + "JSCompiler_object_inline_x_0 = 3, JSCompiler_object_inline_y_1 = void 0, true; "
            + "return JSCompiler_object_inline_x_0 + JSCompiler_object_inline_y_1; }");
  }

  @Test
  public void testObjectLiteralInlining_emptyObjectLiteralReassignment() {
    test(
        "function f() { "
            + "var a = {}; "
            + "return a; }",
        "function f() { "
            + "var a = {}; "
            + "return a; }");

    test(
        "function f() { "
            + "var a = {x: 1}; "
            + "a = {}; "
            + "return a.x; }",
        "function f() { "
            + "var JSCompiler_object_inline_x_0 = 1; "
            + "JSCompiler_object_inline_x_0 = void 0, true; "
            + "return JSCompiler_object_inline_x_0; }");
  }

  @Test
  public void testObjectLiteralInlining_threeOrMoreKeysCommaTree() {
    test(
        "function f() { "
            + "var a; "
            + "a = {x: 1, y: 2, z: 3}; "
            + "return a.x + a.y + a.z; }",
        "function f() { "
            + "var JSCompiler_object_inline_x_0; "
            + "var JSCompiler_object_inline_y_1; "
            + "var JSCompiler_object_inline_z_2; "
            + "JSCompiler_object_inline_x_0 = 1, JSCompiler_object_inline_y_1 = 2, JSCompiler_object_inline_z_2 = 3, true; "
            + "return JSCompiler_object_inline_x_0 + JSCompiler_object_inline_y_1 + JSCompiler_object_inline_z_2; }");
  }

  @Test
  public void testObjectLiteralInlining_blacklistsReferencedVariables() {
    test(
        "function f() { "
            + "var b = {x: 1}; "
            + "var a = {y: b.x}; "
            + "return a.y; }",
        "function f() { "
            + "var b = {x: 1}; "
            + "var JSCompiler_object_inline_y_0 = b.x; "
            + "return JSCompiler_object_inline_y_0; }");
  }

  @Test
  public void testObjectLiteralInlining_assignmentInVarInitializationWithoutWellDefined() {
    test(
        "function f(cond) { "
            + "var a; "
            + "if (cond) { a = {x: 1}; } else { a = {x: 2}; } "
            + "return a.x; }",
        "function f(cond) { "
            + "var JSCompiler_object_inline_x_0; "
            + "if (cond) { "
            + "  JSCompiler_object_inline_x_0 = 1, true; "
            + "} else { "
            + "  JSCompiler_object_inline_x_0 = 2, true; "
            + "} "
            + "return JSCompiler_object_inline_x_0; }");
  }

  @Test
  public void testObjectLiteralInlining_directProcessCall() {
    Compiler compiler = new Compiler();
    InlineObjectLiterals pass =
        new InlineObjectLiterals(
            compiler,
            new Supplier<String>() {
              @Override
              public String get() {
                return "0";
              }
            });
    Node externs = compiler.parseTestCode("");
    Node root = compiler.parseTestCode("function f() { var a = {x: 1}; return a.x; }");
    pass.process(externs, root);
    Assert.assertNotNull(root);
  }
}
