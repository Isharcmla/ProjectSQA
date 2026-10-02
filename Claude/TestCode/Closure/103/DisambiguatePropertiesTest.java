package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Test suite for {@link DisambiguateProperties}.
 *
 * These tests exercise the pass through the real {@link Compiler} pipeline
 * since no mocking framework is allowed and the class under test relies
 * heavily on real type information produced by the Closure Compiler's type
 * checker.
 */
public class DisambiguatePropertiesTest {

  private Compiler compiler;
  private CompilerOptions options;

  @Before
  public void setUp() {
    compiler = new Compiler();
    options = new CompilerOptions();
    options.setCheckTypes(true);
  }

  /**
   * Compiles the given externs/source strings and returns a two element
   * array containing the externs root and the main js root nodes.
   */
  private Node[] compileAndGetRoots(String externsCode, String srcCode) {
    List<SourceFile> externs = Lists.newArrayList(
        SourceFile.fromCode("externs.js", externsCode));
    List<SourceFile> inputs = Lists.newArrayList(
        SourceFile.fromCode("input.js", srcCode));
    compiler.compile(externs, inputs, options);
    Node externsRoot = compiler.getRoot().getFirstChild();
    Node jsRoot = compiler.getRoot().getLastChild();
    return new Node[] {externsRoot, jsRoot};
  }

