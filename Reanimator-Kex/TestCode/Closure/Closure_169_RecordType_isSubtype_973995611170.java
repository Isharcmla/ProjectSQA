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

public class RecordType_isSubtype_973995611170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71900;
     Object term72338;

    public RecordType_isSubtype_973995611170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71900 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term71940 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term71900, term71900.getClass(), "properties", term71940);
        term72338 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term72339 = newInstance(Class.forName("java.util.TreeMap"));
        Object term72340 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term72339, term72339.getClass(), "comparator", null);
        setField(term72339, term72339.getClass(), "root", null);
        setIntField(term72339, term72339.getClass(), "size", 0);
        setIntField(term72339, term72339.getClass(), "modCount", 0);
        setField(term72339, term72339.getClass(), "entrySet", null);
        setField(term72340, term72340.getClass(), "m", term72339);
        setField(term72339, term72339.getClass(), "navigableKeySet", term72340);
        setField(term72339, term72339.getClass(), "descendingMap", null);
        setField(term72339, term72339.getClass(), "keySet", null);
        setField(term72339, term72339.getClass(), "values", null);
        setField(term72338, term72338.getClass(), "properties", term72339);
        setBooleanField(term72338, term72338.getClass(), "declared", false);
        setBooleanField(term72338, term72338.getClass(), "isFrozen", false);
        setField(term72338, term72338.getClass(), "className", null);
        setField(term72338, term72338.getClass(), "properties", null);
        setBooleanField(term72338, term72338.getClass(), "nativeType", false);
        setField(term72338, term72338.getClass(), "implicitPrototypeFallback", null);
        setField(term72338, term72338.getClass(), "ownerFunction", null);
        setBooleanField(term72338, term72338.getClass(), "prettyPrint", false);
        setBooleanField(term72338, term72338.getClass(), "visited", false);
        setField(term72338, term72338.getClass(), "docInfo", null);
        setBooleanField(term72338, term72338.getClass(), "unknown", false);
        setBooleanField(term72338, term72338.getClass(), "resolved", false);
        setField(term72338, term72338.getClass(), "resolveResult", null);
        setBooleanField(term72338, term72338.getClass(), "inTemplatedCheckVisit", false);
        setField(term72338, term72338.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term71900;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term71900, term72338));
        assertTrue(recursiveEquals(retValue, true));
    }

};


