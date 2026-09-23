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

public class MustBeReachingVariableDef_computeMustDef_1796935056166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46568;
     Object term46660;
     Object term47649;
     Object term47650;

    public MustBeReachingVariableDef_computeMustDef_1796935056166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46568 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term46660 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term46752 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term46844 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term46936 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term47028 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term46660, term46660.getClass(), "type", 1265463001);
        setIntField(term46752, term46752.getClass(), "type", -2027534003);
        setIntField(term46844, term46844.getClass(), "type", 1375330971);
        setField(term46844, term46844.getClass(), "first", null);
        setField(term46844, term46844.getClass(), "next", null);
        setField(term46752, term46752.getClass(), "first", term46844);
        setIntField(term46936, term46936.getClass(), "type", 0);
        setField(term46936, term46936.getClass(), "first", null);
        setIntField(term47028, term47028.getClass(), "type", 111);
        setField(term46936, term46936.getClass(), "next", term47028);
        setField(term46752, term46752.getClass(), "next", term46936);
        setField(term46660, term46660.getClass(), "first", term46752);
        term47649 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term47649, term47649.getClass(), "jsScope", null);
        setField(term47649, term47649.getClass(), "compiler", null);
        setField(term47649, term47649.getClass(), "escaped", null);
        setField(term47649, term47649.getClass(), "cfg", null);
        setField(term47649, term47649.getClass(), "joinOp", null);
        setField(term47649, term47649.getClass(), "orderedWorkSet", null);
        term47650 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term47651 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term47652 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term47653 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term47654 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term47650, term47650.getClass(), "str", null);
        setIntField(term47650, term47650.getClass(), "type", 1265463001);
        setField(term47650, term47650.getClass(), "next", null);
        setField(term47651, term47651.getClass(), "str", null);
        setIntField(term47651, term47651.getClass(), "type", -2027534003);
        setField(term47652, term47652.getClass(), "str", null);
        setIntField(term47652, term47652.getClass(), "type", 0);
        setField(term47653, term47653.getClass(), "str", null);
        setIntField(term47653, term47653.getClass(), "type", 111);
        setField(term47653, term47653.getClass(), "next", null);
        setField(term47653, term47653.getClass(), "first", null);
        setField(term47653, term47653.getClass(), "last", null);
        setField(term47653, term47653.getClass(), "propListHead", null);
        setIntField(term47653, term47653.getClass(), "sourcePosition", 0);
        setField(term47653, term47653.getClass(), "jsType", null);
        setField(term47653, term47653.getClass(), "parent", null);
        setField(term47652, term47652.getClass(), "next", term47653);
        setField(term47652, term47652.getClass(), "first", null);
        setField(term47652, term47652.getClass(), "last", null);
        setField(term47652, term47652.getClass(), "propListHead", null);
        setIntField(term47652, term47652.getClass(), "sourcePosition", 0);
        setField(term47652, term47652.getClass(), "jsType", null);
        setField(term47652, term47652.getClass(), "parent", null);
        setField(term47651, term47651.getClass(), "next", term47652);
        setField(term47654, term47654.getClass(), "str", null);
        setIntField(term47654, term47654.getClass(), "type", 1375330971);
        setField(term47654, term47654.getClass(), "next", null);
        setField(term47654, term47654.getClass(), "first", null);
        setField(term47654, term47654.getClass(), "last", null);
        setField(term47654, term47654.getClass(), "propListHead", null);
        setIntField(term47654, term47654.getClass(), "sourcePosition", 0);
        setField(term47654, term47654.getClass(), "jsType", null);
        setField(term47654, term47654.getClass(), "parent", null);
        setField(term47651, term47651.getClass(), "first", term47654);
        setField(term47651, term47651.getClass(), "last", null);
        setField(term47651, term47651.getClass(), "propListHead", null);
        setIntField(term47651, term47651.getClass(), "sourcePosition", 0);
        setField(term47651, term47651.getClass(), "jsType", null);
        setField(term47651, term47651.getClass(), "parent", null);
        setField(term47650, term47650.getClass(), "first", term47651);
        setField(term47650, term47650.getClass(), "last", null);
        setField(term47650, term47650.getClass(), "propListHead", null);
        setIntField(term47650, term47650.getClass(), "sourcePosition", 0);
        setField(term47650, term47650.getClass(), "jsType", null);
        setField(term47650, term47650.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term46660;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term46568, args);
        assertTrue(recursiveEquals(term46568, term47649));
        assertTrue(recursiveEquals(term46660, term47650));
    }

};


