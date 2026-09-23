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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_newExpr_960178251131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term298;

    public NodeUtil_newExpr_960178251131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term311 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term321 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term298, term298.getClass(), "type", 568954359);
        setIntField(term300, term300.getClass(), "type", 480137250);
        setIntField(term302, term302.getClass(), "type", 0);
        setField(term302, term302.getClass(), "next", null);
        setField(term302, term302.getClass(), "first", null);
        setField(term302, term302.getClass(), "last", null);
        setField(term302, term302.getClass(), "propListHead", null);
        setIntField(term302, term302.getClass(), "sourcePosition", 0);
        setField(term302, term302.getClass(), "jsType", null);
        setField(term302, term302.getClass(), "parent", null);
        setField(term300, term300.getClass(), "next", term302);
        setIntField(term305, term305.getClass(), "type", 0);
        setField(term305, term305.getClass(), "next", null);
        setField(term305, term305.getClass(), "first", null);
        setField(term305, term305.getClass(), "last", null);
        setField(term305, term305.getClass(), "propListHead", null);
        setIntField(term305, term305.getClass(), "sourcePosition", 0);
        setField(term305, term305.getClass(), "jsType", null);
        setField(term305, term305.getClass(), "parent", null);
        setField(term300, term300.getClass(), "first", term305);
        setIntField(term308, term308.getClass(), "type", 0);
        setField(term308, term308.getClass(), "next", null);
        setField(term308, term308.getClass(), "first", null);
        setField(term308, term308.getClass(), "last", null);
        setField(term308, term308.getClass(), "propListHead", null);
        setIntField(term308, term308.getClass(), "sourcePosition", 0);
        setField(term308, term308.getClass(), "jsType", null);
        setField(term308, term308.getClass(), "parent", null);
        setField(term300, term300.getClass(), "last", term308);
        setField(term311, term311.getClass(), "next", null);
        setIntField(term311, term311.getClass(), "type", 0);
        setIntField(term311, term311.getClass(), "intValue", 0);
        setField(term311, term311.getClass(), "objectValue", null);
        setField(term300, term300.getClass(), "propListHead", term311);
        setIntField(term300, term300.getClass(), "sourcePosition", 538259104);
        setField(term300, term300.getClass(), "jsType", null);
        setField(term300, term300.getClass(), "parent", null);
        setField(term298, term298.getClass(), "next", term300);
        setIntField(term315, term315.getClass(), "type", 0);
        setField(term315, term315.getClass(), "next", null);
        setField(term315, term315.getClass(), "first", null);
        setField(term315, term315.getClass(), "last", null);
        setField(term315, term315.getClass(), "propListHead", null);
        setIntField(term315, term315.getClass(), "sourcePosition", 0);
        setField(term315, term315.getClass(), "jsType", null);
        setField(term315, term315.getClass(), "parent", null);
        setField(term298, term298.getClass(), "first", term315);
        setIntField(term318, term318.getClass(), "type", 0);
        setField(term318, term318.getClass(), "next", null);
        setField(term318, term318.getClass(), "first", null);
        setField(term318, term318.getClass(), "last", null);
        setField(term318, term318.getClass(), "propListHead", null);
        setIntField(term318, term318.getClass(), "sourcePosition", 0);
        setField(term318, term318.getClass(), "jsType", null);
        setField(term318, term318.getClass(), "parent", null);
        setField(term298, term298.getClass(), "last", term318);
        setField(term321, term321.getClass(), "next", null);
        setIntField(term321, term321.getClass(), "type", 0);
        setIntField(term321, term321.getClass(), "intValue", 0);
        setField(term321, term321.getClass(), "objectValue", null);
        setField(term298, term298.getClass(), "propListHead", term321);
        setIntField(term298, term298.getClass(), "sourcePosition", 96566506);
        setField(term298, term298.getClass(), "jsType", null);
        setField(term298, term298.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term298;
        try {
            callMethod(klass, "newExpr", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


