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

public class ReferenceCollectingCallback_isBlockBoundary_684698721745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194585;
     Object term194677;
     Object term194820;
     Object term194822;

    public ReferenceCollectingCallback_isBlockBoundary_684698721745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194585 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term194677 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term194769 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term194677, term194677.getClass(), "type", 98);
        setField(term194677, term194677.getClass(), "first", term194769);
        term194820 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term194821 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term194820, term194820.getClass(), "number", 0.0);
        setIntField(term194820, term194820.getClass(), "type", 98);
        setField(term194820, term194820.getClass(), "next", null);
        setDoubleField(term194821, term194821.getClass(), "number", 0.0);
        setIntField(term194821, term194821.getClass(), "type", 0);
        setField(term194821, term194821.getClass(), "next", null);
        setField(term194821, term194821.getClass(), "first", null);
        setField(term194821, term194821.getClass(), "last", null);
        setField(term194821, term194821.getClass(), "propListHead", null);
        setIntField(term194821, term194821.getClass(), "sourcePosition", 0);
        setField(term194821, term194821.getClass(), "jsType", null);
        setField(term194821, term194821.getClass(), "parent", null);
        setField(term194820, term194820.getClass(), "first", term194821);
        setField(term194820, term194820.getClass(), "last", null);
        setField(term194820, term194820.getClass(), "propListHead", null);
        setIntField(term194820, term194820.getClass(), "sourcePosition", 0);
        setField(term194820, term194820.getClass(), "jsType", null);
        setField(term194820, term194820.getClass(), "parent", null);
        term194822 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term194822, term194822.getClass(), "number", 0.0);
        setIntField(term194822, term194822.getClass(), "type", 0);
        setField(term194822, term194822.getClass(), "next", null);
        setField(term194822, term194822.getClass(), "first", null);
        setField(term194822, term194822.getClass(), "last", null);
        setField(term194822, term194822.getClass(), "propListHead", null);
        setIntField(term194822, term194822.getClass(), "sourcePosition", 0);
        setField(term194822, term194822.getClass(), "jsType", null);
        setField(term194822, term194822.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term194585;
        args[1] = term194677;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term194585, term194820));
        assertTrue(recursiveEquals(term194677, term194822));
        assertTrue(recursiveEquals(retValue, true));
    }

};


