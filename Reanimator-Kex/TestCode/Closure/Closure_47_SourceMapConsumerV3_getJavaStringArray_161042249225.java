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
import static com.google.debugging.sourcemap.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.debugging.sourcemap.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class SourceMapConsumerV3_getJavaStringArray_161042249225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1539;
     Object term1684;
     Object term8063;
     Object term8091;
     Object term7917;

    public SourceMapConsumerV3_getJavaStringArray_161042249225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1675 = new ArrayList();
        HashMap term1679 = new HashMap();
        term1539 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        Object[] term1540 = (Object[]) newArray("java.lang.String", 5);
        Object[] term1601 = (Object[]) newArray("java.lang.String", 6);
        setElement(term1540, 0, "fhkbdRViHi");
        setElement(term1540, 1, "uWHnvSvaPl");
        setElement(term1540, 2, "kBdSllIBVz");
        setElement(term1540, 3, "TJmVBGfTML");
        setElement(term1540, 4, "tPlsykYBqO");
        setField(term1539, term1539.getClass(), "sources", term1540);
        setElement(term1601, 0, "bLPjGVBhlX");
        setElement(term1601, 1, "whBvTVIIlC");
        setElement(term1601, 2, "IgRJUzaCwW");
        setElement(term1601, 3, "JUmudUmaaV");
        setElement(term1601, 4, "KoyGrUJeJW");
        setElement(term1601, 5, "HqBOwkVqjD");
        setField(term1539, term1539.getClass(), "names", term1601);
        setIntField(term1539, term1539.getClass(), "lineCount", 1134449235);
        setField(term1539, term1539.getClass(), "lines", term1675);
        setField(term1539, term1539.getClass(), "reverseSourceMapping", term1679);
        ArrayList term1685 = new ArrayList();
        term1684 = newInstance(Class.forName("org.json.JSONArray"));
        setField(term1684, term1684.getClass(), "myArrayList", term1685);
        ArrayList term8088 = new ArrayList();
        HashMap term8090 = new HashMap();
        term8063 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        Object[] term8064 = (Object[]) newArray("java.lang.String", 5);
        Object[] term8075 = (Object[]) newArray("java.lang.String", 6);
        setElement(term8064, 0, "fhkbdRViHi");
        setElement(term8064, 1, "uWHnvSvaPl");
        setElement(term8064, 2, "kBdSllIBVz");
        setElement(term8064, 3, "TJmVBGfTML");
        setElement(term8064, 4, "tPlsykYBqO");
        setField(term8063, term8063.getClass(), "sources", term8064);
        setElement(term8075, 0, "bLPjGVBhlX");
        setElement(term8075, 1, "whBvTVIIlC");
        setElement(term8075, 2, "IgRJUzaCwW");
        setElement(term8075, 3, "JUmudUmaaV");
        setElement(term8075, 4, "KoyGrUJeJW");
        setElement(term8075, 5, "HqBOwkVqjD");
        setField(term8063, term8063.getClass(), "names", term8075);
        setIntField(term8063, term8063.getClass(), "lineCount", 1134449235);
        setField(term8063, term8063.getClass(), "lines", term8088);
        setField(term8063, term8063.getClass(), "reverseSourceMapping", term8090);
        ArrayList term8092 = new ArrayList();
        term8091 = newInstance(Class.forName("org.json.JSONArray"));
        setField(term8091, term8091.getClass(), "myArrayList", term8092);
        term7917 = (Object[]) newArray("java.lang.String", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.json.JSONArray");
        Object[] args = new Object[1];
        args[0] = term1684;
        Object retValue = callMethod(klass, "getJavaStringArray", argTypes, term1539, args);
        assertTrue(recursiveEquals(term1539, term8063));
        assertTrue(recursiveEquals(term1684, term8091));
        assertTrue(recursiveEquals(retValue, term7917));
    }

};


