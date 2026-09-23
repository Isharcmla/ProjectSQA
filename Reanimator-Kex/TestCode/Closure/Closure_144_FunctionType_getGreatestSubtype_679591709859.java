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

public class FunctionType_getGreatestSubtype_679591709859 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1018290;
     Object term1018940;

    public FunctionType_getGreatestSubtype_679591709859() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1020099 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1020098 = ((Class) term1020099).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1020098).setAccessible(true);
        Object enum1842 = ((Field) term1020098).get((Object) null);
        term1018290 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1018830 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term1018290, term1018290.getClass(), "kind", enum1842);
        setField(term1018290, term1018290.getClass(), "typeOfThis", term1018830);
        Class<? extends Object> term1020399 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1020398 = ((Class) term1020399).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1020398).setAccessible(true);
        Object enum1843 = ((Field) term1020398).get((Object) null);
        term1018940 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1019114 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1018940, term1018940.getClass(), "kind", enum1843);
        setField(term1019114, term1019114.getClass(), "kind", enum1843);
        setField(term1019114, term1019114.getClass(), "typeOfThis", null);
        setField(term1018940, term1018940.getClass(), "typeOfThis", term1019114);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1018940;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1018290, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


