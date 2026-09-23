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

public class FunctionType_isSubtype_2101002158571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term458822;
     Object term459278;

    public FunctionType_isSubtype_2101002158571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term460856 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term460855 = ((Class) term460856).getDeclaredField((String) "ORDINARY");
        ((Field) term460855).setAccessible(true);
        Object enum853 = ((Field) term460855).get((Object) null);
        term458822 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term459070 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term459170 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term458822, term458822.getClass(), "kind", enum853);
        setField(term459070, term459070.getClass(), "kind", enum853);
        setField(term459070, term459070.getClass(), "typeOfThis", term459170);
        setField(term458822, term458822.getClass(), "typeOfThis", term459070);
        Class<? extends Object> term461147 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term461146 = ((Class) term461147).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term461146).setAccessible(true);
        Object enum854 = ((Field) term461146).get((Object) null);
        term459278 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term459460 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term459278, term459278.getClass(), "kind", enum853);
        setField(term459460, term459460.getClass(), "kind", enum854);
        setField(term459460, term459460.getClass(), "typeOfThis", null);
        setField(term459278, term459278.getClass(), "typeOfThis", term459460);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term459278;
        try {
            callMethod(klass, "isSubtype", argTypes, term458822, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


