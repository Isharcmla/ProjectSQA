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

public class SourceFile_toString_6489695645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1333;
     Object term4555;

    public SourceFile_toString_6489695645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1333 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term1359 = (int[]) newIntArray(0);
        setField(term1333, term1333.getClass(), "fileName", "UiUYnPrcCi");
        setBooleanField(term1333, term1333.getClass(), "isExternFile", true);
        setField(term1333, term1333.getClass(), "originalPath", "UoYtihxVaS");
        setField(term1333, term1333.getClass(), "lineOffsets", term1359);
        setIntField(term1333, term1333.getClass(), "lastOffset", -1034506028);
        setIntField(term1333, term1333.getClass(), "lastLine", -1263114719);
        setField(term1333, term1333.getClass(), "code", "JDswTTCZHV");
        term4555 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term4560 = (int[]) newIntArray(0);
        setField(term4555, term4555.getClass(), "fileName", "UiUYnPrcCi");
        setBooleanField(term4555, term4555.getClass(), "isExternFile", true);
        setField(term4555, term4555.getClass(), "originalPath", "UoYtihxVaS");
        setField(term4555, term4555.getClass(), "lineOffsets", term4560);
        setIntField(term4555, term4555.getClass(), "lastOffset", -1034506028);
        setIntField(term4555, term4555.getClass(), "lastLine", -1263114719);
        setField(term4555, term4555.getClass(), "code", "JDswTTCZHV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term1333, args);
        assertTrue(recursiveEquals(term1333, term4555));
        assertTrue(recursiveEquals(retValue, "UiUYnPrcCi"));
    }

};


