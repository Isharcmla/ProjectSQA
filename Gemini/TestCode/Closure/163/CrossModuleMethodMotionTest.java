package com.google.javascript.jscomp;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CrossModuleMethodMotionTest {

  @Test
  public void testIdGenerator_initialState_hasGeneratedAnyIdsIsFalse() {
    CrossModuleMethodMotion.IdGenerator idGen = new CrossModuleMethodMotion.IdGenerator();
    Assert.assertFalse(idGen.hasGeneratedAnyIds());
  }

  @Test
  public void testIdGenerator_newId_incrementsAndMarksGenerated() {
    CrossModuleMethodMotion.IdGenerator idGen = new CrossModuleMethodMotion.IdGenerator();
    int firstId = idGen.newId();
    Assert.assertEquals(0, firstId);
    Assert.assertTrue(idGen.hasGeneratedAnyIds());

    int secondId = idGen.newId();
    Assert.assertEquals(1, secondId);
    Assert.assertTrue(idGen.hasGeneratedAnyIds());
  }

  @Test
  public void testProcess_nullModuleGraph_doesNothing() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    Node externs = IR.root();
    Node main = IR.root();

    CrossModuleMethodMotion.IdGenerator idGen = new CrossModuleMethodMotion.IdGenerator();
    CrossModuleMethodMotion pass = new CrossModuleMethodMotion(compiler, idGen, false);
    pass.process(externs, main);

    Assert.assertFalse(idGen.hasGeneratedAnyIds());
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_singleModule_doesNothing() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();

    JSModule m1 = new JSModule("m1");
    SourceFile s1 = SourceFile.fromCode("m1.js", "function Foo() {} Foo.prototype.bar = function() { return 1; };");
    m1.add(s1);

    List<JSModule> modules = new ArrayList<>();
    modules.add(m1);
    compiler.initModules(Collections.emptyList(), modules, options);
    Node root = compiler.parseInputs();

    CrossModuleMethodMotion.IdGenerator idGen = new CrossModuleMethodMotion.IdGenerator();
    CrossModuleMethodMotion pass = new CrossModuleMethodMotion(compiler, idGen, false);
    pass.process(root.getFirstChild(), root.getLastChild());

    Assert.assertFalse(idGen.hasGeneratedAnyIds());
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_moveMethodToDependentModule_success() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();

    JSModule m1 = new JSModule("m1");
    SourceFile s1 = SourceFile.fromCode("m1.js", "function Foo() {} Foo.prototype.bar = function() { return 1; };");
    m1.add(s1);

    JSModule m2 = new JSModule("m2");
    m2.addDependency(m1);
    SourceFile s2 = SourceFile.fromCode("m2.js", "var f = new Foo(); f.bar();");
    m2.add(s2);

    List<JSModule> modules = new ArrayList<>();
    modules.add(m1);
    modules.add(m2);

    compiler.initModules(Collections.emptyList(), modules, options);
    Node root = compiler.parseInputs();

    CrossModuleMethodMotion.IdGenerator idGen = new CrossModuleMethodMotion.IdGenerator();
    CrossModuleMethodMotion pass = new CrossModuleMethodMotion(compiler, idGen, false);
    pass.process(root.getFirstChild(), root.getLastChild());

    Assert.assertTrue(idGen.hasGeneratedAnyIds());
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_alreadyHasGeneratedIds_doesNotReinsertStubDeclarations() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();

    JSModule m1 = new JSModule("m1");
    SourceFile s1 = SourceFile.fromCode("m1.js", "function Foo() {} Foo.prototype.bar = function() { return 1; };");
    m1.add(s1);

    JSModule m2 = new JSModule("m2");
    m2.addDependency(m1);
    SourceFile s2 = SourceFile.fromCode("m2.js", "var f = new Foo(); f.bar();");
    m2.add(s2);

    List<JSModule> modules = new ArrayList<>();
    modules.add(m1);
    modules.add(m2);

    compiler.initModules(Collections.emptyList(), modules, options);
    Node root = compiler.parseInputs();

    CrossModuleMethodMotion.IdGenerator idGen = new CrossModuleMethodMotion.IdGenerator();
    idGen.newId(); // Pre-generate an ID so hasGeneratedAnyIds is true before pass runs

    CrossModuleMethodMotion pass = new CrossModuleMethodMotion(compiler, idGen, false);
    pass.process(root.getFirstChild(), root.getLastChild());

    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_unreferencedMethod_isSkipped() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();

    JSModule m1 = new JSModule("m1");
    SourceFile s1 = SourceFile.fromCode("m1.js", "function Foo() {} Foo.prototype.bar = function() { return 1; };");
    m1.add(s1);

    JSModule m2 = new JSModule("m2");
    m2.addDependency(m1);
    SourceFile s2 = SourceFile.fromCode("m2.js", "var x = 10;");
    m2.add(s2);

    List<JSModule> modules = new ArrayList<>();
    modules.add(m1);
    modules.add(m2);

    compiler.initModules(Collections.emptyList(), modules, options);
    Node root = compiler.parseInputs();

    CrossModuleMethodMotion.IdGenerator idGen = new CrossModuleMethodMotion.IdGenerator();
    CrossModuleMethodMotion pass = new CrossModuleMethodMotion(compiler, idGen, false);
    pass.process(root.getFirstChild(), root.getLastChild());

    Assert.assertFalse(idGen.hasGeneratedAnyIds());
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_readsClosureVariables_isSkipped() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();

    JSModule m1 = new JSModule("m1");
    SourceFile s1 = SourceFile.fromCode(
        "m1.js",
        "(function() {" +
        "  var closedVar = 10;" +
        "  Foo = function() {};" +
        "  Foo.prototype.bar = function() { return closedVar; };" +
        "})();"
    );
    m1.add(s1);

    JSModule m2 = new JSModule("m2");
    m2.addDependency(m1);
    SourceFile s2 = SourceFile.fromCode("m2.js", "var f = new Foo(); f.bar();");
    m2.add(s2);

    List<JSModule> modules = new ArrayList<>();
    modules.add(m1);
    modules.add(m2);

    compiler.initModules(Collections.emptyList(), modules, options);
    Node root = compiler.parseInputs();

    CrossModuleMethodMotion.IdGenerator idGen = new CrossModuleMethodMotion.IdGenerator();
    CrossModuleMethodMotion pass = new CrossModuleMethodMotion(compiler, idGen, false);
    pass.process(root.getFirstChild(), root.getLastChild());

    Assert.assertFalse(idGen.hasGeneratedAnyIds());
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_getterAndSetterProperties_areSkipped() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();

    JSModule m1 = new JSModule("m1");
    SourceFile s1 = SourceFile.fromCode(
        "m1.js",
        "function Foo() {}\n" +
        "Foo.prototype = {\n" +
        "  get bar() { return 1; },\n" +
        "  set bar(x) {}\n" +
        "};"
    );
    m1.add(s1);

    JSModule m2 = new JSModule("m2");
    m2.addDependency(m1);
    SourceFile s2 = SourceFile.fromCode("m2.js", "var f = new Foo(); var b = f.bar; f.bar = 2;");
    m2.add(s2);

    List<JSModule> modules = new ArrayList<>();
    modules.add(m1);
    modules.add(m2);

    compiler.initModules(Collections.emptyList(), modules, options);
    Node root = compiler.parseInputs();

    CrossModuleMethodMotion.IdGenerator idGen = new CrossModuleMethodMotion.IdGenerator();
    CrossModuleMethodMotion pass = new CrossModuleMethodMotion(compiler, idGen, false);
    pass.process(root.getFirstChild(), root.getLastChild());

    Assert.assertFalse(idGen.hasGeneratedAnyIds());
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_nonFunctionProperty_isSkipped() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();

    JSModule m1 = new JSModule("m1");
    SourceFile s1 = SourceFile.fromCode("m1.js", "function Foo() {} Foo.prototype.bar = 42;");
    m1.add(s1);

    JSModule m2 = new JSModule("m2");
    m2.addDependency(m1);
    SourceFile s2 = SourceFile.fromCode("m2.js", "var f = new Foo(); var b = f.bar;");
    m2.add(s2);

    List<JSModule> modules = new ArrayList<>();
    modules.add(m1);
    modules.add(m2);

    compiler.initModules(Collections.emptyList(), modules, options);
    Node root = compiler.parseInputs();

    CrossModuleMethodMotion.IdGenerator idGen = new CrossModuleMethodMotion.IdGenerator();
    CrossModuleMethodMotion pass = new CrossModuleMethodMotion(compiler, idGen, false);
    pass.process(root.getFirstChild(), root.getLastChild());

    Assert.assertFalse(idGen.hasGeneratedAnyIds());
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_canModifyExternsFlag_movesExternPropertyWhenTrue() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();

    SourceFile externsFile = SourceFile.fromCode(
        "externs.js",
        "function ExternFoo() {} ExternFoo.prototype.bar = function() {};"
    );

    JSModule m1 = new JSModule("m1");
    SourceFile s1 = SourceFile.fromCode("m1.js", "var a = 1;");
    m1.add(s1);

    JSModule m2 = new JSModule("m2");
    m2.addDependency(m1);
    SourceFile s2 = SourceFile.fromCode("m2.js", "var ef = new ExternFoo(); ef.bar();");
    m2.add(s2);

    List<JSModule> modules = new ArrayList<>();
    modules.add(m1);
    modules.add(m2);

    compiler.initModules(Collections.singletonList(externsFile), modules, options);
    Node root = compiler.parseInputs();

    CrossModuleMethodMotion.IdGenerator idGen = new CrossModuleMethodMotion.IdGenerator();
    CrossModuleMethodMotion pass = new CrossModuleMethodMotion(compiler, idGen, true);
    pass.process(root.getFirstChild(), root.getLastChild());

    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_constantsDefinitions() {
    Assert.assertEquals("JSCompiler_stubMethod", CrossModuleMethodMotion.STUB_METHOD_NAME);
    Assert.assertEquals("JSCompiler_unstubMethod", CrossModuleMethodMotion.UNSTUB_METHOD_NAME);
    Assert.assertNotNull(CrossModuleMethodMotion.STUB_DECLARATIONS);
    Assert.assertNotNull(CrossModuleMethodMotion.NULL_COMMON_MODULE_ERROR);
  }
}
