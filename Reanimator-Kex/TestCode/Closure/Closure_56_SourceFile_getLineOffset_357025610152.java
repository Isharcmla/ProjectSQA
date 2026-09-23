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

public class SourceFile_getLineOffset_357025610152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24750;
     Object term26865;

    public SourceFile_getLineOffset_357025610152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24750 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term22656 = (int[]) newIntArray(998);
        setField(term24750, term24750.getClass(), "lineOffsets", term22656);
        term26865 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term26866 = (int[]) newIntArray(998);
        setField(term26865, term26865.getClass(), "fileName", null);
        setBooleanField(term26865, term26865.getClass(), "isExternFile", false);
        setField(term26865, term26865.getClass(), "originalPath", null);
        setField(term26865, term26865.getClass(), "lineOffsets", term26866);
        setIntField(term26865, term26865.getClass(), "lastOffset", 0);
        setIntField(term26865, term26865.getClass(), "lastLine", 0);
        setField(term26865, term26865.getClass(), "code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 3;
        Object retValue = callMethod(klass, "getLineOffset", argTypes, term24750, args);
        assertTrue(recursiveEquals(term24750, term26865));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


