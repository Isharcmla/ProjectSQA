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

public class SourceFile_getLine_1116699204112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16114;
     Object term16583;

    public SourceFile_getLine_1116699204112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16114 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term16114, term16114.getClass(), "code", "");
        setIntField(term16114, term16114.getClass(), "lastLine", 0);
        setIntField(term16114, term16114.getClass(), "lastOffset", 0);
        term16583 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        setField(term16583, term16583.getClass(), "fileName", null);
        setBooleanField(term16583, term16583.getClass(), "isExternFile", false);
        setField(term16583, term16583.getClass(), "originalPath", null);
        setField(term16583, term16583.getClass(), "lineOffsets", null);
        setIntField(term16583, term16583.getClass(), "lastOffset", 0);
        setIntField(term16583, term16583.getClass(), "lastLine", 0);
        setField(term16583, term16583.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "getLine", argTypes, term16114, args);
        assertTrue(recursiveEquals(term16114, term16583));
        assertTrue(recursiveEquals(retValue, null));
    }

};


