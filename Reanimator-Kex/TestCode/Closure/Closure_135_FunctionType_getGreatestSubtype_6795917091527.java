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

public class FunctionType_getGreatestSubtype_6795917091527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2017349;
     Object term2018009;

    public FunctionType_getGreatestSubtype_6795917091527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2021073 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2021072 = ((Class) term2021073).getDeclaredField((String) "INTERFACE");
        ((Field) term2021072).setAccessible(true);
        Object enum3763 = ((Field) term2021072).get((Object) null);
        Class<? extends Object> term2021367 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2021366 = ((Class) term2021367).getDeclaredField((String) "INTERFACE");
        ((Field) term2021366).setAccessible(true);
        Object enum3764 = ((Field) term2021366).get((Object) null);
        term2017349 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2017901 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term2017349, term2017349.getClass(), "kind", enum3763);
        setField(term2017901, term2017901.getClass(), "kind", enum3764);
        setField(term2017349, term2017349.getClass(), "typeOfThis", term2017901);
        Class<? extends Object> term2021661 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2021660 = ((Class) term2021661).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2021660).setAccessible(true);
        Object enum3765 = ((Field) term2021660).get((Object) null);
        term2018009 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2018193 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2018009, term2018009.getClass(), "kind", enum3765);
        setField(term2018009, term2018009.getClass(), "typeOfThis", term2018193);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2018009;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term2017349, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


