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

public class TypeInference_traverseGetElem_100203513367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term764288;
     Object term764358;

    public TypeInference_traverseGetElem_100203513367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term764288 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term764358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term764428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term764498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term764568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term764638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term764708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term764778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term764848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term764918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term764988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term765058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term765128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term765198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term765268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term765338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term765408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term765478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term765548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term765618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term765688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term765758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term765828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term765898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term765968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term766038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term766108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term766178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term766248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term764428, term764428.getClass(), "type", 98);
        setField(term764498, term764498.getClass(), "next", null);
        setIntField(term764498, term764498.getClass(), "type", 98);
        setField(term764568, term764568.getClass(), "next", null);
        setIntField(term764568, term764568.getClass(), "type", 98);
        setField(term764638, term764638.getClass(), "next", null);
        setIntField(term764638, term764638.getClass(), "type", 98);
        setField(term764708, term764708.getClass(), "next", null);
        setIntField(term764708, term764708.getClass(), "type", 98);
        setField(term764778, term764778.getClass(), "next", null);
        setIntField(term764778, term764778.getClass(), "type", 98);
        setField(term764848, term764848.getClass(), "next", null);
        setIntField(term764848, term764848.getClass(), "type", 98);
        setField(term764918, term764918.getClass(), "next", null);
        setIntField(term764918, term764918.getClass(), "type", 98);
        setField(term764988, term764988.getClass(), "next", null);
        setIntField(term764988, term764988.getClass(), "type", 98);
        setField(term765058, term765058.getClass(), "next", null);
        setIntField(term765058, term765058.getClass(), "type", 98);
        setField(term765128, term765128.getClass(), "next", null);
        setIntField(term765128, term765128.getClass(), "type", 98);
        setField(term765198, term765198.getClass(), "next", null);
        setIntField(term765198, term765198.getClass(), "type", 98);
        setField(term765268, term765268.getClass(), "next", null);
        setIntField(term765268, term765268.getClass(), "type", 98);
        setField(term765338, term765338.getClass(), "next", null);
        setIntField(term765338, term765338.getClass(), "type", 98);
        setField(term765408, term765408.getClass(), "next", null);
        setIntField(term765408, term765408.getClass(), "type", 98);
        setField(term765478, term765478.getClass(), "next", null);
        setIntField(term765478, term765478.getClass(), "type", 98);
        setField(term765548, term765548.getClass(), "next", null);
        setIntField(term765548, term765548.getClass(), "type", 98);
        setField(term765618, term765618.getClass(), "next", null);
        setIntField(term765618, term765618.getClass(), "type", 98);
        setField(term765688, term765688.getClass(), "next", null);
        setIntField(term765688, term765688.getClass(), "type", 98);
        setField(term765758, term765758.getClass(), "next", null);
        setIntField(term765758, term765758.getClass(), "type", 98);
        setField(term765828, term765828.getClass(), "next", null);
        setIntField(term765828, term765828.getClass(), "type", 98);
        setField(term765898, term765898.getClass(), "next", null);
        setIntField(term765898, term765898.getClass(), "type", 98);
        setField(term765968, term765968.getClass(), "next", null);
        setIntField(term765968, term765968.getClass(), "type", 98);
        setField(term766038, term766038.getClass(), "next", null);
        setIntField(term766038, term766038.getClass(), "type", 98);
        setField(term766108, term766108.getClass(), "next", null);
        setIntField(term766108, term766108.getClass(), "type", 98);
        setField(term766178, term766178.getClass(), "next", null);
        setIntField(term766178, term766178.getClass(), "type", 98);
        setField(term766248, term766248.getClass(), "next", null);
        setIntField(term766248, term766248.getClass(), "type", 44);
        setField(term766178, term766178.getClass(), "first", term766248);
        setField(term766178, term766178.getClass(), "last", null);
        setField(term766108, term766108.getClass(), "first", term766178);
        setField(term766108, term766108.getClass(), "last", null);
        setField(term766038, term766038.getClass(), "first", term766108);
        setField(term766038, term766038.getClass(), "last", null);
        setField(term765968, term765968.getClass(), "first", term766038);
        setField(term765968, term765968.getClass(), "last", null);
        setField(term765898, term765898.getClass(), "first", term765968);
        setField(term765898, term765898.getClass(), "last", null);
        setField(term765828, term765828.getClass(), "first", term765898);
        setField(term765828, term765828.getClass(), "last", null);
        setField(term765758, term765758.getClass(), "first", term765828);
        setField(term765758, term765758.getClass(), "last", null);
        setField(term765688, term765688.getClass(), "first", term765758);
        setField(term765688, term765688.getClass(), "last", null);
        setField(term765618, term765618.getClass(), "first", term765688);
        setField(term765618, term765618.getClass(), "last", null);
        setField(term765548, term765548.getClass(), "first", term765618);
        setField(term765548, term765548.getClass(), "last", null);
        setField(term765478, term765478.getClass(), "first", term765548);
        setField(term765478, term765478.getClass(), "last", null);
        setField(term765408, term765408.getClass(), "first", term765478);
        setField(term765408, term765408.getClass(), "last", null);
        setField(term765338, term765338.getClass(), "first", term765408);
        setField(term765338, term765338.getClass(), "last", null);
        setField(term765268, term765268.getClass(), "first", term765338);
        setField(term765268, term765268.getClass(), "last", null);
        setField(term765198, term765198.getClass(), "first", term765268);
        setField(term765198, term765198.getClass(), "last", null);
        setField(term765128, term765128.getClass(), "first", term765198);
        setField(term765128, term765128.getClass(), "last", null);
        setField(term765058, term765058.getClass(), "first", term765128);
        setField(term765058, term765058.getClass(), "last", null);
        setField(term764988, term764988.getClass(), "first", term765058);
        setField(term764988, term764988.getClass(), "last", null);
        setField(term764918, term764918.getClass(), "first", term764988);
        setField(term764918, term764918.getClass(), "last", null);
        setField(term764848, term764848.getClass(), "first", term764918);
        setField(term764848, term764848.getClass(), "last", null);
        setField(term764778, term764778.getClass(), "first", term764848);
        setField(term764778, term764778.getClass(), "last", null);
        setField(term764708, term764708.getClass(), "first", term764778);
        setField(term764708, term764708.getClass(), "last", null);
        setField(term764638, term764638.getClass(), "first", term764708);
        setField(term764638, term764638.getClass(), "last", null);
        setField(term764568, term764568.getClass(), "first", term764638);
        setField(term764568, term764568.getClass(), "last", null);
        setField(term764498, term764498.getClass(), "first", term764568);
        setField(term764498, term764498.getClass(), "last", null);
        setField(term764428, term764428.getClass(), "first", term764498);
        setField(term764428, term764428.getClass(), "last", null);
        setField(term764358, term764358.getClass(), "first", term764428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term764358;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term764288, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


