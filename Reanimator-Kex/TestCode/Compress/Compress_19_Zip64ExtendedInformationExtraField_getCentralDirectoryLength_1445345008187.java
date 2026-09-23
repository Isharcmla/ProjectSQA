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

public class Zip64ExtendedInformationExtraField_getCentralDirectoryLength_1445345008187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45139;
     Object term45385;
     Object term45378;

    public Zip64ExtendedInformationExtraField_getCentralDirectoryLength_1445345008187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45139 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term45267 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term45371 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(term45139, term45139.getClass(), "size", null);
        setField(term45139, term45139.getClass(), "compressedSize", term45267);
        setField(term45139, term45139.getClass(), "relativeHeaderOffset", null);
        setField(term45139, term45139.getClass(), "diskStart", term45371);
        term45385 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term45386 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term45387 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(term45385, term45385.getClass(), "size", null);
        setField(term45386, term45386.getClass(), "value", null);
        setField(term45385, term45385.getClass(), "compressedSize", term45386);
        setField(term45385, term45385.getClass(), "relativeHeaderOffset", null);
        setLongField(term45387, term45387.getClass(), "value", 0L);
        setField(term45385, term45385.getClass(), "diskStart", term45387);
        setField(term45385, term45385.getClass(), "rawCentralDirectoryData", null);
        term45378 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term45378, term45378.getClass(), "value", 12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryLength", argTypes, term45139, args);
        assertTrue(recursiveEquals(term45139, term45385));
        assertTrue(recursiveEquals(retValue, term45378));
    }

};


