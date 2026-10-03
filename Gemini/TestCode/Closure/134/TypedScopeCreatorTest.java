package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Lists;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.ObjectType;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class TypedScopeCreatorTest {

  private Compiler compiler;
  private CodingConvention codingConvention;
  private TypedScopeCreator scopeCreator;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    codingConvention = new ClosureCodingConvention();
    scopeCreator = new TypedScopeCreator(compiler, codingConvention);
  }

  private Scope buildGlobalScope(String js) {
    Node root = compiler.parseTestCode(js);
    return scopeCreator.createScope(root, null);
  }

  private Scope buildGlobalScopeWithExterns(String externs, String js) {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    List<SourceFile> externInputs = Lists.newArrayList(SourceFile.fromCode("externs.js", externs));
    List<SourceFile> jsInputs = Lists.newArrayList(SourceFile.fromCode("input.js", js));
    compiler.init(externInputs, jsInputs, options);
    Node root = compiler.parseInputs();
    scopeCreator = new TypedScopeCreator(compiler, codingConvention);
    return scopeCreator.createScope(root, null);
  }

  private Node findNode(Node n, int tokenType, String name) {
    if (n.getType() == tokenType) {
      if (name == null) {
        return n;
      }
      if (n.getFirstChild() != null && name.equals(n.getFirstChild().getString())) {
        return n;
      }
      if (name.equals(n.getString())) {
        return n;
      }
    }
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      Node res = findNode(c, tokenType, name);
      if (res != null) {
        return res;
      }
    }
    return null;
  }

  @Test
  public void testConstructor_defaultCodingConvention() {
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    assertNotNull(creator);
  }

  @Test
  public void testCreateInitialScope_declaresNativeTypes() {
    Node root = compiler.parseTestCode("");
    Scope scope = scopeCreator.createInitialScope(root);

    assertNotNull(scope.getVar("Object"));
    assertNotNull(scope.getVar("Array"));
    assertNotNull(scope.getVar("Function"));
    assertNotNull(scope.getVar("Date"));
    assertNotNull(scope.getVar("RegExp"));
    assertNotNull(scope.getVar("Error"));
    assertNotNull(scope.getVar("EvalError"));
    assertNotNull(scope.getVar("RangeError"));
    assertNotNull(scope.getVar("ReferenceError"));
    assertNotNull(scope.getVar("SyntaxError"));
    assertNotNull(scope.getVar("TypeError"));
    assertNotNull(scope.getVar("URIError"));
    assertNotNull(scope.getVar("undefined"));
    assertNotNull(scope.getVar("goog.typedef"));
    assertNotNull(scope.getVar("ActiveXObject"));
  }

  @Test
  public void testGlobalScope_varDeclarations() {
    String js = "var a = 1;\n" +
                "/** @type {string} */ var b = 'test';\n" +
                "var c;\n";
    Scope scope = buildGlobalScope(js);

    assertTrue(scope.isDeclared("a", false));
    assertTrue(scope.isDeclared("b", false));
    assertTrue(scope.isDeclared("c", false));

    Scope.Var varB = scope.getVar("b");
    assertNotNull(varB.getType());
    assertTrue(varB.getType().isString());
  }

  @Test
  public void testGlobalScope_multipleVarDeclarationWarning() {
    String js = "/** @type {number} */ var a = 1, b = 2;";
    buildGlobalScope(js);
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testGlobalScope_functionDeclarationsAndProperties() {
    String js = "/** @constructor */ function Foo() {}\n" +
                "Foo.prototype.bar = function(x) { return x; };\n" +
                "/** @this {Foo} */ function initFoo() { this.prop = 123; }\n";
    Scope scope = buildGlobalScope(js);

    assertTrue(scope.isDeclared("Foo", false));
    assertTrue(scope.isDeclared("Foo.prototype", false));
    assertTrue(scope.isDeclared("initFoo", false));

    Scope.Var fooVar = scope.getVar("Foo");
    assertTrue(fooVar.getType().isConstructor());
  }

  @Test
  public void testGlobalScope_functionWithOverriddenMethod() {
    String js = "/** @constructor */ function Parent() {}\n" +
                "/** @param {number} x */ Parent.prototype.baz = function(x) {};\n" +
                "/** @constructor @extends {Parent} */ function Child() {}\n" +
                "goog.inherits(Child, Parent);\n" +
                "Child.prototype.baz = function(x) {};\n";
    Scope scope = buildGlobalScope(js);
    assertTrue(scope.isDeclared("Child", false));
  }

  @Test
  public void testGlobalScope_catchBlock() {
    String js = "try { var x = 1; } catch (e) { var y = e; }";
    Scope scope = buildGlobalScope(js);
    assertTrue(scope.isDeclared("e", false));
    assertTrue(scope.isDeclared("y", false));
  }

  @Test
  public void testGlobalScope_enumDeclarations() {
    String js = "/** @enum {number} */ var Numbers = { ONE: 1, TWO: 2 };\n" +
                "/** @enum {string} */ var EnumRef = Numbers;\n";
    Scope scope = buildGlobalScope(js);

    assertTrue(scope.isDeclared("Numbers", false));
    JSType type = scope.getVar("Numbers").getType();
    assertTrue(type instanceof EnumType);
  }

  @Test
  public void testGlobalScope_enumWarnings() {
    String js = "/** @enum {number} */ var DuplicateEnum = { A: 1, A: 2 };\n" +
                "/** @enum {number} */ var NonConstEnum = { a: 1 };\n" +
                "/** @enum {number} */ var InvalidEnum = 123;\n";
    buildGlobalScope(js);
    assertTrue(compiler.getWarningCount() >= 3);
  }

  @Test
  public void testGlobalScope_typedefs() {
    String js = "/** @typedef {number} */ var NumberTypedef;\n" +
                "var ns = {};\n" +
                "/** @typedef {string} */ ns.StringTypedef;\n" +
                "/** @typedef */ var BadTypedef;\n";
    Scope scope = buildGlobalScope(js);

    assertTrue(scope.isDeclared("NumberTypedef", false));
    assertTrue(compiler.getWarningCount() >= 1);
  }

  @Test
  public void testGlobalScope_oldStyleTypedef() {
    String js = "/** @typedef {boolean} */ goog.typedef = true;";
    buildGlobalScope(js);
    assertNotNull(compiler.getTypeRegistry().getType("goog.typedef"));
  }

  @Test
  public void testGlobalScope_singletonGetter() {
    String js = "/** @constructor */ function Singleton() {}\n" +
                "goog.addSingletonGetter(Singleton);\n";
    Scope scope = buildGlobalScope(js);
    assertTrue(scope.isDeclared("Singleton", false));
  }

  @Test
  public void testGlobalScope_delegateRelationship() {
    String js = "/** @constructor */ function BaseDelegate() {}\n" +
                "/** @constructor */ function SuperDelegate() {}\n" +
                "/** @constructor */ function Delegator() {}\n";
    Scope scope = buildGlobalScope(js);
    assertNotNull(scope);
  }

  @Test
  public void testGlobalScope_objectLiteralCast() {
    String js = "/** @constructor */ function TargetType() {}\n" +
                "goog.reflect.object(TargetType, { key: 'value' });\n" +
                "goog.reflect.object(NonExistentType, { key: 'value' });\n";
    buildGlobalScope(js);
    assertTrue(compiler.getWarningCount() >= 1);
  }

  @Test
  public void testGlobalScope_stubDeclarations() {
    String js = "var ns = {};\n" +
                "ns.stubProp;\n";
    Scope scope = buildGlobalScope(js);
    assertTrue(scope.isDeclared("ns.stubProp", false));
  }

  @Test
  public void testGlobalScope_redeclaredVariableWarning() {
    String js = "var a = 1; var a = 2;";
    buildGlobalScope(js);
  }

  @Test
  public void testGlobalScope_prototypeRedefinition() {
    String js = "function F() {}\n" +
                "F.prototype = { methodA: function() {} };\n";
    Scope scope = buildGlobalScope(js);
    assertTrue(scope.isDeclared("F", false));
  }

  @Test
  public void testLocalScope_parametersAndLocals() {
    String js = "/** @param {number} p1\n" +
                "  * @param {string} p2 */\n" +
                "function fn(p1, p2, p3) {\n" +
                "  var localVar = p1;\n" +
                "  function innerFn() {}\n" +
                "  try {} catch (localCatch) {}\n" +
                "}\n";
    Node root = compiler.parseTestCode(js);
    Scope globalScope = scopeCreator.createScope(root, null);

    Node fnNode = findNode(root, Token.FUNCTION, "fn");
    assertNotNull(fnNode);

    Scope localScope = scopeCreator.createScope(fnNode, globalScope);
    assertTrue(localScope.isLocal());
    assertTrue(localScope.isDeclared("p1", false));
    assertTrue(localScope.isDeclared("p2", false));
    assertTrue(localScope.isDeclared("p3", false));
    assertTrue(localScope.isDeclared("localVar", false));
    assertTrue(localScope.isDeclared("innerFn", false));
    assertTrue(localScope.isDeclared("localCatch", false));
  }

  @Test
  public void testLocalScope_bleedingFunction() {
    String js = "var outer = function bleeding(x) { return x; };";
    Node root = compiler.parseTestCode(js);
    Scope globalScope = scopeCreator.createScope(root, null);

    Node fnNode = findNode(root, Token.FUNCTION, "bleeding");
    assertNotNull(fnNode);

    Scope localScope = scopeCreator.createScope(fnNode, globalScope);
    assertTrue(localScope.isDeclared("bleeding", false));
  }

  @Test
  public void testExternsHandling() {
    String externs = "var extVar;\n" +
                     "/** @type {function(): void} */ function extFn() {}\n";
    String js = "var appVar = extVar;";
    Scope scope = buildGlobalScopeWithExterns(externs, js);

    assertTrue(scope.isDeclared("extVar", false));
    assertTrue(scope.isDeclared("extFn", false));
    assertTrue(scope.isDeclared("appVar", false));
  }

  @Test(expected = RuntimeException.class)
  public void testDefine_unexpectedTokenThrows() {
    Node script = compiler.parseTestCode("var a = 1;");
    Scope scope = scopeCreator.createScope(script, null);
    Node expr = new Node(Token.EXPR_RESULT);
    Node empty = new Node(Token.EMPTY);
    expr.addChildToFront(empty);
  }
}
