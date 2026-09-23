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

public class FunctionType_getTopMostDefiningType_1667499519259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130303;

    public FunctionType_getTopMostDefiningType_1667499519259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term131159 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term131158 = ((Class) term131159).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term131158).setAccessible(true);
        Object enum250 = ((Field) term131158).get((Object) null);
        term130303 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term130569 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term130303, term130303.getClass(), "kind", enum250);
        setField(term130303, term130303.getClass(), "prototype", term130569);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getTopMostDefiningType", argTypes, term130303, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


