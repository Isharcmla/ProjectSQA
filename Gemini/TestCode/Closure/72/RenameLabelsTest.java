package com.google.javascript.jscomp;

import com.google.common.base.Supplier;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RenameLabelsTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  @Test
  public void testDefaultNameSupplier_generatesSequentialNames() {
    RenameLabels.DefaultNameSupplier supplier = new RenameLabels.DefaultNameSupplier();
    String first = supplier.get();
    String second = supplier.get();

    Assert.assertNotNull(first);
    Assert.assertNotNull(second);
    Assert.assertNotEquals(first, second);
    Assert.assertEquals("a", first);
    Assert.assertEquals("b", second);
  }

  @Test
  public void testConstructor_withCompilerOnly() {
    RenameLabels renameLabels = new RenameLabels(compiler);
    Assert.assertNotNull(renameLabels);
  }

  @Test
  public void testConstructor_withCustomSupplierAndFlags() {
    Supplier<String> customSupplier = new Supplier<String>() {
      private int counter = 0;
      @Override
      public String get() {
        return "label_" + (counter++);
      }
    };
    RenameLabels renameLabels = new RenameLabels(compiler, customSupplier, false);
    Assert.assertNotNull(renameLabels);
  }

  @Test
  public void testProcess_unreferencedLabelRemoved_statementTarget() {
    RenameLabels renameLabels = new RenameLabels(compiler);

    // ROOT -> SCRIPT -> LABEL ("Foo") -> EXPR_RESULT (CALL)
    Node root = new Node(Token.BLOCK);
    Node script = new Node(Token.SCRIPT);
    root.addChildToBack(script);

    Node label = new Node(Token.LABEL);
    Node labelName = Node.newString("Foo");
    Node exprResult = new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "bar"));
    label.addChildToBack(labelName);
    label.addChildToBack(exprResult);
    script.addChildToBack(label);

    renameLabels.process(null, root);

    // Unreferenced label should be removed and replaced by its statement child
    Assert.assertEquals(1, script.getChildCount());
    Assert.assertEquals(Token.EXPR_RESULT, script.getFirstChild().getType());
  }

  @Test
  public void testProcess_unreferencedLabelRemoved_blockTargetMerged() {
    RenameLabels renameLabels = new RenameLabels(compiler);

    // ROOT -> SCRIPT -> BLOCK -> LABEL ("Foo") -> BLOCK -> EXPR_RESULT
    Node root = new Node(Token.BLOCK);
    Node script = new Node(Token.SCRIPT);
    Node outerBlock = new Node(Token.BLOCK);
    root.addChildToBack(script);
    script.addChildToBack(outerBlock);

    Node label = new Node(Token.LABEL);
    Node labelName = Node.newString("Foo");
    Node innerBlock = new Node(Token.BLOCK);
    Node exprResult = new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "bar"));
    innerBlock.addChildToBack(exprResult);
    label.addChildToBack(labelName);
    label.addChildToBack(innerBlock);
    outerBlock.addChildToBack(label);

    renameLabels.process(null, root);

    // Label removed and innerBlock merged into outerBlock
    Assert.assertEquals(1, outerBlock.getChildCount());
    Assert.assertEquals(Token.EXPR_RESULT, outerBlock.getFirstChild().getType());
  }

  @Test
  public void testProcess_referencedBreakLabel_renamedProperly() {
    RenameLabels renameLabels = new RenameLabels(compiler);

    // SCRIPT -> LABEL ("MyLabel") -> BLOCK -> BREAK ("MyLabel")
    Node root = new Node(Token.BLOCK);
    Node script = new Node(Token.SCRIPT);
    root.addChildToBack(script);

    Node label = new Node(Token.LABEL);
    Node labelName = Node.newString("MyLabel");
    Node block = new Node(Token.BLOCK);
    Node breakNode = new Node(Token.BREAK, Node.newString("MyLabel"));
    block.addChildToBack(breakNode);
    label.addChildToBack(labelName);
    label.addChildToBack(block);
    script.addChildToBack(label);

    renameLabels.process(null, root);

    // Label should remain, renamed to "a", break reference updated to "a"
    Assert.assertEquals(1, script.getChildCount());
    Node resultingLabel = script.getFirstChild();
    Assert.assertEquals(Token.LABEL, resultingLabel.getType());
    Assert.assertEquals("a", resultingLabel.getFirstChild().getString());

    Node resultingBreak = resultingLabel.getLastChild().getFirstChild();
    Assert.assertEquals(Token.BREAK, resultingBreak.getType());
    Assert.assertEquals("a", resultingBreak.getFirstChild().getString());
  }

  @Test
  public void testProcess_referencedContinueLabel_renamedProperly() {
    RenameLabels renameLabels = new RenameLabels(compiler);

    // SCRIPT -> LABEL ("LoopLabel") -> FOR -> ... -> CONTINUE ("LoopLabel")
    Node root = new Node(Token.BLOCK);
    Node script = new Node(Token.SCRIPT);
    root.addChildToBack(script);

    Node label = new Node(Token.LABEL);
    Node labelName = Node.newString("LoopLabel");
    Node forNode = new Node(Token.FOR, new Node(Token.EMPTY), new Node(Token.EMPTY), new Node(Token.EMPTY));
    Node block = new Node(Token.BLOCK);
    Node continueNode = new Node(Token.CONTINUE, Node.newString("LoopLabel"));
    block.addChildToBack(continueNode);
    forNode.addChildToBack(block);

    label.addChildToBack(labelName);
    label.addChildToBack(forNode);
    script.addChildToBack(label);

    renameLabels.process(null, root);

    Node resultingLabel = script.getFirstChild();
    Assert.assertEquals(Token.LABEL, resultingLabel.getType());
    Assert.assertEquals("a", resultingLabel.getFirstChild().getString());

    Node resultingFor = resultingLabel.getLastChild();
    Node resultingBlock = resultingFor.getLastChild();
    Node resultingContinue = resultingBlock.getFirstChild();
    Assert.assertEquals(Token.CONTINUE, resultingContinue.getType());
    Assert.assertEquals("a", resultingContinue.getFirstChild().getString());
  }

  @Test
  public void testProcess_unnamedBreakAndContinue_ignoredWithoutError() {
    RenameLabels renameLabels = new RenameLabels(compiler);

    Node root = new Node(Token.BLOCK);
    Node script = new Node(Token.SCRIPT);
    root.addChildToBack(script);

    Node breakNode = new Node(Token.BREAK);
    Node continueNode = new Node(Token.CONTINUE);
    script.addChildToBack(breakNode);
    script.addChildToBack(continueNode);

    renameLabels.process(null, root);

    Assert.assertEquals(2, script.getChildCount());
    Assert.assertNull(breakNode.getFirstChild());
    Assert.assertNull(continueNode.getFirstChild());
  }

  @Test
  public void testProcess_nestedLabels_depthNameAllocation() {
    Supplier<String> customSupplier = new Supplier<String>() {
      private final Iterator<String> names = Arrays.asList("L1", "L2", "L3").iterator();
      @Override
      public String get() {
        return names.hasNext() ? names.next() : "LX";
      }
    };
    RenameLabels renameLabels = new RenameLabels(compiler, customSupplier, true);

    // SCRIPT -> LABEL ("Outer") -> BLOCK -> LABEL ("Inner") -> BLOCK -> BREAK ("Outer") & BREAK ("Inner")
    Node root = new Node(Token.BLOCK);
    Node script = new Node(Token.SCRIPT);
    root.addChildToBack(script);

    Node outerLabel = new Node(Token.LABEL);
    outerLabel.addChildToBack(Node.newString("Outer"));
    Node outerBlock = new Node(Token.BLOCK);

    Node innerLabel = new Node(Token.LABEL);
    innerLabel.addChildToBack(Node.newString("Inner"));
    Node innerBlock = new Node(Token.BLOCK);

    innerBlock.addChildToBack(new Node(Token.BREAK, Node.newString("Outer")));
    innerBlock.addChildToBack(new Node(Token.BREAK, Node.newString("Inner")));

    innerLabel.addChildToBack(innerBlock);
    outerBlock.addChildToBack(innerLabel);
    outerLabel.addChildToBack(outerBlock);
    script.addChildToBack(outerLabel);

    renameLabels.process(null, root);

    Assert.assertEquals("L1", outerLabel.getFirstChild().getString());
    Assert.assertEquals("L2", innerLabel.getFirstChild().getString());
    Assert.assertEquals("L1", innerBlock.getFirstChild().getFirstChild().getString());
    Assert.assertEquals("L2", innerBlock.getLastChild().getFirstChild().getString());
  }

  @Test
  public void testProcess_labelAlreadyHasGeneratedName_noChangeReported() {
    RenameLabels renameLabels = new RenameLabels(compiler);

    // Label is named "a", break references "a" -> no change in string value
    Node root = new Node(Token.BLOCK);
    Node script = new Node(Token.SCRIPT);
    root.addChildToBack(script);

    Node label = new Node(Token.LABEL);
    label.addChildToBack(Node.newString("a"));
    Node block = new Node(Token.BLOCK);
    block.addChildToBack(new Node(Token.BREAK, Node.newString("a")));
    label.addChildToBack(block);
    script.addChildToBack(label);

    renameLabels.process(null, root);

    Assert.assertEquals("a", label.getFirstChild().getString());
    Assert.assertEquals("a", block.getFirstChild().getFirstChild().getString());
  }

  @Test
  public void testProcess_scopedFunctions_resetDepth() {
    RenameLabels renameLabels = new RenameLabels(compiler);

    // SCRIPT
    //   FUNCTION 1 -> LABEL ("X") -> BLOCK -> BREAK ("X")
    //   FUNCTION 2 -> LABEL ("Y") -> BLOCK -> BREAK ("Y")
    Node root = new Node(Token.BLOCK);
    Node script = new Node(Token.SCRIPT);
    root.addChildToBack(script);

    // Function 1
    Node func1 = new Node(Token.FUNCTION, Node.newString(Token.NAME, "f1"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
    Node block1 = func1.getLastChild();
    Node label1 = new Node(Token.LABEL, Node.newString("X"), new Node(Token.BLOCK, new Node(Token.BREAK, Node.newString("X"))));
    block1.addChildToBack(label1);
    script.addChildToBack(func1);

    // Function 2
    Node func2 = new Node(Token.FUNCTION, Node.newString(Token.NAME, "f2"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
    Node block2 = func2.getLastChild();
    Node label2 = new Node(Token.LABEL, Node.newString("Y"), new Node(Token.BLOCK, new Node(Token.BREAK, Node.newString("Y"))));
    block2.addChildToBack(label2);
    script.addChildToBack(func2);

    renameLabels.process(null, root);

    // Both should be renamed to 'a' because scope resets at function boundaries
    Assert.assertEquals("a", label1.getFirstChild().getString());
    Assert.assertEquals("a", label2.getFirstChild().getString());
  }

  @Test(expected = IllegalStateException.class)
  public void testProcess_duplicateLabelNameInSameScope_throwsException() {
    RenameLabels renameLabels = new RenameLabels(compiler);

    // SCRIPT -> LABEL ("dup") -> BLOCK -> LABEL ("dup")
    Node root = new Node(Token.BLOCK);
    Node script = new Node(Token.SCRIPT);
    root.addChildToBack(script);

    Node label1 = new Node(Token.LABEL);
    label1.addChildToBack(Node.newString("dup"));
    Node block = new Node(Token.BLOCK);

    Node label2 = new Node(Token.LABEL);
    label2.addChildToBack(Node.newString("dup"));
    label2.addChildToBack(new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "foo")));

    block.addChildToBack(label2);
    label1.addChildToBack(block);
    script.addChildToBack(label1);

    renameLabels.process(null, root);
  }

  @Test(expected = IllegalStateException.class)
  public void testProcess_emptyBreakLabelName_throwsException() {
    RenameLabels renameLabels = new RenameLabels(compiler);

    Node root = new Node(Token.BLOCK);
    Node script = new Node(Token.SCRIPT);
    root.addChildToBack(script);

    Node breakNode = new Node(Token.BREAK, Node.newString(""));
    script.addChildToBack(breakNode);

    renameLabels.process(null, root);
  }

  @Test
  public void testProcess_breakWithUnknownLabel_doesNotThrow() {
    RenameLabels renameLabels = new RenameLabels(compiler);

    Node root = new Node(Token.BLOCK);
    Node script = new Node(Token.SCRIPT);
    root.addChildToBack(script);

    Node breakNode = new Node(Token.BREAK, Node.newString("unknownLabel"));
    script.addChildToBack(breakNode);

    renameLabels.process(null, root);
    Assert.assertEquals("unknownLabel", breakNode.getFirstChild().getString());
  }

  @Test
  public void testProcessLabels_helperMethodsDirectCall() {
    RenameLabels renameLabels = new RenameLabels(compiler);
    RenameLabels.ProcessLabels processLabels = renameLabels.new ProcessLabels();

    processLabels.names.add("first");
    processLabels.names.add("second");

    Assert.assertEquals("first", processLabels.getNameForId(1));
    Assert.assertEquals("second", processLabels.getNameForId(2));
    Assert.assertNull(processLabels.getLabelInfo("nonExistent"));

    NodeTraversal t = new NodeTraversal(compiler, processLabels);
    processLabels.enterScope(t);
    Assert.assertEquals(2, processLabels.namespaceStack.size());
    processLabels.exitScope(t);
    Assert.assertEquals(1, processLabels.namespaceStack.size());
  }
}
