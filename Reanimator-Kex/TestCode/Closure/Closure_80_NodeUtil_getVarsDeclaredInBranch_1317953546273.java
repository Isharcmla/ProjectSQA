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
     Object term20717;
     Object term20710;

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
        term20717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20722 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term20723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20725 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term20717, term20717.getClass(), "type", 548468113);
        setIntField(term20718, term20718.getClass(), "type", 1253334988);
        setIntField(term20719, term20719.getClass(), "type", 0);
        setField(term20719, term20719.getClass(), "next", null);
        setField(term20719, term20719.getClass(), "first", null);
        setField(term20719, term20719.getClass(), "last", null);
        setField(term20719, term20719.getClass(), "propListHead", null);
        setIntField(term20719, term20719.getClass(), "sourcePosition", 0);
        setField(term20719, term20719.getClass(), "jsType", null);
        setField(term20719, term20719.getClass(), "parent", null);
        setField(term20718, term20718.getClass(), "next", term20719);
        setIntField(term20720, term20720.getClass(), "type", 0);
        setField(term20720, term20720.getClass(), "next", null);
        setField(term20720, term20720.getClass(), "first", null);
        setField(term20720, term20720.getClass(), "last", null);
        setField(term20720, term20720.getClass(), "propListHead", null);
        setIntField(term20720, term20720.getClass(), "sourcePosition", 0);
        setField(term20720, term20720.getClass(), "jsType", null);
        setField(term20720, term20720.getClass(), "parent", null);
        setField(term20718, term20718.getClass(), "first", term20720);
        setIntField(term20721, term20721.getClass(), "type", 0);
        setField(term20721, term20721.getClass(), "next", null);
        setField(term20721, term20721.getClass(), "first", null);
        setField(term20721, term20721.getClass(), "last", null);
        setField(term20721, term20721.getClass(), "propListHead", null);
        setIntField(term20721, term20721.getClass(), "sourcePosition", 0);
        setField(term20721, term20721.getClass(), "jsType", null);
        setField(term20721, term20721.getClass(), "parent", null);
        setField(term20718, term20718.getClass(), "last", term20721);
        setField(term20722, term20722.getClass(), "next", null);
        setIntField(term20722, term20722.getClass(), "type", 0);
        setIntField(term20722, term20722.getClass(), "intValue", 0);
        setField(term20722, term20722.getClass(), "objectValue", null);
        setField(term20718, term20718.getClass(), "propListHead", term20722);
        setIntField(term20718, term20718.getClass(), "sourcePosition", 90996421);
        setField(term20718, term20718.getClass(), "jsType", null);
        setField(term20718, term20718.getClass(), "parent", null);
        setField(term20717, term20717.getClass(), "next", term20718);
        setIntField(term20723, term20723.getClass(), "type", 0);
        setField(term20723, term20723.getClass(), "next", null);
        setField(term20723, term20723.getClass(), "first", null);
        setField(term20723, term20723.getClass(), "last", null);
        setField(term20723, term20723.getClass(), "propListHead", null);
        setIntField(term20723, term20723.getClass(), "sourcePosition", 0);
        setField(term20723, term20723.getClass(), "jsType", null);
        setField(term20723, term20723.getClass(), "parent", null);
        setField(term20717, term20717.getClass(), "first", term20723);
        setIntField(term20724, term20724.getClass(), "type", 0);
        setField(term20724, term20724.getClass(), "next", null);
        setField(term20724, term20724.getClass(), "first", null);
        setField(term20724, term20724.getClass(), "last", null);
        setField(term20724, term20724.getClass(), "propListHead", null);
        setIntField(term20724, term20724.getClass(), "sourcePosition", 0);
        setField(term20724, term20724.getClass(), "jsType", null);
        setField(term20724, term20724.getClass(), "parent", null);
        setField(term20717, term20717.getClass(), "last", term20724);
        setField(term20725, term20725.getClass(), "next", null);
        setIntField(term20725, term20725.getClass(), "type", 0);
        setIntField(term20725, term20725.getClass(), "intValue", 0);
        setField(term20725, term20725.getClass(), "objectValue", null);
        setField(term20717, term20717.getClass(), "propListHead", term20725);
        setIntField(term20717, term20717.getClass(), "sourcePosition", -1805802783);
        setField(term20717, term20717.getClass(), "jsType", null);
        setField(term20717, term20717.getClass(), "parent", null);
        LinkedHashMap term20711 = new LinkedHashMap();
        term20710 = newInstance(Class.forName("java.util.LinkedHashMap$LinkedValues"));
        setField(term20710, term20710.getClass(), "this$0", term20711);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3503;
        Object retValue = callMethod(klass, "getVarsDeclaredInBranch", argTypes, null, args);
        assertTrue(recursiveEquals(term3503, term20717));
        assertTrue(recursiveEquals(retValue, term20710));
    }

};


