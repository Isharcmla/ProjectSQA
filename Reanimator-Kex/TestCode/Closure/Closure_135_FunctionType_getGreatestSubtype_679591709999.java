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

public class FunctionType_getGreatestSubtype_679591709999 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1122976;
     Object term1123742;

    public FunctionType_getGreatestSubtype_679591709999() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1125097 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1125096 = ((Class) term1125097).getDeclaredField((String) "INTERFACE");
        ((Field) term1125096).setAccessible(true);
        Object enum2090 = ((Field) term1125096).get((Object) null);
        term1122976 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1123528 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1123634 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term1122976, term1122976.getClass(), "kind", enum2090);
        setField(term1123528, term1123528.getClass(), "kind", enum2090);
        setField(term1123528, term1123528.getClass(), "typeOfThis", term1123634);
        setField(term1122976, term1122976.getClass(), "typeOfThis", term1123528);
        Class<? extends Object> term1125391 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1125390 = ((Class) term1125391).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1125390).setAccessible(true);
        Object enum2091 = ((Field) term1125390).get((Object) null);
        term1123742 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1123926 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1123742, term1123742.getClass(), "kind", enum2091);
        setField(term1123926, term1123926.getClass(), "kind", enum2090);
        setField(term1123926, term1123926.getClass(), "typeOfThis", null);
        setField(term1123742, term1123742.getClass(), "typeOfThis", term1123926);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1123742;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1122976, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


