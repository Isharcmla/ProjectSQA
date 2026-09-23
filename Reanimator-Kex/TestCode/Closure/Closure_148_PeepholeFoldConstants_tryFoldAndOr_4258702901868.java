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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term492535;
     Object term492621;
     Object term492713;
     Object term492783;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term492535 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term492621 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term492621, term492621.getClass(), "parent", null);
        setIntField(term492621, term492621.getClass(), "type", 0);
        term492713 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term492713, term492713.getClass(), "type", 0);
        term492783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term492783, term492783.getClass(), "type", 47);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term492621;
        args[1] = term492713;
        args[2] = term492783;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term492535, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


