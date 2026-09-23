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

public class FunctionType_isSubtype_2101002158847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term872896;
     Object term873548;

    public FunctionType_isSubtype_2101002158847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term874527 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term874526 = ((Class) term874527).getDeclaredField((String) "INTERFACE");
        ((Field) term874526).setAccessible(true);
        Object enum1629 = ((Field) term874526).get((Object) null);
        term872896 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term873440 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term872896, term872896.getClass(), "kind", enum1629);
        setField(term873440, term873440.getClass(), "kind", enum1629);
        setField(term872896, term872896.getClass(), "typeOfThis", term873440);
        term873548 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term873878 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term873548, term873548.getClass(), "kind", enum1629);
        setField(term873878, term873878.getClass(), "kind", enum1629);
        setField(term873548, term873548.getClass(), "typeOfThis", term873878);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term873548;
        try {
            callMethod(klass, "isSubtype", argTypes, term872896, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


