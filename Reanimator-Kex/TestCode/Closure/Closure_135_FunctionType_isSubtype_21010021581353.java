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

public class FunctionType_isSubtype_21010021581353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1722829;
     Object term1723185;

    public FunctionType_isSubtype_21010021581353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1724130 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1724129 = ((Class) term1724130).getDeclaredField((String) "ORDINARY");
        ((Field) term1724129).setAccessible(true);
        Object enum3216 = ((Field) term1724129).get((Object) null);
        term1722829 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1723077 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1722829, term1722829.getClass(), "kind", enum3216);
        setField(term1723077, term1723077.getClass(), "kind", enum3216);
        setField(term1723077, term1723077.getClass(), "typeOfThis", null);
        setField(term1722829, term1722829.getClass(), "typeOfThis", term1723077);
        term1723185 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1723367 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1723463 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term1723185, term1723185.getClass(), "kind", enum3216);
        setField(term1723367, term1723367.getClass(), "kind", enum3216);
        setField(term1723367, term1723367.getClass(), "typeOfThis", term1723463);
        setField(term1723185, term1723185.getClass(), "typeOfThis", term1723367);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1723185;
        try {
            callMethod(klass, "isSubtype", argTypes, term1722829, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


