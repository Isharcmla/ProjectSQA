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

public class FunctionType_tryMergeFunctionPiecewise_2003411845511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term462569;
     Object term463079;

    public FunctionType_tryMergeFunctionPiecewise_2003411845511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term464168 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term464167 = ((Class) term464168).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term464167).setAccessible(true);
        Object enum757 = ((Field) term464167).get((Object) null);
        term462569 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term462663 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term462733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term463368 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term462733, term462733.getClass(), "first", term462733);
        setField(term462733, term462733.getClass(), "jsType", null);
        setField(term462733, term462733.getClass(), "next", null);
        setField(term462663, term462663.getClass(), "parameters", term462733);
        setField(term463368, term463368.getClass(), "kind", enum757);
        setField(term462663, term462663.getClass(), "returnType", term463368);
        setBooleanField(term462663, term462663.getClass(), "returnTypeInferred", false);
        setField(term462569, term462569.getClass(), "call", term462663);
        setField(term462569, term462569.getClass(), "typeOfThis", null);
        term463079 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term463173 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term463243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term463313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term463313, term463313.getClass(), "jsType", null);
        setField(term463313, term463313.getClass(), "next", null);
        setField(term463243, term463243.getClass(), "first", term463313);
        setField(term463173, term463173.getClass(), "parameters", term463243);
        setField(term463173, term463173.getClass(), "returnType", term463368);
        setBooleanField(term463173, term463173.getClass(), "returnTypeInferred", true);
        setField(term463079, term463079.getClass(), "call", term463173);
        setField(term463079, term463079.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term463079;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term462569, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


