package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;

import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

public class TypeInferenceTest {

  private Compiler compiler;
  private JSTypeRegistry registry;
  private ReverseAbstractInterpreter rai;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    registry = compiler.getTypeRegistry();
    rai = new SemanticReverseAbstractInterpreter(
        compiler.getCodingConvention(), registry);
  }

  private TypeInference createTypeInference(Node root, Scope scope) {
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false, true);
    cfa.process(null, root);
    ControlFlowGraph<Node> cfg = cfa.getCfg();
    return new TypeInference(compiler, cfg, rai, scope);
  }

  private TypeInference createTypeInference(
      Node root, Scope scope, java.util.Collection<Var> unflowableVars) {
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false, true);
    cfa.process(null, root);
    ControlFlowGraph<Node> cfg = cfa.getCfg();
    return new TypeInference(compiler, cfg, rai, scope, unflowableVars);
  }

  private Scope createGlobalScope(Node root) {
    return new Scope(root, registry.getNativeObjectType(JSTypeNative.GLOBAL_THIS));
  }

  @Test
  public void testGetBooleanOutcomes_allCombinations() {
    assertEquals(
        BooleanLiteralSet.BOTH,
        TypeInference.getBooleanOutcomes(BooleanLiteralSet.BOTH, BooleanLiteralSet.BOTH, true));
    assertEquals(
        BooleanLiteralSet.TRUE,
        TypeInference.getBooleanOutcomes(BooleanLiteralSet.TRUE, BooleanLiteralSet.TRUE, true));
    assertEquals(
        BooleanLiteralSet.FALSE,
        TypeInference.getBooleanOutcomes(BooleanLiteralSet.FALSE, BooleanLiteralSet.FALSE, true));
    assertEquals(
        BooleanLiteralSet.EMPTY,
        TypeInference.getBooleanOutcomes(BooleanLiteralSet.EMPTY, BooleanLiteralSet.EMPTY, false));
    assertEquals(
        BooleanLiteralSet.TRUE,
        TypeInference.getBooleanOutcomes(BooleanLiteralSet.FALSE, BooleanLiteralSet.TRUE, true));
    assertEquals(
        BooleanLiteralSet.BOTH,
        TypeInference.getBooleanOutcomes(BooleanLiteralSet.TRUE, BooleanLiteralSet.FALSE, false));
  }

  @Test
  public void testInitialAndEntryLattice() {
    Node script = new Node(Token.SCRIPT);
    Scope scope = createGlobalScope(script);
    TypeInference ti = createTypeInference(script, scope);

    FlowScope initialEstimate = ti.createInitialEstimateLattice();
    FlowScope entryLattice = ti.createEntryLattice();

    assertNotNull(initialEstimate);
    assertNotNull(entryLattice);
    assertSame(initialEstimate, ti.flowThrough(script, initialEstimate));
  }

  @Test
  public void testUnflowableVarsAndOuterLocalVars() {
    Node script = new Node(Token.SCRIPT);
    Scope scope = createGlobalScope(script);
    Node varNode = new Node(Token.VAR);
    Node nameNode = Node.newString(Token.NAME, "unflowable");
    varNode.addChildToFront(nameNode);
    script.addChildToFront(varNode);

    scope.declare("unflowable", nameNode, null, null);
    Var unflowableVar = scope.getVar("unflowable");

    TypeInference ti = createTypeInference(
        script, scope, Collections.singletonList(unflowableVar));

    Multimap<Scope, Var> outerVars = ti.getAssignedOuterLocalVars();
    assertNotNull(outerVars);
    assertTrue(outerVars.isEmpty());

    FlowScope entry = ti.createEntryLattice();
    FlowScope out = ti.flowThrough(nameNode, entry);
    assertNotNull(out);
  }

  @Test
  public void testFlowThrough_literalsAndPrimitives() {
    Node script = new Node(Token.SCRIPT);
    Scope scope = createGlobalScope(script);
    TypeInference ti = createTypeInference(script, scope);
    FlowScope flowScope = ti.createEntryLattice();

    Node nullNode = new Node(Token.NULL);
    flowScope = ti.flowThrough(nullNode, flowScope);
    assertEquals(registry.getNativeType(JSTypeNative.NULL_TYPE), nullNode.getJSType());

    Node voidNode = new Node(Token.VOID, Node.newNumber(0));
    flowScope = ti.flowThrough(voidNode, flowScope);
    assertEquals(registry.getNativeType(JSTypeNative.VOID_TYPE), voidNode.getJSType());

    Node numNode = Node.newNumber(42.0);
    flowScope = ti.flowThrough(numNode, flowScope);
    assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), numNode.getJSType());

    Node strNode = Node.newString("hello");
    flowScope = ti.flowThrough(strNode, flowScope);
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), strNode.getJSType());

    Node trueNode = new Node(Token.TRUE);
    flowScope = ti.flowThrough(trueNode, flowScope);
    assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), trueNode.getJSType());

    Node falseNode = new Node(Token.FALSE);
    flowScope = ti.flowThrough(falseNode, flowScope);
    assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), falseNode.getJSType());

    Node thisNode = new Node(Token.THIS);
    flowScope = ti.flowThrough(thisNode, flowScope);
    assertNotNull(thisNode.getJSType());

    Node regexpNode = new Node(Token.REGEXP, Node.newString("abc"));
    flowScope = ti.flowThrough(regexpNode, flowScope);
    assertEquals(registry.getNativeType(JSTypeNative.REGEXP_TYPE), regexpNode.getJSType());

    Node refSpecial = new Node(Token.REF_SPECIAL);
    flowScope = ti.flowThrough(refSpecial, flowScope);
    assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), refSpecial.getJSType());
  }

  @Test
  public void testFlowThrough_unaryAndBinaryNumberOps() {
    Node script = new Node(Token.SCRIPT);
    Scope scope = createGlobalScope(script);
    TypeInference ti = createTypeInference(script, scope);
    FlowScope flowScope = ti.createEntryLattice();

    int[] numberTokens = new int[] {
      Token.POS, Token.NEG, Token.BITNOT, Token.DEC, Token.INC,
      Token.DIV, Token.MOD, Token.MUL, Token.SUB, Token.BITAND,
      Token.BITOR, Token.BITXOR, Token.LSH, Token.RSH, Token.URSH,
      Token.ASSIGN_DIV, Token.ASSIGN_MOD, Token.ASSIGN_MUL,
      Token.ASSIGN_SUB, Token.ASSIGN_BITAND, Token.ASSIGN_BITOR,
      Token.ASSIGN_BITXOR, Token.ASSIGN_LSH, Token.ASSIGN_RSH,
      Token.ASSIGN_URSH
    };

    for (int token : numberTokens) {
      Node n;
      if (token == Token.POS || token == Token.NEG || token == Token.BITNOT ||
          token == Token.DEC || token == Token.INC) {
        n = new Node(token, Node.newNumber(1));
      } else {
        n = new Node(token, Node.newNumber(1), Node.newNumber(2));
      }
      flowScope = ti.flowThrough(n, flowScope);
      assertEquals("Token: " + token, registry.getNativeType(JSTypeNative.NUMBER_TYPE), n.getJSType());
    }
  }

  @Test
  public void testFlowThrough_comparisonsAndBooleans() {
    Node script = new Node(Token.SCRIPT);
    Scope scope = createGlobalScope(script);
    TypeInference ti = createTypeInference(script, scope);
    FlowScope flowScope = ti.createEntryLattice();

    int[] boolTokens = new int[] {
      Token.LT, Token.LE, Token.GT, Token.GE, Token.NOT,
      Token.EQ, Token.NE, Token.SHEQ, Token.SHNE,
      Token.INSTANCEOF, Token.IN
    };

    for (int token : boolTokens) {
      Node n;
      if (token == Token.NOT) {
        n = new Node(token, Node.newNumber(1));
      } else {
        n = new Node(token, Node.newNumber(1), Node.newNumber(2));
      }
      flowScope = ti.flowThrough(n, flowScope);
      assertEquals("Token: " + token, registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), n.getJSType());
    }
  }

  @Test
  public void testFlowThrough_commaAndGetRefAndTypeOf() {
    Node script = new Node(Token.SCRIPT);
    Scope scope = createGlobalScope(script);
    TypeInference ti = createTypeInference(script, scope);
    FlowScope flowScope = ti.createEntryLattice();

    Node comma = new Node(Token.COMMA, Node.newNumber(1), Node.newString("str"));
    flowScope = ti.flowThrough(comma, flowScope);
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), comma.getJSType());

    Node lp = new Node(Token.LP, Node.newNumber(5));
    flowScope = ti.flowThrough(lp, flowScope);
    assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), lp.getJSType());

    Node typeof = new Node(Token.TYPEOF, Node.newNumber(5));
    flowScope = ti.flowThrough(typeof, flowScope);
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), typeof.getJSType());
  }

  @Test
  public void testFlowThrough_addAndAssignAdd() {
    Node script = new Node(Token.SCRIPT);
    Scope scope = createGlobalScope(script);
    TypeInference ti = createTypeInference(script, scope);
    FlowScope flowScope = ti.createEntryLattice();

    Node addNum = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
    flowScope = ti.flowThrough(addNum, flowScope);
    assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), addNum.getJSType());

    Node addStr = new Node(Token.ADD, Node.newString("a"), Node.newNumber(2));
    flowScope = ti.flowThrough(addStr, flowScope);
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), addStr.getJSType());

    Node addUnknown = new Node(Token.ADD, new Node(Token.NAME, Node.newString("x")), Node.newNumber(2));
    flowScope = ti.flowThrough(addUnknown, flowScope);
    assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), addUnknown.getJSType());

    Node assignAdd = new Node(Token.ASSIGN_ADD, Node.newString(Token.NAME, "y"), Node.newNumber(3));
    flowScope = ti.flowThrough(assignAdd, flowScope);
    assertNotNull(assignAdd.getJSType());
  }

  @Test
  public void testFlowThrough_arrayAndObjectLiteral() {
    Node script = new Node(Token.SCRIPT);
    Scope scope = createGlobalScope(script);
    TypeInference ti = createTypeInference(script, scope);
    FlowScope flowScope = ti.createEntryLattice();

    Node arr = new Node(Token.ARRAYLIT, Node.newNumber(1), Node.newString("val"));
    flowScope = ti.flowThrough(arr, flowScope);
    assertEquals(registry.getNativeType(JSTypeNative.ARRAY_TYPE), arr.getJSType());

    Node objLit = new Node(Token.OBJECTLIT);
    Node key = Node.newString("prop");
    Node val = Node.newNumber(10);
    objLit.addChildToFront(val);
    objLit.addChildToFront(key);

    flowScope = ti.flowThrough(objLit, flowScope);
    assertNotNull(objLit.getJSType());
    assertTrue(objLit.getJSType().isObjectType());

    // Second traversal of same object literal returns cached type
    FlowScope secondFlow = ti.flowThrough(objLit, flowScope);
    assertSame(flowScope, secondFlow);
  }

  @Test
  public void testFlowThrough_objectLiteralWithNonString() {
    Node script = new Node(Token.SCRIPT);
    Scope scope = createGlobalScope(script);
    TypeInference ti = createTypeInference(script, scope);
    FlowScope flowScope = ti.createEntryLattice();

    Node objLit = new Node(Token.OBJECTLIT);
    Node key = new Node(Token.ARRAYLIT);
    Node val = Node.newNumber(10);
    objLit.addChildToFront(val);
    objLit.addChildToFront(key);

    flowScope = ti.flowThrough(objLit, flowScope);
    assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), objLit.getJSType());
  }

  @Test
  public void testFlowThrough_logicalAndHook() {
    Node script = new Node(Token.SCRIPT);
    Scope scope = createGlobalScope(script);
    TypeInference ti = createTypeInference(script, scope);
    FlowScope flowScope = ti.createEntryLattice();

    Node and = new Node(Token.AND, Node.newNumber(1), Node.newString("trueBranch"));
    flowScope = ti.flowThrough(and, flowScope);
    assertNotNull(and.getJSType());

    Node or = new Node(Token.OR, Node.newString("a"), Node.newNumber(2));
    flowScope = ti.flowThrough(or, flowScope);
    assertNotNull(or.getJSType());

    Node hook = new Node(Token.HOOK, new Node(Token.TRUE), Node.newNumber(1), Node.newNumber(2));
    flowScope = ti.flowThrough(hook, flowScope);
    assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), hook.getJSType());
  }

  @Test
  public void testFlowThrough_hookWithDifferentTypes() {
    Node script = new Node(Token.SCRIPT);
    Scope scope = createGlobalScope(script);
    TypeInference ti = createTypeInference(script, scope);
    FlowScope flowScope = ti.createEntryLattice();

    Node hook = new Node(Token.HOOK, new Node(Token.TRUE), Node.newNumber(1), Node.newString("abc"));
    flowScope = ti.flowThrough(hook, flowScope);
    assertNotNull(hook.getJSType());
  }

  @Test
  public void testFlowThrough_getPropAndGetElem() {
    Node script = new Node(Token.SCRIPT);
    Scope scope = createGlobalScope(script);
    TypeInference ti = createTypeInference(script, scope);
    FlowScope flowScope = ti.createEntryLattice();

    Node objName = Node.newString(Token.NAME, "myObj");
    objName.setJSType(registry.getNativeType(JSTypeNative.OBJECT_TYPE));
    Node getProp = new Node(Token.GETPROP, objName, Node.newString("toString"));
    flowScope = ti.flowThrough(getProp, flowScope);
    assertNotNull(getProp.getJSType());

    Node arrName = Node.newString(Token.NAME, "myArr");
    arrName.setJSType(registry.getNativeType(JSTypeNative.ARRAY_TYPE));
    Node getElem = new Node(Token.GETELEM, arrName, Node.newNumber(0));
    flowScope = ti.flowThrough(getElem, flowScope);
    assertNotNull(getElem.getJSType());
  }

  @Test
  public void testFlowThrough_callAndNew() {
    Node script = new Node(Token.SCRIPT);
    Scope scope = createGlobalScope(script);
    TypeInference ti = createTypeInference(script, scope);
    FlowScope flowScope = ti.createEntryLattice();

    FunctionType fnType = registry.createFunctionType(registry.getNativeType(JSTypeNative.STRING_TYPE));
    Node fnName = Node.newString(Token.NAME, "myFunc");
    fnName.setJSType(fnType);

    Node call = new Node(Token.CALL, fnName, Node.newNumber(123));
    flowScope = ti.flowThrough(call, flowScope);
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), call.getJSType());

    FunctionType ctorType = registry.createConstructorType("MyClass", null, null, null);
    Node ctorName = Node.newString(Token.NAME, "MyClass");
    ctorName.setJSType(ctorType);

    Node newOp = new Node(Token.NEW, ctorName);
    flowScope = ti.flowThrough(newOp, flowScope);
    assertEquals(ctorType.getInstanceType(), newOp.getJSType());

    Node newUnknown = new Node(Token.NEW, Node.newString(Token.NAME, "UnknownCtor"));
    flowScope = ti.flowThrough(newUnknown, flowScope);
    assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), newUnknown.getJSType());
  }

  @Test
  public void testFlowThrough_closureParametersAndThisOnClosure() {
    Node script = new Node(Token.SCRIPT);
    Scope scope = createGlobalScope(script);
    TypeInference ti = createTypeInference(script, scope);
    FlowScope flowScope = ti.createEntryLattice();

    FunctionType callbackParamType = registry.createFunctionType(registry.getNativeType(JSTypeNative.VOID_TYPE));
    FunctionType higherOrderFn = registry.createFunctionType(
        registry.getNativeType(JSTypeNative.VOID_TYPE),
        registry.createParameters(callbackParamType));

    Node callee = Node.newString(Token.NAME, "higherOrder");
    callee.setJSType(higherOrderFn);

    Node fnArg = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
    fnArg.setJSType(registry.createFunctionType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE)));

    Node call = new Node(Token.CALL, callee, fnArg);
    flowScope = ti.flowThrough(call, flowScope);
    assertEquals(callbackParamType, fnArg.getJSType());
  }

  @Test
  public void testFlowThrough_catchAndSwitchAndExprResult() {
    Node script = new Node(Token.SCRIPT);
    Scope scope = createGlobalScope(script);
    TypeInference ti = createTypeInference(script, scope);
    FlowScope flowScope = ti.createEntryLattice();

    Node catchNode = new Node(Token.CATCH, Node.newString(Token.NAME, "e"), new Node(Token.BLOCK));
    flowScope = ti.flowThrough(catchNode, flowScope);
    assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), catchNode.getFirstChild().getJSType());

    Node switchNode = new Node(Token.SWITCH, Node.newNumber(1), new Node(Token.BLOCK));
    flowScope = ti.flowThrough(switchNode, flowScope);

    Node objName = Node.newString(Token.NAME, "obj");
    objName.setJSType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
    Node getProp = new Node(Token.GETPROP, objName, Node.newString("prop"));
    Node exprResult = new Node(Token.EXPR_RESULT, getProp);
    flowScope = ti.flowThrough(exprResult, flowScope);
  }

  @Test
  public void testFlowThrough_typeCastAnnotation() {
    Node script = new Node(Token.SCRIPT);
    Scope scope = createGlobalScope(script);
    TypeInference ti = createTypeInference(script, scope);
    FlowScope flowScope = ti.createEntryLattice();

    Node name = Node.newString(Token.NAME, "castedVar");
    JSDocInfoBuilder builder = new JSDocInfoBuilder(true);
    builder.recordType(new JSTypeExpression(Node.newString("number"), "test"));
    JSDocInfo jsdoc = builder.build(name);
    name.setJSDocInfo(jsdoc);

    Node exprResult = new Node(Token.EXPR_RESULT, name);
    flowScope = ti.flowThrough(name, flowScope);
    assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), name.getJSType());
  }

  @Test
  public void testBranchedFlowThrough_forInLoop() {
    Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "k"));
    Node forIn = new Node(Token.FOR, varNode, Node.newString(Token.NAME, "obj"), new Node(Token.BLOCK));
    Scope scope = createGlobalScope(forIn);

    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false, true);
    cfa.process(null, forIn);
    ControlFlowGraph<Node> cfg = cfa.getCfg();

    TypeInference ti = new TypeInference(compiler, cfg, rai, scope);
    FlowScope entry = ti.createEntryLattice();

    List<FlowScope> branched = ti.branchedFlowThrough(forIn, entry);
    assertNotNull(branched);
  }

  @Test
  public void testBranchedFlowThrough_ifAndCaseCondition() {
    Node ifNode = new Node(Token.IF, Node.newNumber(1), new Node(Token.BLOCK));
    Scope scope = createGlobalScope(ifNode);

    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false, true);
    cfa.process(null, ifNode);
    ControlFlowGraph<Node> cfg = cfa.getCfg();

    TypeInference ti = new TypeInference(compiler, cfg, rai, scope);
    FlowScope entry = ti.createEntryLattice();

    List<FlowScope> branched = ti.branchedFlowThrough(ifNode, entry);
    assertNotNull(branched);

    Node caseNode = new Node(Token.CASE, Node.newNumber(2), new Node(Token.BLOCK));
    cfa.process(null, caseNode);
    TypeInference tiCase = new TypeInference(compiler, cfa.getCfg(), rai, scope);
    List<FlowScope> branchedCase = tiCase.branchedFlowThrough(caseNode, entry);
    assertNotNull(branchedCase);
  }

  @Test
  public void testAssignOuterLocalVar() {
    Node parentScript = new Node(Token.SCRIPT);
    Scope parentScope = createGlobalScope(parentScript);
    Node localVar = Node.newString(Token.NAME, "outerLocal");
    parentScope.declare("outerLocal", localVar, null, null);

    Node functionBlock = new Node(Token.BLOCK);
    Scope innerScope = new Scope(parentScope, functionBlock);

    Node assign = new Node(Token.ASSIGN, Node.newString(Token.NAME, "outerLocal"), Node.newNumber(123));
    functionBlock.addChildToFront(assign);

    TypeInference ti = createTypeInference(functionBlock, innerScope);
    FlowScope flowScope = ti.createEntryLattice();
    ti.flowThrough(assign, flowScope);

    Multimap<Scope, Var> outerVars = ti.getAssignedOuterLocalVars();
    assertTrue(outerVars.containsKey(parentScope));
  }
}
