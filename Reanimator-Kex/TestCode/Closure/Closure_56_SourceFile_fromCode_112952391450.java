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

public class SourceFile_fromCode_112952391450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6015;

    public SourceFile_fromCode_112952391450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6015 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term6015, term6015.getClass(), "fileName", "ytSBIKXogI");
        setBooleanField(term6015, term6015.getClass(), "isExternFile", false);
        setField(term6015, term6015.getClass(), "originalPath", "ytSBIKXogI");
        setField(term6015, term6015.getClass(), "lineOffsets", null);
        setIntField(term6015, term6015.getClass(), "lastOffset", 0);
        setIntField(term6015, term6015.getClass(), "lastLine", 1);
        setField(term6015, term6015.getClass(), "code", "nHXjMycHlU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "ytSBIKXogI";
        args[1] = "nHXjMycHlU";
        Object retValue = callMethod(klass, "fromCode", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term6015));
    }

};


