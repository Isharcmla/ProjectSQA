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

public class FunctionType_isSubtype_21010021581429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1848454;
     Object term1849206;

    public FunctionType_isSubtype_21010021581429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1851050 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1851049 = ((Class) term1851050).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1851049).setAccessible(true);
        Object enum3445 = ((Field) term1851049).get((Object) null);
        term1848454 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1848998 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1849098 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1848454, term1848454.getClass(), "kind", enum3445);
        setField(term1848998, term1848998.getClass(), "kind", enum3445);
        setField(term1848998, term1848998.getClass(), "typeOfThis", term1849098);
        setField(term1848998, term1848998.getClass(), "call", null);
        setField(term1848454, term1848454.getClass(), "typeOfThis", term1848998);
        Class<? extends Object> term1851350 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1851349 = ((Class) term1851350).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1851349).setAccessible(true);
        Object enum3446 = ((Field) term1851349).get((Object) null);
        term1849206 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1849536 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1849630 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1849206, term1849206.getClass(), "kind", enum3445);
        setField(term1849536, term1849536.getClass(), "kind", enum3446);
        setField(term1849536, term1849536.getClass(), "typeOfThis", null);
        setField(term1849536, term1849536.getClass(), "call", term1849630);
        setField(term1849206, term1849206.getClass(), "typeOfThis", term1849536);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1849206;
        try {
            callMethod(klass, "isSubtype", argTypes, term1848454, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


