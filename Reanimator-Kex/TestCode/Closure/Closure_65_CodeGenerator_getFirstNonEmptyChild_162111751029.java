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
import java.lang.Object;

public class CodeGenerator_getFirstNonEmptyChild_162111751029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2627;

    public CodeGenerator_getFirstNonEmptyChild_162111751029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2640 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2647 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2650 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2627, term2627.getClass(), "type", -1896376975);
        setIntField(term2629, term2629.getClass(), "type", 584893196);
        setIntField(term2631, term2631.getClass(), "type", 0);
        setField(term2631, term2631.getClass(), "next", null);
        setField(term2631, term2631.getClass(), "first", null);
        setField(term2631, term2631.getClass(), "last", null);
        setField(term2631, term2631.getClass(), "propListHead", null);
        setIntField(term2631, term2631.getClass(), "sourcePosition", 0);
        setField(term2631, term2631.getClass(), "jsType", null);
        setField(term2631, term2631.getClass(), "parent", null);
        setField(term2629, term2629.getClass(), "next", term2631);
        setIntField(term2634, term2634.getClass(), "type", 0);
        setField(term2634, term2634.getClass(), "next", null);
        setField(term2634, term2634.getClass(), "first", null);
        setField(term2634, term2634.getClass(), "last", null);
        setField(term2634, term2634.getClass(), "propListHead", null);
        setIntField(term2634, term2634.getClass(), "sourcePosition", 0);
        setField(term2634, term2634.getClass(), "jsType", null);
        setField(term2634, term2634.getClass(), "parent", null);
        setField(term2629, term2629.getClass(), "first", term2634);
        setIntField(term2637, term2637.getClass(), "type", 0);
        setField(term2637, term2637.getClass(), "next", null);
        setField(term2637, term2637.getClass(), "first", null);
        setField(term2637, term2637.getClass(), "last", null);
        setField(term2637, term2637.getClass(), "propListHead", null);
        setIntField(term2637, term2637.getClass(), "sourcePosition", 0);
        setField(term2637, term2637.getClass(), "jsType", null);
        setField(term2637, term2637.getClass(), "parent", null);
        setField(term2629, term2629.getClass(), "last", term2637);
        setField(term2640, term2640.getClass(), "next", null);
        setIntField(term2640, term2640.getClass(), "type", 0);
        setIntField(term2640, term2640.getClass(), "intValue", 0);
        setField(term2640, term2640.getClass(), "objectValue", null);
        setField(term2629, term2629.getClass(), "propListHead", term2640);
        setIntField(term2629, term2629.getClass(), "sourcePosition", -1882480155);
        setField(term2629, term2629.getClass(), "jsType", null);
        setField(term2629, term2629.getClass(), "parent", null);
        setField(term2627, term2627.getClass(), "next", term2629);
        setIntField(term2644, term2644.getClass(), "type", 0);
        setField(term2644, term2644.getClass(), "next", null);
        setField(term2644, term2644.getClass(), "first", null);
        setField(term2644, term2644.getClass(), "last", null);
        setField(term2644, term2644.getClass(), "propListHead", null);
        setIntField(term2644, term2644.getClass(), "sourcePosition", 0);
        setField(term2644, term2644.getClass(), "jsType", null);
        setField(term2644, term2644.getClass(), "parent", null);
        setField(term2627, term2627.getClass(), "first", term2644);
        setIntField(term2647, term2647.getClass(), "type", 0);
        setField(term2647, term2647.getClass(), "next", null);
        setField(term2647, term2647.getClass(), "first", null);
        setField(term2647, term2647.getClass(), "last", null);
        setField(term2647, term2647.getClass(), "propListHead", null);
        setIntField(term2647, term2647.getClass(), "sourcePosition", 0);
        setField(term2647, term2647.getClass(), "jsType", null);
        setField(term2647, term2647.getClass(), "parent", null);
        setField(term2627, term2627.getClass(), "last", term2647);
        setField(term2650, term2650.getClass(), "next", null);
        setIntField(term2650, term2650.getClass(), "type", 0);
        setIntField(term2650, term2650.getClass(), "intValue", 0);
        setField(term2650, term2650.getClass(), "objectValue", null);
        setField(term2627, term2627.getClass(), "propListHead", term2650);
        setIntField(term2627, term2627.getClass(), "sourcePosition", -1410220680);
        setField(term2627, term2627.getClass(), "jsType", null);
        setField(term2627, term2627.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2627;
        callMethod(klass, "getFirstNonEmptyChild", argTypes, null, args);
    }

};


