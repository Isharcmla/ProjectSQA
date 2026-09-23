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

public class FunctionType_tryMergeFunctionPiecewise_2003411845433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term352536;
     Object term353222;

    public FunctionType_tryMergeFunctionPiecewise_2003411845433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term354636 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term354635 = ((Class) term354636).getDeclaredField((String) "ORDINARY");
        ((Field) term354635).setAccessible(true);
        Object enum600 = ((Field) term354635).get((Object) null);
        term352536 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term352630 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term352700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term352770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term352870 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term353122 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term352770, term352770.getClass(), "jsType", null);
        setField(term352770, term352770.getClass(), "next", null);
        setField(term352700, term352700.getClass(), "first", term352770);
        setField(term352630, term352630.getClass(), "parameters", term352700);
        setField(term352870, term352870.getClass(), "kind", enum600);
        setField(term352870, term352870.getClass(), "registry", term353122);
        setField(term352630, term352630.getClass(), "returnType", term352870);
        setField(term352536, term352536.getClass(), "call", term352630);
        Class<? extends Object> term354927 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term354926 = ((Class) term354927).getDeclaredField((String) "INTERFACE");
        ((Field) term354926).setAccessible(true);
        Object enum601 = ((Field) term354926).get((Object) null);
        term353222 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term353316 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term353386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term353456 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term353564 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term353456, term353456.getClass(), "jsType", null);
        setField(term353456, term353456.getClass(), "next", null);
        setField(term353386, term353386.getClass(), "first", term353456);
        setField(term353316, term353316.getClass(), "parameters", term353386);
        setField(term353564, term353564.getClass(), "kind", enum601);
        setField(term353316, term353316.getClass(), "returnType", term353564);
        setField(term353222, term353222.getClass(), "call", term353316);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term353222;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term352536, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


