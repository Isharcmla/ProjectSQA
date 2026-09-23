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

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54771;
     Object term54841;
     Object term55141;
     Object term55142;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54771 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term54841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term54841, term54841.getClass(), "first", term54841);
        setIntField(term54841, term54841.getClass(), "type", 42);
        term55141 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term55141, term55141.getClass(), "propertyTestFunctions", null);
        term55142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term55142, term55142.getClass(), "type", 42);
        setField(term55142, term55142.getClass(), "next", null);
        setField(term55142, term55142.getClass(), "first", term55142);
        setField(term55142, term55142.getClass(), "last", null);
        setField(term55142, term55142.getClass(), "propListHead", null);
        setIntField(term55142, term55142.getClass(), "sourcePosition", 0);
        setField(term55142, term55142.getClass(), "jsType", null);
        setField(term55142, term55142.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term54841;
        Object retValue = callMethod(klass, "getSingletonGetterClassName", argTypes, term54771, args);
        assertTrue(recursiveEquals(term54771, term55141));
        assertTrue(recursiveEquals(term54841, term55142));
        assertTrue(recursiveEquals(retValue, null));
    }

};


