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

public class FunctionType_isSubtype_21010021581347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1712174;
     Object term1712826;

    public FunctionType_isSubtype_21010021581347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1713992 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1713991 = ((Class) term1713992).getDeclaredField((String) "ORDINARY");
        ((Field) term1713991).setAccessible(true);
        Object enum3197 = ((Field) term1713991).get((Object) null);
        Class<? extends Object> term1714283 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1714282 = ((Class) term1714283).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1714282).setAccessible(true);
        Object enum3198 = ((Field) term1714282).get((Object) null);
        term1712174 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1712718 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1712174, term1712174.getClass(), "kind", enum3197);
        setField(term1712718, term1712718.getClass(), "kind", enum3198);
        setField(term1712174, term1712174.getClass(), "typeOfThis", term1712718);
        term1712826 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1713008 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1712826, term1712826.getClass(), "kind", enum3198);
        setField(term1713008, term1713008.getClass(), "kind", enum3198);
        setField(term1712826, term1712826.getClass(), "typeOfThis", term1713008);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1712826;
        try {
            callMethod(klass, "isSubtype", argTypes, term1712174, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


