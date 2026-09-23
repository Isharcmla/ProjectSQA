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

public class FunctionType_getLeastSupertype_4188508861024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1307708;
     Object term1307510;

    public FunctionType_getLeastSupertype_4188508861024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1310809 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1310808 = ((Class) term1310809).getDeclaredField((String) "ORDINARY");
        ((Field) term1310808).setAccessible(true);
        Object enum2347 = ((Field) term1310808).get((Object) null);
        term1307708 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term1307837 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1307887 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term1307939 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1307708, term1307708.getClass(), "kind", enum2347);
        setField(term1307837, term1307837.getClass(), "kind", enum2347);
        setField(term1307837, term1307837.getClass(), "typeOfThis", term1307887);
        setField(term1307708, term1307708.getClass(), "typeOfThis", term1307837);
        setField(term1307708, term1307708.getClass(), "registry", term1307939);
        Class<? extends Object> term1311100 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1311099 = ((Class) term1311100).getDeclaredField((String) "INTERFACE");
        ((Field) term1311099).setAccessible(true);
        Object enum2348 = ((Field) term1311099).get((Object) null);
        term1307510 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1307510, term1307510.getClass(), "kind", enum2348);
        setField(term1307510, term1307510.getClass(), "typeOfThis", term1307708);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1307510;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term1307708, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


