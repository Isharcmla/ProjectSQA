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

public class ReferenceCollectingCallback_visit_87227317474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14734;
     Object term14909;
     Object term14874;
     Object term15218;
     Object term15219;
     Object term15220;

    public ReferenceCollectingCallback_visit_87227317474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14734 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term14909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14909, term14909.getClass(), "type", 100);
        term14874 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14874, term14874.getClass(), "type", 100);
        setField(term14874, term14874.getClass(), "first", term14909);
        term15218 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term15218, term15218.getClass(), "referenceMap", null);
        setField(term15218, term15218.getClass(), "blockStack", null);
        setField(term15218, term15218.getClass(), "behavior", null);
        setField(term15218, term15218.getClass(), "compiler", null);
        setField(term15218, term15218.getClass(), "varFilter", null);
        term15219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15219, term15219.getClass(), "type", 100);
        setField(term15219, term15219.getClass(), "next", null);
        setField(term15219, term15219.getClass(), "first", null);
        setField(term15219, term15219.getClass(), "last", null);
        setField(term15219, term15219.getClass(), "propListHead", null);
        setIntField(term15219, term15219.getClass(), "sourcePosition", 0);
        setField(term15219, term15219.getClass(), "jsType", null);
        setField(term15219, term15219.getClass(), "parent", null);
        term15220 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15220, term15220.getClass(), "type", 100);
        setField(term15220, term15220.getClass(), "next", null);
        setIntField(term15221, term15221.getClass(), "type", 100);
        setField(term15221, term15221.getClass(), "next", null);
        setField(term15221, term15221.getClass(), "first", null);
        setField(term15221, term15221.getClass(), "last", null);
        setField(term15221, term15221.getClass(), "propListHead", null);
        setIntField(term15221, term15221.getClass(), "sourcePosition", 0);
        setField(term15221, term15221.getClass(), "jsType", null);
        setField(term15221, term15221.getClass(), "parent", null);
        setField(term15220, term15220.getClass(), "first", term15221);
        setField(term15220, term15220.getClass(), "last", null);
        setField(term15220, term15220.getClass(), "propListHead", null);
        setIntField(term15220, term15220.getClass(), "sourcePosition", 0);
        setField(term15220, term15220.getClass(), "jsType", null);
        setField(term15220, term15220.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term14909;
        args[2] = term14874;
        callMethod(klass, "visit", argTypes, term14734, args);
        assertTrue(recursiveEquals(term14734, term15218));
        assertTrue(recursiveEquals(term14909, term15220));
        assertTrue(recursiveEquals(term14874, null));
    }

};


