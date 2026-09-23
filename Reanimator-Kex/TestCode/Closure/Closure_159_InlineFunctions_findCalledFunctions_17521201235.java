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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class InlineFunctions_findCalledFunctions_17521201235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term870;
     Object term901;

    public InlineFunctions_findCalledFunctions_17521201235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term871 = new HashMap();
        HashMap term886 = new HashMap();
        term870 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        setField(term870, term870.getClass(), "fns", term871);
        setField(term870, term870.getClass(), "anonFns", term886);
        setField(term870, term870.getClass(), "compiler", null);
        setField(term870, term870.getClass(), "injector", null);
        setBooleanField(term870, term870.getClass(), "blockFunctionInliningEnabled", false);
        setBooleanField(term870, term870.getClass(), "inlineGlobalFunctions", false);
        setBooleanField(term870, term870.getClass(), "inlineLocalFunctions", false);
        setField(term870, term870.getClass(), "specializationState", null);
        term901 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term903 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term905 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term908 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term911 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term914 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term924 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term901, term901.getClass(), "type", -159494544);
        setIntField(term903, term903.getClass(), "type", 388157121);
        setIntField(term905, term905.getClass(), "type", 0);
        setField(term905, term905.getClass(), "next", null);
        setField(term905, term905.getClass(), "first", null);
        setField(term905, term905.getClass(), "last", null);
        setField(term905, term905.getClass(), "propListHead", null);
        setIntField(term905, term905.getClass(), "sourcePosition", 0);
        setField(term905, term905.getClass(), "jsType", null);
        setField(term905, term905.getClass(), "parent", null);
        setField(term903, term903.getClass(), "next", term905);
        setIntField(term908, term908.getClass(), "type", 0);
        setField(term908, term908.getClass(), "next", null);
        setField(term908, term908.getClass(), "first", null);
        setField(term908, term908.getClass(), "last", null);
        setField(term908, term908.getClass(), "propListHead", null);
        setIntField(term908, term908.getClass(), "sourcePosition", 0);
        setField(term908, term908.getClass(), "jsType", null);
        setField(term908, term908.getClass(), "parent", null);
        setField(term903, term903.getClass(), "first", term908);
        setIntField(term911, term911.getClass(), "type", 0);
        setField(term911, term911.getClass(), "next", null);
        setField(term911, term911.getClass(), "first", null);
        setField(term911, term911.getClass(), "last", null);
        setField(term911, term911.getClass(), "propListHead", null);
        setIntField(term911, term911.getClass(), "sourcePosition", 0);
        setField(term911, term911.getClass(), "jsType", null);
        setField(term911, term911.getClass(), "parent", null);
        setField(term903, term903.getClass(), "last", term911);
        setField(term914, term914.getClass(), "next", null);
        setIntField(term914, term914.getClass(), "type", 0);
        setIntField(term914, term914.getClass(), "intValue", 0);
        setField(term914, term914.getClass(), "objectValue", null);
        setField(term903, term903.getClass(), "propListHead", term914);
        setIntField(term903, term903.getClass(), "sourcePosition", 1270666529);
        setField(term903, term903.getClass(), "jsType", null);
        setField(term903, term903.getClass(), "parent", null);
        setField(term901, term901.getClass(), "next", term903);
        setIntField(term918, term918.getClass(), "type", 0);
        setField(term918, term918.getClass(), "next", null);
        setField(term918, term918.getClass(), "first", null);
        setField(term918, term918.getClass(), "last", null);
        setField(term918, term918.getClass(), "propListHead", null);
        setIntField(term918, term918.getClass(), "sourcePosition", 0);
        setField(term918, term918.getClass(), "jsType", null);
        setField(term918, term918.getClass(), "parent", null);
        setField(term901, term901.getClass(), "first", term918);
        setIntField(term921, term921.getClass(), "type", 0);
        setField(term921, term921.getClass(), "next", null);
        setField(term921, term921.getClass(), "first", null);
        setField(term921, term921.getClass(), "last", null);
        setField(term921, term921.getClass(), "propListHead", null);
        setIntField(term921, term921.getClass(), "sourcePosition", 0);
        setField(term921, term921.getClass(), "jsType", null);
        setField(term921, term921.getClass(), "parent", null);
        setField(term901, term901.getClass(), "last", term921);
        setField(term924, term924.getClass(), "next", null);
        setIntField(term924, term924.getClass(), "type", 0);
        setIntField(term924, term924.getClass(), "intValue", 0);
        setField(term924, term924.getClass(), "objectValue", null);
        setField(term901, term901.getClass(), "propListHead", term924);
        setIntField(term901, term901.getClass(), "sourcePosition", -1146679443);
        setField(term901, term901.getClass(), "jsType", null);
        setField(term901, term901.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term901;
        try {
            callMethod(klass, "findCalledFunctions", argTypes, term870, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


