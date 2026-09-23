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

public class ClosureCodingConvention_extractClassNameIfProvide_98264101197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49984;
     Object term50076;
     Object term50370;
     Object term50371;

    public ClosureCodingConvention_extractClassNameIfProvide_98264101197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49984 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term50076 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term50370 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term50370, term50370.getClass(), "propertyTestFunctions", null);
        term50371 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term50371, term50371.getClass(), "str", null);
        setIntField(term50371, term50371.getClass(), "type", 0);
        setField(term50371, term50371.getClass(), "next", null);
        setField(term50371, term50371.getClass(), "first", null);
        setField(term50371, term50371.getClass(), "last", null);
        setField(term50371, term50371.getClass(), "propListHead", null);
        setIntField(term50371, term50371.getClass(), "sourcePosition", 0);
        setField(term50371, term50371.getClass(), "jsType", null);
        setField(term50371, term50371.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term50076;
        Object retValue = callMethod(klass, "extractClassNameIfProvide", argTypes, term49984, args);
        assertTrue(recursiveEquals(term49984, term50370));
        assertTrue(recursiveEquals(term50076, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


