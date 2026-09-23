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
import org.mockito.Mockito;
import java.lang.Object;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.jscomp.SourceFile.Generator;

public class SourceFile_getNumLines_1744244282274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48438;

    public SourceFile_getNumLines_1744244282274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48438 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        Object term48317 = Mockito.mock(Class.forName("com.google.javascript.jscomp.SourceFile$Generator"));
        setField(term48438, term48438.getClass(), "lineOffsets", null);
        setField(term48438, term48438.getClass(), "code", null);
        Mockito.when(((SourceFile.Generator)term48317).getCode()).thenReturn("");
        setField(term48438, term48438.getClass(), "generator", term48317);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNumLines", argTypes, term48438, args);
    }

};


