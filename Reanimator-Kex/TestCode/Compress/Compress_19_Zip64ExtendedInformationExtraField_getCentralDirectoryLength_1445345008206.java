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

public class Zip64ExtendedInformationExtraField_getCentralDirectoryLength_1445345008206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50801;
     Object term51350;
     Object term51343;

    public Zip64ExtendedInformationExtraField_getCentralDirectoryLength_1445345008206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50801 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term50929 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term51033 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(term50801, term50801.getClass(), "size", null);
        setField(term50801, term50801.getClass(), "compressedSize", null);
        setField(term50801, term50801.getClass(), "relativeHeaderOffset", term50929);
        setField(term50801, term50801.getClass(), "diskStart", term51033);
        term51350 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term51351 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term51352 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(term51350, term51350.getClass(), "size", null);
        setField(term51350, term51350.getClass(), "compressedSize", null);
        setField(term51351, term51351.getClass(), "value", null);
        setField(term51350, term51350.getClass(), "relativeHeaderOffset", term51351);
        setLongField(term51352, term51352.getClass(), "value", 0L);
        setField(term51350, term51350.getClass(), "diskStart", term51352);
        setField(term51350, term51350.getClass(), "rawCentralDirectoryData", null);
        term51343 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term51343, term51343.getClass(), "value", 12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryLength", argTypes, term50801, args);
        assertTrue(recursiveEquals(term50801, term51350));
        assertTrue(recursiveEquals(retValue, term51343));
    }

};


