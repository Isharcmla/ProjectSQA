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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashSet;
import java.lang.Object;

public class FunctionType_isSubtype_2101002158373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227704;
     Object term227798;

    public FunctionType_isSubtype_2101002158373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227704 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object[] term227536 = (Object[]) newArray("java.lang.Object", 8);
        HashSet term227846 = new HashSet();
        ((HashSet) term227846).add((Object)term227536);
        ((HashSet) term227846).add((Object)null);
        ((HashSet) term227846).add((Object)null);
        ((HashSet) term227846).add((Object)null);
        ((HashSet) term227846).add((Object)null);
        ((HashSet) term227846).add((Object)null);
        ((HashSet) term227846).add((Object)null);
        ((HashSet) term227846).add((Object)null);
        term227798 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term227798, term227798.getClass(), "alternates", term227846);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term227798;
        try {
            callMethod(klass, "isSubtype", argTypes, term227704, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


