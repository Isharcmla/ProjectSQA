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

public class Zip64ExtendedInformationExtraField_getCentralDirectoryLength_144534500860 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8314;
     Object term8625;
     Object term8620;

    public Zip64ExtendedInformationExtraField_getCentralDirectoryLength_144534500860() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8314 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term8442 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        setField(term8314, term8314.getClass(), "size", term8442);
        setField(term8314, term8314.getClass(), "compressedSize", term8442);
        setField(term8314, term8314.getClass(), "relativeHeaderOffset", term8442);
        setField(term8314, term8314.getClass(), "diskStart", null);
        term8625 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term8626 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        setField(term8626, term8626.getClass(), "value", null);
        setField(term8625, term8625.getClass(), "size", term8626);
        setField(term8625, term8625.getClass(), "compressedSize", term8626);
        setField(term8625, term8625.getClass(), "relativeHeaderOffset", term8626);
        setField(term8625, term8625.getClass(), "diskStart", null);
        setField(term8625, term8625.getClass(), "rawCentralDirectoryData", null);
        term8620 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term8620, term8620.getClass(), "value", 24);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryLength", argTypes, term8314, args);
        assertTrue(recursiveEquals(term8314, term8625));
        assertTrue(recursiveEquals(retValue, term8620));
    }

};


