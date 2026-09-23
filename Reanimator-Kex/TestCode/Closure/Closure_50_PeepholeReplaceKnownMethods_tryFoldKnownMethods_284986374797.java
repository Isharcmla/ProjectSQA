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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3678962;
     Object term3679054;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3678962 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3679054 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3679146 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3679238 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3679330 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3679492 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3679146, term3679146.getClass(), "type", 35);
        setIntField(term3679330, term3679330.getClass(), "type", 40);
        setField(term3679330, term3679330.getClass(), "str", "lastIndexOf");
        setField(term3679238, term3679238.getClass(), "next", term3679330);
        setIntField(term3679238, term3679238.getClass(), "type", 40);
        setField(term3679238, term3679238.getClass(), "str", "");
        setField(term3679146, term3679146.getClass(), "first", term3679238);
        setIntField(term3679492, term3679492.getClass(), "type", 44);
        setField(term3679492, term3679492.getClass(), "next", null);
        setField(term3679146, term3679146.getClass(), "next", term3679492);
        setField(term3679054, term3679054.getClass(), "first", term3679146);
        setIntField(term3679054, term3679054.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3679054;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3678962, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


