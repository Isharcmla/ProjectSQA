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

public class FunctionType_setPrototypeNoCheck_1402626902696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term695824;
     Object term696586;

    public FunctionType_setPrototypeNoCheck_1402626902696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term696976 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term696975 = ((Class) term696976).getDeclaredField((String) "INTERFACE");
        ((Field) term696975).setAccessible(true);
        Object enum1135 = ((Field) term696975).get((Object) null);
        term695824 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term695938 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term696038 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term695938, term695938.getClass(), "type", term695824);
        setField(term695824, term695824.getClass(), "prototypeSlot", term695938);
        setField(term695824, term695824.getClass(), "source", null);
        setField(term695824, term695824.getClass(), "ownerFunction", term696038);
        setField(term695824, term695824.getClass(), "kind", enum1135);
        setBooleanField(term695824, term695824.getClass(), "unknown", false);
        setField(term695824, term695824.getClass(), "subTypes", null);
        setBooleanField(term695824, term695824.getClass(), "nativeType", false);
        ArrayList term696638 = new ArrayList();
        term696586 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term696974 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term696586, term696586.getClass(), "ownerFunction", null);
        setBooleanField(term696586, term696586.getClass(), "unknown", false);
        setField(term696586, term696586.getClass(), "subTypes", term696638);
        setBooleanField(term696586, term696586.getClass(), "nativeType", false);
        setField(term696586, term696586.getClass(), "kind", enum1135);
        setField(term696586, term696586.getClass(), "prototypeSlot", term696974);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term696586;
        args[1] = null;
        callMethod(klass, "setPrototypeNoCheck", argTypes, term695824, args);
    }

};


