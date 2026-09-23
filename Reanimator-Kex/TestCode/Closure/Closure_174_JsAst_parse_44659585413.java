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
import java.lang.Object;

public class JsAst_parse_44659585413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term884;

    public JsAst_parse_44659585413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term884 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term885 = newInstance(Class.forName("com.google.javascript.rhino.InputId"));
        Object term898 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term924 = (int[]) newIntArray(6);
        Object term955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term957 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term885, term885.getClass(), "id", "dWRymuLBtr");
        setField(term884, term884.getClass(), "inputId", term885);
        setField(term898, term898.getClass(), "fileName", "AijpHYOFuy");
        setBooleanField(term898, term898.getClass(), "isExternFile", true);
        setField(term898, term898.getClass(), "originalPath", "SbAoxhfrkn");
        setIntElement(term924, 0, 287287233);
        setIntElement(term924, 1, 962840079);
        setIntElement(term924, 2, 1540719661);
        setIntElement(term924, 3, 1265463001);
        setIntElement(term924, 4, 335112684);
        setIntElement(term924, 5, 1551099402);
        setField(term898, term898.getClass(), "lineOffsets", term924);
        setField(term898, term898.getClass(), "code", "kuTXqwMtDB");
        setField(term884, term884.getClass(), "sourceFile", term898);
        setField(term884, term884.getClass(), "fileName", "Ghbwtircqb");
        setIntField(term955, term955.getClass(), "type", -2027534003);
        setIntField(term957, term957.getClass(), "type", 1063420942);
        setIntField(term959, term959.getClass(), "type", 1375330971);
        setIntField(term961, term961.getClass(), "type", -478195677);
        setField(term961, term961.getClass(), "next", null);
        setField(term961, term961.getClass(), "first", null);
        setField(term961, term961.getClass(), "last", null);
        setField(term961, term961.getClass(), "propListHead", null);
        setIntField(term961, term961.getClass(), "sourcePosition", 0);
        setField(term961, term961.getClass(), "jsType", null);
        setField(term961, term961.getClass(), "parent", null);
        setField(term959, term959.getClass(), "next", term961);
        setIntField(term964, term964.getClass(), "type", 1240914516);
        setField(term964, term964.getClass(), "next", null);
        setField(term964, term964.getClass(), "first", term955);
        setField(term964, term964.getClass(), "last", null);
        setField(term964, term964.getClass(), "propListHead", null);
        setIntField(term964, term964.getClass(), "sourcePosition", 0);
        setField(term964, term964.getClass(), "jsType", null);
        setField(term964, term964.getClass(), "parent", null);
        setField(term959, term959.getClass(), "first", term964);
        setIntField(term967, term967.getClass(), "type", 1655935355);
        setField(term967, term967.getClass(), "next", null);
        setField(term967, term967.getClass(), "first", term957);
        setField(term967, term967.getClass(), "last", null);
        setField(term967, term967.getClass(), "propListHead", null);
        setIntField(term967, term967.getClass(), "sourcePosition", 0);
        setField(term967, term967.getClass(), "jsType", null);
        setField(term967, term967.getClass(), "parent", null);
        setField(term959, term959.getClass(), "last", term967);
        setField(term959, term959.getClass(), "propListHead", null);
        setIntField(term959, term959.getClass(), "sourcePosition", 0);
        setField(term959, term959.getClass(), "jsType", null);
        setField(term959, term959.getClass(), "parent", null);
        setField(term957, term957.getClass(), "next", term959);
        setField(term957, term957.getClass(), "first", term959);
        setIntField(term971, term971.getClass(), "type", 972867650);
        setField(term971, term971.getClass(), "next", term967);
        setField(term971, term971.getClass(), "first", term964);
        setField(term971, term971.getClass(), "last", term964);
        setField(term971, term971.getClass(), "propListHead", null);
        setIntField(term971, term971.getClass(), "sourcePosition", 0);
        setField(term971, term971.getClass(), "jsType", null);
        setField(term971, term971.getClass(), "parent", null);
        setField(term957, term957.getClass(), "last", term971);
        setField(term957, term957.getClass(), "propListHead", null);
        setIntField(term957, term957.getClass(), "sourcePosition", 0);
        setField(term957, term957.getClass(), "jsType", null);
        setField(term957, term957.getClass(), "parent", null);
        setField(term955, term955.getClass(), "next", term957);
        setField(term955, term955.getClass(), "first", term964);
        setIntField(term975, term975.getClass(), "type", 0);
        setField(term975, term975.getClass(), "next", null);
        setField(term975, term975.getClass(), "first", null);
        setField(term975, term975.getClass(), "last", null);
        setField(term975, term975.getClass(), "propListHead", null);
        setIntField(term975, term975.getClass(), "sourcePosition", 0);
        setField(term975, term975.getClass(), "jsType", null);
        setField(term975, term975.getClass(), "parent", null);
        setField(term955, term955.getClass(), "last", term975);
        setField(term955, term955.getClass(), "propListHead", null);
        setIntField(term955, term955.getClass(), "sourcePosition", 0);
        setField(term955, term955.getClass(), "jsType", null);
        setField(term955, term955.getClass(), "parent", null);
        setField(term884, term884.getClass(), "root", term955);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "parse", argTypes, term884, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


