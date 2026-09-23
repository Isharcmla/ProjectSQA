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

public class FunctionType_getGreatestSubtype_679591709767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term857880;
     Object term858434;

    public FunctionType_getGreatestSubtype_679591709767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term860130 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term860129 = ((Class) term860130).getDeclaredField((String) "INTERFACE");
        ((Field) term860129).setAccessible(true);
        Object enum1551 = ((Field) term860129).get((Object) null);
        term857880 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term857880, term857880.getClass(), "kind", enum1551);
        setField(term857880, term857880.getClass(), "typeOfThis", term857880);
        Class<? extends Object> term860424 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term860423 = ((Class) term860424).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term860423).setAccessible(true);
        Object enum1552 = ((Field) term860423).get((Object) null);
        Class<? extends Object> term860724 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term860723 = ((Class) term860724).getDeclaredField((String) "INTERFACE");
        ((Field) term860723).setAccessible(true);
        Object enum1553 = ((Field) term860723).get((Object) null);
        term858434 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term858608 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term858856 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term858434, term858434.getClass(), "kind", enum1552);
        setField(term858608, term858608.getClass(), "kind", enum1551);
        setField(term858856, term858856.getClass(), "kind", enum1553);
        setField(term858608, term858608.getClass(), "typeOfThis", term858856);
        setField(term858434, term858434.getClass(), "typeOfThis", term858608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term858434;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term857880, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


