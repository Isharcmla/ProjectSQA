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

public class FunctionType_isSubtype_21010021581105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1451103;
     Object term1451869;

    public FunctionType_isSubtype_21010021581105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1454592 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1454591 = ((Class) term1454592).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1454591).setAccessible(true);
        Object enum2602 = ((Field) term1454591).get((Object) null);
        term1451103 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1451647 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1451759 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term1451103, term1451103.getClass(), "kind", enum2602);
        setField(term1451647, term1451647.getClass(), "kind", enum2602);
        setField(term1451647, term1451647.getClass(), "typeOfThis", term1451759);
        setField(term1451103, term1451103.getClass(), "typeOfThis", term1451647);
        term1451869 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1452199 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1452307 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1451869, term1451869.getClass(), "kind", enum2602);
        setField(term1452199, term1452199.getClass(), "kind", enum2602);
        setField(term1452199, term1452199.getClass(), "typeOfThis", term1452307);
        setField(term1451869, term1451869.getClass(), "typeOfThis", term1452199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1451869;
        try {
            callMethod(klass, "isSubtype", argTypes, term1451103, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


