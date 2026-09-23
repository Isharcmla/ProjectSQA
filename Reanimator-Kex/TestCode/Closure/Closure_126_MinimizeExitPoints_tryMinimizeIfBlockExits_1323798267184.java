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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56613;
     Object term56683;
     Object term56753;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56613 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term56683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term56683, term56683.getClass(), "type", 4);
        setField(term56683, term56683.getClass(), "first", null);
        term56753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56925 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term57027 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term56753, term56753.getClass(), "next", term56823);
        setIntField(term56925, term56925.getClass(), "propType", -41);
        setIntField(term57027, term57027.getClass(), "propType", 40);
        setField(term56925, term56925.getClass(), "next", term57027);
        setField(term56753, term56753.getClass(), "propListHead", term56925);
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
        args[0] = term56683;
        args[1] = null;
        args[2] = term56753;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term56613, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


