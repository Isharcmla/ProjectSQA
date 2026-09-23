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

public class FunctionType_isSubtype_21010021581557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2068799;
     Object term2069559;

    public FunctionType_isSubtype_21010021581557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2071162 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2071161 = ((Class) term2071162).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2071161).setAccessible(true);
        Object enum3856 = ((Field) term2071161).get((Object) null);
        term2068799 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2069351 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2069451 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2068799, term2068799.getClass(), "kind", enum3856);
        setField(term2069351, term2069351.getClass(), "kind", enum3856);
        setField(term2069351, term2069351.getClass(), "typeOfThis", term2069451);
        setField(term2068799, term2068799.getClass(), "typeOfThis", term2069351);
        Class<? extends Object> term2071462 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2071461 = ((Class) term2071462).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2071461).setAccessible(true);
        Object enum3857 = ((Field) term2071461).get((Object) null);
        term2069559 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2069741 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2069989 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term2069559, term2069559.getClass(), "kind", enum3857);
        setField(term2069741, term2069741.getClass(), "kind", enum3856);
        setField(term2069741, term2069741.getClass(), "typeOfThis", term2069989);
        setField(term2069559, term2069559.getClass(), "typeOfThis", term2069741);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2069559;
        try {
            callMethod(klass, "isSubtype", argTypes, term2068799, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


