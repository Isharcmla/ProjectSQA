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

public class FunctionType_isSubtype_2101002158381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280836;
     Object term281202;

    public FunctionType_isSubtype_2101002158381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term282346 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term282345 = ((Class) term282346).getDeclaredField((String) "ORDINARY");
        ((Field) term282345).setAccessible(true);
        Object enum518 = ((Field) term282345).get((Object) null);
        term280836 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term281092 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term280836, term280836.getClass(), "kind", enum518);
        setField(term280836, term280836.getClass(), "typeOfThis", term281092);
        Class<? extends Object> term282637 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term282636 = ((Class) term282637).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term282636).setAccessible(true);
        Object enum519 = ((Field) term282636).get((Object) null);
        term281202 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term281202, term281202.getClass(), "kind", enum519);
        setField(term281202, term281202.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term281202;
        try {
            callMethod(klass, "isSubtype", argTypes, term280836, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


