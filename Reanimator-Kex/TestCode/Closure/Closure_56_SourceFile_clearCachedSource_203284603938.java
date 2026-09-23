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

public class SourceFile_clearCachedSource_203284603938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term784;
     Object term3651;

    public SourceFile_clearCachedSource_203284603938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term784 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term810 = (int[]) newIntArray(1);
        setField(term784, term784.getClass(), "fileName", "OWDIEULEFu");
        setBooleanField(term784, term784.getClass(), "isExternFile", true);
        setField(term784, term784.getClass(), "originalPath", "dWRymuLBtr");
        setIntElement(term810, 0, -184153539);
        setField(term784, term784.getClass(), "lineOffsets", term810);
        setIntField(term784, term784.getClass(), "lastOffset", 493620644);
        setIntField(term784, term784.getClass(), "lastLine", 1328271830);
        setField(term784, term784.getClass(), "code", "AijpHYOFuy");
        term3651 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term3656 = (int[]) newIntArray(1);
        setField(term3651, term3651.getClass(), "fileName", "OWDIEULEFu");
        setBooleanField(term3651, term3651.getClass(), "isExternFile", true);
        setField(term3651, term3651.getClass(), "originalPath", "dWRymuLBtr");
        setIntElement(term3656, 0, -184153539);
        setField(term3651, term3651.getClass(), "lineOffsets", term3656);
        setIntField(term3651, term3651.getClass(), "lastOffset", 493620644);
        setIntField(term3651, term3651.getClass(), "lastLine", 1328271830);
        setField(term3651, term3651.getClass(), "code", "AijpHYOFuy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearCachedSource", argTypes, term784, args);
        assertTrue(recursiveEquals(term784, term3651));
    }

};


