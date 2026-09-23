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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127307;
     Object term127377;
     Object term127692;
     Object term127587;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127307 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term127377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term127377, term127377.getClass(), "type", 0);
        setField(term127377, term127377.getClass(), "first", null);
        term127692 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term127727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term127692, term127692.getClass(), "type", 0);
        setField(term127692, term127692.getClass(), "propListHead", null);
        setIntField(term127692, term127692.getClass(), "sourcePosition", 0);
        setField(term127692, term127692.getClass(), "next", term127727);
        setField(term127692, term127692.getClass(), "parent", null);
        term127587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term127657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term127797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term127657, term127657.getClass(), "type", 105);
        setField(term127587, term127587.getClass(), "next", term127657);
        setField(term127587, term127587.getClass(), "propListHead", null);
        setIntField(term127587, term127587.getClass(), "sourcePosition", 0);
        setField(term127587, term127587.getClass(), "first", term127692);
        setField(term127587, term127587.getClass(), "last", term127797);
        setField(term127587, term127587.getClass(), "parent", null);
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
        args[0] = term127377;
        args[1] = term127692;
        args[2] = term127587;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term127307, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


