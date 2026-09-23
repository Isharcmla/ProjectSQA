package com.google.javascript.rhino.jstype;

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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashSet;

public class FunctionType_isSubtype_2101002158241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119776;
     Object term119870;

    public FunctionType_isSubtype_2101002158241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119776 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        HashSet term119918 = new HashSet();
        term119870 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term119870, term119870.getClass(), "alternates", term119918);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term119870;
        try {
            callMethod(klass, "isSubtype", argTypes, term119776, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


