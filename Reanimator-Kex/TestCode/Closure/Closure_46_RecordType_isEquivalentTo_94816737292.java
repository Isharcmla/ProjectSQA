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

public class RecordType_isEquivalentTo_94816737292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20575;
     Object term20711;
     Object term20781;
     Object term20784;

    public RecordType_isEquivalentTo_94816737292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20575 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term20615 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term20575, term20575.getClass(), "properties", term20615);
        term20711 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term20751 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term20711, term20711.getClass(), "properties", term20751);
        term20781 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term20782 = newInstance(Class.forName("java.util.TreeMap"));
        Object term20783 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term20782, term20782.getClass(), "comparator", null);
        setField(term20782, term20782.getClass(), "root", null);
        setIntField(term20782, term20782.getClass(), "size", 0);
        setIntField(term20782, term20782.getClass(), "modCount", 0);
        setField(term20782, term20782.getClass(), "entrySet", null);
        setField(term20783, term20783.getClass(), "m", term20782);
        setField(term20782, term20782.getClass(), "navigableKeySet", term20783);
        setField(term20782, term20782.getClass(), "descendingMap", null);
        setField(term20782, term20782.getClass(), "keySet", null);
        setField(term20782, term20782.getClass(), "values", null);
        setField(term20781, term20781.getClass(), "properties", term20782);
        setBooleanField(term20781, term20781.getClass(), "isFrozen", false);
        setField(term20781, term20781.getClass(), "className", null);
        setField(term20781, term20781.getClass(), "properties", null);
        setBooleanField(term20781, term20781.getClass(), "nativeType", false);
        setField(term20781, term20781.getClass(), "implicitPrototypeFallback", null);
        setField(term20781, term20781.getClass(), "ownerFunction", null);
        setBooleanField(term20781, term20781.getClass(), "prettyPrint", false);
        setBooleanField(term20781, term20781.getClass(), "visited", false);
        setField(term20781, term20781.getClass(), "docInfo", null);
        setBooleanField(term20781, term20781.getClass(), "unknown", false);
        setBooleanField(term20781, term20781.getClass(), "resolved", false);
        setField(term20781, term20781.getClass(), "resolveResult", null);
        setField(term20781, term20781.getClass(), "registry", null);
        term20784 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term20785 = newInstance(Class.forName("java.util.TreeMap"));
        Object term20786 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term20785, term20785.getClass(), "comparator", null);
        setField(term20785, term20785.getClass(), "root", null);
        setIntField(term20785, term20785.getClass(), "size", 0);
        setIntField(term20785, term20785.getClass(), "modCount", 0);
        setField(term20785, term20785.getClass(), "entrySet", null);
        setField(term20786, term20786.getClass(), "m", term20785);
        setField(term20785, term20785.getClass(), "navigableKeySet", term20786);
        setField(term20785, term20785.getClass(), "descendingMap", null);
        setField(term20785, term20785.getClass(), "keySet", null);
        setField(term20785, term20785.getClass(), "values", null);
        setField(term20784, term20784.getClass(), "properties", term20785);
        setBooleanField(term20784, term20784.getClass(), "isFrozen", false);
        setField(term20784, term20784.getClass(), "className", null);
        setField(term20784, term20784.getClass(), "properties", null);
        setBooleanField(term20784, term20784.getClass(), "nativeType", false);
        setField(term20784, term20784.getClass(), "implicitPrototypeFallback", null);
        setField(term20784, term20784.getClass(), "ownerFunction", null);
        setBooleanField(term20784, term20784.getClass(), "prettyPrint", false);
        setBooleanField(term20784, term20784.getClass(), "visited", false);
        setField(term20784, term20784.getClass(), "docInfo", null);
        setBooleanField(term20784, term20784.getClass(), "unknown", false);
        setBooleanField(term20784, term20784.getClass(), "resolved", false);
        setField(term20784, term20784.getClass(), "resolveResult", null);
        setField(term20784, term20784.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term20711;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term20575, args);
        assertTrue(recursiveEquals(term20575, term20781));
        assertTrue(recursiveEquals(term20711, term20784));
        assertTrue(recursiveEquals(retValue, true));
    }

};


