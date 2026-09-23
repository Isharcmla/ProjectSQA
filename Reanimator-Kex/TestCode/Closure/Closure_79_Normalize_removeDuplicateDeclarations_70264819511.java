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

public class Normalize_removeDuplicateDeclarations_70264819511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171;
     Object term173;
     Object term200;

    public Normalize_removeDuplicateDeclarations_70264819511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        setField(term171, term171.getClass(), "compiler", null);
        setBooleanField(term171, term171.getClass(), "assertOnChange", false);
        term173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term186 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term196 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term173, term173.getClass(), "type", 865208305);
        setIntField(term175, term175.getClass(), "type", -1179120542);
        setIntField(term177, term177.getClass(), "type", 0);
        setField(term177, term177.getClass(), "next", null);
        setField(term177, term177.getClass(), "first", null);
        setField(term177, term177.getClass(), "last", null);
        setField(term177, term177.getClass(), "propListHead", null);
        setIntField(term177, term177.getClass(), "sourcePosition", 0);
        setField(term177, term177.getClass(), "jsType", null);
        setField(term177, term177.getClass(), "parent", null);
        setField(term175, term175.getClass(), "next", term177);
        setIntField(term180, term180.getClass(), "type", 0);
        setField(term180, term180.getClass(), "next", null);
        setField(term180, term180.getClass(), "first", null);
        setField(term180, term180.getClass(), "last", null);
        setField(term180, term180.getClass(), "propListHead", null);
        setIntField(term180, term180.getClass(), "sourcePosition", 0);
        setField(term180, term180.getClass(), "jsType", null);
        setField(term180, term180.getClass(), "parent", null);
        setField(term175, term175.getClass(), "first", term180);
        setIntField(term183, term183.getClass(), "type", 0);
        setField(term183, term183.getClass(), "next", null);
        setField(term183, term183.getClass(), "first", null);
        setField(term183, term183.getClass(), "last", null);
        setField(term183, term183.getClass(), "propListHead", null);
        setIntField(term183, term183.getClass(), "sourcePosition", 0);
        setField(term183, term183.getClass(), "jsType", null);
        setField(term183, term183.getClass(), "parent", null);
        setField(term175, term175.getClass(), "last", term183);
        setField(term186, term186.getClass(), "next", null);
        setIntField(term186, term186.getClass(), "type", 0);
        setIntField(term186, term186.getClass(), "intValue", 0);
        setField(term186, term186.getClass(), "objectValue", null);
        setField(term175, term175.getClass(), "propListHead", term186);
        setIntField(term175, term175.getClass(), "sourcePosition", 1193880199);
        setField(term175, term175.getClass(), "jsType", null);
        setField(term175, term175.getClass(), "parent", null);
        setField(term173, term173.getClass(), "next", term175);
        setIntField(term190, term190.getClass(), "type", 0);
        setField(term190, term190.getClass(), "next", null);
        setField(term190, term190.getClass(), "first", null);
        setField(term190, term190.getClass(), "last", null);
        setField(term190, term190.getClass(), "propListHead", null);
        setIntField(term190, term190.getClass(), "sourcePosition", 0);
        setField(term190, term190.getClass(), "jsType", null);
        setField(term190, term190.getClass(), "parent", null);
        setField(term173, term173.getClass(), "first", term190);
        setIntField(term193, term193.getClass(), "type", 0);
        setField(term193, term193.getClass(), "next", null);
        setField(term193, term193.getClass(), "first", null);
        setField(term193, term193.getClass(), "last", null);
        setField(term193, term193.getClass(), "propListHead", null);
        setIntField(term193, term193.getClass(), "sourcePosition", 0);
        setField(term193, term193.getClass(), "jsType", null);
        setField(term193, term193.getClass(), "parent", null);
        setField(term173, term173.getClass(), "last", term193);
        setField(term196, term196.getClass(), "next", null);
        setIntField(term196, term196.getClass(), "type", 0);
        setIntField(term196, term196.getClass(), "intValue", 0);
        setField(term196, term196.getClass(), "objectValue", null);
        setField(term173, term173.getClass(), "propListHead", term196);
        setIntField(term173, term173.getClass(), "sourcePosition", -1087774327);
        setField(term173, term173.getClass(), "jsType", null);
        setField(term173, term173.getClass(), "parent", null);
        term200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term213 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term220 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term223 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term200, term200.getClass(), "type", 679763016);
        setIntField(term202, term202.getClass(), "type", -157887805);
        setIntField(term204, term204.getClass(), "type", 0);
        setField(term204, term204.getClass(), "next", null);
        setField(term204, term204.getClass(), "first", null);
        setField(term204, term204.getClass(), "last", null);
        setField(term204, term204.getClass(), "propListHead", null);
        setIntField(term204, term204.getClass(), "sourcePosition", 0);
        setField(term204, term204.getClass(), "jsType", null);
        setField(term204, term204.getClass(), "parent", null);
        setField(term202, term202.getClass(), "next", term204);
        setIntField(term207, term207.getClass(), "type", 0);
        setField(term207, term207.getClass(), "next", null);
        setField(term207, term207.getClass(), "first", null);
        setField(term207, term207.getClass(), "last", null);
        setField(term207, term207.getClass(), "propListHead", null);
        setIntField(term207, term207.getClass(), "sourcePosition", 0);
        setField(term207, term207.getClass(), "jsType", null);
        setField(term207, term207.getClass(), "parent", null);
        setField(term202, term202.getClass(), "first", term207);
        setIntField(term210, term210.getClass(), "type", 0);
        setField(term210, term210.getClass(), "next", null);
        setField(term210, term210.getClass(), "first", null);
        setField(term210, term210.getClass(), "last", null);
        setField(term210, term210.getClass(), "propListHead", null);
        setIntField(term210, term210.getClass(), "sourcePosition", 0);
        setField(term210, term210.getClass(), "jsType", null);
        setField(term210, term210.getClass(), "parent", null);
        setField(term202, term202.getClass(), "last", term210);
        setField(term213, term213.getClass(), "next", null);
        setIntField(term213, term213.getClass(), "type", 0);
        setIntField(term213, term213.getClass(), "intValue", 0);
        setField(term213, term213.getClass(), "objectValue", null);
        setField(term202, term202.getClass(), "propListHead", term213);
        setIntField(term202, term202.getClass(), "sourcePosition", -1016503459);
        setField(term202, term202.getClass(), "jsType", null);
        setField(term202, term202.getClass(), "parent", null);
        setField(term200, term200.getClass(), "next", term202);
        setIntField(term217, term217.getClass(), "type", 0);
        setField(term217, term217.getClass(), "next", null);
        setField(term217, term217.getClass(), "first", null);
        setField(term217, term217.getClass(), "last", null);
        setField(term217, term217.getClass(), "propListHead", null);
        setIntField(term217, term217.getClass(), "sourcePosition", 0);
        setField(term217, term217.getClass(), "jsType", null);
        setField(term217, term217.getClass(), "parent", null);
        setField(term200, term200.getClass(), "first", term217);
        setIntField(term220, term220.getClass(), "type", 0);
        setField(term220, term220.getClass(), "next", null);
        setField(term220, term220.getClass(), "first", null);
        setField(term220, term220.getClass(), "last", null);
        setField(term220, term220.getClass(), "propListHead", null);
        setIntField(term220, term220.getClass(), "sourcePosition", 0);
        setField(term220, term220.getClass(), "jsType", null);
        setField(term220, term220.getClass(), "parent", null);
        setField(term200, term200.getClass(), "last", term220);
        setField(term223, term223.getClass(), "next", null);
        setIntField(term223, term223.getClass(), "type", 0);
        setIntField(term223, term223.getClass(), "intValue", 0);
        setField(term223, term223.getClass(), "objectValue", null);
        setField(term200, term200.getClass(), "propListHead", term223);
        setIntField(term200, term200.getClass(), "sourcePosition", -1968847291);
        setField(term200, term200.getClass(), "jsType", null);
        setField(term200, term200.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term173;
        args[1] = term200;
        try {
            callMethod(klass, "removeDuplicateDeclarations", argTypes, term171, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


