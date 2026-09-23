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

public class Zip64ExtendedInformationExtraField_getCentralDirectoryLength_144534500870 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9877;
     Object term10314;
     Object term10309;

    public Zip64ExtendedInformationExtraField_getCentralDirectoryLength_144534500870() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9877 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term10005 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        setField(term9877, term9877.getClass(), "size", term10005);
        setField(term9877, term9877.getClass(), "compressedSize", null);
        term10314 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term10315 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        setField(term10315, term10315.getClass(), "value", null);
        setField(term10314, term10314.getClass(), "size", term10315);
        setField(term10314, term10314.getClass(), "compressedSize", null);
        setField(term10314, term10314.getClass(), "relativeHeaderOffset", null);
        setField(term10314, term10314.getClass(), "diskStart", null);
        setField(term10314, term10314.getClass(), "rawCentralDirectoryData", null);
        term10309 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term10309, term10309.getClass(), "value", 8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryLength", argTypes, term9877, args);
        assertTrue(recursiveEquals(term9877, term10314));
        assertTrue(recursiveEquals(retValue, term10309));
    }

};


