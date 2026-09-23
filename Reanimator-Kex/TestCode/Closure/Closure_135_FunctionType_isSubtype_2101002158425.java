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

public class FunctionType_isSubtype_2101002158425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279116;
     Object term279472;

    public FunctionType_isSubtype_2101002158425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term282193 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term282192 = ((Class) term282193).getDeclaredField((String) "ORDINARY");
        ((Field) term282192).setAccessible(true);
        Object enum514 = ((Field) term282192).get((Object) null);
        term279116 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term279364 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term279116, term279116.getClass(), "kind", enum514);
        setField(term279116, term279116.getClass(), "typeOfThis", term279364);
        Class<? extends Object> term282484 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term282483 = ((Class) term282484).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term282483).setAccessible(true);
        Object enum515 = ((Field) term282483).get((Object) null);
        term279472 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term279472, term279472.getClass(), "kind", enum515);
        setField(term279472, term279472.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term279472;
        try {
            callMethod(klass, "isSubtype", argTypes, term279116, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


