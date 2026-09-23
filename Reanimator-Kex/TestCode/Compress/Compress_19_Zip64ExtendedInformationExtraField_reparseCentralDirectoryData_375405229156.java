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
import java.util.zip.ZipException;
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Zip64ExtendedInformationExtraField_reparseCentralDirectoryData_375405229156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34573;

    public Zip64ExtendedInformationExtraField_reparseCentralDirectoryData_375405229156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34573 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        byte[] term34394 = (byte[]) newByteArray(0);
        setField(term34573, term34573.getClass(), "rawCentralDirectoryData", term34394);
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
        args[1] = true;
        args[2] = true;
        args[3] = true;
        try {
            callMethod(klass, "reparseCentralDirectoryData", argTypes, term34573, args);
            assertTrue(false);
        }
        catch (ZipException e) {
        }

    }

};


