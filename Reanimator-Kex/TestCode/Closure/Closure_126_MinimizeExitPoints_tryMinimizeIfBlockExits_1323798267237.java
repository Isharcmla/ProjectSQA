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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78644;
     Object term78714;
     Object term78784;
     Object term78854;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78644 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term78714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term78714, term78714.getClass(), "type", 0);
        setField(term78714, term78714.getClass(), "first", null);
        term78784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term78854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78962 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term78854, term78854.getClass(), "next", term78854);
        setIntField(term78962, term78962.getClass(), "propType", 0);
        setField(term78962, term78962.getClass(), "next", null);
        setField(term78854, term78854.getClass(), "propListHead", term78962);
        setIntField(term78854, term78854.getClass(), "sourcePosition", 0);
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
        args[0] = term78714;
        args[1] = term78784;
        args[2] = term78854;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term78644, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


