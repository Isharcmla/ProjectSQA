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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.util.LinkedList;

public class SourceMap_setPrefixMappings_207916110817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286;
     Object term319;
     Object term1809;
     Object term1812;

    public SourceMap_setPrefixMappings_207916110817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term289 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term289, term289.getClass(), "prefix", "");
        setField(term289, term289.getClass(), "replacement", "");
        Object term292 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term292, term292.getClass(), "prefix", "");
        setField(term292, term292.getClass(), "replacement", "");
        Object term295 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term295, term295.getClass(), "prefix", "");
        setField(term295, term295.getClass(), "replacement", "");
        Object term298 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term298, term298.getClass(), "prefix", "");
        setField(term298, term298.getClass(), "replacement", "");
        Object term301 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term301, term301.getClass(), "prefix", "");
        setField(term301, term301.getClass(), "replacement", "");
        Object term304 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap$LocationMapping"));
        setField(term304, term304.getClass(), "prefix", "");
        setField(term304, term304.getClass(), "replacement", "");
        ArrayList term287 = new ArrayList();
        ((ArrayList) term287).add(term289);
        ((ArrayList) term287).add(term292);
        ((ArrayList) term287).add(term295);
        ((ArrayList) term287).add(term298);
        ((ArrayList) term287).add(term301);
        ((ArrayList) term287).add(term304);
        HashMap term309 = new HashMap();
        term286 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        setField(term286, term286.getClass(), "generator", null);
        setField(term286, term286.getClass(), "prefixMappings", term287);
        setField(term286, term286.getClass(), "sourceLocationFixupCache", term309);
        term319 = new LinkedList();
        LinkedList term1810 = new LinkedList();
        HashMap term1811 = new HashMap();
        term1809 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        setField(term1809, term1809.getClass(), "generator", null);
        setField(term1809, term1809.getClass(), "prefixMappings", term1810);
        setField(term1809, term1809.getClass(), "sourceLocationFixupCache", term1811);
        term1812 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term319;
        callMethod(klass, "setPrefixMappings", argTypes, term286, args);
        assertTrue(recursiveEquals(term286, term1809));
        assertTrue(recursiveEquals(term319, term1812));
    }

};


