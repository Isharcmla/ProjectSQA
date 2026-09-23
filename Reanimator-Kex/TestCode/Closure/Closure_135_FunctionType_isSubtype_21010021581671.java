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

public class FunctionType_isSubtype_21010021581671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2257751;
     Object term2258511;

    public FunctionType_isSubtype_21010021581671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2262913 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2262912 = ((Class) term2262913).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2262912).setAccessible(true);
        Object enum4220 = ((Field) term2262912).get((Object) null);
        term2257751 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2258303 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2258403 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2257751, term2257751.getClass(), "kind", enum4220);
        setField(term2258303, term2258303.getClass(), "kind", enum4220);
        setField(term2258303, term2258303.getClass(), "typeOfThis", term2258403);
        setField(term2258303, term2258303.getClass(), "call", null);
        setField(term2257751, term2257751.getClass(), "typeOfThis", term2258303);
        Class<? extends Object> term2263213 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2263212 = ((Class) term2263213).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2263212).setAccessible(true);
        Object enum4221 = ((Field) term2263212).get((Object) null);
        term2258511 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2258841 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2258941 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term2259035 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2258511, term2258511.getClass(), "kind", enum4220);
        setField(term2258841, term2258841.getClass(), "kind", enum4221);
        setField(term2258841, term2258841.getClass(), "typeOfThis", term2258941);
        setField(term2258841, term2258841.getClass(), "call", term2259035);
        setField(term2258511, term2258511.getClass(), "typeOfThis", term2258841);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2258511;
        try {
            callMethod(klass, "isSubtype", argTypes, term2257751, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


