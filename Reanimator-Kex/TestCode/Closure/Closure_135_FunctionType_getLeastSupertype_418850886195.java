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

public class FunctionType_getLeastSupertype_418850886195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87390;
     Object term87942;

    public FunctionType_getLeastSupertype_418850886195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term88937 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term88936 = ((Class) term88937).getDeclaredField((String) "ORDINARY");
        ((Field) term88936).setAccessible(true);
        Object enum184 = ((Field) term88936).get((Object) null);
        term87390 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term87390, term87390.getClass(), "kind", enum184);
        Class<? extends Object> term89228 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term89227 = ((Class) term89228).getDeclaredField((String) "INTERFACE");
        ((Field) term89227).setAccessible(true);
        Object enum185 = ((Field) term89227).get((Object) null);
        term87942 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term87942, term87942.getClass(), "kind", enum185);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term87942;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term87390, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


