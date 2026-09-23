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

public class SourceFile_getLine_1116699204320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55324;
     Object term55580;

    public SourceFile_getLine_1116699204320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55324 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(term55324, term55324.getClass(), "code", "");
        setIntField(term55324, term55324.getClass(), "lastLine", -2147483648);
        setIntField(term55324, term55324.getClass(), "lastOffset", 0);
        term55580 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(term55580, term55580.getClass(), "generator", null);
        setField(term55580, term55580.getClass(), "fileName", null);
        setBooleanField(term55580, term55580.getClass(), "isExternFile", false);
        setField(term55580, term55580.getClass(), "originalPath", null);
        setField(term55580, term55580.getClass(), "lineOffsets", null);
        setIntField(term55580, term55580.getClass(), "lastOffset", 0);
        setIntField(term55580, term55580.getClass(), "lastLine", -2147483648);
        setField(term55580, term55580.getClass(), "code", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 2147483647;
        Object retValue = callMethod(klass, "getLine", argTypes, term55324, args);
        assertTrue(recursiveEquals(term55324, term55580));
        assertTrue(recursiveEquals(retValue, null));
    }

};


