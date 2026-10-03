package com.google.javascript.jscomp;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

public class DevirtualizePrototypeMethodsTest {

  private Compiler createCompiler() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    return compiler;
  }

  private void testTransformation(String input, String expected) {
    Compiler compiler = createCompiler();
    Node externs = compiler.parseTestCode("");
    Node root = compiler.parseTestCode(input);

    DevirtualizePrototypeMethods pass = new DevirtualizePrototypeMethods(compiler);
    pass.process(externs, root);

    Node expectedRoot = compiler.parseTestCode(expected);
    String actualCode = compiler.toSource(root);
    String expectedCode = compiler.toSource(expectedRoot);

    Assert.assertEquals(expectedCode, actualCode);
  }

  private void testSame(String input) {
    testTransformation(input, input);
  }

  @Test
  public void testProcess_simplePrototypeMethod_rewritten() {
    String source =
        "function A() {}" +
        "A.prototype.foo = function(x) { return this.x + x; };" +
        "var a = new A();" +
        "a.foo(1);";
    String expected =
        "function A() {}" +
        "var JSCompiler_StaticMethods_foo = function(JSCompiler_StaticMethods_foo$self, x) {" +
        "  return JSCompiler_StaticMethods_foo$self.x + x;" +
        "};" +
        "var a = new A();" +
        "JSCompiler_StaticMethods_foo(a, 1);";
    testTransformation(source, expected);
  }

  @Test
  public void testProcess_multipleCalls_allRewritten() {
    String source =
        "function A() {}" +
        "A.prototype.foo = function(a, b) { return this.val + a + b; };" +
        "var x = new A();" +
        "x.foo(1, 2);" +
        "x.foo(3, 4);";
    String expected =
        "function A() {}" +
        "var JSCompiler_StaticMethods_foo = function(JSCompiler_StaticMethods_foo$self, a, b) {" +
        "  return JSCompiler_StaticMethods_foo$self.val + a + b;" +
        "};" +
        "var x = new A();" +
        "JSCompiler_StaticMethods_foo(x, 1, 2);" +
        "JSCompiler_StaticMethods_foo(x, 3, 4);";
    testTransformation(source, expected);
  }

  @Test
  public void testProcess_innerFunction_doesNotRewriteThisInInnerFunction() {
    String source =
        "function A() {}" +
        "A.prototype.foo = function() {" +
        "  var self = this;" +
        "  var fn = function() { return this.val; };" +
        "  return self.val;" +
        "};" +
        "var a = new A();" +
        "a.foo();";
    String expected =
        "function A() {}" +
        "var JSCompiler_StaticMethods_foo = function(JSCompiler_StaticMethods_foo$self) {" +
        "  var self = JSCompiler_StaticMethods_foo$self;" +
        "  var fn = function() { return this.val; };" +
        "  return self.val;" +
        "};" +
        "var a = new A();" +
        "JSCompiler_StaticMethods_foo(a);";
    testTransformation(source, expected);
  }

  @Test
  public void testProcess_varArgsFunction_notRewritten() {
    String source =
        "function A() {}" +
        "A.prototype.foo = function(x) { return arguments.length; };" +
        "var a = new A();" +
        "a.foo(1);";
    testSame(source);
  }

  @Test
  public void testProcess_unusedMethod_notRewritten() {
    String source =
        "function A() {}" +
        "A.prototype.foo = function(x) { return this.x; };";
    testSame(source);
  }

  @Test
  public void testProcess_methodPropertyReferencedOutsideCall_notRewritten() {
    String source =
        "function A() {}" +
        "A.prototype.foo = function(x) { return this.x; };" +
        "var a = new A();" +
        "var ref = a.foo;" +
        "a.foo(1);";
    testSame(source);
  }

  @Test
  public void testProcess_multipleDefinitionsOfSameMethodName_notRewritten() {
    String source =
        "function A() {}" +
        "A.prototype.foo = function() { return 1; };" +
        "function B() {}" +
        "B.prototype.foo = function() { return 2; };" +
        "var a = new A();" +
        "a.foo();";
    testSame(source);
  }

  @Test
  public void testProcess_methodDefinedInsideControlStructure_notRewritten() {
    String source =
        "function A() {}" +
        "if (true) {" +
        "  A.prototype.foo = function() { return 1; };" +
        "}" +
        "var a = new A();" +
        "a.foo();";
    testSame(source);
  }

  @Test
  public void testProcess_methodNotInGlobalScope_notRewritten() {
    String source =
        "function init() {" +
        "  function A() {}" +
        "  A.prototype.foo = function() { return 1; };" +
        "  var a = new A();" +
        "  a.foo();" +
        "}" +
        "init();";
    testSame(source);
  }

  @Test
  public void testProcess_nonPrototypeMethod_notRewritten() {
    String source =
        "var A = {};" +
        "A.foo = function(x) { return x; };" +
        "A.foo(1);";
    testSame(source);
  }

  @Test
  public void testProcess_inExterns_notRewritten() {
    Compiler compiler = createCompiler();
    String externsCode =
        "function A() {}" +
        "A.prototype.foo = function(x) {};";
    String jsCode =
        "var a = new A();" +
        "a.foo(1);";

    Node externs = compiler.parseTestCode(externsCode);
    Node root = compiler.parseTestCode(jsCode);

    DevirtualizePrototypeMethods pass = new DevirtualizePrototypeMethods(compiler);
    pass.process(externs, root);

    Node expectedRoot = compiler.parseTestCode(jsCode);
    Assert.assertEquals(compiler.toSource(expectedRoot), compiler.toSource(root));
  }

  @Test
  public void testProcess_withModuleGraph_dependentModule_rewritten() {
    Compiler compiler = createCompiler();
    JSModule m1 = new JSModule("m1");
    JSModule m2 = new JSModule("m2");
    m2.addDependency(m1);
    JSModule[] modules = new JSModule[]{m1, m2};
    JSModuleGraph moduleGraph = new JSModuleGraph(modules);

    CompilerInput input1 = new CompilerInput(
        SourceFile.fromCode("m1.js",
            "function A() {}\n" +
            "A.prototype.foo = function(x) { return this.x + x; };\n"));
    CompilerInput input2 = new CompilerInput(
        SourceFile.fromCode("m2.js",
            "var a = new A();\n" +
            "a.foo(1);\n"));

    m1.add(input1);
    m2.add(input2);

    CompilerOptions options = new CompilerOptions();
    compiler.initModules(
        Collections.<SourceFile>emptyList(),
        ImmutableList.of(m1, m2),
        options);

    Node root = compiler.parseInputs();
    Assert.assertNotNull(root);
    Node externs = new Node(Token.BLOCK);

    DevirtualizePrototypeMethods pass = new DevirtualizePrototypeMethods(compiler);
    pass.process(externs, root);

    String m2Source = compiler.toSource(input2.getAstRoot(compiler));
    Assert.assertTrue(m2Source.contains("JSCompiler_StaticMethods_foo(a, 1)"));
  }

  @Test
  public void testProcess_withModuleGraph_independentModule_notRewritten() {
    Compiler compiler = createCompiler();
    JSModule m1 = new JSModule("m1");
    JSModule m2 = new JSModule("m2");
    JSModule[] modules = new JSModule[]{m1, m2};
    JSModuleGraph moduleGraph = new JSModuleGraph(modules);

    CompilerInput input1 = new CompilerInput(
        SourceFile.fromCode("m1.js",
            "function A() {}\n" +
            "A.prototype.foo = function(x) { return this.x + x; };\n"));
    CompilerInput input2 = new CompilerInput(
        SourceFile.fromCode("m2.js",
            "var a = new A();\n" +
            "a.foo(1);\n"));

    m1.add(input1);
    m2.add(input2);

    CompilerOptions options = new CompilerOptions();
    compiler.initModules(
        Collections.<SourceFile>emptyList(),
        ImmutableList.of(m1, m2),
        options);

    Node root = compiler.parseInputs();
    Assert.assertNotNull(root);
    Node externs = new Node(Token.BLOCK);

    DevirtualizePrototypeMethods pass = new DevirtualizePrototypeMethods(compiler);
    pass.process(externs, root);

    String m2Source = compiler.toSource(input2.getAstRoot(compiler));
    Assert.assertTrue(m2Source.contains("a.foo(1)"));
  }

  @Test
  public void testProcess_withFunctionTypeRegistry_updatesFunctionType() {
    Compiler compiler = createCompiler();
    String js =
        "function A() {}\n" +
        "A.prototype.foo = function(x) { return this.x + x; };\n" +
        "var a = new A();\n" +
        "a.foo(1);\n";

    Node externs = compiler.parseTestCode("");
    Node root = compiler.parseTestCode(js);

    JSTypeRegistry registry = compiler.getTypeRegistry();
    ObjectType thisType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    FunctionType origFnType = registry.createFunctionType(
        numberType,
        ImmutableList.of(numberType)
    );

    Node scriptNode = root.getFirstChild();
    Node exprNode = scriptNode.getFirstChild().getNext();
    Node assignNode = exprNode.getFirstChild();
    Node fnNode = assignNode.getLastChild();
    fnNode.setJSType(origFnType);

    DevirtualizePrototypeMethods pass = new DevirtualizePrototypeMethods(compiler);
    pass.process(externs, root);

    JSType updatedType = fnNode.getJSType();
    Assert.assertNotNull(updatedType);
    Assert.assertTrue(updatedType.isFunctionType());
    FunctionType updatedFnType = (FunctionType) updatedType;
    Assert.assertEquals(2, Lists.newArrayList(updatedFnType.getParameters()).size());
  }

  @Test
  public void testProcess_emptyRoot_noException() {
    Compiler compiler = createCompiler();
    Node externs = compiler.parseTestCode("");
    Node root = compiler.parseTestCode("");

    DevirtualizePrototypeMethods pass = new DevirtualizePrototypeMethods(compiler);
    pass.process(externs, root);

    Assert.assertEquals("", compiler.toSource(root));
  }
}
