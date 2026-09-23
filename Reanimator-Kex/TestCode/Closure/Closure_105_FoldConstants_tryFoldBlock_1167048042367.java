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

public class FoldConstants_tryFoldBlock_1167048042367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103261;
     Object term103331;
     Object term104031;
     Object term104032;

    public FoldConstants_tryFoldBlock_1167048042367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103261 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term103331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103471 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103541 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103611 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term103541, term103541.getClass(), "next", term103611);
        setIntField(term103541, term103541.getClass(), "type", 126);
        setField(term103471, term103471.getClass(), "next", term103541);
        setIntField(term103471, term103471.getClass(), "type", 88);
        setIntField(term103681, term103681.getClass(), "type", 31);
        setField(term103471, term103471.getClass(), "first", term103681);
        setField(term103401, term103401.getClass(), "next", term103471);
        setIntField(term103401, term103401.getClass(), "type", 31);
        setField(term103331, term103331.getClass(), "first", term103401);
        term104031 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term104031, term104031.getClass(), "compiler", null);
        term104032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104033 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104036 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term104032, term104032.getClass(), "type", 0);
        setField(term104032, term104032.getClass(), "next", null);
        setIntField(term104033, term104033.getClass(), "type", 31);
        setIntField(term104034, term104034.getClass(), "type", 88);
        setIntField(term104035, term104035.getClass(), "type", 126);
        setIntField(term104036, term104036.getClass(), "type", 0);
        setField(term104036, term104036.getClass(), "next", null);
        setField(term104036, term104036.getClass(), "first", null);
        setField(term104036, term104036.getClass(), "last", null);
        setField(term104036, term104036.getClass(), "propListHead", null);
        setIntField(term104036, term104036.getClass(), "sourcePosition", 0);
        setField(term104036, term104036.getClass(), "jsType", null);
        setField(term104036, term104036.getClass(), "parent", null);
        setField(term104035, term104035.getClass(), "next", term104036);
        setField(term104035, term104035.getClass(), "first", null);
        setField(term104035, term104035.getClass(), "last", null);
        setField(term104035, term104035.getClass(), "propListHead", null);
        setIntField(term104035, term104035.getClass(), "sourcePosition", 0);
        setField(term104035, term104035.getClass(), "jsType", null);
        setField(term104035, term104035.getClass(), "parent", null);
        setField(term104034, term104034.getClass(), "next", term104035);
        setIntField(term104037, term104037.getClass(), "type", 31);
        setField(term104037, term104037.getClass(), "next", null);
        setField(term104037, term104037.getClass(), "first", null);
        setField(term104037, term104037.getClass(), "last", null);
        setField(term104037, term104037.getClass(), "propListHead", null);
        setIntField(term104037, term104037.getClass(), "sourcePosition", 0);
        setField(term104037, term104037.getClass(), "jsType", null);
        setField(term104037, term104037.getClass(), "parent", null);
        setField(term104034, term104034.getClass(), "first", term104037);
        setField(term104034, term104034.getClass(), "last", null);
        setField(term104034, term104034.getClass(), "propListHead", null);
        setIntField(term104034, term104034.getClass(), "sourcePosition", 0);
        setField(term104034, term104034.getClass(), "jsType", null);
        setField(term104034, term104034.getClass(), "parent", null);
        setField(term104033, term104033.getClass(), "next", term104034);
        setField(term104033, term104033.getClass(), "first", null);
        setField(term104033, term104033.getClass(), "last", null);
        setField(term104033, term104033.getClass(), "propListHead", null);
        setIntField(term104033, term104033.getClass(), "sourcePosition", 0);
        setField(term104033, term104033.getClass(), "jsType", null);
        setField(term104033, term104033.getClass(), "parent", null);
        setField(term104032, term104032.getClass(), "first", term104033);
        setField(term104032, term104032.getClass(), "last", null);
        setField(term104032, term104032.getClass(), "propListHead", null);
        setIntField(term104032, term104032.getClass(), "sourcePosition", 0);
        setField(term104032, term104032.getClass(), "jsType", null);
        setField(term104032, term104032.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term103331;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term103261, args);
        assertTrue(recursiveEquals(term103261, term104031));
        assertTrue(recursiveEquals(term103331, null));
    }

};


