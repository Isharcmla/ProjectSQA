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

public class FunctionType_isSubtype_21010021581317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1835644;
     Object term1836298;

    public FunctionType_isSubtype_21010021581317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1837952 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1837951 = ((Class) term1837952).getDeclaredField((String) "ORDINARY");
        ((Field) term1837951).setAccessible(true);
        Object enum3265 = ((Field) term1837951).get((Object) null);
        Class<? extends Object> term1838243 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1838242 = ((Class) term1838243).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1838242).setAccessible(true);
        Object enum3266 = ((Field) term1838242).get((Object) null);
        term1835644 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1836188 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1835644, term1835644.getClass(), "kind", enum3265);
        setField(term1836188, term1836188.getClass(), "kind", enum3266);
        setField(term1836188, term1836188.getClass(), "typeOfThis", null);
        setField(term1836188, term1836188.getClass(), "call", null);
        setField(term1835644, term1835644.getClass(), "typeOfThis", term1836188);
        Class<? extends Object> term1838543 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1838542 = ((Class) term1838543).getDeclaredField((String) "INTERFACE");
        ((Field) term1838542).setAccessible(true);
        Object enum3267 = ((Field) term1838542).get((Object) null);
        term1836298 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1836628 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1836722 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1836298, term1836298.getClass(), "kind", enum3265);
        setField(term1836628, term1836628.getClass(), "kind", enum3267);
        setField(term1836628, term1836628.getClass(), "typeOfThis", term1836628);
        setField(term1836628, term1836628.getClass(), "call", term1836722);
        setField(term1836298, term1836298.getClass(), "typeOfThis", term1836628);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1836298;
        try {
            callMethod(klass, "isSubtype", argTypes, term1835644, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


