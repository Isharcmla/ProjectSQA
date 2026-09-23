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

public class CoalesceVariableNames_checkRanges_118307546529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7572;
     Object term7642;
     Object term8087;
     Object term8088;

    public CoalesceVariableNames_checkRanges_118307546529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7572 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        setField(term7572, term7572.getClass(), "compiler", null);
        term7642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7642, term7642.getClass(), "type", 0);
        setField(term7642, term7642.getClass(), "first", null);
        term8087 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        setField(term8087, term8087.getClass(), "compiler", null);
        setField(term8087, term8087.getClass(), "colorings", null);
        setBooleanField(term8087, term8087.getClass(), "usePseudoNames", false);
        term8088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8088, term8088.getClass(), "type", 0);
        setField(term8088, term8088.getClass(), "next", null);
        setField(term8088, term8088.getClass(), "first", null);
        setField(term8088, term8088.getClass(), "last", null);
        setField(term8088, term8088.getClass(), "propListHead", null);
        setIntField(term8088, term8088.getClass(), "sourcePosition", 0);
        setField(term8088, term8088.getClass(), "jsType", null);
        setField(term8088, term8088.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term7642;
        callMethod(klass, "checkRanges", argTypes, term7572, args);
        assertTrue(recursiveEquals(term7572, term8087));
        assertTrue(recursiveEquals(term7642, term8088));
    }

};


