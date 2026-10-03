package com.google.javascript.jscomp;

import com.google.common.collect.Lists;
import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Set;

public class LiveVariablesAnalysisTest {

  private static class AnalysisHelper {
    final Compiler compiler;
    final Node root;
    final Node functionNode;
    final Scope scope;
    final ControlFlowGraph<Node> cfg;
    final LiveVariablesAnalysis analysis;

    AnalysisHelper(String js) {
      this.compiler = new Compiler();
      CompilerOptions options = new CompilerOptions();
      compiler.initOptions(options);
      this.root = compiler.parseSyntheticCode("test", js);

      Node fn = findFunction(root);
      if (fn != null) {
        this.functionNode = fn;
      } else {
        this.functionNode = root;
      }

      SyntacticScopeCreator scopeCreator = new SyntacticScopeCreator(compiler);
      Scope globalScope = scopeCreator.createScope(root, null);

      if (this.functionNode != root) {
        this.scope = scopeCreator.createScope(this.functionNode, globalScope);
      } else {
        this.scope = globalScope;
      }

      ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false, true);
      cfa.process(null, this.functionNode.isFunction() ? this.functionNode.getLastChild() : this.functionNode);
      this.cfg = cfa.getCfg();

      this.analysis = new LiveVariablesAnalysis(this.cfg, this.scope, this.compiler);
    }

