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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseAdd_838817955310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term442173;
     Object term442243;

    public TypeInference_traverseAdd_838817955310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term442173 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term442243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term442313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term442383 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term442453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term442523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term442593 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term442663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term442733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term442803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term442873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term442943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term443013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term443083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term443153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term443223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term443293 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term443363 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term443433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term443503 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term443573 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term443643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term443713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term443783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term443853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term443923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term443993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term444063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term444133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term444203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term444273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term444343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term444413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term444483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term444553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term444623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term444693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term444763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term444833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term444903 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term444973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term445043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term445113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term445183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term445253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term445323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term442313, term442313.getClass(), "next", null);
        setIntField(term442313, term442313.getClass(), "type", 14);
        setIntField(term442383, term442383.getClass(), "type", 14);
        setIntField(term442453, term442453.getClass(), "type", 14);
        setIntField(term442523, term442523.getClass(), "type", 14);
        setIntField(term442593, term442593.getClass(), "type", 14);
        setIntField(term442663, term442663.getClass(), "type", 14);
        setIntField(term442733, term442733.getClass(), "type", 14);
        setIntField(term442803, term442803.getClass(), "type", 14);
        setIntField(term442873, term442873.getClass(), "type", 14);
        setIntField(term442943, term442943.getClass(), "type", 14);
        setIntField(term443013, term443013.getClass(), "type", 14);
        setIntField(term443083, term443083.getClass(), "type", 14);
        setIntField(term443153, term443153.getClass(), "type", 14);
        setIntField(term443223, term443223.getClass(), "type", 14);
        setIntField(term443293, term443293.getClass(), "type", 14);
        setIntField(term443363, term443363.getClass(), "type", 14);
        setIntField(term443433, term443433.getClass(), "type", 14);
        setIntField(term443503, term443503.getClass(), "type", 14);
        setIntField(term443573, term443573.getClass(), "type", 14);
        setIntField(term443643, term443643.getClass(), "type", 14);
        setIntField(term443713, term443713.getClass(), "type", 14);
        setIntField(term443783, term443783.getClass(), "type", 14);
        setIntField(term443853, term443853.getClass(), "type", 14);
        setIntField(term443923, term443923.getClass(), "type", 14);
        setIntField(term443993, term443993.getClass(), "type", 14);
        setIntField(term444063, term444063.getClass(), "type", 14);
        setIntField(term444133, term444133.getClass(), "type", 14);
        setIntField(term444203, term444203.getClass(), "type", 14);
        setIntField(term444273, term444273.getClass(), "type", 14);
        setIntField(term444343, term444343.getClass(), "type", 14);
        setIntField(term444413, term444413.getClass(), "type", 14);
        setIntField(term444483, term444483.getClass(), "type", 14);
        setIntField(term444553, term444553.getClass(), "type", 14);
        setIntField(term444623, term444623.getClass(), "type", 14);
        setIntField(term444693, term444693.getClass(), "type", 14);
        setIntField(term444763, term444763.getClass(), "type", 14);
        setIntField(term444833, term444833.getClass(), "type", 14);
        setIntField(term444903, term444903.getClass(), "type", 14);
        setIntField(term444973, term444973.getClass(), "type", 14);
        setIntField(term445043, term445043.getClass(), "type", 14);
        setIntField(term445113, term445113.getClass(), "type", 14);
        setIntField(term445183, term445183.getClass(), "type", 14);
        setIntField(term445253, term445253.getClass(), "type", 14);
        setIntField(term445323, term445323.getClass(), "type", 14);
        setField(term445323, term445323.getClass(), "first", term442243);
        setField(term445253, term445253.getClass(), "first", term445323);
        setField(term445183, term445183.getClass(), "first", term445253);
        setField(term445113, term445113.getClass(), "first", term445183);
        setField(term445043, term445043.getClass(), "first", term445113);
        setField(term444973, term444973.getClass(), "first", term445043);
        setField(term444903, term444903.getClass(), "first", term444973);
        setField(term444833, term444833.getClass(), "first", term444903);
        setField(term444763, term444763.getClass(), "first", term444833);
        setField(term444693, term444693.getClass(), "first", term444763);
        setField(term444623, term444623.getClass(), "first", term444693);
        setField(term444553, term444553.getClass(), "first", term444623);
        setField(term444483, term444483.getClass(), "first", term444553);
        setField(term444413, term444413.getClass(), "first", term444483);
        setField(term444343, term444343.getClass(), "first", term444413);
        setField(term444273, term444273.getClass(), "first", term444343);
        setField(term444203, term444203.getClass(), "first", term444273);
        setField(term444133, term444133.getClass(), "first", term444203);
        setField(term444063, term444063.getClass(), "first", term444133);
        setField(term443993, term443993.getClass(), "first", term444063);
        setField(term443923, term443923.getClass(), "first", term443993);
        setField(term443853, term443853.getClass(), "first", term443923);
        setField(term443783, term443783.getClass(), "first", term443853);
        setField(term443713, term443713.getClass(), "first", term443783);
        setField(term443643, term443643.getClass(), "first", term443713);
        setField(term443573, term443573.getClass(), "first", term443643);
        setField(term443503, term443503.getClass(), "first", term443573);
        setField(term443433, term443433.getClass(), "first", term443503);
        setField(term443363, term443363.getClass(), "first", term443433);
        setField(term443293, term443293.getClass(), "first", term443363);
        setField(term443223, term443223.getClass(), "first", term443293);
        setField(term443153, term443153.getClass(), "first", term443223);
        setField(term443083, term443083.getClass(), "first", term443153);
        setField(term443013, term443013.getClass(), "first", term443083);
        setField(term442943, term442943.getClass(), "first", term443013);
        setField(term442873, term442873.getClass(), "first", term442943);
        setField(term442803, term442803.getClass(), "first", term442873);
        setField(term442733, term442733.getClass(), "first", term442803);
        setField(term442663, term442663.getClass(), "first", term442733);
        setField(term442593, term442593.getClass(), "first", term442663);
        setField(term442523, term442523.getClass(), "first", term442593);
        setField(term442453, term442453.getClass(), "first", term442523);
        setField(term442383, term442383.getClass(), "first", term442453);
        setField(term442313, term442313.getClass(), "first", term442383);
        setField(term442243, term442243.getClass(), "first", term442313);
        setIntField(term442243, term442243.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term442243;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term442173, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


