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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term638528;
     Object term638614;
     Object term638798;
     Object term638890;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term638528 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term638614 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term638706 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term638706, term638706.getClass(), "type", 108);
        setField(term638614, term638614.getClass(), "parent", term638706);
        setIntField(term638614, term638614.getClass(), "type", 0);
        term638798 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term638798, term638798.getClass(), "type", 52);
        term638890 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term638890, term638890.getClass(), "type", 44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term638614;
        args[1] = term638798;
        args[2] = term638890;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term638528, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


