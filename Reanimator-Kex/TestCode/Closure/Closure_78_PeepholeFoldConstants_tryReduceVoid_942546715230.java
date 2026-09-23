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

public class PeepholeFoldConstants_tryReduceVoid_942546715230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36855;
     Object term37015;
     Object term37735;
     Object term37737;
     Object term37708;

    public PeepholeFoldConstants_tryReduceVoid_942546715230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36855 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term36945 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term36945, term36945.getClass(), "compiler", null);
        setField(term36855, term36855.getClass(), "currentTraversal", term36945);
        term37015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37085, term37085.getClass(), "type", 71);
        setField(term37015, term37015.getClass(), "first", term37085);
        setIntField(term37015, term37015.getClass(), "type", 71);
        term37735 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term37736 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term37736, term37736.getClass(), "compiler", null);
        setField(term37736, term37736.getClass(), "callback", null);
        setField(term37736, term37736.getClass(), "curNode", null);
        setField(term37736, term37736.getClass(), "scopes", null);
        setField(term37736, term37736.getClass(), "scopeRoots", null);
        setField(term37736, term37736.getClass(), "cfgs", null);
        setField(term37736, term37736.getClass(), "sourceName", null);
        setField(term37736, term37736.getClass(), "scopeCreator", null);
        setField(term37736, term37736.getClass(), "scopeCallback", null);
        setField(term37735, term37735.getClass(), "currentTraversal", term37736);
        term37737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37737, term37737.getClass(), "type", 71);
        setField(term37737, term37737.getClass(), "next", null);
        setIntField(term37738, term37738.getClass(), "type", 71);
        setField(term37738, term37738.getClass(), "next", null);
        setField(term37738, term37738.getClass(), "first", null);
        setField(term37738, term37738.getClass(), "last", null);
        setField(term37738, term37738.getClass(), "propListHead", null);
        setIntField(term37738, term37738.getClass(), "sourcePosition", 0);
        setField(term37738, term37738.getClass(), "jsType", null);
        setField(term37738, term37738.getClass(), "parent", null);
        setField(term37737, term37737.getClass(), "first", term37738);
        setField(term37737, term37737.getClass(), "last", null);
        setField(term37737, term37737.getClass(), "propListHead", null);
        setIntField(term37737, term37737.getClass(), "sourcePosition", 0);
        setField(term37737, term37737.getClass(), "jsType", null);
        setField(term37737, term37737.getClass(), "parent", null);
        term37708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37708, term37708.getClass(), "type", 71);
        setField(term37708, term37708.getClass(), "next", null);
        setIntField(term37710, term37710.getClass(), "type", 71);
        setField(term37710, term37710.getClass(), "next", null);
        setField(term37710, term37710.getClass(), "first", null);
        setField(term37710, term37710.getClass(), "last", null);
        setField(term37710, term37710.getClass(), "propListHead", null);
        setIntField(term37710, term37710.getClass(), "sourcePosition", 0);
        setField(term37710, term37710.getClass(), "jsType", null);
        setField(term37710, term37710.getClass(), "parent", null);
        setField(term37708, term37708.getClass(), "first", term37710);
        setField(term37708, term37708.getClass(), "last", null);
        setField(term37708, term37708.getClass(), "propListHead", null);
        setIntField(term37708, term37708.getClass(), "sourcePosition", 0);
        setField(term37708, term37708.getClass(), "jsType", null);
        setField(term37708, term37708.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term37015;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term36855, args);
        assertTrue(recursiveEquals(term36855, term37735));
        assertTrue(recursiveEquals(term37015, term37737));
        assertTrue(recursiveEquals(retValue, term37708));
    }

};


