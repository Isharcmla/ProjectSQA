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

public class FunctionType_getGreatestSubtype_679591709839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term983193;
     Object term983975;

    public FunctionType_getGreatestSubtype_679591709839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term985295 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term985294 = ((Class) term985295).getDeclaredField((String) "INTERFACE");
        ((Field) term985294).setAccessible(true);
        Object enum1780 = ((Field) term985294).get((Object) null);
        term983193 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term983747 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term983865 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term983193, term983193.getClass(), "kind", enum1780);
        setField(term983747, term983747.getClass(), "kind", enum1780);
        setField(term983747, term983747.getClass(), "typeOfThis", term983865);
        setField(term983193, term983193.getClass(), "typeOfThis", term983747);
        Class<? extends Object> term985589 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term985588 = ((Class) term985589).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term985588).setAccessible(true);
        Object enum1781 = ((Field) term985588).get((Object) null);
        term983975 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term984157 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term983975, term983975.getClass(), "kind", enum1781);
        setField(term984157, term984157.getClass(), "kind", enum1780);
        setField(term984157, term984157.getClass(), "typeOfThis", null);
        setField(term983975, term983975.getClass(), "typeOfThis", term984157);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term983975;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term983193, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


