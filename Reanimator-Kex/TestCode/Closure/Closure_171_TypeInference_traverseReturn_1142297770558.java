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

public class TypeInference_traverseReturn_1142297770558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1805412;
     Object term1805482;

    public TypeInference_traverseReturn_1142297770558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1805412 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1805482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1805552 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1805622 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1805692 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1805762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1805832 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1805902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1805972 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1806042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1806112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1806182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1806252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1806322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1806392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1806462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1806532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1806602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1806672 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1805552, term1805552.getClass(), "type", 29);
        setIntField(term1805622, term1805622.getClass(), "type", 29);
        setIntField(term1805692, term1805692.getClass(), "type", 29);
        setIntField(term1805762, term1805762.getClass(), "type", 29);
        setIntField(term1805832, term1805832.getClass(), "type", 29);
        setIntField(term1805902, term1805902.getClass(), "type", 29);
        setIntField(term1805972, term1805972.getClass(), "type", 29);
        setIntField(term1806042, term1806042.getClass(), "type", 29);
        setIntField(term1806112, term1806112.getClass(), "type", 29);
        setIntField(term1806182, term1806182.getClass(), "type", 29);
        setIntField(term1806252, term1806252.getClass(), "type", 29);
        setIntField(term1806322, term1806322.getClass(), "type", 29);
        setIntField(term1806392, term1806392.getClass(), "type", 29);
        setIntField(term1806462, term1806462.getClass(), "type", 29);
        setIntField(term1806532, term1806532.getClass(), "type", 29);
        setIntField(term1806602, term1806602.getClass(), "type", 29);
        setIntField(term1806672, term1806672.getClass(), "type", 145);
        setField(term1806602, term1806602.getClass(), "first", term1806672);
        setField(term1806532, term1806532.getClass(), "first", term1806602);
        setField(term1806462, term1806462.getClass(), "first", term1806532);
        setField(term1806392, term1806392.getClass(), "first", term1806462);
        setField(term1806322, term1806322.getClass(), "first", term1806392);
        setField(term1806252, term1806252.getClass(), "first", term1806322);
        setField(term1806182, term1806182.getClass(), "first", term1806252);
        setField(term1806112, term1806112.getClass(), "first", term1806182);
        setField(term1806042, term1806042.getClass(), "first", term1806112);
        setField(term1805972, term1805972.getClass(), "first", term1806042);
        setField(term1805902, term1805902.getClass(), "first", term1805972);
        setField(term1805832, term1805832.getClass(), "first", term1805902);
        setField(term1805762, term1805762.getClass(), "first", term1805832);
        setField(term1805692, term1805692.getClass(), "first", term1805762);
        setField(term1805622, term1805622.getClass(), "first", term1805692);
        setField(term1805552, term1805552.getClass(), "first", term1805622);
        setField(term1805482, term1805482.getClass(), "first", term1805552);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1805482;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term1805412, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


