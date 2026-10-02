package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

public class CrossModuleMethodMotionTest {

  private CrossModuleMethodMotion.IdGenerator idGenerator;

  @Before
  public void setUp() {
    idGenerator = new CrossModuleMethodMotion.IdGenerator();
  }

  // ---------------------------------------------------------------------
  // IdGenerator tests
  // ---------------------------------------------------------------------

  @Test
  public void testIdGenerator_initialState_hasGeneratedAnyIdsFalse() {
    assertFalse(idGenerator.hasGeneratedAnyIds());
  }

  @Test
  public void testIdGenerator_newId_returnsSequentialIdsStartingAtZero() {
    assertEquals(0, idGenerator.newId());
    assertEquals(1, idGenerator.newId());
    assertEquals(2, idGenerator.newId());
  }

  @Test
  public void testIdGenerator_afterNewId_hasGeneratedAnyIdsTrue() {
    assertFalse(idGenerator.hasGeneratedAnyIds());
    idGenerator.newId();
    assertTrue(idGenerator.hasGeneratedAnyIds());
  }

  @Test
  public void testIdGenerator_multipleCalls_stateConsistent() {
    for (int i = 0; i < 5; i++) {
      assertEquals(i, idGenerator.newId());
    }
    assertTrue(idGenerator.hasGeneratedAnyIds());
  }

  @Test
  public void testIdGenerator_separateInstances_areIndependent() {
    CrossModuleMethodMotion.IdGenerator otherGenerator =
        new CrossModuleMethodMotion.IdGenerator();
    idGenerator.newId();
    idGenerator.newId();
    assertTrue(idGenerator.hasGeneratedAnyIds());
    assertFalse(otherGenerator.hasGeneratedAnyIds());
  }

  // ---------------------------------------------------------------------
  // Static constant tests
  // ---------------------------------------------------------------------

  @Test
  public void testStubMethodName_isNotNullOrEmpty() {
    assertNotNull(CrossModuleMethodMotion.STUB_METHOD_NAME);
    assertFalse(CrossModuleMethodMotion.STUB_METHOD_NAME.isEmpty());
    assertEquals("JSCompiler_stubMethod", CrossModuleMethodMotion.STUB_METHOD_NAME);
  }

  @Test
  public void testUnstubMethodName_isNotNullOrEmpty() {
    assertNotNull(CrossModuleMethodMotion.UNSTUB_METHOD_NAME);
    assertFalse(CrossModuleMethodMotion.UNSTUB_METHOD_NAME.isEmpty());
    assertEquals("JSCompiler_unstubMethod", CrossModuleMethodMotion.UNSTUB_METHOD_NAME);
  }

  @Test
  public void testStubDeclarations_containsExpectedSubstrings() {
    String declarations = CrossModuleMethodMotion.STUB_DECLARATIONS;
    assertNotNull(declarations);
    assertTrue(declarations.contains("JSCompiler_stubMap"));
    assertTrue(declarations.contains("JSCompiler_stubMethod"));
    assertTrue(declarations.contains("JSCompiler_unstubMethod"));
  }

  @Test
  public void testNullCommonModuleError_isNotNullAndHasCorrectKey() {
    assertNotNull(CrossModuleMethodMotion.NULL_COMMON_MODULE_ERROR);
    assertEquals(
        "JSC_INTERNAL_ERROR_MODULE_DEPEND",
        CrossModuleMethodMotion.NULL_COMMON_MODULE_ERROR.key);
  }

  // ---------------------------------------------------------------------
  // Constructor tests
  // ---------------------------------------------------------------------

  @Test
  public void testConstructor_validArgumentsCanModifyExternsFalse_createsInstance() {
    Compiler compiler = new Compiler();
    CrossModuleMethodMotion pass =
        new CrossModuleMethodMotion(compiler, idGenerator, false);
    assertNotNull(pass);
  }

  @Test
  public void testConstructor_validArgumentsCanModifyExternsTrue_createsInstance() {
    Compiler compiler = new Compiler();
    CrossModuleMethodMotion pass =
        new CrossModuleMethodMotion(compiler, idGenerator, true);
    assertNotNull(pass);
  }

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullCompiler_throwsNullPointerException() {
    new CrossModuleMethodMotion(null, idGenerator, false);
  }

  // ---------------------------------------------------------------------
  // process() tests
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_withUninitializedCompiler_moduleGraphNull_doesNotThrow() {
    // Without calling compiler.init(...) or compile(...), getModuleGraph()
    // returns null, so process() should simply return without doing any
    // work and without throwing an exception.
    Compiler compiler = new Compiler();
    CrossModuleMethodMotion pass =
        new CrossModuleMethodMotion(compiler, idGenerator, false);

    Node externRoot = IR.script();
    Node root = IR.script();

    // Should not throw since moduleGraph is expected to be null here.
    pass.process(externRoot, root);
  }

  @Test
  public void testProcess_withNullNodes_moduleGraphNull_doesNotThrow() {
    // Since moduleGraph is null for a freshly constructed Compiler,
    // the analyzer/moveMethods code path is never reached, so passing
    // null nodes should be a safe edge case and should not throw.
    Compiler compiler = new Compiler();
    CrossModuleMethodMotion pass =
        new CrossModuleMethodMotion(compiler, idGenerator, false);

    pass.process(null, null);
  }

  @Test
  public void testProcess_calledMultipleTimes_doesNotThrow() {
    Compiler compiler = new Compiler();
    CrossModuleMethodMotion pass =
        new CrossModuleMethodMotion(compiler, idGenerator, true);

    Node externRoot = IR.script();
    Node root = IR.script();

    // Calling process multiple times on an uninitialized compiler
    // (moduleGraph == null) should consistently be a no-op.
    pass.process(externRoot, root);
    pass.process(externRoot, root);
  }
}
