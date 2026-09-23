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

public class ClosureCodingConvention_typeofClassDefiningName_1978408985522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164264;
     Object term164356;
     Object term176485;
     Object term176486;

    public ClosureCodingConvention_typeofClassDefiningName_1978408985522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164264 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term164356 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term164448 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term164356, term164356.getClass(), "type", 33);
        setField(term164448, term164448.getClass(), "str", "");
        setField(term164356, term164356.getClass(), "last", term164448);
        term176485 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term176485, term176485.getClass(), "propertyTestFunctions", null);
        term176486 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term176487 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term176486, term176486.getClass(), "str", null);
        setIntField(term176486, term176486.getClass(), "type", 33);
        setField(term176486, term176486.getClass(), "next", null);
        setField(term176486, term176486.getClass(), "first", null);
        setField(term176487, term176487.getClass(), "str", "");
        setIntField(term176487, term176487.getClass(), "type", 0);
        setField(term176487, term176487.getClass(), "next", null);
        setField(term176487, term176487.getClass(), "first", null);
        setField(term176487, term176487.getClass(), "last", null);
        setField(term176487, term176487.getClass(), "propListHead", null);
        setIntField(term176487, term176487.getClass(), "sourcePosition", 0);
        setField(term176487, term176487.getClass(), "jsType", null);
        setField(term176487, term176487.getClass(), "parent", null);
        setField(term176486, term176486.getClass(), "last", term176487);
        setField(term176486, term176486.getClass(), "propListHead", null);
        setIntField(term176486, term176486.getClass(), "sourcePosition", 0);
        setField(term176486, term176486.getClass(), "jsType", null);
        setField(term176486, term176486.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term164356;
        Object retValue = callMethod(klass, "typeofClassDefiningName", argTypes, term164264, args);
        assertTrue(recursiveEquals(term164264, term176485));
        assertTrue(recursiveEquals(term164356, term176486));
        assertTrue(recursiveEquals(retValue, null));
    }

};


