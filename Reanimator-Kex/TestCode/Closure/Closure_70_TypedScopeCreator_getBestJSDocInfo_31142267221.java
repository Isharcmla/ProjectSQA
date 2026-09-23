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

public class TypedScopeCreator_getBestJSDocInfo_31142267221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2713;

    public TypedScopeCreator_getBestJSDocInfo_31142267221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2726 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2736 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2713, term2713.getClass(), "type", 1240914516);
        setIntField(term2715, term2715.getClass(), "type", 1442160736);
        setIntField(term2717, term2717.getClass(), "type", 0);
        setField(term2717, term2717.getClass(), "next", null);
        setField(term2717, term2717.getClass(), "first", null);
        setField(term2717, term2717.getClass(), "last", null);
        setField(term2717, term2717.getClass(), "propListHead", null);
        setIntField(term2717, term2717.getClass(), "sourcePosition", 0);
        setField(term2717, term2717.getClass(), "jsType", null);
        setField(term2717, term2717.getClass(), "parent", null);
        setField(term2715, term2715.getClass(), "next", term2717);
        setIntField(term2720, term2720.getClass(), "type", 0);
        setField(term2720, term2720.getClass(), "next", null);
        setField(term2720, term2720.getClass(), "first", null);
        setField(term2720, term2720.getClass(), "last", null);
        setField(term2720, term2720.getClass(), "propListHead", null);
        setIntField(term2720, term2720.getClass(), "sourcePosition", 0);
        setField(term2720, term2720.getClass(), "jsType", null);
        setField(term2720, term2720.getClass(), "parent", null);
        setField(term2715, term2715.getClass(), "first", term2720);
        setIntField(term2723, term2723.getClass(), "type", 0);
        setField(term2723, term2723.getClass(), "next", null);
        setField(term2723, term2723.getClass(), "first", null);
        setField(term2723, term2723.getClass(), "last", null);
        setField(term2723, term2723.getClass(), "propListHead", null);
        setIntField(term2723, term2723.getClass(), "sourcePosition", 0);
        setField(term2723, term2723.getClass(), "jsType", null);
        setField(term2723, term2723.getClass(), "parent", null);
        setField(term2715, term2715.getClass(), "last", term2723);
        setField(term2726, term2726.getClass(), "next", null);
        setIntField(term2726, term2726.getClass(), "type", 0);
        setIntField(term2726, term2726.getClass(), "intValue", 0);
        setField(term2726, term2726.getClass(), "objectValue", null);
        setField(term2715, term2715.getClass(), "propListHead", term2726);
        setIntField(term2715, term2715.getClass(), "sourcePosition", -1772434990);
        setField(term2715, term2715.getClass(), "jsType", null);
        setField(term2715, term2715.getClass(), "parent", null);
        setField(term2713, term2713.getClass(), "next", term2715);
        setIntField(term2730, term2730.getClass(), "type", 0);
        setField(term2730, term2730.getClass(), "next", null);
        setField(term2730, term2730.getClass(), "first", null);
        setField(term2730, term2730.getClass(), "last", null);
        setField(term2730, term2730.getClass(), "propListHead", null);
        setIntField(term2730, term2730.getClass(), "sourcePosition", 0);
        setField(term2730, term2730.getClass(), "jsType", null);
        setField(term2730, term2730.getClass(), "parent", null);
        setField(term2713, term2713.getClass(), "first", term2730);
        setIntField(term2733, term2733.getClass(), "type", 0);
        setField(term2733, term2733.getClass(), "next", null);
        setField(term2733, term2733.getClass(), "first", null);
        setField(term2733, term2733.getClass(), "last", null);
        setField(term2733, term2733.getClass(), "propListHead", null);
        setIntField(term2733, term2733.getClass(), "sourcePosition", 0);
        setField(term2733, term2733.getClass(), "jsType", null);
        setField(term2733, term2733.getClass(), "parent", null);
        setField(term2713, term2713.getClass(), "last", term2733);
        setField(term2736, term2736.getClass(), "next", null);
        setIntField(term2736, term2736.getClass(), "type", 0);
        setIntField(term2736, term2736.getClass(), "intValue", 0);
        setField(term2736, term2736.getClass(), "objectValue", null);
        setField(term2713, term2713.getClass(), "propListHead", term2736);
        setIntField(term2713, term2713.getClass(), "sourcePosition", -1845499264);
        setField(term2713, term2713.getClass(), "jsType", null);
        setField(term2713, term2713.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2713;
        try {
            callMethod(klass, "getBestJSDocInfo", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


