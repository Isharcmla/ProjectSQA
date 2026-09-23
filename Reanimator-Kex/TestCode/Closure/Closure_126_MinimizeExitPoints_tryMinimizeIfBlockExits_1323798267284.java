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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98893;
     Object term98963;
     Object term99033;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98893 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term98963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term98963, term98963.getClass(), "type", 0);
        setField(term98963, term98963.getClass(), "first", null);
        term99033 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99211 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term99281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term99103, term99103.getClass(), "type", 0);
        setField(term99033, term99033.getClass(), "next", term99103);
        setIntField(term99211, term99211.getClass(), "propType", 40);
        setField(term99211, term99211.getClass(), "objectValue", null);
        setField(term99211, term99211.getClass(), "next", null);
        setField(term99033, term99033.getClass(), "propListHead", term99211);
        setIntField(term99033, term99033.getClass(), "sourcePosition", 0);
        setField(term99033, term99033.getClass(), "last", null);
        setField(term99033, term99033.getClass(), "first", null);
        setField(term99033, term99033.getClass(), "parent", term99281);
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
        args[0] = term98963;
        args[1] = null;
        args[2] = term99033;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term98893, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


