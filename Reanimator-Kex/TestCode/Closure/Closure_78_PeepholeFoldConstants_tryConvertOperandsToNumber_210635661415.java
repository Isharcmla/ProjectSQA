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

public class PeepholeFoldConstants_tryConvertOperandsToNumber_210635661415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1028016;
     Object term1028086;

    public PeepholeFoldConstants_tryConvertOperandsToNumber_210635661415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1028016 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term1028086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1028156 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1028226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1028296 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1028366 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1028436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1028506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1028576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1028646 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1028716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1028786 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1028856 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1028926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1028996 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1029066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1029136 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1029206 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1029276 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1029346 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1029416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1029486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1029556 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1029626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1028156, term1028156.getClass(), "next", term1028226);
        setIntField(term1028156, term1028156.getClass(), "type", 85);
        setIntField(term1028296, term1028296.getClass(), "type", 85);
        setIntField(term1028366, term1028366.getClass(), "type", 85);
        setIntField(term1028436, term1028436.getClass(), "type", 85);
        setIntField(term1028506, term1028506.getClass(), "type", 85);
        setIntField(term1028576, term1028576.getClass(), "type", 85);
        setIntField(term1028646, term1028646.getClass(), "type", 85);
        setIntField(term1028716, term1028716.getClass(), "type", 85);
        setIntField(term1028786, term1028786.getClass(), "type", 85);
        setIntField(term1028856, term1028856.getClass(), "type", 85);
        setIntField(term1028926, term1028926.getClass(), "type", 85);
        setIntField(term1028996, term1028996.getClass(), "type", 85);
        setIntField(term1029066, term1029066.getClass(), "type", 85);
        setIntField(term1029136, term1029136.getClass(), "type", 85);
        setIntField(term1029206, term1029206.getClass(), "type", 85);
        setIntField(term1029276, term1029276.getClass(), "type", 85);
        setIntField(term1029346, term1029346.getClass(), "type", 85);
        setIntField(term1029416, term1029416.getClass(), "type", 85);
        setIntField(term1029486, term1029486.getClass(), "type", 85);
        setIntField(term1029556, term1029556.getClass(), "type", 85);
        setIntField(term1029626, term1029626.getClass(), "type", 98);
        setField(term1029556, term1029556.getClass(), "last", term1029626);
        setField(term1029486, term1029486.getClass(), "last", term1029556);
        setField(term1029416, term1029416.getClass(), "last", term1029486);
        setField(term1029346, term1029346.getClass(), "last", term1029416);
        setField(term1029276, term1029276.getClass(), "last", term1029346);
        setField(term1029206, term1029206.getClass(), "last", term1029276);
        setField(term1029136, term1029136.getClass(), "last", term1029206);
        setField(term1029066, term1029066.getClass(), "last", term1029136);
        setField(term1028996, term1028996.getClass(), "last", term1029066);
        setField(term1028926, term1028926.getClass(), "last", term1028996);
        setField(term1028856, term1028856.getClass(), "last", term1028926);
        setField(term1028786, term1028786.getClass(), "last", term1028856);
        setField(term1028716, term1028716.getClass(), "last", term1028786);
        setField(term1028646, term1028646.getClass(), "last", term1028716);
        setField(term1028576, term1028576.getClass(), "last", term1028646);
        setField(term1028506, term1028506.getClass(), "last", term1028576);
        setField(term1028436, term1028436.getClass(), "last", term1028506);
        setField(term1028366, term1028366.getClass(), "last", term1028436);
        setField(term1028296, term1028296.getClass(), "last", term1028366);
        setField(term1028156, term1028156.getClass(), "last", term1028296);
        setField(term1028086, term1028086.getClass(), "first", term1028156);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1028086;
        callMethod(klass, "tryConvertOperandsToNumber", argTypes, term1028016, args);
    }

};


