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

public class NodeUtil_getCount_725644382223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3193;

    public NodeUtil_getCount_725644382223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3206 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3216 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3193, term3193.getClass(), "type", -2077814162);
        setIntField(term3195, term3195.getClass(), "type", 961252909);
        setIntField(term3197, term3197.getClass(), "type", 0);
        setField(term3197, term3197.getClass(), "next", null);
        setField(term3197, term3197.getClass(), "first", null);
        setField(term3197, term3197.getClass(), "last", null);
        setField(term3197, term3197.getClass(), "propListHead", null);
        setIntField(term3197, term3197.getClass(), "sourcePosition", 0);
        setField(term3197, term3197.getClass(), "jsType", null);
        setField(term3197, term3197.getClass(), "parent", null);
        setField(term3195, term3195.getClass(), "next", term3197);
        setIntField(term3200, term3200.getClass(), "type", 0);
        setField(term3200, term3200.getClass(), "next", null);
        setField(term3200, term3200.getClass(), "first", null);
        setField(term3200, term3200.getClass(), "last", null);
        setField(term3200, term3200.getClass(), "propListHead", null);
        setIntField(term3200, term3200.getClass(), "sourcePosition", 0);
        setField(term3200, term3200.getClass(), "jsType", null);
        setField(term3200, term3200.getClass(), "parent", null);
        setField(term3195, term3195.getClass(), "first", term3200);
        setIntField(term3203, term3203.getClass(), "type", 0);
        setField(term3203, term3203.getClass(), "next", null);
        setField(term3203, term3203.getClass(), "first", null);
        setField(term3203, term3203.getClass(), "last", null);
        setField(term3203, term3203.getClass(), "propListHead", null);
        setIntField(term3203, term3203.getClass(), "sourcePosition", 0);
        setField(term3203, term3203.getClass(), "jsType", null);
        setField(term3203, term3203.getClass(), "parent", null);
        setField(term3195, term3195.getClass(), "last", term3203);
        setField(term3206, term3206.getClass(), "next", null);
        setIntField(term3206, term3206.getClass(), "type", 0);
        setIntField(term3206, term3206.getClass(), "intValue", 0);
        setField(term3206, term3206.getClass(), "objectValue", null);
        setField(term3195, term3195.getClass(), "propListHead", term3206);
        setIntField(term3195, term3195.getClass(), "sourcePosition", 923905351);
        setField(term3195, term3195.getClass(), "jsType", null);
        setField(term3195, term3195.getClass(), "parent", null);
        setField(term3193, term3193.getClass(), "next", term3195);
        setIntField(term3210, term3210.getClass(), "type", 0);
        setField(term3210, term3210.getClass(), "next", null);
        setField(term3210, term3210.getClass(), "first", null);
        setField(term3210, term3210.getClass(), "last", null);
        setField(term3210, term3210.getClass(), "propListHead", null);
        setIntField(term3210, term3210.getClass(), "sourcePosition", 0);
        setField(term3210, term3210.getClass(), "jsType", null);
        setField(term3210, term3210.getClass(), "parent", null);
        setField(term3193, term3193.getClass(), "first", term3210);
        setIntField(term3213, term3213.getClass(), "type", 0);
        setField(term3213, term3213.getClass(), "next", null);
        setField(term3213, term3213.getClass(), "first", null);
        setField(term3213, term3213.getClass(), "last", null);
        setField(term3213, term3213.getClass(), "propListHead", null);
        setIntField(term3213, term3213.getClass(), "sourcePosition", 0);
        setField(term3213, term3213.getClass(), "jsType", null);
        setField(term3213, term3213.getClass(), "parent", null);
        setField(term3193, term3193.getClass(), "last", term3213);
        setField(term3216, term3216.getClass(), "next", null);
        setIntField(term3216, term3216.getClass(), "type", 0);
        setIntField(term3216, term3216.getClass(), "intValue", 0);
        setField(term3216, term3216.getClass(), "objectValue", null);
        setField(term3193, term3193.getClass(), "propListHead", term3216);
        setIntField(term3193, term3193.getClass(), "sourcePosition", 428360161);
        setField(term3193, term3193.getClass(), "jsType", null);
        setField(term3193, term3193.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.common.base.Predicate");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term3193;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "getCount", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


