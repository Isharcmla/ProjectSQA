package org.apache.commons.compress.utils;

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
import static org.apache.commons.compress.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.utils.EqualityUtils.*;

public class ArchiveUtils_toAsciiString_158093495219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91;
     Object term956;

    public ArchiveUtils_toAsciiString_158093495219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91 = (byte[]) newByteArray(3);
        setByteElement(term91, 0, (byte) 79);
        setByteElement(term91, 1, (byte) -119);
        setByteElement(term91, 2, (byte) -66);
        term956 = (byte[]) newByteArray(3);
        setByteElement(term956, 0, (byte) 79);
        setByteElement(term956, 1, (byte) -119);
        setByteElement(term956, 2, (byte) -66);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.ArchiveUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term91;
        Object retValue = callMethod(klass, "toAsciiString", argTypes, null, args);
        assertTrue(recursiveEquals(term91, term956));
        assertTrue(recursiveEquals(retValue, "O \uFFFD\uFFFF\uFFFD\uFFFF"));
    }

};


