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

public class FunctionType_isSubtype_2101002158595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term496463;
     Object term497015;

    public FunctionType_isSubtype_2101002158595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term498359 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term498358 = ((Class) term498359).getDeclaredField((String) "ORDINARY");
        ((Field) term498358).setAccessible(true);
        Object enum919 = ((Field) term498358).get((Object) null);
        term496463 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term496463, term496463.getClass(), "kind", enum919);
        setField(term496463, term496463.getClass(), "typeOfThis", term496463);
        Class<? extends Object> term498650 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term498649 = ((Class) term498650).getDeclaredField((String) "INTERFACE");
        ((Field) term498649).setAccessible(true);
        Object enum920 = ((Field) term498649).get((Object) null);
        term497015 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term497345 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term497015, term497015.getClass(), "kind", enum919);
        setField(term497345, term497345.getClass(), "kind", enum920);
        setField(term497015, term497015.getClass(), "typeOfThis", term497345);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term497015;
        try {
            callMethod(klass, "isSubtype", argTypes, term496463, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


