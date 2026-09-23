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

public class ReferenceCollectingCallback_shouldTraverse_422855684735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195611;
     Object term195697;
     Object term195783;

    public ReferenceCollectingCallback_shouldTraverse_422855684735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195611 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term195697 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term195783 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term195869 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term195783, term195783.getClass(), "type", 101);
        setField(term195783, term195783.getClass(), "first", term195869);
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
        args[1] = term195697;
        args[2] = term195783;
        try {
            callMethod(klass, "shouldTraverse", argTypes, term195611, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


