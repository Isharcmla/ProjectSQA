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

public class JSType_isEquivalent_1737835225279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50285;
     Object term50383;
     Object term50839;
     Object term50840;

    public JSType_isEquivalent_1737835225279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50285 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term50383 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term50501 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term50383, term50383.getClass(), "referencedType", term50501);
        term50839 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term50839, term50839.getClass(), "resolved", false);
        setField(term50839, term50839.getClass(), "resolveResult", null);
        setField(term50839, term50839.getClass(), "registry", null);
        term50840 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term50841 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term50840, term50840.getClass(), "indexType", null);
        setField(term50841, term50841.getClass(), "ownerFunction", null);
        setField(term50841, term50841.getClass(), "className", null);
        setField(term50841, term50841.getClass(), "properties", null);
        setBooleanField(term50841, term50841.getClass(), "nativeType", false);
        setField(term50841, term50841.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term50841, term50841.getClass(), "prettyPrint", false);
        setBooleanField(term50841, term50841.getClass(), "visited", false);
        setField(term50841, term50841.getClass(), "docInfo", null);
        setBooleanField(term50841, term50841.getClass(), "unknown", false);
        setBooleanField(term50841, term50841.getClass(), "resolved", false);
        setField(term50841, term50841.getClass(), "resolveResult", null);
        setField(term50841, term50841.getClass(), "registry", null);
        setField(term50840, term50840.getClass(), "referencedType", term50841);
        setField(term50840, term50840.getClass(), "referencedObjType", null);
        setBooleanField(term50840, term50840.getClass(), "visited", false);
        setField(term50840, term50840.getClass(), "docInfo", null);
        setBooleanField(term50840, term50840.getClass(), "unknown", false);
        setBooleanField(term50840, term50840.getClass(), "resolved", false);
        setField(term50840, term50840.getClass(), "resolveResult", null);
        setField(term50840, term50840.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term50285;
        args[1] = term50383;
        Object retValue = callMethod(klass, "isEquivalent", argTypes, null, args);
        assertTrue(recursiveEquals(term50285, term50839));
        assertTrue(recursiveEquals(term50383, term50840));
        assertTrue(recursiveEquals(retValue, false));
    }

};


