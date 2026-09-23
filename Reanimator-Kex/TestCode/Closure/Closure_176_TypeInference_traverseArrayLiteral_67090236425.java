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

public class TypeInference_traverseArrayLiteral_67090236425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1651411;
     Object term1651481;

    public TypeInference_traverseArrayLiteral_67090236425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1651411 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1651481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1651551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1651621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1651691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1651761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1651831 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1651901 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1651971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1652041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1652111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1652181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1652251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1652321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1652391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1652461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1652531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1652601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1652671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1652741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1652811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1652881 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1651551, term1651551.getClass(), "type", 83);
        setIntField(term1651621, term1651621.getClass(), "type", 83);
        setIntField(term1651691, term1651691.getClass(), "type", 83);
        setIntField(term1651761, term1651761.getClass(), "type", 83);
        setIntField(term1651831, term1651831.getClass(), "type", 83);
        setIntField(term1651901, term1651901.getClass(), "type", 83);
        setIntField(term1651971, term1651971.getClass(), "type", 83);
        setIntField(term1652041, term1652041.getClass(), "type", 83);
        setIntField(term1652111, term1652111.getClass(), "type", 83);
        setIntField(term1652181, term1652181.getClass(), "type", 83);
        setIntField(term1652251, term1652251.getClass(), "type", 83);
        setIntField(term1652321, term1652321.getClass(), "type", 83);
        setIntField(term1652391, term1652391.getClass(), "type", 83);
        setIntField(term1652461, term1652461.getClass(), "type", 83);
        setIntField(term1652531, term1652531.getClass(), "type", 83);
        setIntField(term1652601, term1652601.getClass(), "type", 83);
        setIntField(term1652671, term1652671.getClass(), "type", 83);
        setIntField(term1652741, term1652741.getClass(), "type", 83);
        setIntField(term1652811, term1652811.getClass(), "type", 83);
        setIntField(term1652881, term1652881.getClass(), "type", 74);
        setField(term1652811, term1652811.getClass(), "first", term1652881);
        setField(term1652741, term1652741.getClass(), "first", term1652811);
        setField(term1652671, term1652671.getClass(), "first", term1652741);
        setField(term1652601, term1652601.getClass(), "first", term1652671);
        setField(term1652531, term1652531.getClass(), "first", term1652601);
        setField(term1652461, term1652461.getClass(), "first", term1652531);
        setField(term1652391, term1652391.getClass(), "first", term1652461);
        setField(term1652321, term1652321.getClass(), "first", term1652391);
        setField(term1652251, term1652251.getClass(), "first", term1652321);
        setField(term1652181, term1652181.getClass(), "first", term1652251);
        setField(term1652111, term1652111.getClass(), "first", term1652181);
        setField(term1652041, term1652041.getClass(), "first", term1652111);
        setField(term1651971, term1651971.getClass(), "first", term1652041);
        setField(term1651901, term1651901.getClass(), "first", term1651971);
        setField(term1651831, term1651831.getClass(), "first", term1651901);
        setField(term1651761, term1651761.getClass(), "first", term1651831);
        setField(term1651691, term1651691.getClass(), "first", term1651761);
        setField(term1651621, term1651621.getClass(), "first", term1651691);
        setField(term1651551, term1651551.getClass(), "first", term1651621);
        setField(term1651481, term1651481.getClass(), "first", term1651551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1651481;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term1651411, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


