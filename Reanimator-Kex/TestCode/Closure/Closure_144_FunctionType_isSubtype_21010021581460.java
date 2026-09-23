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

public class FunctionType_isSubtype_21010021581460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2098236;
     Object term2098898;

    public FunctionType_isSubtype_21010021581460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2102975 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2102974 = ((Class) term2102975).getDeclaredField((String) "INTERFACE");
        ((Field) term2102974).setAccessible(true);
        Object enum3741 = ((Field) term2102974).get((Object) null);
        Class<? extends Object> term2103269 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2103268 = ((Class) term2103269).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2103268).setAccessible(true);
        Object enum3742 = ((Field) term2103268).get((Object) null);
        term2098236 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2098788 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2098236, term2098236.getClass(), "kind", enum3741);
        setField(term2098788, term2098788.getClass(), "kind", enum3742);
        setField(term2098236, term2098236.getClass(), "typeOfThis", term2098788);
        Class<? extends Object> term2103569 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2103568 = ((Class) term2103569).getDeclaredField((String) "INTERFACE");
        ((Field) term2103568).setAccessible(true);
        Object enum3743 = ((Field) term2103568).get((Object) null);
        term2098898 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2099230 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2098898, term2098898.getClass(), "kind", enum3741);
        setField(term2099230, term2099230.getClass(), "kind", enum3743);
        setField(term2098898, term2098898.getClass(), "typeOfThis", term2099230);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2098898;
        try {
            callMethod(klass, "isSubtype", argTypes, term2098236, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


