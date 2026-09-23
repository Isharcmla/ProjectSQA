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

public class TypeCheck_isReference_170084483873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19770;
     Object term50086;

    public TypeCheck_isReference_170084483873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19780 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19783 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term19787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19793 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term19770, term19770.getClass(), "type", 2128383340);
        setIntField(term19772, term19772.getClass(), "type", -829088844);
        setIntField(term19774, term19774.getClass(), "type", 0);
        setField(term19774, term19774.getClass(), "next", null);
        setField(term19774, term19774.getClass(), "first", null);
        setField(term19774, term19774.getClass(), "last", null);
        setField(term19774, term19774.getClass(), "propListHead", null);
        setIntField(term19774, term19774.getClass(), "sourcePosition", 0);
        setField(term19774, term19774.getClass(), "jsType", null);
        setField(term19774, term19774.getClass(), "parent", null);
        setField(term19772, term19772.getClass(), "next", term19774);
        setIntField(term19777, term19777.getClass(), "type", 0);
        setField(term19777, term19777.getClass(), "next", null);
        setField(term19777, term19777.getClass(), "first", null);
        setField(term19777, term19777.getClass(), "last", null);
        setField(term19777, term19777.getClass(), "propListHead", null);
        setIntField(term19777, term19777.getClass(), "sourcePosition", 0);
        setField(term19777, term19777.getClass(), "jsType", null);
        setField(term19777, term19777.getClass(), "parent", null);
        setField(term19772, term19772.getClass(), "first", term19777);
        setIntField(term19780, term19780.getClass(), "type", 0);
        setField(term19780, term19780.getClass(), "next", null);
        setField(term19780, term19780.getClass(), "first", null);
        setField(term19780, term19780.getClass(), "last", null);
        setField(term19780, term19780.getClass(), "propListHead", null);
        setIntField(term19780, term19780.getClass(), "sourcePosition", 0);
        setField(term19780, term19780.getClass(), "jsType", null);
        setField(term19780, term19780.getClass(), "parent", null);
        setField(term19772, term19772.getClass(), "last", term19780);
        setField(term19783, term19783.getClass(), "next", null);
        setIntField(term19783, term19783.getClass(), "type", 0);
        setIntField(term19783, term19783.getClass(), "intValue", 0);
        setField(term19783, term19783.getClass(), "objectValue", null);
        setField(term19772, term19772.getClass(), "propListHead", term19783);
        setIntField(term19772, term19772.getClass(), "sourcePosition", -1777140369);
        setField(term19772, term19772.getClass(), "jsType", null);
        setField(term19772, term19772.getClass(), "parent", null);
        setField(term19770, term19770.getClass(), "next", term19772);
        setIntField(term19787, term19787.getClass(), "type", 0);
        setField(term19787, term19787.getClass(), "next", null);
        setField(term19787, term19787.getClass(), "first", null);
        setField(term19787, term19787.getClass(), "last", null);
        setField(term19787, term19787.getClass(), "propListHead", null);
        setIntField(term19787, term19787.getClass(), "sourcePosition", 0);
        setField(term19787, term19787.getClass(), "jsType", null);
        setField(term19787, term19787.getClass(), "parent", null);
        setField(term19770, term19770.getClass(), "first", term19787);
        setIntField(term19790, term19790.getClass(), "type", 0);
        setField(term19790, term19790.getClass(), "next", null);
        setField(term19790, term19790.getClass(), "first", null);
        setField(term19790, term19790.getClass(), "last", null);
        setField(term19790, term19790.getClass(), "propListHead", null);
        setIntField(term19790, term19790.getClass(), "sourcePosition", 0);
        setField(term19790, term19790.getClass(), "jsType", null);
        setField(term19790, term19790.getClass(), "parent", null);
        setField(term19770, term19770.getClass(), "last", term19790);
        setField(term19793, term19793.getClass(), "next", null);
        setIntField(term19793, term19793.getClass(), "type", 0);
        setIntField(term19793, term19793.getClass(), "intValue", 0);
        setField(term19793, term19793.getClass(), "objectValue", null);
        setField(term19770, term19770.getClass(), "propListHead", term19793);
        setIntField(term19770, term19770.getClass(), "sourcePosition", 993627098);
        setField(term19770, term19770.getClass(), "jsType", null);
        setField(term19770, term19770.getClass(), "parent", null);
        term50086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50087 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50090 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50091 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term50092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50094 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term50086, term50086.getClass(), "type", 2128383340);
        setIntField(term50087, term50087.getClass(), "type", -829088844);
        setIntField(term50088, term50088.getClass(), "type", 0);
        setField(term50088, term50088.getClass(), "next", null);
        setField(term50088, term50088.getClass(), "first", null);
        setField(term50088, term50088.getClass(), "last", null);
        setField(term50088, term50088.getClass(), "propListHead", null);
        setIntField(term50088, term50088.getClass(), "sourcePosition", 0);
        setField(term50088, term50088.getClass(), "jsType", null);
        setField(term50088, term50088.getClass(), "parent", null);
        setField(term50087, term50087.getClass(), "next", term50088);
        setIntField(term50089, term50089.getClass(), "type", 0);
        setField(term50089, term50089.getClass(), "next", null);
        setField(term50089, term50089.getClass(), "first", null);
        setField(term50089, term50089.getClass(), "last", null);
        setField(term50089, term50089.getClass(), "propListHead", null);
        setIntField(term50089, term50089.getClass(), "sourcePosition", 0);
        setField(term50089, term50089.getClass(), "jsType", null);
        setField(term50089, term50089.getClass(), "parent", null);
        setField(term50087, term50087.getClass(), "first", term50089);
        setIntField(term50090, term50090.getClass(), "type", 0);
        setField(term50090, term50090.getClass(), "next", null);
        setField(term50090, term50090.getClass(), "first", null);
        setField(term50090, term50090.getClass(), "last", null);
        setField(term50090, term50090.getClass(), "propListHead", null);
        setIntField(term50090, term50090.getClass(), "sourcePosition", 0);
        setField(term50090, term50090.getClass(), "jsType", null);
        setField(term50090, term50090.getClass(), "parent", null);
        setField(term50087, term50087.getClass(), "last", term50090);
        setField(term50091, term50091.getClass(), "next", null);
        setIntField(term50091, term50091.getClass(), "type", 0);
        setIntField(term50091, term50091.getClass(), "intValue", 0);
        setField(term50091, term50091.getClass(), "objectValue", null);
        setField(term50087, term50087.getClass(), "propListHead", term50091);
        setIntField(term50087, term50087.getClass(), "sourcePosition", -1777140369);
        setField(term50087, term50087.getClass(), "jsType", null);
        setField(term50087, term50087.getClass(), "parent", null);
        setField(term50086, term50086.getClass(), "next", term50087);
        setIntField(term50092, term50092.getClass(), "type", 0);
        setField(term50092, term50092.getClass(), "next", null);
        setField(term50092, term50092.getClass(), "first", null);
        setField(term50092, term50092.getClass(), "last", null);
        setField(term50092, term50092.getClass(), "propListHead", null);
        setIntField(term50092, term50092.getClass(), "sourcePosition", 0);
        setField(term50092, term50092.getClass(), "jsType", null);
        setField(term50092, term50092.getClass(), "parent", null);
        setField(term50086, term50086.getClass(), "first", term50092);
        setIntField(term50093, term50093.getClass(), "type", 0);
        setField(term50093, term50093.getClass(), "next", null);
        setField(term50093, term50093.getClass(), "first", null);
        setField(term50093, term50093.getClass(), "last", null);
        setField(term50093, term50093.getClass(), "propListHead", null);
        setIntField(term50093, term50093.getClass(), "sourcePosition", 0);
        setField(term50093, term50093.getClass(), "jsType", null);
        setField(term50093, term50093.getClass(), "parent", null);
        setField(term50086, term50086.getClass(), "last", term50093);
        setField(term50094, term50094.getClass(), "next", null);
        setIntField(term50094, term50094.getClass(), "type", 0);
        setIntField(term50094, term50094.getClass(), "intValue", 0);
        setField(term50094, term50094.getClass(), "objectValue", null);
        setField(term50086, term50086.getClass(), "propListHead", term50094);
        setIntField(term50086, term50086.getClass(), "sourcePosition", 993627098);
        setField(term50086, term50086.getClass(), "jsType", null);
        setField(term50086, term50086.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term19770;
        Object retValue = callMethod(klass, "isReference", argTypes, null, args);
        assertTrue(recursiveEquals(term19770, term50086));
        assertTrue(recursiveEquals(retValue, false));
    }

};


