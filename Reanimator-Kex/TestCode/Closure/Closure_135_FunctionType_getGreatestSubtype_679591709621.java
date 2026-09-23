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

public class FunctionType_getGreatestSubtype_679591709621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term532045;
     Object term532705;

    public FunctionType_getGreatestSubtype_679591709621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term533815 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term533814 = ((Class) term533815).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term533814).setAccessible(true);
        Object enum985 = ((Field) term533814).get((Object) null);
        Class<? extends Object> term534115 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term534114 = ((Class) term534115).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term534114).setAccessible(true);
        Object enum986 = ((Field) term534114).get((Object) null);
        term532045 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term532597 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term532045, term532045.getClass(), "kind", enum985);
        setField(term532597, term532597.getClass(), "kind", enum986);
        setField(term532045, term532045.getClass(), "typeOfThis", term532597);
        term532705 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term532879 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term532705, term532705.getClass(), "kind", enum986);
        setField(term532705, term532705.getClass(), "typeOfThis", term532879);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term532705;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term532045, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


