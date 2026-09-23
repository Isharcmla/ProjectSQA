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

public class FunctionType_getLeastSupertype_418850886697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term731610;
     Object term732264;

    public FunctionType_getLeastSupertype_418850886697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term733248 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term733247 = ((Class) term733248).getDeclaredField((String) "ORDINARY");
        ((Field) term733247).setAccessible(true);
        Object enum1109 = ((Field) term733247).get((Object) null);
        term731610 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term732154 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term731610, term731610.getClass(), "kind", enum1109);
        setField(term731610, term731610.getClass(), "typeOfThis", term732154);
        term732264 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term732586 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term732264, term732264.getClass(), "kind", enum1109);
        setField(term732264, term732264.getClass(), "typeOfThis", term732586);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term732264;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term731610, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


