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

public class FunctionType_getGreatestSubtype_6795917091393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1794161;
     Object term1794927;

    public FunctionType_getGreatestSubtype_6795917091393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1795890 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1795889 = ((Class) term1795890).getDeclaredField((String) "ORDINARY");
        ((Field) term1795889).setAccessible(true);
        Object enum3345 = ((Field) term1795889).get((Object) null);
        term1794161 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1794713 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1794819 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term1794161, term1794161.getClass(), "kind", enum3345);
        setField(term1794713, term1794713.getClass(), "kind", enum3345);
        setField(term1794713, term1794713.getClass(), "typeOfThis", term1794819);
        setField(term1794161, term1794161.getClass(), "typeOfThis", term1794713);
        term1794927 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1795249 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1794927, term1794927.getClass(), "kind", enum3345);
        setField(term1795249, term1795249.getClass(), "kind", enum3345);
        setField(term1795249, term1795249.getClass(), "typeOfThis", null);
        setField(term1794927, term1794927.getClass(), "typeOfThis", term1795249);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1794927;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1794161, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


