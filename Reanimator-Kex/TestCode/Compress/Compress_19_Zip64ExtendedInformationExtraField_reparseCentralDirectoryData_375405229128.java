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

public class Zip64ExtendedInformationExtraField_reparseCentralDirectoryData_375405229128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27246;

    public Zip64ExtendedInformationExtraField_reparseCentralDirectoryData_375405229128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27246 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        byte[] term27038 = (byte[]) newByteArray(12);
        setField(term27246, term27246.getClass(), "rawCentralDirectoryData", term27038);
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
        args[2] = true;
        args[3] = true;
        callMethod(klass, "reparseCentralDirectoryData", argTypes, term27246, args);
    }

};


