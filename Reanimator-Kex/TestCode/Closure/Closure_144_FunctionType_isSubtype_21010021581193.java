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

public class FunctionType_isSubtype_21010021581193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1609346;
     Object term1610096;

    public FunctionType_isSubtype_21010021581193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1611593 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1611592 = ((Class) term1611593).getDeclaredField((String) "INTERFACE");
        ((Field) term1611592).setAccessible(true);
        Object enum2878 = ((Field) term1611592).get((Object) null);
        term1609346 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1609890 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1609986 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term1609346, term1609346.getClass(), "kind", enum2878);
        setField(term1609890, term1609890.getClass(), "kind", enum2878);
        setField(term1609890, term1609890.getClass(), "typeOfThis", term1609986);
        setField(term1609346, term1609346.getClass(), "typeOfThis", term1609890);
        Class<? extends Object> term1611887 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1611886 = ((Class) term1611887).getDeclaredField((String) "INTERFACE");
        ((Field) term1611886).setAccessible(true);
        Object enum2879 = ((Field) term1611886).get((Object) null);
        term1610096 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1610426 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1610538 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term1610096, term1610096.getClass(), "kind", enum2878);
        setField(term1610426, term1610426.getClass(), "kind", enum2879);
        setField(term1610426, term1610426.getClass(), "typeOfThis", term1610538);
        setField(term1610096, term1610096.getClass(), "typeOfThis", term1610426);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1610096;
        try {
            callMethod(klass, "isSubtype", argTypes, term1609346, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


