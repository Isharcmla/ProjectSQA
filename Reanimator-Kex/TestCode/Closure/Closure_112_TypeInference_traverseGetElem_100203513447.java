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

public class TypeInference_traverseGetElem_100203513447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1596503;
     Object term1596573;

    public TypeInference_traverseGetElem_100203513447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1596503 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1596573 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1596643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1596713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1596783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1596853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1596923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1596993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1597063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1597133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1597203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1597273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1597343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1597413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1597483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1597553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1597623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1597693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1597763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1597833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1597903 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1597973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1598043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1598113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1598183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1598253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1598323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1598393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1598463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1596643, term1596643.getClass(), "type", 98);
        setField(term1596713, term1596713.getClass(), "next", null);
        setIntField(term1596713, term1596713.getClass(), "type", 98);
        setField(term1596783, term1596783.getClass(), "next", null);
        setIntField(term1596783, term1596783.getClass(), "type", 98);
        setField(term1596853, term1596853.getClass(), "next", null);
        setIntField(term1596853, term1596853.getClass(), "type", 98);
        setField(term1596923, term1596923.getClass(), "next", null);
        setIntField(term1596923, term1596923.getClass(), "type", 98);
        setField(term1596993, term1596993.getClass(), "next", null);
        setIntField(term1596993, term1596993.getClass(), "type", 98);
        setField(term1597063, term1597063.getClass(), "next", null);
        setIntField(term1597063, term1597063.getClass(), "type", 98);
        setField(term1597133, term1597133.getClass(), "next", null);
        setIntField(term1597133, term1597133.getClass(), "type", 98);
        setField(term1597203, term1597203.getClass(), "next", null);
        setIntField(term1597203, term1597203.getClass(), "type", 98);
        setField(term1597273, term1597273.getClass(), "next", null);
        setIntField(term1597273, term1597273.getClass(), "type", 98);
        setField(term1597343, term1597343.getClass(), "next", null);
        setIntField(term1597343, term1597343.getClass(), "type", 98);
        setField(term1597413, term1597413.getClass(), "next", null);
        setIntField(term1597413, term1597413.getClass(), "type", 98);
        setField(term1597483, term1597483.getClass(), "next", null);
        setIntField(term1597483, term1597483.getClass(), "type", 98);
        setField(term1597553, term1597553.getClass(), "next", null);
        setIntField(term1597553, term1597553.getClass(), "type", 98);
        setField(term1597623, term1597623.getClass(), "next", null);
        setIntField(term1597623, term1597623.getClass(), "type", 98);
        setField(term1597693, term1597693.getClass(), "next", null);
        setIntField(term1597693, term1597693.getClass(), "type", 98);
        setField(term1597763, term1597763.getClass(), "next", null);
        setIntField(term1597763, term1597763.getClass(), "type", 98);
        setField(term1597833, term1597833.getClass(), "next", null);
        setIntField(term1597833, term1597833.getClass(), "type", 98);
        setField(term1597903, term1597903.getClass(), "next", null);
        setIntField(term1597903, term1597903.getClass(), "type", 98);
        setField(term1597973, term1597973.getClass(), "next", null);
        setIntField(term1597973, term1597973.getClass(), "type", 98);
        setField(term1598043, term1598043.getClass(), "next", null);
        setIntField(term1598043, term1598043.getClass(), "type", 98);
        setField(term1598113, term1598113.getClass(), "next", null);
        setIntField(term1598113, term1598113.getClass(), "type", 98);
        setField(term1598183, term1598183.getClass(), "next", null);
        setIntField(term1598183, term1598183.getClass(), "type", 98);
        setField(term1598253, term1598253.getClass(), "next", null);
        setIntField(term1598253, term1598253.getClass(), "type", 98);
        setField(term1598323, term1598323.getClass(), "next", null);
        setIntField(term1598323, term1598323.getClass(), "type", 98);
        setField(term1598393, term1598393.getClass(), "next", null);
        setIntField(term1598393, term1598393.getClass(), "type", 98);
        setField(term1598463, term1598463.getClass(), "next", null);
        setIntField(term1598463, term1598463.getClass(), "type", 75);
        setField(term1598393, term1598393.getClass(), "first", term1598463);
        setField(term1598393, term1598393.getClass(), "last", null);
        setField(term1598323, term1598323.getClass(), "first", term1598393);
        setField(term1598323, term1598323.getClass(), "last", null);
        setField(term1598253, term1598253.getClass(), "first", term1598323);
        setField(term1598253, term1598253.getClass(), "last", null);
        setField(term1598183, term1598183.getClass(), "first", term1598253);
        setField(term1598183, term1598183.getClass(), "last", null);
        setField(term1598113, term1598113.getClass(), "first", term1598183);
        setField(term1598113, term1598113.getClass(), "last", null);
        setField(term1598043, term1598043.getClass(), "first", term1598113);
        setField(term1598043, term1598043.getClass(), "last", null);
        setField(term1597973, term1597973.getClass(), "first", term1598043);
        setField(term1597973, term1597973.getClass(), "last", null);
        setField(term1597903, term1597903.getClass(), "first", term1597973);
        setField(term1597903, term1597903.getClass(), "last", null);
        setField(term1597833, term1597833.getClass(), "first", term1597903);
        setField(term1597833, term1597833.getClass(), "last", null);
        setField(term1597763, term1597763.getClass(), "first", term1597833);
        setField(term1597763, term1597763.getClass(), "last", null);
        setField(term1597693, term1597693.getClass(), "first", term1597763);
        setField(term1597693, term1597693.getClass(), "last", null);
        setField(term1597623, term1597623.getClass(), "first", term1597693);
        setField(term1597623, term1597623.getClass(), "last", null);
        setField(term1597553, term1597553.getClass(), "first", term1597623);
        setField(term1597553, term1597553.getClass(), "last", null);
        setField(term1597483, term1597483.getClass(), "first", term1597553);
        setField(term1597483, term1597483.getClass(), "last", null);
        setField(term1597413, term1597413.getClass(), "first", term1597483);
        setField(term1597413, term1597413.getClass(), "last", null);
        setField(term1597343, term1597343.getClass(), "first", term1597413);
        setField(term1597343, term1597343.getClass(), "last", null);
        setField(term1597273, term1597273.getClass(), "first", term1597343);
        setField(term1597273, term1597273.getClass(), "last", null);
        setField(term1597203, term1597203.getClass(), "first", term1597273);
        setField(term1597203, term1597203.getClass(), "last", null);
        setField(term1597133, term1597133.getClass(), "first", term1597203);
        setField(term1597133, term1597133.getClass(), "last", null);
        setField(term1597063, term1597063.getClass(), "first", term1597133);
        setField(term1597063, term1597063.getClass(), "last", null);
        setField(term1596993, term1596993.getClass(), "first", term1597063);
        setField(term1596993, term1596993.getClass(), "last", null);
        setField(term1596923, term1596923.getClass(), "first", term1596993);
        setField(term1596923, term1596923.getClass(), "last", null);
        setField(term1596853, term1596853.getClass(), "first", term1596923);
        setField(term1596853, term1596853.getClass(), "last", null);
        setField(term1596783, term1596783.getClass(), "first", term1596853);
        setField(term1596783, term1596783.getClass(), "last", null);
        setField(term1596713, term1596713.getClass(), "first", term1596783);
        setField(term1596713, term1596713.getClass(), "last", null);
        setField(term1596643, term1596643.getClass(), "first", term1596713);
        setField(term1596643, term1596643.getClass(), "last", null);
        setField(term1596573, term1596573.getClass(), "first", term1596643);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1596573;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term1596503, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


