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

public class FunctionType_isSubtype_2101002158953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1179380;
     Object term1180050;

    public FunctionType_isSubtype_2101002158953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1182725 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1182724 = ((Class) term1182725).getDeclaredField((String) "INTERFACE");
        ((Field) term1182724).setAccessible(true);
        Object enum2125 = ((Field) term1182724).get((Object) null);
        term1179380 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1179942 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term1179380, term1179380.getClass(), "kind", enum2125);
        setField(term1179380, term1179380.getClass(), "typeOfThis", term1179942);
        Class<? extends Object> term1183019 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1183018 = ((Class) term1183019).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1183018).setAccessible(true);
        Object enum2126 = ((Field) term1183018).get((Object) null);
        term1180050 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1180380 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1180050, term1180050.getClass(), "kind", enum2125);
        setField(term1180380, term1180380.getClass(), "kind", enum2126);
        setField(term1180380, term1180380.getClass(), "typeOfThis", null);
        setField(term1180050, term1180050.getClass(), "typeOfThis", term1180380);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1180050;
        try {
            callMethod(klass, "isSubtype", argTypes, term1179380, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


