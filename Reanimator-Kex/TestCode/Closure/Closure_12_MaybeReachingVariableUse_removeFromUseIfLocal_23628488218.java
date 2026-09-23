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
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class MaybeReachingVariableUse_removeFromUseIfLocal_23628488218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term407;
     Object term446;

    public MaybeReachingVariableUse_removeFromUseIfLocal_23628488218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term409 = new HashMap();
        HashMap term426 = new HashMap();
        Set<Object> term21362 =  ((Map) term426).keySet();
        HashSet term425 = new HashSet((Collection<? extends Object>) term21362);
        term407 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object term408 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term417 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term421 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term431 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term408, term408.getClass(), "vars", term409);
        setField(term417, term417.getClass(), "vars", null);
        setField(term417, term417.getClass(), "parent", null);
        setIntField(term417, term417.getClass(), "depth", 0);
        setField(term417, term417.getClass(), "rootNode", null);
        setField(term417, term417.getClass(), "thisType", null);
        setBooleanField(term417, term417.getClass(), "isBottom", false);
        setField(term417, term417.getClass(), "arguments", null);
        setField(term408, term408.getClass(), "parent", term417);
        setIntField(term408, term408.getClass(), "depth", 71190297);
        setIntField(term421, term421.getClass(), "type", 0);
        setField(term421, term421.getClass(), "next", null);
        setField(term421, term421.getClass(), "first", null);
        setField(term421, term421.getClass(), "last", null);
        setField(term421, term421.getClass(), "propListHead", null);
        setIntField(term421, term421.getClass(), "sourcePosition", 0);
        setField(term421, term421.getClass(), "jsType", null);
        setField(term421, term421.getClass(), "parent", null);
        setField(term408, term408.getClass(), "rootNode", term421);
        setField(term408, term408.getClass(), "thisType", null);
        setBooleanField(term408, term408.getClass(), "isBottom", false);
        setField(term408, term408.getClass(), "arguments", null);
        setField(term407, term407.getClass(), "jsScope", term408);
        setField(term407, term407.getClass(), "escaped", term425);
        setField(term431, term431.getClass(), "implicitReturn", null);
        setField(term431, term431.getClass(), "entry", null);
        setField(term431, term431.getClass(), "nodes", null);
        setBooleanField(term431, term431.getClass(), "useNodeAnnotations", false);
        setBooleanField(term431, term431.getClass(), "useEdgeAnnotations", false);
        setField(term431, term431.getClass(), "nodeAnnotationStack", null);
        setField(term431, term431.getClass(), "edgeAnnotationStack", null);
        setField(term407, term407.getClass(), "cfg", term431);
        setField(term407, term407.getClass(), "joinOp", null);
        setField(term407, term407.getClass(), "orderedWorkSet", null);
        HashMap term449 = new HashMap();
        term446 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        Object term447 = newInstance(Class.forName("com.google.common.collect.HashMultimap"));
        setIntField(term447, term447.getClass(), "expectedValuesPerKey", 8);
        setField(term447, term447.getClass(), "map", term449);
        setIntField(term447, term447.getClass(), "totalSize", 0);
        setField(term447, term447.getClass(), "keySet", null);
        setField(term447, term447.getClass(), "multiset", null);
        setField(term447, term447.getClass(), "valuesCollection", null);
        setField(term447, term447.getClass(), "entries", null);
        setField(term447, term447.getClass(), "asMap", null);
        setField(term446, term446.getClass(), "mayUseMap", term447);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Object[] args = new Object[2];
        args[0] = "pCTimMblYc";
        args[1] = term446;
        try {
            callMethod(klass, "removeFromUseIfLocal", argTypes, term407, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


