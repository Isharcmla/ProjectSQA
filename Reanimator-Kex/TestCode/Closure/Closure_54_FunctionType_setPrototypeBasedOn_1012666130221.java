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

public class FunctionType_setPrototypeBasedOn_1012666130221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113149;
     Object term113811;

    public FunctionType_setPrototypeBasedOn_1012666130221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term113887 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term113886 = ((Class) term113887).getDeclaredField((String) "INTERFACE");
        ((Field) term113886).setAccessible(true);
        Object enum203 = ((Field) term113886).get((Object) null);
        term113149 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term113707 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setBooleanField(term113149, term113149.getClass(), "nativeType", false);
        setField(term113149, term113149.getClass(), "kind", enum203);
        setField(term113149, term113149.getClass(), "prototype", term113707);
        setField(term113149, term113149.getClass(), "prototypeSlot", null);
        setBooleanField(term113149, term113149.getClass(), "unknown", false);
        setField(term113149, term113149.getClass(), "subTypes", null);
        Class<? extends Object> term114181 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term114180 = ((Class) term114181).getDeclaredField((String) "INTERFACE");
        ((Field) term114180).setAccessible(true);
        Object enum204 = ((Field) term114180).get((Object) null);
        term113811 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term113811, term113811.getClass(), "className", null);
        setField(term113811, term113811.getClass(), "ownerFunction", null);
        setBooleanField(term113811, term113811.getClass(), "unknown", false);
        setField(term113811, term113811.getClass(), "subTypes", null);
        setBooleanField(term113811, term113811.getClass(), "nativeType", false);
        setField(term113811, term113811.getClass(), "kind", enum204);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = term113811;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term113149, args);
    }

};


