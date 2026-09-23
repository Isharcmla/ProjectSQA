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

public class FunctionType_isSubtype_21010021581619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2173775;
     Object term2174533;

    public FunctionType_isSubtype_21010021581619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2175894 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2175893 = ((Class) term2175894).getDeclaredField((String) "INTERFACE");
        ((Field) term2175893).setAccessible(true);
        Object enum4054 = ((Field) term2175893).get((Object) null);
        term2173775 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2174319 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term2174425 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term2173775, term2173775.getClass(), "kind", enum4054);
        setField(term2174319, term2174319.getClass(), "kind", enum4054);
        setField(term2174319, term2174319.getClass(), "typeOfThis", term2174425);
        setField(term2173775, term2173775.getClass(), "typeOfThis", term2174319);
        Class<? extends Object> term2176188 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2176187 = ((Class) term2176188).getDeclaredField((String) "INTERFACE");
        ((Field) term2176187).setAccessible(true);
        Object enum4055 = ((Field) term2176187).get((Object) null);
        term2174533 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2174863 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2174533, term2174533.getClass(), "kind", enum4054);
        setField(term2174863, term2174863.getClass(), "kind", enum4055);
        setField(term2174863, term2174863.getClass(), "typeOfThis", null);
        setField(term2174533, term2174533.getClass(), "typeOfThis", term2174863);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2174533;
        try {
            callMethod(klass, "isSubtype", argTypes, term2173775, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


