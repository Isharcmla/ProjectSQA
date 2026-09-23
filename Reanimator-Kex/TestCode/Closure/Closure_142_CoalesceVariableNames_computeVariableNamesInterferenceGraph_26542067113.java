package com.google.javascript.jscomp;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayDeque;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class CoalesceVariableNames_computeVariableNamesInterferenceGraph_26542067113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term352;
     Object term358;
     Object term407;
     Object term437;

    public CoalesceVariableNames_computeVariableNamesInterferenceGraph_26542067113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term353 = new ArrayDeque();
        term352 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        setField(term352, term352.getClass(), "compiler", null);
        setField(term352, term352.getClass(), "colorings", term353);
        setBooleanField(term352, term352.getClass(), "usePseudoNames", true);
        Object term376 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term376, term376.getClass(), "vars", null);
        setField(term376, term376.getClass(), "parent", null);
        setField(term376, term376.getClass(), "rootNode", null);
        setField(term376, term376.getClass(), "thisType", null);
        setBooleanField(term376, term376.getClass(), "isBottom", false);
        Object term378 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term378, term378.getClass(), "vars", null);
        setField(term378, term378.getClass(), "parent", null);
        setField(term378, term378.getClass(), "rootNode", null);
        setField(term378, term378.getClass(), "thisType", null);
        setBooleanField(term378, term378.getClass(), "isBottom", false);
        Object term380 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term380, term380.getClass(), "vars", null);
        setField(term380, term380.getClass(), "parent", null);
        setField(term380, term380.getClass(), "rootNode", null);
        setField(term380, term380.getClass(), "thisType", null);
        setBooleanField(term380, term380.getClass(), "isBottom", false);
        ArrayDeque term374 = new ArrayDeque();
        ((ArrayDeque) term374).add(term376);
        ((ArrayDeque) term374).add(term378);
        ((ArrayDeque) term374).add(term380);
        Object term386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term386, term386.getClass(), "type", 0);
        setField(term386, term386.getClass(), "next", null);
        setField(term386, term386.getClass(), "first", null);
        setField(term386, term386.getClass(), "last", null);
        setField(term386, term386.getClass(), "propListHead", null);
        setIntField(term386, term386.getClass(), "sourcePosition", 0);
        setField(term386, term386.getClass(), "jsType", null);
        setField(term386, term386.getClass(), "parent", null);
        ArrayDeque term384 = new ArrayDeque();
        ((ArrayDeque) term384).add(term386);
        ArrayDeque term391 = new ArrayDeque();
        term358 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term364 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term370 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term358, term358.getClass(), "compiler", null);
        setField(term358, term358.getClass(), "callback", null);
        setIntField(term359, term359.getClass(), "type", 1551099402);
        setIntField(term361, term361.getClass(), "type", 0);
        setField(term361, term361.getClass(), "next", null);
        setField(term361, term361.getClass(), "first", null);
        setField(term361, term361.getClass(), "last", null);
        setField(term361, term361.getClass(), "propListHead", null);
        setIntField(term361, term361.getClass(), "sourcePosition", 0);
        setField(term361, term361.getClass(), "jsType", null);
        setField(term361, term361.getClass(), "parent", null);
        setField(term359, term359.getClass(), "next", term361);
        setIntField(term364, term364.getClass(), "type", 0);
        setField(term364, term364.getClass(), "next", null);
        setField(term364, term364.getClass(), "first", null);
        setField(term364, term364.getClass(), "last", null);
        setField(term364, term364.getClass(), "propListHead", null);
        setIntField(term364, term364.getClass(), "sourcePosition", 0);
        setField(term364, term364.getClass(), "jsType", null);
        setField(term364, term364.getClass(), "parent", null);
        setField(term359, term359.getClass(), "first", term364);
        setIntField(term367, term367.getClass(), "type", 0);
        setField(term367, term367.getClass(), "next", null);
        setField(term367, term367.getClass(), "first", null);
        setField(term367, term367.getClass(), "last", null);
        setField(term367, term367.getClass(), "propListHead", null);
        setIntField(term367, term367.getClass(), "sourcePosition", 0);
        setField(term367, term367.getClass(), "jsType", null);
        setField(term367, term367.getClass(), "parent", null);
        setField(term359, term359.getClass(), "last", term367);
        setField(term370, term370.getClass(), "next", null);
        setIntField(term370, term370.getClass(), "type", 0);
        setIntField(term370, term370.getClass(), "intValue", 0);
        setField(term370, term370.getClass(), "objectValue", null);
        setField(term359, term359.getClass(), "propListHead", term370);
        setIntField(term359, term359.getClass(), "sourcePosition", -478195677);
        setField(term359, term359.getClass(), "jsType", null);
        setField(term359, term359.getClass(), "parent", null);
        setField(term358, term358.getClass(), "curNode", term359);
        setField(term358, term358.getClass(), "scopes", term374);
        setField(term358, term358.getClass(), "scopeRoots", term384);
        setField(term358, term358.getClass(), "cfgs", term391);
        setField(term358, term358.getClass(), "sourceName", "xxtlPwDYFs");
        setField(term358, term358.getClass(), "scopeCreator", null);
        setField(term358, term358.getClass(), "scopeCallback", null);
        HashMap term408 = new HashMap();
        Object term415 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        Object[] term416 = (Object[]) newArray("java.lang.Object", 8);
        setField(term415, term415.getClass(), "elementData", term416);
        setIntField(term415, term415.getClass(), "size", 972867650);
        setIntField(term415, term415.getClass(), "modCount", 1655935355);
        Object term419 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        Object[] term420 = (Object[]) newArray("java.lang.Object", 6);
        setField(term419, term419.getClass(), "elementData", term420);
        setIntField(term419, term419.getClass(), "size", -481533957);
        setIntField(term419, term419.getClass(), "modCount", 1240914516);
        ArrayDeque term413 = new ArrayDeque();
        ((ArrayDeque) term413).add(term415);
        ((ArrayDeque) term413).add(term419);
        Object term427 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        Object[] term428 = (Object[]) newArray("java.lang.Object", 1);
        setField(term427, term427.getClass(), "elementData", term428);
        setIntField(term427, term427.getClass(), "size", -1465035361);
        setIntField(term427, term427.getClass(), "modCount", 1090617576);
        Object term431 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        Object[] term432 = (Object[]) newArray("java.lang.Object", 9);
        setField(term431, term431.getClass(), "elementData", term432);
        setIntField(term431, term431.getClass(), "size", -1547384488);
        setIntField(term431, term431.getClass(), "modCount", 1442160736);
        ArrayDeque term425 = new ArrayDeque();
        ((ArrayDeque) term425).add(term427);
        ((ArrayDeque) term425).add(term431);
        term407 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term407, term407.getClass(), "implicitReturn", null);
        setField(term407, term407.getClass(), "entry", null);
        setField(term407, term407.getClass(), "nodes", term408);
        setField(term407, term407.getClass(), "nodeAnnotationStack", term413);
        setField(term407, term407.getClass(), "edgeAnnotationStack", term425);
        HashMap term438 = new HashMap();
        Set<Object> term2109 =  ((Map) term438).keySet();
        term437 = new HashSet((Collection<? extends Object>) term2109);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.ControlFlowGraph");
        argTypes[2] = Class.forName("java.util.Set");
        Object[] args = new Object[3];
        args[0] = term358;
        args[1] = term407;
        args[2] = term437;
        try {
            callMethod(klass, "computeVariableNamesInterferenceGraph", argTypes, term352, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


