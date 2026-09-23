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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091799 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3679714;
     Object term3679800;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091799() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3679714 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3679800 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3679892 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3679984 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3680114 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3679800, term3679800.getClass(), "type", 37);
        setIntField(term3679892, term3679892.getClass(), "type", 35);
        setField(term3679984, term3679984.getClass(), "next", term3679984);
        setIntField(term3679984, term3679984.getClass(), "type", 40);
        setField(term3679984, term3679984.getClass(), "str", "indexOf");
        setField(term3679892, term3679892.getClass(), "first", term3679984);
        setIntField(term3680114, term3680114.getClass(), "type", 41);
        setField(term3679892, term3679892.getClass(), "next", term3680114);
        setField(term3679800, term3679800.getClass(), "first", term3679892);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3679800;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3679714, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


