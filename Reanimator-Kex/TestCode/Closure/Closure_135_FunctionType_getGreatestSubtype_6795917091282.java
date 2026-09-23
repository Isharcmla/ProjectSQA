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

public class FunctionType_getGreatestSubtype_6795917091282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1603708;
     Object term1604068;

    public FunctionType_getGreatestSubtype_6795917091282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1605933 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1605932 = ((Class) term1605933).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1605932).setAccessible(true);
        Object enum2991 = ((Field) term1605932).get((Object) null);
        term1603708 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1603960 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1603708, term1603708.getClass(), "kind", enum2991);
        setField(term1603708, term1603708.getClass(), "registry", term1603960);
        term1604068 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1604068, term1604068.getClass(), "kind", enum2991);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1604068;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1603708, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


