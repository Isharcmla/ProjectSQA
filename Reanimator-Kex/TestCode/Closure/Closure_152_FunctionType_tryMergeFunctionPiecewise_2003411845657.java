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

public class FunctionType_tryMergeFunctionPiecewise_2003411845657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term669200;
     Object term669888;

    public FunctionType_tryMergeFunctionPiecewise_2003411845657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term671144 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term671143 = ((Class) term671144).getDeclaredField((String) "ORDINARY");
        ((Field) term671143).setAccessible(true);
        Object enum1027 = ((Field) term671143).get((Object) null);
        term669200 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term669294 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term669364 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term669434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term669544 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term669788 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term669434, term669434.getClass(), "jsType", null);
        setField(term669434, term669434.getClass(), "next", null);
        setField(term669364, term669364.getClass(), "first", term669434);
        setField(term669294, term669294.getClass(), "parameters", term669364);
        setField(term669544, term669544.getClass(), "kind", enum1027);
        setField(term669544, term669544.getClass(), "typeOfThis", term669788);
        setField(term669294, term669294.getClass(), "returnType", term669544);
        setField(term669200, term669200.getClass(), "call", term669294);
        term669888 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term669982 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term670052 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term670122 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term670232 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term670406 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term670122, term670122.getClass(), "jsType", null);
        setField(term670122, term670122.getClass(), "next", null);
        setField(term670052, term670052.getClass(), "first", term670122);
        setField(term669982, term669982.getClass(), "parameters", term670052);
        setField(term670232, term670232.getClass(), "kind", enum1027);
        setField(term670232, term670232.getClass(), "typeOfThis", term670406);
        setField(term669982, term669982.getClass(), "returnType", term670232);
        setField(term669888, term669888.getClass(), "call", term669982);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term669888;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term669200, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


