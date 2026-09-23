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
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class FunctionType_setPrototypeNoCheck_1402626902731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term743611;
     Object term744243;

    public FunctionType_setPrototypeNoCheck_1402626902731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term744319 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term744318 = ((Class) term744319).getDeclaredField((String) "ORDINARY");
        ((Field) term744318).setAccessible(true);
        Object enum1182 = ((Field) term744318).get((Object) null);
        ArrayList term744139 = new ArrayList();
        term743611 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term743725 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term743829 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term743939 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term743829, term743829.getClass(), "ownerFunction", term743939);
        setField(term743725, term743725.getClass(), "type", term743829);
        setField(term743611, term743611.getClass(), "prototypeSlot", term743725);
        setField(term743611, term743611.getClass(), "source", null);
        setField(term743611, term743611.getClass(), "kind", enum1182);
        setBooleanField(term743611, term743611.getClass(), "unknown", false);
        setField(term743611, term743611.getClass(), "subTypes", term744139);
        setBooleanField(term743611, term743611.getClass(), "nativeType", false);
        term744243 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term744243, term744243.getClass(), "ownerFunction", null);
        setBooleanField(term744243, term744243.getClass(), "unknown", false);
        setField(term744243, term744243.getClass(), "subTypes", null);
        setBooleanField(term744243, term744243.getClass(), "nativeType", false);
        setField(term744243, term744243.getClass(), "kind", enum1182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term744243;
        args[1] = null;
        callMethod(klass, "setPrototypeNoCheck", argTypes, term743611, args);
    }

};


