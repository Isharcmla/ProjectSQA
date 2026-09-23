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

public class RecordType_isSubtype_973995611178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57397;
     Object term57451;

    public RecordType_isSubtype_973995611178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57397 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term57437 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term57397, term57397.getClass(), "properties", term57437);
        term57451 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term57452 = newInstance(Class.forName("java.util.TreeMap"));
        Object term57453 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term57452, term57452.getClass(), "comparator", null);
        setField(term57452, term57452.getClass(), "root", null);
        setIntField(term57452, term57452.getClass(), "size", 0);
        setIntField(term57452, term57452.getClass(), "modCount", 0);
        setField(term57452, term57452.getClass(), "entrySet", null);
        setField(term57453, term57453.getClass(), "m", term57452);
        setField(term57452, term57452.getClass(), "navigableKeySet", term57453);
        setField(term57452, term57452.getClass(), "descendingMap", null);
        setField(term57452, term57452.getClass(), "keySet", null);
        setField(term57452, term57452.getClass(), "values", null);
        setField(term57451, term57451.getClass(), "properties", term57452);
        setBooleanField(term57451, term57451.getClass(), "isFrozen", false);
        setField(term57451, term57451.getClass(), "className", null);
        setField(term57451, term57451.getClass(), "properties", null);
        setBooleanField(term57451, term57451.getClass(), "nativeType", false);
        setField(term57451, term57451.getClass(), "implicitPrototypeFallback", null);
        setField(term57451, term57451.getClass(), "ownerFunction", null);
        setBooleanField(term57451, term57451.getClass(), "prettyPrint", false);
        setBooleanField(term57451, term57451.getClass(), "visited", false);
        setField(term57451, term57451.getClass(), "docInfo", null);
        setBooleanField(term57451, term57451.getClass(), "unknown", false);
        setBooleanField(term57451, term57451.getClass(), "resolved", false);
        setField(term57451, term57451.getClass(), "resolveResult", null);
        setField(term57451, term57451.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term57397;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term57397, term57451));
        assertTrue(recursiveEquals(retValue, true));
    }

};


