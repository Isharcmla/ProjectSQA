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

public class SourceFile_getRegion_646145336205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34904;
     Object term37071;

    public SourceFile_getRegion_646145336205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34904 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term34904, term34904.getClass(), "code", "");
        term37071 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term37071, term37071.getClass(), "fileName", null);
        setBooleanField(term37071, term37071.getClass(), "isExternFile", false);
        setField(term37071, term37071.getClass(), "originalPath", null);
        setField(term37071, term37071.getClass(), "lineOffsets", null);
        setIntField(term37071, term37071.getClass(), "lastOffset", 0);
        setIntField(term37071, term37071.getClass(), "lastLine", 0);
        setField(term37071, term37071.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 3;
        Object retValue = callMethod(klass, "getRegion", argTypes, term34904, args);
        assertTrue(recursiveEquals(term34904, term37071));
        assertTrue(recursiveEquals(retValue, null));
    }

};


