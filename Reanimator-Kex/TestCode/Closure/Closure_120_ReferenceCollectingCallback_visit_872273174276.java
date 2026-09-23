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

public class ReferenceCollectingCallback_visit_872273174276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55663;
     Object term55755;
     Object term55847;
     Object term56520;
     Object term56521;
     Object term56522;

    public ReferenceCollectingCallback_visit_872273174276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55663 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term55755 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term55755, term55755.getClass(), "type", -39);
        term55847 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term56520 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term56520, term56520.getClass(), "referenceMap", null);
        setField(term56520, term56520.getClass(), "blockStack", null);
        setField(term56520, term56520.getClass(), "behavior", null);
        setField(term56520, term56520.getClass(), "compiler", null);
        setField(term56520, term56520.getClass(), "varFilter", null);
        term56521 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term56521, term56521.getClass(), "str", null);
        setIntField(term56521, term56521.getClass(), "type", -39);
        setField(term56521, term56521.getClass(), "next", null);
        setField(term56521, term56521.getClass(), "first", null);
        setField(term56521, term56521.getClass(), "last", null);
        setField(term56521, term56521.getClass(), "propListHead", null);
        setIntField(term56521, term56521.getClass(), "sourcePosition", 0);
        setField(term56521, term56521.getClass(), "jsType", null);
        setField(term56521, term56521.getClass(), "parent", null);
        term56522 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term56522, term56522.getClass(), "str", null);
        setIntField(term56522, term56522.getClass(), "type", 0);
        setField(term56522, term56522.getClass(), "next", null);
        setField(term56522, term56522.getClass(), "first", null);
        setField(term56522, term56522.getClass(), "last", null);
        setField(term56522, term56522.getClass(), "propListHead", null);
        setIntField(term56522, term56522.getClass(), "sourcePosition", 0);
        setField(term56522, term56522.getClass(), "jsType", null);
        setField(term56522, term56522.getClass(), "parent", null);
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
        args[1] = term55755;
        args[2] = term55847;
        callMethod(klass, "visit", argTypes, term55663, args);
        assertTrue(recursiveEquals(term55663, term56520));
        assertTrue(recursiveEquals(term55755, term56522));
        assertTrue(recursiveEquals(term55847, null));
    }

};


