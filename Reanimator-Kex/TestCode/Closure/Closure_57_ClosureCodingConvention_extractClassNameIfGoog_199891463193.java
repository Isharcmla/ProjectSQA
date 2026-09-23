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

public class ClosureCodingConvention_extractClassNameIfGoog_199891463193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49644;
     Object term49652;

    public ClosureCodingConvention_extractClassNameIfGoog_199891463193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49644 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term49652 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term49652, term49652.getClass(), "str", null);
        setIntField(term49652, term49652.getClass(), "type", 0);
        setField(term49652, term49652.getClass(), "next", null);
        setField(term49652, term49652.getClass(), "first", null);
        setField(term49652, term49652.getClass(), "last", null);
        setField(term49652, term49652.getClass(), "propListHead", null);
        setIntField(term49652, term49652.getClass(), "sourcePosition", 0);
        setField(term49652, term49652.getClass(), "jsType", null);
        setField(term49652, term49652.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term49644;
        args[2] = null;
        Object retValue = callMethod(klass, "extractClassNameIfGoog", argTypes, null, args);
        assertTrue(recursiveEquals(term49644, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


