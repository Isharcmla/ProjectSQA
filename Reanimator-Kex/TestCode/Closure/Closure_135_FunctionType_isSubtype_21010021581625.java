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

public class FunctionType_isSubtype_21010021581625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2181101;
     Object term2181853;

    public FunctionType_isSubtype_21010021581625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2185366 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2185365 = ((Class) term2185366).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2185365).setAccessible(true);
        Object enum4068 = ((Field) term2185365).get((Object) null);
        term2181101 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2181645 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2181745 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2181101, term2181101.getClass(), "kind", enum4068);
        setField(term2181645, term2181645.getClass(), "kind", enum4068);
        setField(term2181645, term2181645.getClass(), "typeOfThis", term2181745);
        setField(term2181101, term2181101.getClass(), "typeOfThis", term2181645);
        Class<? extends Object> term2185666 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2185665 = ((Class) term2185666).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2185665).setAccessible(true);
        Object enum4069 = ((Field) term2185665).get((Object) null);
        term2181853 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2182035 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2182271 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term2181853, term2181853.getClass(), "kind", enum4069);
        setField(term2182035, term2182035.getClass(), "kind", enum4068);
        setField(term2182035, term2182035.getClass(), "typeOfThis", term2182271);
        setField(term2181853, term2181853.getClass(), "typeOfThis", term2182035);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2181853;
        try {
            callMethod(klass, "isSubtype", argTypes, term2181101, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


