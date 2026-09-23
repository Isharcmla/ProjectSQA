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

public class RecordType_isSubtype_97399561162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11281;
     Object term11335;

    public RecordType_isSubtype_97399561162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11281 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term11321 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term11281, term11281.getClass(), "properties", term11321);
        term11335 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term11336 = newInstance(Class.forName("java.util.TreeMap"));
        Object term11337 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term11336, term11336.getClass(), "comparator", null);
        setField(term11336, term11336.getClass(), "root", null);
        setIntField(term11336, term11336.getClass(), "size", 0);
        setIntField(term11336, term11336.getClass(), "modCount", 0);
        setField(term11336, term11336.getClass(), "entrySet", null);
        setField(term11337, term11337.getClass(), "m", term11336);
        setField(term11336, term11336.getClass(), "navigableKeySet", term11337);
        setField(term11336, term11336.getClass(), "descendingMap", null);
        setField(term11336, term11336.getClass(), "keySet", null);
        setField(term11336, term11336.getClass(), "values", null);
        setField(term11335, term11335.getClass(), "properties", term11336);
        setBooleanField(term11335, term11335.getClass(), "isFrozen", false);
        setField(term11335, term11335.getClass(), "className", null);
        setField(term11335, term11335.getClass(), "properties", null);
        setBooleanField(term11335, term11335.getClass(), "nativeType", false);
        setField(term11335, term11335.getClass(), "implicitPrototypeFallback", null);
        setField(term11335, term11335.getClass(), "ownerFunction", null);
        setBooleanField(term11335, term11335.getClass(), "prettyPrint", false);
        setBooleanField(term11335, term11335.getClass(), "visited", false);
        setField(term11335, term11335.getClass(), "docInfo", null);
        setBooleanField(term11335, term11335.getClass(), "unknown", false);
        setBooleanField(term11335, term11335.getClass(), "resolved", false);
        setField(term11335, term11335.getClass(), "resolveResult", null);
        setField(term11335, term11335.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term11281;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term11281, term11335));
        assertTrue(recursiveEquals(retValue, true));
    }

};


