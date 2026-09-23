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

public class TypeInference_traverseReturn_1142297770328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term737002;
     Object term737072;

    public TypeInference_traverseReturn_1142297770328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term737002 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term737072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term737142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term737212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term737282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term737352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term737422 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term737492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term737562 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term737632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term737702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term737772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term737842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term737912 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term737982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term738052 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term738122 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term738192 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term738262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term738332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term738402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term738472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term738542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term738612 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term738682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term738752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term738822 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term738892 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term738962 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term739032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term739102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term737142, term737142.getClass(), "type", 92);
        setIntField(term737212, term737212.getClass(), "type", 92);
        setIntField(term737282, term737282.getClass(), "type", 92);
        setIntField(term737352, term737352.getClass(), "type", 92);
        setIntField(term737422, term737422.getClass(), "type", 92);
        setIntField(term737492, term737492.getClass(), "type", 92);
        setIntField(term737562, term737562.getClass(), "type", 92);
        setIntField(term737632, term737632.getClass(), "type", 92);
        setIntField(term737702, term737702.getClass(), "type", 92);
        setIntField(term737772, term737772.getClass(), "type", 92);
        setIntField(term737842, term737842.getClass(), "type", 92);
        setIntField(term737912, term737912.getClass(), "type", 92);
        setIntField(term737982, term737982.getClass(), "type", 92);
        setIntField(term738052, term738052.getClass(), "type", 92);
        setIntField(term738122, term738122.getClass(), "type", 92);
        setIntField(term738192, term738192.getClass(), "type", 92);
        setIntField(term738262, term738262.getClass(), "type", 92);
        setIntField(term738332, term738332.getClass(), "type", 92);
        setIntField(term738402, term738402.getClass(), "type", 92);
        setIntField(term738472, term738472.getClass(), "type", 92);
        setIntField(term738542, term738542.getClass(), "type", 92);
        setIntField(term738612, term738612.getClass(), "type", 92);
        setIntField(term738682, term738682.getClass(), "type", 92);
        setIntField(term738752, term738752.getClass(), "type", 92);
        setIntField(term738822, term738822.getClass(), "type", 92);
        setIntField(term738892, term738892.getClass(), "type", 92);
        setIntField(term738962, term738962.getClass(), "type", 92);
        setIntField(term739032, term739032.getClass(), "type", 92);
        setIntField(term739102, term739102.getClass(), "type", 12);
        setField(term739032, term739032.getClass(), "first", term739102);
        setField(term738962, term738962.getClass(), "first", term739032);
        setField(term738892, term738892.getClass(), "first", term738962);
        setField(term738822, term738822.getClass(), "first", term738892);
        setField(term738752, term738752.getClass(), "first", term738822);
        setField(term738682, term738682.getClass(), "first", term738752);
        setField(term738612, term738612.getClass(), "first", term738682);
        setField(term738542, term738542.getClass(), "first", term738612);
        setField(term738472, term738472.getClass(), "first", term738542);
        setField(term738402, term738402.getClass(), "first", term738472);
        setField(term738332, term738332.getClass(), "first", term738402);
        setField(term738262, term738262.getClass(), "first", term738332);
        setField(term738192, term738192.getClass(), "first", term738262);
        setField(term738122, term738122.getClass(), "first", term738192);
        setField(term738052, term738052.getClass(), "first", term738122);
        setField(term737982, term737982.getClass(), "first", term738052);
        setField(term737912, term737912.getClass(), "first", term737982);
        setField(term737842, term737842.getClass(), "first", term737912);
        setField(term737772, term737772.getClass(), "first", term737842);
        setField(term737702, term737702.getClass(), "first", term737772);
        setField(term737632, term737632.getClass(), "first", term737702);
        setField(term737562, term737562.getClass(), "first", term737632);
        setField(term737492, term737492.getClass(), "first", term737562);
        setField(term737422, term737422.getClass(), "first", term737492);
        setField(term737352, term737352.getClass(), "first", term737422);
        setField(term737282, term737282.getClass(), "first", term737352);
        setField(term737212, term737212.getClass(), "first", term737282);
        setField(term737142, term737142.getClass(), "first", term737212);
        setField(term737072, term737072.getClass(), "first", term737142);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term737072;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term737002, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


