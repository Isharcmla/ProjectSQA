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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43561;
     Object term43631;
     Object term43723;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43561 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term43631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43631, term43631.getClass(), "type", 0);
        setField(term43631, term43631.getClass(), "first", null);
        term43723 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term43793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43895 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term43965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43793, term43793.getClass(), "type", 0);
        setField(term43723, term43723.getClass(), "next", term43793);
        setIntField(term43895, term43895.getClass(), "propType", 0);
        setField(term43895, term43895.getClass(), "next", null);
        setField(term43723, term43723.getClass(), "propListHead", term43895);
        setIntField(term43723, term43723.getClass(), "sourcePosition", 0);
        setField(term43723, term43723.getClass(), "last", null);
        setField(term43723, term43723.getClass(), "first", null);
        setField(term43723, term43723.getClass(), "parent", term43965);
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
        args[0] = term43631;
        args[1] = null;
        args[2] = term43723;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term43561, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


