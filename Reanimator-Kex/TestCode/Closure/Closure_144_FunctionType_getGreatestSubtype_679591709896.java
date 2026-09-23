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

public class FunctionType_getGreatestSubtype_679591709896 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1084984;
     Object term1085462;

    public FunctionType_getGreatestSubtype_679591709896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1088891 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1088890 = ((Class) term1088891).getDeclaredField((String) "ORDINARY");
        ((Field) term1088890).setAccessible(true);
        Object enum1963 = ((Field) term1088890).get((Object) null);
        term1084984 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1085242 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1085352 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1084984, term1084984.getClass(), "kind", enum1963);
        setField(term1085242, term1085242.getClass(), "kind", enum1963);
        setField(term1085242, term1085242.getClass(), "typeOfThis", term1085352);
        setField(term1084984, term1084984.getClass(), "typeOfThis", term1085242);
        Class<? extends Object> term1089182 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1089181 = ((Class) term1089182).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1089181).setAccessible(true);
        Object enum1964 = ((Field) term1089181).get((Object) null);
        term1085462 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1085636 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1085884 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1085462, term1085462.getClass(), "kind", enum1963);
        setField(term1085636, term1085636.getClass(), "kind", enum1964);
        setField(term1085636, term1085636.getClass(), "typeOfThis", term1085884);
        setField(term1085462, term1085462.getClass(), "typeOfThis", term1085636);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1085462;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1084984, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


