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

public class FunctionType_isSubtype_2101002158873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term914119;
     Object term914877;

    public FunctionType_isSubtype_2101002158873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term917724 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term917723 = ((Class) term917724).getDeclaredField((String) "INTERFACE");
        ((Field) term917723).setAccessible(true);
        Object enum1708 = ((Field) term917723).get((Object) null);
        term914119 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term914663 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term914769 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term914119, term914119.getClass(), "kind", enum1708);
        setField(term914663, term914663.getClass(), "kind", enum1708);
        setField(term914663, term914663.getClass(), "typeOfThis", term914769);
        setField(term914663, term914663.getClass(), "call", null);
        setField(term914119, term914119.getClass(), "typeOfThis", term914663);
        term914877 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term915207 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term915301 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term914877, term914877.getClass(), "kind", enum1708);
        setField(term915207, term915207.getClass(), "kind", enum1708);
        setField(term915207, term915207.getClass(), "typeOfThis", null);
        setField(term915207, term915207.getClass(), "call", term915301);
        setField(term914877, term914877.getClass(), "typeOfThis", term915207);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term914877;
        try {
            callMethod(klass, "isSubtype", argTypes, term914119, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


