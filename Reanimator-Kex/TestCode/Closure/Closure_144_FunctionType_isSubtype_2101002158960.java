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

public class FunctionType_isSubtype_2101002158960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1190397;
     Object term1191047;

    public FunctionType_isSubtype_2101002158960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1193838 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1193837 = ((Class) term1193838).getDeclaredField((String) "ORDINARY");
        ((Field) term1193837).setAccessible(true);
        Object enum2142 = ((Field) term1193837).get((Object) null);
        term1190397 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1190939 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term1190397, term1190397.getClass(), "kind", enum2142);
        setField(term1190397, term1190397.getClass(), "typeOfThis", term1190939);
        term1191047 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1191047, term1191047.getClass(), "kind", enum2142);
        setField(term1191047, term1191047.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1191047;
        try {
            callMethod(klass, "isSubtype", argTypes, term1190397, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


