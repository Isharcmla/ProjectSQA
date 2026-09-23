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

public class TypeInference_traverseGetElem_947565415335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term920662;
     Object term920732;

    public TypeInference_traverseGetElem_947565415335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term920662 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term920732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term920802 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term920872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term920942 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921152 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921222 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921292 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921852 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921992 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term922062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term922132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term922202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term922272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term922342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term922412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term922482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term922552 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term922622 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term922692 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term922762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term922832 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term920802, term920802.getClass(), "type", 21);
        setField(term920872, term920872.getClass(), "next", null);
        setIntField(term920872, term920872.getClass(), "type", 21);
        setField(term920942, term920942.getClass(), "next", null);
        setIntField(term920942, term920942.getClass(), "type", 21);
        setField(term921012, term921012.getClass(), "next", null);
        setIntField(term921012, term921012.getClass(), "type", 21);
        setField(term921082, term921082.getClass(), "next", null);
        setIntField(term921082, term921082.getClass(), "type", 21);
        setField(term921152, term921152.getClass(), "next", null);
        setIntField(term921152, term921152.getClass(), "type", 21);
        setField(term921222, term921222.getClass(), "next", null);
        setIntField(term921222, term921222.getClass(), "type", 21);
        setField(term921292, term921292.getClass(), "next", null);
        setIntField(term921292, term921292.getClass(), "type", 21);
        setField(term921362, term921362.getClass(), "next", null);
        setIntField(term921362, term921362.getClass(), "type", 21);
        setField(term921432, term921432.getClass(), "next", null);
        setIntField(term921432, term921432.getClass(), "type", 21);
        setField(term921502, term921502.getClass(), "next", null);
        setIntField(term921502, term921502.getClass(), "type", 21);
        setField(term921572, term921572.getClass(), "next", null);
        setIntField(term921572, term921572.getClass(), "type", 21);
        setField(term921642, term921642.getClass(), "next", null);
        setIntField(term921642, term921642.getClass(), "type", 21);
        setField(term921712, term921712.getClass(), "next", null);
        setIntField(term921712, term921712.getClass(), "type", 21);
        setField(term921782, term921782.getClass(), "next", null);
        setIntField(term921782, term921782.getClass(), "type", 21);
        setField(term921852, term921852.getClass(), "next", null);
        setIntField(term921852, term921852.getClass(), "type", 21);
        setField(term921922, term921922.getClass(), "next", null);
        setIntField(term921922, term921922.getClass(), "type", 21);
        setField(term921992, term921992.getClass(), "next", null);
        setIntField(term921992, term921992.getClass(), "type", 21);
        setField(term922062, term922062.getClass(), "next", null);
        setIntField(term922062, term922062.getClass(), "type", 21);
        setField(term922132, term922132.getClass(), "next", null);
        setIntField(term922132, term922132.getClass(), "type", 21);
        setField(term922202, term922202.getClass(), "next", null);
        setIntField(term922202, term922202.getClass(), "type", 21);
        setField(term922272, term922272.getClass(), "next", null);
        setIntField(term922272, term922272.getClass(), "type", 21);
        setField(term922342, term922342.getClass(), "next", null);
        setIntField(term922342, term922342.getClass(), "type", 21);
        setField(term922412, term922412.getClass(), "next", null);
        setIntField(term922412, term922412.getClass(), "type", 21);
        setField(term922482, term922482.getClass(), "next", null);
        setIntField(term922482, term922482.getClass(), "type", 21);
        setField(term922552, term922552.getClass(), "next", null);
        setIntField(term922552, term922552.getClass(), "type", 21);
        setField(term922622, term922622.getClass(), "next", null);
        setIntField(term922622, term922622.getClass(), "type", 21);
        setField(term922692, term922692.getClass(), "next", null);
        setIntField(term922692, term922692.getClass(), "type", 21);
        setField(term922762, term922762.getClass(), "next", null);
        setIntField(term922762, term922762.getClass(), "type", 21);
        setField(term922832, term922832.getClass(), "next", null);
        setIntField(term922832, term922832.getClass(), "type", 117);
        setField(term922762, term922762.getClass(), "first", term922832);
        setField(term922692, term922692.getClass(), "first", term922762);
        setField(term922622, term922622.getClass(), "first", term922692);
        setField(term922552, term922552.getClass(), "first", term922622);
        setField(term922482, term922482.getClass(), "first", term922552);
        setField(term922412, term922412.getClass(), "first", term922482);
        setField(term922342, term922342.getClass(), "first", term922412);
        setField(term922272, term922272.getClass(), "first", term922342);
        setField(term922202, term922202.getClass(), "first", term922272);
        setField(term922132, term922132.getClass(), "first", term922202);
        setField(term922062, term922062.getClass(), "first", term922132);
        setField(term921992, term921992.getClass(), "first", term922062);
        setField(term921922, term921922.getClass(), "first", term921992);
        setField(term921852, term921852.getClass(), "first", term921922);
        setField(term921782, term921782.getClass(), "first", term921852);
        setField(term921712, term921712.getClass(), "first", term921782);
        setField(term921642, term921642.getClass(), "first", term921712);
        setField(term921572, term921572.getClass(), "first", term921642);
        setField(term921502, term921502.getClass(), "first", term921572);
        setField(term921432, term921432.getClass(), "first", term921502);
        setField(term921362, term921362.getClass(), "first", term921432);
        setField(term921292, term921292.getClass(), "first", term921362);
        setField(term921222, term921222.getClass(), "first", term921292);
        setField(term921152, term921152.getClass(), "first", term921222);
        setField(term921082, term921082.getClass(), "first", term921152);
        setField(term921012, term921012.getClass(), "first", term921082);
        setField(term920942, term920942.getClass(), "first", term921012);
        setField(term920872, term920872.getClass(), "first", term920942);
        setField(term920802, term920802.getClass(), "first", term920872);
        setField(term920732, term920732.getClass(), "first", term920802);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term920732;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term920662, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


