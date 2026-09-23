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

public class FunctionType_isSubtype_21010021581669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2256038;
     Object term2256698;

    public FunctionType_isSubtype_21010021581669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2259972 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2259971 = ((Class) term2259972).getDeclaredField((String) "INTERFACE");
        ((Field) term2259971).setAccessible(true);
        Object enum4215 = ((Field) term2259971).get((Object) null);
        term2256038 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2256590 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2256038, term2256038.getClass(), "kind", enum4215);
        setField(term2256038, term2256038.getClass(), "typeOfThis", term2256590);
        Class<? extends Object> term2260266 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2260265 = ((Class) term2260266).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2260265).setAccessible(true);
        Object enum4216 = ((Field) term2260265).get((Object) null);
        term2256698 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2256880 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2256698, term2256698.getClass(), "kind", enum4216);
        setField(term2256698, term2256698.getClass(), "typeOfThis", term2256880);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2256698;
        try {
            callMethod(klass, "isSubtype", argTypes, term2256038, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


