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

public class FunctionType_isSubtype_2101002158995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1250079;
     Object term1250583;

    public FunctionType_isSubtype_2101002158995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1252147 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1252146 = ((Class) term1252147).getDeclaredField((String) "ORDINARY");
        ((Field) term1252146).setAccessible(true);
        Object enum2246 = ((Field) term1252146).get((Object) null);
        Class<? extends Object> term1252438 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1252437 = ((Class) term1252438).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1252437).setAccessible(true);
        Object enum2247 = ((Field) term1252437).get((Object) null);
        term1250079 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1250327 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1250079, term1250079.getClass(), "kind", enum2246);
        setField(term1250327, term1250327.getClass(), "kind", enum2247);
        setField(term1250327, term1250327.getClass(), "typeOfThis", null);
        setField(term1250079, term1250079.getClass(), "typeOfThis", term1250327);
        term1250583 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1250767 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1250881 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term1250583, term1250583.getClass(), "kind", enum2246);
        setField(term1250767, term1250767.getClass(), "kind", enum2246);
        setField(term1250767, term1250767.getClass(), "typeOfThis", term1250881);
        setField(term1250583, term1250583.getClass(), "typeOfThis", term1250767);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1250583;
        try {
            callMethod(klass, "isSubtype", argTypes, term1250079, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


