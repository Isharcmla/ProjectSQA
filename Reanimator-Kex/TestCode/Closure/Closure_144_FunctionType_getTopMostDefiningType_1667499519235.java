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
import java.lang.String;
import java.lang.Object;

public class FunctionType_getTopMostDefiningType_1667499519235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127432;

    public FunctionType_getTopMostDefiningType_1667499519235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term128564 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term128563 = ((Class) term128564).getDeclaredField((String) "INTERFACE");
        ((Field) term128563).setAccessible(true);
        Object enum258 = ((Field) term128563).get((Object) null);
        term127432 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term127698 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term127432, term127432.getClass(), "kind", enum258);
        setField(term127432, term127432.getClass(), "prototype", term127698);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getTopMostDefiningType", argTypes, term127432, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


