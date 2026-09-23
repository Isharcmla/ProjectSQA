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

public class SourceFile_findLineOffsets_361307566362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62421;

    public SourceFile_findLineOffsets_361307566362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62421 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        Object term62303 = Mockito.mock(Class.forName("com.google.javascript.jscomp.SourceFile$Generator"));
        setField(term62421, term62421.getClass(), "code", null);
        Mockito.when(((SourceFile.Generator)term62303).getCode()).thenReturn("");
        setField(term62421, term62421.getClass(), "generator", term62303);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findLineOffsets", argTypes, term62421, args);
    }

};


