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

public class TypeInference_traverseAdd_1886586883154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101402;
     Object term101472;

    public TypeInference_traverseAdd_1886586883154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101402 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term101472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term101542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term101612 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term101682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term101752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term101822 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term101892 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term101962 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102312 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102452 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102802 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term101542, term101542.getClass(), "next", null);
        setIntField(term101542, term101542.getClass(), "type", 4);
        setIntField(term101612, term101612.getClass(), "type", 4);
        setIntField(term101682, term101682.getClass(), "type", 4);
        setIntField(term101752, term101752.getClass(), "type", 4);
        setIntField(term101822, term101822.getClass(), "type", 4);
        setIntField(term101892, term101892.getClass(), "type", 4);
        setIntField(term101962, term101962.getClass(), "type", 4);
        setIntField(term102032, term102032.getClass(), "type", 4);
        setIntField(term102102, term102102.getClass(), "type", 4);
        setIntField(term102172, term102172.getClass(), "type", 4);
        setIntField(term102242, term102242.getClass(), "type", 4);
        setIntField(term102312, term102312.getClass(), "type", 4);
        setIntField(term102382, term102382.getClass(), "type", 4);
        setIntField(term102452, term102452.getClass(), "type", 4);
        setIntField(term102522, term102522.getClass(), "type", 4);
        setIntField(term102592, term102592.getClass(), "type", 4);
        setIntField(term102662, term102662.getClass(), "type", 4);
        setIntField(term102732, term102732.getClass(), "type", 4);
        setIntField(term102802, term102802.getClass(), "type", 4);
        setIntField(term102872, term102872.getClass(), "type", 43);
        setField(term102802, term102802.getClass(), "first", term102872);
        setField(term102732, term102732.getClass(), "first", term102802);
        setField(term102662, term102662.getClass(), "first", term102732);
        setField(term102592, term102592.getClass(), "first", term102662);
        setField(term102522, term102522.getClass(), "first", term102592);
        setField(term102452, term102452.getClass(), "first", term102522);
        setField(term102382, term102382.getClass(), "first", term102452);
        setField(term102312, term102312.getClass(), "first", term102382);
        setField(term102242, term102242.getClass(), "first", term102312);
        setField(term102172, term102172.getClass(), "first", term102242);
        setField(term102102, term102102.getClass(), "first", term102172);
        setField(term102032, term102032.getClass(), "first", term102102);
        setField(term101962, term101962.getClass(), "first", term102032);
        setField(term101892, term101892.getClass(), "first", term101962);
        setField(term101822, term101822.getClass(), "first", term101892);
        setField(term101752, term101752.getClass(), "first", term101822);
        setField(term101682, term101682.getClass(), "first", term101752);
        setField(term101612, term101612.getClass(), "first", term101682);
        setField(term101542, term101542.getClass(), "first", term101612);
        setField(term101472, term101472.getClass(), "first", term101542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term101472;
        args[1] = null;
        callMethod(klass, "traverseAdd", argTypes, term101402, args);
    }

};


