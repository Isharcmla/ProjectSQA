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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseReturn_1142297770566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1835801;
     Object term1835893;

    public TypeInference_traverseReturn_1142297770566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1835801 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1835893 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1835985 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1836077 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1836169 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1836261 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1836353 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1836445 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1836537 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1836629 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1836721 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1836813 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1836905 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1836997 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1837089 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1837181 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term1835985, term1835985.getClass(), "type", 29);
        setIntField(term1836077, term1836077.getClass(), "type", 29);
        setIntField(term1836169, term1836169.getClass(), "type", 29);
        setIntField(term1836261, term1836261.getClass(), "type", 29);
        setIntField(term1836353, term1836353.getClass(), "type", 29);
        setIntField(term1836445, term1836445.getClass(), "type", 29);
        setIntField(term1836537, term1836537.getClass(), "type", 29);
        setIntField(term1836629, term1836629.getClass(), "type", 29);
        setIntField(term1836721, term1836721.getClass(), "type", 29);
        setIntField(term1836813, term1836813.getClass(), "type", 29);
        setIntField(term1836905, term1836905.getClass(), "type", 29);
        setIntField(term1836997, term1836997.getClass(), "type", 29);
        setIntField(term1837089, term1837089.getClass(), "type", 29);
        setIntField(term1837181, term1837181.getClass(), "type", 29);
        setField(term1837181, term1837181.getClass(), "first", term1836721);
        setField(term1837089, term1837089.getClass(), "first", term1837181);
        setField(term1836997, term1836997.getClass(), "first", term1837089);
        setField(term1836905, term1836905.getClass(), "first", term1836997);
        setField(term1836813, term1836813.getClass(), "first", term1836905);
        setField(term1836721, term1836721.getClass(), "first", term1836813);
        setField(term1836629, term1836629.getClass(), "first", term1836721);
        setField(term1836537, term1836537.getClass(), "first", term1836629);
        setField(term1836445, term1836445.getClass(), "first", term1836537);
        setField(term1836353, term1836353.getClass(), "first", term1836445);
        setField(term1836261, term1836261.getClass(), "first", term1836353);
        setField(term1836169, term1836169.getClass(), "first", term1836261);
        setField(term1836077, term1836077.getClass(), "first", term1836169);
        setField(term1835985, term1835985.getClass(), "first", term1836077);
        setField(term1835893, term1835893.getClass(), "first", term1835985);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1835893;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term1835801, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


