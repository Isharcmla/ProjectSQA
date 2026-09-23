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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369677;
     Object term369747;
     Object term369817;
     Object term369887;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369677 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term369747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term369747, term369747.getClass(), "parent", null);
        setIntField(term369747, term369747.getClass(), "type", 0);
        term369817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term369817, term369817.getClass(), "type", 0);
        term369887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term369887, term369887.getClass(), "type", 64);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term369747;
        args[1] = term369817;
        args[2] = term369887;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term369677, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


