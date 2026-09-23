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

public class TypeInference_traverseReturn_1142297770461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1288967;
     Object term1289037;

    public TypeInference_traverseReturn_1142297770461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1288967 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1289037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1289107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1289177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1289247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1289317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1289387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1289457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1289527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1289597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1289667 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1289737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1289807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1289877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1289947 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1290017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1290087 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1290157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1290227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1290297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1290367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1290437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1290507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1290577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1290647 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1290717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1290787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1290857 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1290927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1290997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1291067 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1291137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1291207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1291277 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1291347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1291417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1291487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1291557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1291627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1291697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1291767 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1291837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1291907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1291977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1289107, term1289107.getClass(), "type", 92);
        setIntField(term1289177, term1289177.getClass(), "type", 92);
        setIntField(term1289247, term1289247.getClass(), "type", 92);
        setIntField(term1289317, term1289317.getClass(), "type", 92);
        setIntField(term1289387, term1289387.getClass(), "type", 92);
        setIntField(term1289457, term1289457.getClass(), "type", 92);
        setIntField(term1289527, term1289527.getClass(), "type", 92);
        setIntField(term1289597, term1289597.getClass(), "type", 92);
        setIntField(term1289667, term1289667.getClass(), "type", 92);
        setIntField(term1289737, term1289737.getClass(), "type", 92);
        setIntField(term1289807, term1289807.getClass(), "type", 92);
        setIntField(term1289877, term1289877.getClass(), "type", 92);
        setIntField(term1289947, term1289947.getClass(), "type", 92);
        setIntField(term1290017, term1290017.getClass(), "type", 92);
        setIntField(term1290087, term1290087.getClass(), "type", 92);
        setIntField(term1290157, term1290157.getClass(), "type", 92);
        setIntField(term1290227, term1290227.getClass(), "type", 92);
        setIntField(term1290297, term1290297.getClass(), "type", 92);
        setIntField(term1290367, term1290367.getClass(), "type", 92);
        setIntField(term1290437, term1290437.getClass(), "type", 92);
        setIntField(term1290507, term1290507.getClass(), "type", 92);
        setIntField(term1290577, term1290577.getClass(), "type", 92);
        setIntField(term1290647, term1290647.getClass(), "type", 92);
        setIntField(term1290717, term1290717.getClass(), "type", 92);
        setIntField(term1290787, term1290787.getClass(), "type", 92);
        setIntField(term1290857, term1290857.getClass(), "type", 92);
        setIntField(term1290927, term1290927.getClass(), "type", 92);
        setIntField(term1290997, term1290997.getClass(), "type", 92);
        setIntField(term1291067, term1291067.getClass(), "type", 92);
        setIntField(term1291137, term1291137.getClass(), "type", 92);
        setIntField(term1291207, term1291207.getClass(), "type", 92);
        setIntField(term1291277, term1291277.getClass(), "type", 92);
        setIntField(term1291347, term1291347.getClass(), "type", 92);
        setIntField(term1291417, term1291417.getClass(), "type", 92);
        setIntField(term1291487, term1291487.getClass(), "type", 92);
        setIntField(term1291557, term1291557.getClass(), "type", 92);
        setIntField(term1291627, term1291627.getClass(), "type", 92);
        setIntField(term1291697, term1291697.getClass(), "type", 92);
        setIntField(term1291767, term1291767.getClass(), "type", 92);
        setIntField(term1291837, term1291837.getClass(), "type", 92);
        setIntField(term1291907, term1291907.getClass(), "type", 92);
        setIntField(term1291977, term1291977.getClass(), "type", 85);
        setField(term1291907, term1291907.getClass(), "first", term1291977);
        setField(term1291837, term1291837.getClass(), "first", term1291907);
        setField(term1291767, term1291767.getClass(), "first", term1291837);
        setField(term1291697, term1291697.getClass(), "first", term1291767);
        setField(term1291627, term1291627.getClass(), "first", term1291697);
        setField(term1291557, term1291557.getClass(), "first", term1291627);
        setField(term1291487, term1291487.getClass(), "first", term1291557);
        setField(term1291417, term1291417.getClass(), "first", term1291487);
        setField(term1291347, term1291347.getClass(), "first", term1291417);
        setField(term1291277, term1291277.getClass(), "first", term1291347);
        setField(term1291207, term1291207.getClass(), "first", term1291277);
        setField(term1291137, term1291137.getClass(), "first", term1291207);
        setField(term1291067, term1291067.getClass(), "first", term1291137);
        setField(term1290997, term1290997.getClass(), "first", term1291067);
        setField(term1290927, term1290927.getClass(), "first", term1290997);
        setField(term1290857, term1290857.getClass(), "first", term1290927);
        setField(term1290787, term1290787.getClass(), "first", term1290857);
        setField(term1290717, term1290717.getClass(), "first", term1290787);
        setField(term1290647, term1290647.getClass(), "first", term1290717);
        setField(term1290577, term1290577.getClass(), "first", term1290647);
        setField(term1290507, term1290507.getClass(), "first", term1290577);
        setField(term1290437, term1290437.getClass(), "first", term1290507);
        setField(term1290367, term1290367.getClass(), "first", term1290437);
        setField(term1290297, term1290297.getClass(), "first", term1290367);
        setField(term1290227, term1290227.getClass(), "first", term1290297);
        setField(term1290157, term1290157.getClass(), "first", term1290227);
        setField(term1290087, term1290087.getClass(), "first", term1290157);
        setField(term1290017, term1290017.getClass(), "first", term1290087);
        setField(term1289947, term1289947.getClass(), "first", term1290017);
        setField(term1289877, term1289877.getClass(), "first", term1289947);
        setField(term1289807, term1289807.getClass(), "first", term1289877);
        setField(term1289737, term1289737.getClass(), "first", term1289807);
        setField(term1289667, term1289667.getClass(), "first", term1289737);
        setField(term1289597, term1289597.getClass(), "first", term1289667);
        setField(term1289527, term1289527.getClass(), "first", term1289597);
        setField(term1289457, term1289457.getClass(), "first", term1289527);
        setField(term1289387, term1289387.getClass(), "first", term1289457);
        setField(term1289317, term1289317.getClass(), "first", term1289387);
        setField(term1289247, term1289247.getClass(), "first", term1289317);
        setField(term1289177, term1289177.getClass(), "first", term1289247);
        setField(term1289107, term1289107.getClass(), "first", term1289177);
        setField(term1289037, term1289037.getClass(), "first", term1289107);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1289037;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term1288967, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


