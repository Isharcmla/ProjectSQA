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

public class TypeInference_traverseArrayLiteral_67090236323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term918394;
     Object term918464;

    public TypeInference_traverseArrayLiteral_67090236323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term918394 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term918464 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term918534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term918604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term918674 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term918744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term918814 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term918884 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term918954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term919024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term919094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term919164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term919234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term919304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term919374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term919444 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term919514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term919584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term919654 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term919724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term919794 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term919864 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term919934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term920004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term920074 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term920144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term920214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term920284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term920354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term920424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term920494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term920564 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term920634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term920704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term920774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term920844 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term920914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term920984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term922034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term922104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term922174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term922244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term918534, term918534.getClass(), "type", 83);
        setIntField(term918604, term918604.getClass(), "type", 83);
        setIntField(term918674, term918674.getClass(), "type", 83);
        setIntField(term918744, term918744.getClass(), "type", 83);
        setIntField(term918814, term918814.getClass(), "type", 83);
        setIntField(term918884, term918884.getClass(), "type", 83);
        setIntField(term918954, term918954.getClass(), "type", 83);
        setIntField(term919024, term919024.getClass(), "type", 83);
        setIntField(term919094, term919094.getClass(), "type", 83);
        setIntField(term919164, term919164.getClass(), "type", 83);
        setIntField(term919234, term919234.getClass(), "type", 83);
        setIntField(term919304, term919304.getClass(), "type", 83);
        setIntField(term919374, term919374.getClass(), "type", 83);
        setIntField(term919444, term919444.getClass(), "type", 83);
        setIntField(term919514, term919514.getClass(), "type", 83);
        setIntField(term919584, term919584.getClass(), "type", 83);
        setIntField(term919654, term919654.getClass(), "type", 83);
        setIntField(term919724, term919724.getClass(), "type", 83);
        setIntField(term919794, term919794.getClass(), "type", 83);
        setIntField(term919864, term919864.getClass(), "type", 83);
        setIntField(term919934, term919934.getClass(), "type", 83);
        setIntField(term920004, term920004.getClass(), "type", 83);
        setIntField(term920074, term920074.getClass(), "type", 83);
        setIntField(term920144, term920144.getClass(), "type", 83);
        setIntField(term920214, term920214.getClass(), "type", 83);
        setIntField(term920284, term920284.getClass(), "type", 83);
        setIntField(term920354, term920354.getClass(), "type", 83);
        setIntField(term920424, term920424.getClass(), "type", 83);
        setIntField(term920494, term920494.getClass(), "type", 83);
        setIntField(term920564, term920564.getClass(), "type", 83);
        setIntField(term920634, term920634.getClass(), "type", 83);
        setIntField(term920704, term920704.getClass(), "type", 83);
        setIntField(term920774, term920774.getClass(), "type", 83);
        setIntField(term920844, term920844.getClass(), "type", 83);
        setIntField(term920914, term920914.getClass(), "type", 83);
        setIntField(term920984, term920984.getClass(), "type", 83);
        setIntField(term921054, term921054.getClass(), "type", 83);
        setIntField(term921124, term921124.getClass(), "type", 83);
        setIntField(term921194, term921194.getClass(), "type", 83);
        setIntField(term921264, term921264.getClass(), "type", 83);
        setIntField(term921334, term921334.getClass(), "type", 83);
        setIntField(term921404, term921404.getClass(), "type", 83);
        setIntField(term921474, term921474.getClass(), "type", 83);
        setIntField(term921544, term921544.getClass(), "type", 83);
        setIntField(term921614, term921614.getClass(), "type", 83);
        setIntField(term921684, term921684.getClass(), "type", 83);
        setIntField(term921754, term921754.getClass(), "type", 83);
        setIntField(term921824, term921824.getClass(), "type", 83);
        setIntField(term921894, term921894.getClass(), "type", 83);
        setIntField(term921964, term921964.getClass(), "type", 83);
        setIntField(term922034, term922034.getClass(), "type", 83);
        setIntField(term922104, term922104.getClass(), "type", 83);
        setIntField(term922174, term922174.getClass(), "type", 83);
        setIntField(term922244, term922244.getClass(), "type", 50);
        setField(term922174, term922174.getClass(), "first", term922244);
        setField(term922104, term922104.getClass(), "first", term922174);
        setField(term922034, term922034.getClass(), "first", term922104);
        setField(term921964, term921964.getClass(), "first", term922034);
        setField(term921894, term921894.getClass(), "first", term921964);
        setField(term921824, term921824.getClass(), "first", term921894);
        setField(term921754, term921754.getClass(), "first", term921824);
        setField(term921684, term921684.getClass(), "first", term921754);
        setField(term921614, term921614.getClass(), "first", term921684);
        setField(term921544, term921544.getClass(), "first", term921614);
        setField(term921474, term921474.getClass(), "first", term921544);
        setField(term921404, term921404.getClass(), "first", term921474);
        setField(term921334, term921334.getClass(), "first", term921404);
        setField(term921264, term921264.getClass(), "first", term921334);
        setField(term921194, term921194.getClass(), "first", term921264);
        setField(term921124, term921124.getClass(), "first", term921194);
        setField(term921054, term921054.getClass(), "first", term921124);
        setField(term920984, term920984.getClass(), "first", term921054);
        setField(term920914, term920914.getClass(), "first", term920984);
        setField(term920844, term920844.getClass(), "first", term920914);
        setField(term920774, term920774.getClass(), "first", term920844);
        setField(term920704, term920704.getClass(), "first", term920774);
        setField(term920634, term920634.getClass(), "first", term920704);
        setField(term920564, term920564.getClass(), "first", term920634);
        setField(term920494, term920494.getClass(), "first", term920564);
        setField(term920424, term920424.getClass(), "first", term920494);
        setField(term920354, term920354.getClass(), "first", term920424);
        setField(term920284, term920284.getClass(), "first", term920354);
        setField(term920214, term920214.getClass(), "first", term920284);
        setField(term920144, term920144.getClass(), "first", term920214);
        setField(term920074, term920074.getClass(), "first", term920144);
        setField(term920004, term920004.getClass(), "first", term920074);
        setField(term919934, term919934.getClass(), "first", term920004);
        setField(term919864, term919864.getClass(), "first", term919934);
        setField(term919794, term919794.getClass(), "first", term919864);
        setField(term919724, term919724.getClass(), "first", term919794);
        setField(term919654, term919654.getClass(), "first", term919724);
        setField(term919584, term919584.getClass(), "first", term919654);
        setField(term919514, term919514.getClass(), "first", term919584);
        setField(term919444, term919444.getClass(), "first", term919514);
        setField(term919374, term919374.getClass(), "first", term919444);
        setField(term919304, term919304.getClass(), "first", term919374);
        setField(term919234, term919234.getClass(), "first", term919304);
        setField(term919164, term919164.getClass(), "first", term919234);
        setField(term919094, term919094.getClass(), "first", term919164);
        setField(term919024, term919024.getClass(), "first", term919094);
        setField(term918954, term918954.getClass(), "first", term919024);
        setField(term918884, term918884.getClass(), "first", term918954);
        setField(term918814, term918814.getClass(), "first", term918884);
        setField(term918744, term918744.getClass(), "first", term918814);
        setField(term918674, term918674.getClass(), "first", term918744);
        setField(term918604, term918604.getClass(), "first", term918674);
        setField(term918534, term918534.getClass(), "first", term918604);
        setField(term918464, term918464.getClass(), "first", term918534);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term918464;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term918394, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


