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

public class FunctionType_isSubtype_21010021581139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1348196;
     Object term1348708;

    public FunctionType_isSubtype_21010021581139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1350400 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1350399 = ((Class) term1350400).getDeclaredField((String) "ORDINARY");
        ((Field) term1350399).setAccessible(true);
        Object enum2523 = ((Field) term1350399).get((Object) null);
        Class<? extends Object> term1350691 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1350690 = ((Class) term1350691).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1350690).setAccessible(true);
        Object enum2524 = ((Field) term1350690).get((Object) null);
        term1348196 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1348452 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1348196, term1348196.getClass(), "kind", enum2523);
        setField(term1348452, term1348452.getClass(), "kind", enum2524);
        setField(term1348452, term1348452.getClass(), "call", null);
        setField(term1348196, term1348196.getClass(), "typeOfThis", term1348452);
        term1348708 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1348890 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1349058 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1348708, term1348708.getClass(), "kind", enum2523);
        setField(term1348890, term1348890.getClass(), "kind", enum2524);
        setField(term1348890, term1348890.getClass(), "call", term1349058);
        setField(term1348708, term1348708.getClass(), "typeOfThis", term1348890);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1348708;
        try {
            callMethod(klass, "isSubtype", argTypes, term1348196, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


