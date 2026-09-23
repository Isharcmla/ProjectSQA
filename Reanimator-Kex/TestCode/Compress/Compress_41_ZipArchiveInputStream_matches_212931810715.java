package org.apache.commons.compress.archivers.zip;

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
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ZipArchiveInputStream_matches_212931810715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2045;
     Object term2051;

    public ZipArchiveInputStream_matches_212931810715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2045 = (byte[]) newByteArray(5);
        setByteElement(term2045, 0, (byte) 122);
        setByteElement(term2045, 1, (byte) -44);
        setByteElement(term2045, 2, (byte) 87);
        setByteElement(term2045, 3, (byte) 43);
        setByteElement(term2045, 4, (byte) -27);
        term2051 = new Integer(-1034506028);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2045;
        args[1] = term2051;
        callMethod(klass, "matches", argTypes, null, args);
    }

};


