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

public class FunctionType_isSubtype_21010021581523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2012089;
     Object term2012859;

    public FunctionType_isSubtype_21010021581523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2014293 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2014292 = ((Class) term2014293).getDeclaredField((String) "ORDINARY");
        ((Field) term2014292).setAccessible(true);
        Object enum3749 = ((Field) term2014292).get((Object) null);
        term2012089 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2012641 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2012751 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2012089, term2012089.getClass(), "kind", enum3749);
        setField(term2012641, term2012641.getClass(), "kind", enum3749);
        setField(term2012641, term2012641.getClass(), "typeOfThis", term2012751);
        setField(term2012089, term2012089.getClass(), "typeOfThis", term2012641);
        Class<? extends Object> term2014584 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2014583 = ((Class) term2014584).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2014583).setAccessible(true);
        Object enum3750 = ((Field) term2014583).get((Object) null);
        term2012859 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2013041 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2013287 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term2012859, term2012859.getClass(), "kind", enum3750);
        setField(term2013041, term2013041.getClass(), "kind", enum3749);
        setField(term2013041, term2013041.getClass(), "typeOfThis", term2013287);
        setField(term2012859, term2012859.getClass(), "typeOfThis", term2013041);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2012859;
        try {
            callMethod(klass, "isSubtype", argTypes, term2012089, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


