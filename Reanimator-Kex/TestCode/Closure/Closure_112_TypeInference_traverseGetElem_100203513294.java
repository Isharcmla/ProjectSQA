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

public class TypeInference_traverseGetElem_100203513294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term398187;
     Object term398257;

    public TypeInference_traverseGetElem_100203513294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term398187 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term398257 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term398327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term398397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term398467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term398537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term398607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term398677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term398747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term398817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term398887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term398957 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term399027 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term399097 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term399167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term399237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term399307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term399377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term399447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term399517 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term399587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term399657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term399727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term399797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term399867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term399937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term400007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term400077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term400147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term400217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term398327, term398327.getClass(), "type", 98);
        setField(term398397, term398397.getClass(), "next", term398467);
        setIntField(term398397, term398397.getClass(), "type", 98);
        setField(term398537, term398537.getClass(), "next", term398607);
        setIntField(term398537, term398537.getClass(), "type", 98);
        setField(term398677, term398677.getClass(), "next", term398747);
        setIntField(term398677, term398677.getClass(), "type", 98);
        setField(term398817, term398817.getClass(), "next", term398887);
        setIntField(term398817, term398817.getClass(), "type", 98);
        setField(term398957, term398957.getClass(), "next", term398887);
        setIntField(term398957, term398957.getClass(), "type", 98);
        setField(term399027, term399027.getClass(), "next", term398747);
        setIntField(term399027, term399027.getClass(), "type", 98);
        setField(term399097, term399097.getClass(), "next", term399167);
        setIntField(term399097, term399097.getClass(), "type", 98);
        setField(term399237, term399237.getClass(), "next", term398887);
        setIntField(term399237, term399237.getClass(), "type", 98);
        setField(term399307, term399307.getClass(), "next", term399377);
        setIntField(term399307, term399307.getClass(), "type", 98);
        setField(term399447, term399447.getClass(), "next", term399517);
        setIntField(term399447, term399447.getClass(), "type", 93);
        setField(term399307, term399307.getClass(), "first", term399447);
        setField(term399307, term399307.getClass(), "last", term399587);
        setField(term399237, term399237.getClass(), "first", term399307);
        setField(term399237, term399237.getClass(), "last", term399657);
        setField(term399097, term399097.getClass(), "first", term399237);
        setField(term399097, term399097.getClass(), "last", term399727);
        setField(term399027, term399027.getClass(), "first", term399097);
        setField(term399027, term399027.getClass(), "last", term399797);
        setField(term398957, term398957.getClass(), "first", term399027);
        setField(term398957, term398957.getClass(), "last", term399867);
        setField(term398817, term398817.getClass(), "first", term398957);
        setField(term398817, term398817.getClass(), "last", term399937);
        setField(term398677, term398677.getClass(), "first", term398817);
        setField(term398677, term398677.getClass(), "last", term400007);
        setField(term398537, term398537.getClass(), "first", term398677);
        setField(term398537, term398537.getClass(), "last", term400077);
        setField(term398397, term398397.getClass(), "first", term398537);
        setField(term398397, term398397.getClass(), "last", term400147);
        setField(term398327, term398327.getClass(), "first", term398397);
        setField(term398327, term398327.getClass(), "last", term400217);
        setField(term398257, term398257.getClass(), "first", term398327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term398257;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term398187, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


