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

public class FunctionType_getGreatestSubtype_6795917091147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1366245;
     Object term1367115;

    public FunctionType_getGreatestSubtype_6795917091147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1368572 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1368571 = ((Class) term1368572).getDeclaredField((String) "INTERFACE");
        ((Field) term1368571).setAccessible(true);
        Object enum2557 = ((Field) term1368571).get((Object) null);
        term1366245 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1366797 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1366903 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        Object term1367007 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1366245, term1366245.getClass(), "kind", enum2557);
        setField(term1366797, term1366797.getClass(), "kind", enum2557);
        setField(term1366797, term1366797.getClass(), "typeOfThis", term1366903);
        setField(term1366245, term1366245.getClass(), "typeOfThis", term1366797);
        setField(term1366245, term1366245.getClass(), "registry", term1367007);
        Class<? extends Object> term1368866 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1368865 = ((Class) term1368866).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1368865).setAccessible(true);
        Object enum2558 = ((Field) term1368865).get((Object) null);
        term1367115 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1367437 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1367115, term1367115.getClass(), "kind", enum2557);
        setField(term1367437, term1367437.getClass(), "kind", enum2558);
        setField(term1367437, term1367437.getClass(), "typeOfThis", term1367437);
        setField(term1367115, term1367115.getClass(), "typeOfThis", term1367437);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1367115;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1366245, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


