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

public class RecordType_isSubtype_97399561159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9359;
     Object term9413;

    public RecordType_isSubtype_97399561159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9359 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term9399 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term9359, term9359.getClass(), "properties", term9399);
        term9413 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term9414 = newInstance(Class.forName("java.util.TreeMap"));
        Object term9415 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term9414, term9414.getClass(), "comparator", null);
        setField(term9414, term9414.getClass(), "root", null);
        setIntField(term9414, term9414.getClass(), "size", 0);
        setIntField(term9414, term9414.getClass(), "modCount", 0);
        setField(term9414, term9414.getClass(), "entrySet", null);
        setField(term9415, term9415.getClass(), "m", term9414);
        setField(term9414, term9414.getClass(), "navigableKeySet", term9415);
        setField(term9414, term9414.getClass(), "descendingMap", null);
        setField(term9414, term9414.getClass(), "keySet", null);
        setField(term9414, term9414.getClass(), "values", null);
        setField(term9413, term9413.getClass(), "properties", term9414);
        setBooleanField(term9413, term9413.getClass(), "isFrozen", false);
        setField(term9413, term9413.getClass(), "className", null);
        setField(term9413, term9413.getClass(), "properties", null);
        setBooleanField(term9413, term9413.getClass(), "nativeType", false);
        setField(term9413, term9413.getClass(), "implicitPrototypeFallback", null);
        setField(term9413, term9413.getClass(), "ownerFunction", null);
        setBooleanField(term9413, term9413.getClass(), "prettyPrint", false);
        setBooleanField(term9413, term9413.getClass(), "visited", false);
        setField(term9413, term9413.getClass(), "docInfo", null);
        setBooleanField(term9413, term9413.getClass(), "unknown", false);
        setBooleanField(term9413, term9413.getClass(), "resolved", false);
        setField(term9413, term9413.getClass(), "resolveResult", null);
        setField(term9413, term9413.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term9359;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term9359, term9413));
        assertTrue(recursiveEquals(retValue, true));
    }

};


