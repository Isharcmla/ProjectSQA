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

public class FunctionType_getGreatestSubtype_679591709956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1184288;
     Object term1184938;

    public FunctionType_getGreatestSubtype_679591709956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1187497 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1187496 = ((Class) term1187497).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1187496).setAccessible(true);
        Object enum2132 = ((Field) term1187496).get((Object) null);
        term1184288 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1184828 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term1184288, term1184288.getClass(), "kind", enum2132);
        setField(term1184288, term1184288.getClass(), "typeOfThis", term1184828);
        Class<? extends Object> term1187797 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1187796 = ((Class) term1187797).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1187796).setAccessible(true);
        Object enum2133 = ((Field) term1187796).get((Object) null);
        term1184938 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1185112 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1184938, term1184938.getClass(), "kind", enum2133);
        setField(term1185112, term1185112.getClass(), "kind", enum2133);
        setField(term1185112, term1185112.getClass(), "typeOfThis", null);
        setField(term1184938, term1184938.getClass(), "typeOfThis", term1185112);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1184938;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1184288, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


