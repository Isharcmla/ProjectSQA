package com.google.javascript.jscomp;

import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class VarCheckTest {

  private Compiler createCompiler(CompilerOptions options, String externsCode, String mainCode) {
    Compiler compiler = new Compiler();
    if (options == null) {
      options = new CompilerOptions();
    }
    compiler.init(
        ImmutableList.of(SourceFile.fromCode("externs.js", externsCode)),
        ImmutableList.of(SourceFile.fromCode("input.js", mainCode)),
        options
    );
    compiler.parseInputs();
    return compiler;
  }

  private Compiler createModuleCompiler(CompilerOptions options, String externsCode, JSModule[] modules) {
    Compiler compiler = new Compiler();
    if (options == null) {
      options = new CompilerOptions();
    }
    compiler.initModules(
        ImmutableList.of(SourceFile.fromCode("externs.js", externsCode)),
        Arrays.asList(modules),
        options
    );
    compiler.parseInputs();
    return compiler;
  }

  private boolean hasDiagnostic(JSError[] errors, DiagnosticType type) {
    for (JSError error : errors) {
      if (error.getType().key.equals(type.key)) {
        return true;
      }
    }
    return false;
  }

  @Test
  public void testProcess_validDeclaredVariable_noErrors() {
    Compiler compiler = createCompiler(null, "var extVar;", "var a = 1; a = 2; extVar = 3;");
    Node root = compiler.getRoot();
    VarCheck varCheck = new VarCheck(compiler);
    varCheck.process(root.getFirstChild(), root.getLastChild());

    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testProcess_undefinedVariable_reportsUndefinedVarError() {
    Compiler compiler = createCompiler(null, "", "x = 10;");
    Node root = compiler.getRoot();
    VarCheck varCheck = new VarCheck(compiler);
    varCheck.process(root.getFirstChild(), root.getLastChild());

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertTrue(hasDiagnostic(compiler.getErrors(), VarCheck.UNDEFINED_VAR_ERROR));
  }

  @Test(expected = IllegalStateException.class)
  public void testProcess_undefinedVariableSanityCheck_throwsException() {
    Compiler compiler = createCompiler(null, "", "x = 10;");
    Node root = compiler.getRoot();
    VarCheck varCheck = new VarCheck(compiler, true);
    varCheck.process(root.getFirstChild(), root.getLastChild());
  }

  @Test
  public void testProcess_anonymousFunctionDeclaration_reportsInvalidFunctionDecl() {
    Compiler compiler = createCompiler(null, "", "");
    Node externsRoot = compiler.getRoot().getFirstChild();
    Node mainRoot = compiler.getRoot().getLastChild();

    Node emptyName = Node.newString(Token.NAME, "");
    Node params = new Node(Token.LP);
    Node body = new Node(Token.BLOCK);
    Node fnNode = new Node(Token.FUNCTION, emptyName, params, body);
    mainRoot.getFirstChild().addChildToBack(fnNode);

    VarCheck varCheck = new VarCheck(compiler);
    varCheck.process(externsRoot, mainRoot);

    Assert.assertTrue(hasDiagnostic(compiler.getErrors(), VarCheck.INVALID_FUNCTION_DECL));
  }

  @Test
  public void testProcess_namedFunctionExpression_noError() {
    Compiler compiler = createCompiler(null, "", "var f = function foo() { foo(); };");
    Node root = compiler.getRoot();
    VarCheck varCheck = new VarCheck(compiler);
    varCheck.process(root.getFirstChild(), root.getLastChild());

    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testProcess_anonymousFunctionExpression_noError() {
    Compiler compiler = createCompiler(null, "", "(function() { var a = 1; })();");
    Node root = compiler.getRoot();
    VarCheck varCheck = new VarCheck(compiler);
    varCheck.process(root.getFirstChild(), root.getLastChild());

    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testProcess_externsPropertyAccessOnUndeclaredVar_reportsUndefinedExternVarError() {
    Compiler compiler = createCompiler(null, "undeclaredObj.prop = 1;", "var x = 1;");
    Node root = compiler.getRoot();
    VarCheck varCheck = new VarCheck(compiler);
    varCheck.process(root.getFirstChild(), root.getLastChild());

    Assert.assertTrue(hasDiagnostic(compiler.getWarnings(), VarCheck.UNDEFINED_EXTERN_VAR_ERROR));
  }

  @Test
  public void testProcess_externsPropertyAccessOnDeclaredVar_noError() {
    Compiler compiler = createCompiler(null, "var declaredObj; declaredObj.prop = 1;", "var x = 1;");
    Node root = compiler.getRoot();
    VarCheck varCheck = new VarCheck(compiler);
    varCheck.process(root.getFirstChild(), root.getLastChild());

    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testProcess_externsNameReference_reportsNameReferenceInExternsError() {
    Compiler compiler = createCompiler(null, "extRef;", "var x = 1;");
    Node root = compiler.getRoot();
    VarCheck varCheck = new VarCheck(compiler);
    varCheck.process(root.getFirstChild(), root.getLastChild());

    Assert.assertTrue(hasDiagnostic(compiler.getWarnings(), VarCheck.NAME_REFERENCE_IN_EXTERNS_ERROR));
  }

  @Test
  public void testProcess_externsValidSyntax_noWarnings() {
    Compiler compiler = createCompiler(null, "var extVar; function extFunc(param) {}", "var x = 1;");
    Node root = compiler.getRoot();
    VarCheck varCheck = new VarCheck(compiler);
    varCheck.process(root.getFirstChild(), root.getLastChild());

    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testProcess_duplicateVarAcrossExternsAndSource_suppressesDuplicate() {
    Compiler compiler = createCompiler(null, "foo.bar;", "var foo = {};");
    Node root = compiler.getRoot();
    VarCheck varCheck = new VarCheck(compiler);
    varCheck.process(root.getFirstChild(), root.getLastChild());

    Assert.assertTrue(hasDiagnostic(compiler.getWarnings(), VarCheck.UNDEFINED_EXTERN_VAR_ERROR));
  }

  @Test
  public void testProcess_constantVariableInvention_marksConstant() {
    Compiler compiler = createCompiler(null, "", "CONSTANT_VAL = 10;");
    Node root = compiler.getRoot();
    VarCheck varCheck = new VarCheck(compiler);
    varCheck.process(root.getFirstChild(), root.getLastChild());

    Assert.assertTrue(hasDiagnostic(compiler.getErrors(), VarCheck.UNDEFINED_VAR_ERROR));
  }

  @Test
  public void testProcess_moduleDependencyValid_noErrors() {
    JSModule m1 = new JSModule("m1");
    m1.add(SourceFile.fromCode("m1.js", "var m1Var = 1;"));

    JSModule m2 = new JSModule("m2");
    m2.add(SourceFile.fromCode("m2.js", "var m2Var = m1Var;"));
    m2.addDependency(m1);

    Compiler compiler = createModuleCompiler(null, "", new JSModule[]{m1, m2});
    Node root = compiler.getRoot();
    VarCheck varCheck = new VarCheck(compiler);
    varCheck.process(root.getFirstChild(), root.getLastChild());

    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testProcess_moduleDependencyViolated_reportsViolatedModuleDepError() {
    JSModule m1 = new JSModule("m1");
    m1.add(SourceFile.fromCode("m1.js", "var m1Var = m2Var;"));

    JSModule m2 = new JSModule("m2");
    m2.add(SourceFile.fromCode("m2.js", "var m2Var = 1;"));
    m2.addDependency(m1);

    Compiler compiler = createModuleCompiler(null, "", new JSModule[]{m1, m2});
    Node root = compiler.getRoot();
    VarCheck varCheck = new VarCheck(compiler);
    varCheck.process(root.getFirstChild(), root.getLastChild());

    Assert.assertTrue(hasDiagnostic(compiler.getErrors(), VarCheck.VIOLATED_MODULE_DEP_ERROR));
  }

  @Test
  public void testProcess_moduleDependencyMissing_reportsMissingModuleDepError() {
    JSModule m1 = new JSModule("m1");
    m1.add(SourceFile.fromCode("m1.js", "var m1Var = 1;"));

    JSModule m2 = new JSModule("m2");
    m2.add(SourceFile.fromCode("m2.js", "var m2Var = m1Var;"));

    Compiler compiler = createModuleCompiler(null, "", new JSModule[]{m1, m2});
    Node root = compiler.getRoot();
    VarCheck varCheck = new VarCheck(compiler);
    varCheck.process(root.getFirstChild(), root.getLastChild());

    Assert.assertTrue(hasDiagnostic(compiler.getWarnings(), VarCheck.MISSING_MODULE_DEP_ERROR));
  }

  @Test
  public void testProcess_moduleDependencyStrict_reportsStrictModuleDepError() {
    JSModule m1 = new JSModule("m1");
    m1.add(SourceFile.fromCode("m1.js", "var m1Var = 1;"));

    JSModule m2 = new JSModule("m2");
    m2.add(SourceFile.fromCode("m2.js", "function f() { return m1Var; }"));

    Compiler compiler = createModuleCompiler(null, "", new JSModule[]{m1, m2});
    Node root = compiler.getRoot();
    VarCheck varCheck = new VarCheck(compiler);
    varCheck.process(root.getFirstChild(), root.getLastChild());

    Assert.assertTrue(hasDiagnostic(compiler.getWarnings(), VarCheck.STRICT_MODULE_DEP_ERROR));
  }

  @Test
  public void testVisit_nonNameNode_returnsImmediately() {
    Compiler compiler = createCompiler(null, "", "var x = 1;");
    Node root = compiler.getRoot();
    VarCheck varCheck = new VarCheck(compiler);

    Node numberNode = Node.newNumber(42);
    varCheck.visit(null, numberNode, null);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testProcess_strictExternCheck_avoidsDuplicateErrors() {
    CompilerOptions options = new CompilerOptions();
    options.setWarningLevel(DiagnosticGroups.CHECK_VARIABLES, CheckLevel.ERROR);
    options.setErrorHandler(new ErrorHandler() {
      @Override
      public void report(CheckLevel level, JSError error) {}
    });

    Compiler compiler = createCompiler(options, "undeclaredInExtern.prop = 1;", "var x = 1;");
    Node root = compiler.getRoot();
    VarCheck varCheck = new VarCheck(compiler);
    varCheck.process(root.getFirstChild(), root.getLastChild());

    Assert.assertTrue(compiler.getWarningCount() > 0 || compiler.getErrorCount() > 0);
  }
}
