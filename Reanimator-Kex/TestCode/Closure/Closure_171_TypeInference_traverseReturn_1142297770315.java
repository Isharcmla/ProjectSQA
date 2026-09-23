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

public class TypeInference_traverseReturn_1142297770315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term678284;
     Object term678354;

    public TypeInference_traverseReturn_1142297770315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term678284 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term678354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term678424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term678494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term678564 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term678634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term678704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term678774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term678844 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term678914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term678984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680314 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term678424, term678424.getClass(), "type", 92);
        setIntField(term678494, term678494.getClass(), "type", 92);
        setIntField(term678564, term678564.getClass(), "type", 92);
        setIntField(term678634, term678634.getClass(), "type", 92);
        setIntField(term678704, term678704.getClass(), "type", 92);
        setIntField(term678774, term678774.getClass(), "type", 92);
        setIntField(term678844, term678844.getClass(), "type", 92);
        setIntField(term678914, term678914.getClass(), "type", 92);
        setIntField(term678984, term678984.getClass(), "type", 92);
        setIntField(term679054, term679054.getClass(), "type", 92);
        setIntField(term679124, term679124.getClass(), "type", 92);
        setIntField(term679194, term679194.getClass(), "type", 92);
        setIntField(term679264, term679264.getClass(), "type", 92);
        setIntField(term679334, term679334.getClass(), "type", 92);
        setIntField(term679404, term679404.getClass(), "type", 92);
        setIntField(term679474, term679474.getClass(), "type", 92);
        setIntField(term679544, term679544.getClass(), "type", 92);
        setIntField(term679614, term679614.getClass(), "type", 92);
        setIntField(term679684, term679684.getClass(), "type", 92);
        setIntField(term679754, term679754.getClass(), "type", 92);
        setIntField(term679824, term679824.getClass(), "type", 92);
        setIntField(term679894, term679894.getClass(), "type", 92);
        setIntField(term679964, term679964.getClass(), "type", 92);
        setIntField(term680034, term680034.getClass(), "type", 92);
        setIntField(term680104, term680104.getClass(), "type", 92);
        setIntField(term680174, term680174.getClass(), "type", 92);
        setIntField(term680244, term680244.getClass(), "type", 92);
        setIntField(term680314, term680314.getClass(), "type", 92);
        setIntField(term680384, term680384.getClass(), "type", 92);
        setIntField(term680454, term680454.getClass(), "type", 92);
        setIntField(term680524, term680524.getClass(), "type", 92);
        setIntField(term680594, term680594.getClass(), "type", 92);
        setIntField(term680664, term680664.getClass(), "type", 92);
        setIntField(term680734, term680734.getClass(), "type", 16);
        setField(term680664, term680664.getClass(), "first", term680734);
        setField(term680594, term680594.getClass(), "first", term680664);
        setField(term680524, term680524.getClass(), "first", term680594);
        setField(term680454, term680454.getClass(), "first", term680524);
        setField(term680384, term680384.getClass(), "first", term680454);
        setField(term680314, term680314.getClass(), "first", term680384);
        setField(term680244, term680244.getClass(), "first", term680314);
        setField(term680174, term680174.getClass(), "first", term680244);
        setField(term680104, term680104.getClass(), "first", term680174);
        setField(term680034, term680034.getClass(), "first", term680104);
        setField(term679964, term679964.getClass(), "first", term680034);
        setField(term679894, term679894.getClass(), "first", term679964);
        setField(term679824, term679824.getClass(), "first", term679894);
        setField(term679754, term679754.getClass(), "first", term679824);
        setField(term679684, term679684.getClass(), "first", term679754);
        setField(term679614, term679614.getClass(), "first", term679684);
        setField(term679544, term679544.getClass(), "first", term679614);
        setField(term679474, term679474.getClass(), "first", term679544);
        setField(term679404, term679404.getClass(), "first", term679474);
        setField(term679334, term679334.getClass(), "first", term679404);
        setField(term679264, term679264.getClass(), "first", term679334);
        setField(term679194, term679194.getClass(), "first", term679264);
        setField(term679124, term679124.getClass(), "first", term679194);
        setField(term679054, term679054.getClass(), "first", term679124);
        setField(term678984, term678984.getClass(), "first", term679054);
        setField(term678914, term678914.getClass(), "first", term678984);
        setField(term678844, term678844.getClass(), "first", term678914);
        setField(term678774, term678774.getClass(), "first", term678844);
        setField(term678704, term678704.getClass(), "first", term678774);
        setField(term678634, term678634.getClass(), "first", term678704);
        setField(term678564, term678564.getClass(), "first", term678634);
        setField(term678494, term678494.getClass(), "first", term678564);
        setField(term678424, term678424.getClass(), "first", term678494);
        setField(term678354, term678354.getClass(), "first", term678424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term678354;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term678284, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


