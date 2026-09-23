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

public class FunctionType_isSubtype_2101002158833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term971367;
     Object term972019;

    public FunctionType_isSubtype_2101002158833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term973193 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term973192 = ((Class) term973193).getDeclaredField((String) "INTERFACE");
        ((Field) term973192).setAccessible(true);
        Object enum1760 = ((Field) term973192).get((Object) null);
        Class<? extends Object> term973487 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term973486 = ((Class) term973487).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term973486).setAccessible(true);
        Object enum1761 = ((Field) term973486).get((Object) null);
        term971367 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term971911 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term971367, term971367.getClass(), "kind", enum1760);
        setField(term971911, term971911.getClass(), "kind", enum1761);
        setField(term971367, term971367.getClass(), "typeOfThis", term971911);
        term972019 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term972201 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term972019, term972019.getClass(), "kind", enum1761);
        setField(term972201, term972201.getClass(), "kind", enum1761);
        setField(term972019, term972019.getClass(), "typeOfThis", term972201);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term972019;
        try {
            callMethod(klass, "isSubtype", argTypes, term971367, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


