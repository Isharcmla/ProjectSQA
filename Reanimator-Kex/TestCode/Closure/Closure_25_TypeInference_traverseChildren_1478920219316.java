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

public class TypeInference_traverseChildren_1478920219316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term727760;
     Object term727830;

    public TypeInference_traverseChildren_1478920219316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term727760 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term727830 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term727900 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term727970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728040 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728460 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728530 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term728950 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729020 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729090 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729370 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729510 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729650 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term727900, term727900.getClass(), "type", 18);
        setIntField(term727970, term727970.getClass(), "type", 18);
        setIntField(term728040, term728040.getClass(), "type", 18);
        setIntField(term728110, term728110.getClass(), "type", 18);
        setIntField(term728180, term728180.getClass(), "type", 18);
        setIntField(term728250, term728250.getClass(), "type", 18);
        setIntField(term728320, term728320.getClass(), "type", 18);
        setIntField(term728390, term728390.getClass(), "type", 18);
        setIntField(term728460, term728460.getClass(), "type", 18);
        setIntField(term728530, term728530.getClass(), "type", 18);
        setIntField(term728600, term728600.getClass(), "type", 18);
        setIntField(term728670, term728670.getClass(), "type", 18);
        setIntField(term728740, term728740.getClass(), "type", 18);
        setIntField(term728810, term728810.getClass(), "type", 18);
        setIntField(term728880, term728880.getClass(), "type", 18);
        setIntField(term728950, term728950.getClass(), "type", 18);
        setIntField(term729020, term729020.getClass(), "type", 18);
        setIntField(term729090, term729090.getClass(), "type", 18);
        setIntField(term729160, term729160.getClass(), "type", 18);
        setIntField(term729230, term729230.getClass(), "type", 18);
        setIntField(term729300, term729300.getClass(), "type", 18);
        setIntField(term729370, term729370.getClass(), "type", 18);
        setIntField(term729440, term729440.getClass(), "type", 18);
        setIntField(term729510, term729510.getClass(), "type", 18);
        setIntField(term729580, term729580.getClass(), "type", 18);
        setIntField(term729650, term729650.getClass(), "type", 73);
        setField(term729580, term729580.getClass(), "first", term729650);
        setField(term729510, term729510.getClass(), "first", term729580);
        setField(term729440, term729440.getClass(), "first", term729510);
        setField(term729370, term729370.getClass(), "first", term729440);
        setField(term729300, term729300.getClass(), "first", term729370);
        setField(term729230, term729230.getClass(), "first", term729300);
        setField(term729160, term729160.getClass(), "first", term729230);
        setField(term729090, term729090.getClass(), "first", term729160);
        setField(term729020, term729020.getClass(), "first", term729090);
        setField(term728950, term728950.getClass(), "first", term729020);
        setField(term728880, term728880.getClass(), "first", term728950);
        setField(term728810, term728810.getClass(), "first", term728880);
        setField(term728740, term728740.getClass(), "first", term728810);
        setField(term728670, term728670.getClass(), "first", term728740);
        setField(term728600, term728600.getClass(), "first", term728670);
        setField(term728530, term728530.getClass(), "first", term728600);
        setField(term728460, term728460.getClass(), "first", term728530);
        setField(term728390, term728390.getClass(), "first", term728460);
        setField(term728320, term728320.getClass(), "first", term728390);
        setField(term728250, term728250.getClass(), "first", term728320);
        setField(term728180, term728180.getClass(), "first", term728250);
        setField(term728110, term728110.getClass(), "first", term728180);
        setField(term728040, term728040.getClass(), "first", term728110);
        setField(term727970, term727970.getClass(), "first", term728040);
        setField(term727900, term727900.getClass(), "first", term727970);
        setField(term727830, term727830.getClass(), "first", term727900);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term727830;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term727760, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


