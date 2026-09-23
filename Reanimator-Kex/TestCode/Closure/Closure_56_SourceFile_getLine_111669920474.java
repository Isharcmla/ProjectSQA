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

public class SourceFile_getLine_111669920474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10273;
     Object term10616;

    public SourceFile_getLine_111669920474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10273 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term10273, term10273.getClass(), "code", "");
        setIntField(term10273, term10273.getClass(), "lastLine", 1);
        setIntField(term10273, term10273.getClass(), "lastOffset", 0);
        term10616 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term10616, term10616.getClass(), "fileName", null);
        setBooleanField(term10616, term10616.getClass(), "isExternFile", false);
        setField(term10616, term10616.getClass(), "originalPath", null);
        setField(term10616, term10616.getClass(), "lineOffsets", null);
        setIntField(term10616, term10616.getClass(), "lastOffset", 0);
        setIntField(term10616, term10616.getClass(), "lastLine", 0);
        setField(term10616, term10616.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "getLine", argTypes, term10273, args);
        assertTrue(recursiveEquals(term10273, term10616));
        assertTrue(recursiveEquals(retValue, null));
    }

};


