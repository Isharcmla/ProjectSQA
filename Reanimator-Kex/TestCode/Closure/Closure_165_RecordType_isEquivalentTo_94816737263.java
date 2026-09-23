package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.Object;

public class RecordType_isEquivalentTo_94816737263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10195;
     Object term10331;
     Object term10401;
     Object term10404;

    public RecordType_isEquivalentTo_94816737263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10195 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term10235 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term10195, term10195.getClass(), "properties", term10235);
        term10331 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term10371 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term10331, term10331.getClass(), "properties", term10371);
        term10401 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term10402 = newInstance(Class.forName("java.util.TreeMap"));
        Object term10403 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term10402, term10402.getClass(), "comparator", null);
        setField(term10402, term10402.getClass(), "root", null);
        setIntField(term10402, term10402.getClass(), "size", 0);
        setIntField(term10402, term10402.getClass(), "modCount", 0);
        setField(term10402, term10402.getClass(), "entrySet", null);
        setField(term10403, term10403.getClass(), "m", term10402);
        setField(term10402, term10402.getClass(), "navigableKeySet", term10403);
        setField(term10402, term10402.getClass(), "descendingMap", null);
        setField(term10402, term10402.getClass(), "keySet", null);
        setField(term10402, term10402.getClass(), "values", null);
        setField(term10401, term10401.getClass(), "properties", term10402);
        setBooleanField(term10401, term10401.getClass(), "isFrozen", false);
        setField(term10401, term10401.getClass(), "className", null);
        setField(term10401, term10401.getClass(), "properties", null);
        setBooleanField(term10401, term10401.getClass(), "nativeType", false);
        setField(term10401, term10401.getClass(), "implicitPrototypeFallback", null);
        setField(term10401, term10401.getClass(), "ownerFunction", null);
        setBooleanField(term10401, term10401.getClass(), "prettyPrint", false);
        setBooleanField(term10401, term10401.getClass(), "visited", false);
        setField(term10401, term10401.getClass(), "docInfo", null);
        setBooleanField(term10401, term10401.getClass(), "unknown", false);
        setBooleanField(term10401, term10401.getClass(), "resolved", false);
        setField(term10401, term10401.getClass(), "resolveResult", null);
        setField(term10401, term10401.getClass(), "registry", null);
        term10404 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term10405 = newInstance(Class.forName("java.util.TreeMap"));
        Object term10406 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term10405, term10405.getClass(), "comparator", null);
        setField(term10405, term10405.getClass(), "root", null);
        setIntField(term10405, term10405.getClass(), "size", 0);
        setIntField(term10405, term10405.getClass(), "modCount", 0);
        setField(term10405, term10405.getClass(), "entrySet", null);
        setField(term10406, term10406.getClass(), "m", term10405);
        setField(term10405, term10405.getClass(), "navigableKeySet", term10406);
        setField(term10405, term10405.getClass(), "descendingMap", null);
        setField(term10405, term10405.getClass(), "keySet", null);
        setField(term10405, term10405.getClass(), "values", null);
        setField(term10404, term10404.getClass(), "properties", term10405);
        setBooleanField(term10404, term10404.getClass(), "isFrozen", false);
        setField(term10404, term10404.getClass(), "className", null);
        setField(term10404, term10404.getClass(), "properties", null);
        setBooleanField(term10404, term10404.getClass(), "nativeType", false);
        setField(term10404, term10404.getClass(), "implicitPrototypeFallback", null);
        setField(term10404, term10404.getClass(), "ownerFunction", null);
        setBooleanField(term10404, term10404.getClass(), "prettyPrint", false);
        setBooleanField(term10404, term10404.getClass(), "visited", false);
        setField(term10404, term10404.getClass(), "docInfo", null);
        setBooleanField(term10404, term10404.getClass(), "unknown", false);
        setBooleanField(term10404, term10404.getClass(), "resolved", false);
        setField(term10404, term10404.getClass(), "resolveResult", null);
        setField(term10404, term10404.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term10331;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term10195, args);
        assertTrue(recursiveEquals(term10195, term10401));
        assertTrue(recursiveEquals(term10331, term10404));
        assertTrue(recursiveEquals(retValue, true));
    }

};


