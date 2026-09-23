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

public class SourceFile_findLineOffsets_361307566360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61785;
     Object term62038;

    public SourceFile_findLineOffsets_361307566360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61785 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term61785, term61785.getClass(), "code", "");
        setField(term61785, term61785.getClass(), "lineOffsets", null);
        term62038 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        int[] term62039 = (int[]) newIntArray(1);
        setField(term62038, term62038.getClass(), "fileName", null);
        setBooleanField(term62038, term62038.getClass(), "isExternFile", false);
        setField(term62038, term62038.getClass(), "originalPath", null);
        setField(term62038, term62038.getClass(), "lineOffsets", term62039);
        setIntField(term62038, term62038.getClass(), "lastOffset", 0);
        setIntField(term62038, term62038.getClass(), "lastLine", 0);
        setField(term62038, term62038.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findLineOffsets", argTypes, term61785, args);
        assertTrue(recursiveEquals(term61785, term62038));
    }

};


