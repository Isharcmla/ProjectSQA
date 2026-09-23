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

public class FunctionType_isSubtype_2101002158725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term782683;
     Object term783337;

    public FunctionType_isSubtype_2101002158725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term785025 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term785024 = ((Class) term785025).getDeclaredField((String) "INTERFACE");
        ((Field) term785024).setAccessible(true);
        Object enum1412 = ((Field) term785024).get((Object) null);
        term782683 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term783227 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term782683, term782683.getClass(), "kind", enum1412);
        setField(term783227, term783227.getClass(), "kind", enum1412);
        setField(term782683, term782683.getClass(), "typeOfThis", term783227);
        Class<? extends Object> term785319 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term785318 = ((Class) term785319).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term785318).setAccessible(true);
        Object enum1413 = ((Field) term785318).get((Object) null);
        Class<? extends Object> term785619 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term785618 = ((Class) term785619).getDeclaredField((String) "INTERFACE");
        ((Field) term785618).setAccessible(true);
        Object enum1414 = ((Field) term785618).get((Object) null);
        term783337 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term783521 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term783337, term783337.getClass(), "kind", enum1413);
        setField(term783521, term783521.getClass(), "kind", enum1414);
        setField(term783337, term783337.getClass(), "typeOfThis", term783521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term783337;
        try {
            callMethod(klass, "isSubtype", argTypes, term782683, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


