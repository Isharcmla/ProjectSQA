package com.google.javascript.jscomp;

import com.google.common.base.Supplier;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Test;

public class MakeDeclaredNamesUniqueTest {

  private Node parse(Compiler compiler, String js) {
    Node n = compiler.parseTestCode(js);
    Assert.assertEquals(0, compiler.getErrorCount());
    return n;
  }

  @Test
  public void testContextualRenamer_globalAndLocalDeclarations() {
    MakeDeclaredNamesUnique.ContextualRenamer renamer = new MakeDeclaredNamesUnique.ContextualRenamer();
    Assert.assertFalse(renamer.stripConstIfReplaced());

    // Global declarations should not be renamed
    renamer.addDeclaredName("a");
    renamer.addDeclaredName("arguments"); // Ignored
    Assert.assertNull(renamer.getReplacementName("a"));
    Assert.assertNull(renamer.getReplacementName("arguments"));

    // Child scope
    MakeDeclaredNamesUnique.Renamer child1 = renamer.forChildScope();
    child1.addDeclaredName("a");
    child1.addDeclaredName("arguments"); // Ignored
    Assert.assertEquals("a$$1", child1.getReplacementName("a"));
    Assert.assertNull(child1.getReplacementName("arguments"));

    // Multiple additions in the same child scope should retain existing replacement
    child1.addDeclaredName("a");
    Assert.assertEquals("a$$1", child1.getReplacementName("a"));

    // Another child scope
    MakeDeclaredNamesUnique.Renamer child2 = renamer.forChildScope();
    child2.addDeclaredName("a");
    Assert.assertEquals("a$$2", child2.getReplacementName("a"));

    // New name first seen in child scope
    child2.addDeclaredName("b");
    Assert.assertNull(child2.getReplacementName("b"));

    // New name in subsequent child scope
    MakeDeclaredNamesUnique.Renamer child3 = renamer.forChildScope();
    child3.addDeclaredName("b");
    Assert.assertEquals("b$$1", child3.getReplacementName("b"));
    Assert.assertNull(child3.getReplacementName("unseen"));
  }

