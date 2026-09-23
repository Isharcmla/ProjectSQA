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
import java.lang.Object;

public class JsAst_setSourceFile_123525446212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term660;
     Object term755;

    public JsAst_setSourceFile_123525446212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term660 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term661 = newInstance(Class.forName("com.google.javascript.rhino.InputId"));
        Object term674 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term700 = (int[]) newIntArray(6);
        Object term731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term751 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term661, term661.getClass(), "id", "eZFUvlxvGV");
        setField(term660, term660.getClass(), "inputId", term661);
        setField(term674, term674.getClass(), "fileName", "BYqFIqCKAV");
        setBooleanField(term674, term674.getClass(), "isExternFile", true);
        setField(term674, term674.getClass(), "originalPath", "vrQLuWIDJX");
        setIntElement(term700, 0, 2055867847);
        setIntElement(term700, 1, -1048298087);
        setIntElement(term700, 2, 292681826);
        setIntElement(term700, 3, 458147407);
        setIntElement(term700, 4, -184153539);
        setIntElement(term700, 5, 493620644);
        setField(term674, term674.getClass(), "lineOffsets", term700);
        setField(term674, term674.getClass(), "code", "flxyYxBRtu");
        setField(term660, term660.getClass(), "sourceFile", term674);
        setField(term660, term660.getClass(), "fileName", "OclPbYPkcH");
        setIntField(term731, term731.getClass(), "type", 1328271830);
        setIntField(term733, term733.getClass(), "type", 1596070772);
        setIntField(term735, term735.getClass(), "type", 97029295);
        setIntField(term737, term737.getClass(), "type", -1371869594);
        setField(term737, term737.getClass(), "next", null);
        setField(term737, term737.getClass(), "first", null);
        setField(term737, term737.getClass(), "last", null);
        setField(term737, term737.getClass(), "propListHead", null);
        setIntField(term737, term737.getClass(), "sourcePosition", 0);
        setField(term737, term737.getClass(), "jsType", null);
        setField(term737, term737.getClass(), "parent", null);
        setField(term735, term735.getClass(), "next", term737);
        setIntField(term740, term740.getClass(), "type", -1588772968);
        setField(term740, term740.getClass(), "next", null);
        setField(term740, term740.getClass(), "first", term731);
        setField(term740, term740.getClass(), "last", null);
        setField(term740, term740.getClass(), "propListHead", null);
        setIntField(term740, term740.getClass(), "sourcePosition", 0);
        setField(term740, term740.getClass(), "jsType", null);
        setField(term740, term740.getClass(), "parent", null);
        setField(term735, term735.getClass(), "first", term740);
        setIntField(term743, term743.getClass(), "type", 1225272962);
        setField(term743, term743.getClass(), "next", null);
        setField(term743, term743.getClass(), "first", term733);
        setField(term743, term743.getClass(), "last", null);
        setField(term743, term743.getClass(), "propListHead", null);
        setIntField(term743, term743.getClass(), "sourcePosition", 0);
        setField(term743, term743.getClass(), "jsType", null);
        setField(term743, term743.getClass(), "parent", null);
        setField(term735, term735.getClass(), "last", term743);
        setField(term735, term735.getClass(), "propListHead", null);
        setIntField(term735, term735.getClass(), "sourcePosition", 0);
        setField(term735, term735.getClass(), "jsType", null);
        setField(term735, term735.getClass(), "parent", null);
        setField(term733, term733.getClass(), "next", term735);
        setField(term733, term733.getClass(), "first", term735);
        setIntField(term747, term747.getClass(), "type", -2095575670);
        setField(term747, term747.getClass(), "next", term743);
        setField(term747, term747.getClass(), "first", term740);
        setField(term747, term747.getClass(), "last", term740);
        setField(term747, term747.getClass(), "propListHead", null);
        setIntField(term747, term747.getClass(), "sourcePosition", 0);
        setField(term747, term747.getClass(), "jsType", null);
        setField(term747, term747.getClass(), "parent", null);
        setField(term733, term733.getClass(), "last", term747);
        setField(term733, term733.getClass(), "propListHead", null);
        setIntField(term733, term733.getClass(), "sourcePosition", 0);
        setField(term733, term733.getClass(), "jsType", null);
        setField(term733, term733.getClass(), "parent", null);
        setField(term731, term731.getClass(), "next", term733);
        setField(term731, term731.getClass(), "first", term740);
        setIntField(term751, term751.getClass(), "type", 0);
        setField(term751, term751.getClass(), "next", null);
        setField(term751, term751.getClass(), "first", null);
        setField(term751, term751.getClass(), "last", null);
        setField(term751, term751.getClass(), "propListHead", null);
        setIntField(term751, term751.getClass(), "sourcePosition", 0);
        setField(term751, term751.getClass(), "jsType", null);
        setField(term751, term751.getClass(), "parent", null);
        setField(term731, term731.getClass(), "last", term751);
        setField(term731, term731.getClass(), "propListHead", null);
        setIntField(term731, term731.getClass(), "sourcePosition", 0);
        setField(term731, term731.getClass(), "jsType", null);
        setField(term731, term731.getClass(), "parent", null);
        setField(term660, term660.getClass(), "root", term731);
        term755 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term781 = (int[]) newIntArray(2);
        setField(term755, term755.getClass(), "fileName", "IoAlmYsBwc");
        setBooleanField(term755, term755.getClass(), "isExternFile", true);
        setField(term755, term755.getClass(), "originalPath", "TEParAifyi");
        setIntElement(term781, 0, -112921587);
        setIntElement(term781, 1, 933028652);
        setField(term755, term755.getClass(), "lineOffsets", term781);
        setField(term755, term755.getClass(), "code", "OWDIEULEFu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.SourceFile");
        Object[] args = new Object[1];
        args[0] = term755;
        try {
            callMethod(klass, "setSourceFile", argTypes, term660, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


