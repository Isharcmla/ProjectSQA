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

public class TypeInference_traverseReturn_1142297770322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term724197;
     Object term724267;

    public TypeInference_traverseReturn_1142297770322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term724197 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term724267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term724337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term724407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term724477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term724547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term724617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term724687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term724757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term724827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term724897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term724967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term725037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term725107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term725177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term725247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term725317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term725387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term725457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term725527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term725597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term725667 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term725737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term725807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term725877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term725947 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726087 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726647 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726857 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term727067 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term727137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term727207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term727277 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term727347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term727417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term727487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term727557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term727627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term727697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term727767 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term727837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term727907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term727977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728047 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728187 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728257 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term724337, term724337.getClass(), "type", 29);
        setIntField(term724407, term724407.getClass(), "type", 29);
        setIntField(term724477, term724477.getClass(), "type", 29);
        setIntField(term724547, term724547.getClass(), "type", 29);
        setIntField(term724617, term724617.getClass(), "type", 29);
        setIntField(term724687, term724687.getClass(), "type", 29);
        setIntField(term724757, term724757.getClass(), "type", 29);
        setIntField(term724827, term724827.getClass(), "type", 29);
        setIntField(term724897, term724897.getClass(), "type", 29);
        setIntField(term724967, term724967.getClass(), "type", 29);
        setIntField(term725037, term725037.getClass(), "type", 29);
        setIntField(term725107, term725107.getClass(), "type", 29);
        setIntField(term725177, term725177.getClass(), "type", 29);
        setIntField(term725247, term725247.getClass(), "type", 29);
        setIntField(term725317, term725317.getClass(), "type", 29);
        setIntField(term725387, term725387.getClass(), "type", 29);
        setIntField(term725457, term725457.getClass(), "type", 29);
        setIntField(term725527, term725527.getClass(), "type", 29);
        setIntField(term725597, term725597.getClass(), "type", 29);
        setIntField(term725667, term725667.getClass(), "type", 29);
        setIntField(term725737, term725737.getClass(), "type", 29);
        setIntField(term725807, term725807.getClass(), "type", 29);
        setIntField(term725877, term725877.getClass(), "type", 29);
        setIntField(term725947, term725947.getClass(), "type", 29);
        setIntField(term726017, term726017.getClass(), "type", 29);
        setIntField(term726087, term726087.getClass(), "type", 29);
        setIntField(term726157, term726157.getClass(), "type", 29);
        setIntField(term726227, term726227.getClass(), "type", 29);
        setIntField(term726297, term726297.getClass(), "type", 29);
        setIntField(term726367, term726367.getClass(), "type", 29);
        setIntField(term726437, term726437.getClass(), "type", 29);
        setIntField(term726507, term726507.getClass(), "type", 29);
        setIntField(term726577, term726577.getClass(), "type", 29);
        setIntField(term726647, term726647.getClass(), "type", 29);
        setIntField(term726717, term726717.getClass(), "type", 29);
        setIntField(term726787, term726787.getClass(), "type", 29);
        setIntField(term726857, term726857.getClass(), "type", 29);
        setIntField(term726927, term726927.getClass(), "type", 29);
        setIntField(term726997, term726997.getClass(), "type", 29);
        setIntField(term727067, term727067.getClass(), "type", 29);
        setIntField(term727137, term727137.getClass(), "type", 29);
        setIntField(term727207, term727207.getClass(), "type", 29);
        setIntField(term727277, term727277.getClass(), "type", 29);
        setIntField(term727347, term727347.getClass(), "type", 29);
        setIntField(term727417, term727417.getClass(), "type", 29);
        setIntField(term727487, term727487.getClass(), "type", 29);
        setIntField(term727557, term727557.getClass(), "type", 29);
        setIntField(term727627, term727627.getClass(), "type", 29);
        setIntField(term727697, term727697.getClass(), "type", 29);
        setIntField(term727767, term727767.getClass(), "type", 29);
        setIntField(term727837, term727837.getClass(), "type", 29);
        setIntField(term727907, term727907.getClass(), "type", 29);
        setIntField(term727977, term727977.getClass(), "type", 29);
        setIntField(term728047, term728047.getClass(), "type", 29);
        setIntField(term728117, term728117.getClass(), "type", 29);
        setIntField(term728187, term728187.getClass(), "type", 29);
        setIntField(term728257, term728257.getClass(), "type", 29);
        setIntField(term728327, term728327.getClass(), "type", 29);
        setIntField(term728397, term728397.getClass(), "type", 29);
        setIntField(term728467, term728467.getClass(), "type", 29);
        setIntField(term728537, term728537.getClass(), "type", 52);
        setField(term728467, term728467.getClass(), "first", term728537);
        setField(term728397, term728397.getClass(), "first", term728467);
        setField(term728327, term728327.getClass(), "first", term728397);
        setField(term728257, term728257.getClass(), "first", term728327);
        setField(term728187, term728187.getClass(), "first", term728257);
        setField(term728117, term728117.getClass(), "first", term728187);
        setField(term728047, term728047.getClass(), "first", term728117);
        setField(term727977, term727977.getClass(), "first", term728047);
        setField(term727907, term727907.getClass(), "first", term727977);
        setField(term727837, term727837.getClass(), "first", term727907);
        setField(term727767, term727767.getClass(), "first", term727837);
        setField(term727697, term727697.getClass(), "first", term727767);
        setField(term727627, term727627.getClass(), "first", term727697);
        setField(term727557, term727557.getClass(), "first", term727627);
        setField(term727487, term727487.getClass(), "first", term727557);
        setField(term727417, term727417.getClass(), "first", term727487);
        setField(term727347, term727347.getClass(), "first", term727417);
        setField(term727277, term727277.getClass(), "first", term727347);
        setField(term727207, term727207.getClass(), "first", term727277);
        setField(term727137, term727137.getClass(), "first", term727207);
        setField(term727067, term727067.getClass(), "first", term727137);
        setField(term726997, term726997.getClass(), "first", term727067);
        setField(term726927, term726927.getClass(), "first", term726997);
        setField(term726857, term726857.getClass(), "first", term726927);
        setField(term726787, term726787.getClass(), "first", term726857);
        setField(term726717, term726717.getClass(), "first", term726787);
        setField(term726647, term726647.getClass(), "first", term726717);
        setField(term726577, term726577.getClass(), "first", term726647);
        setField(term726507, term726507.getClass(), "first", term726577);
        setField(term726437, term726437.getClass(), "first", term726507);
        setField(term726367, term726367.getClass(), "first", term726437);
        setField(term726297, term726297.getClass(), "first", term726367);
        setField(term726227, term726227.getClass(), "first", term726297);
        setField(term726157, term726157.getClass(), "first", term726227);
        setField(term726087, term726087.getClass(), "first", term726157);
        setField(term726017, term726017.getClass(), "first", term726087);
        setField(term725947, term725947.getClass(), "first", term726017);
        setField(term725877, term725877.getClass(), "first", term725947);
        setField(term725807, term725807.getClass(), "first", term725877);
        setField(term725737, term725737.getClass(), "first", term725807);
        setField(term725667, term725667.getClass(), "first", term725737);
        setField(term725597, term725597.getClass(), "first", term725667);
        setField(term725527, term725527.getClass(), "first", term725597);
        setField(term725457, term725457.getClass(), "first", term725527);
        setField(term725387, term725387.getClass(), "first", term725457);
        setField(term725317, term725317.getClass(), "first", term725387);
        setField(term725247, term725247.getClass(), "first", term725317);
        setField(term725177, term725177.getClass(), "first", term725247);
        setField(term725107, term725107.getClass(), "first", term725177);
        setField(term725037, term725037.getClass(), "first", term725107);
        setField(term724967, term724967.getClass(), "first", term725037);
        setField(term724897, term724897.getClass(), "first", term724967);
        setField(term724827, term724827.getClass(), "first", term724897);
        setField(term724757, term724757.getClass(), "first", term724827);
        setField(term724687, term724687.getClass(), "first", term724757);
        setField(term724617, term724617.getClass(), "first", term724687);
        setField(term724547, term724547.getClass(), "first", term724617);
        setField(term724477, term724477.getClass(), "first", term724547);
        setField(term724407, term724407.getClass(), "first", term724477);
        setField(term724337, term724337.getClass(), "first", term724407);
        setField(term724267, term724267.getClass(), "first", term724337);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term724267;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term724197, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


