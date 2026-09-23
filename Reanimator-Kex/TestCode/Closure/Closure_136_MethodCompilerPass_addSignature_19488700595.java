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

public class MethodCompilerPass_addSignature_19488700595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188;

    public MethodCompilerPass_addSignature_19488700595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term192 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term201 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term211 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term188, term188.getClass(), "type", -1968847291);
        setIntField(term190, term190.getClass(), "type", 454281060);
        setIntField(term192, term192.getClass(), "type", 0);
        setField(term192, term192.getClass(), "next", null);
        setField(term192, term192.getClass(), "first", null);
        setField(term192, term192.getClass(), "last", null);
        setField(term192, term192.getClass(), "propListHead", null);
        setIntField(term192, term192.getClass(), "sourcePosition", 0);
        setField(term192, term192.getClass(), "jsType", null);
        setField(term192, term192.getClass(), "parent", null);
        setField(term190, term190.getClass(), "next", term192);
        setIntField(term195, term195.getClass(), "type", 0);
        setField(term195, term195.getClass(), "next", null);
        setField(term195, term195.getClass(), "first", null);
        setField(term195, term195.getClass(), "last", null);
        setField(term195, term195.getClass(), "propListHead", null);
        setIntField(term195, term195.getClass(), "sourcePosition", 0);
        setField(term195, term195.getClass(), "jsType", null);
        setField(term195, term195.getClass(), "parent", null);
        setField(term190, term190.getClass(), "first", term195);
        setIntField(term198, term198.getClass(), "type", 0);
        setField(term198, term198.getClass(), "next", null);
        setField(term198, term198.getClass(), "first", null);
        setField(term198, term198.getClass(), "last", null);
        setField(term198, term198.getClass(), "propListHead", null);
        setIntField(term198, term198.getClass(), "sourcePosition", 0);
        setField(term198, term198.getClass(), "jsType", null);
        setField(term198, term198.getClass(), "parent", null);
        setField(term190, term190.getClass(), "last", term198);
        setField(term201, term201.getClass(), "next", null);
        setIntField(term201, term201.getClass(), "type", 0);
        setIntField(term201, term201.getClass(), "intValue", 0);
        setField(term201, term201.getClass(), "objectValue", null);
        setField(term190, term190.getClass(), "propListHead", term201);
        setIntField(term190, term190.getClass(), "sourcePosition", -1048298087);
        setField(term190, term190.getClass(), "jsType", null);
        setField(term190, term190.getClass(), "parent", null);
        setField(term188, term188.getClass(), "next", term190);
        setIntField(term205, term205.getClass(), "type", 0);
        setField(term205, term205.getClass(), "next", null);
        setField(term205, term205.getClass(), "first", null);
        setField(term205, term205.getClass(), "last", null);
        setField(term205, term205.getClass(), "propListHead", null);
        setIntField(term205, term205.getClass(), "sourcePosition", 0);
        setField(term205, term205.getClass(), "jsType", null);
        setField(term205, term205.getClass(), "parent", null);
        setField(term188, term188.getClass(), "first", term205);
        setIntField(term208, term208.getClass(), "type", 0);
        setField(term208, term208.getClass(), "next", null);
        setField(term208, term208.getClass(), "first", null);
        setField(term208, term208.getClass(), "last", null);
        setField(term208, term208.getClass(), "propListHead", null);
        setIntField(term208, term208.getClass(), "sourcePosition", 0);
        setField(term208, term208.getClass(), "jsType", null);
        setField(term208, term208.getClass(), "parent", null);
        setField(term188, term188.getClass(), "last", term208);
        setField(term211, term211.getClass(), "next", null);
        setIntField(term211, term211.getClass(), "type", 0);
        setIntField(term211, term211.getClass(), "intValue", 0);
        setField(term211, term211.getClass(), "objectValue", null);
        setField(term188, term188.getClass(), "propListHead", term211);
        setIntField(term188, term188.getClass(), "sourcePosition", 292681826);
        setField(term188, term188.getClass(), "jsType", null);
        setField(term188, term188.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MethodCompilerPass");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = "MuLcgQHgqz";
        args[1] = term188;
        args[2] = "xxtlPwDYFs";
        try {
            callMethod(klass, "addSignature", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


