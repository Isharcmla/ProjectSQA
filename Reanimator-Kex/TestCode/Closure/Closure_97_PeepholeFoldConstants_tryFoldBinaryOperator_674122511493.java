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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127411;
     Object term127481;
     Object term133842;
     Object term133843;
     Object term133820;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127411 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term127481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term127481, term127481.getClass(), "first", term127481);
        setField(term127481, term127481.getClass(), "next", term127481);
        setIntField(term127481, term127481.getClass(), "type", 13);
        term133842 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term133842, term133842.getClass(), "currentTraversal", null);
        term133843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term133843, term133843.getClass(), "type", 13);
        setField(term133843, term133843.getClass(), "next", term133843);
        setField(term133843, term133843.getClass(), "first", term133843);
        setField(term133843, term133843.getClass(), "last", null);
        setField(term133843, term133843.getClass(), "propListHead", null);
        setIntField(term133843, term133843.getClass(), "sourcePosition", 0);
        setField(term133843, term133843.getClass(), "jsType", null);
        setField(term133843, term133843.getClass(), "parent", null);
        term133820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term133820, term133820.getClass(), "type", 13);
        setField(term133820, term133820.getClass(), "next", term133820);
        setField(term133820, term133820.getClass(), "first", term133820);
        setField(term133820, term133820.getClass(), "last", null);
        setField(term133820, term133820.getClass(), "propListHead", null);
        setIntField(term133820, term133820.getClass(), "sourcePosition", 0);
        setField(term133820, term133820.getClass(), "jsType", null);
        setField(term133820, term133820.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term127481;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term127411, args);
        assertTrue(recursiveEquals(term127411, term133842));
        assertTrue(recursiveEquals(term127481, term133843));
        assertTrue(recursiveEquals(retValue, term133820));
    }

};


