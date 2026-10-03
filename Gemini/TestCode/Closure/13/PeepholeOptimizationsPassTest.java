package com.google.javascript.jscomp;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PeepholeOptimizationsPassTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  private static class RecordingPeepholeOptimization extends AbstractPeepholeOptimization {
    int beginTraversalCalls = 0;
    int endTraversalCalls = 0;
    int optimizeSubtreeCalls = 0;

    @Override
    public void beginTraversal(AbstractCompiler compiler) {
      super.beginTraversal(compiler);
      beginTraversalCalls++;
    }

    @Override
    public void endTraversal(AbstractCompiler compiler) {
      super.endTraversal(compiler);
      endTraversalCalls++;
    }

    @Override
    public Node optimizeSubtree(Node subtree) {
      optimizeSubtreeCalls++;
      return subtree;
    }
  }

  private static class ReplacingOptimization extends AbstractPeepholeOptimization {
    private final Node targetNode;
    private final Node replacementNode;
    private boolean replaced = false;

    ReplacingOptimization(Node targetNode, Node replacementNode) {
      this.targetNode = targetNode;
      this.replacementNode = replacementNode;
    }

    @Override
    public Node optimizeSubtree(Node subtree) {
      if (!replaced && subtree == targetNode) {
        replaced = true;
        if (targetNode.getParent() != null && replacementNode != null) {
          targetNode.getParent().replaceChild(targetNode, replacementNode);
        }
        reportCodeChange();
        return replacementNode;
      }
      return subtree;
    }
  }

  private static class InfiniteLoopOptimization extends AbstractPeepholeOptimization {
    @Override
    public Node optimizeSubtree(Node subtree) {
      reportCodeChange();
      return subtree;
    }
  }

  private static class NullReturningOptimization extends AbstractPeepholeOptimization {
    private final Node targetNode;

    NullReturningOptimization(Node targetNode) {
      this.targetNode = targetNode;
    }

    @Override
    public Node optimizeSubtree(Node subtree) {
      if (subtree == targetNode) {
        return null;
      }
      return subtree;
    }
  }

  @Test
  public void testGetCompiler_returnsInitializedCompiler() {
    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler);
    Assert.assertSame(compiler, pass.getCompiler());
  }

  @Test
  public void testProcess_emptyOptimizationsArray_traversesTree() {
    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler);
    Node script = IR.script(IR.var(IR.name("a"), IR.number(1)));
    Node externs = IR.script();

    pass.process(externs, script);
    Assert.assertNotNull(script);
  }

  @Test
  public void testProcess_lifecycleCallsBeginAndEndTraversal() {
    RecordingPeepholeOptimization opt1 = new RecordingPeepholeOptimization();
    RecordingPeepholeOptimization opt2 = new RecordingPeepholeOptimization();
    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, opt1, opt2);

    Node script = IR.script(IR.exprResult(IR.string("hello")));
    Node externs = IR.script();

    pass.process(externs, script);

    Assert.assertEquals(1, opt1.beginTraversalCalls);
    Assert.assertEquals(1, opt1.endTraversalCalls);
    Assert.assertEquals(1, opt2.beginTraversalCalls);
    Assert.assertEquals(1, opt2.endTraversalCalls);
    Assert.assertTrue(opt1.optimizeSubtreeCalls > 0);
    Assert.assertTrue(opt2.optimizeSubtreeCalls > 0);
  }

  @Test
  public void testProcess_withNestedFunctions_traversesAndPushesStack() {
    RecordingPeepholeOptimization opt = new RecordingPeepholeOptimization();
    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, opt);

    Node fn1 = IR.function(IR.name("foo"), IR.paramList(), IR.block(IR.returnNode()));
    Node fn2 = IR.function(IR.name("bar"), IR.paramList(), IR.block(IR.returnNode()));
    Node script = IR.script(fn1, fn2);
    Node externs = IR.script();

    pass.process(externs, script);

    Assert.assertTrue(opt.optimizeSubtreeCalls >= 3);
  }

  @Test
  public void testProcess_codeChangeRetraversesScopeAndSkipsChildScopes() {
    Node innerFn = IR.function(IR.name("inner"), IR.paramList(), IR.block());
    Node numNode = IR.number(1);
    Node outerFn = IR.function(IR.name("outer"), IR.paramList(), IR.block(innerFn, IR.exprResult(numNode)));
    Node script = IR.script(outerFn);
    Node externs = IR.script();

    Node newNum = IR.number(2);
    ReplacingOptimization replacingOpt = new ReplacingOptimization(numNode, newNum);
    RecordingPeepholeOptimization recordingOpt = new RecordingPeepholeOptimization();

    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, replacingOpt, recordingOpt);
    pass.process(externs, script);

    Assert.assertTrue(replacingOpt.replaced);
    Assert.assertTrue(recordingOpt.optimizeSubtreeCalls > 0);
  }

  @Test
  public void testProcess_scriptScopeRetraverseOnChange() {
    Node numNode = IR.number(42);
    Node script = IR.script(IR.exprResult(numNode));
    Node externs = IR.script();

    Node newNum = IR.number(100);
    ReplacingOptimization replacingOpt = new ReplacingOptimization(numNode, newNum);

    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, replacingOpt);
    pass.process(externs, script);

    Assert.assertTrue(replacingOpt.replaced);
  }

  @Test(expected = IllegalStateException.class)
  public void testProcess_infiniteLoopReportsChange_throwsException() {
    Node script = IR.script(IR.exprResult(IR.string("loop")));
    Node externs = IR.script();

    InfiniteLoopOptimization loopOpt = new InfiniteLoopOptimization();
    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, loopOpt);
    pass.process(externs, script);
  }

  @Test
  public void testVisit_nodeOptimizedToNull_stopsFurtherOptimizationsOnSubtree() {
    Node target = IR.name("target");
    NullReturningOptimization nullOpt = new NullReturningOptimization(target);
    RecordingPeepholeOptimization recordOpt = new RecordingPeepholeOptimization();

    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, nullOpt, recordOpt);
    pass.visit(target);

    Assert.assertEquals(0, recordOpt.optimizeSubtreeCalls);
  }

  @Test
  public void testVisit_multipleOptimizationsChained_optimizesUntilFixedPoint() {
    Node original = IR.number(1);
    Node step1 = IR.number(2);
    Node step2 = IR.number(3);

    ReplacingOptimization opt1 = new ReplacingOptimization(original, step1);
    ReplacingOptimization opt2 = new ReplacingOptimization(step1, step2);

    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, opt1, opt2);
    pass.visit(original);

    Assert.assertTrue(opt1.replaced);
    Assert.assertTrue(opt2.replaced);
  }

  @Test
  public void testVisit_noOptimizationsChange_exitsLoop() {
    RecordingPeepholeOptimization opt = new RecordingPeepholeOptimization();
    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, opt);

    Node node = IR.string("test");
    pass.visit(node);

    Assert.assertEquals(1, opt.optimizeSubtreeCalls);
  }

  @Test
  public void testProcess_deeplyNestedFunctions_pushesAndPopsStateStack() {
    Node innerMost = IR.function(IR.name("f3"), IR.paramList(), IR.block());
    Node middle = IR.function(IR.name("f2"), IR.paramList(), IR.block(innerMost));
    Node outer = IR.function(IR.name("f1"), IR.paramList(), IR.block(middle));
    Node script = IR.script(outer);
    Node externs = IR.script();

    RecordingPeepholeOptimization opt = new RecordingPeepholeOptimization();
    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, opt);
    pass.process(externs, script);

    Assert.assertTrue(opt.optimizeSubtreeCalls > 0);
  }

  @Test
  public void testProcess_emptyRoot_runsWithoutException() {
    Node script = IR.script();
    Node externs = IR.script();

    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler);
    pass.process(externs, script);

    Assert.assertFalse(script.hasChildren());
  }
}
