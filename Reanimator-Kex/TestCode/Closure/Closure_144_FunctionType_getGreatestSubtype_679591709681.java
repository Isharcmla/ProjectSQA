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

public class FunctionType_getGreatestSubtype_679591709681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term706035;
     Object term706513;

    public FunctionType_getGreatestSubtype_679591709681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term708012 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term708011 = ((Class) term708012).getDeclaredField((String) "ORDINARY");
        ((Field) term708011).setAccessible(true);
        Object enum1272 = ((Field) term708011).get((Object) null);
        term706035 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term706293 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term706403 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term706035, term706035.getClass(), "kind", enum1272);
        setField(term706293, term706293.getClass(), "kind", enum1272);
        setField(term706293, term706293.getClass(), "typeOfThis", term706403);
        setField(term706035, term706035.getClass(), "typeOfThis", term706293);
        Class<? extends Object> term708303 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term708302 = ((Class) term708303).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term708302).setAccessible(true);
        Object enum1273 = ((Field) term708302).get((Object) null);
        term706513 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term706687 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term706935 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term706513, term706513.getClass(), "kind", enum1272);
        setField(term706687, term706687.getClass(), "kind", enum1273);
        setField(term706687, term706687.getClass(), "typeOfThis", term706935);
        setField(term706513, term706513.getClass(), "typeOfThis", term706687);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term706513;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term706035, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


