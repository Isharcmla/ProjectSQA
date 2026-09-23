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

public class SourceMapConsumerV3_createReverseMapping_184370521830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2465;
     Object term9886;

    public SourceMapConsumerV3_createReverseMapping_184370521830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2613 = new ArrayList();
        HashMap term2617 = new HashMap();
        term2465 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        Object[] term2466 = (Object[]) newArray("java.lang.String", 4);
        Object[] term2515 = (Object[]) newArray("java.lang.String", 8);
        setElement(term2466, 0, "AWRooQKkdW");
        setElement(term2466, 1, "vjxIhXHxGR");
        setElement(term2466, 2, "QXzGXbEXMu");
        setElement(term2466, 3, "qxSDVejjiY");
        setField(term2465, term2465.getClass(), "sources", term2466);
        setElement(term2515, 0, "xBsXSDjXYK");
        setElement(term2515, 1, "sEnIVFtZuQ");
        setElement(term2515, 2, "ZVecLZMLHF");
        setElement(term2515, 3, "fztQhjqwdP");
        setElement(term2515, 4, "eVpkWxjuki");
        setElement(term2515, 5, "SJiQaLvSKv");
        setElement(term2515, 6, "OEXDRUKcFl");
        setElement(term2515, 7, "RYdKCNNMBR");
        setField(term2465, term2465.getClass(), "names", term2515);
        setIntField(term2465, term2465.getClass(), "lineCount", -117576464);
        setField(term2465, term2465.getClass(), "lines", term2613);
        setField(term2465, term2465.getClass(), "reverseSourceMapping", term2617);
        ArrayList term9913 = new ArrayList();
        HashMap term9915 = new HashMap();
        term9886 = newInstance(Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3"));
        Object[] term9887 = (Object[]) newArray("java.lang.String", 4);
        Object[] term9896 = (Object[]) newArray("java.lang.String", 8);
        setElement(term9887, 0, "AWRooQKkdW");
        setElement(term9887, 1, "vjxIhXHxGR");
        setElement(term9887, 2, "QXzGXbEXMu");
        setElement(term9887, 3, "qxSDVejjiY");
        setField(term9886, term9886.getClass(), "sources", term9887);
        setElement(term9896, 0, "xBsXSDjXYK");
        setElement(term9896, 1, "sEnIVFtZuQ");
        setElement(term9896, 2, "ZVecLZMLHF");
        setElement(term9896, 3, "fztQhjqwdP");
        setElement(term9896, 4, "eVpkWxjuki");
        setElement(term9896, 5, "SJiQaLvSKv");
        setElement(term9896, 6, "OEXDRUKcFl");
        setElement(term9896, 7, "RYdKCNNMBR");
        setField(term9886, term9886.getClass(), "names", term9896);
        setIntField(term9886, term9886.getClass(), "lineCount", -117576464);
        setField(term9886, term9886.getClass(), "lines", term9913);
        setField(term9886, term9886.getClass(), "reverseSourceMapping", term9915);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.debugging.sourcemap.SourceMapConsumerV3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createReverseMapping", argTypes, term2465, args);
        assertTrue(recursiveEquals(term2465, term9886));
    }

};


