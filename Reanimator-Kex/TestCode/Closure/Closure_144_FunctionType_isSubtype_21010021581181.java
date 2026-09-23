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

public class FunctionType_isSubtype_21010021581181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1586978;
     Object term1587738;

    public FunctionType_isSubtype_21010021581181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1588688 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1588687 = ((Class) term1588688).getDeclaredField((String) "INTERFACE");
        ((Field) term1588687).setAccessible(true);
        Object enum2834 = ((Field) term1588687).get((Object) null);
        term1586978 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1587522 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1587628 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term1586978, term1586978.getClass(), "kind", enum2834);
        setField(term1587522, term1587522.getClass(), "kind", enum2834);
        setField(term1587522, term1587522.getClass(), "typeOfThis", term1587628);
        setField(term1586978, term1586978.getClass(), "typeOfThis", term1587522);
        term1587738 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1588068 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1587738, term1587738.getClass(), "kind", enum2834);
        setField(term1588068, term1588068.getClass(), "kind", enum2834);
        setField(term1588068, term1588068.getClass(), "typeOfThis", null);
        setField(term1587738, term1587738.getClass(), "typeOfThis", term1588068);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1587738;
        try {
            callMethod(klass, "isSubtype", argTypes, term1586978, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


