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

public class FunctionType_isSubtype_21010021581686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2288531;
     Object term2289283;

    public FunctionType_isSubtype_21010021581686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2290880 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2290879 = ((Class) term2290880).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2290879).setAccessible(true);
        Object enum4277 = ((Field) term2290879).get((Object) null);
        term2288531 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2289075 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2289175 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2288531, term2288531.getClass(), "kind", enum4277);
        setField(term2289075, term2289075.getClass(), "kind", enum4277);
        setField(term2289075, term2289075.getClass(), "typeOfThis", term2289175);
        setField(term2288531, term2288531.getClass(), "typeOfThis", term2289075);
        Class<? extends Object> term2291180 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2291179 = ((Class) term2291180).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2291179).setAccessible(true);
        Object enum4278 = ((Field) term2291179).get((Object) null);
        term2289283 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2289465 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2289713 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term2289283, term2289283.getClass(), "kind", enum4278);
        setField(term2289465, term2289465.getClass(), "kind", enum4277);
        setField(term2289465, term2289465.getClass(), "typeOfThis", term2289713);
        setField(term2289283, term2289283.getClass(), "typeOfThis", term2289465);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2289283;
        try {
            callMethod(klass, "isSubtype", argTypes, term2288531, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


