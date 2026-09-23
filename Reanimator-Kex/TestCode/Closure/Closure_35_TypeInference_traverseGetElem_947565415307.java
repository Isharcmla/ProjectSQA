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

public class TypeInference_traverseGetElem_947565415307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term750167;
     Object term750237;

    public TypeInference_traverseGetElem_947565415307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term750167 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term750237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term750307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term750377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term750447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term750517 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term750587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term750657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term750727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term750797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term750867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term750937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term751007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term751077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term751147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term751217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term751287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term751357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term751427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term751497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term751567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term751637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term751707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term751777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term751847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term751917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term751987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term752057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term752127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term752197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term750307, term750307.getClass(), "type", 21);
        setField(term750377, term750377.getClass(), "next", null);
        setIntField(term750377, term750377.getClass(), "type", 21);
        setField(term750447, term750447.getClass(), "next", null);
        setIntField(term750447, term750447.getClass(), "type", 21);
        setField(term750517, term750517.getClass(), "next", null);
        setIntField(term750517, term750517.getClass(), "type", 21);
        setField(term750587, term750587.getClass(), "next", null);
        setIntField(term750587, term750587.getClass(), "type", 21);
        setField(term750657, term750657.getClass(), "next", null);
        setIntField(term750657, term750657.getClass(), "type", 21);
        setField(term750727, term750727.getClass(), "next", null);
        setIntField(term750727, term750727.getClass(), "type", 21);
        setField(term750797, term750797.getClass(), "next", null);
        setIntField(term750797, term750797.getClass(), "type", 21);
        setField(term750867, term750867.getClass(), "next", null);
        setIntField(term750867, term750867.getClass(), "type", 21);
        setField(term750937, term750937.getClass(), "next", null);
        setIntField(term750937, term750937.getClass(), "type", 21);
        setField(term751007, term751007.getClass(), "next", null);
        setIntField(term751007, term751007.getClass(), "type", 21);
        setField(term751077, term751077.getClass(), "next", null);
        setIntField(term751077, term751077.getClass(), "type", 21);
        setField(term751147, term751147.getClass(), "next", null);
        setIntField(term751147, term751147.getClass(), "type", 21);
        setField(term751217, term751217.getClass(), "next", null);
        setIntField(term751217, term751217.getClass(), "type", 21);
        setField(term751287, term751287.getClass(), "next", null);
        setIntField(term751287, term751287.getClass(), "type", 21);
        setField(term751357, term751357.getClass(), "next", null);
        setIntField(term751357, term751357.getClass(), "type", 21);
        setField(term751427, term751427.getClass(), "next", null);
        setIntField(term751427, term751427.getClass(), "type", 21);
        setField(term751497, term751497.getClass(), "next", null);
        setIntField(term751497, term751497.getClass(), "type", 21);
        setField(term751567, term751567.getClass(), "next", null);
        setIntField(term751567, term751567.getClass(), "type", 21);
        setField(term751637, term751637.getClass(), "next", null);
        setIntField(term751637, term751637.getClass(), "type", 21);
        setField(term751707, term751707.getClass(), "next", null);
        setIntField(term751707, term751707.getClass(), "type", 21);
        setField(term751777, term751777.getClass(), "next", null);
        setIntField(term751777, term751777.getClass(), "type", 21);
        setField(term751847, term751847.getClass(), "next", null);
        setIntField(term751847, term751847.getClass(), "type", 21);
        setField(term751917, term751917.getClass(), "next", null);
        setIntField(term751917, term751917.getClass(), "type", 21);
        setField(term751987, term751987.getClass(), "next", null);
        setIntField(term751987, term751987.getClass(), "type", 21);
        setField(term752057, term752057.getClass(), "next", null);
        setIntField(term752057, term752057.getClass(), "type", 21);
        setField(term752127, term752127.getClass(), "next", null);
        setIntField(term752127, term752127.getClass(), "type", 21);
        setField(term752197, term752197.getClass(), "next", null);
        setIntField(term752197, term752197.getClass(), "type", 91);
        setField(term752127, term752127.getClass(), "first", term752197);
        setField(term752057, term752057.getClass(), "first", term752127);
        setField(term751987, term751987.getClass(), "first", term752057);
        setField(term751917, term751917.getClass(), "first", term751987);
        setField(term751847, term751847.getClass(), "first", term751917);
        setField(term751777, term751777.getClass(), "first", term751847);
        setField(term751707, term751707.getClass(), "first", term751777);
        setField(term751637, term751637.getClass(), "first", term751707);
        setField(term751567, term751567.getClass(), "first", term751637);
        setField(term751497, term751497.getClass(), "first", term751567);
        setField(term751427, term751427.getClass(), "first", term751497);
        setField(term751357, term751357.getClass(), "first", term751427);
        setField(term751287, term751287.getClass(), "first", term751357);
        setField(term751217, term751217.getClass(), "first", term751287);
        setField(term751147, term751147.getClass(), "first", term751217);
        setField(term751077, term751077.getClass(), "first", term751147);
        setField(term751007, term751007.getClass(), "first", term751077);
        setField(term750937, term750937.getClass(), "first", term751007);
        setField(term750867, term750867.getClass(), "first", term750937);
        setField(term750797, term750797.getClass(), "first", term750867);
        setField(term750727, term750727.getClass(), "first", term750797);
        setField(term750657, term750657.getClass(), "first", term750727);
        setField(term750587, term750587.getClass(), "first", term750657);
        setField(term750517, term750517.getClass(), "first", term750587);
        setField(term750447, term750447.getClass(), "first", term750517);
        setField(term750377, term750377.getClass(), "first", term750447);
        setField(term750307, term750307.getClass(), "first", term750377);
        setField(term750237, term750237.getClass(), "first", term750307);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term750237;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term750167, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


