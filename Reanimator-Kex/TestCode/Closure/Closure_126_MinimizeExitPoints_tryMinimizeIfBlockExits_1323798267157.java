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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46618;
     Object term46688;
     Object term46780;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46618 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term46688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46688, term46688.getClass(), "type", 0);
        setField(term46688, term46688.getClass(), "first", null);
        term46780 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term46850 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46952 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term46780, term46780.getClass(), "next", term46850);
        setIntField(term46952, term46952.getClass(), "propType", 40);
        setField(term46780, term46780.getClass(), "propListHead", term46952);
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
        args[0] = term46688;
        args[1] = null;
        args[2] = term46780;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term46618, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


