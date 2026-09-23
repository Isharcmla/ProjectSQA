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

public class FunctionType_setPrototypeNoCheck_1402626902693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term692798;
     Object term693264;

    public FunctionType_setPrototypeNoCheck_1402626902693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term693318 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term693317 = ((Class) term693318).getDeclaredField((String) "ORDINARY");
        ((Field) term693317).setAccessible(true);
        Object enum1132 = ((Field) term693317).get((Object) null);
        term692798 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term692912 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term693012 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term693012, term693012.getClass(), "ownerFunction", null);
        setField(term692912, term692912.getClass(), "type", term693012);
        setField(term692798, term692798.getClass(), "prototypeSlot", term692912);
        setField(term692798, term692798.getClass(), "source", null);
        setField(term692798, term692798.getClass(), "kind", enum1132);
        setBooleanField(term692798, term692798.getClass(), "unknown", false);
        setField(term692798, term692798.getClass(), "subTypes", null);
        setBooleanField(term692798, term692798.getClass(), "nativeType", false);
        ArrayList term693316 = new ArrayList();
        term693264 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term693264, term693264.getClass(), "ownerFunction", null);
        setBooleanField(term693264, term693264.getClass(), "unknown", false);
        setField(term693264, term693264.getClass(), "subTypes", term693316);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term693264;
        args[1] = null;
        callMethod(klass, "setPrototypeNoCheck", argTypes, term692798, args);
    }

};


