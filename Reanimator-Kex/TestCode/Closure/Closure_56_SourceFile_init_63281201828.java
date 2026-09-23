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

public class SourceFile_init_63281201828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2076;

    public SourceFile_init_63281201828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2076 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term2076, term2076.getClass(), "fileName", "PAEBtnZtTD");
        setBooleanField(term2076, term2076.getClass(), "isExternFile", false);
        setField(term2076, term2076.getClass(), "originalPath", null);
        setField(term2076, term2076.getClass(), "lineOffsets", null);
        setIntField(term2076, term2076.getClass(), "lastOffset", 0);
        setIntField(term2076, term2076.getClass(), "lastLine", 1);
        setField(term2076, term2076.getClass(), "code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term2076));
    }

};


