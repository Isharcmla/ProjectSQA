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

public class FunctionType_isSubtype_2101002158719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term770962;
     Object term771624;

    public FunctionType_isSubtype_2101002158719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term773208 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term773207 = ((Class) term773208).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term773207).setAccessible(true);
        Object enum1389 = ((Field) term773207).get((Object) null);
        term770962 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term771514 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term770962, term770962.getClass(), "kind", enum1389);
        setField(term771514, term771514.getClass(), "kind", enum1389);
        setField(term770962, term770962.getClass(), "typeOfThis", term771514);
        Class<? extends Object> term773508 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term773507 = ((Class) term773508).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term773507).setAccessible(true);
        Object enum1390 = ((Field) term773507).get((Object) null);
        Class<? extends Object> term773808 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term773807 = ((Class) term773808).getDeclaredField((String) "INTERFACE");
        ((Field) term773807).setAccessible(true);
        Object enum1391 = ((Field) term773807).get((Object) null);
        term771624 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term771806 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term771624, term771624.getClass(), "kind", enum1390);
        setField(term771806, term771806.getClass(), "kind", enum1391);
        setField(term771624, term771624.getClass(), "typeOfThis", term771806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term771624;
        try {
            callMethod(klass, "isSubtype", argTypes, term770962, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


