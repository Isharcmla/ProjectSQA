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

public class FunctionType_isSubtype_21010021581599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2139200;
     Object term2139852;

    public FunctionType_isSubtype_21010021581599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2141337 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2141336 = ((Class) term2141337).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2141336).setAccessible(true);
        Object enum3990 = ((Field) term2141336).get((Object) null);
        Class<? extends Object> term2141637 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2141636 = ((Class) term2141637).getDeclaredField((String) "INTERFACE");
        ((Field) term2141636).setAccessible(true);
        Object enum3991 = ((Field) term2141636).get((Object) null);
        term2139200 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2139744 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2139200, term2139200.getClass(), "kind", enum3990);
        setField(term2139744, term2139744.getClass(), "kind", enum3991);
        setField(term2139200, term2139200.getClass(), "typeOfThis", term2139744);
        term2139852 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2140182 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2139852, term2139852.getClass(), "kind", enum3990);
        setField(term2140182, term2140182.getClass(), "kind", enum3990);
        setField(term2139852, term2139852.getClass(), "typeOfThis", term2140182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2139852;
        try {
            callMethod(klass, "isSubtype", argTypes, term2139200, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


