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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129340;
     Object term129839;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129340 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term129839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term129874 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term129928 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term129982 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term130036 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setIntField(term129839, term129839.getClass(), "type", 0);
        setField(term129839, term129839.getClass(), "first", null);
        setField(term129839, term129839.getClass(), "next", term129874);
        setIntField(term129928, term129928.getClass(), "propType", 0);
        setIntField(term129982, term129982.getClass(), "propType", 0);
        setField(term129982, term129982.getClass(), "next", term130036);
        setField(term129928, term129928.getClass(), "next", term129982);
        setField(term129839, term129839.getClass(), "propListHead", term129928);
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
        args[0] = term129839;
        args[1] = null;
        args[2] = term129839;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term129340, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


