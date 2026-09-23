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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class FoldConstants_tryFoldBlock_1167048042366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102688;
     Object term102758;
     Object term103859;
     Object term103860;

    public FoldConstants_tryFoldBlock_1167048042366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102688 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term102758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term103038, term103038.getClass(), "next", term103108);
        setIntField(term103038, term103038.getClass(), "type", 56);
        setField(term102968, term102968.getClass(), "next", term103038);
        setIntField(term102968, term102968.getClass(), "type", 127);
        setField(term102898, term102898.getClass(), "next", term102968);
        setIntField(term102898, term102898.getClass(), "type", 78);
        setField(term102828, term102828.getClass(), "next", term102898);
        setIntField(term102828, term102828.getClass(), "type", 82);
        setField(term102758, term102758.getClass(), "first", term102828);
        term103859 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term103859, term103859.getClass(), "compiler", null);
        term103860 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103861 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103864 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term103860, term103860.getClass(), "type", 0);
        setField(term103860, term103860.getClass(), "next", null);
        setIntField(term103861, term103861.getClass(), "type", 82);
        setIntField(term103862, term103862.getClass(), "type", 78);
        setIntField(term103863, term103863.getClass(), "type", 127);
        setIntField(term103864, term103864.getClass(), "type", 56);
        setField(term103864, term103864.getClass(), "next", null);
        setField(term103864, term103864.getClass(), "first", null);
        setField(term103864, term103864.getClass(), "last", null);
        setField(term103864, term103864.getClass(), "propListHead", null);
        setIntField(term103864, term103864.getClass(), "sourcePosition", 0);
        setField(term103864, term103864.getClass(), "jsType", null);
        setField(term103864, term103864.getClass(), "parent", null);
        setField(term103863, term103863.getClass(), "next", term103864);
        setField(term103863, term103863.getClass(), "first", null);
        setField(term103863, term103863.getClass(), "last", null);
        setField(term103863, term103863.getClass(), "propListHead", null);
        setIntField(term103863, term103863.getClass(), "sourcePosition", 0);
        setField(term103863, term103863.getClass(), "jsType", null);
        setField(term103863, term103863.getClass(), "parent", null);
        setField(term103862, term103862.getClass(), "next", term103863);
        setField(term103862, term103862.getClass(), "first", null);
        setField(term103862, term103862.getClass(), "last", null);
        setField(term103862, term103862.getClass(), "propListHead", null);
        setIntField(term103862, term103862.getClass(), "sourcePosition", 0);
        setField(term103862, term103862.getClass(), "jsType", null);
        setField(term103862, term103862.getClass(), "parent", null);
        setField(term103861, term103861.getClass(), "next", term103862);
        setField(term103861, term103861.getClass(), "first", null);
        setField(term103861, term103861.getClass(), "last", null);
        setField(term103861, term103861.getClass(), "propListHead", null);
        setIntField(term103861, term103861.getClass(), "sourcePosition", 0);
        setField(term103861, term103861.getClass(), "jsType", null);
        setField(term103861, term103861.getClass(), "parent", null);
        setField(term103860, term103860.getClass(), "first", term103861);
        setField(term103860, term103860.getClass(), "last", null);
        setField(term103860, term103860.getClass(), "propListHead", null);
        setIntField(term103860, term103860.getClass(), "sourcePosition", 0);
        setField(term103860, term103860.getClass(), "jsType", null);
        setField(term103860, term103860.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term102758;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term102688, args);
        assertTrue(recursiveEquals(term102688, term103859));
        assertTrue(recursiveEquals(term102758, null));
    }

};


