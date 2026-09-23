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

public class FunctionType_getLeastSupertype_418850886647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term648477;
     Object term648945;

    public FunctionType_getLeastSupertype_418850886647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term650241 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term650240 = ((Class) term650241).getDeclaredField((String) "ORDINARY");
        ((Field) term650240).setAccessible(true);
        Object enum1170 = ((Field) term650240).get((Object) null);
        term648477 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term648735 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term648835 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term648477, term648477.getClass(), "kind", enum1170);
        setField(term648735, term648735.getClass(), "kind", enum1170);
        setField(term648735, term648735.getClass(), "typeOfThis", term648835);
        setField(term648477, term648477.getClass(), "typeOfThis", term648735);
        Class<? extends Object> term650532 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term650531 = ((Class) term650532).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term650531).setAccessible(true);
        Object enum1171 = ((Field) term650531).get((Object) null);
        term648945 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term649193 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term648945, term648945.getClass(), "kind", enum1171);
        setField(term649193, term649193.getClass(), "kind", enum1171);
        setField(term649193, term649193.getClass(), "typeOfThis", null);
        setField(term648945, term648945.getClass(), "typeOfThis", term649193);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term648945;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term648477, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


