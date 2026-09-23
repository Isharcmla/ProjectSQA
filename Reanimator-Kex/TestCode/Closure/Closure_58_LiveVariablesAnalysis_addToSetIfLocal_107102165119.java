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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class LiveVariablesAnalysis_addToSetIfLocal_107102165119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278;
     Object term305;
     Object term326;

    public LiveVariablesAnalysis_addToSetIfLocal_107102165119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term280 = new HashMap();
        HashMap term297 = new HashMap();
        Set<Object> term1996 =  ((Map) term297).keySet();
        HashSet term296 = new HashSet((Collection<? extends Object>) term1996);
        term278 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        Object term279 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term288 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term292 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term302 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term279, term279.getClass(), "vars", term280);
        setField(term288, term288.getClass(), "vars", null);
        setField(term288, term288.getClass(), "parent", null);
        setIntField(term288, term288.getClass(), "depth", 0);
        setField(term288, term288.getClass(), "rootNode", null);
        setField(term288, term288.getClass(), "thisType", null);
        setBooleanField(term288, term288.getClass(), "isBottom", false);
        setField(term288, term288.getClass(), "arguments", null);
        setField(term279, term279.getClass(), "parent", term288);
        setIntField(term279, term279.getClass(), "depth", -1476117762);
        setIntField(term292, term292.getClass(), "type", 0);
        setField(term292, term292.getClass(), "next", null);
        setField(term292, term292.getClass(), "first", null);
        setField(term292, term292.getClass(), "last", null);
        setField(term292, term292.getClass(), "propListHead", null);
        setIntField(term292, term292.getClass(), "sourcePosition", 0);
        setField(term292, term292.getClass(), "jsType", null);
        setField(term292, term292.getClass(), "parent", null);
        setField(term279, term279.getClass(), "rootNode", term292);
        setField(term279, term279.getClass(), "thisType", null);
        setBooleanField(term279, term279.getClass(), "isBottom", false);
        setField(term279, term279.getClass(), "arguments", null);
        setField(term278, term278.getClass(), "jsScope", term279);
        setField(term278, term278.getClass(), "escaped", term296);
        setField(term302, term302.getClass(), "implicitReturn", null);
        setField(term302, term302.getClass(), "entry", null);
        setField(term302, term302.getClass(), "nodes", null);
        setBooleanField(term302, term302.getClass(), "useNodeAnnotations", false);
        setBooleanField(term302, term302.getClass(), "useEdgeAnnotations", false);
        setField(term302, term302.getClass(), "nodeAnnotationStack", null);
        setField(term302, term302.getClass(), "edgeAnnotationStack", null);
        setField(term278, term278.getClass(), "cfg", term302);
        setField(term278, term278.getClass(), "joinOp", null);
        setField(term278, term278.getClass(), "orderedWorkSet", null);
        term305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term312 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term305, term305.getClass(), "type", 1141317871);
        setIntField(term307, term307.getClass(), "type", -1963434938);
        setIntField(term309, term309.getClass(), "type", 0);
        setField(term309, term309.getClass(), "next", null);
        setField(term309, term309.getClass(), "first", null);
        setField(term309, term309.getClass(), "last", null);
        setField(term309, term309.getClass(), "propListHead", null);
        setIntField(term309, term309.getClass(), "sourcePosition", 0);
        setField(term309, term309.getClass(), "jsType", null);
        setField(term309, term309.getClass(), "parent", null);
        setField(term307, term307.getClass(), "next", term309);
        setIntField(term312, term312.getClass(), "type", 0);
        setField(term312, term312.getClass(), "next", null);
        setField(term312, term312.getClass(), "first", null);
        setField(term312, term312.getClass(), "last", null);
        setField(term312, term312.getClass(), "propListHead", null);
        setIntField(term312, term312.getClass(), "sourcePosition", 0);
        setField(term312, term312.getClass(), "jsType", null);
        setField(term312, term312.getClass(), "parent", null);
        setField(term307, term307.getClass(), "first", term312);
        setIntField(term315, term315.getClass(), "type", 0);
        setField(term315, term315.getClass(), "next", null);
        setField(term315, term315.getClass(), "first", null);
        setField(term315, term315.getClass(), "last", null);
        setField(term315, term315.getClass(), "propListHead", null);
        setIntField(term315, term315.getClass(), "sourcePosition", 0);
        setField(term315, term315.getClass(), "jsType", null);
        setField(term315, term315.getClass(), "parent", null);
        setField(term307, term307.getClass(), "last", term315);
        setField(term307, term307.getClass(), "propListHead", null);
        setIntField(term307, term307.getClass(), "sourcePosition", 0);
        setField(term307, term307.getClass(), "jsType", null);
        setField(term307, term307.getClass(), "parent", null);
        setField(term305, term305.getClass(), "next", term307);
        setIntField(term319, term319.getClass(), "type", 0);
        setField(term319, term319.getClass(), "next", null);
        setField(term319, term319.getClass(), "first", null);
        setField(term319, term319.getClass(), "last", null);
        setField(term319, term319.getClass(), "propListHead", null);
        setIntField(term319, term319.getClass(), "sourcePosition", 0);
        setField(term319, term319.getClass(), "jsType", null);
        setField(term319, term319.getClass(), "parent", null);
        setField(term305, term305.getClass(), "first", term319);
        setIntField(term322, term322.getClass(), "type", 0);
        setField(term322, term322.getClass(), "next", null);
        setField(term322, term322.getClass(), "first", null);
        setField(term322, term322.getClass(), "last", null);
        setField(term322, term322.getClass(), "propListHead", null);
        setIntField(term322, term322.getClass(), "sourcePosition", 0);
        setField(term322, term322.getClass(), "jsType", null);
        setField(term322, term322.getClass(), "parent", null);
        setField(term305, term305.getClass(), "last", term322);
        setField(term305, term305.getClass(), "propListHead", null);
        setIntField(term305, term305.getClass(), "sourcePosition", 0);
        setField(term305, term305.getClass(), "jsType", null);
        setField(term305, term305.getClass(), "parent", null);
        term326 = newInstance(Class.forName("java.util.BitSet"));
        long[] term327 = (long[]) newLongArray(1);
        setField(term326, term326.getClass(), "words", term327);
        setIntField(term326, term326.getClass(), "wordsInUse", 1386130016);
        setBooleanField(term326, term326.getClass(), "sizeIsSticky", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.BitSet");
        Object[] args = new Object[2];
        args[0] = term305;
        args[1] = term326;
        try {
            callMethod(klass, "addToSetIfLocal", argTypes, term278, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


