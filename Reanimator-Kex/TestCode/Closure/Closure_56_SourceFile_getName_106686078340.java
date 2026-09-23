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

public class SourceFile_getName_106686078340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term940;
     Object term3909;

    public SourceFile_getName_106686078340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term940 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term966 = (int[]) newIntArray(5);
        setField(term940, term940.getClass(), "fileName", "xrwlQZdwCp");
        setBooleanField(term940, term940.getClass(), "isExternFile", true);
        setField(term940, term940.getClass(), "originalPath", "IDCWpPLRkE");
        setIntElement(term966, 0, -112921587);
        setIntElement(term966, 1, 933028652);
        setIntElement(term966, 2, 287287233);
        setIntElement(term966, 3, 962840079);
        setIntElement(term966, 4, 1540719661);
        setField(term940, term940.getClass(), "lineOffsets", term966);
        setIntField(term940, term940.getClass(), "lastOffset", 1265463001);
        setIntField(term940, term940.getClass(), "lastLine", 335112684);
        setField(term940, term940.getClass(), "code", "nyiiPDVjAc");
        term3909 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile"));
        int[] term3914 = (int[]) newIntArray(5);
        setField(term3909, term3909.getClass(), "fileName", "xrwlQZdwCp");
        setBooleanField(term3909, term3909.getClass(), "isExternFile", true);
        setField(term3909, term3909.getClass(), "originalPath", "IDCWpPLRkE");
        setIntElement(term3914, 0, -112921587);
        setIntElement(term3914, 1, 933028652);
        setIntElement(term3914, 2, 287287233);
        setIntElement(term3914, 3, 962840079);
        setIntElement(term3914, 4, 1540719661);
        setField(term3909, term3909.getClass(), "lineOffsets", term3914);
        setIntField(term3909, term3909.getClass(), "lastOffset", 1265463001);
        setIntField(term3909, term3909.getClass(), "lastLine", 335112684);
        setField(term3909, term3909.getClass(), "code", "nyiiPDVjAc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getName", argTypes, term940, args);
        assertTrue(recursiveEquals(term940, term3909));
        assertTrue(recursiveEquals(retValue, "xrwlQZdwCp"));
    }

};


