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

public class SourceFile_setOriginalPath_47592888437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term677;
     Object term3505;

    public SourceFile_setOriginalPath_47592888437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term677 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term703 = (int[]) newIntArray(7);
        setField(term677, term677.getClass(), "fileName", "flxyYxBRtu");
        setBooleanField(term677, term677.getClass(), "isExternFile", false);
        setField(term677, term677.getClass(), "originalPath", "OclPbYPkcH");
        setIntElement(term703, 0, 579005622);
        setIntElement(term703, 1, -14890619);
        setIntElement(term703, 2, 1632125673);
        setIntElement(term703, 3, 454281060);
        setIntElement(term703, 4, -1786399638);
        setIntElement(term703, 5, 2055867847);
        setIntElement(term703, 6, -1048298087);
        setField(term677, term677.getClass(), "lineOffsets", term703);
        setIntField(term677, term677.getClass(), "lastOffset", 292681826);
        setIntField(term677, term677.getClass(), "lastLine", 458147407);
        setField(term677, term677.getClass(), "code", "IoAlmYsBwc");
        term3505 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term3510 = (int[]) newIntArray(7);
        setField(term3505, term3505.getClass(), "fileName", "flxyYxBRtu");
        setBooleanField(term3505, term3505.getClass(), "isExternFile", false);
        setField(term3505, term3505.getClass(), "originalPath", "TEParAifyi");
        setIntElement(term3510, 0, 579005622);
        setIntElement(term3510, 1, -14890619);
        setIntElement(term3510, 2, 1632125673);
        setIntElement(term3510, 3, 454281060);
        setIntElement(term3510, 4, -1786399638);
        setIntElement(term3510, 5, 2055867847);
        setIntElement(term3510, 6, -1048298087);
        setField(term3505, term3505.getClass(), "lineOffsets", term3510);
        setIntField(term3505, term3505.getClass(), "lastOffset", 292681826);
        setIntField(term3505, term3505.getClass(), "lastLine", 458147407);
        setField(term3505, term3505.getClass(), "code", "IoAlmYsBwc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TEParAifyi";
        callMethod(klass, "setOriginalPath", argTypes, term677, args);
        assertTrue(recursiveEquals(term677, term3505));
    }

};


