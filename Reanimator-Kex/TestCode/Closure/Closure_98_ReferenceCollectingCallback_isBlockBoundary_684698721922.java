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

public class ReferenceCollectingCallback_isBlockBoundary_684698721922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247253;
     Object term247323;
     Object term247684;
     Object term247686;

    public ReferenceCollectingCallback_isBlockBoundary_684698721922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term247253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term247323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term247393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term247323, term247323.getClass(), "type", 108);
        setField(term247323, term247323.getClass(), "first", term247393);
        term247684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term247685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term247684, term247684.getClass(), "type", 108);
        setField(term247684, term247684.getClass(), "next", null);
        setIntField(term247685, term247685.getClass(), "type", 0);
        setField(term247685, term247685.getClass(), "next", null);
        setField(term247685, term247685.getClass(), "first", null);
        setField(term247685, term247685.getClass(), "last", null);
        setField(term247685, term247685.getClass(), "propListHead", null);
        setIntField(term247685, term247685.getClass(), "sourcePosition", 0);
        setField(term247685, term247685.getClass(), "jsType", null);
        setField(term247685, term247685.getClass(), "parent", null);
        setField(term247684, term247684.getClass(), "first", term247685);
        setField(term247684, term247684.getClass(), "last", null);
        setField(term247684, term247684.getClass(), "propListHead", null);
        setIntField(term247684, term247684.getClass(), "sourcePosition", 0);
        setField(term247684, term247684.getClass(), "jsType", null);
        setField(term247684, term247684.getClass(), "parent", null);
        term247686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term247686, term247686.getClass(), "type", 0);
        setField(term247686, term247686.getClass(), "next", null);
        setField(term247686, term247686.getClass(), "first", null);
        setField(term247686, term247686.getClass(), "last", null);
        setField(term247686, term247686.getClass(), "propListHead", null);
        setIntField(term247686, term247686.getClass(), "sourcePosition", 0);
        setField(term247686, term247686.getClass(), "jsType", null);
        setField(term247686, term247686.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term247253;
        args[1] = term247323;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term247253, term247684));
        assertTrue(recursiveEquals(term247323, term247686));
        assertTrue(recursiveEquals(retValue, true));
    }

};


