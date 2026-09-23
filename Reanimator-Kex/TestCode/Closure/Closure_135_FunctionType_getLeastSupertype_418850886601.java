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

public class FunctionType_getLeastSupertype_418850886601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term505411;
     Object term506183;

    public FunctionType_getLeastSupertype_418850886601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term507308 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term507307 = ((Class) term507308).getDeclaredField((String) "INTERFACE");
        ((Field) term507307).setAccessible(true);
        Object enum936 = ((Field) term507307).get((Object) null);
        term505411 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term505965 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term506075 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term505411, term505411.getClass(), "kind", enum936);
        setField(term505965, term505965.getClass(), "kind", enum936);
        setField(term505965, term505965.getClass(), "typeOfThis", term506075);
        setField(term505411, term505411.getClass(), "typeOfThis", term505965);
        Class<? extends Object> term507602 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term507601 = ((Class) term507602).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term507601).setAccessible(true);
        Object enum937 = ((Field) term507601).get((Object) null);
        term506183 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term506357 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term506183, term506183.getClass(), "kind", enum937);
        setField(term506357, term506357.getClass(), "kind", enum937);
        setField(term506357, term506357.getClass(), "typeOfThis", null);
        setField(term506183, term506183.getClass(), "typeOfThis", term506357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term506183;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term505411, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


