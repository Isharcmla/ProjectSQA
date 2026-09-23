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

public class FunctionType_isSubtype_2101002158973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1082610;
     Object term1083370;

    public FunctionType_isSubtype_2101002158973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1084511 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1084510 = ((Class) term1084511).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1084510).setAccessible(true);
        Object enum2018 = ((Field) term1084510).get((Object) null);
        term1082610 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1083154 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1083262 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1082610, term1082610.getClass(), "kind", enum2018);
        setField(term1083154, term1083154.getClass(), "kind", enum2018);
        setField(term1083154, term1083154.getClass(), "typeOfThis", term1083262);
        setField(term1082610, term1082610.getClass(), "typeOfThis", term1083154);
        term1083370 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1083700 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1083370, term1083370.getClass(), "kind", enum2018);
        setField(term1083700, term1083700.getClass(), "kind", enum2018);
        setField(term1083700, term1083700.getClass(), "typeOfThis", null);
        setField(term1083370, term1083370.getClass(), "typeOfThis", term1083700);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1083370;
        try {
            callMethod(klass, "isSubtype", argTypes, term1082610, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


