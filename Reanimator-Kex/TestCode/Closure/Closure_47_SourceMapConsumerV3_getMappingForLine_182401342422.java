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
import java.lang.Integer;

public class SourceMapConsumerV3_getMappingForLine_182401342422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term920;
     Object term945;
     Object term947;
     Object term6809;

    public SourceMapConsumerV3_getMappingForLine_182401342422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term936 = new ArrayList();
        HashMap term940 = new HashMap();
        term920 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        Object[] term921 = (Object[]) newArray("java.lang.String", 1);
        Object[] term934 = (Object[]) newArray("java.lang.String", 0);
        setElement(term921, 0, "nyiiPDVjAc");
        setField(term920, term920.getClass(), "sources", term921);
        setField(term920, term920.getClass(), "names", term934);
        setIntField(term920, term920.getClass(), "lineCount", -616727354);
        setField(term920, term920.getClass(), "lines", term936);
        setField(term920, term920.getClass(), "reverseSourceMapping", term940);
        term945 = new Integer(-1955890973);
        term947 = new Integer(-2038273078);
        ArrayList term6814 = new ArrayList();
        HashMap term6816 = new HashMap();
        term6809 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        Object[] term6810 = (Object[]) newArray("java.lang.String", 1);
        Object[] term6813 = (Object[]) newArray("java.lang.String", 0);
        setElement(term6810, 0, "nyiiPDVjAc");
        setField(term6809, term6809.getClass(), "sources", term6810);
        setField(term6809, term6809.getClass(), "names", term6813);
        setIntField(term6809, term6809.getClass(), "lineCount", -616727354);
        setField(term6809, term6809.getClass(), "lines", term6814);
        setField(term6809, term6809.getClass(), "reverseSourceMapping", term6816);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term945;
        args[1] = term947;
        Object retValue = callMethod(klass, "getMappingForLine", argTypes, term920, args);
        assertTrue(recursiveEquals(term920, term6809));
        assertTrue(recursiveEquals(term945, -1955890973));
        assertTrue(recursiveEquals(term947, -2038273078));
        assertTrue(recursiveEquals(retValue, null));
    }

};


