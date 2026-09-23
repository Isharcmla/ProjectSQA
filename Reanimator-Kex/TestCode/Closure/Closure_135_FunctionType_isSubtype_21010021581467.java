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

public class FunctionType_isSubtype_21010021581467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1913060;
     Object term1913720;

    public FunctionType_isSubtype_21010021581467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1914978 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1914977 = ((Class) term1914978).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1914977).setAccessible(true);
        Object enum3563 = ((Field) term1914977).get((Object) null);
        Class<? extends Object> term1915278 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1915277 = ((Class) term1915278).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1915277).setAccessible(true);
        Object enum3564 = ((Field) term1915277).get((Object) null);
        term1913060 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1913612 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1913060, term1913060.getClass(), "kind", enum3563);
        setField(term1913612, term1913612.getClass(), "kind", enum3564);
        setField(term1913060, term1913060.getClass(), "typeOfThis", term1913612);
        term1913720 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1913902 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1913720, term1913720.getClass(), "kind", enum3564);
        setField(term1913902, term1913902.getClass(), "kind", enum3564);
        setField(term1913720, term1913720.getClass(), "typeOfThis", term1913902);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1913720;
        try {
            callMethod(klass, "isSubtype", argTypes, term1913060, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


