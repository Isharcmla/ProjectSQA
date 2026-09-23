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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112364;
     Object term112717;
     Object term112682;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112364 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term112717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112806 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setIntField(term112717, term112717.getClass(), "type", 0);
        setField(term112717, term112717.getClass(), "first", null);
        setField(term112717, term112717.getClass(), "next", term112752);
        setIntField(term112806, term112806.getClass(), "propType", 51);
        setField(term112806, term112806.getClass(), "next", null);
        setField(term112806, term112806.getClass(), "objectValue", null);
        setField(term112717, term112717.getClass(), "propListHead", term112806);
        setIntField(term112717, term112717.getClass(), "sourcePosition", 0);
        term112682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
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
        args[0] = term112717;
        args[1] = term112682;
        args[2] = term112717;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term112364, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


