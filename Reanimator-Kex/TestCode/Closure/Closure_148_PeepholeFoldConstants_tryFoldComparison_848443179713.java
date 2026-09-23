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

public class PeepholeFoldConstants_tryFoldComparison_848443179713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158438;
     Object term158530;
     Object term158622;

    public PeepholeFoldConstants_tryFoldComparison_848443179713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158438 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term158530 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term158530, term158530.getClass(), "type", 16);
        term158622 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term158622, term158622.getClass(), "type", 16);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term158530;
        args[1] = term158622;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldComparison", argTypes, term158438, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


