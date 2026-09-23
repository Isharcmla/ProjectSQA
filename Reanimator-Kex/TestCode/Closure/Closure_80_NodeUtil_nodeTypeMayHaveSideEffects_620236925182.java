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

public class NodeUtil_nodeTypeMayHaveSideEffects_620236925182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term752;
     Object term9365;

    public NodeUtil_nodeTypeMayHaveSideEffects_620236925182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term765 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term775 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term752, term752.getClass(), "type", -851097944);
        setIntField(term754, term754.getClass(), "type", -1362856620);
        setIntField(term756, term756.getClass(), "type", 0);
        setField(term756, term756.getClass(), "next", null);
        setField(term756, term756.getClass(), "first", null);
        setField(term756, term756.getClass(), "last", null);
        setField(term756, term756.getClass(), "propListHead", null);
        setIntField(term756, term756.getClass(), "sourcePosition", 0);
        setField(term756, term756.getClass(), "jsType", null);
        setField(term756, term756.getClass(), "parent", null);
        setField(term754, term754.getClass(), "next", term756);
        setIntField(term759, term759.getClass(), "type", 0);
        setField(term759, term759.getClass(), "next", null);
        setField(term759, term759.getClass(), "first", null);
        setField(term759, term759.getClass(), "last", null);
        setField(term759, term759.getClass(), "propListHead", null);
        setIntField(term759, term759.getClass(), "sourcePosition", 0);
        setField(term759, term759.getClass(), "jsType", null);
        setField(term759, term759.getClass(), "parent", null);
        setField(term754, term754.getClass(), "first", term759);
        setIntField(term762, term762.getClass(), "type", 0);
        setField(term762, term762.getClass(), "next", null);
        setField(term762, term762.getClass(), "first", null);
        setField(term762, term762.getClass(), "last", null);
        setField(term762, term762.getClass(), "propListHead", null);
        setIntField(term762, term762.getClass(), "sourcePosition", 0);
        setField(term762, term762.getClass(), "jsType", null);
        setField(term762, term762.getClass(), "parent", null);
        setField(term754, term754.getClass(), "last", term762);
        setField(term765, term765.getClass(), "next", null);
        setIntField(term765, term765.getClass(), "type", 0);
        setIntField(term765, term765.getClass(), "intValue", 0);
        setField(term765, term765.getClass(), "objectValue", null);
        setField(term754, term754.getClass(), "propListHead", term765);
        setIntField(term754, term754.getClass(), "sourcePosition", -2013924238);
        setField(term754, term754.getClass(), "jsType", null);
        setField(term754, term754.getClass(), "parent", null);
        setField(term752, term752.getClass(), "next", term754);
        setIntField(term769, term769.getClass(), "type", 0);
        setField(term769, term769.getClass(), "next", null);
        setField(term769, term769.getClass(), "first", null);
        setField(term769, term769.getClass(), "last", null);
        setField(term769, term769.getClass(), "propListHead", null);
        setIntField(term769, term769.getClass(), "sourcePosition", 0);
        setField(term769, term769.getClass(), "jsType", null);
        setField(term769, term769.getClass(), "parent", null);
        setField(term752, term752.getClass(), "first", term769);
        setIntField(term772, term772.getClass(), "type", 0);
        setField(term772, term772.getClass(), "next", null);
        setField(term772, term772.getClass(), "first", null);
        setField(term772, term772.getClass(), "last", null);
        setField(term772, term772.getClass(), "propListHead", null);
        setIntField(term772, term772.getClass(), "sourcePosition", 0);
        setField(term772, term772.getClass(), "jsType", null);
        setField(term772, term772.getClass(), "parent", null);
        setField(term752, term752.getClass(), "last", term772);
        setField(term775, term775.getClass(), "next", null);
        setIntField(term775, term775.getClass(), "type", 0);
        setIntField(term775, term775.getClass(), "intValue", 0);
        setField(term775, term775.getClass(), "objectValue", null);
        setField(term752, term752.getClass(), "propListHead", term775);
        setIntField(term752, term752.getClass(), "sourcePosition", 579006268);
        setField(term752, term752.getClass(), "jsType", null);
        setField(term752, term752.getClass(), "parent", null);
        term9365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9366 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9370 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9373 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term9365, term9365.getClass(), "type", -851097944);
        setIntField(term9366, term9366.getClass(), "type", -1362856620);
        setIntField(term9367, term9367.getClass(), "type", 0);
        setField(term9367, term9367.getClass(), "next", null);
        setField(term9367, term9367.getClass(), "first", null);
        setField(term9367, term9367.getClass(), "last", null);
        setField(term9367, term9367.getClass(), "propListHead", null);
        setIntField(term9367, term9367.getClass(), "sourcePosition", 0);
        setField(term9367, term9367.getClass(), "jsType", null);
        setField(term9367, term9367.getClass(), "parent", null);
        setField(term9366, term9366.getClass(), "next", term9367);
        setIntField(term9368, term9368.getClass(), "type", 0);
        setField(term9368, term9368.getClass(), "next", null);
        setField(term9368, term9368.getClass(), "first", null);
        setField(term9368, term9368.getClass(), "last", null);
        setField(term9368, term9368.getClass(), "propListHead", null);
        setIntField(term9368, term9368.getClass(), "sourcePosition", 0);
        setField(term9368, term9368.getClass(), "jsType", null);
        setField(term9368, term9368.getClass(), "parent", null);
        setField(term9366, term9366.getClass(), "first", term9368);
        setIntField(term9369, term9369.getClass(), "type", 0);
        setField(term9369, term9369.getClass(), "next", null);
        setField(term9369, term9369.getClass(), "first", null);
        setField(term9369, term9369.getClass(), "last", null);
        setField(term9369, term9369.getClass(), "propListHead", null);
        setIntField(term9369, term9369.getClass(), "sourcePosition", 0);
        setField(term9369, term9369.getClass(), "jsType", null);
        setField(term9369, term9369.getClass(), "parent", null);
        setField(term9366, term9366.getClass(), "last", term9369);
        setField(term9370, term9370.getClass(), "next", null);
        setIntField(term9370, term9370.getClass(), "type", 0);
        setIntField(term9370, term9370.getClass(), "intValue", 0);
        setField(term9370, term9370.getClass(), "objectValue", null);
        setField(term9366, term9366.getClass(), "propListHead", term9370);
        setIntField(term9366, term9366.getClass(), "sourcePosition", -2013924238);
        setField(term9366, term9366.getClass(), "jsType", null);
        setField(term9366, term9366.getClass(), "parent", null);
        setField(term9365, term9365.getClass(), "next", term9366);
        setIntField(term9371, term9371.getClass(), "type", 0);
        setField(term9371, term9371.getClass(), "next", null);
        setField(term9371, term9371.getClass(), "first", null);
        setField(term9371, term9371.getClass(), "last", null);
        setField(term9371, term9371.getClass(), "propListHead", null);
        setIntField(term9371, term9371.getClass(), "sourcePosition", 0);
        setField(term9371, term9371.getClass(), "jsType", null);
        setField(term9371, term9371.getClass(), "parent", null);
        setField(term9365, term9365.getClass(), "first", term9371);
        setIntField(term9372, term9372.getClass(), "type", 0);
        setField(term9372, term9372.getClass(), "next", null);
        setField(term9372, term9372.getClass(), "first", null);
        setField(term9372, term9372.getClass(), "last", null);
        setField(term9372, term9372.getClass(), "propListHead", null);
        setIntField(term9372, term9372.getClass(), "sourcePosition", 0);
        setField(term9372, term9372.getClass(), "jsType", null);
        setField(term9372, term9372.getClass(), "parent", null);
        setField(term9365, term9365.getClass(), "last", term9372);
        setField(term9373, term9373.getClass(), "next", null);
        setIntField(term9373, term9373.getClass(), "type", 0);
        setIntField(term9373, term9373.getClass(), "intValue", 0);
        setField(term9373, term9373.getClass(), "objectValue", null);
        setField(term9365, term9365.getClass(), "propListHead", term9373);
        setIntField(term9365, term9365.getClass(), "sourcePosition", 579006268);
        setField(term9365, term9365.getClass(), "jsType", null);
        setField(term9365, term9365.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term752;
        callMethod(klass, "nodeTypeMayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term752, term9365));
    }

};


