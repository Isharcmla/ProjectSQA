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

public class SourceFile_hasSourceInMemory_665436282106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15223;
     Object term15606;

    public SourceFile_hasSourceInMemory_665436282106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15223 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term15223, term15223.getClass(), "code", null);
        term15606 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term15606, term15606.getClass(), "fileName", null);
        setBooleanField(term15606, term15606.getClass(), "isExternFile", false);
        setField(term15606, term15606.getClass(), "originalPath", null);
        setField(term15606, term15606.getClass(), "lineOffsets", null);
        setIntField(term15606, term15606.getClass(), "lastOffset", 0);
        setIntField(term15606, term15606.getClass(), "lastLine", 0);
        setField(term15606, term15606.getClass(), "code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasSourceInMemory", argTypes, term15223, args);
        assertTrue(recursiveEquals(term15223, term15606));
        assertTrue(recursiveEquals(retValue, false));
    }

};


