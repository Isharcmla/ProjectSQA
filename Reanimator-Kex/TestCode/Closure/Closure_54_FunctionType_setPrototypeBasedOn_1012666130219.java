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

public class FunctionType_setPrototypeBasedOn_1012666130219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111473;
     Object term111891;

    public FunctionType_setPrototypeBasedOn_1012666130219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term111893 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term111892 = ((Class) term111893).getDeclaredField((String) "ORDINARY");
        ((Field) term111892).setAccessible(true);
        Object enum201 = ((Field) term111892).get((Object) null);
        ArrayList term111787 = new ArrayList();
        term111473 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term111735 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setBooleanField(term111473, term111473.getClass(), "nativeType", false);
        setField(term111473, term111473.getClass(), "kind", enum201);
        setField(term111473, term111473.getClass(), "prototype", term111735);
        setField(term111473, term111473.getClass(), "prototypeSlot", null);
        setBooleanField(term111473, term111473.getClass(), "unknown", false);
        setField(term111473, term111473.getClass(), "subTypes", term111787);
        term111891 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term111891, term111891.getClass(), "className", null);
        setField(term111891, term111891.getClass(), "ownerFunction", null);
        setBooleanField(term111891, term111891.getClass(), "unknown", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = term111891;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term111473, args);
    }

};


