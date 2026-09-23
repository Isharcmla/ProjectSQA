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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term392709;
     Object term392795;
     Object term392951;
     Object term393037;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term392709 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term392795 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term392865 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term392865, term392865.getClass(), "type", 108);
        setField(term392795, term392795.getClass(), "parent", term392865);
        setIntField(term392795, term392795.getClass(), "type", 0);
        term392951 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term392951, term392951.getClass(), "type", 33);
        term393037 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term393037, term393037.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term392795;
        args[1] = term392951;
        args[2] = term393037;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term392709, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


