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

public class FunctionType_getLeastSupertype_418850886739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term805609;
     Object term806373;

    public FunctionType_getLeastSupertype_418850886739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term807362 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term807361 = ((Class) term807362).getDeclaredField((String) "ORDINARY");
        ((Field) term807361).setAccessible(true);
        Object enum1452 = ((Field) term807361).get((Object) null);
        term805609 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term806163 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term806263 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term805609, term805609.getClass(), "kind", enum1452);
        setField(term806163, term806163.getClass(), "kind", enum1452);
        setField(term806163, term806163.getClass(), "typeOfThis", term806263);
        setField(term805609, term805609.getClass(), "typeOfThis", term806163);
        term806373 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term806695 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term806373, term806373.getClass(), "kind", enum1452);
        setField(term806695, term806695.getClass(), "kind", enum1452);
        setField(term806695, term806695.getClass(), "typeOfThis", null);
        setField(term806373, term806373.getClass(), "typeOfThis", term806695);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term806373;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term805609, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


