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

public class ClosureCodingConvention_getObjectLiteralCast_14849623474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44702;
     Object term44772;
     Object term44986;
     Object term44987;

    public ClosureCodingConvention_getObjectLiteralCast_14849623474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44702 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term44772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44772, term44772.getClass(), "type", 37);
        setField(term44772, term44772.getClass(), "first", term44772);
        term44986 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term44986, term44986.getClass(), "propertyTestFunctions", null);
        term44987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44987, term44987.getClass(), "type", 37);
        setField(term44987, term44987.getClass(), "next", null);
        setField(term44987, term44987.getClass(), "first", term44987);
        setField(term44987, term44987.getClass(), "last", null);
        setField(term44987, term44987.getClass(), "propListHead", null);
        setIntField(term44987, term44987.getClass(), "sourcePosition", 0);
        setField(term44987, term44987.getClass(), "jsType", null);
        setField(term44987, term44987.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term44772;
        Object retValue = callMethod(klass, "getObjectLiteralCast", argTypes, term44702, args);
        assertTrue(recursiveEquals(term44702, term44986));
        assertTrue(recursiveEquals(term44772, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


