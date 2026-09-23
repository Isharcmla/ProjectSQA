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

public class FunctionType_getLeastSupertype_4188508861485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2149174;
     Object term2149948;

    public FunctionType_getLeastSupertype_4188508861485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2151805 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2151804 = ((Class) term2151805).getDeclaredField((String) "ORDINARY");
        ((Field) term2151804).setAccessible(true);
        Object enum3831 = ((Field) term2151804).get((Object) null);
        Class<? extends Object> term2152096 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2152095 = ((Class) term2152096).getDeclaredField((String) "INTERFACE");
        ((Field) term2152095).setAccessible(true);
        Object enum3832 = ((Field) term2152095).get((Object) null);
        term2149174 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2149728 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2149838 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2149174, term2149174.getClass(), "kind", enum3831);
        setField(term2149728, term2149728.getClass(), "kind", enum3831);
        setField(term2149838, term2149838.getClass(), "kind", enum3832);
        setField(term2149728, term2149728.getClass(), "typeOfThis", term2149838);
        setField(term2149174, term2149174.getClass(), "typeOfThis", term2149728);
        Class<? extends Object> term2152390 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2152389 = ((Class) term2152390).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2152389).setAccessible(true);
        Object enum3833 = ((Field) term2152389).get((Object) null);
        term2149948 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2150122 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2150370 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2149948, term2149948.getClass(), "kind", enum3833);
        setField(term2150122, term2150122.getClass(), "kind", enum3831);
        setField(term2150122, term2150122.getClass(), "typeOfThis", term2150370);
        setField(term2149948, term2149948.getClass(), "typeOfThis", term2150122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2149948;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term2149174, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


