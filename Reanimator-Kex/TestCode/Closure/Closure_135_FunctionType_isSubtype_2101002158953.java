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

public class FunctionType_isSubtype_2101002158953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1049095;
     Object term1049755;

    public FunctionType_isSubtype_2101002158953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1051079 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1051078 = ((Class) term1051079).getDeclaredField((String) "ORDINARY");
        ((Field) term1051078).setAccessible(true);
        Object enum1960 = ((Field) term1051078).get((Object) null);
        Class<? extends Object> term1051370 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1051369 = ((Class) term1051370).getDeclaredField((String) "INTERFACE");
        ((Field) term1051369).setAccessible(true);
        Object enum1961 = ((Field) term1051369).get((Object) null);
        term1049095 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1049647 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1049095, term1049095.getClass(), "kind", enum1960);
        setField(term1049647, term1049647.getClass(), "kind", enum1961);
        setField(term1049095, term1049095.getClass(), "typeOfThis", term1049647);
        term1049755 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1050085 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1049755, term1049755.getClass(), "kind", enum1960);
        setField(term1049755, term1049755.getClass(), "typeOfThis", term1050085);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1049755;
        try {
            callMethod(klass, "isSubtype", argTypes, term1049095, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


