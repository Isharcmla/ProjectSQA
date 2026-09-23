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

public class FunctionType_isSubtype_2101002158893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1080956;
     Object term1081406;

    public FunctionType_isSubtype_2101002158893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1083860 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1083859 = ((Class) term1083860).getDeclaredField((String) "ORDINARY");
        ((Field) term1083859).setAccessible(true);
        Object enum1956 = ((Field) term1083859).get((Object) null);
        term1080956 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1081204 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1081298 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1080956, term1080956.getClass(), "kind", enum1956);
        setField(term1080956, term1080956.getClass(), "typeOfThis", term1081204);
        setField(term1080956, term1080956.getClass(), "call", term1081298);
        Class<? extends Object> term1084151 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1084150 = ((Class) term1084151).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1084150).setAccessible(true);
        Object enum1957 = ((Field) term1084150).get((Object) null);
        term1081406 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1081664 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1081406, term1081406.getClass(), "kind", enum1957);
        setField(term1081406, term1081406.getClass(), "typeOfThis", term1081664);
        setField(term1081406, term1081406.getClass(), "call", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1081406;
        try {
            callMethod(klass, "isSubtype", argTypes, term1080956, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


