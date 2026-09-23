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

public class FunctionType_isSubtype_2101002158971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1080492;
     Object term1080848;

    public FunctionType_isSubtype_2101002158971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1081793 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1081792 = ((Class) term1081793).getDeclaredField((String) "ORDINARY");
        ((Field) term1081792).setAccessible(true);
        Object enum2015 = ((Field) term1081792).get((Object) null);
        term1080492 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1080740 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1080492, term1080492.getClass(), "kind", enum2015);
        setField(term1080740, term1080740.getClass(), "kind", enum2015);
        setField(term1080740, term1080740.getClass(), "typeOfThis", null);
        setField(term1080492, term1080492.getClass(), "typeOfThis", term1080740);
        term1080848 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1081030 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1081136 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term1080848, term1080848.getClass(), "kind", enum2015);
        setField(term1081030, term1081030.getClass(), "kind", enum2015);
        setField(term1081030, term1081030.getClass(), "typeOfThis", term1081136);
        setField(term1080848, term1080848.getClass(), "typeOfThis", term1081030);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1080848;
        try {
            callMethod(klass, "isSubtype", argTypes, term1080492, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


