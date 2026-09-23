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

public class SourceFile_getLine_1116699204253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43852;
     Object term44213;

    public SourceFile_getLine_1116699204253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43852 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term43852, term43852.getClass(), "code", "");
        setIntField(term43852, term43852.getClass(), "lastLine", 0);
        setIntField(term43852, term43852.getClass(), "lastOffset", 0);
        term44213 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term44213, term44213.getClass(), "fileName", null);
        setBooleanField(term44213, term44213.getClass(), "isExternFile", false);
        setField(term44213, term44213.getClass(), "originalPath", null);
        setField(term44213, term44213.getClass(), "lineOffsets", null);
        setIntField(term44213, term44213.getClass(), "lastOffset", 0);
        setIntField(term44213, term44213.getClass(), "lastLine", 0);
        setField(term44213, term44213.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "getLine", argTypes, term43852, args);
        assertTrue(recursiveEquals(term43852, term44213));
        assertTrue(recursiveEquals(retValue, null));
    }

};


