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

public class SourceFile_fromReader_92540721454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7111;

    public SourceFile_fromReader_92540721454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7111 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term7111, term7111.getClass(), "fileName", null);
        setBooleanField(term7111, term7111.getClass(), "isExternFile", false);
        setField(term7111, term7111.getClass(), "originalPath", null);
        setField(term7111, term7111.getClass(), "lineOffsets", null);
        setIntField(term7111, term7111.getClass(), "lastOffset", 0);
        setIntField(term7111, term7111.getClass(), "lastLine", 0);
        setField(term7111, term7111.getClass(), "code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.io.Reader");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "fromReader", argTypes, term7111, args);
    }

};


