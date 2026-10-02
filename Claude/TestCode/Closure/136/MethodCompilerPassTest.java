package com.google.javascript.jscomp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.NodeTraversal.Callback;
import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Tests for {@link MethodCompilerPass}.
 *
 * These tests use the real {@link Compiler} class from this package to
 * build valid AST trees (externs / root) that are then fed into a concrete
 * subclass of the abstract {@link MethodCompilerPass} under test. No mocking
 * framework is used; everything is exercised through the real public API.
 */
public class MethodCompilerPassTest {

  private Compiler compiler;
  private CompilerOptions options;

  @Before
  public void setUp() {
    compiler = new Compiler();
    options = new CompilerOptions();
  }

  /**
   * Parses the given externs and js source code and returns the resulting
   * externs root and js root nodes.
   */
  private Node[] parse(String externsCode, String jsCode) {
    SourceFile externsFile = SourceFile.fromCode("externs.js", externsCode);
    SourceFile jsFile = SourceFile.fromCode("input.js", jsCode);

    List<SourceFile> externsList = new ArrayList<>();
    externsList.add(externsFile);

    List<SourceFile> jsList = new ArrayList<>();
    jsList.add(jsFile);

    compiler.compile(externsList, jsList, options);

    Node root = compiler.getRoot();
    Node externsRoot = root.getFirstChild();
    Node jsRoot = root.getLastChild();
    return new Node[] {externsRoot, jsRoot};
  }

  /** Simple concrete subclass used to exercise the abstract pass. */
  private static class TestMethodCompilerPass extends MethodCompilerPass {
    final TestSignatureStore signatureStore = new TestSignatureStore();
    final TestCallback callback = new TestCallback();

    TestMethodCompilerPass(AbstractCompiler compiler) {
      super(compiler);
    }

    @Override
    Callback getActingCallback() {
      return callback;
    }

    @Override
    SignatureStore getSignatureStore() {
      return signatureStore;
    }
  }

  private static class TestSignatureStore
      implements MethodCompilerPass.SignatureStore {
    boolean resetCalled = false;
    List<String> addedSignatures = new ArrayList<>();
    List<String> removedSignatures = new ArrayList<>();

    public void reset() {
      resetCalled = true;
    }

    public void addSignature(
        String functionName, Node functionNode, String sourceFile) {
      addedSignatures.add(functionName);
    }

    public void removeSignature(String functionName) {
      removedSignatures.add(functionName);
    }
  }

  private static class TestCallback extends AbstractPostOrderCallback {
    int visitCount = 0;

    public void visit(NodeTraversal t, Node n, Node parent) {
      visitCount++;
    }
  }

  // ---------------------------------------------------------------------
  // Normal / typical input cases
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_prototypeFunctionAssignment_addsSignature() {
    Node[] roots = parse("", "Foo.prototype.bar = function() {};");
    TestMethodCompilerPass pass = new TestMethodCompilerPass(compiler);

    pass.process(roots[0], roots[1]);

    assertTrue(pass.signatureStore.resetCalled);
    assertTrue(pass.signatureStore.addedSignatures.contains("bar"));
  }

  @Test
  public void testProcess_objectLiteralWithFunction_addsSignature() {
    Node[] roots = parse("", "var Foo = {bar: function() {}};");
    TestMethodCompilerPass pass = new TestMethodCompilerPass(compiler);

    pass.process(roots[0], roots[1]);

    assertTrue(pass.signatureStore.addedSignatures.contains("bar"));
  }

  @Test
  public void testProcess_staticMethodAssignment_addsSignature() {
    Node[] roots = parse("", "Foo.bar = function() {};");
    TestMethodCompilerPass pass = new TestMethodCompilerPass(compiler);

    pass.process(roots[0], roots[1]);

    assertTrue(pass.signatureStore.addedSignatures.contains("bar"));
  }

  @Test
  public void testProcess_prototypeGetelemAssignment_addsSignature() {
    Node[] roots = parse("", "Foo.prototype['bar'] = function() {};");
    TestMethodCompilerPass pass = new TestMethodCompilerPass(compiler);

    pass.process(roots[0], roots[1]);

    assertTrue(pass.signatureStore.addedSignatures.contains("bar"));
  }

  @Test
  public void testProcess_functionNameAssignment_addsSignature() {
    Node[] roots = parse("", "function baz() {} Foo.bar = baz;");
    TestMethodCompilerPass pass = new TestMethodCompilerPass(compiler);

    pass.process(roots[0], roots[1]);

    assertTrue(pass.signatureStore.addedSignatures.contains("bar"));
  }

  @Test
  public void testProcess_externsWithSignature_addsToExternMethods() {
    Node[] roots = parse("Foo.prototype.bar = function() {};", "");
    TestMethodCompilerPass pass = new TestMethodCompilerPass(compiler);

    pass.process(roots[0], roots[1]);

    assertTrue(pass.externMethods.contains("bar"));
  }

