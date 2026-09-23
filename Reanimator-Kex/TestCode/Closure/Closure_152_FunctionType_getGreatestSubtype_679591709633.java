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

public class FunctionType_getGreatestSubtype_679591709633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term630899;
     Object term631545;

    public FunctionType_getGreatestSubtype_679591709633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term632705 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term632704 = ((Class) term632705).getDeclaredField((String) "INTERFACE");
        ((Field) term632704).setAccessible(true);
        Object enum973 = ((Field) term632704).get((Object) null);
        term630899 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term631435 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term630899, term630899.getClass(), "kind", enum973);
        setField(term630899, term630899.getClass(), "typeOfThis", term631435);
        Class<? extends Object> term632999 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term632998 = ((Class) term632999).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term632998).setAccessible(true);
        Object enum974 = ((Field) term632998).get((Object) null);
        term631545 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term631719 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term631545, term631545.getClass(), "kind", enum974);
        setField(term631719, term631719.getClass(), "kind", enum974);
        setField(term631719, term631719.getClass(), "typeOfThis", null);
        setField(term631545, term631545.getClass(), "typeOfThis", term631719);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term631545;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term630899, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


