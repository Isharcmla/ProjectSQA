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

public class FunctionType_isSubtype_21010021581445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2067137;
     Object term2067789;

    public FunctionType_isSubtype_21010021581445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2074655 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2074654 = ((Class) term2074655).getDeclaredField((String) "ORDINARY");
        ((Field) term2074654).setAccessible(true);
        Object enum3691 = ((Field) term2074654).get((Object) null);
        term2067137 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2067681 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2067137, term2067137.getClass(), "kind", enum3691);
        setField(term2067681, term2067681.getClass(), "kind", enum3691);
        setField(term2067681, term2067681.getClass(), "typeOfThis", term2067681);
        setField(term2067137, term2067137.getClass(), "typeOfThis", term2067681);
        Class<? extends Object> term2074946 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2074945 = ((Class) term2074946).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2074945).setAccessible(true);
        Object enum3692 = ((Field) term2074945).get((Object) null);
        term2067789 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2068119 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2068237 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term2067789, term2067789.getClass(), "kind", enum3691);
        setField(term2068119, term2068119.getClass(), "kind", enum3692);
        setField(term2068119, term2068119.getClass(), "typeOfThis", term2068237);
        setField(term2067789, term2067789.getClass(), "typeOfThis", term2068119);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2067789;
        try {
            callMethod(klass, "isSubtype", argTypes, term2067137, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


