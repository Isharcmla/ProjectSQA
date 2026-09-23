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

public class RecordType_isEquivalentTo_948167372184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58092;
     Object term58228;
     Object term58953;
     Object term58956;

    public RecordType_isEquivalentTo_948167372184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58092 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term58132 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term58092, term58092.getClass(), "properties", term58132);
        term58228 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term58268 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term58228, term58228.getClass(), "properties", term58268);
        term58953 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term58954 = newInstance(Class.forName("java.util.TreeMap"));
        Object term58955 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term58954, term58954.getClass(), "comparator", null);
        setField(term58954, term58954.getClass(), "root", null);
        setIntField(term58954, term58954.getClass(), "size", 0);
        setIntField(term58954, term58954.getClass(), "modCount", 0);
        setField(term58954, term58954.getClass(), "entrySet", null);
        setField(term58955, term58955.getClass(), "m", term58954);
        setField(term58954, term58954.getClass(), "navigableKeySet", term58955);
        setField(term58954, term58954.getClass(), "descendingMap", null);
        setField(term58954, term58954.getClass(), "keySet", null);
        setField(term58954, term58954.getClass(), "values", null);
        setField(term58953, term58953.getClass(), "properties", term58954);
        setBooleanField(term58953, term58953.getClass(), "isFrozen", false);
        setField(term58953, term58953.getClass(), "className", null);
        setField(term58953, term58953.getClass(), "properties", null);
        setBooleanField(term58953, term58953.getClass(), "nativeType", false);
        setField(term58953, term58953.getClass(), "implicitPrototypeFallback", null);
        setField(term58953, term58953.getClass(), "ownerFunction", null);
        setBooleanField(term58953, term58953.getClass(), "prettyPrint", false);
        setBooleanField(term58953, term58953.getClass(), "visited", false);
        setField(term58953, term58953.getClass(), "docInfo", null);
        setBooleanField(term58953, term58953.getClass(), "unknown", false);
        setBooleanField(term58953, term58953.getClass(), "resolved", false);
        setField(term58953, term58953.getClass(), "resolveResult", null);
        setField(term58953, term58953.getClass(), "registry", null);
        term58956 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term58957 = newInstance(Class.forName("java.util.TreeMap"));
        Object term58958 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term58957, term58957.getClass(), "comparator", null);
        setField(term58957, term58957.getClass(), "root", null);
        setIntField(term58957, term58957.getClass(), "size", 0);
        setIntField(term58957, term58957.getClass(), "modCount", 0);
        setField(term58957, term58957.getClass(), "entrySet", null);
        setField(term58958, term58958.getClass(), "m", term58957);
        setField(term58957, term58957.getClass(), "navigableKeySet", term58958);
        setField(term58957, term58957.getClass(), "descendingMap", null);
        setField(term58957, term58957.getClass(), "keySet", null);
        setField(term58957, term58957.getClass(), "values", null);
        setField(term58956, term58956.getClass(), "properties", term58957);
        setBooleanField(term58956, term58956.getClass(), "isFrozen", false);
        setField(term58956, term58956.getClass(), "className", null);
        setField(term58956, term58956.getClass(), "properties", null);
        setBooleanField(term58956, term58956.getClass(), "nativeType", false);
        setField(term58956, term58956.getClass(), "implicitPrototypeFallback", null);
        setField(term58956, term58956.getClass(), "ownerFunction", null);
        setBooleanField(term58956, term58956.getClass(), "prettyPrint", false);
        setBooleanField(term58956, term58956.getClass(), "visited", false);
        setField(term58956, term58956.getClass(), "docInfo", null);
        setBooleanField(term58956, term58956.getClass(), "unknown", false);
        setBooleanField(term58956, term58956.getClass(), "resolved", false);
        setField(term58956, term58956.getClass(), "resolveResult", null);
        setField(term58956, term58956.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term58228;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term58092, args);
        assertTrue(recursiveEquals(term58092, term58953));
        assertTrue(recursiveEquals(term58228, term58956));
        assertTrue(recursiveEquals(retValue, true));
    }

};


