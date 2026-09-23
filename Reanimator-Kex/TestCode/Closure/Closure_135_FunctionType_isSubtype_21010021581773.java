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

public class FunctionType_isSubtype_21010021581773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2427513;
     Object term2428173;

    public FunctionType_isSubtype_21010021581773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2430939 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2430938 = ((Class) term2430939).getDeclaredField((String) "ORDINARY");
        ((Field) term2430938).setAccessible(true);
        Object enum4539 = ((Field) term2430938).get((Object) null);
        Class<? extends Object> term2431230 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2431229 = ((Class) term2431230).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2431229).setAccessible(true);
        Object enum4540 = ((Field) term2431229).get((Object) null);
        term2427513 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2428065 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2427513, term2427513.getClass(), "kind", enum4539);
        setField(term2428065, term2428065.getClass(), "kind", enum4540);
        setField(term2427513, term2427513.getClass(), "typeOfThis", term2428065);
        term2428173 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2428355 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2428173, term2428173.getClass(), "kind", enum4540);
        setField(term2428355, term2428355.getClass(), "kind", enum4540);
        setField(term2428173, term2428173.getClass(), "typeOfThis", term2428355);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2428173;
        try {
            callMethod(klass, "isSubtype", argTypes, term2427513, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


