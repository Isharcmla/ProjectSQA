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

public class ClosureCodingConvention_typeofClassDefiningName_1978408985253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112443;
     Object term112535;
     Object term112546;
     Object term112547;

    public ClosureCodingConvention_typeofClassDefiningName_1978408985253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112443 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term112535 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term112546 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term112546, term112546.getClass(), "propertyTestFunctions", null);
        term112547 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term112547, term112547.getClass(), "number", 0.0);
        setIntField(term112547, term112547.getClass(), "type", 0);
        setField(term112547, term112547.getClass(), "next", null);
        setField(term112547, term112547.getClass(), "first", null);
        setField(term112547, term112547.getClass(), "last", null);
        setField(term112547, term112547.getClass(), "propListHead", null);
        setIntField(term112547, term112547.getClass(), "sourcePosition", 0);
        setField(term112547, term112547.getClass(), "jsType", null);
        setField(term112547, term112547.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term112535;
        Object retValue = callMethod(klass, "typeofClassDefiningName", argTypes, term112443, args);
        assertTrue(recursiveEquals(term112443, term112546));
        assertTrue(recursiveEquals(term112535, term112547));
        assertTrue(recursiveEquals(retValue, null));
    }

};


