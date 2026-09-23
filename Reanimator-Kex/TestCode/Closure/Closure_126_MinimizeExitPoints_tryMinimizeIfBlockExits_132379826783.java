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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_132379826783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15962;
     Object term16032;
     Object term16102;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_132379826783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15962 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term16032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16032, term16032.getClass(), "type", 4);
        setField(term16032, term16032.getClass(), "first", null);
        term16102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16274 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term16102, term16102.getClass(), "next", term16172);
        setField(term16102, term16102.getClass(), "propListHead", term16274);
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
        args[0] = term16032;
        args[1] = null;
        args[2] = term16102;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term15962, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


