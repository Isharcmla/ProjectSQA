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
import java.util.ArrayList;

public class CoalesceVariableNames_checkRanges_118307546523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5274;
     Object term5326;
     Object term5418;
     Object term5911;
     Object term5912;
     Object term5914;

    public CoalesceVariableNames_checkRanges_118307546523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5274 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        setField(term5274, term5274.getClass(), "compiler", null);
        term5326 = new ArrayList();
        term5418 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term5911 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        setField(term5911, term5911.getClass(), "compiler", null);
        setField(term5911, term5911.getClass(), "colorings", null);
        setBooleanField(term5911, term5911.getClass(), "usePseudoNames", false);
        term5912 = new ArrayList();
        term5914 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term5914, term5914.getClass(), "number", 0.0);
        setIntField(term5914, term5914.getClass(), "type", 0);
        setField(term5914, term5914.getClass(), "next", null);
        setField(term5914, term5914.getClass(), "first", null);
        setField(term5914, term5914.getClass(), "last", null);
        setField(term5914, term5914.getClass(), "propListHead", null);
        setIntField(term5914, term5914.getClass(), "sourcePosition", 0);
        setField(term5914, term5914.getClass(), "jsType", null);
        setField(term5914, term5914.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term5326;
        args[1] = term5418;
        callMethod(klass, "checkRanges", argTypes, term5274, args);
        assertTrue(recursiveEquals(term5274, term5911));
        assertTrue(recursiveEquals(term5326, term5912));
        assertTrue(recursiveEquals(term5418, term5914));
    }

};


