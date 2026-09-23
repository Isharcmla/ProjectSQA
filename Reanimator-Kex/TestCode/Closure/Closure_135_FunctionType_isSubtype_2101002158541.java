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

public class FunctionType_isSubtype_2101002158541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term413390;
     Object term413746;

    public FunctionType_isSubtype_2101002158541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term414930 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term414929 = ((Class) term414930).getDeclaredField((String) "ORDINARY");
        ((Field) term414929).setAccessible(true);
        Object enum767 = ((Field) term414929).get((Object) null);
        term413390 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term413638 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term413390, term413390.getClass(), "kind", enum767);
        setField(term413390, term413390.getClass(), "typeOfThis", term413638);
        Class<? extends Object> term415221 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term415220 = ((Class) term415221).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term415220).setAccessible(true);
        Object enum768 = ((Field) term415220).get((Object) null);
        term413746 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term414002 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term413746, term413746.getClass(), "kind", enum768);
        setField(term413746, term413746.getClass(), "typeOfThis", term414002);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term413746;
        try {
            callMethod(klass, "isSubtype", argTypes, term413390, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


