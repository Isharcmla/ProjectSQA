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

public class FunctionType_isSubtype_21010021581513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1992600;
     Object term1993352;

    public FunctionType_isSubtype_21010021581513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1994778 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1994777 = ((Class) term1994778).getDeclaredField((String) "INTERFACE");
        ((Field) term1994777).setAccessible(true);
        Object enum3716 = ((Field) term1994777).get((Object) null);
        Class<? extends Object> term1995072 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1995071 = ((Class) term1995072).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1995071).setAccessible(true);
        Object enum3717 = ((Field) term1995071).get((Object) null);
        term1992600 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1993144 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1993244 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1992600, term1992600.getClass(), "kind", enum3716);
        setField(term1993144, term1993144.getClass(), "kind", enum3717);
        setField(term1993144, term1993144.getClass(), "typeOfThis", term1993244);
        setField(term1992600, term1992600.getClass(), "typeOfThis", term1993144);
        term1993352 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1993674 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1993772 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term1993352, term1993352.getClass(), "kind", enum3716);
        setField(term1993674, term1993674.getClass(), "kind", enum3717);
        setField(term1993674, term1993674.getClass(), "typeOfThis", term1993772);
        setField(term1993352, term1993352.getClass(), "typeOfThis", term1993674);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1993352;
        try {
            callMethod(klass, "isSubtype", argTypes, term1992600, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


