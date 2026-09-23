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

public class TypeInference_traverseAdd_838817955278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275957;
     Object term276027;

    public TypeInference_traverseAdd_838817955278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term275957 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term276027 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term276097 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term276167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term276237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term276307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term276377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term276447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term276517 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term276587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term276657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term276727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term276797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term276867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term276937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term277007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term277077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term277147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term277217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term277287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term277357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term277427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term277497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term277567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term277637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term277707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term277777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term277847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term277917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term277987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term278057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term278127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term278197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term278267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term278337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term278407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term278477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term278547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term278617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term278687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term278757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term278827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term278897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term278967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term279037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term279107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term279177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term279247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term279317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term279387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term279457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term279527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term279597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term279667 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term279737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term279807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term276097, term276097.getClass(), "next", null);
        setIntField(term276097, term276097.getClass(), "type", 14);
        setIntField(term276167, term276167.getClass(), "type", 14);
        setIntField(term276237, term276237.getClass(), "type", 14);
        setIntField(term276307, term276307.getClass(), "type", 14);
        setIntField(term276377, term276377.getClass(), "type", 14);
        setIntField(term276447, term276447.getClass(), "type", 14);
        setIntField(term276517, term276517.getClass(), "type", 14);
        setIntField(term276587, term276587.getClass(), "type", 14);
        setIntField(term276657, term276657.getClass(), "type", 14);
        setIntField(term276727, term276727.getClass(), "type", 14);
        setIntField(term276797, term276797.getClass(), "type", 14);
        setIntField(term276867, term276867.getClass(), "type", 14);
        setIntField(term276937, term276937.getClass(), "type", 14);
        setIntField(term277007, term277007.getClass(), "type", 14);
        setIntField(term277077, term277077.getClass(), "type", 14);
        setIntField(term277147, term277147.getClass(), "type", 14);
        setIntField(term277217, term277217.getClass(), "type", 14);
        setIntField(term277287, term277287.getClass(), "type", 14);
        setIntField(term277357, term277357.getClass(), "type", 14);
        setIntField(term277427, term277427.getClass(), "type", 14);
        setIntField(term277497, term277497.getClass(), "type", 14);
        setIntField(term277567, term277567.getClass(), "type", 14);
        setIntField(term277637, term277637.getClass(), "type", 14);
        setIntField(term277707, term277707.getClass(), "type", 14);
        setIntField(term277777, term277777.getClass(), "type", 14);
        setIntField(term277847, term277847.getClass(), "type", 14);
        setIntField(term277917, term277917.getClass(), "type", 14);
        setIntField(term277987, term277987.getClass(), "type", 14);
        setIntField(term278057, term278057.getClass(), "type", 14);
        setIntField(term278127, term278127.getClass(), "type", 14);
        setIntField(term278197, term278197.getClass(), "type", 14);
        setIntField(term278267, term278267.getClass(), "type", 14);
        setIntField(term278337, term278337.getClass(), "type", 14);
        setIntField(term278407, term278407.getClass(), "type", 14);
        setIntField(term278477, term278477.getClass(), "type", 14);
        setIntField(term278547, term278547.getClass(), "type", 14);
        setIntField(term278617, term278617.getClass(), "type", 14);
        setIntField(term278687, term278687.getClass(), "type", 14);
        setIntField(term278757, term278757.getClass(), "type", 14);
        setIntField(term278827, term278827.getClass(), "type", 14);
        setIntField(term278897, term278897.getClass(), "type", 14);
        setIntField(term278967, term278967.getClass(), "type", 14);
        setIntField(term279037, term279037.getClass(), "type", 14);
        setIntField(term279107, term279107.getClass(), "type", 14);
        setIntField(term279177, term279177.getClass(), "type", 14);
        setIntField(term279247, term279247.getClass(), "type", 14);
        setIntField(term279317, term279317.getClass(), "type", 14);
        setIntField(term279387, term279387.getClass(), "type", 14);
        setIntField(term279457, term279457.getClass(), "type", 14);
        setIntField(term279527, term279527.getClass(), "type", 14);
        setIntField(term279597, term279597.getClass(), "type", 14);
        setIntField(term279667, term279667.getClass(), "type", 14);
        setIntField(term279737, term279737.getClass(), "type", 14);
        setIntField(term279807, term279807.getClass(), "type", 114);
        setField(term279737, term279737.getClass(), "first", term279807);
        setField(term279667, term279667.getClass(), "first", term279737);
        setField(term279597, term279597.getClass(), "first", term279667);
        setField(term279527, term279527.getClass(), "first", term279597);
        setField(term279457, term279457.getClass(), "first", term279527);
        setField(term279387, term279387.getClass(), "first", term279457);
        setField(term279317, term279317.getClass(), "first", term279387);
        setField(term279247, term279247.getClass(), "first", term279317);
        setField(term279177, term279177.getClass(), "first", term279247);
        setField(term279107, term279107.getClass(), "first", term279177);
        setField(term279037, term279037.getClass(), "first", term279107);
        setField(term278967, term278967.getClass(), "first", term279037);
        setField(term278897, term278897.getClass(), "first", term278967);
        setField(term278827, term278827.getClass(), "first", term278897);
        setField(term278757, term278757.getClass(), "first", term278827);
        setField(term278687, term278687.getClass(), "first", term278757);
        setField(term278617, term278617.getClass(), "first", term278687);
        setField(term278547, term278547.getClass(), "first", term278617);
        setField(term278477, term278477.getClass(), "first", term278547);
        setField(term278407, term278407.getClass(), "first", term278477);
        setField(term278337, term278337.getClass(), "first", term278407);
        setField(term278267, term278267.getClass(), "first", term278337);
        setField(term278197, term278197.getClass(), "first", term278267);
        setField(term278127, term278127.getClass(), "first", term278197);
        setField(term278057, term278057.getClass(), "first", term278127);
        setField(term277987, term277987.getClass(), "first", term278057);
        setField(term277917, term277917.getClass(), "first", term277987);
        setField(term277847, term277847.getClass(), "first", term277917);
        setField(term277777, term277777.getClass(), "first", term277847);
        setField(term277707, term277707.getClass(), "first", term277777);
        setField(term277637, term277637.getClass(), "first", term277707);
        setField(term277567, term277567.getClass(), "first", term277637);
        setField(term277497, term277497.getClass(), "first", term277567);
        setField(term277427, term277427.getClass(), "first", term277497);
        setField(term277357, term277357.getClass(), "first", term277427);
        setField(term277287, term277287.getClass(), "first", term277357);
        setField(term277217, term277217.getClass(), "first", term277287);
        setField(term277147, term277147.getClass(), "first", term277217);
        setField(term277077, term277077.getClass(), "first", term277147);
        setField(term277007, term277007.getClass(), "first", term277077);
        setField(term276937, term276937.getClass(), "first", term277007);
        setField(term276867, term276867.getClass(), "first", term276937);
        setField(term276797, term276797.getClass(), "first", term276867);
        setField(term276727, term276727.getClass(), "first", term276797);
        setField(term276657, term276657.getClass(), "first", term276727);
        setField(term276587, term276587.getClass(), "first", term276657);
        setField(term276517, term276517.getClass(), "first", term276587);
        setField(term276447, term276447.getClass(), "first", term276517);
        setField(term276377, term276377.getClass(), "first", term276447);
        setField(term276307, term276307.getClass(), "first", term276377);
        setField(term276237, term276237.getClass(), "first", term276307);
        setField(term276167, term276167.getClass(), "first", term276237);
        setField(term276097, term276097.getClass(), "first", term276167);
        setField(term276027, term276027.getClass(), "first", term276097);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term276027;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term275957, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


