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

public class TypeCheck_visit_8595247841339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term400205;
     Object term400297;

    public TypeCheck_visit_8595247841339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term400205 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term400205, term400205.getClass(), "validator", null);
        term400297 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term400389 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term400479 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setIntField(term400297, term400297.getClass(), "type", 51);
        setField(term400389, term400389.getClass(), "jsType", term400479);
        setField(term400297, term400297.getClass(), "last", term400389);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term400297;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term400205, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


