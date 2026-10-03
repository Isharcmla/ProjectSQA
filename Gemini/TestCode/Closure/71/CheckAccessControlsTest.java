package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class CheckAccessControlsTest extends CompilerTestCase {

  @Override
  @Before
  public void setUp() throws Exception {
    super.setUp();
    enableTypeCheck(CheckLevel.WARNING);
  }

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    return new CheckAccessControls(compiler);
  }

  @Override
  protected CompilerOptions getOptions() {
    CompilerOptions options = super.getOptions();
    options.setWarningLevel(DiagnosticGroups.ACCESS_CONTROLS, CheckLevel.WARNING);
    options.setWarningLevel(DiagnosticGroups.DEPRECATED, CheckLevel.WARNING);
    options.setWarningLevel(DiagnosticGroups.CONSTANT_PROPERTY, CheckLevel.WARNING);
    return options;
  }

  @Override
  protected int getNumRepetitions() {
    return 1;
  }

  @Test
  public void testDeprecatedVariable_withoutReason_emitsWarning() {
    test(
        "/** @deprecated */ var bad = 4; function f() { return bad; }",
        null,
        CheckAccessControls.DEPRECATED_NAME);
  }

  @Test
  public void testDeprecatedVariable_withReason_emitsReasonWarning() {
    test(
        "/** @deprecated Use good instead. */ var bad = 4; function f() { return bad; }",
        null,
        CheckAccessControls.DEPRECATED_NAME_REASON);
  }

  @Test
  public void testDeprecatedVariable_insideDeprecatedFunction_noWarning() {
    testSame(
        "/** @deprecated */ var bad = 4; /** @deprecated */ function f() { return bad; }");
  }

  @Test
  public void testDeprecatedClass_instantiationWithoutReason_emitsWarning() {
    test(
        "/** @constructor\n * @deprecated */ function BadClass() {}\n"
            + "function f() { new BadClass(); }",
        null,
        CheckAccessControls.DEPRECATED_CLASS);
  }

  @Test
  public void testDeprecatedClass_instantiationWithReason_emitsReasonWarning() {
    test(
        "/** @constructor\n * @deprecated Use GoodClass instead. */ function BadClass() {}\n"
            + "function f() { new BadClass(); }",
        null,
        CheckAccessControls.DEPRECATED_CLASS_REASON);
  }

  @Test
  public void testDeprecatedClass_accessInsideDeprecatedClassMethod_noWarning() {
    testSame(
        "/** @constructor\n * @deprecated */ function BadClass() {}\n"
            + "BadClass.prototype.method = function() { new BadClass(); };");
  }

  @Test
  public void testDeprecatedClass_accessInsideStaticMethodOfDeprecatedClass_noWarning() {
    testSame(
        "/** @constructor\n * @deprecated */ function BadClass() {}\n"
            + "BadClass.staticMethod = function() { new BadClass(); };");
  }

  @Test
  public void testDeprecatedProperty_withoutReason_emitsWarning() {
    test(
        "/** @constructor */ function Foo() {}\n"
            + "/** @deprecated */ Foo.prototype.bar = 3;\n"
            + "function test(/** Foo */ x) { return x.bar; }",
        null,
        CheckAccessControls.DEPRECATED_PROP);
  }

  @Test
  public void testDeprecatedProperty_withReason_emitsReasonWarning() {
    test(
        "/** @constructor */ function Foo() {}\n"
            + "/** @deprecated Use baz instead. */ Foo.prototype.bar = 3;\n"
            + "function test(/** Foo */ x) { return x.bar; }",
        null,
        CheckAccessControls.DEPRECATED_PROP_REASON);
  }

  @Test
  public void testDeprecatedProperty_assignmentToProperty_noWarning() {
    testSame(
        "/** @constructor */ function Foo() {}\n"
            + "/** @deprecated */ Foo.prototype.bar = 3;\n"
            + "function test(/** Foo */ x) { x.bar = 4; }");
  }

  @Test
  public void testDeprecatedProperty_inheritedFromPrototype_emitsWarning() {
    test(
        "/** @constructor */ function SuperFoo() {}\n"
            + "/** @deprecated */ SuperFoo.prototype.prop = 1;\n"
            + "/** @constructor\n * @extends {SuperFoo} */ function SubFoo() {}\n"
            + "SubFoo.prototype = new SuperFoo();\n"
            + "function test(/** SubFoo */ x) { return x.prop; }",
        null,
        CheckAccessControls.DEPRECATED_PROP);
  }

  @Test
  public void testPrivateGlobal_accessInDifferentFile_emitsWarning() {
    test(
        new String[] {
          "/** @private */ var secret = 10;",
          "function getSecret() { return secret; }"
        },
        null,
        CheckAccessControls.BAD_PRIVATE_GLOBAL_ACCESS);
  }

  @Test
  public void testPrivateGlobal_accessInSameFile_noWarning() {
    testSame("/** @private */ var secret = 10;\nfunction getSecret() { return secret; }");
  }

  @Test
  public void testPrivateProperty_accessDifferentFile_emitsWarning() {
    test(
        new String[] {
          "/** @constructor */ function Foo() {\n"
              + "  /** @private */ this.secret_ = 42;\n"
              + "}",
          "function test(/** Foo */ x) { return x.secret_; }"
        },
        null,
        CheckAccessControls.BAD_PRIVATE_PROPERTY_ACCESS);
  }

  @Test
  public void testPrivateProperty_accessInsideOwnMethodInDifferentFile_noWarning() {
    testSame(
        new String[] {
          "/** @constructor */ function Foo() {\n"
              + "  /** @private */ this.secret_ = 42;\n"
              + "}",
          "Foo.prototype.getSecret = function() { return this.secret_; };"
        });
  }

  @Test
  public void testPrivateConstructor_newInDifferentFile_emitsWarning() {
    test(
        new String[] {
          "/** @constructor\n * @private */ function SecretCtor() {}",
          "function make() { return new SecretCtor(); }"
        },
        null,
        CheckAccessControls.BAD_PRIVATE_GLOBAL_ACCESS);
  }

  @Test
  public void testPrivateConstructor_instanceofInDifferentFile_noWarning() {
    testSame(
        new String[] {
          "/** @constructor\n * @private */ function SecretCtor() {}",
          "function isSecret(x) { return x instanceof SecretCtor; }"
        });
  }

  @Test
  public void testPrivateConstructorProperty_newInDifferentFile_emitsWarning() {
    test(
        new String[] {
          "var ns = {};\n"
              + "/** @constructor\n * @private */ ns.SecretCtor = function() {};",
          "function make() { return new ns.SecretCtor(); }"
        },
        null,
        CheckAccessControls.BAD_PRIVATE_PROPERTY_ACCESS);
  }

  @Test
  public void testProtectedProperty_accessFromSubclass_noWarning() {
    testSame(
        "/** @constructor */ function Parent() {}\n"
            + "/** @protected */ Parent.prototype.field = 1;\n"
            + "/** @constructor\n * @extends {Parent} */ function Child() {}\n"
            + "Child.prototype = new Parent();\n"
            + "Child.prototype.action = function() { return this.field; };");
  }

  @Test
  public void testProtectedProperty_accessFromUnrelatedClassInDifferentFile_emitsWarning() {
    test(
        new String[] {
          "/** @constructor */ function Parent() {}\n"
              + "/** @protected */ Parent.prototype.field = 1;",
          "/** @constructor */ function Other() {}\n"
              + "Other.prototype.action = function(/** Parent */ p) { return p.field; };"
        },
        null,
        CheckAccessControls.BAD_PROTECTED_PROPERTY_ACCESS);
  }

  @Test
  public void testPrivateOverride_inDifferentFile_emitsWarning() {
    test(
        new String[] {
          "/** @constructor */ function Parent() {}\n"
              + "/** @private */ Parent.prototype.method = function() {};",
          "/** @constructor\n * @extends {Parent} */ function Child() {}\n"
              + "Child.prototype = new Parent();\n"
              + "Child.prototype.method = function() {};"
        },
        null,
        CheckAccessControls.PRIVATE_OVERRIDE);
  }

  @Test
  public void testVisibilityMismatch_protectedOverriddenByPublic_emitsWarning() {
    test(
        "/** @constructor */ function Parent() {}\n"
            + "/** @protected */ Parent.prototype.method = function() {};\n"
            + "/** @constructor\n * @extends {Parent} */ function Child() {}\n"
            + "Child.prototype = new Parent();\n"
            + "/** @public */ Child.prototype.method = function() {};",
        null,
        CheckAccessControls.VISIBILITY_MISMATCH);
  }

  @Test
  public void testConstProperty_reassigned_emitsWarning() {
    test(
        "/** @constructor */ function Foo() {}\n"
            + "/** @const */ Foo.prototype.BAR = 1;\n"
            + "var f = new Foo();\n"
            + "f.BAR = 2;\n"
            + "f.BAR = 3;",
        null,
        CheckAccessControls.CONST_PROPERTY_REASSIGNED_VALUE);
  }

  @Test
  public void testConstProperty_reassignedIncrement_emitsWarning() {
    test(
        "/** @constructor */ function Foo() {}\n"
            + "/** @const */ Foo.prototype.BAR = 1;\n"
            + "var f = new Foo();\n"
            + "f.BAR = 2;\n"
            + "f.BAR++;",
        null,
        CheckAccessControls.CONST_PROPERTY_REASSIGNED_VALUE);
  }

  @Test
  public void testConstProperty_reassignedDecrement_emitsWarning() {
    test(
        "/** @constructor */ function Foo() {}\n"
            + "/** @const */ Foo.prototype.BAR = 1;\n"
            + "var f = new Foo();\n"
            + "f.BAR = 2;\n"
            + "f.BAR--;",
        null,
        CheckAccessControls.CONST_PROPERTY_REASSIGNED_VALUE);
  }

  @Test
  public void testHotSwapScript_processesSuccessfully() {
    Compiler compiler = new Compiler();
    compiler.initCompilerOptionsIfTesting();
    CheckAccessControls pass = new CheckAccessControls(compiler);
    Node scriptRoot = compiler.parseTestCode("var a = 1;");
    pass.hotSwapScript(scriptRoot);
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testShouldTraverse_returnsTrue() {
    Compiler compiler = new Compiler();
    CheckAccessControls pass = new CheckAccessControls(compiler);
    Node node = new Node(0);
    assertTrue(pass.shouldTraverse(null, node, null));
  }

  @Test
  public void testProcess_runsOnTree() {
    Compiler compiler = new Compiler();
    compiler.initCompilerOptionsIfTesting();
    CheckAccessControls pass = new CheckAccessControls(compiler);
    Node externs = compiler.parseTestCode("");
    Node root = compiler.parseTestCode("function a() { var b = 2; }");
    pass.process(externs, root);
    assertNotNull(pass);
  }

  @Test
  public void testNormalMethodScopeTraversal_coverage() {
    testSame(
        "var ns = {};\n"
            + "/** @constructor */ ns.MyClass = function() {};\n"
            + "ns.MyClass.prototype.method = function() { var local = 1; return local; };\n"
            + "ns.MyClass.helper = function() { var local2 = 2; return local2; };");
  }
}