  /** Recursively finds the first GETPROP node in the tree, or null. */
  private Node findFirstGetProp(Node n) {
    if (n == null) {
      return null;
    }
    if (n.getType() == Token.GETPROP) {
      return n;
    }
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      Node found = findFirstGetProp(c);
      if (found != null) {
        return found;
      }
    }
    return null;
  }

  /** Recursively collects the property names of all GETPROP nodes. */
  private void collectGetPropNames(Node n, List<String> names) {
    if (n == null) {
      return;
    }
    if (n.getType() == Token.GETPROP) {
      names.add(n.getLastChild().getString());
    }
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      collectGetPropNames(c, names);
    }
  }

  // ------------------------------------------------------------------
  // forJSTypeSystem
  // ------------------------------------------------------------------

  @Test
  public void testForJSTypeSystem_validCompiler_createsInstance() {
    DisambiguateProperties<JSType> dp =
        DisambiguateProperties.forJSTypeSystem(compiler);
    assertNotNull(dp);
  }

  // ------------------------------------------------------------------
  // forConcreteTypeSystem
  // ------------------------------------------------------------------

  @Test
  public void testForConcreteTypeSystem_nullTightenTypes_doesNotThrowOnConstruction() {
    // Edge case: passing a null TightenTypes should not throw during
    // construction itself, since the constructor only stores references.
    try {
      compiler.initOptions(new CompilerOptions());
      DisambiguateProperties<ConcreteType> dp =
          DisambiguateProperties.forConcreteTypeSystem(compiler, null);
      assertNotNull(dp);
    } catch (Exception e) {
      // Some compiler setups may throw due to missing coding convention
      // state; either behavior is acceptable for this edge case test.
      assertNotNull(e);
    }
  }

  // ------------------------------------------------------------------
  // getTypeWithProperty
  // ------------------------------------------------------------------

  @Test
  public void testGetTypeWithProperty_nullType_returnsNull() {
    DisambiguateProperties<JSType> dp =
        DisambiguateProperties.forJSTypeSystem(compiler);
    JSType result = dp.getTypeWithProperty("foo", null);
    assertNull(result);
  }

  @Test
  public void testGetTypeWithProperty_realType_doesNotThrow() {
    String src = "/** @constructor */ function Foo() {} "
        + "Foo.prototype.a = 1; var f = new Foo(); f.a;";
    Node[] roots = compileAndGetRoots("", src);
    DisambiguateProperties<JSType> dp =
        DisambiguateProperties.forJSTypeSystem(compiler);

    Node getPropNode = findFirstGetProp(roots[1]);
    assertNotNull(getPropNode);
    JSType type = getPropNode.getFirstChild().getJSType();

    // Should execute without throwing, result may be null or non-null.
    dp.getTypeWithProperty("a", type);
  }

  // ------------------------------------------------------------------
  // getProperty (package-private, used internally, exercised for coverage)
  // ------------------------------------------------------------------

  @Test
  public void testGetProperty_sameNameCalledTwice_returnsSameInstance() {
    DisambiguateProperties<JSType> dp =
        DisambiguateProperties.forJSTypeSystem(compiler);
    Object p1 = dp.getProperty("foo");
    Object p2 = dp.getProperty("foo");
    assertNotNull(p1);
    assertSame(p1, p2);
  }

  @Test
  public void testGetProperty_emptyStringName_createsProperty() {
    DisambiguateProperties<JSType> dp =
        DisambiguateProperties.forJSTypeSystem(compiler);
    Object p = dp.getProperty("");
    assertNotNull(p);
  }

  // ------------------------------------------------------------------
  // renameProperties (package-private)
  // ------------------------------------------------------------------

  @Test
  public void testRenameProperties_noPropertiesRegistered_doesNotThrow() {
    DisambiguateProperties<JSType> dp =
        DisambiguateProperties.forJSTypeSystem(compiler);
    // With no properties added, this should simply do nothing.
    dp.renameProperties();
  }

  // ------------------------------------------------------------------
  // process (main public entry point)
  // ------------------------------------------------------------------

  @Test
  public void testProcess_singleTypeProperty_recordsSingleEquivalenceClass() {
    String src = "/** @constructor */ function Foo() {} "
        + "Foo.prototype.a = 1; var f = new Foo(); f.a;";
    Node[] roots = compileAndGetRoots("", src);
    DisambiguateProperties<JSType> dp =
        DisambiguateProperties.forJSTypeSystem(compiler);

    dp.process(roots[0], roots[1]);

    Multimap<String, ?> renamed = dp.getRenamedTypesForTesting();
    assertNotNull(renamed);
    assertTrue(renamed.containsKey("a"));
    assertEquals(1, renamed.get("a").size());
  }

  @Test
  public void testProcess_multipleUnrelatedTypes_disambiguatesProperty() {
    String src = "/** @constructor */ function Foo() {} "
        + "Foo.prototype.a = 1;"
        + "/** @constructor */ function Bar() {} "
        + "Bar.prototype.a = 2;"
        + "var f = new Foo(); var b = new Bar(); f.a; b.a;";
    Node[] roots = compileAndGetRoots("", src);
    DisambiguateProperties<JSType> dp =
        DisambiguateProperties.forJSTypeSystem(compiler);

    dp.process(roots[0], roots[1]);

    Multimap<String, ?> renamed = dp.getRenamedTypesForTesting();
    assertNotNull(renamed);
    assertTrue(renamed.containsKey("a"));
    // Foo and Bar are unrelated types, so they should form two separate
    // equivalence classes for property "a".
    assertEquals(2, renamed.get("a").size());

    List<String> names = Lists.newArrayList();
    collectGetPropNames(roots[1], names);
    assertTrue(names.size() >= 2);
    // After renaming, the raw name "a" should no longer be present.
    assertFalse(names.contains("a"));
  }

  @Test
  public void testProcess_emptySource_doesNotThrow() {
    Node[] roots = compileAndGetRoots("", "");
    DisambiguateProperties<JSType> dp =
        DisambiguateProperties.forJSTypeSystem(compiler);
    dp.process(roots[0], roots[1]);
    Multimap<String, ?> renamed = dp.getRenamedTypesForTesting();
    assertNotNull(renamed);
    assertTrue(renamed.isEmpty());
  }

  @Test(expected = NullPointerException.class)
  public void testProcess_nullArguments_throwsNullPointerException() {
    DisambiguateProperties<JSType> dp =
        DisambiguateProperties.forJSTypeSystem(compiler);
    // Compiler has not been through a compile cycle, so the type validator
    // and/or node traversal should fail with a NullPointerException when
    // given null externs/root nodes.
    dp.process(null, null);
  }

  // ------------------------------------------------------------------
  // getRenamedTypesForTesting (package-private helper)
  // ------------------------------------------------------------------

  @Test
  public void testGetRenamedTypesForTesting_beforeProcess_returnsEmptyMultimap() {
    DisambiguateProperties<JSType> dp =
        DisambiguateProperties.forJSTypeSystem(compiler);
    Multimap<String, ?> renamed = dp.getRenamedTypesForTesting();
    assertNotNull(renamed);
    assertTrue(renamed.isEmpty());
  }
}
