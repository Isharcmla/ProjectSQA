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

public class SourceFile_fromGenerator_5296682655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7117;

    public SourceFile_fromGenerator_5296682655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7117 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(term7117, term7117.getClass(), "generator", null);
        setField(term7117, term7117.getClass(), "fileName", "TJmVBGfTML");
        setBooleanField(term7117, term7117.getClass(), "isExternFile", false);
        setField(term7117, term7117.getClass(), "originalPath", null);
        setField(term7117, term7117.getClass(), "lineOffsets", null);
        setIntField(term7117, term7117.getClass(), "lastOffset", 0);
        setIntField(term7117, term7117.getClass(), "lastLine", 1);
        setField(term7117, term7117.getClass(), "code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.SourceFile$Generator");
        Object[] args = new Object[2];
        args[0] = "TJmVBGfTML";
        args[1] = null;
        Object retValue = callMethod(klass, "fromGenerator", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term7117));
    }

};


