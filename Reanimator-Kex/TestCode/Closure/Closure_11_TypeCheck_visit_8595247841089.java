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

public class TypeCheck_visit_8595247841089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term311544;
     Object term311740;

    public TypeCheck_visit_8595247841089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term311544 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term311648 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term311544, term311544.getClass(), "typeRegistry", term311648);
        term311740 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term311832 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term311902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term311740, term311740.getClass(), "type", 86);
        setField(term311740, term311740.getClass(), "propListHead", null);
        setIntField(term311832, term311832.getClass(), "type", 0);
        setField(term311832, term311832.getClass(), "jsType", null);
        setField(term311740, term311740.getClass(), "first", term311832);
        setField(term311740, term311740.getClass(), "last", term311902);
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
        args[1] = term311740;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term311544, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


