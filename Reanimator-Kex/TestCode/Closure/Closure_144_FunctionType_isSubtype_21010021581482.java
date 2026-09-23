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

public class FunctionType_isSubtype_21010021581482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2141765;
     Object term2142511;

    public FunctionType_isSubtype_21010021581482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2145592 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2145591 = ((Class) term2145592).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2145591).setAccessible(true);
        Object enum3819 = ((Field) term2145591).get((Object) null);
        term2141765 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2142309 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2142401 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term2141765, term2141765.getClass(), "kind", enum3819);
        setField(term2142309, term2142309.getClass(), "kind", enum3819);
        setField(term2142309, term2142309.getClass(), "typeOfThis", term2142401);
        setField(term2141765, term2141765.getClass(), "typeOfThis", term2142309);
        Class<? extends Object> term2145892 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2145891 = ((Class) term2145892).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2145891).setAccessible(true);
        Object enum3820 = ((Field) term2145891).get((Object) null);
        term2142511 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2142841 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2142511, term2142511.getClass(), "kind", enum3819);
        setField(term2142841, term2142841.getClass(), "kind", enum3820);
        setField(term2142841, term2142841.getClass(), "typeOfThis", null);
        setField(term2142511, term2142511.getClass(), "typeOfThis", term2142841);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2142511;
        try {
            callMethod(klass, "isSubtype", argTypes, term2141765, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


