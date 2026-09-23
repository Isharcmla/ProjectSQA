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

public class TypeInference_traverseReturn_1142297770343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term807958;
     Object term808028;

    public TypeInference_traverseReturn_1142297770343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term807958 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term808028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term808098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term808168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term808238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term808308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term808378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term808448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term808518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term808588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term808658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term808728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term808798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term808868 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term808938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term809008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term809078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term809148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term809218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term809288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term809358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term809428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term809498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term809568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term809638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term809708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term809778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term809848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term809918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term809988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term810058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term810128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term810198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term810268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term810338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term810408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term810478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term810548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term810618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term808098, term808098.getClass(), "type", 92);
        setIntField(term808168, term808168.getClass(), "type", 92);
        setIntField(term808238, term808238.getClass(), "type", 92);
        setIntField(term808308, term808308.getClass(), "type", 92);
        setIntField(term808378, term808378.getClass(), "type", 92);
        setIntField(term808448, term808448.getClass(), "type", 92);
        setIntField(term808518, term808518.getClass(), "type", 92);
        setIntField(term808588, term808588.getClass(), "type", 92);
        setIntField(term808658, term808658.getClass(), "type", 92);
        setIntField(term808728, term808728.getClass(), "type", 92);
        setIntField(term808798, term808798.getClass(), "type", 92);
        setIntField(term808868, term808868.getClass(), "type", 92);
        setIntField(term808938, term808938.getClass(), "type", 92);
        setIntField(term809008, term809008.getClass(), "type", 92);
        setIntField(term809078, term809078.getClass(), "type", 92);
        setIntField(term809148, term809148.getClass(), "type", 92);
        setIntField(term809218, term809218.getClass(), "type", 92);
        setIntField(term809288, term809288.getClass(), "type", 92);
        setIntField(term809358, term809358.getClass(), "type", 92);
        setIntField(term809428, term809428.getClass(), "type", 92);
        setIntField(term809498, term809498.getClass(), "type", 92);
        setIntField(term809568, term809568.getClass(), "type", 92);
        setIntField(term809638, term809638.getClass(), "type", 92);
        setIntField(term809708, term809708.getClass(), "type", 92);
        setIntField(term809778, term809778.getClass(), "type", 92);
        setIntField(term809848, term809848.getClass(), "type", 92);
        setIntField(term809918, term809918.getClass(), "type", 92);
        setIntField(term809988, term809988.getClass(), "type", 92);
        setIntField(term810058, term810058.getClass(), "type", 92);
        setIntField(term810128, term810128.getClass(), "type", 92);
        setIntField(term810198, term810198.getClass(), "type", 92);
        setIntField(term810268, term810268.getClass(), "type", 92);
        setIntField(term810338, term810338.getClass(), "type", 92);
        setIntField(term810408, term810408.getClass(), "type", 92);
        setIntField(term810478, term810478.getClass(), "type", 92);
        setIntField(term810548, term810548.getClass(), "type", 92);
        setIntField(term810618, term810618.getClass(), "type", 143);
        setField(term810548, term810548.getClass(), "first", term810618);
        setField(term810478, term810478.getClass(), "first", term810548);
        setField(term810408, term810408.getClass(), "first", term810478);
        setField(term810338, term810338.getClass(), "first", term810408);
        setField(term810268, term810268.getClass(), "first", term810338);
        setField(term810198, term810198.getClass(), "first", term810268);
        setField(term810128, term810128.getClass(), "first", term810198);
        setField(term810058, term810058.getClass(), "first", term810128);
        setField(term809988, term809988.getClass(), "first", term810058);
        setField(term809918, term809918.getClass(), "first", term809988);
        setField(term809848, term809848.getClass(), "first", term809918);
        setField(term809778, term809778.getClass(), "first", term809848);
        setField(term809708, term809708.getClass(), "first", term809778);
        setField(term809638, term809638.getClass(), "first", term809708);
        setField(term809568, term809568.getClass(), "first", term809638);
        setField(term809498, term809498.getClass(), "first", term809568);
        setField(term809428, term809428.getClass(), "first", term809498);
        setField(term809358, term809358.getClass(), "first", term809428);
        setField(term809288, term809288.getClass(), "first", term809358);
        setField(term809218, term809218.getClass(), "first", term809288);
        setField(term809148, term809148.getClass(), "first", term809218);
        setField(term809078, term809078.getClass(), "first", term809148);
        setField(term809008, term809008.getClass(), "first", term809078);
        setField(term808938, term808938.getClass(), "first", term809008);
        setField(term808868, term808868.getClass(), "first", term808938);
        setField(term808798, term808798.getClass(), "first", term808868);
        setField(term808728, term808728.getClass(), "first", term808798);
        setField(term808658, term808658.getClass(), "first", term808728);
        setField(term808588, term808588.getClass(), "first", term808658);
        setField(term808518, term808518.getClass(), "first", term808588);
        setField(term808448, term808448.getClass(), "first", term808518);
        setField(term808378, term808378.getClass(), "first", term808448);
        setField(term808308, term808308.getClass(), "first", term808378);
        setField(term808238, term808238.getClass(), "first", term808308);
        setField(term808168, term808168.getClass(), "first", term808238);
        setField(term808098, term808098.getClass(), "first", term808168);
        setField(term808028, term808028.getClass(), "first", term808098);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term808028;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term807958, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


