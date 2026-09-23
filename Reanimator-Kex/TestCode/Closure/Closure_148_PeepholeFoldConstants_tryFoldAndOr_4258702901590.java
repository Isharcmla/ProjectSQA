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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901590 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term402151;
     Object term402237;
     Object term402393;
     Object term402479;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901590() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term402151 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term402237 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term402307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term402307, term402307.getClass(), "type", 108);
        setField(term402237, term402237.getClass(), "parent", term402307);
        setIntField(term402237, term402237.getClass(), "type", 0);
        term402393 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term402393, term402393.getClass(), "type", 87);
        term402479 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term402479, term402479.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term402237;
        args[1] = term402393;
        args[2] = term402479;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term402151, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


