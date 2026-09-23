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

public class FunctionType_isSubtype_21010021581045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1195369;
     Object term1196031;

    public FunctionType_isSubtype_21010021581045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1196921 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1196920 = ((Class) term1196921).getDeclaredField((String) "INTERFACE");
        ((Field) term1196920).setAccessible(true);
        Object enum2229 = ((Field) term1196920).get((Object) null);
        term1195369 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1195923 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1195369, term1195369.getClass(), "kind", enum2229);
        setField(term1195369, term1195369.getClass(), "typeOfThis", term1195923);
        term1196031 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1196031, term1196031.getClass(), "kind", enum2229);
        setField(term1196031, term1196031.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1196031;
        try {
            callMethod(klass, "isSubtype", argTypes, term1195369, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


