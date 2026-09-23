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
import java.lang.Object;

public class JsAst_init_11903965997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term1154;
     Object term1168;

    public JsAst_init_11903965997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term27 = (int[]) newIntArray(5);
        setField(term1, term1.getClass(), "fileName", "PAEBtnZtTD");
        setBooleanField(term1, term1.getClass(), "isExternFile", false);
        setField(term1, term1.getClass(), "originalPath", "sjlJAEtRrb");
        setIntElement(term27, 0, 568599855);
        setIntElement(term27, 1, 1162663216);
        setIntElement(term27, 2, 1484323161);
        setIntElement(term27, 3, 391863371);
        setIntElement(term27, 4, -1922583790);
        setField(term1, term1.getClass(), "lineOffsets", term27);
        setField(term1, term1.getClass(), "code", "MuLcgQHgqz");
        term1154 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term1155 = newInstance(Class.forName("com.google.javascript.rhino.InputId"));
        Object term1158 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term1163 = (int[]) newIntArray(5);
        setField(term1155, term1155.getClass(), "id", "PAEBtnZtTD");
        setField(term1154, term1154.getClass(), "inputId", term1155);
        setField(term1158, term1158.getClass(), "fileName", "PAEBtnZtTD");
        setBooleanField(term1158, term1158.getClass(), "isExternFile", false);
        setField(term1158, term1158.getClass(), "originalPath", "sjlJAEtRrb");
        setIntElement(term1163, 0, 568599855);
        setIntElement(term1163, 1, 1162663216);
        setIntElement(term1163, 2, 1484323161);
        setIntElement(term1163, 3, 391863371);
        setIntElement(term1163, 4, -1922583790);
        setField(term1158, term1158.getClass(), "lineOffsets", term1163);
        setField(term1158, term1158.getClass(), "code", "MuLcgQHgqz");
        setField(term1154, term1154.getClass(), "sourceFile", term1158);
        setField(term1154, term1154.getClass(), "fileName", "PAEBtnZtTD");
        setField(term1154, term1154.getClass(), "root", null);
        term1168 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term1173 = (int[]) newIntArray(5);
        setField(term1168, term1168.getClass(), "fileName", "PAEBtnZtTD");
        setBooleanField(term1168, term1168.getClass(), "isExternFile", false);
        setField(term1168, term1168.getClass(), "originalPath", "sjlJAEtRrb");
        setIntElement(term1173, 0, 568599855);
        setIntElement(term1173, 1, 1162663216);
        setIntElement(term1173, 2, 1484323161);
        setIntElement(term1173, 3, 391863371);
        setIntElement(term1173, 4, -1922583790);
        setField(term1168, term1168.getClass(), "lineOffsets", term1173);
        setField(term1168, term1168.getClass(), "code", "MuLcgQHgqz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.SourceFile");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1154));
        assertTrue(recursiveEquals(term1, term1168));
    }

};


