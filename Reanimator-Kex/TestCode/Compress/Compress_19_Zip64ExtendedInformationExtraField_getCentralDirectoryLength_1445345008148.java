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

public class Zip64ExtendedInformationExtraField_getCentralDirectoryLength_1445345008148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32013;
     Object term32630;
     Object term32623;

    public Zip64ExtendedInformationExtraField_getCentralDirectoryLength_1445345008148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32013 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term32141 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term32245 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(term32013, term32013.getClass(), "size", term32141);
        setField(term32013, term32013.getClass(), "compressedSize", null);
        setField(term32013, term32013.getClass(), "relativeHeaderOffset", null);
        setField(term32013, term32013.getClass(), "diskStart", term32245);
        term32630 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term32631 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term32632 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(term32631, term32631.getClass(), "value", null);
        setField(term32630, term32630.getClass(), "size", term32631);
        setField(term32630, term32630.getClass(), "compressedSize", null);
        setField(term32630, term32630.getClass(), "relativeHeaderOffset", null);
        setLongField(term32632, term32632.getClass(), "value", 0L);
        setField(term32630, term32630.getClass(), "diskStart", term32632);
        setField(term32630, term32630.getClass(), "rawCentralDirectoryData", null);
        term32623 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term32623, term32623.getClass(), "value", 12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryLength", argTypes, term32013, args);
        assertTrue(recursiveEquals(term32013, term32630));
        assertTrue(recursiveEquals(retValue, term32623));
    }

};