    private static Node findFunction(Node n) {
      if (n.isFunction()) {
        return n;
      }
      for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
        Node res = findFunction(c);
        if (res != null) {
          return res;
        }
      }
      return null;
    }
  }

  @Test
  public void testLatticeEqualsAndHashCode() {
    AnalysisHelper helper = new AnalysisHelper("function f(a, b) { var c = 1; }");
    LiveVariableLattice lattice1 = helper.analysis.createEntryLattice();
    LiveVariableLattice lattice2 = helper.analysis.createInitialEstimateLattice();

    Assert.assertEquals(lattice1, lattice2);
    Assert.assertEquals(lattice1.hashCode(), lattice2.hashCode());
    Assert.assertNotEquals(lattice1, "not a lattice");

    Var varA = helper.scope.getVar("a");
    Assert.assertFalse(lattice1.isLive(varA));
    Assert.assertFalse(lattice1.isLive(varA.index));
    Assert.assertNotNull(lattice1.toString());
  }

  @Test(expected = NullPointerException.class)
  public void testLatticeEquals_nullInput_throwsException() {
    AnalysisHelper helper = new AnalysisHelper("function f(a) {}");
    LiveVariableLattice lattice = helper.analysis.createEntryLattice();
    lattice.equals(null);
  }

  @Test(expected = NullPointerException.class)
  public void testLatticeIsLive_nullVar_throwsException() {
    AnalysisHelper helper = new AnalysisHelper("function f(a) {}");
    LiveVariableLattice lattice = helper.analysis.createEntryLattice();
    lattice.isLive((Var) null);
  }

  @Test
  public void testIsForward_returnsFalse() {
    AnalysisHelper helper = new AnalysisHelper("function f(a) {}");
    Assert.assertFalse(helper.analysis.isForward());
  }

  @Test
  public void testGetVarIndex() {
    AnalysisHelper helper = new AnalysisHelper("function f(x, y) { var z = 10; }");
    int indexX = helper.analysis.getVarIndex("x");
    int indexY = helper.analysis.getVarIndex("y");
    int indexZ = helper.analysis.getVarIndex("z");

    Assert.assertTrue(indexX >= 0);
    Assert.assertTrue(indexY >= 0);
    Assert.assertTrue(indexZ >= 0);
    Assert.assertNotEquals(indexX, indexY);
  }

  @Test
  public void testJoinOp_multipleLattices() {
    AnalysisHelper helper = new AnalysisHelper("function f(a, b) { var c = 1; }");
    LiveVariablesAnalysis analysis = helper.analysis;

    LiveVariableLattice lat1 = analysis.createEntryLattice();
    LiveVariableLattice lat2 = analysis.createEntryLattice();
    Node nameA = Node.newString(Token.NAME, "a");

    LiveVariableLattice afterGenA = analysis.flowThrough(nameA, lat1);
    Assert.assertTrue(afterGenA.isLive(helper.scope.getVar("a")));
    Assert.assertFalse(afterGenA.isLive(helper.scope.getVar("b")));

    Node nameB = Node.newString(Token.NAME, "b");
    LiveVariableLattice afterGenB = analysis.flowThrough(nameB, lat2);
    Assert.assertTrue(afterGenB.isLive(helper.scope.getVar("b")));

    List<LiveVariableLattice> lattices = Lists.newArrayList(afterGenA, afterGenB);
    LiveVariableLattice joined = analysis.getJoinOp().apply(lattices);

    Assert.assertTrue(joined.isLive(helper.scope.getVar("a")));
    Assert.assertTrue(joined.isLive(helper.scope.getVar("b")));
  }

  @Test
  public void testFlowThrough_scriptBlockFunction_noChange() {
    AnalysisHelper helper = new AnalysisHelper("function f(a) { var b = 1; }");
    LiveVariableLattice input = helper.analysis.createEntryLattice();

    Node scriptNode = new Node(Token.SCRIPT);
    Node blockNode = new Node(Token.BLOCK);
    Node fnNode = new Node(Token.FUNCTION);

    LiveVariableLattice out1 = helper.analysis.flowThrough(scriptNode, input);
    LiveVariableLattice out2 = helper.analysis.flowThrough(blockNode, input);
    LiveVariableLattice out3 = helper.analysis.flowThrough(fnNode, input);

    Assert.assertEquals(input, out1);
    Assert.assertEquals(input, out2);
    Assert.assertEquals(input, out3);
  }

  @Test
  public void testFlowThrough_whileDoIfCondition() {
    AnalysisHelper helper = new AnalysisHelper("function f(cond, a, b) { var c = 1; }");
    LiveVariableLattice input = helper.analysis.createEntryLattice();

    Node ifNode = new Node(Token.IF, Node.newString(Token.NAME, "cond"), new Node(Token.BLOCK));
    LiveVariableLattice outIf = helper.analysis.flowThrough(ifNode, input);
    Assert.assertTrue(outIf.isLive(helper.scope.getVar("cond")));

    Node whileNode = new Node(Token.WHILE, Node.newString(Token.NAME, "a"), new Node(Token.BLOCK));
    LiveVariableLattice outWhile = helper.analysis.flowThrough(whileNode, input);
    Assert.assertTrue(outWhile.isLive(helper.scope.getVar("a")));

    Node doNode = new Node(Token.DO, new Node(Token.BLOCK), Node.newString(Token.NAME, "b"));
    LiveVariableLattice outDo = helper.analysis.flowThrough(doNode, input);
    Assert.assertTrue(outDo.isLive(helper.scope.getVar("b")));
  }

  @Test
  public void testFlowThrough_forLoops() {
    AnalysisHelper helper = new AnalysisHelper("function f(arr, obj, k, x) { var y = 0; }");
    LiveVariableLattice input = helper.analysis.createEntryLattice();

    // Standard for: for (var y = 0; x < 10; x++)
    Node standardFor = new Node(Token.FOR,
        new Node(Token.EMPTY),
        Node.newString(Token.NAME, "x"),
        new Node(Token.EMPTY),
        new Node(Token.BLOCK));
    LiveVariableLattice outStdFor = helper.analysis.flowThrough(standardFor, input);
    Assert.assertTrue(outStdFor.isLive(helper.scope.getVar("x")));

    // For-in without var: for (k in obj)
    Node forInNoVar = new Node(Token.FOR,
        Node.newString(Token.NAME, "k"),
        Node.newString(Token.NAME, "obj"),
        new Node(Token.BLOCK));
    LiveVariableLattice outForInNoVar = helper.analysis.flowThrough(forInNoVar, input);
    Assert.assertTrue(outForInNoVar.isLive(helper.scope.getVar("k")));
    Assert.assertTrue(outForInNoVar.isLive(helper.scope.getVar("obj")));

    // For-in with var: for (var y in obj)
    Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "y"));
    Node forInWithVar = new Node(Token.FOR,
        varNode,
        Node.newString(Token.NAME, "obj"),
        new Node(Token.BLOCK));
    LiveVariableLattice outForInWithVar = helper.analysis.flowThrough(forInWithVar, input);
    Assert.assertTrue(outForInWithVar.isLive(helper.scope.getVar("y")));
    Assert.assertTrue(outForInWithVar.isLive(helper.scope.getVar("obj")));
  }

  @Test
  public void testFlowThrough_varDeclarationWithAndWithoutInit() {
    AnalysisHelper helper = new AnalysisHelper("function f(a, b) { var x = a, y; }");
    LiveVariableLattice input = helper.analysis.createEntryLattice();

    Node varNode = new Node(Token.VAR);
    Node nameX = Node.newString(Token.NAME, "x");
    nameX.addChildToBack(Node.newString(Token.NAME, "a"));
    Node nameY = Node.newString(Token.NAME, "y");
    varNode.addChildToBack(nameX);
    varNode.addChildToBack(nameY);

    LiveVariableLattice out = helper.analysis.flowThrough(varNode, input);
    Assert.assertTrue(out.isLive(helper.scope.getVar("a")));
    Assert.assertFalse(out.isLive(helper.scope.getVar("x")));
  }

  @Test
  public void testFlowThrough_andOrHook() {
    AnalysisHelper helper = new AnalysisHelper("function f(a, b, c) {}");
    LiveVariableLattice input = helper.analysis.createEntryLattice();

    Node andNode = new Node(Token.AND,
        Node.newString(Token.NAME, "a"),
        Node.newString(Token.NAME, "b"));
    LiveVariableLattice outAnd = helper.analysis.flowThrough(andNode, input);
    Assert.assertTrue(outAnd.isLive(helper.scope.getVar("a")));
    Assert.assertTrue(outAnd.isLive(helper.scope.getVar("b")));

    Node orNode = new Node(Token.OR,
        Node.newString(Token.NAME, "a"),
        Node.newString(Token.NAME, "b"));
    LiveVariableLattice outOr = helper.analysis.flowThrough(orNode, input);
    Assert.assertTrue(outOr.isLive(helper.scope.getVar("a")));
    Assert.assertTrue(outOr.isLive(helper.scope.getVar("b")));

    Node hookNode = new Node(Token.HOOK,
        Node.newString(Token.NAME, "a"),
        Node.newString(Token.NAME, "b"),
        Node.newString(Token.NAME, "c"));
    LiveVariableLattice outHook = helper.analysis.flowThrough(hookNode, input);
    Assert.assertTrue(outHook.isLive(helper.scope.getVar("a")));
    Assert.assertTrue(outHook.isLive(helper.scope.getVar("b")));
    Assert.assertTrue(outHook.isLive(helper.scope.getVar("c")));
  }

  @Test
  public void testFlowThrough_assignments() {
    AnalysisHelper helper = new AnalysisHelper("function f(a, b, c) {}");

    // Simple assignment: a = b
    Node assignNode = new Node(Token.ASSIGN,
        Node.newString(Token.NAME, "a"),
        Node.newString(Token.NAME, "b"));

    LiveVariableLattice input = helper.analysis.createEntryLattice();
    LiveVariableLattice outAssign = helper.analysis.flowThrough(assignNode, input);
    Assert.assertTrue(outAssign.isLive(helper.scope.getVar("b")));
    Assert.assertFalse(outAssign.isLive(helper.scope.getVar("a")));

    // Compound assignment: a += b
    Node assignAddNode = new Node(Token.ASSIGN_ADD,
        Node.newString(Token.NAME, "a"),
        Node.newString(Token.NAME, "b"));
    LiveVariableLattice outAssignAdd = helper.analysis.flowThrough(assignAddNode, input);
    Assert.assertTrue(outAssignAdd.isLive(helper.scope.getVar("a")));
    Assert.assertTrue(outAssignAdd.isLive(helper.scope.getVar("b")));

    // Assignment to non-local or non-name property: obj.prop = c
    Node getProp = new Node(Token.GETPROP, Node.newString(Token.NAME, "a"), Node.newString("prop"));
    Node assignProp = new Node(Token.ASSIGN, getProp, Node.newString(Token.NAME, "c"));
    LiveVariableLattice outAssignProp = helper.analysis.flowThrough(assignProp, input);
    Assert.assertTrue(outAssignProp.isLive(helper.scope.getVar("a")));
    Assert.assertTrue(outAssignProp.isLive(helper.scope.getVar("c")));
  }

  @Test
  public void testFlowThrough_argumentsAliasEscapesParameters() {
    AnalysisHelper helper = new AnalysisHelper("function f(p1, p2) { var local = arguments; }");
    Node nameArgs = Node.newString(Token.NAME, LiveVariablesAnalysis.ARGUMENT_ARRAY_ALIAS);
    LiveVariableLattice input = helper.analysis.createEntryLattice();

    helper.analysis.flowThrough(nameArgs, input);

    Set<Var> escaped = helper.analysis.getEscapedLocals();
    Assert.assertTrue(escaped.contains(helper.scope.getVar("p1")));
    Assert.assertTrue(escaped.contains(helper.scope.getVar("p2")));
  }

  @Test
  public void testFlowThrough_argumentsDeclaredAsLocalVar_doesNotEscapeParameters() {
    AnalysisHelper helper = new AnalysisHelper("function f(p1, arguments) { var x = arguments; }");
    Node nameArgs = Node.newString(Token.NAME, LiveVariablesAnalysis.ARGUMENT_ARRAY_ALIAS);
    LiveVariableLattice input = helper.analysis.createEntryLattice();

    helper.analysis.flowThrough(nameArgs, input);

    Set<Var> escaped = helper.analysis.getEscapedLocals();
    Assert.assertFalse(escaped.contains(helper.scope.getVar("p1")));
  }

  @Test
  public void testFlowThrough_exceptionBranch_conditionalKill() {
    AnalysisHelper helper = new AnalysisHelper("function f(a, b) { try { a = 1; } catch (e) {} }");

    Node tryAssign = helper.functionNode.getLastChild().getFirstChild().getFirstChild().getFirstChild();

    LiveVariableLattice input = helper.analysis.createEntryLattice();
    Node nameA = Node.newString(Token.NAME, "a");
    LiveVariableLattice withA = helper.analysis.flowThrough(nameA, input);
    Assert.assertTrue(withA.isLive(helper.scope.getVar("a")));

    LiveVariableLattice out = helper.analysis.flowThrough(tryAssign, withA);
    Assert.assertTrue(out.isLive(helper.scope.getVar("a")));
  }

  @Test
  public void testAnalyzeWholeFunction() {
    AnalysisHelper helper = new AnalysisHelper("function f(a, b) { var x = a + 1; var y = b + 2; return x; }");
    helper.analysis.analyze();

    Assert.assertNotNull(helper.analysis.getEscapedLocals());
  }

  @Test
  public void testUndeclaredOrEscapedVariableInFlowThrough() {
    AnalysisHelper helper = new AnalysisHelper("function f(a) { function inner() { a = 2; } }");
    Node undeclaredName = Node.newString(Token.NAME, "undeclaredGlobal");
    LiveVariableLattice input = helper.analysis.createEntryLattice();

    LiveVariableLattice out = helper.analysis.flowThrough(undeclaredName, input);
    Assert.assertEquals(input, out);

    Var varA = helper.scope.getVar("a");
    Assert.assertTrue(helper.analysis.getEscapedLocals().contains(varA));
    Node nameA = Node.newString(Token.NAME, "a");
    LiveVariableLattice outEscaped = helper.analysis.flowThrough(nameA, input);
    Assert.assertFalse(outEscaped.isLive(varA));
  }
}
