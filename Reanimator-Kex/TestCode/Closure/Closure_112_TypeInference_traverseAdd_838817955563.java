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

public class TypeInference_traverseAdd_838817955563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3220866;
     Object term3220936;

    public TypeInference_traverseAdd_838817955563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3220866 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term3220936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3221006 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3221076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3221146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3221216 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3221286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3221356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3221426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3221496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3221566 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3221636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3221706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3221776 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3221846 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3221916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3221986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3222056 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3222126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3222196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3222266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3222336 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3222406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3222476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3222546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3222616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3222686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3222756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3222826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3222896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3222966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3223036 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term3221006, term3221006.getClass(), "next", null);
        setIntField(term3221006, term3221006.getClass(), "type", 14);
        setIntField(term3221076, term3221076.getClass(), "type", 14);
        setIntField(term3221146, term3221146.getClass(), "type", 14);
        setIntField(term3221216, term3221216.getClass(), "type", 14);
        setIntField(term3221286, term3221286.getClass(), "type", 14);
        setIntField(term3221356, term3221356.getClass(), "type", 14);
        setIntField(term3221426, term3221426.getClass(), "type", 14);
        setIntField(term3221496, term3221496.getClass(), "type", 14);
        setIntField(term3221566, term3221566.getClass(), "type", 14);
        setIntField(term3221636, term3221636.getClass(), "type", 14);
        setIntField(term3221706, term3221706.getClass(), "type", 14);
        setIntField(term3221776, term3221776.getClass(), "type", 14);
        setIntField(term3221846, term3221846.getClass(), "type", 14);
        setIntField(term3221916, term3221916.getClass(), "type", 14);
        setIntField(term3221986, term3221986.getClass(), "type", 14);
        setIntField(term3222056, term3222056.getClass(), "type", 14);
        setIntField(term3222126, term3222126.getClass(), "type", 14);
        setIntField(term3222196, term3222196.getClass(), "type", 14);
        setIntField(term3222266, term3222266.getClass(), "type", 14);
        setIntField(term3222336, term3222336.getClass(), "type", 14);
        setIntField(term3222406, term3222406.getClass(), "type", 14);
        setIntField(term3222476, term3222476.getClass(), "type", 14);
        setIntField(term3222546, term3222546.getClass(), "type", 14);
        setIntField(term3222616, term3222616.getClass(), "type", 14);
        setIntField(term3222686, term3222686.getClass(), "type", 14);
        setIntField(term3222756, term3222756.getClass(), "type", 14);
        setIntField(term3222826, term3222826.getClass(), "type", 14);
        setIntField(term3222896, term3222896.getClass(), "type", 14);
        setIntField(term3222966, term3222966.getClass(), "type", 14);
        setIntField(term3223036, term3223036.getClass(), "type", 63);
        setField(term3222966, term3222966.getClass(), "first", term3223036);
        setField(term3222896, term3222896.getClass(), "first", term3222966);
        setField(term3222826, term3222826.getClass(), "first", term3222896);
        setField(term3222756, term3222756.getClass(), "first", term3222826);
        setField(term3222686, term3222686.getClass(), "first", term3222756);
        setField(term3222616, term3222616.getClass(), "first", term3222686);
        setField(term3222546, term3222546.getClass(), "first", term3222616);
        setField(term3222476, term3222476.getClass(), "first", term3222546);
        setField(term3222406, term3222406.getClass(), "first", term3222476);
        setField(term3222336, term3222336.getClass(), "first", term3222406);
        setField(term3222266, term3222266.getClass(), "first", term3222336);
        setField(term3222196, term3222196.getClass(), "first", term3222266);
        setField(term3222126, term3222126.getClass(), "first", term3222196);
        setField(term3222056, term3222056.getClass(), "first", term3222126);
        setField(term3221986, term3221986.getClass(), "first", term3222056);
        setField(term3221916, term3221916.getClass(), "first", term3221986);
        setField(term3221846, term3221846.getClass(), "first", term3221916);
        setField(term3221776, term3221776.getClass(), "first", term3221846);
        setField(term3221706, term3221706.getClass(), "first", term3221776);
        setField(term3221636, term3221636.getClass(), "first", term3221706);
        setField(term3221566, term3221566.getClass(), "first", term3221636);
        setField(term3221496, term3221496.getClass(), "first", term3221566);
        setField(term3221426, term3221426.getClass(), "first", term3221496);
        setField(term3221356, term3221356.getClass(), "first", term3221426);
        setField(term3221286, term3221286.getClass(), "first", term3221356);
        setField(term3221216, term3221216.getClass(), "first", term3221286);
        setField(term3221146, term3221146.getClass(), "first", term3221216);
        setField(term3221076, term3221076.getClass(), "first", term3221146);
        setField(term3221006, term3221006.getClass(), "first", term3221076);
        setField(term3220936, term3220936.getClass(), "first", term3221006);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term3220936;
        args[1] = null;
        callMethod(klass, "traverseAdd", argTypes, term3220866, args);
    }

};


