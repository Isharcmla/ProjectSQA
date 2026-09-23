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
import java.util.LinkedHashMap;

public class NodeUtil_getVarsDeclaredInBranch_1317953546273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3503;
     Object term20764;
     Object term20757;

    public NodeUtil_getVarsDeclaredInBranch_1317953546273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3503 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3505 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3510 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3516 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3526 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3503, term3503.getClass(), "type", 548468113);
        setIntField(term3505, term3505.getClass(), "type", 1253334988);
        setIntField(term3507, term3507.getClass(), "type", 0);
        setField(term3507, term3507.getClass(), "next", null);
        setField(term3507, term3507.getClass(), "first", null);
        setField(term3507, term3507.getClass(), "last", null);
        setField(term3507, term3507.getClass(), "propListHead", null);
        setIntField(term3507, term3507.getClass(), "sourcePosition", 0);
        setField(term3507, term3507.getClass(), "jsType", null);
        setField(term3507, term3507.getClass(), "parent", null);
        setField(term3505, term3505.getClass(), "next", term3507);
        setIntField(term3510, term3510.getClass(), "type", 0);
        setField(term3510, term3510.getClass(), "next", null);
        setField(term3510, term3510.getClass(), "first", null);
        setField(term3510, term3510.getClass(), "last", null);
        setField(term3510, term3510.getClass(), "propListHead", null);
        setIntField(term3510, term3510.getClass(), "sourcePosition", 0);
        setField(term3510, term3510.getClass(), "jsType", null);
        setField(term3510, term3510.getClass(), "parent", null);
        setField(term3505, term3505.getClass(), "first", term3510);
        setIntField(term3513, term3513.getClass(), "type", 0);
        setField(term3513, term3513.getClass(), "next", null);
        setField(term3513, term3513.getClass(), "first", null);
        setField(term3513, term3513.getClass(), "last", null);
        setField(term3513, term3513.getClass(), "propListHead", null);
        setIntField(term3513, term3513.getClass(), "sourcePosition", 0);
        setField(term3513, term3513.getClass(), "jsType", null);
        setField(term3513, term3513.getClass(), "parent", null);
        setField(term3505, term3505.getClass(), "last", term3513);
        setField(term3516, term3516.getClass(), "next", null);
        setIntField(term3516, term3516.getClass(), "type", 0);
        setIntField(term3516, term3516.getClass(), "intValue", 0);
        setField(term3516, term3516.getClass(), "objectValue", null);
        setField(term3505, term3505.getClass(), "propListHead", term3516);
        setIntField(term3505, term3505.getClass(), "sourcePosition", 90996421);
        setField(term3505, term3505.getClass(), "jsType", null);
        setField(term3505, term3505.getClass(), "parent", null);
        setField(term3503, term3503.getClass(), "next", term3505);
        setIntField(term3520, term3520.getClass(), "type", 0);
        setField(term3520, term3520.getClass(), "next", null);
        setField(term3520, term3520.getClass(), "first", null);
        setField(term3520, term3520.getClass(), "last", null);
        setField(term3520, term3520.getClass(), "propListHead", null);
        setIntField(term3520, term3520.getClass(), "sourcePosition", 0);
        setField(term3520, term3520.getClass(), "jsType", null);
        setField(term3520, term3520.getClass(), "parent", null);
        setField(term3503, term3503.getClass(), "first", term3520);
        setIntField(term3523, term3523.getClass(), "type", 0);
        setField(term3523, term3523.getClass(), "next", null);
        setField(term3523, term3523.getClass(), "first", null);
        setField(term3523, term3523.getClass(), "last", null);
        setField(term3523, term3523.getClass(), "propListHead", null);
        setIntField(term3523, term3523.getClass(), "sourcePosition", 0);
        setField(term3523, term3523.getClass(), "jsType", null);
        setField(term3523, term3523.getClass(), "parent", null);
        setField(term3503, term3503.getClass(), "last", term3523);
        setField(term3526, term3526.getClass(), "next", null);
        setIntField(term3526, term3526.getClass(), "type", 0);
        setIntField(term3526, term3526.getClass(), "intValue", 0);
        setField(term3526, term3526.getClass(), "objectValue", null);
        setField(term3503, term3503.getClass(), "propListHead", term3526);
        setIntField(term3503, term3503.getClass(), "sourcePosition", -1805802783);
        setField(term3503, term3503.getClass(), "jsType", null);
        setField(term3503, term3503.getClass(), "parent", null);
        term20764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20767 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20768 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20769 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term20770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20772 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term20764, term20764.getClass(), "type", 548468113);
        setIntField(term20765, term20765.getClass(), "type", 1253334988);
        setIntField(term20766, term20766.getClass(), "type", 0);
        setField(term20766, term20766.getClass(), "next", null);
        setField(term20766, term20766.getClass(), "first", null);
        setField(term20766, term20766.getClass(), "last", null);
        setField(term20766, term20766.getClass(), "propListHead", null);
        setIntField(term20766, term20766.getClass(), "sourcePosition", 0);
        setField(term20766, term20766.getClass(), "jsType", null);
        setField(term20766, term20766.getClass(), "parent", null);
        setField(term20765, term20765.getClass(), "next", term20766);
        setIntField(term20767, term20767.getClass(), "type", 0);
        setField(term20767, term20767.getClass(), "next", null);
        setField(term20767, term20767.getClass(), "first", null);
        setField(term20767, term20767.getClass(), "last", null);
        setField(term20767, term20767.getClass(), "propListHead", null);
        setIntField(term20767, term20767.getClass(), "sourcePosition", 0);
        setField(term20767, term20767.getClass(), "jsType", null);
        setField(term20767, term20767.getClass(), "parent", null);
        setField(term20765, term20765.getClass(), "first", term20767);
        setIntField(term20768, term20768.getClass(), "type", 0);
        setField(term20768, term20768.getClass(), "next", null);
        setField(term20768, term20768.getClass(), "first", null);
        setField(term20768, term20768.getClass(), "last", null);
        setField(term20768, term20768.getClass(), "propListHead", null);
        setIntField(term20768, term20768.getClass(), "sourcePosition", 0);
        setField(term20768, term20768.getClass(), "jsType", null);
        setField(term20768, term20768.getClass(), "parent", null);
        setField(term20765, term20765.getClass(), "last", term20768);
        setField(term20769, term20769.getClass(), "next", null);
        setIntField(term20769, term20769.getClass(), "type", 0);
        setIntField(term20769, term20769.getClass(), "intValue", 0);
        setField(term20769, term20769.getClass(), "objectValue", null);
        setField(term20765, term20765.getClass(), "propListHead", term20769);
        setIntField(term20765, term20765.getClass(), "sourcePosition", 90996421);
        setField(term20765, term20765.getClass(), "jsType", null);
        setField(term20765, term20765.getClass(), "parent", null);
        setField(term20764, term20764.getClass(), "next", term20765);
        setIntField(term20770, term20770.getClass(), "type", 0);
        setField(term20770, term20770.getClass(), "next", null);
        setField(term20770, term20770.getClass(), "first", null);
        setField(term20770, term20770.getClass(), "last", null);
        setField(term20770, term20770.getClass(), "propListHead", null);
        setIntField(term20770, term20770.getClass(), "sourcePosition", 0);
        setField(term20770, term20770.getClass(), "jsType", null);
        setField(term20770, term20770.getClass(), "parent", null);
        setField(term20764, term20764.getClass(), "first", term20770);
        setIntField(term20771, term20771.getClass(), "type", 0);
        setField(term20771, term20771.getClass(), "next", null);
        setField(term20771, term20771.getClass(), "first", null);
        setField(term20771, term20771.getClass(), "last", null);
        setField(term20771, term20771.getClass(), "propListHead", null);
        setIntField(term20771, term20771.getClass(), "sourcePosition", 0);
        setField(term20771, term20771.getClass(), "jsType", null);
        setField(term20771, term20771.getClass(), "parent", null);
        setField(term20764, term20764.getClass(), "last", term20771);
        setField(term20772, term20772.getClass(), "next", null);
        setIntField(term20772, term20772.getClass(), "type", 0);
        setIntField(term20772, term20772.getClass(), "intValue", 0);
        setField(term20772, term20772.getClass(), "objectValue", null);
        setField(term20764, term20764.getClass(), "propListHead", term20772);
        setIntField(term20764, term20764.getClass(), "sourcePosition", -1805802783);
        setField(term20764, term20764.getClass(), "jsType", null);
        setField(term20764, term20764.getClass(), "parent", null);
        LinkedHashMap term20758 = new LinkedHashMap();
        term20757 = newInstance(Class.forName("java.util.LinkedHashMap$LinkedValues"));
        setField(term20757, term20757.getClass(), "this$0", term20758);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3503;
        Object retValue = callMethod(klass, "getVarsDeclaredInBranch", argTypes, null, args);
        assertTrue(recursiveEquals(term3503, term20764));
        assertTrue(recursiveEquals(retValue, term20757));
    }

};


