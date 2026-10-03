package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Maps;
import com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TypeInferenceTest {

  private Compiler compiler;
  private JSTypeRegistry registry;
  private Map<String, AssertionFunctionSpec> assertionFunctionsMap;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    registry = compiler.getTypeRegistry();
    assertionFunctionsMap = Maps.newHashMap();
  }

  private TypeInference createTypeInference(Node root, Scope scope) {
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false, false);
    cfa.process(null, root);
    ControlFlowGraph<Node> cfg = cfa.getCfg();
    ReverseAbstractInterpreter rai =
        new SemanticReverseAbstractInterpreter(
            compiler.getCodingConvention(), registry);
    return new TypeInference(compiler, cfg, rai, scope, assertionFunctionsMap);
  }

  private Scope createSyntacticScope(Node root) {
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    return scopeCreator.createScope(root, null);
  }

  @Test
  public void testCreateInitialEstimateLattice_notNull() {
    Node script = new Node(Token.SCRIPT);
    Scope scope = createSyntacticScope(script);
    TypeInference ti = createTypeInference(script, scope);

    FlowScope estimate = ti.createInitialEstimateLattice();
    assertNotNull(estimate);
  }

  @Test
  public void testCreateEntryLattice_withDeclaredUnboundVar() {
    Node varNode = Node.newString(Token.NAME, "x");
    Node varParent = new Node(Token.VAR, varNode);
    Node script = new Node(Token.SCRIPT, varParent);
    Scope scope = createSyntacticScope(script);
    TypeInference ti = createTypeInference(script, scope);

    FlowScope entry = ti.createEntryLattice();
    assertNotNull(entry);
    assertEquals(registry.getNativeType(JSTypeNative.VOID_TYPE), entry.getSlot("x").getType());
  }

  @Test
  public void testFlowThrough_bottomScope_returnsInput() {
    Node script = new Node(Token.SCRIPT);
    Scope scope = createSyntacticScope(script);
    TypeInference ti = createTypeInference(script, scope);

    FlowScope bottom = ti.createInitialEstimateLattice();
    FlowScope result = ti.flowThrough(script, bottom);
    assertEquals(bottom, result);
  }

  @Test
  public void testFlowThrough_varAssignmentAndName() {
    Node num = Node.newNumber(42);
    Node name = Node.newString(Token.NAME, "x");
    name.addChildToFront(num);
    Node var = new Node(Token.VAR, name);
    Node script = new Node(Token.SCRIPT, var);

    Scope scope = createSyntacticScope(script);
    TypeInference ti = createTypeInference(script, scope);

    FlowScope entry = ti.createEntryLattice();
    FlowScope out = ti.flowThrough(var, entry);

    assertNotNull(out);
    assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), name.getJSType());
  }

  @Test
  public void testFlowThrough_assignAndGetProp() {
    Node obj = Node.newString(Token.NAME, "a");
    obj.setJSType(registry.getNativeType(JSTypeNative.OBJECT_TYPE));
    Node prop = Node.newString(Token.STRING, "b");
    Node getprop = new Node(Token.GETPROP, obj, prop);

    Node val = Node.newString(Token.STRING, "hello");
    val.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));

    Node assign = new Node(Token.ASSIGN, getprop, val);
    Node script = new Node(Token.SCRIPT, assign);

    Scope scope = createSyntacticScope(script);
    TypeInference ti = createTypeInference(script, scope);

    FlowScope out = ti.flowThrough(assign, ti.createEntryLattice());
    assertNotNull(out);
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), assign.getJSType());
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), getprop.getJSType());
  }

  @Test
  public void testFlowThrough_addOperation() {
    Node left = Node.newNumber(1);
    left.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    Node right = Node.newNumber(2);
    right.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    Node add = new Node(Token.ADD, left, right);
    Node script = new Node(Token.SCRIPT, add);

    Scope scope = createSyntacticScope(script);
    TypeInference ti = createTypeInference(script, scope);

    FlowScope out = ti.flowThrough(add, ti.createEntryLattice());
    assertNotNull(out);
    assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), add.getJSType());

    // Add string + number -> string
    Node str = Node.newString("s");
    str.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
    Node addStr = new Node(Token.ADD, str, right);
    ti.flowThrough(addStr, ti.createEntryLattice());
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), addStr.getJSType());
  }

  @Test
  public void testFlowThrough_hookAndLogicalOps() {
    Node cond = Node.newString(Token.NAME, "cond");
    cond.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
    Node trueBranch = Node.newNumber(1);
    trueBranch.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    Node falseBranch = Node.newString("str");
    falseBranch.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));

    Node hook = new Node(Token.HOOK, cond, trueBranch, falseBranch);
    Node script = new Node(Token.SCRIPT, hook);

    Scope scope = createSyntacticScope(script);
    TypeInference ti = createTypeInference(script, scope);

    FlowScope out = ti.flowThrough(hook, ti.createEntryLattice());
    assertNotNull(out);
    assertNotNull(hook.getJSType());
    assertTrue(hook.getJSType().isUnionType());

    // Test AND & OR nodes
    Node left = Node.newNumber(1);
    left.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    Node right = Node.newNumber(2);
    right.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    Node andNode = new Node(Token.AND, left, right);
    ti.flowThrough(andNode, ti.createEntryLattice());
    assertNotNull(andNode.getJSType());

    Node orNode = new Node(Token.OR, left.cloneTree(), right.cloneTree());
    ti.flowThrough(orNode, ti.createEntryLattice());
    assertNotNull(orNode.getJSType());
  }

  @Test
  public void testFlowThrough_objectLiteralAndArrayLiteral() {
    Node objLit = new Node(Token.OBJECTLIT);
    objLit.setJSType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));

    Node arrLit = new Node(Token.ARRAYLIT);
    Node script = new Node(Token.SCRIPT, objLit, arrLit);

    Scope scope = createSyntacticScope(script);
    TypeInference ti = createTypeInference(script, scope);

    FlowScope out = ti.flowThrough(objLit, ti.createEntryLattice());
    assertNotNull(out);

    out = ti.flowThrough(arrLit, out);
    assertEquals(registry.getNativeType(JSTypeNative.ARRAY_TYPE), arrLit.getJSType());
  }

  @Test
  public void testFlowThrough_callAndNew() {
    Node fn = Node.newString(Token.NAME, "fn");
    fn.setJSType(registry.createFunctionType(registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
    Node call = new Node(Token.CALL, fn);

    Node ctor = Node.newString(Token.NAME, "ctor");
    ctor.setJSType(registry.createConstructorType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE)));
    Node newObj = new Node(Token.NEW, ctor);

    Node script = new Node(Token.SCRIPT, call, newObj);
    Scope scope = createSyntacticScope(script);
    TypeInference ti = createTypeInference(script, scope);

    ti.flowThrough(call, ti.createEntryLattice());
    assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), call.getJSType());

    ti.flowThrough(newObj, ti.createEntryLattice());
    assertEquals(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), newObj.getJSType());
  }

  @Test
  public void testFlowThrough_unaryAndComparisonTokens() {
    Node num = Node.newNumber(5);
    num.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

    Node pos = new Node(Token.POS, num);
    Node neg = new Node(Token.NEG, num.cloneTree());
    Node inc = new Node(Token.INC, num.cloneTree());
    Node typeof = new Node(Token.TYPEOF, num.cloneTree());
    Node eq = new Node(Token.EQ, num.cloneTree(), num.cloneTree());
    Node thisNode = new Node(Token.THIS);

    Node script = new Node(Token.SCRIPT, pos, neg, inc, typeof, eq, thisNode);
    Scope scope = createSyntacticScope(script);
    TypeInference ti = createTypeInference(script, scope);
    FlowScope entry = ti.createEntryLattice();

    ti.flowThrough(pos, entry);
    assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), pos.getJSType());

    ti.flowThrough(neg, entry);
    assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), neg.getJSType());

    ti.flowThrough(inc, entry);
    assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), inc.getJSType());

    ti.flowThrough(typeof, entry);
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), typeof.getJSType());

    ti.flowThrough(eq, entry);
    assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), eq.getJSType());

    ti.flowThrough(thisNode, entry);
    assertEquals(entry.getTypeOfThis(), thisNode.getJSType());
  }

  @Test
  public void testFlowThrough_catchAndReturn() {
    Node catchVar = Node.newString(Token.NAME, "e");
    Node catchBlock = new Node(Token.BLOCK);
    Node catchNode = new Node(Token.CATCH, catchVar, catchBlock);

    Node retVal = Node.newNumber(10);
    retVal.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    Node retNode = new Node(Token.RETURN, retVal);

    Node script = new Node(Token.SCRIPT, catchNode, retNode);
    Scope scope = createSyntacticScope(script);
    TypeInference ti = createTypeInference(script, scope);
    FlowScope entry = ti.createEntryLattice();

    ti.flowThrough(catchNode, entry);
    assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), catchVar.getJSType());

    FlowScope out = ti.flowThrough(retNode, entry);
    assertNotNull(out);
  }

  @Test
  public void testBranchedFlowThrough_ifBranches() {
    Node cond = Node.newString(Token.NAME, "cond");
    cond.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
    Node thenBlock = new Node(Token.BLOCK);
    Node elseBlock = new Node(Token.BLOCK);
    Node ifNode = new Node(Token.IF, cond, thenBlock, elseBlock);
    Node script = new Node(Token.SCRIPT, ifNode);

    Scope scope = createSyntacticScope(script);
    TypeInference ti = createTypeInference(script, scope);

    List<FlowScope> branches = ti.branchedFlowThrough(ifNode, ti.createEntryLattice());
    assertNotNull(branches);
  }

  @Test
  public void testBranchedFlowThrough_forInLoop() {
    Node varNode = Node.newString(Token.NAME, "prop");
    Node varDecl = new Node(Token.VAR, varNode);
    Node objNode = Node.newString(Token.NAME, "obj");
    objNode.setJSType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
    Node body = new Node(Token.BLOCK);

    Node forIn = new Node(Token.FOR, varDecl, objNode, body);
    Node script = new Node(Token.SCRIPT, forIn);

    Scope scope = createSyntacticScope(script);
    TypeInference ti = createTypeInference(script, scope);

    List<FlowScope> branches = ti.branchedFlowThrough(forIn, ti.createEntryLattice());
    assertNotNull(branches);
  }

  @Test
  public void testGetBooleanOutcomes_allCombinations() {
    BooleanLiteralSet both = BooleanLiteralSet.BOTH;
    BooleanLiteralSet trueSet = BooleanLiteralSet.TRUE;
    BooleanLiteralSet falseSet = BooleanLiteralSet.FALSE;
    BooleanLiteralSet empty = BooleanLiteralSet.EMPTY;

    assertEquals(both, TypeInference.getBooleanOutcomes(both, both, true));
    assertEquals(both, TypeInference.getBooleanOutcomes(both, both, false));
    assertEquals(trueSet, TypeInference.getBooleanOutcomes(trueSet, trueSet, true));
    assertEquals(falseSet, TypeInference.getBooleanOutcomes(falseSet, falseSet, false));
    assertEquals(empty, TypeInference.getBooleanOutcomes(empty, empty, true));
  }

  @Test
  public void testTightenTypesAfterAssertions() {
    AssertionFunctionSpec assertSpec =
        new AssertionFunctionSpec("assertNotNull", JSTypeNative.OBJECT_TYPE);
    assertionFunctionsMap.put("assertNotNull", assertSpec);

    Node fnName = Node.newString(Token.NAME, "assertNotNull");
    Node arg = Node.newString(Token.NAME, "x");
    arg.setJSType(registry.createNullableType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE)));
    Node call = new Node(Token.CALL, fnName, arg);

    Node script = new Node(Token.SCRIPT, call);
    Scope scope = createSyntacticScope(script);
    TypeInference ti = createTypeInference(script, scope);

    FlowScope out = ti.flowThrough(call, ti.createEntryLattice());
    assertNotNull(out);
  }
}
