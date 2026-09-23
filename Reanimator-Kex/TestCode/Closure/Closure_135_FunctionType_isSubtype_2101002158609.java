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

public class FunctionType_isSubtype_2101002158609 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term516799;
     Object term517155;

    public FunctionType_isSubtype_2101002158609() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term518292 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term518291 = ((Class) term518292).getDeclaredField((String) "ORDINARY");
        ((Field) term518291).setAccessible(true);
        Object enum957 = ((Field) term518291).get((Object) null);
        term516799 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term517047 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term516799, term516799.getClass(), "kind", enum957);
        setField(term516799, term516799.getClass(), "typeOfThis", term517047);
        Class<? extends Object> term518583 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term518582 = ((Class) term518583).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term518582).setAccessible(true);
        Object enum958 = ((Field) term518582).get((Object) null);
        term517155 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term517155, term517155.getClass(), "kind", enum958);
        setField(term517155, term517155.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term517155;
        try {
            callMethod(klass, "isSubtype", argTypes, term516799, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


