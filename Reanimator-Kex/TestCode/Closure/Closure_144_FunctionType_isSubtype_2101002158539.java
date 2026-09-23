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

public class FunctionType_isSubtype_2101002158539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term483551;
     Object term484203;

    public FunctionType_isSubtype_2101002158539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term485468 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term485467 = ((Class) term485468).getDeclaredField((String) "ORDINARY");
        ((Field) term485467).setAccessible(true);
        Object enum882 = ((Field) term485467).get((Object) null);
        Class<? extends Object> term485759 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term485758 = ((Class) term485759).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term485758).setAccessible(true);
        Object enum883 = ((Field) term485758).get((Object) null);
        term483551 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term484095 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term483551, term483551.getClass(), "kind", enum882);
        setField(term484095, term484095.getClass(), "kind", enum883);
        setField(term483551, term483551.getClass(), "typeOfThis", term484095);
        term484203 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term484535 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term484203, term484203.getClass(), "kind", enum882);
        setField(term484203, term484203.getClass(), "typeOfThis", term484535);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term484203;
        try {
            callMethod(klass, "isSubtype", argTypes, term483551, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


