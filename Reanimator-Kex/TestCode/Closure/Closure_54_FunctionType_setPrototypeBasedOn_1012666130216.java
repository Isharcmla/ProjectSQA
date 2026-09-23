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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class FunctionType_setPrototypeBasedOn_1012666130216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109175;
     Object term109541;

    public FunctionType_setPrototypeBasedOn_1012666130216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term109595 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term109594 = ((Class) term109595).getDeclaredField((String) "ORDINARY");
        ((Field) term109594).setAccessible(true);
        Object enum199 = ((Field) term109594).get((Object) null);
        term109175 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term109437 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setBooleanField(term109175, term109175.getClass(), "nativeType", false);
        setField(term109175, term109175.getClass(), "kind", enum199);
        setField(term109175, term109175.getClass(), "prototype", term109437);
        setField(term109175, term109175.getClass(), "prototypeSlot", null);
        setBooleanField(term109175, term109175.getClass(), "unknown", false);
        setField(term109175, term109175.getClass(), "subTypes", null);
        ArrayList term109593 = new ArrayList();
        term109541 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term109541, term109541.getClass(), "className", null);
        setField(term109541, term109541.getClass(), "ownerFunction", null);
        setBooleanField(term109541, term109541.getClass(), "unknown", false);
        setField(term109541, term109541.getClass(), "subTypes", term109593);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = term109541;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term109175, args);
    }

};


