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

public class SourceFile_getNumLines_174424428230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106;
     Object term2501;

    public SourceFile_getNumLines_174424428230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term132 = (int[]) newIntArray(4);
        setField(term106, term106.getClass(), "fileName", "jJCZpVmanW");
        setBooleanField(term106, term106.getClass(), "isExternFile", false);
        setField(term106, term106.getClass(), "originalPath", "EGtDIRbSSb");
        setIntElement(term132, 0, 1227103734);
        setIntElement(term132, 1, -1339778481);
        setIntElement(term132, 2, 1725571209);
        setIntElement(term132, 3, -522618178);
        setField(term106, term106.getClass(), "lineOffsets", term132);
        setIntField(term106, term106.getClass(), "lastOffset", 1134449235);
        setIntField(term106, term106.getClass(), "lastLine", -883034806);
        setField(term106, term106.getClass(), "code", "SzjVpOQTyS");
        term2501 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term2506 = (int[]) newIntArray(4);
        setField(term2501, term2501.getClass(), "fileName", "jJCZpVmanW");
        setBooleanField(term2501, term2501.getClass(), "isExternFile", false);
        setField(term2501, term2501.getClass(), "originalPath", "EGtDIRbSSb");
        setIntElement(term2506, 0, 1227103734);
        setIntElement(term2506, 1, -1339778481);
        setIntElement(term2506, 2, 1725571209);
        setIntElement(term2506, 3, -522618178);
        setField(term2501, term2501.getClass(), "lineOffsets", term2506);
        setIntField(term2501, term2501.getClass(), "lastOffset", 1134449235);
        setIntField(term2501, term2501.getClass(), "lastLine", -883034806);
        setField(term2501, term2501.getClass(), "code", "SzjVpOQTyS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumLines", argTypes, term106, args);
        assertTrue(recursiveEquals(term106, term2501));
        assertTrue(recursiveEquals(retValue, 4));
    }

};


