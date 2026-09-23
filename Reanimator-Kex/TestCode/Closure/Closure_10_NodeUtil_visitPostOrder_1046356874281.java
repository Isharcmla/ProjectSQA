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

public class NodeUtil_visitPostOrder_1046356874281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3630;

    public NodeUtil_visitPostOrder_1046356874281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3647 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3630, term3630.getClass(), "type", -1408678076);
        setIntField(term3632, term3632.getClass(), "type", 1201413899);
        setIntField(term3634, term3634.getClass(), "type", -376722373);
        setIntField(term3636, term3636.getClass(), "type", 1180687854);
        setIntField(term3638, term3638.getClass(), "type", 328631288);
        setField(term3638, term3638.getClass(), "next", null);
        setField(term3638, term3638.getClass(), "first", null);
        setField(term3638, term3638.getClass(), "last", null);
        setField(term3638, term3638.getClass(), "propListHead", null);
        setIntField(term3638, term3638.getClass(), "sourcePosition", 0);
        setField(term3638, term3638.getClass(), "jsType", null);
        setField(term3638, term3638.getClass(), "parent", null);
        setField(term3636, term3636.getClass(), "next", term3638);
        setIntField(term3641, term3641.getClass(), "type", -1631415805);
        setField(term3641, term3641.getClass(), "next", null);
        setField(term3641, term3641.getClass(), "first", null);
        setField(term3641, term3641.getClass(), "last", term3638);
        setField(term3641, term3641.getClass(), "propListHead", null);
        setIntField(term3641, term3641.getClass(), "sourcePosition", 0);
        setField(term3641, term3641.getClass(), "jsType", null);
        setField(term3641, term3641.getClass(), "parent", null);
        setField(term3636, term3636.getClass(), "first", term3641);
        setField(term3636, term3636.getClass(), "last", term3634);
        setField(term3636, term3636.getClass(), "propListHead", null);
        setIntField(term3636, term3636.getClass(), "sourcePosition", 0);
        setField(term3636, term3636.getClass(), "jsType", null);
        setField(term3636, term3636.getClass(), "parent", null);
        setField(term3634, term3634.getClass(), "next", term3636);
        setField(term3634, term3634.getClass(), "first", term3638);
        setIntField(term3645, term3645.getClass(), "type", -2025555268);
        setIntField(term3647, term3647.getClass(), "type", -746950289);
        setField(term3647, term3647.getClass(), "next", null);
        setField(term3647, term3647.getClass(), "first", term3641);
        setField(term3647, term3647.getClass(), "last", term3636);
        setField(term3647, term3647.getClass(), "propListHead", null);
        setIntField(term3647, term3647.getClass(), "sourcePosition", 0);
        setField(term3647, term3647.getClass(), "jsType", null);
        setField(term3647, term3647.getClass(), "parent", null);
        setField(term3645, term3645.getClass(), "next", term3647);
        setField(term3645, term3645.getClass(), "first", term3632);
        setField(term3645, term3645.getClass(), "last", term3632);
        setField(term3645, term3645.getClass(), "propListHead", null);
        setIntField(term3645, term3645.getClass(), "sourcePosition", 0);
        setField(term3645, term3645.getClass(), "jsType", null);
        setField(term3645, term3645.getClass(), "parent", null);
        setField(term3634, term3634.getClass(), "last", term3645);
        setField(term3634, term3634.getClass(), "propListHead", null);
        setIntField(term3634, term3634.getClass(), "sourcePosition", 0);
        setField(term3634, term3634.getClass(), "jsType", null);
        setField(term3634, term3634.getClass(), "parent", null);
        setField(term3632, term3632.getClass(), "next", term3634);
        setIntField(term3652, term3652.getClass(), "type", -137577510);
        setField(term3652, term3652.getClass(), "next", term3645);
        setField(term3652, term3652.getClass(), "first", term3647);
        setField(term3652, term3652.getClass(), "last", term3630);
        setField(term3652, term3652.getClass(), "propListHead", null);
        setIntField(term3652, term3652.getClass(), "sourcePosition", 0);
        setField(term3652, term3652.getClass(), "jsType", null);
        setField(term3652, term3652.getClass(), "parent", null);
        setField(term3632, term3632.getClass(), "first", term3652);
        setField(term3632, term3632.getClass(), "last", term3652);
        setField(term3632, term3632.getClass(), "propListHead", null);
        setIntField(term3632, term3632.getClass(), "sourcePosition", 0);
        setField(term3632, term3632.getClass(), "jsType", null);
        setField(term3632, term3632.getClass(), "parent", null);
        setField(term3630, term3630.getClass(), "next", term3632);
        setField(term3630, term3630.getClass(), "first", term3636);
        setField(term3630, term3630.getClass(), "last", term3638);
        setField(term3630, term3630.getClass(), "propListHead", null);
        setIntField(term3630, term3630.getClass(), "sourcePosition", 0);
        setField(term3630, term3630.getClass(), "jsType", null);
        setField(term3630, term3630.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeUtil$Visitor");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term3630;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "visitPostOrder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


