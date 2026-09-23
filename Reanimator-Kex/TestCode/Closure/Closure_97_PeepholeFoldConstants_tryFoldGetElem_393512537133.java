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

public class PeepholeFoldConstants_tryFoldGetElem_393512537133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25514;
     Object term25619;
     Object term26002;
     Object term26003;
     Object term26004;
     Object term25993;

    public PeepholeFoldConstants_tryFoldGetElem_393512537133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25514 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term25619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25619, term25619.getClass(), "type", 35);
        term26002 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term26002, term26002.getClass(), "currentTraversal", null);
        term26003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26003, term26003.getClass(), "type", 35);
        setField(term26003, term26003.getClass(), "next", null);
        setField(term26003, term26003.getClass(), "first", null);
        setField(term26003, term26003.getClass(), "last", null);
        setField(term26003, term26003.getClass(), "propListHead", null);
        setIntField(term26003, term26003.getClass(), "sourcePosition", 0);
        setField(term26003, term26003.getClass(), "jsType", null);
        setField(term26003, term26003.getClass(), "parent", null);
        term26004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26004, term26004.getClass(), "type", 35);
        setField(term26004, term26004.getClass(), "next", null);
        setField(term26004, term26004.getClass(), "first", null);
        setField(term26004, term26004.getClass(), "last", null);
        setField(term26004, term26004.getClass(), "propListHead", null);
        setIntField(term26004, term26004.getClass(), "sourcePosition", 0);
        setField(term26004, term26004.getClass(), "jsType", null);
        setField(term26004, term26004.getClass(), "parent", null);
        term25993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25993, term25993.getClass(), "type", 35);
        setField(term25993, term25993.getClass(), "next", null);
        setField(term25993, term25993.getClass(), "first", null);
        setField(term25993, term25993.getClass(), "last", null);
        setField(term25993, term25993.getClass(), "propListHead", null);
        setIntField(term25993, term25993.getClass(), "sourcePosition", 0);
        setField(term25993, term25993.getClass(), "jsType", null);
        setField(term25993, term25993.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term25619;
        args[1] = term25619;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldGetElem", argTypes, term25514, args);
        assertTrue(recursiveEquals(term25514, term26002));
        assertTrue(recursiveEquals(term25619, term26003));
        assertTrue(recursiveEquals(term25619, term26004));
        assertTrue(recursiveEquals(retValue, term25993));
    }

};


