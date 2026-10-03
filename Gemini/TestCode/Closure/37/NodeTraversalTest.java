package com.google.javascript.jscomp;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NodeTraversalTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  private static class RecordingCallback implements NodeTraversal.Callback {
    final List<Node> visited = new ArrayList<Node>();
    final List<Node> traversed = new ArrayList<Node>();

    @Override
    public boolean shouldTraverse(NodeTraversal nodeTraversal, Node n, Node parent) {
      traversed.add(n);
      return true;
    }

    @Override
    public void visit(NodeTraversal t, Node n, Node parent) {
      visited.add(n);
    }
  }

  private static class RecordingScopedCallback extends RecordingCallback
      implements NodeTraversal.ScopedCallback {
    int enterScopeCount = 0;
    int exitScopeCount = 0;

    @Override
    public void enterScope(NodeTraversal t) {
      enterScopeCount++;
    }

    @Override
    public void exitScope(NodeTraversal t) {
      exitScopeCount++;
    }
  }

  private Node createFunctionNode(String name) {
    Node nameNode = Node.newString(Token.NAME, name);
    Node paramList = new Node(Token.PARAM_LIST);
    Node body = new Node(Token.BLOCK);
    return new Node(Token.FUNCTION, nameNode, paramList, body);
  }

  @Test
  public void testTraverse_simpleNode() {
    RecordingCallback callback = new RecordingCallback();
    NodeTraversal t = new NodeTraversal(compiler, callback);

    Node root = new Node(Token.BLOCK);
    Node varNode = new Node(Token.VAR);
    root.addChildToBack(varNode);

    t.traverse(root);

    Assert.assertEquals(2, callback.traversed.size());
    Assert.assertEquals(2, callback.visited.size());
    Assert.assertEquals(varNode, callback.visited.get(0));
    Assert.assertEquals(root, callback.visited.get(1));
    Assert.assertEquals(compiler, t.getCompiler());
  }

  @Test
  public void testTraverse_scriptNode() {
    RecordingCallback callback = new RecordingCallback();
    NodeTraversal t = new NodeTraversal(compiler, callback);

    Node script = new Node(Token.SCRIPT);
    script.setInputId(new InputId("test.js"));
    script.setSourceFileName("test.js");

    t.traverse(script);

    Assert.assertEquals("test.js", t.getSourceName());
    Assert.assertEquals(new InputId("test.js"), t.getInputId());
    Assert.assertNull(t.getInput());
    Assert.assertNull(t.getModule());
  }

  @Test
  public void testTraverse_functionDeclaration() {
    RecordingScopedCallback callback = new RecordingScopedCallback();
    NodeTraversal t = new NodeTraversal(compiler, callback);

    Node root = new Node(Token.BLOCK);
    Node fn = createFunctionNode("foo");
    root.addChildToBack(fn);

    t.traverse(root);

    Assert.assertEquals(2, callback.enterScopeCount);
    Assert.assertEquals(2, callback.exitScopeCount);
    Assert.assertTrue(callback.visited.contains(fn));
  }

  @Test
  public void testTraverse_functionExpression() {
    RecordingScopedCallback callback = new RecordingScopedCallback();
    NodeTraversal t = new NodeTraversal(compiler, callback);

    Node root = new Node(Token.BLOCK);
    Node expr = new Node(Token.EXPR_RESULT);
    Node fn = createFunctionNode("fnExpr");
    expr.addChildToBack(fn);
    root.addChildToBack(expr);

    t.traverse(root);

    Assert.assertEquals(2, callback.enterScopeCount);
    Assert.assertEquals(2, callback.exitScopeCount);
    Assert.assertTrue(callback.visited.contains(fn));
  }

  @Test
  public void testStaticTraverse_singleRoot() {
    RecordingCallback callback = new RecordingCallback();
    Node root = new Node(Token.BLOCK);
    NodeTraversal.traverse(compiler, root, callback);

    Assert.assertEquals(1, callback.visited.size());
    Assert.assertEquals(root, callback.visited.get(0));
  }

  @Test
  public void testTraverseRoots_varargs() {
    RecordingCallback callback = new RecordingCallback();
    Node parent = new Node(Token.BLOCK);
    Node child1 = new Node(Token.EMPTY);
    Node child2 = new Node(Token.EMPTY);
    parent.addChildToBack(child1);
    parent.addChildToBack(child2);

    NodeTraversal t = new NodeTraversal(compiler, callback);
    t.traverseRoots(child1, child2);

    Assert.assertEquals(2, callback.visited.size());
    Assert.assertEquals(child1, callback.visited.get(0));
    Assert.assertEquals(child2, callback.visited.get(1));
  }

  @Test
  public void testTraverseRoots_emptyList() {
    RecordingCallback callback = new RecordingCallback();
    NodeTraversal t = new NodeTraversal(compiler, callback);
    t.traverseRoots(Collections.<Node>emptyList());
    Assert.assertEquals(0, callback.visited.size());
  }

  @Test
  public void testStaticTraverseRoots_list() {
    RecordingCallback callback = new RecordingCallback();
    Node parent = new Node(Token.BLOCK);
    Node child1 = new Node(Token.EMPTY);
    parent.addChildToBack(child1);

    NodeTraversal.traverseRoots(compiler, Lists.newArrayList(child1), callback);
    Assert.assertEquals(1, callback.visited.size());
    Assert.assertEquals(child1, callback.visited.get(0));
  }

  @Test
  public void testStaticTraverseRoots_varargs() {
    RecordingCallback callback = new RecordingCallback();
    Node parent = new Node(Token.BLOCK);
    Node child1 = new Node(Token.EMPTY);
    parent.addChildToBack(child1);

    NodeTraversal.traverseRoots(compiler, callback, child1);
    Assert.assertEquals(1, callback.visited.size());
    Assert.assertEquals(child1, callback.visited.get(0));
  }

  @Test
  public void testTraverseWithScope_globalScope() {
    RecordingCallback callback = new RecordingCallback();
    NodeTraversal t = new NodeTraversal(compiler, callback);

    Node root = new Node(Token.BLOCK);
    Scope globalScope = Scope.createGlobalScope(root);
    t.traverseWithScope(root, globalScope);

    Assert.assertEquals(1, callback.visited.size());
    Assert.assertEquals(root, callback.visited.get(0));
  }

  @Test(expected = IllegalStateException.class)
  public void testTraverseWithScope_nonGlobalScope_throwsException() {
    RecordingCallback callback = new RecordingCallback();
    NodeTraversal t = new NodeTraversal(compiler, callback);

    Node globalRoot = new Node(Token.BLOCK);
    Scope globalScope = Scope.createGlobalScope(globalRoot);
    Node fn = createFunctionNode("f");
    Scope fnScope = new Scope(globalScope, fn);

    t.traverseWithScope(fn, fnScope);
  }

  @Test
  public void testTraverseAtScope_functionScope() {
    RecordingCallback callback = new RecordingCallback();
    NodeTraversal t = new NodeTraversal(compiler, callback);

    Node globalRoot = new Node(Token.BLOCK);
    Scope globalScope = Scope.createGlobalScope(globalRoot);
    Node fn = createFunctionNode("f");
    fn.setSourceFileName("func.js");
    Scope fnScope = new Scope(globalScope, fn);

    t.traverseAtScope(fnScope);

    Assert.assertEquals("func.js", t.getSourceName());
    Assert.assertTrue(callback.visited.contains(fn.getFirstChild().getNext())); // args
    Assert.assertTrue(callback.visited.contains(fn.getLastChild())); // body
    Assert.assertFalse(callback.visited.contains(fn)); // fn root itself not visited in traverseAtScope
  }

  @Test
  public void testTraverseAtScope_globalScope() {
    RecordingCallback callback = new RecordingCallback();
    NodeTraversal t = new NodeTraversal(compiler, callback);

    Node globalRoot = new Node(Token.BLOCK);
    Scope globalScope = Scope.createGlobalScope(globalRoot);

    t.traverseAtScope(globalScope);
    Assert.assertEquals(1, callback.visited.size());
    Assert.assertEquals(globalRoot, callback.visited.get(0));
  }

  @Test
  public void testTraverseInnerNode_withRefinedScope() {
    final Scope[] innerScope = new Scope[1];
    Node root = new Node(Token.BLOCK);
    final Node child = new Node(Token.EMPTY);
    root.addChildToBack(child);

    final Scope globalScope = Scope.createGlobalScope(root);
    final Scope refinedScope = new Scope(globalScope, child);

    NodeTraversal.Callback cb = new NodeTraversal.AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        if (n == root) {
          t.traverseInnerNode(child, root, refinedScope);
        } else if (n == child) {
          innerScope[0] = t.getScope();
        }
      }
    };

    NodeTraversal t = new NodeTraversal(compiler, cb);
    t.traverseWithScope(root, globalScope);

    Assert.assertEquals(refinedScope, innerScope[0]);
  }

  @Test
  public void testTraverseInnerNode_withoutRefinedScope() {
    final boolean[] visitedInner = new boolean[1];
    Node root = new Node(Token.BLOCK);
    final Node child = new Node(Token.EMPTY);
    root.addChildToBack(child);

    NodeTraversal.Callback cb = new NodeTraversal.AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        if (n == root && !visitedInner[0]) {
          visitedInner[0] = true;
          t.traverseInnerNode(child, root, null);
        }
      }
    };

    NodeTraversal t = new NodeTraversal(compiler, cb);
    t.traverse(root);

    Assert.assertTrue(visitedInner[0]);
  }

  @Test(expected = NullPointerException.class)
  public void testTraverseInnerNode_nullParent_throwsException() {
    NodeTraversal t = new NodeTraversal(compiler, new RecordingCallback());
    t.traverseInnerNode(new Node(Token.BLOCK), null, null);
  }

  @Test
  public void testScopeMethodsAndEnclosingFunction() {
    Node root = new Node(Token.BLOCK);
    final Node fn = createFunctionNode("f");
    root.addChildToBack(fn);

    final List<Boolean> inGlobalScopeList = new ArrayList<Boolean>();
    final List<Integer> scopeDepthList = new ArrayList<Integer>();
    final List<Boolean> hasScopeList = new ArrayList<Boolean>();
    final List<Node> enclosingFunctionList = new ArrayList<Node>();
    final List<Scope> scopesList = new ArrayList<Scope>();

    NodeTraversal.Callback cb = new NodeTraversal.AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        inGlobalScopeList.add(t.inGlobalScope());
        scopeDepthList.add(t.getScopeDepth());
        hasScopeList.add(t.hasScope());
        enclosingFunctionList.add(t.getEnclosingFunction());
        scopesList.add(t.getScope());
        Assert.assertNotNull(t.getControlFlowGraph());
        Assert.assertNotNull(t.getScopeRoot());
      }
    };

    NodeTraversal t = new NodeTraversal(compiler, cb);
    Assert.assertFalse(t.hasScope());
    Assert.assertEquals(0, t.getScopeDepth());
    Assert.assertNull(t.getEnclosingFunction());

    t.traverse(root);

    Assert.assertFalse(inGlobalScopeList.isEmpty());
    Assert.assertTrue(hasScopeList.get(0));
    Assert.assertTrue(enclosingFunctionList.contains(fn));
  }

  @Test
  public void testGetLineNumber() {
    final int[] retrievedLine = new int[2];
    Node root = new Node(Token.BLOCK);
    Node child = new Node(Token.EMPTY);
    child.setLineno(42);
    root.addChildToBack(child);

    Node childWithoutLine = new Node(Token.EMPTY);
    childWithoutLine.setLineno(-1);
    root.addChildToBack(childWithoutLine);

    NodeTraversal.Callback cb = new NodeTraversal.AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        if (n.getLineno() == 42) {
          retrievedLine[0] = t.getLineNumber();
        } else if (n.getLineno() == -1) {
          retrievedLine[1] = t.getLineNumber();
        }
      }
    };

    NodeTraversal t = new NodeTraversal(compiler, cb);
    Assert.assertEquals(0, t.getLineNumber());

    t.traverse(root);

    Assert.assertEquals(42, retrievedLine[0]);
    Assert.assertEquals(0, retrievedLine[1]);
  }

  @Test
  public void testGetCurrentNode() {
    final Node[] current = new Node[1];
    final Node root = new Node(Token.BLOCK);

    NodeTraversal.Callback cb = new NodeTraversal.AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        current[0] = t.getCurrentNode();
      }
    };

    NodeTraversal t = new NodeTraversal(compiler, cb);
    Assert.assertNull(t.getCurrentNode());

    t.traverse(root);
    Assert.assertEquals(root, current[0]);
  }

  @Test
  public void testReportAndMakeError() {
    DiagnosticType diag = DiagnosticType.error("TEST_DIAG", "Test message {0}");
    Node root = new Node(Token.BLOCK);
    root.setSourceFileName("test.js");
    root.setLineno(10);
    root.setCharno(5);

    NodeTraversal t = new NodeTraversal(compiler, new RecordingCallback());

    JSError err1 = t.makeError(root, CheckLevel.WARNING, diag, "arg1");
    Assert.assertNotNull(err1);
    Assert.assertEquals(CheckLevel.WARNING, err1.getDefaultLevel());

    JSError err2 = t.makeError(root, diag, "arg2");
    Assert.assertNotNull(err2);
    Assert.assertEquals(CheckLevel.ERROR, err2.getDefaultLevel());

    t.report(root, diag, "arg3");
    Assert.assertEquals(1, compiler.getErrorCount());
  }

  @Test(expected = RuntimeException.class)
  public void testThrowUnexpectedException_withInputId() {
    Node script = new Node(Token.SCRIPT);
    script.setInputId(new InputId("error.js"));
    script.setSourceFileName("error.js");

    NodeTraversal.Callback cb = new NodeTraversal.AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        throw new RuntimeException("Custom error");
      }
    };

    NodeTraversal t = new NodeTraversal(compiler, cb);
    t.traverse(script);
  }

  @Test(expected = RuntimeException.class)
  public void testThrowUnexpectedException_withoutInputId() {
    Node root = new Node(Token.BLOCK);
    NodeTraversal.Callback cb = new NodeTraversal.AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        throw new RuntimeException("Custom error without input id");
      }
    };

    NodeTraversal t = new NodeTraversal(compiler, cb);
    t.traverse(root);
  }

  @Test
  public void testAbstractPostOrderCallback() {
    NodeTraversal.AbstractPostOrderCallback cb = new NodeTraversal.AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {}
    };

    Assert.assertTrue(cb.shouldTraverse(null, new Node(Token.BLOCK), null));
  }

  @Test
  public void testAbstractScopedCallback() {
    final boolean[] visited = new boolean[1];
    NodeTraversal.AbstractScopedCallback cb = new NodeTraversal.AbstractScopedCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        visited[0] = true;
      }
    };

    cb.enterScope(null);
    cb.exitScope(null);
    Assert.assertTrue(cb.shouldTraverse(null, new Node(Token.BLOCK), null));

    Node root = new Node(Token.BLOCK);
    NodeTraversal.traverse(compiler, root, cb);
    Assert.assertTrue(visited[0]);
  }

  @Test
  public void testAbstractShallowCallback() {
    NodeTraversal.AbstractShallowCallback cb = new NodeTraversal.AbstractShallowCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {}
    };

    Node fn = createFunctionNode("f");
    Node nameNode = fn.getFirstChild();
    Node paramList = nameNode.getNext();

    Assert.assertTrue(cb.shouldTraverse(null, fn, null));
    Assert.assertTrue(cb.shouldTraverse(null, nameNode, fn));
    Assert.assertFalse(cb.shouldTraverse(null, paramList, fn));
  }

  @Test
  public void testAbstractShallowStatementCallback() {
    NodeTraversal.AbstractShallowStatementCallback cb =
        new NodeTraversal.AbstractShallowStatementCallback() {
          @Override
          public void visit(NodeTraversal t, Node n, Node parent) {}
        };

    Node block = new Node(Token.BLOCK);
    Node ifNode = new Node(Token.IF);
    Node expr = new Node(Token.EXPR_RESULT);
    Node num = new Node(Token.NUMBER);
    expr.addChildToBack(num);

    Assert.assertTrue(cb.shouldTraverse(null, block, null));
    Assert.assertTrue(cb.shouldTraverse(null, ifNode, block));
    Assert.assertTrue(cb.shouldTraverse(null, expr, block));
    Assert.assertFalse(cb.shouldTraverse(null, num, expr));
  }

  @Test
  public void testAbstractNodeTypePruningCallback_include() {
    Set<Integer> types = new HashSet<Integer>();
    types.add(Token.BLOCK);
    types.add(Token.VAR);

    NodeTraversal.AbstractNodeTypePruningCallback cb =
        new NodeTraversal.AbstractNodeTypePruningCallback(types) {
          @Override
          public void visit(NodeTraversal t, Node n, Node parent) {}
        };

    Assert.assertTrue(cb.shouldTraverse(null, new Node(Token.BLOCK), null));
    Assert.assertTrue(cb.shouldTraverse(null, new Node(Token.VAR), null));
    Assert.assertFalse(cb.shouldTraverse(null, new Node(Token.EMPTY), null));
  }

  @Test
  public void testAbstractNodeTypePruningCallback_exclude() {
    Set<Integer> types = ImmutableSet.of(Token.BLOCK, Token.VAR);

    NodeTraversal.AbstractNodeTypePruningCallback cb =
        new NodeTraversal.AbstractNodeTypePruningCallback(types, false) {
          @Override
          public void visit(NodeTraversal t, Node n, Node parent) {}
        };

    Assert.assertFalse(cb.shouldTraverse(null, new Node(Token.BLOCK), null));
    Assert.assertFalse(cb.shouldTraverse(null, new Node(Token.VAR), null));
    Assert.assertTrue(cb.shouldTraverse(null, new Node(Token.EMPTY), null));
  }

  @Test
  public void testPruningCallback_skipsChildrenWhenFalse() {
    Node root = new Node(Token.BLOCK);
    Node varNode = new Node(Token.VAR);
    Node nameNode = Node.newString(Token.NAME, "x");
    varNode.addChildToBack(nameNode);
    root.addChildToBack(varNode);

    Set<Integer> types = ImmutableSet.of(Token.BLOCK);
    final List<Node> visited = new ArrayList<Node>();

    NodeTraversal.AbstractNodeTypePruningCallback cb =
        new NodeTraversal.AbstractNodeTypePruningCallback(types, true) {
          @Override
          public void visit(NodeTraversal t, Node n, Node parent) {
            visited.add(n);
          }
        };

    NodeTraversal.traverse(compiler, root, cb);

    Assert.assertEquals(1, visited.size());
    Assert.assertEquals(root, visited.get(0));
  }
}
