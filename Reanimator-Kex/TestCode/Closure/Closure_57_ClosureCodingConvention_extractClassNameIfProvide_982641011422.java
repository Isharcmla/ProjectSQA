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

public class ClosureCodingConvention_extractClassNameIfProvide_982641011422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146780;
     Object term146850;
     Object term147184;
     Object term147185;

    public ClosureCodingConvention_extractClassNameIfProvide_982641011422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146780 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term146850 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term146850, term146850.getClass(), "type", 130);
        setField(term146850, term146850.getClass(), "first", term146850);
        term147184 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term147184, term147184.getClass(), "propertyTestFunctions", null);
        term147185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term147185, term147185.getClass(), "type", 130);
        setField(term147185, term147185.getClass(), "next", null);
        setField(term147185, term147185.getClass(), "first", term147185);
        setField(term147185, term147185.getClass(), "last", null);
        setField(term147185, term147185.getClass(), "propListHead", null);
        setIntField(term147185, term147185.getClass(), "sourcePosition", 0);
        setField(term147185, term147185.getClass(), "jsType", null);
        setField(term147185, term147185.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term146850;
        Object retValue = callMethod(klass, "extractClassNameIfProvide", argTypes, term146780, args);
        assertTrue(recursiveEquals(term146780, term147184));
        assertTrue(recursiveEquals(term146850, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


