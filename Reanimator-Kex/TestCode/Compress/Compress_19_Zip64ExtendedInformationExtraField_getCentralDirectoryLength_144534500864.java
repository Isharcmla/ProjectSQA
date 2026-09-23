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
import java.lang.Object;

public class Zip64ExtendedInformationExtraField_getCentralDirectoryLength_144534500864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8810;
     Object term9259;
     Object term9254;

    public Zip64ExtendedInformationExtraField_getCentralDirectoryLength_144534500864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8810 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term8938 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        setField(term8810, term8810.getClass(), "size", term8938);
        setField(term8810, term8810.getClass(), "compressedSize", term8938);
        setField(term8810, term8810.getClass(), "relativeHeaderOffset", null);
        term9259 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term9260 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        setField(term9260, term9260.getClass(), "value", null);
        setField(term9259, term9259.getClass(), "size", term9260);
        setField(term9259, term9259.getClass(), "compressedSize", term9260);
        setField(term9259, term9259.getClass(), "relativeHeaderOffset", null);
        setField(term9259, term9259.getClass(), "diskStart", null);
        setField(term9259, term9259.getClass(), "rawCentralDirectoryData", null);
        term9254 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term9254, term9254.getClass(), "value", 16);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryLength", argTypes, term8810, args);
        assertTrue(recursiveEquals(term8810, term9259));
        assertTrue(recursiveEquals(retValue, term9254));
    }

};


