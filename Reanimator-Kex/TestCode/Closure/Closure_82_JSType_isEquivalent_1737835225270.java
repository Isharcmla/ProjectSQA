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

public class JSType_isEquivalent_1737835225270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48175;
     Object term48273;
     Object term48702;
     Object term48703;

    public JSType_isEquivalent_1737835225270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48175 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term48273 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term48371 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setField(term48273, term48273.getClass(), "referencedType", term48371);
        term48702 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term48702, term48702.getClass(), "resolved", false);
        setField(term48702, term48702.getClass(), "resolveResult", null);
        setField(term48702, term48702.getClass(), "registry", null);
        term48703 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term48704 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setField(term48703, term48703.getClass(), "indexType", null);
        setBooleanField(term48704, term48704.getClass(), "resolved", false);
        setField(term48704, term48704.getClass(), "resolveResult", null);
        setField(term48704, term48704.getClass(), "registry", null);
        setField(term48703, term48703.getClass(), "referencedType", term48704);
        setField(term48703, term48703.getClass(), "referencedObjType", null);
        setBooleanField(term48703, term48703.getClass(), "visited", false);
        setField(term48703, term48703.getClass(), "docInfo", null);
        setBooleanField(term48703, term48703.getClass(), "unknown", false);
        setBooleanField(term48703, term48703.getClass(), "resolved", false);
        setField(term48703, term48703.getClass(), "resolveResult", null);
        setField(term48703, term48703.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term48175;
        args[1] = term48273;
        Object retValue = callMethod(klass, "isEquivalent", argTypes, null, args);
        assertTrue(recursiveEquals(term48175, term48702));
        assertTrue(recursiveEquals(term48273, term48703));
        assertTrue(recursiveEquals(retValue, false));
    }

};


