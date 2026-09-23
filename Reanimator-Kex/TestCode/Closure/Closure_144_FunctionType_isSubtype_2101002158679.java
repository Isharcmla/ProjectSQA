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

public class FunctionType_isSubtype_2101002158679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term701476;
     Object term702128;

    public FunctionType_isSubtype_2101002158679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term703730 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term703729 = ((Class) term703730).getDeclaredField((String) "INTERFACE");
        ((Field) term703729).setAccessible(true);
        Object enum1263 = ((Field) term703729).get((Object) null);
        Class<? extends Object> term704024 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term704023 = ((Class) term704024).getDeclaredField((String) "INTERFACE");
        ((Field) term704023).setAccessible(true);
        Object enum1264 = ((Field) term704023).get((Object) null);
        term701476 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term702020 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term701476, term701476.getClass(), "kind", enum1263);
        setField(term702020, term702020.getClass(), "kind", enum1264);
        setField(term701476, term701476.getClass(), "typeOfThis", term702020);
        Class<? extends Object> term704318 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term704317 = ((Class) term704318).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term704317).setAccessible(true);
        Object enum1265 = ((Field) term704317).get((Object) null);
        term702128 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term702312 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term702128, term702128.getClass(), "kind", enum1265);
        setField(term702312, term702312.getClass(), "kind", enum1264);
        setField(term702128, term702128.getClass(), "typeOfThis", term702312);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term702128;
        try {
            callMethod(klass, "isSubtype", argTypes, term701476, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


