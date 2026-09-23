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

public class TypeInference_traverseAdd_838817955464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1709235;
     Object term1709305;

    public TypeInference_traverseAdd_838817955464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1709235 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1709305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1709375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1709445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1709515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1709585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1709655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1709725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1709795 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1709865 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1709935 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1710005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1710075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1710145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1710215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1710285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1710355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1710425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1710495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1710565 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1710635 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1710705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1710775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1710845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1710915 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1710985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1711055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1711125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1711195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1709375, term1709375.getClass(), "next", null);
        setIntField(term1709375, term1709375.getClass(), "type", 14);
        setIntField(term1709445, term1709445.getClass(), "type", 14);
        setIntField(term1709515, term1709515.getClass(), "type", 14);
        setIntField(term1709585, term1709585.getClass(), "type", 14);
        setIntField(term1709655, term1709655.getClass(), "type", 14);
        setIntField(term1709725, term1709725.getClass(), "type", 14);
        setIntField(term1709795, term1709795.getClass(), "type", 14);
        setIntField(term1709865, term1709865.getClass(), "type", 14);
        setIntField(term1709935, term1709935.getClass(), "type", 14);
        setIntField(term1710005, term1710005.getClass(), "type", 14);
        setIntField(term1710075, term1710075.getClass(), "type", 14);
        setIntField(term1710145, term1710145.getClass(), "type", 14);
        setIntField(term1710215, term1710215.getClass(), "type", 14);
        setIntField(term1710285, term1710285.getClass(), "type", 14);
        setIntField(term1710355, term1710355.getClass(), "type", 14);
        setIntField(term1710425, term1710425.getClass(), "type", 14);
        setIntField(term1710495, term1710495.getClass(), "type", 14);
        setIntField(term1710565, term1710565.getClass(), "type", 14);
        setIntField(term1710635, term1710635.getClass(), "type", 14);
        setIntField(term1710705, term1710705.getClass(), "type", 14);
        setIntField(term1710775, term1710775.getClass(), "type", 14);
        setIntField(term1710845, term1710845.getClass(), "type", 14);
        setIntField(term1710915, term1710915.getClass(), "type", 14);
        setIntField(term1710985, term1710985.getClass(), "type", 14);
        setIntField(term1711055, term1711055.getClass(), "type", 14);
        setIntField(term1711125, term1711125.getClass(), "type", 14);
        setIntField(term1711195, term1711195.getClass(), "type", 39);
        setField(term1711125, term1711125.getClass(), "first", term1711195);
        setField(term1711055, term1711055.getClass(), "first", term1711125);
        setField(term1710985, term1710985.getClass(), "first", term1711055);
        setField(term1710915, term1710915.getClass(), "first", term1710985);
        setField(term1710845, term1710845.getClass(), "first", term1710915);
        setField(term1710775, term1710775.getClass(), "first", term1710845);
        setField(term1710705, term1710705.getClass(), "first", term1710775);
        setField(term1710635, term1710635.getClass(), "first", term1710705);
        setField(term1710565, term1710565.getClass(), "first", term1710635);
        setField(term1710495, term1710495.getClass(), "first", term1710565);
        setField(term1710425, term1710425.getClass(), "first", term1710495);
        setField(term1710355, term1710355.getClass(), "first", term1710425);
        setField(term1710285, term1710285.getClass(), "first", term1710355);
        setField(term1710215, term1710215.getClass(), "first", term1710285);
        setField(term1710145, term1710145.getClass(), "first", term1710215);
        setField(term1710075, term1710075.getClass(), "first", term1710145);
        setField(term1710005, term1710005.getClass(), "first", term1710075);
        setField(term1709935, term1709935.getClass(), "first", term1710005);
        setField(term1709865, term1709865.getClass(), "first", term1709935);
        setField(term1709795, term1709795.getClass(), "first", term1709865);
        setField(term1709725, term1709725.getClass(), "first", term1709795);
        setField(term1709655, term1709655.getClass(), "first", term1709725);
        setField(term1709585, term1709585.getClass(), "first", term1709655);
        setField(term1709515, term1709515.getClass(), "first", term1709585);
        setField(term1709445, term1709445.getClass(), "first", term1709515);
        setField(term1709375, term1709375.getClass(), "first", term1709445);
        setField(term1709305, term1709305.getClass(), "first", term1709375);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1709305;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term1709235, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


