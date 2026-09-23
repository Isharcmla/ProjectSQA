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

public class FunctionType_isSubtype_21010021581416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2014997;
     Object term2015649;

    public FunctionType_isSubtype_21010021581416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2018973 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2018972 = ((Class) term2018973).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2018972).setAccessible(true);
        Object enum3583 = ((Field) term2018972).get((Object) null);
        Class<? extends Object> term2019273 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2019272 = ((Class) term2019273).getDeclaredField((String) "INTERFACE");
        ((Field) term2019272).setAccessible(true);
        Object enum3584 = ((Field) term2019272).get((Object) null);
        term2014997 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2015541 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2014997, term2014997.getClass(), "kind", enum3583);
        setField(term2015541, term2015541.getClass(), "kind", enum3584);
        setField(term2014997, term2014997.getClass(), "typeOfThis", term2015541);
        term2015649 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2015979 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2015649, term2015649.getClass(), "kind", enum3583);
        setField(term2015979, term2015979.getClass(), "kind", enum3584);
        setField(term2015649, term2015649.getClass(), "typeOfThis", term2015979);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2015649;
        try {
            callMethod(klass, "isSubtype", argTypes, term2014997, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


