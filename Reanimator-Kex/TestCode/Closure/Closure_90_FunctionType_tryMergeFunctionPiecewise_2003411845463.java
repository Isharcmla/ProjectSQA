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
import java.lang.Object;
import java.lang.String;

public class FunctionType_tryMergeFunctionPiecewise_2003411845463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term385618;
     Object term385334;

    public FunctionType_tryMergeFunctionPiecewise_2003411845463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term387057 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term387056 = ((Class) term387057).getDeclaredField((String) "ORDINARY");
        ((Field) term387056).setAccessible(true);
        Object enum657 = ((Field) term387056).get((Object) null);
        Class<? extends Object> term387348 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term387347 = ((Class) term387348).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term387347).setAccessible(true);
        Object enum658 = ((Field) term387347).get((Object) null);
        term385618 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term385665 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term385700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term385735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term385785 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term385903 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term385735, term385735.getClass(), "jsType", null);
        setField(term385735, term385735.getClass(), "next", null);
        setField(term385700, term385700.getClass(), "first", term385735);
        setField(term385665, term385665.getClass(), "parameters", term385700);
        setField(term385785, term385785.getClass(), "kind", enum657);
        setField(term385785, term385785.getClass(), "typeOfThis", term385903);
        setField(term385665, term385665.getClass(), "returnType", term385785);
        setField(term385618, term385618.getClass(), "call", term385665);
        setField(term385618, term385618.getClass(), "kind", enum658);
        setField(term385618, term385618.getClass(), "typeOfThis", null);
        term385334 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term385428 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term385498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term385568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term385568, term385568.getClass(), "jsType", null);
        setField(term385568, term385568.getClass(), "next", null);
        setField(term385498, term385498.getClass(), "first", term385568);
        setField(term385428, term385428.getClass(), "parameters", term385498);
        setField(term385428, term385428.getClass(), "returnType", term385618);
        setField(term385334, term385334.getClass(), "call", term385428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term385334;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term385618, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


