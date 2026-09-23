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

public class TypeInference_traverseReturn_94528842300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term729617;
     Object term729687;

    public TypeInference_traverseReturn_94528842300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term729617 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term729687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term730037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term730107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term730177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term730247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term730317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term730387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term730457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term730527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term730597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term730667 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term730737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term730807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term730877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term730947 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term731017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term731087 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term731157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term731227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term731297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term731367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term731437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term731507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term731577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term731647 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term731717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term731787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term729757, term729757.getClass(), "type", 9);
        setIntField(term729827, term729827.getClass(), "type", 9);
        setIntField(term729897, term729897.getClass(), "type", 9);
        setIntField(term729967, term729967.getClass(), "type", 9);
        setIntField(term730037, term730037.getClass(), "type", 9);
        setIntField(term730107, term730107.getClass(), "type", 9);
        setIntField(term730177, term730177.getClass(), "type", 9);
        setIntField(term730247, term730247.getClass(), "type", 9);
        setIntField(term730317, term730317.getClass(), "type", 9);
        setIntField(term730387, term730387.getClass(), "type", 9);
        setIntField(term730457, term730457.getClass(), "type", 9);
        setIntField(term730527, term730527.getClass(), "type", 9);
        setIntField(term730597, term730597.getClass(), "type", 9);
        setIntField(term730667, term730667.getClass(), "type", 9);
        setIntField(term730737, term730737.getClass(), "type", 9);
        setIntField(term730807, term730807.getClass(), "type", 9);
        setIntField(term730877, term730877.getClass(), "type", 9);
        setIntField(term730947, term730947.getClass(), "type", 9);
        setIntField(term731017, term731017.getClass(), "type", 9);
        setIntField(term731087, term731087.getClass(), "type", 9);
        setIntField(term731157, term731157.getClass(), "type", 9);
        setIntField(term731227, term731227.getClass(), "type", 9);
        setIntField(term731297, term731297.getClass(), "type", 9);
        setIntField(term731367, term731367.getClass(), "type", 9);
        setIntField(term731437, term731437.getClass(), "type", 9);
        setIntField(term731507, term731507.getClass(), "type", 9);
        setIntField(term731577, term731577.getClass(), "type", 9);
        setIntField(term731647, term731647.getClass(), "type", 9);
        setIntField(term731717, term731717.getClass(), "type", 9);
        setIntField(term731787, term731787.getClass(), "type", 73);
        setField(term731717, term731717.getClass(), "first", term731787);
        setField(term731647, term731647.getClass(), "first", term731717);
        setField(term731577, term731577.getClass(), "first", term731647);
        setField(term731507, term731507.getClass(), "first", term731577);
        setField(term731437, term731437.getClass(), "first", term731507);
        setField(term731367, term731367.getClass(), "first", term731437);
        setField(term731297, term731297.getClass(), "first", term731367);
        setField(term731227, term731227.getClass(), "first", term731297);
        setField(term731157, term731157.getClass(), "first", term731227);
        setField(term731087, term731087.getClass(), "first", term731157);
        setField(term731017, term731017.getClass(), "first", term731087);
        setField(term730947, term730947.getClass(), "first", term731017);
        setField(term730877, term730877.getClass(), "first", term730947);
        setField(term730807, term730807.getClass(), "first", term730877);
        setField(term730737, term730737.getClass(), "first", term730807);
        setField(term730667, term730667.getClass(), "first", term730737);
        setField(term730597, term730597.getClass(), "first", term730667);
        setField(term730527, term730527.getClass(), "first", term730597);
        setField(term730457, term730457.getClass(), "first", term730527);
        setField(term730387, term730387.getClass(), "first", term730457);
        setField(term730317, term730317.getClass(), "first", term730387);
        setField(term730247, term730247.getClass(), "first", term730317);
        setField(term730177, term730177.getClass(), "first", term730247);
        setField(term730107, term730107.getClass(), "first", term730177);
        setField(term730037, term730037.getClass(), "first", term730107);
        setField(term729967, term729967.getClass(), "first", term730037);
        setField(term729897, term729897.getClass(), "first", term729967);
        setField(term729827, term729827.getClass(), "first", term729897);
        setField(term729757, term729757.getClass(), "first", term729827);
        setField(term729687, term729687.getClass(), "first", term729757);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term729687;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term729617, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


