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
     Object term9659;

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
        term9659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9664 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9667 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term9659, term9659.getClass(), "type", -851097944);
        setIntField(term9660, term9660.getClass(), "type", -1362856620);
        setIntField(term9661, term9661.getClass(), "type", 0);
        setField(term9661, term9661.getClass(), "next", null);
        setField(term9661, term9661.getClass(), "first", null);
        setField(term9661, term9661.getClass(), "last", null);
        setField(term9661, term9661.getClass(), "propListHead", null);
        setIntField(term9661, term9661.getClass(), "sourcePosition", 0);
        setField(term9661, term9661.getClass(), "jsType", null);
        setField(term9661, term9661.getClass(), "parent", null);
        setField(term9660, term9660.getClass(), "next", term9661);
        setIntField(term9662, term9662.getClass(), "type", 0);
        setField(term9662, term9662.getClass(), "next", null);
        setField(term9662, term9662.getClass(), "first", null);
        setField(term9662, term9662.getClass(), "last", null);
        setField(term9662, term9662.getClass(), "propListHead", null);
        setIntField(term9662, term9662.getClass(), "sourcePosition", 0);
        setField(term9662, term9662.getClass(), "jsType", null);
        setField(term9662, term9662.getClass(), "parent", null);
        setField(term9660, term9660.getClass(), "first", term9662);
        setIntField(term9663, term9663.getClass(), "type", 0);
        setField(term9663, term9663.getClass(), "next", null);
        setField(term9663, term9663.getClass(), "first", null);
        setField(term9663, term9663.getClass(), "last", null);
        setField(term9663, term9663.getClass(), "propListHead", null);
        setIntField(term9663, term9663.getClass(), "sourcePosition", 0);
        setField(term9663, term9663.getClass(), "jsType", null);
        setField(term9663, term9663.getClass(), "parent", null);
        setField(term9660, term9660.getClass(), "last", term9663);
        setField(term9664, term9664.getClass(), "next", null);
        setIntField(term9664, term9664.getClass(), "type", 0);
        setIntField(term9664, term9664.getClass(), "intValue", 0);
        setField(term9664, term9664.getClass(), "objectValue", null);
        setField(term9660, term9660.getClass(), "propListHead", term9664);
        setIntField(term9660, term9660.getClass(), "sourcePosition", -2013924238);
        setField(term9660, term9660.getClass(), "jsType", null);
        setField(term9660, term9660.getClass(), "parent", null);
        setField(term9659, term9659.getClass(), "next", term9660);
        setIntField(term9665, term9665.getClass(), "type", 0);
        setField(term9665, term9665.getClass(), "next", null);
        setField(term9665, term9665.getClass(), "first", null);
        setField(term9665, term9665.getClass(), "last", null);
        setField(term9665, term9665.getClass(), "propListHead", null);
        setIntField(term9665, term9665.getClass(), "sourcePosition", 0);
        setField(term9665, term9665.getClass(), "jsType", null);
        setField(term9665, term9665.getClass(), "parent", null);
        setField(term9659, term9659.getClass(), "first", term9665);
        setIntField(term9666, term9666.getClass(), "type", 0);
        setField(term9666, term9666.getClass(), "next", null);
        setField(term9666, term9666.getClass(), "first", null);
        setField(term9666, term9666.getClass(), "last", null);
        setField(term9666, term9666.getClass(), "propListHead", null);
        setIntField(term9666, term9666.getClass(), "sourcePosition", 0);
        setField(term9666, term9666.getClass(), "jsType", null);
        setField(term9666, term9666.getClass(), "parent", null);
        setField(term9659, term9659.getClass(), "last", term9666);
        setField(term9667, term9667.getClass(), "next", null);
        setIntField(term9667, term9667.getClass(), "type", 0);
        setIntField(term9667, term9667.getClass(), "intValue", 0);
        setField(term9667, term9667.getClass(), "objectValue", null);
        setField(term9659, term9659.getClass(), "propListHead", term9667);
        setIntField(term9659, term9659.getClass(), "sourcePosition", 579006268);
        setField(term9659, term9659.getClass(), "jsType", null);
        setField(term9659, term9659.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term752;
        callMethod(klass, "nodeTypeMayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term752, term9659));
    }

};


