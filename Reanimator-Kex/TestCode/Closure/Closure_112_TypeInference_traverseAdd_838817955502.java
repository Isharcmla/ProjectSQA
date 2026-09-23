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

public class TypeInference_traverseAdd_838817955502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2122014;
     Object term2122084;

    public TypeInference_traverseAdd_838817955502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2122014 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term2122084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2122154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2122224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2122294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2122364 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2122434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2122504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2122574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2122644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2122714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2122784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2122854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2122924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2122994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2123064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2123134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2123204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2123274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2123344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2123414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2123484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2123554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2123624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2123694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2123764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2123834 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2123904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2122154, term2122154.getClass(), "next", null);
        setIntField(term2122154, term2122154.getClass(), "type", 14);
        setIntField(term2122224, term2122224.getClass(), "type", 14);
        setIntField(term2122294, term2122294.getClass(), "type", 14);
        setIntField(term2122364, term2122364.getClass(), "type", 14);
        setIntField(term2122434, term2122434.getClass(), "type", 14);
        setIntField(term2122504, term2122504.getClass(), "type", 14);
        setIntField(term2122574, term2122574.getClass(), "type", 14);
        setIntField(term2122644, term2122644.getClass(), "type", 14);
        setIntField(term2122714, term2122714.getClass(), "type", 14);
        setIntField(term2122784, term2122784.getClass(), "type", 14);
        setIntField(term2122854, term2122854.getClass(), "type", 14);
        setIntField(term2122924, term2122924.getClass(), "type", 14);
        setIntField(term2122994, term2122994.getClass(), "type", 14);
        setIntField(term2123064, term2123064.getClass(), "type", 14);
        setIntField(term2123134, term2123134.getClass(), "type", 14);
        setIntField(term2123204, term2123204.getClass(), "type", 14);
        setIntField(term2123274, term2123274.getClass(), "type", 14);
        setIntField(term2123344, term2123344.getClass(), "type", 14);
        setIntField(term2123414, term2123414.getClass(), "type", 14);
        setIntField(term2123484, term2123484.getClass(), "type", 14);
        setIntField(term2123554, term2123554.getClass(), "type", 14);
        setIntField(term2123624, term2123624.getClass(), "type", 14);
        setIntField(term2123694, term2123694.getClass(), "type", 14);
        setIntField(term2123764, term2123764.getClass(), "type", 14);
        setIntField(term2123834, term2123834.getClass(), "type", 14);
        setIntField(term2123904, term2123904.getClass(), "type", 76);
        setField(term2123834, term2123834.getClass(), "first", term2123904);
        setField(term2123764, term2123764.getClass(), "first", term2123834);
        setField(term2123694, term2123694.getClass(), "first", term2123764);
        setField(term2123624, term2123624.getClass(), "first", term2123694);
        setField(term2123554, term2123554.getClass(), "first", term2123624);
        setField(term2123484, term2123484.getClass(), "first", term2123554);
        setField(term2123414, term2123414.getClass(), "first", term2123484);
        setField(term2123344, term2123344.getClass(), "first", term2123414);
        setField(term2123274, term2123274.getClass(), "first", term2123344);
        setField(term2123204, term2123204.getClass(), "first", term2123274);
        setField(term2123134, term2123134.getClass(), "first", term2123204);
        setField(term2123064, term2123064.getClass(), "first", term2123134);
        setField(term2122994, term2122994.getClass(), "first", term2123064);
        setField(term2122924, term2122924.getClass(), "first", term2122994);
        setField(term2122854, term2122854.getClass(), "first", term2122924);
        setField(term2122784, term2122784.getClass(), "first", term2122854);
        setField(term2122714, term2122714.getClass(), "first", term2122784);
        setField(term2122644, term2122644.getClass(), "first", term2122714);
        setField(term2122574, term2122574.getClass(), "first", term2122644);
        setField(term2122504, term2122504.getClass(), "first", term2122574);
        setField(term2122434, term2122434.getClass(), "first", term2122504);
        setField(term2122364, term2122364.getClass(), "first", term2122434);
        setField(term2122294, term2122294.getClass(), "first", term2122364);
        setField(term2122224, term2122224.getClass(), "first", term2122294);
        setField(term2122154, term2122154.getClass(), "first", term2122224);
        setField(term2122084, term2122084.getClass(), "first", term2122154);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term2122084;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term2122014, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


