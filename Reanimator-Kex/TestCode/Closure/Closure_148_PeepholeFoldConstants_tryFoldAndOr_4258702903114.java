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

public class PeepholeFoldConstants_tryFoldAndOr_4258702903114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term921702;
     Object term921788;
     Object term921878;
     Object term921968;

    public PeepholeFoldConstants_tryFoldAndOr_4258702903114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term921702 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term921788 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term921788, term921788.getClass(), "parent", null);
        setIntField(term921788, term921788.getClass(), "type", 0);
        term921878 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term921878, term921878.getClass(), "type", 0);
        term921968 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term921968, term921968.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term921788;
        args[1] = term921878;
        args[2] = term921968;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term921702, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


