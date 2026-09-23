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

public class FunctionType_isSubtype_21010021581265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1743184;
     Object term1743926;

    public FunctionType_isSubtype_21010021581265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1745292 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1745291 = ((Class) term1745292).getDeclaredField((String) "INTERFACE");
        ((Field) term1745291).setAccessible(true);
        Object enum3108 = ((Field) term1745291).get((Object) null);
        term1743184 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1743728 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1743816 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1743184, term1743184.getClass(), "kind", enum3108);
        setField(term1743728, term1743728.getClass(), "kind", enum3108);
        setField(term1743728, term1743728.getClass(), "typeOfThis", term1743816);
        setField(term1743728, term1743728.getClass(), "call", null);
        setField(term1743184, term1743184.getClass(), "typeOfThis", term1743728);
        Class<? extends Object> term1745586 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1745585 = ((Class) term1745586).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1745585).setAccessible(true);
        Object enum3109 = ((Field) term1745585).get((Object) null);
        term1743926 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1744258 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1744352 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1743926, term1743926.getClass(), "kind", enum3108);
        setField(term1744258, term1744258.getClass(), "kind", enum3109);
        setField(term1744258, term1744258.getClass(), "typeOfThis", null);
        setField(term1744258, term1744258.getClass(), "call", term1744352);
        setField(term1743926, term1743926.getClass(), "typeOfThis", term1744258);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1743926;
        try {
            callMethod(klass, "isSubtype", argTypes, term1743184, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


