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

public class FunctionType_isSubtype_21010021581271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1750721;
     Object term1751383;

    public FunctionType_isSubtype_21010021581271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1755667 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1755666 = ((Class) term1755667).getDeclaredField((String) "INTERFACE");
        ((Field) term1755666).setAccessible(true);
        Object enum3123 = ((Field) term1755666).get((Object) null);
        term1750721 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1751275 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1750721, term1750721.getClass(), "kind", enum3123);
        setField(term1751275, term1751275.getClass(), "kind", enum3123);
        setField(term1750721, term1750721.getClass(), "typeOfThis", term1751275);
        Class<? extends Object> term1755961 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1755960 = ((Class) term1755961).getDeclaredField((String) "INTERFACE");
        ((Field) term1755960).setAccessible(true);
        Object enum3124 = ((Field) term1755960).get((Object) null);
        term1751383 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1751713 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1751383, term1751383.getClass(), "kind", enum3123);
        setField(term1751713, term1751713.getClass(), "kind", enum3124);
        setField(term1751383, term1751383.getClass(), "typeOfThis", term1751713);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1751383;
        try {
            callMethod(klass, "isSubtype", argTypes, term1750721, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


