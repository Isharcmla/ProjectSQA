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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term824623;
     Object term824709;
     Object term824865;
     Object term824951;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term824623 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term824709 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term824779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term824779, term824779.getClass(), "type", 108);
        setField(term824709, term824709.getClass(), "parent", term824779);
        setIntField(term824709, term824709.getClass(), "type", 0);
        term824865 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term824865, term824865.getClass(), "type", 89);
        term824951 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term824951, term824951.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term824709;
        args[1] = term824865;
        args[2] = term824951;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term824623, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


