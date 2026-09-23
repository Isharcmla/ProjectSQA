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

public class TypeInference_traverseChildren_1478920219298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term612007;
     Object term612077;

    public TypeInference_traverseChildren_1478920219298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term612007 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term612077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term612147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term612217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term612287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term612357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term612427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term612497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term612567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term612637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term612707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term612777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term612847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term612917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term612987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term614037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term614107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term614177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term614247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term614317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term614387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term614457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term614527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term614597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term614667 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term614737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term614807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term614877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term614947 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term615017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term612147, term612147.getClass(), "type", 18);
        setIntField(term612217, term612217.getClass(), "type", 18);
        setIntField(term612287, term612287.getClass(), "type", 18);
        setIntField(term612357, term612357.getClass(), "type", 18);
        setIntField(term612427, term612427.getClass(), "type", 18);
        setIntField(term612497, term612497.getClass(), "type", 18);
        setIntField(term612567, term612567.getClass(), "type", 18);
        setIntField(term612637, term612637.getClass(), "type", 18);
        setIntField(term612707, term612707.getClass(), "type", 18);
        setIntField(term612777, term612777.getClass(), "type", 18);
        setIntField(term612847, term612847.getClass(), "type", 18);
        setIntField(term612917, term612917.getClass(), "type", 18);
        setIntField(term612987, term612987.getClass(), "type", 18);
        setIntField(term613057, term613057.getClass(), "type", 18);
        setIntField(term613127, term613127.getClass(), "type", 18);
        setIntField(term613197, term613197.getClass(), "type", 18);
        setIntField(term613267, term613267.getClass(), "type", 18);
        setIntField(term613337, term613337.getClass(), "type", 18);
        setIntField(term613407, term613407.getClass(), "type", 18);
        setIntField(term613477, term613477.getClass(), "type", 18);
        setIntField(term613547, term613547.getClass(), "type", 18);
        setIntField(term613617, term613617.getClass(), "type", 18);
        setIntField(term613687, term613687.getClass(), "type", 18);
        setIntField(term613757, term613757.getClass(), "type", 18);
        setIntField(term613827, term613827.getClass(), "type", 18);
        setIntField(term613897, term613897.getClass(), "type", 18);
        setIntField(term613967, term613967.getClass(), "type", 18);
        setIntField(term614037, term614037.getClass(), "type", 18);
        setIntField(term614107, term614107.getClass(), "type", 18);
        setIntField(term614177, term614177.getClass(), "type", 18);
        setIntField(term614247, term614247.getClass(), "type", 18);
        setIntField(term614317, term614317.getClass(), "type", 18);
        setIntField(term614387, term614387.getClass(), "type", 18);
        setIntField(term614457, term614457.getClass(), "type", 18);
        setIntField(term614527, term614527.getClass(), "type", 18);
        setIntField(term614597, term614597.getClass(), "type", 18);
        setIntField(term614667, term614667.getClass(), "type", 18);
        setIntField(term614737, term614737.getClass(), "type", 18);
        setIntField(term614807, term614807.getClass(), "type", 18);
        setIntField(term614877, term614877.getClass(), "type", 18);
        setIntField(term614947, term614947.getClass(), "type", 18);
        setIntField(term615017, term615017.getClass(), "type", 85);
        setField(term614947, term614947.getClass(), "first", term615017);
        setField(term614877, term614877.getClass(), "first", term614947);
        setField(term614807, term614807.getClass(), "first", term614877);
        setField(term614737, term614737.getClass(), "first", term614807);
        setField(term614667, term614667.getClass(), "first", term614737);
        setField(term614597, term614597.getClass(), "first", term614667);
        setField(term614527, term614527.getClass(), "first", term614597);
        setField(term614457, term614457.getClass(), "first", term614527);
        setField(term614387, term614387.getClass(), "first", term614457);
        setField(term614317, term614317.getClass(), "first", term614387);
        setField(term614247, term614247.getClass(), "first", term614317);
        setField(term614177, term614177.getClass(), "first", term614247);
        setField(term614107, term614107.getClass(), "first", term614177);
        setField(term614037, term614037.getClass(), "first", term614107);
        setField(term613967, term613967.getClass(), "first", term614037);
        setField(term613897, term613897.getClass(), "first", term613967);
        setField(term613827, term613827.getClass(), "first", term613897);
        setField(term613757, term613757.getClass(), "first", term613827);
        setField(term613687, term613687.getClass(), "first", term613757);
        setField(term613617, term613617.getClass(), "first", term613687);
        setField(term613547, term613547.getClass(), "first", term613617);
        setField(term613477, term613477.getClass(), "first", term613547);
        setField(term613407, term613407.getClass(), "first", term613477);
        setField(term613337, term613337.getClass(), "first", term613407);
        setField(term613267, term613267.getClass(), "first", term613337);
        setField(term613197, term613197.getClass(), "first", term613267);
        setField(term613127, term613127.getClass(), "first", term613197);
        setField(term613057, term613057.getClass(), "first", term613127);
        setField(term612987, term612987.getClass(), "first", term613057);
        setField(term612917, term612917.getClass(), "first", term612987);
        setField(term612847, term612847.getClass(), "first", term612917);
        setField(term612777, term612777.getClass(), "first", term612847);
        setField(term612707, term612707.getClass(), "first", term612777);
        setField(term612637, term612637.getClass(), "first", term612707);
        setField(term612567, term612567.getClass(), "first", term612637);
        setField(term612497, term612497.getClass(), "first", term612567);
        setField(term612427, term612427.getClass(), "first", term612497);
        setField(term612357, term612357.getClass(), "first", term612427);
        setField(term612287, term612287.getClass(), "first", term612357);
        setField(term612217, term612217.getClass(), "first", term612287);
        setField(term612147, term612147.getClass(), "first", term612217);
        setField(term612077, term612077.getClass(), "first", term612147);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term612077;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term612007, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


