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

public class FunctionType_getGreatestSubtype_6795917091291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1789479;
     Object term1790233;

    public FunctionType_getGreatestSubtype_6795917091291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1791250 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1791249 = ((Class) term1791250).getDeclaredField((String) "ORDINARY");
        ((Field) term1791249).setAccessible(true);
        Object enum3183 = ((Field) term1791249).get((Object) null);
        term1789479 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1790019 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term1790123 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1789479, term1789479.getClass(), "kind", enum3183);
        setField(term1789479, term1789479.getClass(), "typeOfThis", term1790019);
        setField(term1789479, term1789479.getClass(), "registry", term1790123);
        Class<? extends Object> term1791541 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1791540 = ((Class) term1791541).getDeclaredField((String) "INTERFACE");
        ((Field) term1791540).setAccessible(true);
        Object enum3184 = ((Field) term1791540).get((Object) null);
        term1790233 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1790233, term1790233.getClass(), "kind", enum3184);
        setField(term1790233, term1790233.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1790233;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1789479, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


