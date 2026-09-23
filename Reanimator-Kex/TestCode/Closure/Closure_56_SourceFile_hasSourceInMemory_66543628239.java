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

public class SourceFile_hasSourceInMemory_66543628239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term857;
     Object term3770;

    public SourceFile_hasSourceInMemory_66543628239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term857 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term883 = (int[]) newIntArray(6);
        setField(term857, term857.getClass(), "fileName", "SbAoxhfrkn");
        setBooleanField(term857, term857.getClass(), "isExternFile", false);
        setField(term857, term857.getClass(), "originalPath", "kuTXqwMtDB");
        setIntElement(term883, 0, 1596070772);
        setIntElement(term883, 1, 97029295);
        setIntElement(term883, 2, -1371869594);
        setIntElement(term883, 3, -2095575670);
        setIntElement(term883, 4, 1225272962);
        setIntElement(term883, 5, 1324040357);
        setField(term857, term857.getClass(), "lineOffsets", term883);
        setIntField(term857, term857.getClass(), "lastOffset", -1588772968);
        setIntField(term857, term857.getClass(), "lastLine", -93135961);
        setField(term857, term857.getClass(), "code", "Ghbwtircqb");
        term3770 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term3775 = (int[]) newIntArray(6);
        setField(term3770, term3770.getClass(), "fileName", "SbAoxhfrkn");
        setBooleanField(term3770, term3770.getClass(), "isExternFile", false);
        setField(term3770, term3770.getClass(), "originalPath", "kuTXqwMtDB");
        setIntElement(term3775, 0, 1596070772);
        setIntElement(term3775, 1, 97029295);
        setIntElement(term3775, 2, -1371869594);
        setIntElement(term3775, 3, -2095575670);
        setIntElement(term3775, 4, 1225272962);
        setIntElement(term3775, 5, 1324040357);
        setField(term3770, term3770.getClass(), "lineOffsets", term3775);
        setIntField(term3770, term3770.getClass(), "lastOffset", -1588772968);
        setIntField(term3770, term3770.getClass(), "lastLine", -93135961);
        setField(term3770, term3770.getClass(), "code", "Ghbwtircqb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasSourceInMemory", argTypes, term857, args);
        assertTrue(recursiveEquals(term857, term3770));
        assertTrue(recursiveEquals(retValue, true));
    }

};


