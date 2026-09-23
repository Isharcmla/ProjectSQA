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

public class PeepholeFoldConstants_tryReduceVoid_942546715268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43510;
     Object term43670;
     Object term43962;
     Object term43964;
     Object term43935;

    public PeepholeFoldConstants_tryReduceVoid_942546715268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43510 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term43600 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term43600, term43600.getClass(), "compiler", null);
        setField(term43510, term43510.getClass(), "currentTraversal", term43600);
        term43670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43740, term43740.getClass(), "type", 109);
        setField(term43670, term43670.getClass(), "first", term43740);
        setIntField(term43670, term43670.getClass(), "type", 109);
        term43962 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term43963 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term43963, term43963.getClass(), "compiler", null);
        setField(term43963, term43963.getClass(), "callback", null);
        setField(term43963, term43963.getClass(), "curNode", null);
        setField(term43963, term43963.getClass(), "scopes", null);
        setField(term43963, term43963.getClass(), "scopeRoots", null);
        setField(term43963, term43963.getClass(), "cfgs", null);
        setField(term43963, term43963.getClass(), "sourceName", null);
        setField(term43963, term43963.getClass(), "scopeCreator", null);
        setField(term43963, term43963.getClass(), "scopeCallback", null);
        setField(term43962, term43962.getClass(), "currentTraversal", term43963);
        term43964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43964, term43964.getClass(), "type", 109);
        setField(term43964, term43964.getClass(), "next", null);
        setIntField(term43965, term43965.getClass(), "type", 109);
        setField(term43965, term43965.getClass(), "next", null);
        setField(term43965, term43965.getClass(), "first", null);
        setField(term43965, term43965.getClass(), "last", null);
        setField(term43965, term43965.getClass(), "propListHead", null);
        setIntField(term43965, term43965.getClass(), "sourcePosition", 0);
        setField(term43965, term43965.getClass(), "jsType", null);
        setField(term43965, term43965.getClass(), "parent", null);
        setField(term43964, term43964.getClass(), "first", term43965);
        setField(term43964, term43964.getClass(), "last", null);
        setField(term43964, term43964.getClass(), "propListHead", null);
        setIntField(term43964, term43964.getClass(), "sourcePosition", 0);
        setField(term43964, term43964.getClass(), "jsType", null);
        setField(term43964, term43964.getClass(), "parent", null);
        term43935 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43935, term43935.getClass(), "type", 109);
        setField(term43935, term43935.getClass(), "next", null);
        setIntField(term43937, term43937.getClass(), "type", 109);
        setField(term43937, term43937.getClass(), "next", null);
        setField(term43937, term43937.getClass(), "first", null);
        setField(term43937, term43937.getClass(), "last", null);
        setField(term43937, term43937.getClass(), "propListHead", null);
        setIntField(term43937, term43937.getClass(), "sourcePosition", 0);
        setField(term43937, term43937.getClass(), "jsType", null);
        setField(term43937, term43937.getClass(), "parent", null);
        setField(term43935, term43935.getClass(), "first", term43937);
        setField(term43935, term43935.getClass(), "last", null);
        setField(term43935, term43935.getClass(), "propListHead", null);
        setIntField(term43935, term43935.getClass(), "sourcePosition", 0);
        setField(term43935, term43935.getClass(), "jsType", null);
        setField(term43935, term43935.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term43670;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term43510, args);
        assertTrue(recursiveEquals(term43510, term43962));
        assertTrue(recursiveEquals(term43670, term43964));
        assertTrue(recursiveEquals(retValue, term43935));
    }

};


