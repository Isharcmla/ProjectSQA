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

public class FunctionType_isSubtype_21010021581472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2123173;
     Object term2123927;

    public FunctionType_isSubtype_21010021581472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2127241 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2127240 = ((Class) term2127241).getDeclaredField((String) "ORDINARY");
        ((Field) term2127240).setAccessible(true);
        Object enum3787 = ((Field) term2127240).get((Object) null);
        Class<? extends Object> term2127532 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2127531 = ((Class) term2127532).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2127531).setAccessible(true);
        Object enum3788 = ((Field) term2127531).get((Object) null);
        term2123173 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2123717 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2123817 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2123173, term2123173.getClass(), "kind", enum3787);
        setField(term2123717, term2123717.getClass(), "kind", enum3788);
        setField(term2123717, term2123717.getClass(), "typeOfThis", term2123817);
        setField(term2123173, term2123173.getClass(), "typeOfThis", term2123717);
        term2123927 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2124257 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2124365 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2123927, term2123927.getClass(), "kind", enum3787);
        setField(term2124257, term2124257.getClass(), "kind", enum3787);
        setField(term2124257, term2124257.getClass(), "typeOfThis", term2124365);
        setField(term2123927, term2123927.getClass(), "typeOfThis", term2124257);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2123927;
        try {
            callMethod(klass, "isSubtype", argTypes, term2123173, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


