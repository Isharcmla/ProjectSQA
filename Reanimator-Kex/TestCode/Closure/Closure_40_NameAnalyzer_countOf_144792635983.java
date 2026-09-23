package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class NameAnalyzer_countOf_144792635983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23893;

    public NameAnalyzer_countOf_144792635983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term23941 = new HashMap();
        ((HashMap) term23941).put((Object)null, (Object)null);
        term23893 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        setField(term23893, term23893.getClass(), "allNames", term23941);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NameAnalyzer$TriState");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NameAnalyzer$TriState");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "countOf", argTypes, term23893, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


