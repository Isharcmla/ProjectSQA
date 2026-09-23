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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term506492;
     Object term506578;
     Object term506664;
     Object term506750;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term506492 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term506578 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term506578, term506578.getClass(), "parent", null);
        setIntField(term506578, term506578.getClass(), "type", 0);
        term506664 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term506664, term506664.getClass(), "type", 0);
        term506750 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term506750, term506750.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term506578;
        args[1] = term506664;
        args[2] = term506750;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term506492, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


