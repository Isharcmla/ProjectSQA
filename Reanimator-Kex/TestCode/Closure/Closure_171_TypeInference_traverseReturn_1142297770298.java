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

public class TypeInference_traverseReturn_1142297770298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term612312;
     Object term612382;

    public TypeInference_traverseReturn_1142297770298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term612312 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term612382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term612452 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term612522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term612592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term612662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term612732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term612802 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term612872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term612942 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613152 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613222 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613292 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613852 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613992 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term614062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term614132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term614202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term612452, term612452.getClass(), "type", 29);
        setIntField(term612522, term612522.getClass(), "type", 29);
        setIntField(term612592, term612592.getClass(), "type", 29);
        setIntField(term612662, term612662.getClass(), "type", 29);
        setIntField(term612732, term612732.getClass(), "type", 29);
        setIntField(term612802, term612802.getClass(), "type", 29);
        setIntField(term612872, term612872.getClass(), "type", 29);
        setIntField(term612942, term612942.getClass(), "type", 29);
        setIntField(term613012, term613012.getClass(), "type", 29);
        setIntField(term613082, term613082.getClass(), "type", 29);
        setIntField(term613152, term613152.getClass(), "type", 29);
        setIntField(term613222, term613222.getClass(), "type", 29);
        setIntField(term613292, term613292.getClass(), "type", 29);
        setIntField(term613362, term613362.getClass(), "type", 29);
        setIntField(term613432, term613432.getClass(), "type", 29);
        setIntField(term613502, term613502.getClass(), "type", 29);
        setIntField(term613572, term613572.getClass(), "type", 29);
        setIntField(term613642, term613642.getClass(), "type", 29);
        setIntField(term613712, term613712.getClass(), "type", 29);
        setIntField(term613782, term613782.getClass(), "type", 29);
        setIntField(term613852, term613852.getClass(), "type", 29);
        setIntField(term613922, term613922.getClass(), "type", 29);
        setIntField(term613992, term613992.getClass(), "type", 29);
        setIntField(term614062, term614062.getClass(), "type", 29);
        setIntField(term614132, term614132.getClass(), "type", 29);
        setIntField(term614202, term614202.getClass(), "type", 59);
        setField(term614132, term614132.getClass(), "first", term614202);
        setField(term614062, term614062.getClass(), "first", term614132);
        setField(term613992, term613992.getClass(), "first", term614062);
        setField(term613922, term613922.getClass(), "first", term613992);
        setField(term613852, term613852.getClass(), "first", term613922);
        setField(term613782, term613782.getClass(), "first", term613852);
        setField(term613712, term613712.getClass(), "first", term613782);
        setField(term613642, term613642.getClass(), "first", term613712);
        setField(term613572, term613572.getClass(), "first", term613642);
        setField(term613502, term613502.getClass(), "first", term613572);
        setField(term613432, term613432.getClass(), "first", term613502);
        setField(term613362, term613362.getClass(), "first", term613432);
        setField(term613292, term613292.getClass(), "first", term613362);
        setField(term613222, term613222.getClass(), "first", term613292);
        setField(term613152, term613152.getClass(), "first", term613222);
        setField(term613082, term613082.getClass(), "first", term613152);
        setField(term613012, term613012.getClass(), "first", term613082);
        setField(term612942, term612942.getClass(), "first", term613012);
        setField(term612872, term612872.getClass(), "first", term612942);
        setField(term612802, term612802.getClass(), "first", term612872);
        setField(term612732, term612732.getClass(), "first", term612802);
        setField(term612662, term612662.getClass(), "first", term612732);
        setField(term612592, term612592.getClass(), "first", term612662);
        setField(term612522, term612522.getClass(), "first", term612592);
        setField(term612452, term612452.getClass(), "first", term612522);
        setField(term612382, term612382.getClass(), "first", term612452);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term612382;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term612312, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


