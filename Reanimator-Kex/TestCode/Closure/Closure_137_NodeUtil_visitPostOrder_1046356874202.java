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

public class NodeUtil_visitPostOrder_1046356874202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3008;

    public NodeUtil_visitPostOrder_1046356874202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3018 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3021 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3025 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3031 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3008, term3008.getClass(), "type", -938127737);
        setIntField(term3010, term3010.getClass(), "type", 1180687854);
        setIntField(term3012, term3012.getClass(), "type", 0);
        setField(term3012, term3012.getClass(), "next", null);
        setField(term3012, term3012.getClass(), "first", null);
        setField(term3012, term3012.getClass(), "last", null);
        setField(term3012, term3012.getClass(), "propListHead", null);
        setIntField(term3012, term3012.getClass(), "sourcePosition", 0);
        setField(term3012, term3012.getClass(), "jsType", null);
        setField(term3012, term3012.getClass(), "parent", null);
        setField(term3010, term3010.getClass(), "next", term3012);
        setIntField(term3015, term3015.getClass(), "type", 0);
        setField(term3015, term3015.getClass(), "next", null);
        setField(term3015, term3015.getClass(), "first", null);
        setField(term3015, term3015.getClass(), "last", null);
        setField(term3015, term3015.getClass(), "propListHead", null);
        setIntField(term3015, term3015.getClass(), "sourcePosition", 0);
        setField(term3015, term3015.getClass(), "jsType", null);
        setField(term3015, term3015.getClass(), "parent", null);
        setField(term3010, term3010.getClass(), "first", term3015);
        setIntField(term3018, term3018.getClass(), "type", 0);
        setField(term3018, term3018.getClass(), "next", null);
        setField(term3018, term3018.getClass(), "first", null);
        setField(term3018, term3018.getClass(), "last", null);
        setField(term3018, term3018.getClass(), "propListHead", null);
        setIntField(term3018, term3018.getClass(), "sourcePosition", 0);
        setField(term3018, term3018.getClass(), "jsType", null);
        setField(term3018, term3018.getClass(), "parent", null);
        setField(term3010, term3010.getClass(), "last", term3018);
        setField(term3021, term3021.getClass(), "next", null);
        setIntField(term3021, term3021.getClass(), "type", 0);
        setIntField(term3021, term3021.getClass(), "intValue", 0);
        setField(term3021, term3021.getClass(), "objectValue", null);
        setField(term3010, term3010.getClass(), "propListHead", term3021);
        setIntField(term3010, term3010.getClass(), "sourcePosition", 1073400519);
        setField(term3010, term3010.getClass(), "jsType", null);
        setField(term3010, term3010.getClass(), "parent", null);
        setField(term3008, term3008.getClass(), "next", term3010);
        setIntField(term3025, term3025.getClass(), "type", 0);
        setField(term3025, term3025.getClass(), "next", null);
        setField(term3025, term3025.getClass(), "first", null);
        setField(term3025, term3025.getClass(), "last", null);
        setField(term3025, term3025.getClass(), "propListHead", null);
        setIntField(term3025, term3025.getClass(), "sourcePosition", 0);
        setField(term3025, term3025.getClass(), "jsType", null);
        setField(term3025, term3025.getClass(), "parent", null);
        setField(term3008, term3008.getClass(), "first", term3025);
        setIntField(term3028, term3028.getClass(), "type", 0);
        setField(term3028, term3028.getClass(), "next", null);
        setField(term3028, term3028.getClass(), "first", null);
        setField(term3028, term3028.getClass(), "last", null);
        setField(term3028, term3028.getClass(), "propListHead", null);
        setIntField(term3028, term3028.getClass(), "sourcePosition", 0);
        setField(term3028, term3028.getClass(), "jsType", null);
        setField(term3028, term3028.getClass(), "parent", null);
        setField(term3008, term3008.getClass(), "last", term3028);
        setField(term3031, term3031.getClass(), "next", null);
        setIntField(term3031, term3031.getClass(), "type", 0);
        setIntField(term3031, term3031.getClass(), "intValue", 0);
        setField(term3031, term3031.getClass(), "objectValue", null);
        setField(term3008, term3008.getClass(), "propListHead", term3031);
        setIntField(term3008, term3008.getClass(), "sourcePosition", -2025555268);
        setField(term3008, term3008.getClass(), "jsType", null);
        setField(term3008, term3008.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeUtil$Visitor");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term3008;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "visitPostOrder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


