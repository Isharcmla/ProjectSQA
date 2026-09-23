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

public class FunctionType_getLeastSupertype_418850886841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term987005;
     Object term987779;

    public FunctionType_getLeastSupertype_418850886841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term989019 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term989018 = ((Class) term989019).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term989018).setAccessible(true);
        Object enum1787 = ((Field) term989018).get((Object) null);
        Class<? extends Object> term989319 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term989318 = ((Class) term989319).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term989318).setAccessible(true);
        Object enum1788 = ((Field) term989318).get((Object) null);
        term987005 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term987559 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term987669 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term987005, term987005.getClass(), "kind", enum1787);
        setField(term987559, term987559.getClass(), "kind", enum1787);
        setField(term987669, term987669.getClass(), "kind", enum1788);
        setField(term987559, term987559.getClass(), "typeOfThis", term987669);
        setField(term987005, term987005.getClass(), "typeOfThis", term987559);
        term987779 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term987953 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term988053 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term987779, term987779.getClass(), "kind", enum1788);
        setField(term987953, term987953.getClass(), "kind", enum1788);
        setField(term987953, term987953.getClass(), "typeOfThis", term988053);
        setField(term987779, term987779.getClass(), "typeOfThis", term987953);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term987779;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term987005, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


