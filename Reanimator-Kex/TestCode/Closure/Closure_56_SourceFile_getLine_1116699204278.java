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

public class SourceFile_getLine_1116699204278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49141;

    public SourceFile_getLine_1116699204278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49141 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        Object term49010 = Mockito.mock(Class.forName("com.google.javascript.jscomp.SourceFile$Generator"));
        setField(term49141, term49141.getClass(), "code", null);
        Mockito.when(((SourceFile.Generator)term49010).getCode()).thenReturn("");
        setField(term49141, term49141.getClass(), "generator", term49010);
        setIntField(term49141, term49141.getClass(), "lastLine", -2147483648);
        setIntField(term49141, term49141.getClass(), "lastOffset", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 2147483647;
        callMethod(klass, "getLine", argTypes, term49141, args);
    }

};


