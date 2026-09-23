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
import java.lang.Integer;

public class NodeUtil_isNodeTypeReferenced_348577236193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2693;
     Object term2720;
     Object term14143;

    public NodeUtil_isNodeTypeReferenced_348577236193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2706 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2716 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2693, term2693.getClass(), "type", 1670041824);
        setIntField(term2695, term2695.getClass(), "type", -1271598018);
        setIntField(term2697, term2697.getClass(), "type", 0);
        setField(term2697, term2697.getClass(), "next", null);
        setField(term2697, term2697.getClass(), "first", null);
        setField(term2697, term2697.getClass(), "last", null);
        setField(term2697, term2697.getClass(), "propListHead", null);
        setIntField(term2697, term2697.getClass(), "sourcePosition", 0);
        setField(term2697, term2697.getClass(), "jsType", null);
        setField(term2697, term2697.getClass(), "parent", null);
        setField(term2695, term2695.getClass(), "next", term2697);
        setIntField(term2700, term2700.getClass(), "type", 0);
        setField(term2700, term2700.getClass(), "next", null);
        setField(term2700, term2700.getClass(), "first", null);
        setField(term2700, term2700.getClass(), "last", null);
        setField(term2700, term2700.getClass(), "propListHead", null);
        setIntField(term2700, term2700.getClass(), "sourcePosition", 0);
        setField(term2700, term2700.getClass(), "jsType", null);
        setField(term2700, term2700.getClass(), "parent", null);
        setField(term2695, term2695.getClass(), "first", term2700);
        setIntField(term2703, term2703.getClass(), "type", 0);
        setField(term2703, term2703.getClass(), "next", null);
        setField(term2703, term2703.getClass(), "first", null);
        setField(term2703, term2703.getClass(), "last", null);
        setField(term2703, term2703.getClass(), "propListHead", null);
        setIntField(term2703, term2703.getClass(), "sourcePosition", 0);
        setField(term2703, term2703.getClass(), "jsType", null);
        setField(term2703, term2703.getClass(), "parent", null);
        setField(term2695, term2695.getClass(), "last", term2703);
        setField(term2706, term2706.getClass(), "next", null);
        setIntField(term2706, term2706.getClass(), "type", 0);
        setIntField(term2706, term2706.getClass(), "intValue", 0);
        setField(term2706, term2706.getClass(), "objectValue", null);
        setField(term2695, term2695.getClass(), "propListHead", term2706);
        setIntField(term2695, term2695.getClass(), "sourcePosition", 593962063);
        setField(term2695, term2695.getClass(), "jsType", null);
        setField(term2695, term2695.getClass(), "parent", null);
        setField(term2693, term2693.getClass(), "next", term2695);
        setIntField(term2710, term2710.getClass(), "type", 0);
        setField(term2710, term2710.getClass(), "next", null);
        setField(term2710, term2710.getClass(), "first", null);
        setField(term2710, term2710.getClass(), "last", null);
        setField(term2710, term2710.getClass(), "propListHead", null);
        setIntField(term2710, term2710.getClass(), "sourcePosition", 0);
        setField(term2710, term2710.getClass(), "jsType", null);
        setField(term2710, term2710.getClass(), "parent", null);
        setField(term2693, term2693.getClass(), "first", term2710);
        setIntField(term2713, term2713.getClass(), "type", 0);
        setField(term2713, term2713.getClass(), "next", null);
        setField(term2713, term2713.getClass(), "first", null);
        setField(term2713, term2713.getClass(), "last", null);
        setField(term2713, term2713.getClass(), "propListHead", null);
        setIntField(term2713, term2713.getClass(), "sourcePosition", 0);
        setField(term2713, term2713.getClass(), "jsType", null);
        setField(term2713, term2713.getClass(), "parent", null);
        setField(term2693, term2693.getClass(), "last", term2713);
        setField(term2716, term2716.getClass(), "next", null);
        setIntField(term2716, term2716.getClass(), "type", 0);
        setIntField(term2716, term2716.getClass(), "intValue", 0);
        setField(term2716, term2716.getClass(), "objectValue", null);
        setField(term2693, term2693.getClass(), "propListHead", term2716);
        setIntField(term2693, term2693.getClass(), "sourcePosition", -1485826786);
        setField(term2693, term2693.getClass(), "jsType", null);
        setField(term2693, term2693.getClass(), "parent", null);
        term2720 = new Integer(-1549952664);
        term14143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14148 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term14149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14150 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14151 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term14143, term14143.getClass(), "type", 1670041824);
        setIntField(term14144, term14144.getClass(), "type", -1271598018);
        setIntField(term14145, term14145.getClass(), "type", 0);
        setField(term14145, term14145.getClass(), "next", null);
        setField(term14145, term14145.getClass(), "first", null);
        setField(term14145, term14145.getClass(), "last", null);
        setField(term14145, term14145.getClass(), "propListHead", null);
        setIntField(term14145, term14145.getClass(), "sourcePosition", 0);
        setField(term14145, term14145.getClass(), "jsType", null);
        setField(term14145, term14145.getClass(), "parent", null);
        setField(term14144, term14144.getClass(), "next", term14145);
        setIntField(term14146, term14146.getClass(), "type", 0);
        setField(term14146, term14146.getClass(), "next", null);
        setField(term14146, term14146.getClass(), "first", null);
        setField(term14146, term14146.getClass(), "last", null);
        setField(term14146, term14146.getClass(), "propListHead", null);
        setIntField(term14146, term14146.getClass(), "sourcePosition", 0);
        setField(term14146, term14146.getClass(), "jsType", null);
        setField(term14146, term14146.getClass(), "parent", null);
        setField(term14144, term14144.getClass(), "first", term14146);
        setIntField(term14147, term14147.getClass(), "type", 0);
        setField(term14147, term14147.getClass(), "next", null);
        setField(term14147, term14147.getClass(), "first", null);
        setField(term14147, term14147.getClass(), "last", null);
        setField(term14147, term14147.getClass(), "propListHead", null);
        setIntField(term14147, term14147.getClass(), "sourcePosition", 0);
        setField(term14147, term14147.getClass(), "jsType", null);
        setField(term14147, term14147.getClass(), "parent", null);
        setField(term14144, term14144.getClass(), "last", term14147);
        setField(term14148, term14148.getClass(), "next", null);
        setIntField(term14148, term14148.getClass(), "type", 0);
        setIntField(term14148, term14148.getClass(), "intValue", 0);
        setField(term14148, term14148.getClass(), "objectValue", null);
        setField(term14144, term14144.getClass(), "propListHead", term14148);
        setIntField(term14144, term14144.getClass(), "sourcePosition", 593962063);
        setField(term14144, term14144.getClass(), "jsType", null);
        setField(term14144, term14144.getClass(), "parent", null);
        setField(term14143, term14143.getClass(), "next", term14144);
        setIntField(term14149, term14149.getClass(), "type", 0);
        setField(term14149, term14149.getClass(), "next", null);
        setField(term14149, term14149.getClass(), "first", null);
        setField(term14149, term14149.getClass(), "last", null);
        setField(term14149, term14149.getClass(), "propListHead", null);
        setIntField(term14149, term14149.getClass(), "sourcePosition", 0);
        setField(term14149, term14149.getClass(), "jsType", null);
        setField(term14149, term14149.getClass(), "parent", null);
        setField(term14143, term14143.getClass(), "first", term14149);
        setIntField(term14150, term14150.getClass(), "type", 0);
        setField(term14150, term14150.getClass(), "next", null);
        setField(term14150, term14150.getClass(), "first", null);
        setField(term14150, term14150.getClass(), "last", null);
        setField(term14150, term14150.getClass(), "propListHead", null);
        setIntField(term14150, term14150.getClass(), "sourcePosition", 0);
        setField(term14150, term14150.getClass(), "jsType", null);
        setField(term14150, term14150.getClass(), "parent", null);
        setField(term14143, term14143.getClass(), "last", term14150);
        setField(term14151, term14151.getClass(), "next", null);
        setIntField(term14151, term14151.getClass(), "type", 0);
        setIntField(term14151, term14151.getClass(), "intValue", 0);
        setField(term14151, term14151.getClass(), "objectValue", null);
        setField(term14143, term14143.getClass(), "propListHead", term14151);
        setIntField(term14143, term14143.getClass(), "sourcePosition", -1485826786);
        setField(term14143, term14143.getClass(), "jsType", null);
        setField(term14143, term14143.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2693;
        args[1] = term2720;
        callMethod(klass, "isNodeTypeReferenced", argTypes, null, args);
        assertTrue(recursiveEquals(term2693, -1549952664));
        assertTrue(recursiveEquals(term2720, term14143));
    }

};


