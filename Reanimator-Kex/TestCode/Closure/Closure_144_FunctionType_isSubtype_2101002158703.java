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

public class FunctionType_isSubtype_2101002158703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term742892;
     Object term743336;

    public FunctionType_isSubtype_2101002158703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term744937 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term744936 = ((Class) term744937).getDeclaredField((String) "ORDINARY");
        ((Field) term744936).setAccessible(true);
        Object enum1337 = ((Field) term744936).get((Object) null);
        term742892 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term743140 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term743228 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term742892, term742892.getClass(), "kind", enum1337);
        setField(term743140, term743140.getClass(), "kind", enum1337);
        setField(term743140, term743140.getClass(), "typeOfThis", term743228);
        setField(term742892, term742892.getClass(), "typeOfThis", term743140);
        Class<? extends Object> term745228 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term745227 = ((Class) term745228).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term745227).setAccessible(true);
        Object enum1338 = ((Field) term745227).get((Object) null);
        term743336 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term743518 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term743336, term743336.getClass(), "kind", enum1337);
        setField(term743518, term743518.getClass(), "kind", enum1338);
        setField(term743518, term743518.getClass(), "typeOfThis", null);
        setField(term743336, term743336.getClass(), "typeOfThis", term743518);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term743336;
        try {
            callMethod(klass, "isSubtype", argTypes, term742892, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


