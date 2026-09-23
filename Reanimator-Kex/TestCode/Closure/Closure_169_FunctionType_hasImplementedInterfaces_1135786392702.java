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
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class FunctionType_hasImplementedInterfaces_1135786392702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term702996;

    public FunctionType_hasImplementedInterfaces_1135786392702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term703048 = new ArrayList();
        Class<? extends Object> term703412 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term703411 = ((Class) term703412).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term703411).setAccessible(true);
        Object enum1142 = ((Field) term703411).get((Object) null);
        term702996 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term703310 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term703410 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term702996, term702996.getClass(), "implementedInterfaces", term703048);
        setField(term702996, term702996.getClass(), "kind", enum1142);
        setField(term703310, term703310.getClass(), "type", term703410);
        setField(term702996, term702996.getClass(), "prototypeSlot", term703310);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasImplementedInterfaces", argTypes, term702996, args);
    }

};