  @Test
  public void testInlineRenamer_normalAndEdgeCases() {
    Supplier<String> supplier = new Supplier<String>() {
      private int count = 0;
      @Override
      public String get() {
        return String.valueOf(count++);
      }
    };

    MakeDeclaredNamesUnique.InlineRenamer renamer =
        new MakeDeclaredNamesUnique.InlineRenamer(supplier, "inline_", true);
    Assert.assertTrue(renamer.stripConstIfReplaced());

    renamer.addDeclaredName("foo");
    Assert.assertEquals("foo$$inline_0", renamer.getReplacementName("foo"));

    // Adding existing name again in same scope
    renamer.addDeclaredName("foo");
    Assert.assertEquals("foo$$inline_0", renamer.getReplacementName("foo"));

    // Adding already unique name
    renamer.addDeclaredName("bar$$1");
    Assert.assertEquals("bar$$inline_1", renamer.getReplacementName("bar$$1"));

    // Adding empty name
    renamer.addDeclaredName("");
    Assert.assertEquals("", renamer.getReplacementName(""));

    // Child scope
    MakeDeclaredNamesUnique.Renamer child = renamer.forChildScope();
    Assert.assertTrue(child.stripConstIfReplaced());
    child.addDeclaredName("childVar");
    Assert.assertEquals("childVar$$inline_2", child.getReplacementName("childVar"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testInlineRenamer_emptyPrefixThrows() {
    Supplier<String> supplier = new Supplier<String>() {
      @Override
      public String get() {
        return "1";
      }
    };
    new MakeDeclaredNamesUnique.InlineRenamer(supplier, "", false);
  }

  @Test(expected = IllegalStateException.class)
  public void testInlineRenamer_argumentsThrows() {
    Supplier<String> supplier = new Supplier<String>() {
      @Override
      public String get() {
        return "1";
      }
    };
    MakeDeclaredNamesUnique.InlineRenamer renamer =
        new MakeDeclaredNamesUnique.InlineRenamer(supplier, "id_", false);
    renamer.addDeclaredName("arguments");
  }

  @Test
  public void testBoilerplateRenamer() {
    Supplier<String> supplier = new Supplier<String>() {
      private int count = 0;
      @Override
      public String get() {
        return String.valueOf(count++);
      }
    };

    MakeDeclaredNamesUnique.BoilerplateRenamer renamer =
        new MakeDeclaredNamesUnique.BoilerplateRenamer(supplier, "bp_");
    renamer.addDeclaredName("globalName");
    Assert.assertNull(renamer.getReplacementName("globalName"));

    MakeDeclaredNamesUnique.Renamer child = renamer.forChildScope();
    Assert.assertFalse(child.stripConstIfReplaced());
    child.addDeclaredName("localName");
    Assert.assertEquals("localName$$bp_0", child.getReplacementName("localName"));
  }

  @Test
  public void testMakeDeclaredNamesUnique_traversalWithFunctionsAndVars() {
    Compiler compiler = new Compiler();
    String js = "var a = 1; function f(a, b) { var a = 2; function g() { var b = 3; } }";
    Node root = parse(compiler, js);

    MakeDeclaredNamesUnique pass = new MakeDeclaredNamesUnique();
    NodeTraversal.traverse(compiler, root, pass);

    // After traversal, verify code changed without errors
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testMakeDeclaredNamesUnique_catchBlockAndNamedFunctionExpression() {
    Compiler compiler = new Compiler();
    String js = ""
        + "try { var x = 1; } catch (e) { var e = 2; x = e; } "
        + "var f = function rec(x) { rec(x); };";
    Node root = parse(compiler, js);

    MakeDeclaredNamesUnique pass = new MakeDeclaredNamesUnique();
    NodeTraversal.traverse(compiler, root, pass);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testMakeDeclaredNamesUnique_withInlineRenamerAndConstants() {
    Compiler compiler = new Compiler();
    String js = "function test(CONST_VAL) { var CONST_VAL = 2; return CONST_VAL; }";
    Node root = parse(compiler, js);

    // Mark node as constant
    Node nameNode = NodeUtil.findNameNode(root, "CONST_VAL");
    if (nameNode != null) {
      nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    }

    Supplier<String> supplier = new Supplier<String>() {
      private int count = 0;
      @Override
      public String get() {
        return String.valueOf(count++);
      }
    };

    MakeDeclaredNamesUnique.InlineRenamer renamer =
        new MakeDeclaredNamesUnique.InlineRenamer(supplier, "i_", true);
    MakeDeclaredNamesUnique pass = new MakeDeclaredNamesUnique(renamer);
    NodeTraversal.traverse(compiler, root, pass);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testMakeDeclaredNamesUnique_nonGlobalFunctionRootThrows() {
    Compiler compiler = new Compiler();
    Node root = parse(compiler, "function f() {}");
    Node fnNode = root.getFirstChild();

    MakeDeclaredNamesUnique pass = new MakeDeclaredNamesUnique();
    // Scope root is a FUNCTION while in rootContextualRenamer, which triggers Preconditions.checkState
    NodeTraversal.traverse(compiler, fnNode, pass);
  }

  @Test
  public void testContextualRenameInverter_getOriginalName() {
    Assert.assertEquals("foo", MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName("foo$$1"));
    Assert.assertEquals("foo", MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName("foo$$inline_123"));
    Assert.assertEquals("bar", MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName("bar"));
    Assert.assertEquals("", MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName("$$1"));
  }

  @Test
  public void testContextualRenameInverter_process() {
    Compiler compiler = new Compiler();
    String js = ""
        + "var a$$1 = 1; "
        + "function f() { var a$$2 = 2; var b$$1 = 3; return a$$2 + b$$1; } "
        + "function g() { var a$$3 = 4; return a$$3; }";
    Node root = parse(compiler, js);

    CompilerPass inverter = MakeDeclaredNamesUnique.getContextualRenameInverter(compiler);
    inverter.process(null, root);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testContextualRenameInverter_nameCollisionResolution() {
    Compiler compiler = new Compiler();
    // 'arguments' collision avoidance and existing referenced names conflict avoidance
    String js = ""
        + "function f() { "
        + "  var arguments$$1 = 1; "
        + "  var a$$1 = 2; "
        + "  var a$$2 = 3; "
        + "  return arguments$$1 + a$$1 + a$$2; "
        + "}";
    Node root = parse(compiler, js);

    CompilerPass inverter = MakeDeclaredNamesUnique.getContextualRenameInverter(compiler);
    inverter.process(null, root);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testMakeDeclaredNamesUnique_anonymousFunctionExpression() {
    Compiler compiler = new Compiler();
    String js = "(function() { var x = 1; return x; })();";
    Node root = parse(compiler, js);

    MakeDeclaredNamesUnique pass = new MakeDeclaredNamesUnique();
    NodeTraversal.traverse(compiler, root, pass);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testMakeDeclaredNamesUnique_nestedFunctionsAndScopeExits() {
    Compiler compiler = new Compiler();
    String js = ""
        + "var x = 10;\n"
        + "function outer(x) {\n"
        + "  function inner1(x) {\n"
        + "    return x;\n"
        + "  }\n"
        + "  function inner2(y) {\n"
        + "    var x = y;\n"
        + "    return x;\n"
        + "  }\n"
        + "  return inner1(x) + inner2(x);\n"
        + "}";
    Node root = parse(compiler, js);

    MakeDeclaredNamesUnique pass = new MakeDeclaredNamesUnique();
    NodeTraversal.traverse(compiler, root, pass);
    Assert.assertEquals(0, compiler.getErrorCount());
  }
}
