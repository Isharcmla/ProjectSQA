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

public class FunctionType_isSubtype_2101002158985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1230702;
     Object term1231356;

    public FunctionType_isSubtype_2101002158985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1233697 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1233696 = ((Class) term1233697).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1233696).setAccessible(true);
        Object enum2214 = ((Field) term1233696).get((Object) null);
        term1230702 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1231246 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1230702, term1230702.getClass(), "kind", enum2214);
        setField(term1231246, term1231246.getClass(), "kind", enum2214);
        setField(term1230702, term1230702.getClass(), "typeOfThis", term1231246);
        Class<? extends Object> term1233997 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1233996 = ((Class) term1233997).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1233996).setAccessible(true);
        Object enum2215 = ((Field) term1233996).get((Object) null);
        term1231356 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1231688 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1231356, term1231356.getClass(), "kind", enum2214);
        setField(term1231688, term1231688.getClass(), "kind", enum2215);
        setField(term1231356, term1231356.getClass(), "typeOfThis", term1231688);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1231356;
        try {
            callMethod(klass, "isSubtype", argTypes, term1230702, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


