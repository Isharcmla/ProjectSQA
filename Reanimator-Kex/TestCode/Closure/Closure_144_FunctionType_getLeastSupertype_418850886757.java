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

public class FunctionType_getLeastSupertype_418850886757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term837619;
     Object term838393;

    public FunctionType_getLeastSupertype_418850886757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term839526 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term839525 = ((Class) term839526).getDeclaredField((String) "ORDINARY");
        ((Field) term839525).setAccessible(true);
        Object enum1513 = ((Field) term839525).get((Object) null);
        term837619 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term838173 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term838283 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term837619, term837619.getClass(), "kind", enum1513);
        setField(term838173, term838173.getClass(), "kind", enum1513);
        setField(term838173, term838173.getClass(), "typeOfThis", term838283);
        setField(term837619, term837619.getClass(), "typeOfThis", term838173);
        Class<? extends Object> term839817 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term839816 = ((Class) term839817).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term839816).setAccessible(true);
        Object enum1514 = ((Field) term839816).get((Object) null);
        term838393 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term838567 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term838393, term838393.getClass(), "kind", enum1514);
        setField(term838567, term838567.getClass(), "kind", enum1514);
        setField(term838567, term838567.getClass(), "typeOfThis", null);
        setField(term838393, term838393.getClass(), "typeOfThis", term838567);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term838393;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term837619, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


