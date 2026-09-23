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

public class FunctionType_isSubtype_2101002158991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1242752;
     Object term1243204;

    public FunctionType_isSubtype_2101002158991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1244811 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1244810 = ((Class) term1244811).getDeclaredField((String) "ORDINARY");
        ((Field) term1244810).setAccessible(true);
        Object enum2233 = ((Field) term1244810).get((Object) null);
        term1242752 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1243008 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1243096 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1242752, term1242752.getClass(), "kind", enum2233);
        setField(term1243008, term1243008.getClass(), "kind", enum2233);
        setField(term1243008, term1243008.getClass(), "typeOfThis", term1243096);
        setField(term1242752, term1242752.getClass(), "typeOfThis", term1243008);
        Class<? extends Object> term1245102 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1245101 = ((Class) term1245102).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1245101).setAccessible(true);
        Object enum2234 = ((Field) term1245101).get((Object) null);
        term1243204 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1243386 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1243204, term1243204.getClass(), "kind", enum2233);
        setField(term1243386, term1243386.getClass(), "kind", enum2234);
        setField(term1243386, term1243386.getClass(), "typeOfThis", null);
        setField(term1243204, term1243204.getClass(), "typeOfThis", term1243386);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1243204;
        try {
            callMethod(klass, "isSubtype", argTypes, term1242752, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


