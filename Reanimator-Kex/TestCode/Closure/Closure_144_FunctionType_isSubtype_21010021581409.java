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

public class FunctionType_isSubtype_21010021581409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2003755;
     Object term2004415;

    public FunctionType_isSubtype_21010021581409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2005996 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2005995 = ((Class) term2005996).getDeclaredField((String) "INTERFACE");
        ((Field) term2005995).setAccessible(true);
        Object enum3559 = ((Field) term2005995).get((Object) null);
        Class<? extends Object> term2006290 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2006289 = ((Class) term2006290).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2006289).setAccessible(true);
        Object enum3560 = ((Field) term2006289).get((Object) null);
        term2003755 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2004307 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2003755, term2003755.getClass(), "kind", enum3559);
        setField(term2004307, term2004307.getClass(), "kind", enum3560);
        setField(term2003755, term2003755.getClass(), "typeOfThis", term2004307);
        term2004415 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2004745 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2004415, term2004415.getClass(), "kind", enum3559);
        setField(term2004745, term2004745.getClass(), "kind", enum3560);
        setField(term2004415, term2004415.getClass(), "typeOfThis", term2004745);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2004415;
        try {
            callMethod(klass, "isSubtype", argTypes, term2003755, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


