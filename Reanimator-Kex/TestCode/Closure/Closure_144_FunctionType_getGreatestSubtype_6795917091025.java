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

public class FunctionType_getGreatestSubtype_6795917091025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1308759;
     Object term1309531;

    public FunctionType_getGreatestSubtype_6795917091025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1311799 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1311798 = ((Class) term1311799).getDeclaredField((String) "INTERFACE");
        ((Field) term1311798).setAccessible(true);
        Object enum2349 = ((Field) term1311798).get((Object) null);
        Class<? extends Object> term1312093 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1312092 = ((Class) term1312093).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1312092).setAccessible(true);
        Object enum2350 = ((Field) term1312092).get((Object) null);
        term1308759 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1309313 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1309421 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1308759, term1308759.getClass(), "kind", enum2349);
        setField(term1309313, term1309313.getClass(), "kind", enum2349);
        setField(term1309421, term1309421.getClass(), "kind", enum2350);
        setField(term1309313, term1309313.getClass(), "typeOfThis", term1309421);
        setField(term1308759, term1308759.getClass(), "typeOfThis", term1309313);
        term1309531 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1309713 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1309961 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1309531, term1309531.getClass(), "kind", enum2350);
        setField(term1309713, term1309713.getClass(), "kind", enum2349);
        setField(term1309713, term1309713.getClass(), "typeOfThis", term1309961);
        setField(term1309531, term1309531.getClass(), "typeOfThis", term1309713);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1309531;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1308759, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


