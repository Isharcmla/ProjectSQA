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
import java.util.HashSet;
import java.lang.Object;

public class UnionType_getLeastSupertype_1460961551251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88443;
     Object term88839;
     Object term89025;
     Object term89026;
     Object term88842;

    public UnionType_getLeastSupertype_1460961551251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term88491 = new HashSet();
        term88443 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term88747 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term88443, term88443.getClass(), "alternates", term88491);
        setField(term88443, term88443.getClass(), "registry", term88747);
        term88839 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setBooleanField(term88839, term88839.getClass(), "unknown", false);
        term89025 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term89025, term89025.getClass(), "elementsType", null);
        setField(term89025, term89025.getClass(), "elements", null);
        setField(term89025, term89025.getClass(), "className", null);
        setField(term89025, term89025.getClass(), "properties", null);
        setField(term89025, term89025.getClass(), "implicitPrototype", null);
        setBooleanField(term89025, term89025.getClass(), "nativeType", false);
        setBooleanField(term89025, term89025.getClass(), "visited", false);
        setField(term89025, term89025.getClass(), "docInfo", null);
        setBooleanField(term89025, term89025.getClass(), "unknown", false);
        setBooleanField(term89025, term89025.getClass(), "resolved", false);
        setField(term89025, term89025.getClass(), "resolveResult", null);
        setField(term89025, term89025.getClass(), "registry", null);
        term89026 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term89026, term89026.getClass(), "elementsType", null);
        setField(term89026, term89026.getClass(), "elements", null);
        setField(term89026, term89026.getClass(), "className", null);
        setField(term89026, term89026.getClass(), "properties", null);
        setField(term89026, term89026.getClass(), "implicitPrototype", null);
        setBooleanField(term89026, term89026.getClass(), "nativeType", false);
        setBooleanField(term89026, term89026.getClass(), "visited", false);
        setField(term89026, term89026.getClass(), "docInfo", null);
        setBooleanField(term89026, term89026.getClass(), "unknown", false);
        setBooleanField(term89026, term89026.getClass(), "resolved", false);
        setField(term89026, term89026.getClass(), "resolveResult", null);
        setField(term89026, term89026.getClass(), "registry", null);
        term88842 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term88842, term88842.getClass(), "elementsType", null);
        setField(term88842, term88842.getClass(), "elements", null);
        setField(term88842, term88842.getClass(), "className", null);
        setField(term88842, term88842.getClass(), "properties", null);
        setField(term88842, term88842.getClass(), "implicitPrototype", null);
        setBooleanField(term88842, term88842.getClass(), "nativeType", false);
        setBooleanField(term88842, term88842.getClass(), "visited", false);
        setField(term88842, term88842.getClass(), "docInfo", null);
        setBooleanField(term88842, term88842.getClass(), "unknown", false);
        setBooleanField(term88842, term88842.getClass(), "resolved", false);
        setField(term88842, term88842.getClass(), "resolveResult", null);
        setField(term88842, term88842.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term88839;
        Object retValue = callMethod(klass, "getLeastSupertype", argTypes, term88443, args);
        assertTrue(recursiveEquals(term88443, term89025));
        assertTrue(recursiveEquals(term88839, term89026));
        assertTrue(recursiveEquals(retValue, term88842));
    }

};


