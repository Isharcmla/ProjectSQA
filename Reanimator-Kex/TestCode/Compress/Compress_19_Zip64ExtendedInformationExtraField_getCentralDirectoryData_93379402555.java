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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Zip64ExtendedInformationExtraField_getCentralDirectoryData_93379402555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7573;

    public Zip64ExtendedInformationExtraField_getCentralDirectoryData_93379402555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7573 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term7701 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        setField(term7573, term7573.getClass(), "size", term7701);
        setField(term7573, term7573.getClass(), "compressedSize", term7701);
        setField(term7573, term7573.getClass(), "relativeHeaderOffset", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getCentralDirectoryData", argTypes, term7573, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


