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

public class RecordType_isEquivalentTo_948167372105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27922;
     Object term28058;
     Object term28510;
     Object term28513;

    public RecordType_isEquivalentTo_948167372105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27922 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term27962 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term27922, term27922.getClass(), "properties", term27962);
        term28058 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term28098 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term28058, term28058.getClass(), "properties", term28098);
        term28510 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term28511 = newInstance(Class.forName("java.util.TreeMap"));
        Object term28512 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term28511, term28511.getClass(), "comparator", null);
        setField(term28511, term28511.getClass(), "root", null);
        setIntField(term28511, term28511.getClass(), "size", 0);
        setIntField(term28511, term28511.getClass(), "modCount", 0);
        setField(term28511, term28511.getClass(), "entrySet", null);
        setField(term28512, term28512.getClass(), "m", term28511);
        setField(term28511, term28511.getClass(), "navigableKeySet", term28512);
        setField(term28511, term28511.getClass(), "descendingMap", null);
        setField(term28511, term28511.getClass(), "keySet", null);
        setField(term28511, term28511.getClass(), "values", null);
        setField(term28510, term28510.getClass(), "properties", term28511);
        setBooleanField(term28510, term28510.getClass(), "isFrozen", false);
        setField(term28510, term28510.getClass(), "className", null);
        setField(term28510, term28510.getClass(), "properties", null);
        setBooleanField(term28510, term28510.getClass(), "nativeType", false);
        setField(term28510, term28510.getClass(), "implicitPrototypeFallback", null);
        setField(term28510, term28510.getClass(), "ownerFunction", null);
        setBooleanField(term28510, term28510.getClass(), "prettyPrint", false);
        setBooleanField(term28510, term28510.getClass(), "visited", false);
        setField(term28510, term28510.getClass(), "docInfo", null);
        setBooleanField(term28510, term28510.getClass(), "unknown", false);
        setBooleanField(term28510, term28510.getClass(), "resolved", false);
        setField(term28510, term28510.getClass(), "resolveResult", null);
        setField(term28510, term28510.getClass(), "registry", null);
        term28513 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term28514 = newInstance(Class.forName("java.util.TreeMap"));
        Object term28515 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term28514, term28514.getClass(), "comparator", null);
        setField(term28514, term28514.getClass(), "root", null);
        setIntField(term28514, term28514.getClass(), "size", 0);
        setIntField(term28514, term28514.getClass(), "modCount", 0);
        setField(term28514, term28514.getClass(), "entrySet", null);
        setField(term28515, term28515.getClass(), "m", term28514);
        setField(term28514, term28514.getClass(), "navigableKeySet", term28515);
        setField(term28514, term28514.getClass(), "descendingMap", null);
        setField(term28514, term28514.getClass(), "keySet", null);
        setField(term28514, term28514.getClass(), "values", null);
        setField(term28513, term28513.getClass(), "properties", term28514);
        setBooleanField(term28513, term28513.getClass(), "isFrozen", false);
        setField(term28513, term28513.getClass(), "className", null);
        setField(term28513, term28513.getClass(), "properties", null);
        setBooleanField(term28513, term28513.getClass(), "nativeType", false);
        setField(term28513, term28513.getClass(), "implicitPrototypeFallback", null);
        setField(term28513, term28513.getClass(), "ownerFunction", null);
        setBooleanField(term28513, term28513.getClass(), "prettyPrint", false);
        setBooleanField(term28513, term28513.getClass(), "visited", false);
        setField(term28513, term28513.getClass(), "docInfo", null);
        setBooleanField(term28513, term28513.getClass(), "unknown", false);
        setBooleanField(term28513, term28513.getClass(), "resolved", false);
        setField(term28513, term28513.getClass(), "resolveResult", null);
        setField(term28513, term28513.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term28058;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term27922, args);
        assertTrue(recursiveEquals(term27922, term28510));
        assertTrue(recursiveEquals(term28058, term28513));
        assertTrue(recursiveEquals(retValue, true));
    }

};


