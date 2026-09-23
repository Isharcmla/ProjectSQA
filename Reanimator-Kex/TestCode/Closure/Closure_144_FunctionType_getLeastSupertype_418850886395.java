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

public class FunctionType_getLeastSupertype_418850886395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296928;
     Object term297414;

    public FunctionType_getLeastSupertype_418850886395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term298399 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term298398 = ((Class) term298399).getDeclaredField((String) "ORDINARY");
        ((Field) term298398).setAccessible(true);
        Object enum546 = ((Field) term298398).get((Object) null);
        term296928 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term297200 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term297304 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term296928, term296928.getClass(), "kind", enum546);
        setField(term296928, term296928.getClass(), "typeOfThis", term297200);
        setField(term296928, term296928.getClass(), "registry", term297304);
        Class<? extends Object> term298690 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term298689 = ((Class) term298690).getDeclaredField((String) "INTERFACE");
        ((Field) term298689).setAccessible(true);
        Object enum547 = ((Field) term298689).get((Object) null);
        term297414 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term297414, term297414.getClass(), "kind", enum547);
        setField(term297414, term297414.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term297414;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term296928, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


