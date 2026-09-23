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

public class DeadAssignmentsElimination_isVariableReadBeforeKill_177530494120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term914;
     Object term931;

    public DeadAssignmentsElimination_isVariableReadBeforeKill_177530494120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term917 = new HashMap();
        term914 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        Object term915 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        Object term916 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term923 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term914, term914.getClass(), "compiler", null);
        setField(term916, term916.getClass(), "vars", term917);
        setField(term923, term923.getClass(), "vars", null);
        setField(term923, term923.getClass(), "parent", null);
        setIntField(term923, term923.getClass(), "depth", 0);
        setField(term923, term923.getClass(), "rootNode", null);
        setField(term923, term923.getClass(), "thisType", null);
        setBooleanField(term923, term923.getClass(), "isBottom", false);
        setField(term916, term916.getClass(), "parent", term923);
        setIntField(term916, term916.getClass(), "depth", -1146679443);
        setIntField(term927, term927.getClass(), "type", 0);
        setField(term927, term927.getClass(), "next", null);
        setField(term927, term927.getClass(), "first", null);
        setField(term927, term927.getClass(), "last", null);
        setField(term927, term927.getClass(), "propListHead", null);
        setIntField(term927, term927.getClass(), "sourcePosition", 0);
        setField(term927, term927.getClass(), "jsType", null);
        setField(term927, term927.getClass(), "parent", null);
        setField(term916, term916.getClass(), "rootNode", term927);
        setField(term916, term916.getClass(), "thisType", null);
        setBooleanField(term916, term916.getClass(), "isBottom", false);
        setField(term915, term915.getClass(), "jsScope", term916);
        setField(term915, term915.getClass(), "escaped", null);
        setField(term915, term915.getClass(), "cfg", null);
        setField(term915, term915.getClass(), "joinOp", null);
        setField(term915, term915.getClass(), "orderedWorkSet", null);
        setField(term914, term914.getClass(), "liveness", term915);
        term931 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term935 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term944 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term951 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term954 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term931, term931.getClass(), "type", -1122880881);
        setIntField(term933, term933.getClass(), "type", -1692331299);
        setIntField(term935, term935.getClass(), "type", 0);
        setField(term935, term935.getClass(), "next", null);
        setField(term935, term935.getClass(), "first", null);
        setField(term935, term935.getClass(), "last", null);
        setField(term935, term935.getClass(), "propListHead", null);
        setIntField(term935, term935.getClass(), "sourcePosition", 0);
        setField(term935, term935.getClass(), "jsType", null);
        setField(term935, term935.getClass(), "parent", null);
        setField(term933, term933.getClass(), "next", term935);
        setIntField(term938, term938.getClass(), "type", 0);
        setField(term938, term938.getClass(), "next", null);
        setField(term938, term938.getClass(), "first", null);
        setField(term938, term938.getClass(), "last", null);
        setField(term938, term938.getClass(), "propListHead", null);
        setIntField(term938, term938.getClass(), "sourcePosition", 0);
        setField(term938, term938.getClass(), "jsType", null);
        setField(term938, term938.getClass(), "parent", null);
        setField(term933, term933.getClass(), "first", term938);
        setIntField(term941, term941.getClass(), "type", 0);
        setField(term941, term941.getClass(), "next", null);
        setField(term941, term941.getClass(), "first", null);
        setField(term941, term941.getClass(), "last", null);
        setField(term941, term941.getClass(), "propListHead", null);
        setIntField(term941, term941.getClass(), "sourcePosition", 0);
        setField(term941, term941.getClass(), "jsType", null);
        setField(term941, term941.getClass(), "parent", null);
        setField(term933, term933.getClass(), "last", term941);
        setField(term944, term944.getClass(), "next", null);
        setIntField(term944, term944.getClass(), "type", 0);
        setIntField(term944, term944.getClass(), "intValue", 0);
        setField(term944, term944.getClass(), "objectValue", null);
        setField(term933, term933.getClass(), "propListHead", term944);
        setIntField(term933, term933.getClass(), "sourcePosition", -130649791);
        setField(term933, term933.getClass(), "jsType", null);
        setField(term933, term933.getClass(), "parent", null);
        setField(term931, term931.getClass(), "next", term933);
        setIntField(term948, term948.getClass(), "type", 0);
        setField(term948, term948.getClass(), "next", null);
        setField(term948, term948.getClass(), "first", null);
        setField(term948, term948.getClass(), "last", null);
        setField(term948, term948.getClass(), "propListHead", null);
        setIntField(term948, term948.getClass(), "sourcePosition", 0);
        setField(term948, term948.getClass(), "jsType", null);
        setField(term948, term948.getClass(), "parent", null);
        setField(term931, term931.getClass(), "first", term948);
        setIntField(term951, term951.getClass(), "type", 0);
        setField(term951, term951.getClass(), "next", null);
        setField(term951, term951.getClass(), "first", null);
        setField(term951, term951.getClass(), "last", null);
        setField(term951, term951.getClass(), "propListHead", null);
        setIntField(term951, term951.getClass(), "sourcePosition", 0);
        setField(term951, term951.getClass(), "jsType", null);
        setField(term951, term951.getClass(), "parent", null);
        setField(term931, term931.getClass(), "last", term951);
        setField(term954, term954.getClass(), "next", null);
        setIntField(term954, term954.getClass(), "type", 0);
        setIntField(term954, term954.getClass(), "intValue", 0);
        setField(term954, term954.getClass(), "objectValue", null);
        setField(term931, term931.getClass(), "propListHead", term954);
        setIntField(term931, term931.getClass(), "sourcePosition", 534834644);
        setField(term931, term931.getClass(), "jsType", null);
        setField(term931, term931.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term931;
        args[1] = "vrQLuWIDJX";
        try {
            callMethod(klass, "isVariableReadBeforeKill", argTypes, term914, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


