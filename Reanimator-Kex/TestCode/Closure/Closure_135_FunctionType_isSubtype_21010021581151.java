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

public class FunctionType_isSubtype_21010021581151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1373241;
     Object term1373745;

    public FunctionType_isSubtype_21010021581151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1375443 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1375442 = ((Class) term1375443).getDeclaredField((String) "ORDINARY");
        ((Field) term1375442).setAccessible(true);
        Object enum2569 = ((Field) term1375442).get((Object) null);
        Class<? extends Object> term1375734 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1375733 = ((Class) term1375734).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1375733).setAccessible(true);
        Object enum2570 = ((Field) term1375733).get((Object) null);
        term1373241 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1373489 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1373241, term1373241.getClass(), "kind", enum2569);
        setField(term1373489, term1373489.getClass(), "kind", enum2570);
        setField(term1373489, term1373489.getClass(), "call", null);
        setField(term1373241, term1373241.getClass(), "typeOfThis", term1373489);
        term1373745 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1373927 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1374095 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1373745, term1373745.getClass(), "kind", enum2569);
        setField(term1373927, term1373927.getClass(), "kind", enum2570);
        setField(term1373927, term1373927.getClass(), "call", term1374095);
        setField(term1373745, term1373745.getClass(), "typeOfThis", term1373927);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1373745;
        try {
            callMethod(klass, "isSubtype", argTypes, term1373241, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


