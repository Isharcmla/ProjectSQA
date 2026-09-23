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

public class FunctionType_isSubtype_2101002158823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term955320;
     Object term956072;

    public FunctionType_isSubtype_2101002158823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term957232 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term957231 = ((Class) term957232).getDeclaredField((String) "ORDINARY");
        ((Field) term957231).setAccessible(true);
        Object enum1729 = ((Field) term957231).get((Object) null);
        term955320 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term955864 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term955964 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term955320, term955320.getClass(), "kind", enum1729);
        setField(term955864, term955864.getClass(), "kind", enum1729);
        setField(term955864, term955864.getClass(), "typeOfThis", term955964);
        setField(term955320, term955320.getClass(), "typeOfThis", term955864);
        term956072 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term956402 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term956072, term956072.getClass(), "kind", enum1729);
        setField(term956402, term956402.getClass(), "kind", enum1729);
        setField(term956402, term956402.getClass(), "typeOfThis", null);
        setField(term956072, term956072.getClass(), "typeOfThis", term956402);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term956072;
        try {
            callMethod(klass, "isSubtype", argTypes, term955320, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


