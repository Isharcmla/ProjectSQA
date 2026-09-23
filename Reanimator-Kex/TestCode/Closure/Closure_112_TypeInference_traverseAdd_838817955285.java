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

public class TypeInference_traverseAdd_838817955285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288754;
     Object term288824;

    public TypeInference_traverseAdd_838817955285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288754 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term288824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term288894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term288964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term289034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term289104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term289174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term289244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term289314 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term289384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term289454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term289524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term289594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term289664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term289734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term289804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term289874 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term289944 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term290014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term290084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term290154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term290224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term290294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term290364 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term290434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term290504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term290574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term290644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term290714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term290784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term290854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term290924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term288894, term288894.getClass(), "next", null);
        setIntField(term288894, term288894.getClass(), "type", 14);
        setIntField(term288964, term288964.getClass(), "type", 14);
        setIntField(term289034, term289034.getClass(), "type", 14);
        setIntField(term289104, term289104.getClass(), "type", 14);
        setIntField(term289174, term289174.getClass(), "type", 14);
        setIntField(term289244, term289244.getClass(), "type", 14);
        setIntField(term289314, term289314.getClass(), "type", 14);
        setIntField(term289384, term289384.getClass(), "type", 14);
        setIntField(term289454, term289454.getClass(), "type", 14);
        setIntField(term289524, term289524.getClass(), "type", 14);
        setIntField(term289594, term289594.getClass(), "type", 14);
        setIntField(term289664, term289664.getClass(), "type", 14);
        setIntField(term289734, term289734.getClass(), "type", 14);
        setIntField(term289804, term289804.getClass(), "type", 14);
        setIntField(term289874, term289874.getClass(), "type", 14);
        setIntField(term289944, term289944.getClass(), "type", 14);
        setIntField(term290014, term290014.getClass(), "type", 14);
        setIntField(term290084, term290084.getClass(), "type", 14);
        setIntField(term290154, term290154.getClass(), "type", 14);
        setIntField(term290224, term290224.getClass(), "type", 14);
        setIntField(term290294, term290294.getClass(), "type", 14);
        setIntField(term290364, term290364.getClass(), "type", 14);
        setIntField(term290434, term290434.getClass(), "type", 14);
        setIntField(term290504, term290504.getClass(), "type", 14);
        setIntField(term290574, term290574.getClass(), "type", 14);
        setIntField(term290644, term290644.getClass(), "type", 14);
        setIntField(term290714, term290714.getClass(), "type", 14);
        setIntField(term290784, term290784.getClass(), "type", 14);
        setIntField(term290854, term290854.getClass(), "type", 14);
        setIntField(term290924, term290924.getClass(), "type", 7);
        setField(term290854, term290854.getClass(), "first", term290924);
        setField(term290784, term290784.getClass(), "first", term290854);
        setField(term290714, term290714.getClass(), "first", term290784);
        setField(term290644, term290644.getClass(), "first", term290714);
        setField(term290574, term290574.getClass(), "first", term290644);
        setField(term290504, term290504.getClass(), "first", term290574);
        setField(term290434, term290434.getClass(), "first", term290504);
        setField(term290364, term290364.getClass(), "first", term290434);
        setField(term290294, term290294.getClass(), "first", term290364);
        setField(term290224, term290224.getClass(), "first", term290294);
        setField(term290154, term290154.getClass(), "first", term290224);
        setField(term290084, term290084.getClass(), "first", term290154);
        setField(term290014, term290014.getClass(), "first", term290084);
        setField(term289944, term289944.getClass(), "first", term290014);
        setField(term289874, term289874.getClass(), "first", term289944);
        setField(term289804, term289804.getClass(), "first", term289874);
        setField(term289734, term289734.getClass(), "first", term289804);
        setField(term289664, term289664.getClass(), "first", term289734);
        setField(term289594, term289594.getClass(), "first", term289664);
        setField(term289524, term289524.getClass(), "first", term289594);
        setField(term289454, term289454.getClass(), "first", term289524);
        setField(term289384, term289384.getClass(), "first", term289454);
        setField(term289314, term289314.getClass(), "first", term289384);
        setField(term289244, term289244.getClass(), "first", term289314);
        setField(term289174, term289174.getClass(), "first", term289244);
        setField(term289104, term289104.getClass(), "first", term289174);
        setField(term289034, term289034.getClass(), "first", term289104);
        setField(term288964, term288964.getClass(), "first", term289034);
        setField(term288894, term288894.getClass(), "first", term288964);
        setField(term288824, term288824.getClass(), "first", term288894);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term288824;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term288754, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


