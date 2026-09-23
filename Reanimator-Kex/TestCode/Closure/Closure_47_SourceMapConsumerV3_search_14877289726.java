package com.google.debugging.sourcemap;

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
import java.lang.IndexOutOfBoundsException;
import static com.google.debugging.sourcemap.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Integer;

public class SourceMapConsumerV3_search_14877289726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1799;
     Object term1932;
     Object term1936;
     Object term1938;
     Object term1940;

    public SourceMapConsumerV3_search_14877289726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1923 = new ArrayList();
        HashMap term1927 = new HashMap();
        term1799 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        Object[] term1800 = (Object[]) newArray("java.lang.String", 3);
        Object[] term1837 = (Object[]) newArray("java.lang.String", 7);
        setElement(term1800, 0, "MAcUBcBckh");
        setElement(term1800, 1, "oVgzLbrsFr");
        setElement(term1800, 2, "vQVyKLdtaz");
        setField(term1799, term1799.getClass(), "sources", term1800);
        setElement(term1837, 0, "OWKQODBLzb");
        setElement(term1837, 1, "wGmYcqUkgE");
        setElement(term1837, 2, "idgaQsnJpQ");
        setElement(term1837, 3, "VgZnGoIFwQ");
        setElement(term1837, 4, "jUbSRrkrYZ");
        setElement(term1837, 5, "bWWfajKbEX");
        setElement(term1837, 6, "cAPeiZHKGJ");
        setField(term1799, term1799.getClass(), "names", term1837);
        setIntField(term1799, term1799.getClass(), "lineCount", -883034806);
        setField(term1799, term1799.getClass(), "lines", term1923);
        setField(term1799, term1799.getClass(), "reverseSourceMapping", term1927);
        term1932 = new ArrayList();
        ((ArrayList) term1932).add((Object)null);
        ((ArrayList) term1932).add((Object)null);
        term1936 = new Integer(1585847225);
        term1938 = new Integer(597278769);
        term1940 = new Integer(-1685132342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term1932;
        args[1] = term1936;
        args[2] = term1938;
        args[3] = term1940;
        try {
            callMethod(klass, "search", argTypes, term1799, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


