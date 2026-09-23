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

public class FunctionType_tryMergeFunctionPiecewise_2003411845441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term358534;
     Object term359220;

    public FunctionType_tryMergeFunctionPiecewise_2003411845441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term360634 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term360633 = ((Class) term360634).getDeclaredField((String) "ORDINARY");
        ((Field) term360633).setAccessible(true);
        Object enum614 = ((Field) term360633).get((Object) null);
        term358534 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term358628 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term358698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term358768 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term358868 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term359120 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term358768, term358768.getClass(), "jsType", null);
        setField(term358768, term358768.getClass(), "next", null);
        setField(term358698, term358698.getClass(), "first", term358768);
        setField(term358628, term358628.getClass(), "parameters", term358698);
        setField(term358868, term358868.getClass(), "kind", enum614);
        setField(term358868, term358868.getClass(), "registry", term359120);
        setField(term358628, term358628.getClass(), "returnType", term358868);
        setField(term358534, term358534.getClass(), "call", term358628);
        Class<? extends Object> term360925 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term360924 = ((Class) term360925).getDeclaredField((String) "INTERFACE");
        ((Field) term360924).setAccessible(true);
        Object enum615 = ((Field) term360924).get((Object) null);
        term359220 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term359314 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term359384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term359454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term359562 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term359454, term359454.getClass(), "jsType", null);
        setField(term359454, term359454.getClass(), "next", null);
        setField(term359384, term359384.getClass(), "first", term359454);
        setField(term359314, term359314.getClass(), "parameters", term359384);
        setField(term359562, term359562.getClass(), "kind", enum615);
        setField(term359314, term359314.getClass(), "returnType", term359562);
        setField(term359220, term359220.getClass(), "call", term359314);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term359220;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term358534, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


