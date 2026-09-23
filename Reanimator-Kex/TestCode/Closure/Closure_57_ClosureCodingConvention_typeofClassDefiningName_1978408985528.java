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

public class ClosureCodingConvention_typeofClassDefiningName_1978408985528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166611;
     Object term166703;
     Object term177791;
     Object term177792;

    public ClosureCodingConvention_typeofClassDefiningName_1978408985528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166611 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term166703 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term166795 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term166703, term166703.getClass(), "type", 33);
        setField(term166703, term166703.getClass(), "last", term166795);
        term177791 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term177791, term177791.getClass(), "propertyTestFunctions", null);
        term177792 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term177793 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term177792, term177792.getClass(), "str", null);
        setIntField(term177792, term177792.getClass(), "type", 33);
        setField(term177792, term177792.getClass(), "next", null);
        setField(term177792, term177792.getClass(), "first", null);
        setField(term177793, term177793.getClass(), "str", null);
        setIntField(term177793, term177793.getClass(), "type", 0);
        setField(term177793, term177793.getClass(), "next", null);
        setField(term177793, term177793.getClass(), "first", null);
        setField(term177793, term177793.getClass(), "last", null);
        setField(term177793, term177793.getClass(), "propListHead", null);
        setIntField(term177793, term177793.getClass(), "sourcePosition", 0);
        setField(term177793, term177793.getClass(), "jsType", null);
        setField(term177793, term177793.getClass(), "parent", null);
        setField(term177792, term177792.getClass(), "last", term177793);
        setField(term177792, term177792.getClass(), "propListHead", null);
        setIntField(term177792, term177792.getClass(), "sourcePosition", 0);
        setField(term177792, term177792.getClass(), "jsType", null);
        setField(term177792, term177792.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term166703;
        Object retValue = callMethod(klass, "typeofClassDefiningName", argTypes, term166611, args);
        assertTrue(recursiveEquals(term166611, term177791));
        assertTrue(recursiveEquals(term166703, term177792));
        assertTrue(recursiveEquals(retValue, null));
    }

};


