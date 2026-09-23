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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class NodeUtil_containsFunctionDeclaration_1851756716128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term598;
     Object term6180;

    public NodeUtil_containsFunctionDeclaration_1851756716128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term598 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term611 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term621 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term598, term598.getClass(), "type", 252575029);
        setIntField(term600, term600.getClass(), "type", 842904495);
        setIntField(term602, term602.getClass(), "type", 0);
        setField(term602, term602.getClass(), "next", null);
        setField(term602, term602.getClass(), "first", null);
        setField(term602, term602.getClass(), "last", null);
        setField(term602, term602.getClass(), "propListHead", null);
        setIntField(term602, term602.getClass(), "sourcePosition", 0);
        setField(term602, term602.getClass(), "jsType", null);
        setField(term602, term602.getClass(), "parent", null);
        setField(term600, term600.getClass(), "next", term602);
        setIntField(term605, term605.getClass(), "type", 0);
        setField(term605, term605.getClass(), "next", null);
        setField(term605, term605.getClass(), "first", null);
        setField(term605, term605.getClass(), "last", null);
        setField(term605, term605.getClass(), "propListHead", null);
        setIntField(term605, term605.getClass(), "sourcePosition", 0);
        setField(term605, term605.getClass(), "jsType", null);
        setField(term605, term605.getClass(), "parent", null);
        setField(term600, term600.getClass(), "first", term605);
        setIntField(term608, term608.getClass(), "type", 0);
        setField(term608, term608.getClass(), "next", null);
        setField(term608, term608.getClass(), "first", null);
        setField(term608, term608.getClass(), "last", null);
        setField(term608, term608.getClass(), "propListHead", null);
        setIntField(term608, term608.getClass(), "sourcePosition", 0);
        setField(term608, term608.getClass(), "jsType", null);
        setField(term608, term608.getClass(), "parent", null);
        setField(term600, term600.getClass(), "last", term608);
        setField(term611, term611.getClass(), "next", null);
        setIntField(term611, term611.getClass(), "type", 0);
        setIntField(term611, term611.getClass(), "intValue", 0);
        setField(term611, term611.getClass(), "objectValue", null);
        setField(term600, term600.getClass(), "propListHead", term611);
        setIntField(term600, term600.getClass(), "sourcePosition", 1507074215);
        setField(term600, term600.getClass(), "jsType", null);
        setField(term600, term600.getClass(), "parent", null);
        setField(term598, term598.getClass(), "next", term600);
        setIntField(term615, term615.getClass(), "type", 0);
        setField(term615, term615.getClass(), "next", null);
        setField(term615, term615.getClass(), "first", null);
        setField(term615, term615.getClass(), "last", null);
        setField(term615, term615.getClass(), "propListHead", null);
        setIntField(term615, term615.getClass(), "sourcePosition", 0);
        setField(term615, term615.getClass(), "jsType", null);
        setField(term615, term615.getClass(), "parent", null);
        setField(term598, term598.getClass(), "first", term615);
        setIntField(term618, term618.getClass(), "type", 0);
        setField(term618, term618.getClass(), "next", null);
        setField(term618, term618.getClass(), "first", null);
        setField(term618, term618.getClass(), "last", null);
        setField(term618, term618.getClass(), "propListHead", null);
        setIntField(term618, term618.getClass(), "sourcePosition", 0);
        setField(term618, term618.getClass(), "jsType", null);
        setField(term618, term618.getClass(), "parent", null);
        setField(term598, term598.getClass(), "last", term618);
        setField(term621, term621.getClass(), "next", null);
        setIntField(term621, term621.getClass(), "type", 0);
        setIntField(term621, term621.getClass(), "intValue", 0);
        setField(term621, term621.getClass(), "objectValue", null);
        setField(term598, term598.getClass(), "propListHead", term621);
        setIntField(term598, term598.getClass(), "sourcePosition", -282881827);
        setField(term598, term598.getClass(), "jsType", null);
        setField(term598, term598.getClass(), "parent", null);
        term6180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6185 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6187 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6188 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6180, term6180.getClass(), "type", 252575029);
        setIntField(term6181, term6181.getClass(), "type", 842904495);
        setIntField(term6182, term6182.getClass(), "type", 0);
        setField(term6182, term6182.getClass(), "next", null);
        setField(term6182, term6182.getClass(), "first", null);
        setField(term6182, term6182.getClass(), "last", null);
        setField(term6182, term6182.getClass(), "propListHead", null);
        setIntField(term6182, term6182.getClass(), "sourcePosition", 0);
        setField(term6182, term6182.getClass(), "jsType", null);
        setField(term6182, term6182.getClass(), "parent", null);
        setField(term6181, term6181.getClass(), "next", term6182);
        setIntField(term6183, term6183.getClass(), "type", 0);
        setField(term6183, term6183.getClass(), "next", null);
        setField(term6183, term6183.getClass(), "first", null);
        setField(term6183, term6183.getClass(), "last", null);
        setField(term6183, term6183.getClass(), "propListHead", null);
        setIntField(term6183, term6183.getClass(), "sourcePosition", 0);
        setField(term6183, term6183.getClass(), "jsType", null);
        setField(term6183, term6183.getClass(), "parent", null);
        setField(term6181, term6181.getClass(), "first", term6183);
        setIntField(term6184, term6184.getClass(), "type", 0);
        setField(term6184, term6184.getClass(), "next", null);
        setField(term6184, term6184.getClass(), "first", null);
        setField(term6184, term6184.getClass(), "last", null);
        setField(term6184, term6184.getClass(), "propListHead", null);
        setIntField(term6184, term6184.getClass(), "sourcePosition", 0);
        setField(term6184, term6184.getClass(), "jsType", null);
        setField(term6184, term6184.getClass(), "parent", null);
        setField(term6181, term6181.getClass(), "last", term6184);
        setField(term6185, term6185.getClass(), "next", null);
        setIntField(term6185, term6185.getClass(), "type", 0);
        setIntField(term6185, term6185.getClass(), "intValue", 0);
        setField(term6185, term6185.getClass(), "objectValue", null);
        setField(term6181, term6181.getClass(), "propListHead", term6185);
        setIntField(term6181, term6181.getClass(), "sourcePosition", 1507074215);
        setField(term6181, term6181.getClass(), "jsType", null);
        setField(term6181, term6181.getClass(), "parent", null);
        setField(term6180, term6180.getClass(), "next", term6181);
        setIntField(term6186, term6186.getClass(), "type", 0);
        setField(term6186, term6186.getClass(), "next", null);
        setField(term6186, term6186.getClass(), "first", null);
        setField(term6186, term6186.getClass(), "last", null);
        setField(term6186, term6186.getClass(), "propListHead", null);
        setIntField(term6186, term6186.getClass(), "sourcePosition", 0);
        setField(term6186, term6186.getClass(), "jsType", null);
        setField(term6186, term6186.getClass(), "parent", null);
        setField(term6180, term6180.getClass(), "first", term6186);
        setIntField(term6187, term6187.getClass(), "type", 0);
        setField(term6187, term6187.getClass(), "next", null);
        setField(term6187, term6187.getClass(), "first", null);
        setField(term6187, term6187.getClass(), "last", null);
        setField(term6187, term6187.getClass(), "propListHead", null);
        setIntField(term6187, term6187.getClass(), "sourcePosition", 0);
        setField(term6187, term6187.getClass(), "jsType", null);
        setField(term6187, term6187.getClass(), "parent", null);
        setField(term6180, term6180.getClass(), "last", term6187);
        setField(term6188, term6188.getClass(), "next", null);
        setIntField(term6188, term6188.getClass(), "type", 0);
        setIntField(term6188, term6188.getClass(), "intValue", 0);
        setField(term6188, term6188.getClass(), "objectValue", null);
        setField(term6180, term6180.getClass(), "propListHead", term6188);
        setIntField(term6180, term6180.getClass(), "sourcePosition", -282881827);
        setField(term6180, term6180.getClass(), "jsType", null);
        setField(term6180, term6180.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term598;
        callMethod(klass, "containsFunctionDeclaration", argTypes, null, args);
        assertTrue(recursiveEquals(term598, term6180));
    }

};


