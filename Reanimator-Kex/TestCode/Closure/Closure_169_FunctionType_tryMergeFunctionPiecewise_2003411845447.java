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
import java.lang.Object;
import java.lang.String;

public class FunctionType_tryMergeFunctionPiecewise_2003411845447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term407380;
     Object term408036;

    public FunctionType_tryMergeFunctionPiecewise_2003411845447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term411247 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term411246 = ((Class) term411247).getDeclaredField((String) "ORDINARY");
        ((Field) term411246).setAccessible(true);
        Object enum676 = ((Field) term411246).get((Object) null);
        term407380 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term407474 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term407544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term407614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term407684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term407784 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term407614, term407614.getClass(), "jsType", null);
        setField(term407684, term407684.getClass(), "jsType", null);
        setField(term407684, term407684.getClass(), "next", term407544);
        setField(term407614, term407614.getClass(), "next", term407684);
        setField(term407544, term407544.getClass(), "first", term407614);
        setField(term407544, term407544.getClass(), "jsType", null);
        setField(term407544, term407544.getClass(), "next", null);
        setField(term407474, term407474.getClass(), "parameters", term407544);
        setBooleanField(term407784, term407784.getClass(), "unknown", false);
        setField(term407784, term407784.getClass(), "kind", enum676);
        setField(term407474, term407474.getClass(), "returnType", term407784);
        setField(term407380, term407380.getClass(), "call", term407474);
        Class<? extends Object> term411538 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term411537 = ((Class) term411538).getDeclaredField((String) "INTERFACE");
        ((Field) term411537).setAccessible(true);
        Object enum677 = ((Field) term411537).get((Object) null);
        term408036 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term408130 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term408200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term408270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term408340 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term408410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term408510 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term408270, term408270.getClass(), "jsType", null);
        setField(term408340, term408340.getClass(), "jsType", null);
        setField(term408410, term408410.getClass(), "jsType", null);
        setField(term408410, term408410.getClass(), "next", null);
        setField(term408340, term408340.getClass(), "next", term408410);
        setField(term408270, term408270.getClass(), "next", term408340);
        setField(term408200, term408200.getClass(), "first", term408270);
        setField(term408130, term408130.getClass(), "parameters", term408200);
        setBooleanField(term408510, term408510.getClass(), "unknown", false);
        setField(term408510, term408510.getClass(), "kind", enum677);
        setField(term408130, term408130.getClass(), "returnType", term408510);
        setField(term408036, term408036.getClass(), "call", term408130);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term408036;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term407380, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


