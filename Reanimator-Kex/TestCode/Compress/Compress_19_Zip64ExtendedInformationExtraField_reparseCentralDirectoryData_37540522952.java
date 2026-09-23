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
import static org.apache.commons.compress.archivers.zip.EqualityUtils.*;

public class Zip64ExtendedInformationExtraField_reparseCentralDirectoryData_37540522952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7191;
     Object term7376;

    public Zip64ExtendedInformationExtraField_reparseCentralDirectoryData_37540522952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7191 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        byte[] term7009 = (byte[]) newByteArray(0);
        setField(term7191, term7191.getClass(), "rawCentralDirectoryData", term7009);
        term7376 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        byte[] term7377 = (byte[]) newByteArray(0);
        setField(term7376, term7376.getClass(), "size", null);
        setField(term7376, term7376.getClass(), "compressedSize", null);
        setField(term7376, term7376.getClass(), "relativeHeaderOffset", null);
        setField(term7376, term7376.getClass(), "diskStart", null);
        setField(term7376, term7376.getClass(), "rawCentralDirectoryData", term7377);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = boolean.class;
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = false;
        args[1] = false;
        args[2] = false;
        args[3] = false;
        callMethod(klass, "reparseCentralDirectoryData", argTypes, term7191, args);
        assertTrue(recursiveEquals(term7191, term7376));
    }

};


