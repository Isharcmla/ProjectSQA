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

public class ArchiveUtils_toAsciiBytes_39540031618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term889;

    public ArchiveUtils_toAsciiBytes_39540031618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term889 = (byte[]) newByteArray(10);
        setByteElement(term889, 0, (byte) 77);
        setByteElement(term889, 1, (byte) 117);
        setByteElement(term889, 2, (byte) 76);
        setByteElement(term889, 3, (byte) 99);
        setByteElement(term889, 4, (byte) 103);
        setByteElement(term889, 5, (byte) 81);
        setByteElement(term889, 6, (byte) 72);
        setByteElement(term889, 7, (byte) 103);
        setByteElement(term889, 8, (byte) 113);
        setByteElement(term889, 9, (byte) 122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.ArchiveUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MuLcgQHgqz";
        Object retValue = callMethod(klass, "toAsciiBytes", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term889));
    }

};


