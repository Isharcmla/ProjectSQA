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
import java.lang.Object;

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3762336;
     Object term3762422;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3762336 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3762422 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3762514 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3762606 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3762736 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3762422, term3762422.getClass(), "type", 37);
        setIntField(term3762514, term3762514.getClass(), "type", 33);
        setField(term3762606, term3762606.getClass(), "next", term3762606);
        setIntField(term3762606, term3762606.getClass(), "type", 40);
        setField(term3762606, term3762606.getClass(), "str", "indexOf");
        setField(term3762514, term3762514.getClass(), "first", term3762606);
        setIntField(term3762736, term3762736.getClass(), "type", 39);
        setField(term3762514, term3762514.getClass(), "next", term3762736);
        setField(term3762422, term3762422.getClass(), "first", term3762514);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3762422;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3762336, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


