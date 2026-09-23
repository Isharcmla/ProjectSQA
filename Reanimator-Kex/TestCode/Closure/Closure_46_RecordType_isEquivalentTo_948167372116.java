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

public class RecordType_isEquivalentTo_948167372116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29647;
     Object term29783;
     Object term29853;
     Object term29856;

    public RecordType_isEquivalentTo_948167372116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29647 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term29687 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term29647, term29647.getClass(), "properties", term29687);
        term29783 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term29823 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term29783, term29783.getClass(), "properties", term29823);
        term29853 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term29854 = newInstance(Class.forName("java.util.TreeMap"));
        Object term29855 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term29854, term29854.getClass(), "comparator", null);
        setField(term29854, term29854.getClass(), "root", null);
        setIntField(term29854, term29854.getClass(), "size", 0);
        setIntField(term29854, term29854.getClass(), "modCount", 0);
        setField(term29854, term29854.getClass(), "entrySet", null);
        setField(term29855, term29855.getClass(), "m", term29854);
        setField(term29854, term29854.getClass(), "navigableKeySet", term29855);
        setField(term29854, term29854.getClass(), "descendingMap", null);
        setField(term29854, term29854.getClass(), "keySet", null);
        setField(term29854, term29854.getClass(), "values", null);
        setField(term29853, term29853.getClass(), "properties", term29854);
        setBooleanField(term29853, term29853.getClass(), "isFrozen", false);
        setField(term29853, term29853.getClass(), "className", null);
        setField(term29853, term29853.getClass(), "properties", null);
        setBooleanField(term29853, term29853.getClass(), "nativeType", false);
        setField(term29853, term29853.getClass(), "implicitPrototypeFallback", null);
        setField(term29853, term29853.getClass(), "ownerFunction", null);
        setBooleanField(term29853, term29853.getClass(), "prettyPrint", false);
        setBooleanField(term29853, term29853.getClass(), "visited", false);
        setField(term29853, term29853.getClass(), "docInfo", null);
        setBooleanField(term29853, term29853.getClass(), "unknown", false);
        setBooleanField(term29853, term29853.getClass(), "resolved", false);
        setField(term29853, term29853.getClass(), "resolveResult", null);
        setField(term29853, term29853.getClass(), "registry", null);
        term29856 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term29857 = newInstance(Class.forName("java.util.TreeMap"));
        Object term29858 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term29857, term29857.getClass(), "comparator", null);
        setField(term29857, term29857.getClass(), "root", null);
        setIntField(term29857, term29857.getClass(), "size", 0);
        setIntField(term29857, term29857.getClass(), "modCount", 0);
        setField(term29857, term29857.getClass(), "entrySet", null);
        setField(term29858, term29858.getClass(), "m", term29857);
        setField(term29857, term29857.getClass(), "navigableKeySet", term29858);
        setField(term29857, term29857.getClass(), "descendingMap", null);
        setField(term29857, term29857.getClass(), "keySet", null);
        setField(term29857, term29857.getClass(), "values", null);
        setField(term29856, term29856.getClass(), "properties", term29857);
        setBooleanField(term29856, term29856.getClass(), "isFrozen", false);
        setField(term29856, term29856.getClass(), "className", null);
        setField(term29856, term29856.getClass(), "properties", null);
        setBooleanField(term29856, term29856.getClass(), "nativeType", false);
        setField(term29856, term29856.getClass(), "implicitPrototypeFallback", null);
        setField(term29856, term29856.getClass(), "ownerFunction", null);
        setBooleanField(term29856, term29856.getClass(), "prettyPrint", false);
        setBooleanField(term29856, term29856.getClass(), "visited", false);
        setField(term29856, term29856.getClass(), "docInfo", null);
        setBooleanField(term29856, term29856.getClass(), "unknown", false);
        setBooleanField(term29856, term29856.getClass(), "resolved", false);
        setField(term29856, term29856.getClass(), "resolveResult", null);
        setField(term29856, term29856.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term29783;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term29647, args);
        assertTrue(recursiveEquals(term29647, term29853));
        assertTrue(recursiveEquals(term29783, term29856));
        assertTrue(recursiveEquals(retValue, true));
    }

};


