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

public class TypeInference_traverseChildren_1478920219310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term686655;
     Object term686725;

    public TypeInference_traverseChildren_1478920219310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term686655 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term686725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term686795 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term686865 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term686935 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term687005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term687075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term687145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term687215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term687285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term687355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term687425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term687495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term687565 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term687635 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term687705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term687775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term687845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term687915 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term687985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term688055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term688125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term688195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term688265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term688335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term688405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term688475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term688545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term688615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term688685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term688755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term688825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term688895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term686795, term686795.getClass(), "type", 18);
        setIntField(term686865, term686865.getClass(), "type", 18);
        setIntField(term686935, term686935.getClass(), "type", 18);
        setIntField(term687005, term687005.getClass(), "type", 18);
        setIntField(term687075, term687075.getClass(), "type", 18);
        setIntField(term687145, term687145.getClass(), "type", 18);
        setIntField(term687215, term687215.getClass(), "type", 18);
        setIntField(term687285, term687285.getClass(), "type", 18);
        setIntField(term687355, term687355.getClass(), "type", 18);
        setIntField(term687425, term687425.getClass(), "type", 18);
        setIntField(term687495, term687495.getClass(), "type", 18);
        setIntField(term687565, term687565.getClass(), "type", 18);
        setIntField(term687635, term687635.getClass(), "type", 18);
        setIntField(term687705, term687705.getClass(), "type", 18);
        setIntField(term687775, term687775.getClass(), "type", 18);
        setIntField(term687845, term687845.getClass(), "type", 18);
        setIntField(term687915, term687915.getClass(), "type", 18);
        setIntField(term687985, term687985.getClass(), "type", 18);
        setIntField(term688055, term688055.getClass(), "type", 18);
        setIntField(term688125, term688125.getClass(), "type", 18);
        setIntField(term688195, term688195.getClass(), "type", 18);
        setIntField(term688265, term688265.getClass(), "type", 18);
        setIntField(term688335, term688335.getClass(), "type", 18);
        setIntField(term688405, term688405.getClass(), "type", 18);
        setIntField(term688475, term688475.getClass(), "type", 18);
        setIntField(term688545, term688545.getClass(), "type", 18);
        setIntField(term688615, term688615.getClass(), "type", 18);
        setIntField(term688685, term688685.getClass(), "type", 18);
        setIntField(term688755, term688755.getClass(), "type", 18);
        setIntField(term688825, term688825.getClass(), "type", 18);
        setIntField(term688895, term688895.getClass(), "type", 18);
        setField(term688895, term688895.getClass(), "first", term686725);
        setField(term688825, term688825.getClass(), "first", term688895);
        setField(term688755, term688755.getClass(), "first", term688825);
        setField(term688685, term688685.getClass(), "first", term688755);
        setField(term688615, term688615.getClass(), "first", term688685);
        setField(term688545, term688545.getClass(), "first", term688615);
        setField(term688475, term688475.getClass(), "first", term688545);
        setField(term688405, term688405.getClass(), "first", term688475);
        setField(term688335, term688335.getClass(), "first", term688405);
        setField(term688265, term688265.getClass(), "first", term688335);
        setField(term688195, term688195.getClass(), "first", term688265);
        setField(term688125, term688125.getClass(), "first", term688195);
        setField(term688055, term688055.getClass(), "first", term688125);
        setField(term687985, term687985.getClass(), "first", term688055);
        setField(term687915, term687915.getClass(), "first", term687985);
        setField(term687845, term687845.getClass(), "first", term687915);
        setField(term687775, term687775.getClass(), "first", term687845);
        setField(term687705, term687705.getClass(), "first", term687775);
        setField(term687635, term687635.getClass(), "first", term687705);
        setField(term687565, term687565.getClass(), "first", term687635);
        setField(term687495, term687495.getClass(), "first", term687565);
        setField(term687425, term687425.getClass(), "first", term687495);
        setField(term687355, term687355.getClass(), "first", term687425);
        setField(term687285, term687285.getClass(), "first", term687355);
        setField(term687215, term687215.getClass(), "first", term687285);
        setField(term687145, term687145.getClass(), "first", term687215);
        setField(term687075, term687075.getClass(), "first", term687145);
        setField(term687005, term687005.getClass(), "first", term687075);
        setField(term686935, term686935.getClass(), "first", term687005);
        setField(term686865, term686865.getClass(), "first", term686935);
        setField(term686795, term686795.getClass(), "first", term686865);
        setField(term686725, term686725.getClass(), "first", term686795);
        setIntField(term686725, term686725.getClass(), "type", 48);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term686725;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term686655, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


