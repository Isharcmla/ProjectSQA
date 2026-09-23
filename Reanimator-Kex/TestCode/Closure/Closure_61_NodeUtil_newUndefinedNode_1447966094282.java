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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class NodeUtil_newUndefinedNode_1447966094282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2941;
     Object term19821;
     Object term19733;

    public NodeUtil_newUndefinedNode_1447966094282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2951 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2941, term2941.getClass(), "type", -1671982964);
        setIntField(term2943, term2943.getClass(), "type", 1363887997);
        setIntField(term2945, term2945.getClass(), "type", 0);
        setField(term2945, term2945.getClass(), "next", null);
        setField(term2945, term2945.getClass(), "first", null);
        setField(term2945, term2945.getClass(), "last", null);
        setField(term2945, term2945.getClass(), "propListHead", null);
        setIntField(term2945, term2945.getClass(), "sourcePosition", 0);
        setField(term2945, term2945.getClass(), "jsType", null);
        setField(term2945, term2945.getClass(), "parent", null);
        setField(term2943, term2943.getClass(), "next", term2945);
        setIntField(term2948, term2948.getClass(), "type", 0);
        setField(term2948, term2948.getClass(), "next", null);
        setField(term2948, term2948.getClass(), "first", null);
        setField(term2948, term2948.getClass(), "last", null);
        setField(term2948, term2948.getClass(), "propListHead", null);
        setIntField(term2948, term2948.getClass(), "sourcePosition", 0);
        setField(term2948, term2948.getClass(), "jsType", null);
        setField(term2948, term2948.getClass(), "parent", null);
        setField(term2943, term2943.getClass(), "first", term2948);
        setIntField(term2951, term2951.getClass(), "type", 0);
        setField(term2951, term2951.getClass(), "next", null);
        setField(term2951, term2951.getClass(), "first", null);
        setField(term2951, term2951.getClass(), "last", null);
        setField(term2951, term2951.getClass(), "propListHead", null);
        setIntField(term2951, term2951.getClass(), "sourcePosition", 0);
        setField(term2951, term2951.getClass(), "jsType", null);
        setField(term2951, term2951.getClass(), "parent", null);
        setField(term2943, term2943.getClass(), "last", term2951);
        setField(term2943, term2943.getClass(), "propListHead", null);
        setIntField(term2943, term2943.getClass(), "sourcePosition", 0);
        setField(term2943, term2943.getClass(), "jsType", null);
        setField(term2943, term2943.getClass(), "parent", null);
        setField(term2941, term2941.getClass(), "next", term2943);
        setIntField(term2955, term2955.getClass(), "type", 0);
        setField(term2955, term2955.getClass(), "next", null);
        setField(term2955, term2955.getClass(), "first", null);
        setField(term2955, term2955.getClass(), "last", null);
        setField(term2955, term2955.getClass(), "propListHead", null);
        setIntField(term2955, term2955.getClass(), "sourcePosition", 0);
        setField(term2955, term2955.getClass(), "jsType", null);
        setField(term2955, term2955.getClass(), "parent", null);
        setField(term2941, term2941.getClass(), "first", term2955);
        setIntField(term2958, term2958.getClass(), "type", 0);
        setField(term2958, term2958.getClass(), "next", null);
        setField(term2958, term2958.getClass(), "first", null);
        setField(term2958, term2958.getClass(), "last", null);
        setField(term2958, term2958.getClass(), "propListHead", null);
        setIntField(term2958, term2958.getClass(), "sourcePosition", 0);
        setField(term2958, term2958.getClass(), "jsType", null);
        setField(term2958, term2958.getClass(), "parent", null);
        setField(term2941, term2941.getClass(), "last", term2958);
        setField(term2941, term2941.getClass(), "propListHead", null);
        setIntField(term2941, term2941.getClass(), "sourcePosition", 0);
        setField(term2941, term2941.getClass(), "jsType", null);
        setField(term2941, term2941.getClass(), "parent", null);
        term19821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19822 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19821, term19821.getClass(), "type", -1671982964);
        setIntField(term19822, term19822.getClass(), "type", 1363887997);
        setIntField(term19823, term19823.getClass(), "type", 0);
        setField(term19823, term19823.getClass(), "next", null);
        setField(term19823, term19823.getClass(), "first", null);
        setField(term19823, term19823.getClass(), "last", null);
        setField(term19823, term19823.getClass(), "propListHead", null);
        setIntField(term19823, term19823.getClass(), "sourcePosition", 0);
        setField(term19823, term19823.getClass(), "jsType", null);
        setField(term19823, term19823.getClass(), "parent", null);
        setField(term19822, term19822.getClass(), "next", term19823);
        setIntField(term19824, term19824.getClass(), "type", 0);
        setField(term19824, term19824.getClass(), "next", null);
        setField(term19824, term19824.getClass(), "first", null);
        setField(term19824, term19824.getClass(), "last", null);
        setField(term19824, term19824.getClass(), "propListHead", null);
        setIntField(term19824, term19824.getClass(), "sourcePosition", 0);
        setField(term19824, term19824.getClass(), "jsType", null);
        setField(term19824, term19824.getClass(), "parent", null);
        setField(term19822, term19822.getClass(), "first", term19824);
        setIntField(term19825, term19825.getClass(), "type", 0);
        setField(term19825, term19825.getClass(), "next", null);
        setField(term19825, term19825.getClass(), "first", null);
        setField(term19825, term19825.getClass(), "last", null);
        setField(term19825, term19825.getClass(), "propListHead", null);
        setIntField(term19825, term19825.getClass(), "sourcePosition", 0);
        setField(term19825, term19825.getClass(), "jsType", null);
        setField(term19825, term19825.getClass(), "parent", null);
        setField(term19822, term19822.getClass(), "last", term19825);
        setField(term19822, term19822.getClass(), "propListHead", null);
        setIntField(term19822, term19822.getClass(), "sourcePosition", 0);
        setField(term19822, term19822.getClass(), "jsType", null);
        setField(term19822, term19822.getClass(), "parent", null);
        setField(term19821, term19821.getClass(), "next", term19822);
        setIntField(term19826, term19826.getClass(), "type", 0);
        setField(term19826, term19826.getClass(), "next", null);
        setField(term19826, term19826.getClass(), "first", null);
        setField(term19826, term19826.getClass(), "last", null);
        setField(term19826, term19826.getClass(), "propListHead", null);
        setIntField(term19826, term19826.getClass(), "sourcePosition", 0);
        setField(term19826, term19826.getClass(), "jsType", null);
        setField(term19826, term19826.getClass(), "parent", null);
        setField(term19821, term19821.getClass(), "first", term19826);
        setIntField(term19827, term19827.getClass(), "type", 0);
        setField(term19827, term19827.getClass(), "next", null);
        setField(term19827, term19827.getClass(), "first", null);
        setField(term19827, term19827.getClass(), "last", null);
        setField(term19827, term19827.getClass(), "propListHead", null);
        setIntField(term19827, term19827.getClass(), "sourcePosition", 0);
        setField(term19827, term19827.getClass(), "jsType", null);
        setField(term19827, term19827.getClass(), "parent", null);
        setField(term19821, term19821.getClass(), "last", term19827);
        setField(term19821, term19821.getClass(), "propListHead", null);
        setIntField(term19821, term19821.getClass(), "sourcePosition", 0);
        setField(term19821, term19821.getClass(), "jsType", null);
        setField(term19821, term19821.getClass(), "parent", null);
        term19733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19735 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term19733, term19733.getClass(), "type", 122);
        setField(term19733, term19733.getClass(), "next", null);
        setDoubleField(term19735, term19735.getClass(), "number", 0.0);
        setIntField(term19735, term19735.getClass(), "type", 39);
        setField(term19735, term19735.getClass(), "next", null);
        setField(term19735, term19735.getClass(), "first", null);
        setField(term19735, term19735.getClass(), "last", null);
        setField(term19735, term19735.getClass(), "propListHead", null);
        setIntField(term19735, term19735.getClass(), "sourcePosition", 0);
        setField(term19735, term19735.getClass(), "jsType", null);
        setField(term19735, term19735.getClass(), "parent", term19733);
        setField(term19733, term19733.getClass(), "first", term19735);
        setField(term19733, term19733.getClass(), "last", term19735);
        setField(term19733, term19733.getClass(), "propListHead", null);
        setIntField(term19733, term19733.getClass(), "sourcePosition", 0);
        setField(term19733, term19733.getClass(), "jsType", null);
        setField(term19733, term19733.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2941;
        Object retValue = callMethod(klass, "newUndefinedNode", argTypes, null, args);
        assertTrue(recursiveEquals(term2941, term19821));
        assertTrue(recursiveEquals(retValue, term19733));
    }

};


