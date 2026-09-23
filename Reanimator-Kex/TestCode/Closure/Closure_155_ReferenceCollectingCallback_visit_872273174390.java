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
import java.util.NoSuchElementException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayDeque;

public class ReferenceCollectingCallback_visit_872273174390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93028;
     Object term93168;
     Object term93254;

    public ReferenceCollectingCallback_visit_872273174390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term93082 = new ArrayDeque();
        term93028 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term93028, term93028.getClass(), "blockStack", term93082);
        term93168 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term93168, term93168.getClass(), "type", 100);
        term93254 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term93254, term93254.getClass(), "type", 100);
        setField(term93254, term93254.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term93168;
        args[2] = term93254;
        try {
            callMethod(klass, "visit", argTypes, term93028, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


