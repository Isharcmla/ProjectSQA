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

public class UnionType_getLeastSupertype_1460961551275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97859;
     Object term98259;
     Object term98417;
     Object term98418;
     Object term98261;

    public UnionType_getLeastSupertype_1460961551275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term97907 = new HashSet();
        term97859 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term98163 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term97859, term97859.getClass(), "alternates", term97907);
        setField(term97859, term97859.getClass(), "registry", term98163);
        term98259 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        term98417 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setBooleanField(term98417, term98417.getClass(), "resolved", false);
        setField(term98417, term98417.getClass(), "resolveResult", null);
        setField(term98417, term98417.getClass(), "registry", null);
        term98418 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setBooleanField(term98418, term98418.getClass(), "resolved", false);
        setField(term98418, term98418.getClass(), "resolveResult", null);
        setField(term98418, term98418.getClass(), "registry", null);
        term98261 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setBooleanField(term98261, term98261.getClass(), "resolved", false);
        setField(term98261, term98261.getClass(), "resolveResult", null);
        setField(term98261, term98261.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term98259;
        Object retValue = callMethod(klass, "getLeastSupertype", argTypes, term97859, args);
        assertTrue(recursiveEquals(term97859, term98417));
        assertTrue(recursiveEquals(term98259, term98418));
        assertTrue(recursiveEquals(retValue, term98261));
    }

};


