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

public class Zip64ExtendedInformationExtraField_getCentralDirectoryData_933794025165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37093;

    public Zip64ExtendedInformationExtraField_getCentralDirectoryData_933794025165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37093 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term37221 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term37267 = newInstance(Class.forName("java.math.BigInteger"));
        setField(term37221, term37221.getClass(), "value", term37267);
        setField(term37093, term37093.getClass(), "size", term37221);
        setField(term37093, term37093.getClass(), "compressedSize", null);
        setField(term37093, term37093.getClass(), "relativeHeaderOffset", null);
        setField(term37093, term37093.getClass(), "diskStart", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getCentralDirectoryData", argTypes, term37093, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


