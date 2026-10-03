package com.google.javascript.jscomp;

import com.google.common.base.Supplier;
import com.google.javascript.rhino.Node;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InlineObjectLiteralsTest {

  private Compiler compiler;
  private int idCounter;

  private final Supplier<String> idSupplier = new Supplier<String>() {
    @Override
    public String get() {
      return String.valueOf(idCounter++);
    }
  };

  @Before
  public void setUp() {
    compiler = new Compiler();
    idCounter = 0;
  }

  private void test(String js, String expected) {
    Node root = compiler.parseTestCode(js);
    Assert.assertEquals(0, compiler.getErrorCount());
    Node externs = new Node(com.google.javascript.rhino.Token.BLOCK);
    InlineObjectLiterals pass = new InlineObjectLiterals(compiler, idSupplier);
    pass.process(externs, root);
    String actual = compiler.toSource(root);
    Node expectedRoot = compiler.parseTestCode(expected);
    String expectedSource = compiler.toSource(expectedRoot);
    Assert.assertEquals(expectedSource, actual);
  }

  private void testSame(String js) {
    test(js, js);
  }

  @Test
  public void testProcess_simpleObjectInlining_inlinesProperties() {
    test(
        "function f() { var obj = {a: 1, b: 2}; return obj.a + obj.b; }",
        "function f() { var JSCompiler_object_inline_a_0 = 1; var JSCompiler_object_inline_b_1 = 2; return JSCompiler_object_inline_a_0 + JSCompiler_object_inline_b_1; }"
    );
  }

  @Test
  public void testProcess_globalVariable_notInlined() {
    testSame("var obj = {a: 1, b: 2}; obj.a;");
  }

  @Test
  public void testProcess_emptyObject_inlinesSuccessfully() {
    test(
        "function f() { var obj = {}; return obj; }",
        "function f() { var obj = {}; return obj; }"
    );
  }

  @Test
  public void testProcess_objectWithReassignment_inlinesAndReplacesAssignments() {
    test(
        "function f() { var obj = {a: 1}; obj = {a: 2}; return obj.a; }",
        "function f() { var JSCompiler_object_inline_a_0 = 1; JSCompiler_object_inline_a_0 = 2, true; return JSCompiler_object_inline_a_0; }"
    );
  }

  @Test
  public void testProcess_unassignedVarThenAssign_inlinesCorrectly() {
    test(
        "function f() { var obj; obj = {a: 1, b: 2}; return obj.a; }",
        "function f() { var JSCompiler_object_inline_a_0; var JSCompiler_object_inline_b_1; JSCompiler_object_inline_a_0 = 1, JSCompiler_object_inline_b_1 = 2, true; return JSCompiler_object_inline_a_0; }"
    );
  }

  @Test
  public void testProcess_methodCallOnProperty_notInlinedDueToThisContext() {
    testSame("function f() { var obj = {fn: function() {}}; obj.fn(); }");
  }

  @Test
  public void testProcess_objectPassedDirectly_notInlined() {
    testSame("function f() { var obj = {a: 1}; g(obj); }");
  }

  @Test
  public void testProcess_gettersAndSetters_notInlined() {
    testSame("function f() { var obj = { get a() { return 1; } }; return obj.a; }");
    testSame("function f() { var obj = { set a(val) { } }; return obj.a; }");
  }

  @Test
  public void testProcess_selfReferentialObject_notInlined() {
    testSame("function f() { var obj = {a: 1, b: obj.a}; return obj.b; }");
  }

  @Test
  public void testProcess_nonObjectLiteralAssignment_notInlined() {
    testSame("function f() { var obj = 5; return obj; }");
  }

  @Test
  public void testProcess_multiplePropertiesWithMissingInitValues_inlinedWithUndefined() {
    test(
        "function f() { var obj = {a: 1}; obj = {b: 2}; return obj.a + obj.b; }",
        "function f() { var JSCompiler_object_inline_a_0 = 1; var JSCompiler_object_inline_b_1; JSCompiler_object_inline_b_1 = 2, JSCompiler_object_inline_a_0 = void 0, true; return JSCompiler_object_inline_a_0 + JSCompiler_object_inline_b_1; }"
    );
  }

  @Test
  public void testProcess_propertyReadWithoutDeclarationInLit_inlinesCorrectly() {
    test(
        "function f() { var obj = {a: 1}; return obj.b; }",
        "function f() { var JSCompiler_object_inline_a_0 = 1; var JSCompiler_object_inline_b_1; return JSCompiler_object_inline_b_1; }"
    );
  }

  @Test
  public void testProcess_staleVarBlacklisting_nestedVariablesPreventedFromInline() {
    test(
        "function f() { var a = {x: 1}; var b = {y: a.x}; return b.y; }",
        "function f() { var a = {x: 1}; var JSCompiler_object_inline_y_0 = a.x; return JSCompiler_object_inline_y_0; }"
    );
  }

  @Test
  public void testProcess_exportedVariable_notInlined() {
    CodingConvention convention = new GoogleCodingConvention() {
      @Override
      public boolean isExported(String name) {
        return "_exported".equals(name);
      }
    };
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setCodingConvention(convention);
    compiler.initOptions(options);

    Node root = compiler.parseTestCode("function f() { var _exported = {a: 1}; return _exported.a; }");
    Node externs = new Node(com.google.javascript.rhino.Token.BLOCK);
    InlineObjectLiterals pass = new InlineObjectLiterals(compiler, idSupplier);
    pass.process(externs, root);

    String actual = compiler.toSource(root);
    Node expectedRoot = compiler.parseTestCode("function f() { var _exported = {a: 1}; return _exported.a; }");
    Assert.assertEquals(compiler.toSource(expectedRoot), actual);
  }

  @Test
  public void testProcess_specialRenamePropertyFunction_notInlined() {
    testSame("function f() { var JSCompiler_renameProperty = {a: 1}; return JSCompiler_renameProperty.a; }");
  }

  @Test
  public void testProcess_nullExternsAndRoots_throwsNullPointerException() {
    InlineObjectLiterals pass = new InlineObjectLiterals(compiler, idSupplier);
    try {
      pass.process(null, null);
      Assert.fail("Expected NullPointerException when root is null");
    } catch (NullPointerException expected) {
      // expected
    }
  }

  @Test
  public void testProcess_emptyProgram_doesNothing() {
    testSame("");
  }
}
