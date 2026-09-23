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

public class FunctionType_isSubtype_21010021581456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2090532;
     Object term2091044;

    public FunctionType_isSubtype_21010021581456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2094544 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2094543 = ((Class) term2094544).getDeclaredField((String) "ORDINARY");
        ((Field) term2094543).setAccessible(true);
        Object enum3725 = ((Field) term2094543).get((Object) null);
        Class<? extends Object> term2094835 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2094834 = ((Class) term2094835).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2094834).setAccessible(true);
        Object enum3726 = ((Field) term2094834).get((Object) null);
        term2090532 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2090788 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2090532, term2090532.getClass(), "kind", enum3725);
        setField(term2090788, term2090788.getClass(), "kind", enum3726);
        setField(term2090788, term2090788.getClass(), "typeOfThis", null);
        setField(term2090532, term2090532.getClass(), "typeOfThis", term2090788);
        term2091044 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2091226 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2091336 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2091044, term2091044.getClass(), "kind", enum3725);
        setField(term2091226, term2091226.getClass(), "kind", enum3725);
        setField(term2091226, term2091226.getClass(), "typeOfThis", term2091336);
        setField(term2091044, term2091044.getClass(), "typeOfThis", term2091226);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2091044;
        try {
            callMethod(klass, "isSubtype", argTypes, term2090532, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


