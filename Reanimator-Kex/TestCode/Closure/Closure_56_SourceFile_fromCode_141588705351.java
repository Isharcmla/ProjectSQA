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

public class SourceFile_fromCode_141588705351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6155;

    public SourceFile_fromCode_141588705351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6155 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term6155, term6155.getClass(), "fileName", "ieCtQFdkii");
        setBooleanField(term6155, term6155.getClass(), "isExternFile", false);
        setField(term6155, term6155.getClass(), "originalPath", "dEnhdmILtU");
        setField(term6155, term6155.getClass(), "lineOffsets", null);
        setIntField(term6155, term6155.getClass(), "lastOffset", 0);
        setIntField(term6155, term6155.getClass(), "lastLine", 1);
        setField(term6155, term6155.getClass(), "code", "hoicvmsovO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = "ieCtQFdkii";
        args[1] = "dEnhdmILtU";
        args[2] = "hoicvmsovO";
        Object retValue = callMethod(klass, "fromCode", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term6155));
    }

};


