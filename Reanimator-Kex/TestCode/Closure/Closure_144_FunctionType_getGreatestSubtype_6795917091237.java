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

public class FunctionType_getGreatestSubtype_6795917091237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1693153;
     Object term1693625;

    public FunctionType_getGreatestSubtype_6795917091237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1696192 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1696191 = ((Class) term1696192).getDeclaredField((String) "ORDINARY");
        ((Field) term1696191).setAccessible(true);
        Object enum3026 = ((Field) term1696191).get((Object) null);
        term1693153 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1693411 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1693515 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1693153, term1693153.getClass(), "kind", enum3026);
        setField(term1693411, term1693411.getClass(), "kind", enum3026);
        setField(term1693153, term1693153.getClass(), "typeOfThis", term1693411);
        setField(term1693153, term1693153.getClass(), "registry", term1693515);
        Class<? extends Object> term1696483 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1696482 = ((Class) term1696483).getDeclaredField((String) "INTERFACE");
        ((Field) term1696482).setAccessible(true);
        Object enum3027 = ((Field) term1696482).get((Object) null);
        term1693625 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1693881 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1693625, term1693625.getClass(), "kind", enum3027);
        setField(term1693881, term1693881.getClass(), "kind", enum3027);
        setField(term1693625, term1693625.getClass(), "typeOfThis", term1693881);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1693625;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1693153, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


