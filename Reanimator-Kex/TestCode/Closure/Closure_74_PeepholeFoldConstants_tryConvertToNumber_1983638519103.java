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

public class PeepholeFoldConstants_tryConvertToNumber_1983638519103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18641;
     Object term18711;
     Object term18769;
     Object term18770;

    public PeepholeFoldConstants_tryConvertToNumber_1983638519103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18641 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term18711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18711, term18711.getClass(), "type", 39);
        term18769 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term18769, term18769.getClass(), "currentTraversal", null);
        term18770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18770, term18770.getClass(), "type", 39);
        setField(term18770, term18770.getClass(), "next", null);
        setField(term18770, term18770.getClass(), "first", null);
        setField(term18770, term18770.getClass(), "last", null);
        setField(term18770, term18770.getClass(), "propListHead", null);
        setIntField(term18770, term18770.getClass(), "sourcePosition", 0);
        setField(term18770, term18770.getClass(), "jsType", null);
        setField(term18770, term18770.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term18711;
        callMethod(klass, "tryConvertToNumber", argTypes, term18641, args);
        assertTrue(recursiveEquals(term18641, term18769));
        assertTrue(recursiveEquals(term18711, term18770));
    }

};


