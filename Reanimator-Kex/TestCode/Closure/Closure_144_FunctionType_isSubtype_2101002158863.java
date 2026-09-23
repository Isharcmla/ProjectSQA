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

public class FunctionType_isSubtype_2101002158863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1024712;
     Object term1025166;

    public FunctionType_isSubtype_2101002158863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1026773 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1026772 = ((Class) term1026773).getDeclaredField((String) "ORDINARY");
        ((Field) term1026772).setAccessible(true);
        Object enum1853 = ((Field) term1026772).get((Object) null);
        term1024712 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1024960 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1025056 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term1024712, term1024712.getClass(), "kind", enum1853);
        setField(term1024960, term1024960.getClass(), "kind", enum1853);
        setField(term1024960, term1024960.getClass(), "typeOfThis", term1025056);
        setField(term1024712, term1024712.getClass(), "typeOfThis", term1024960);
        Class<? extends Object> term1027064 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1027063 = ((Class) term1027064).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1027063).setAccessible(true);
        Object enum1854 = ((Field) term1027063).get((Object) null);
        term1025166 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1025348 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1025166, term1025166.getClass(), "kind", enum1853);
        setField(term1025348, term1025348.getClass(), "kind", enum1854);
        setField(term1025348, term1025348.getClass(), "typeOfThis", null);
        setField(term1025166, term1025166.getClass(), "typeOfThis", term1025348);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1025166;
        try {
            callMethod(klass, "isSubtype", argTypes, term1024712, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


