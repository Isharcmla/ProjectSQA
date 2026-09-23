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

public class Zip64ExtendedInformationExtraField_reparseCentralDirectoryData_375405229130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27900;

    public Zip64ExtendedInformationExtraField_reparseCentralDirectoryData_375405229130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27900 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        byte[] term27675 = (byte[]) newByteArray(20);
        setField(term27900, term27900.getClass(), "rawCentralDirectoryData", term27675);
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
        args[0] = true;
        args[1] = true;
        args[2] = false;
        args[3] = true;
        callMethod(klass, "reparseCentralDirectoryData", argTypes, term27900, args);
    }

};


