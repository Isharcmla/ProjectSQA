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

public class ClosureCodingConvention_typeofClassDefiningName_1978408985191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87577;
     Object term87669;
     Object term87680;
     Object term87681;

    public ClosureCodingConvention_typeofClassDefiningName_1978408985191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87577 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term87669 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term87669, term87669.getClass(), "type", -34);
        term87680 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term87680, term87680.getClass(), "propertyTestFunctions", null);
        term87681 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term87681, term87681.getClass(), "number", 0.0);
        setIntField(term87681, term87681.getClass(), "type", -34);
        setField(term87681, term87681.getClass(), "next", null);
        setField(term87681, term87681.getClass(), "first", null);
        setField(term87681, term87681.getClass(), "last", null);
        setField(term87681, term87681.getClass(), "propListHead", null);
        setIntField(term87681, term87681.getClass(), "sourcePosition", 0);
        setField(term87681, term87681.getClass(), "jsType", null);
        setField(term87681, term87681.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term87669;
        Object retValue = callMethod(klass, "typeofClassDefiningName", argTypes, term87577, args);
        assertTrue(recursiveEquals(term87577, term87680));
        assertTrue(recursiveEquals(term87669, term87681));
        assertTrue(recursiveEquals(retValue, null));
    }

};


