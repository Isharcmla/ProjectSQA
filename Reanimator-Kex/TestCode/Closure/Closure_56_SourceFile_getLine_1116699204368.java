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

public class SourceFile_getLine_1116699204368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125818;
     Object term126035;

    public SourceFile_getLine_1116699204368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125818 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term125818, term125818.getClass(), "code", "");
        setIntField(term125818, term125818.getClass(), "lastLine", -2147483648);
        setIntField(term125818, term125818.getClass(), "lastOffset", 0);
        term126035 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term126035, term126035.getClass(), "fileName", null);
        setBooleanField(term126035, term126035.getClass(), "isExternFile", false);
        setField(term126035, term126035.getClass(), "originalPath", null);
        setField(term126035, term126035.getClass(), "lineOffsets", null);
        setIntField(term126035, term126035.getClass(), "lastOffset", 0);
        setIntField(term126035, term126035.getClass(), "lastLine", -2147483648);
        setField(term126035, term126035.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 2147483647;
        Object retValue = callMethod(klass, "getLine", argTypes, term125818, args);
        assertTrue(recursiveEquals(term125818, term126035));
        assertTrue(recursiveEquals(retValue, null));
    }

};


