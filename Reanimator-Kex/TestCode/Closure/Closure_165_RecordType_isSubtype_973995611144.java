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

public class RecordType_isSubtype_973995611144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43925;
     Object term43979;

    public RecordType_isSubtype_973995611144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43925 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term43965 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term43925, term43925.getClass(), "properties", term43965);
        term43979 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term43980 = newInstance(Class.forName("java.util.TreeMap"));
        Object term43981 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term43980, term43980.getClass(), "comparator", null);
        setField(term43980, term43980.getClass(), "root", null);
        setIntField(term43980, term43980.getClass(), "size", 0);
        setIntField(term43980, term43980.getClass(), "modCount", 0);
        setField(term43980, term43980.getClass(), "entrySet", null);
        setField(term43981, term43981.getClass(), "m", term43980);
        setField(term43980, term43980.getClass(), "navigableKeySet", term43981);
        setField(term43980, term43980.getClass(), "descendingMap", null);
        setField(term43980, term43980.getClass(), "keySet", null);
        setField(term43980, term43980.getClass(), "values", null);
        setField(term43979, term43979.getClass(), "properties", term43980);
        setBooleanField(term43979, term43979.getClass(), "isFrozen", false);
        setField(term43979, term43979.getClass(), "className", null);
        setField(term43979, term43979.getClass(), "properties", null);
        setBooleanField(term43979, term43979.getClass(), "nativeType", false);
        setField(term43979, term43979.getClass(), "implicitPrototypeFallback", null);
        setField(term43979, term43979.getClass(), "ownerFunction", null);
        setBooleanField(term43979, term43979.getClass(), "prettyPrint", false);
        setBooleanField(term43979, term43979.getClass(), "visited", false);
        setField(term43979, term43979.getClass(), "docInfo", null);
        setBooleanField(term43979, term43979.getClass(), "unknown", false);
        setBooleanField(term43979, term43979.getClass(), "resolved", false);
        setField(term43979, term43979.getClass(), "resolveResult", null);
        setField(term43979, term43979.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term43925;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term43925, term43979));
        assertTrue(recursiveEquals(retValue, true));
    }

};


