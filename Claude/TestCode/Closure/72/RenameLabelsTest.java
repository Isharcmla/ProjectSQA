package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.base.Supplier;
import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

/**
 * Unit tests for {@link RenameLabels}.
 *
 * NOTE: These tests rely on {@code Compiler#parseTestCode(String)} and
 * {@code Compiler#toSource(Node)} which are well known helper methods
 * available on the real {@code com.google.javascript.jscomp.Compiler}
 * implementation shipped with the Closure Compiler project. No mocking
 * framework is used; the real Compiler class is used directly since it is
 * a concrete implementation of {@code AbstractCompiler} living in the same
 * package.
 */
public class RenameLabelsTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  /**
   * A simple fixed-sequence supplier used to make label renaming
   * deterministic and independent from {@code DefaultNameSupplier}'s
   * internal {@code NameGenerator} implementation details.
   */
  private static class FixedSequenceSupplier implements Supplier<String> {
    private final List<String> names;
    private int index = 0;

    FixedSequenceSupplier(List<String> names) {
      this.names = names;
    }

    @Override
    public String get() {
      String result = names.get(index);
      index++;
      return result;
    }
  }

  // ---------------------------------------------------------------------
  // Normal / typical cases
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_singleReferencedLabel_renamesToFirstShortName() {
    String js = "outerLabel: { break outerLabel; }";
    Node script = compiler.parseTestCode(js);

    RenameLabels renameLabels = new RenameLabels(compiler);
    renameLabels.process(null, script);

    String output = compiler.toSource(script);

    // According to the documentation of RenameLabels, the first top level
    // label name generated is typically "a".
    assertTrue("Expected renamed label 'a:' in output but got: " + output,
        output.contains("a:"));
    assertTrue("Expected renamed break 'break a' in output but got: " + output,
        output.contains("break a"));
    assertFalse("Original label name should have been replaced",
        output.contains("outerLabel"));
  }

  @Test
  public void testProcess_multipleNestedReferencedLabels_useDifferentNames() {
    String js = "outer: { inner: { break outer; break inner; } }";
    Node script = compiler.parseTestCode(js);

    RenameLabels renameLabels = new RenameLabels(compiler);
    renameLabels.process(null, script);

    String output = compiler.toSource(script);

    assertTrue(output.contains("a:"));
    assertTrue(output.contains("b:"));
    assertTrue(output.contains("break a"));
    assertTrue(output.contains("break b"));
  }

  @Test
  public void testProcess_customSupplier_usesProvidedNamesInOrder() {
    String js = "outer: { inner: { break outer; break inner; } }";
    Node script = compiler.parseTestCode(js);

    FixedSequenceSupplier supplier =
        new FixedSequenceSupplier(java.util.Arrays.asList("zz1", "zz2", "zz3"));

    RenameLabels renameLabels = new RenameLabels(compiler, supplier, true);
    renameLabels.process(null, script);

    String output = compiler.toSource(script);

    assertTrue(output.contains("zz1:"));
    assertTrue(output.contains("zz2:"));
    assertTrue(output.contains("break zz1"));
    assertTrue(output.contains("break zz2"));
  }

  // ---------------------------------------------------------------------
  // Edge cases
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_unreferencedLabel_isRemoved() {
    String js = "unused: { var x = 1; }";
    Node script = compiler.parseTestCode(js);

    RenameLabels renameLabels = new RenameLabels(compiler);
    renameLabels.process(null, script);

    String output = compiler.toSource(script);

    // Since the label is never referenced by a break/continue it should be
    // stripped from the output entirely.
    assertFalse("Label should have been removed but output was: " + output,
        output.contains(":"));
    assertTrue(output.contains("x"));
  }

  @Test
  public void testProcess_removeUnusedFalse_labelStillRemovedDueToDeadFlag() {
    // NOTE: The `removeUnused` flag is stored on the instance but is never
    // actually consulted anywhere in the visitLabel()/visitBreakOrContinue()
    // logic of the class under test, so behavior is identical regardless of
    // its value. This test documents/asserts that current behavior.
    String js = "unused: { var y = 2; }";
    Node script = compiler.parseTestCode(js);

    RenameLabels renameLabels = new RenameLabels(
        compiler, new RenameLabels.DefaultNameSupplier(), false);
    renameLabels.process(null, script);

    String output = compiler.toSource(script);

    assertFalse(output.contains(":"));
    assertTrue(output.contains("y"));
  }

  @Test
  public void testProcess_emptyProgram_noLabelsNoExceptions() {
    String js = "";
    Node script = compiler.parseTestCode(js);

    RenameLabels renameLabels = new RenameLabels(compiler);
    renameLabels.process(null, script);

    String output = compiler.toSource(script);
    assertNotNull(output);
  }

  @Test
  public void testProcess_labelWithBlockBodyMergedAfterRemoval() {
    String js = "foo: { var a = 1; var b = 2; }";
    Node script = compiler.parseTestCode(js);

    RenameLabels renameLabels = new RenameLabels(compiler);
    renameLabels.process(null, script);

    String output = compiler.toSource(script);

    // Block should be merged/flattened once label wrapper is removed.
    assertFalse(output.contains("foo"));
    assertTrue(output.contains("a"));
    assertTrue(output.contains("b"));
  }

  @Test
  public void testProcess_labelOnLoopWithContinue_renamesContinueTarget() {
    String js = "outerLoop: for (var i = 0; i < 10; i++) { continue outerLoop; }";
    Node script = compiler.parseTestCode(js);

    RenameLabels renameLabels = new RenameLabels(compiler);
    renameLabels.process(null, script);

    String output = compiler.toSource(script);

    assertTrue(output.contains("a:"));
    assertTrue(output.contains("continue a"));
    assertFalse(output.contains("outerLoop"));
  }

  @Test
  public void testDefaultNameSupplier_get_returnsNonEmptyDistinctSequentialNames() {
    RenameLabels.DefaultNameSupplier supplier = new RenameLabels.DefaultNameSupplier();

    String first = supplier.get();
    String second = supplier.get();

    assertNotNull(first);
    assertFalse(first.isEmpty());
    assertNotNull(second);
    assertFalse(second.isEmpty());
    assertNotEquals("Sequential calls should generate distinct names",
        first, second);
  }

  @Test
  public void testConstructor_defaultConstructor_createsUsableInstance() {
    RenameLabels renameLabels = new RenameLabels(compiler);
    assertNotNull(renameLabels);

    // sanity: should be able to run process without throwing.
    Node script = compiler.parseTestCode("l: { break l; }");
    renameLabels.process(null, script);
    assertNotNull(compiler.toSource(script));
  }

  @Test
  public void testConstructor_withCustomSupplierAndFlag_createsUsableInstance() {
    Supplier<String> supplier = new FixedSequenceSupplier(
        java.util.Arrays.asList("q1", "q2"));
    RenameLabels renameLabels = new RenameLabels(compiler, supplier, false);
    assertNotNull(renameLabels);

    Node script = compiler.parseTestCode("m: { break m; }");
    renameLabels.process(null, script);
    String output = compiler.toSource(script);
    assertTrue(output.contains("q1"));
  }

  // ---------------------------------------------------------------------
  // Exception / invalid input cases
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_duplicateNestedLabelNames_throwsIllegalStateException() {
    // Two labels sharing the same name nested within the same (non-function)
    // scope will cause Preconditions.checkState(!current.renameMap.contains
    // Key(name)) inside shouldTraverse() to fail because the outer label's
    // entry has not yet been removed from the rename map when the inner,
    // duplicately named label is encountered.
    String js = "dup: { dup: { break dup; } }";
    Node script = compiler.parseTestCode(js);

    RenameLabels renameLabels = new RenameLabels(compiler);

    try {
      renameLabels.process(null, script);
      // If for some reason the underlying parser rejects/normalizes the
      // duplicate label before reaching our pass, we still want the test
      // to fail loudly so it can be revisited, rather than silently pass.
      fail("Expected IllegalStateException due to duplicate nested label names");
    } catch (IllegalStateException expected) {
      // expected behavior verified.
      assertNotNull(expected);
    }
  }

  @Test
  public void testProcess_nullRoot_throwsRuntimeException() {
    RenameLabels renameLabels = new RenameLabels(compiler);

    try {
      renameLabels.process(null, null);
      fail("Expected a RuntimeException (e.g. NullPointerException) when root is null");
    } catch (RuntimeException expected) {
      assertNotNull(expected);
    }
  }

  @Test
  public void testProcess_breakWithoutMatchingLabel_doesNotThrow() {
    // A break inside a loop without an explicit label target should not
    // interact with the label renaming logic at all (nameNode will be null
    // inside visitBreakOrContinue).
    String js = "for (var i = 0; i < 10; i++) { break; }";
    Node script = compiler.parseTestCode(js);

    RenameLabels renameLabels = new RenameLabels(compiler);
    renameLabels.process(null, script);

    String output = compiler.toSource(script);
    assertNotNull(output);
    assertTrue(output.contains("break"));
  }
}
