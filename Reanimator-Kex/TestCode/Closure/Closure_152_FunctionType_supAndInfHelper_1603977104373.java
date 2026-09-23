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

public class FunctionType_supAndInfHelper_1603977104373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269698;
     Object term270252;

    public FunctionType_supAndInfHelper_1603977104373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term271255 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term271254 = ((Class) term271255).getDeclaredField((String) "INTERFACE");
        ((Field) term271254).setAccessible(true);
        Object enum473 = ((Field) term271254).get((Object) null);
        term269698 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term269698, term269698.getClass(), "kind", enum473);
        Class<? extends Object> term271549 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term271548 = ((Class) term271549).getDeclaredField((String) "INTERFACE");
        ((Field) term271548).setAccessible(true);
        Object enum474 = ((Field) term271548).get((Object) null);
        term270252 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term270252, term270252.getClass(), "kind", enum474);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term270252;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term269698, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


