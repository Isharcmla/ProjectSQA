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

public class NodeUtil_referencesThis_2041162929152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term843;
     Object term8532;

    public NodeUtil_referencesThis_2041162929152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term850 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term856 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term860 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term866 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term843, term843.getClass(), "type", 1272542218);
        setIntField(term845, term845.getClass(), "type", -18216811);
        setIntField(term847, term847.getClass(), "type", 0);
        setField(term847, term847.getClass(), "next", null);
        setField(term847, term847.getClass(), "first", null);
        setField(term847, term847.getClass(), "last", null);
        setField(term847, term847.getClass(), "propListHead", null);
        setIntField(term847, term847.getClass(), "sourcePosition", 0);
        setField(term847, term847.getClass(), "jsType", null);
        setField(term847, term847.getClass(), "parent", null);
        setField(term845, term845.getClass(), "next", term847);
        setIntField(term850, term850.getClass(), "type", 0);
        setField(term850, term850.getClass(), "next", null);
        setField(term850, term850.getClass(), "first", null);
        setField(term850, term850.getClass(), "last", null);
        setField(term850, term850.getClass(), "propListHead", null);
        setIntField(term850, term850.getClass(), "sourcePosition", 0);
        setField(term850, term850.getClass(), "jsType", null);
        setField(term850, term850.getClass(), "parent", null);
        setField(term845, term845.getClass(), "first", term850);
        setIntField(term853, term853.getClass(), "type", 0);
        setField(term853, term853.getClass(), "next", null);
        setField(term853, term853.getClass(), "first", null);
        setField(term853, term853.getClass(), "last", null);
        setField(term853, term853.getClass(), "propListHead", null);
        setIntField(term853, term853.getClass(), "sourcePosition", 0);
        setField(term853, term853.getClass(), "jsType", null);
        setField(term853, term853.getClass(), "parent", null);
        setField(term845, term845.getClass(), "last", term853);
        setField(term856, term856.getClass(), "next", null);
        setIntField(term856, term856.getClass(), "type", 0);
        setIntField(term856, term856.getClass(), "intValue", 0);
        setField(term856, term856.getClass(), "objectValue", null);
        setField(term845, term845.getClass(), "propListHead", term856);
        setIntField(term845, term845.getClass(), "sourcePosition", -1516995753);
        setField(term845, term845.getClass(), "jsType", null);
        setField(term845, term845.getClass(), "parent", null);
        setField(term843, term843.getClass(), "next", term845);
        setIntField(term860, term860.getClass(), "type", 0);
        setField(term860, term860.getClass(), "next", null);
        setField(term860, term860.getClass(), "first", null);
        setField(term860, term860.getClass(), "last", null);
        setField(term860, term860.getClass(), "propListHead", null);
        setIntField(term860, term860.getClass(), "sourcePosition", 0);
        setField(term860, term860.getClass(), "jsType", null);
        setField(term860, term860.getClass(), "parent", null);
        setField(term843, term843.getClass(), "first", term860);
        setIntField(term863, term863.getClass(), "type", 0);
        setField(term863, term863.getClass(), "next", null);
        setField(term863, term863.getClass(), "first", null);
        setField(term863, term863.getClass(), "last", null);
        setField(term863, term863.getClass(), "propListHead", null);
        setIntField(term863, term863.getClass(), "sourcePosition", 0);
        setField(term863, term863.getClass(), "jsType", null);
        setField(term863, term863.getClass(), "parent", null);
        setField(term843, term843.getClass(), "last", term863);
        setField(term866, term866.getClass(), "next", null);
        setIntField(term866, term866.getClass(), "type", 0);
        setIntField(term866, term866.getClass(), "intValue", 0);
        setField(term866, term866.getClass(), "objectValue", null);
        setField(term843, term843.getClass(), "propListHead", term866);
        setIntField(term843, term843.getClass(), "sourcePosition", -390501023);
        setField(term843, term843.getClass(), "jsType", null);
        setField(term843, term843.getClass(), "parent", null);
        term8532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8537 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8540 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term8532, term8532.getClass(), "type", 1272542218);
        setIntField(term8533, term8533.getClass(), "type", -18216811);
        setIntField(term8534, term8534.getClass(), "type", 0);
        setField(term8534, term8534.getClass(), "next", null);
        setField(term8534, term8534.getClass(), "first", null);
        setField(term8534, term8534.getClass(), "last", null);
        setField(term8534, term8534.getClass(), "propListHead", null);
        setIntField(term8534, term8534.getClass(), "sourcePosition", 0);
        setField(term8534, term8534.getClass(), "jsType", null);
        setField(term8534, term8534.getClass(), "parent", null);
        setField(term8533, term8533.getClass(), "next", term8534);
        setIntField(term8535, term8535.getClass(), "type", 0);
        setField(term8535, term8535.getClass(), "next", null);
        setField(term8535, term8535.getClass(), "first", null);
        setField(term8535, term8535.getClass(), "last", null);
        setField(term8535, term8535.getClass(), "propListHead", null);
        setIntField(term8535, term8535.getClass(), "sourcePosition", 0);
        setField(term8535, term8535.getClass(), "jsType", null);
        setField(term8535, term8535.getClass(), "parent", null);
        setField(term8533, term8533.getClass(), "first", term8535);
        setIntField(term8536, term8536.getClass(), "type", 0);
        setField(term8536, term8536.getClass(), "next", null);
        setField(term8536, term8536.getClass(), "first", null);
        setField(term8536, term8536.getClass(), "last", null);
        setField(term8536, term8536.getClass(), "propListHead", null);
        setIntField(term8536, term8536.getClass(), "sourcePosition", 0);
        setField(term8536, term8536.getClass(), "jsType", null);
        setField(term8536, term8536.getClass(), "parent", null);
        setField(term8533, term8533.getClass(), "last", term8536);
        setField(term8537, term8537.getClass(), "next", null);
        setIntField(term8537, term8537.getClass(), "type", 0);
        setIntField(term8537, term8537.getClass(), "intValue", 0);
        setField(term8537, term8537.getClass(), "objectValue", null);
        setField(term8533, term8533.getClass(), "propListHead", term8537);
        setIntField(term8533, term8533.getClass(), "sourcePosition", -1516995753);
        setField(term8533, term8533.getClass(), "jsType", null);
        setField(term8533, term8533.getClass(), "parent", null);
        setField(term8532, term8532.getClass(), "next", term8533);
        setIntField(term8538, term8538.getClass(), "type", 0);
        setField(term8538, term8538.getClass(), "next", null);
        setField(term8538, term8538.getClass(), "first", null);
        setField(term8538, term8538.getClass(), "last", null);
        setField(term8538, term8538.getClass(), "propListHead", null);
        setIntField(term8538, term8538.getClass(), "sourcePosition", 0);
        setField(term8538, term8538.getClass(), "jsType", null);
        setField(term8538, term8538.getClass(), "parent", null);
        setField(term8532, term8532.getClass(), "first", term8538);
        setIntField(term8539, term8539.getClass(), "type", 0);
        setField(term8539, term8539.getClass(), "next", null);
        setField(term8539, term8539.getClass(), "first", null);
        setField(term8539, term8539.getClass(), "last", null);
        setField(term8539, term8539.getClass(), "propListHead", null);
        setIntField(term8539, term8539.getClass(), "sourcePosition", 0);
        setField(term8539, term8539.getClass(), "jsType", null);
        setField(term8539, term8539.getClass(), "parent", null);
        setField(term8532, term8532.getClass(), "last", term8539);
        setField(term8540, term8540.getClass(), "next", null);
        setIntField(term8540, term8540.getClass(), "type", 0);
        setIntField(term8540, term8540.getClass(), "intValue", 0);
        setField(term8540, term8540.getClass(), "objectValue", null);
        setField(term8532, term8532.getClass(), "propListHead", term8540);
        setIntField(term8532, term8532.getClass(), "sourcePosition", -390501023);
        setField(term8532, term8532.getClass(), "jsType", null);
        setField(term8532, term8532.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term843;
        callMethod(klass, "referencesThis", argTypes, null, args);
        assertTrue(recursiveEquals(term843, term8532));
    }

};


