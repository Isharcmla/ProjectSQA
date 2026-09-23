package com.google.javascript.jscomp.type;

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
import static com.google.javascript.jscomp.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ChainableReverseAbstractInterpreter_getTypeIfRefinable_186946725015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59;

    public ChainableReverseAbstractInterpreter_getTypeIfRefinable_186946725015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term59, term59.getClass(), "type", -655067527);
        setIntField(term61, term61.getClass(), "type", -6029667);
        setIntField(term63, term63.getClass(), "type", -2068769794);
        setIntField(term65, term65.getClass(), "type", -117576464);
        setIntField(term67, term67.getClass(), "type", -1007160944);
        setField(term67, term67.getClass(), "next", null);
        setField(term67, term67.getClass(), "first", null);
        setField(term67, term67.getClass(), "last", null);
        setField(term67, term67.getClass(), "propListHead", null);
        setIntField(term67, term67.getClass(), "sourcePosition", 0);
        setField(term67, term67.getClass(), "jsType", null);
        setField(term67, term67.getClass(), "parent", null);
        setField(term65, term65.getClass(), "next", term67);
        setIntField(term70, term70.getClass(), "type", 1135664017);
        setField(term70, term70.getClass(), "next", null);
        setField(term70, term70.getClass(), "first", null);
        setField(term70, term70.getClass(), "last", term67);
        setField(term70, term70.getClass(), "propListHead", null);
        setIntField(term70, term70.getClass(), "sourcePosition", 0);
        setField(term70, term70.getClass(), "jsType", null);
        setField(term70, term70.getClass(), "parent", null);
        setField(term65, term65.getClass(), "first", term70);
        setField(term65, term65.getClass(), "last", term63);
        setField(term65, term65.getClass(), "propListHead", null);
        setIntField(term65, term65.getClass(), "sourcePosition", 0);
        setField(term65, term65.getClass(), "jsType", null);
        setField(term65, term65.getClass(), "parent", null);
        setField(term63, term63.getClass(), "next", term65);
        setField(term63, term63.getClass(), "first", term67);
        setIntField(term74, term74.getClass(), "type", 865208305);
        setIntField(term76, term76.getClass(), "type", -1275173084);
        setField(term76, term76.getClass(), "next", null);
        setField(term76, term76.getClass(), "first", term70);
        setField(term76, term76.getClass(), "last", term65);
        setField(term76, term76.getClass(), "propListHead", null);
        setIntField(term76, term76.getClass(), "sourcePosition", 0);
        setField(term76, term76.getClass(), "jsType", null);
        setField(term76, term76.getClass(), "parent", null);
        setField(term74, term74.getClass(), "next", term76);
        setField(term74, term74.getClass(), "first", term61);
        setField(term74, term74.getClass(), "last", term61);
        setField(term74, term74.getClass(), "propListHead", null);
        setIntField(term74, term74.getClass(), "sourcePosition", 0);
        setField(term74, term74.getClass(), "jsType", null);
        setField(term74, term74.getClass(), "parent", null);
        setField(term63, term63.getClass(), "last", term74);
        setField(term63, term63.getClass(), "propListHead", null);
        setIntField(term63, term63.getClass(), "sourcePosition", 0);
        setField(term63, term63.getClass(), "jsType", null);
        setField(term63, term63.getClass(), "parent", null);
        setField(term61, term61.getClass(), "next", term63);
        setIntField(term81, term81.getClass(), "type", -244121226);
        setField(term81, term81.getClass(), "next", term74);
        setField(term81, term81.getClass(), "first", term76);
        setField(term81, term81.getClass(), "last", term59);
        setField(term81, term81.getClass(), "propListHead", null);
        setIntField(term81, term81.getClass(), "sourcePosition", 0);
        setField(term81, term81.getClass(), "jsType", null);
        setField(term81, term81.getClass(), "parent", null);
        setField(term61, term61.getClass(), "first", term81);
        setField(term61, term61.getClass(), "last", term81);
        setField(term61, term61.getClass(), "propListHead", null);
        setIntField(term61, term61.getClass(), "sourcePosition", 0);
        setField(term61, term61.getClass(), "jsType", null);
        setField(term61, term61.getClass(), "parent", null);
        setField(term59, term59.getClass(), "next", term61);
        setField(term59, term59.getClass(), "first", term65);
        setField(term59, term59.getClass(), "last", term67);
        setField(term59, term59.getClass(), "propListHead", null);
        setIntField(term59, term59.getClass(), "sourcePosition", 0);
        setField(term59, term59.getClass(), "jsType", null);
        setField(term59, term59.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term59;
        args[1] = null;
        try {
            callMethod(klass, "getTypeIfRefinable", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


