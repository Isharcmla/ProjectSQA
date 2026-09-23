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

public class SourceFile_getCodeNoCache_79455620634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term414;
     Object term3056;

    public SourceFile_getCodeNoCache_79455620634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term414 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term440 = (int[]) newIntArray(6);
        setField(term414, term414.getClass(), "fileName", "ZiaGIbnzTs");
        setBooleanField(term414, term414.getClass(), "isExternFile", true);
        setField(term414, term414.getClass(), "originalPath", "tbcdzjIfER");
        setIntElement(term440, 0, -1275173084);
        setIntElement(term440, 1, -244121226);
        setIntElement(term440, 2, -203030934);
        setIntElement(term440, 3, -1179120542);
        setIntElement(term440, 4, -73683645);
        setIntElement(term440, 5, -226514366);
        setField(term414, term414.getClass(), "lineOffsets", term440);
        setIntField(term414, term414.getClass(), "lastOffset", 1193880199);
        setIntField(term414, term414.getClass(), "lastLine", -1087774327);
        setField(term414, term414.getClass(), "code", "HyxfbSQYBe");
        term3056 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term3061 = (int[]) newIntArray(6);
        setField(term3056, term3056.getClass(), "fileName", "ZiaGIbnzTs");
        setBooleanField(term3056, term3056.getClass(), "isExternFile", true);
        setField(term3056, term3056.getClass(), "originalPath", "tbcdzjIfER");
        setIntElement(term3061, 0, -1275173084);
        setIntElement(term3061, 1, -244121226);
        setIntElement(term3061, 2, -203030934);
        setIntElement(term3061, 3, -1179120542);
        setIntElement(term3061, 4, -73683645);
        setIntElement(term3061, 5, -226514366);
        setField(term3056, term3056.getClass(), "lineOffsets", term3061);
        setIntField(term3056, term3056.getClass(), "lastOffset", 1193880199);
        setIntField(term3056, term3056.getClass(), "lastLine", -1087774327);
        setField(term3056, term3056.getClass(), "code", "HyxfbSQYBe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCodeNoCache", argTypes, term414, args);
        assertTrue(recursiveEquals(term414, term3056));
        assertTrue(recursiveEquals(retValue, "HyxfbSQYBe"));
    }

};


