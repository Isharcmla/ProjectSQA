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

public class FunctionType_isSubtype_21010021581337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1698572;
     Object term1699324;

    public FunctionType_isSubtype_21010021581337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1700465 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1700464 = ((Class) term1700465).getDeclaredField((String) "INTERFACE");
        ((Field) term1700464).setAccessible(true);
        Object enum3173 = ((Field) term1700464).get((Object) null);
        term1698572 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1699116 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1699216 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1698572, term1698572.getClass(), "kind", enum3173);
        setField(term1699116, term1699116.getClass(), "kind", enum3173);
        setField(term1699116, term1699116.getClass(), "typeOfThis", term1699216);
        setField(term1698572, term1698572.getClass(), "typeOfThis", term1699116);
        term1699324 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1699654 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1699324, term1699324.getClass(), "kind", enum3173);
        setField(term1699654, term1699654.getClass(), "kind", enum3173);
        setField(term1699654, term1699654.getClass(), "typeOfThis", null);
        setField(term1699324, term1699324.getClass(), "typeOfThis", term1699654);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1699324;
        try {
            callMethod(klass, "isSubtype", argTypes, term1698572, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


