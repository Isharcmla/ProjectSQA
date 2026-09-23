package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152063;
     Object term152133;
     Object term152203;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152063 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term152133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term152133, term152133.getClass(), "type", 0);
        setField(term152133, term152133.getClass(), "first", null);
        term152203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term152273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term152381 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term152451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term152273, term152273.getClass(), "type", 0);
        setField(term152203, term152203.getClass(), "next", term152273);
        setIntField(term152381, term152381.getClass(), "propType", 51);
        setField(term152381, term152381.getClass(), "next", null);
        setField(term152381, term152381.getClass(), "objectValue", null);
        setField(term152203, term152203.getClass(), "propListHead", term152381);
        setIntField(term152203, term152203.getClass(), "sourcePosition", 0);
        setField(term152203, term152203.getClass(), "last", null);
        setField(term152203, term152203.getClass(), "first", null);
        setField(term152203, term152203.getClass(), "parent", term152451);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term152133;
        args[1] = null;
        args[2] = term152203;
        args[3] = 0;
        args[4] = null;
        callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term152063, args);
    }

};