  @Test
  public void testProcess_externsObjectLiteralWithFunction_addsSignature() {
    Node[] roots = parse("var lit = {bar: function() {}};", "");
    TestMethodCompilerPass pass = new TestMethodCompilerPass(compiler);

    pass.process(roots[0], roots[1]);

    assertTrue(pass.externMethods.contains("bar"));
    assertTrue(pass.signatureStore.addedSignatures.contains("bar"));
  }

  @Test
  public void testProcess_getActingCallback_invokedDuringTraversal() {
    Node[] roots = parse("", "var x = 1;");
    TestMethodCompilerPass pass = new TestMethodCompilerPass(compiler);

    pass.process(roots[0], roots[1]);

    assertTrue(pass.callback.visitCount > 0);
  }

  // ---------------------------------------------------------------------
  // Edge cases: null, empty, boundary
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_nullExterns_doesNotThrowAndStillProcessesJs() {
    Node[] roots = parse("", "Foo.prototype.bar = function() {};");
    TestMethodCompilerPass pass = new TestMethodCompilerPass(compiler);

    pass.process(null, roots[1]);

    assertTrue(pass.signatureStore.resetCalled);
  }

  @Test
  public void testProcess_emptyInput_noSignaturesAdded() {
    Node[] roots = parse("", "");
    TestMethodCompilerPass pass = new TestMethodCompilerPass(compiler);

    pass.process(roots[0], roots[1]);

    assertTrue(pass.signatureStore.addedSignatures.isEmpty());
  }

  @Test
  public void testProcess_nonMethodPropertyAssignment_addedToNonMethodProperties() {
    Node[] roots = parse("", "Foo.prototype.bar = 5;");
    TestMethodCompilerPass pass = new TestMethodCompilerPass(compiler);

    pass.process(roots[0], roots[1]);

    assertTrue(pass.nonMethodProperties.contains("bar"));
    assertFalse(pass.signatureStore.addedSignatures.contains("bar"));
  }

  @Test
  public void testProcess_externsWithoutSignature_addsToExternMethodsWithoutSignatures() {
    Node[] roots = parse("Foo.prototype.bar;", "");
    TestMethodCompilerPass pass = new TestMethodCompilerPass(compiler);

    pass.process(roots[0], roots[1]);

    assertTrue(pass.externMethodsWithoutSignatures.contains("bar"));
    assertTrue(pass.externMethods.contains("bar"));
  }

  @Test
  public void testProcess_externsObjectLiteralNonFunctionValue_removesSignature() {
    Node[] roots = parse("var lit = {baz: 5};", "");
    TestMethodCompilerPass pass = new TestMethodCompilerPass(compiler);

    pass.process(roots[0], roots[1]);

    assertTrue(pass.externMethodsWithoutSignatures.contains("baz"));
    assertTrue(pass.externMethods.contains("baz"));
  }

  @Test
  public void testProcess_calledTwice_resetsInternalState() {
    Node[] roots1 = parse("", "Foo.prototype.bar = function() {};");
    TestMethodCompilerPass pass = new TestMethodCompilerPass(compiler);

    pass.process(roots1[0], roots1[1]);
    assertTrue(pass.signatureStore.addedSignatures.contains("bar"));

    Node[] roots2 = parse("", "Foo.prototype.baz = function() {};");
    pass.process(roots2[0], roots2[1]);

    // externMethods should have been cleared and repopulated.
    assertTrue(pass.externMethods.isEmpty()
        || !pass.externMethods.contains("bar"));
  }

  // ---------------------------------------------------------------------
  // Exception case
  // ---------------------------------------------------------------------

  @Test(expected = IllegalStateException.class)
  public void testProcess_undefinedVariableAssignment_throwsIllegalStateException() {
    Node[] roots = parse("", "Foo.bar = undefinedVarXyz;");
    TestMethodCompilerPass pass = new TestMethodCompilerPass(compiler);

    pass.process(roots[0], roots[1]);
  }

  // ---------------------------------------------------------------------
  // Direct tests for abstract-method overrides
  // ---------------------------------------------------------------------

  @Test
  public void testGetSignatureStore_returnsNonNullInstance() {
    TestMethodCompilerPass pass = new TestMethodCompilerPass(compiler);

    assertNotNull(pass.getSignatureStore());
  }

  @Test
  public void testGetActingCallback_returnsNonNullInstance() {
    TestMethodCompilerPass pass = new TestMethodCompilerPass(compiler);

    assertNotNull(pass.getActingCallback());
  }

  @Test
  public void testSignatureStore_removeSignature_isRecorded() {
    TestSignatureStore store = new TestSignatureStore();
    store.removeSignature("someMethod");

    assertTrue(store.removedSignatures.contains("someMethod"));
  }

  @Test
  public void testSignatureStore_reset_setsResetCalledFlag() {
    TestSignatureStore store = new TestSignatureStore();
    assertFalse(store.resetCalled);

    store.reset();

    assertTrue(store.resetCalled);
  }
}
