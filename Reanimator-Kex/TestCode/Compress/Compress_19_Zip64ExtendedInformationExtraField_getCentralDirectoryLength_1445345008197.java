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

public class Zip64ExtendedInformationExtraField_getCentralDirectoryLength_1445345008197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48739;
     Object term48877;
     Object term48872;

    public Zip64ExtendedInformationExtraField_getCentralDirectoryLength_1445345008197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48739 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term48867 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        setField(term48739, term48739.getClass(), "size", null);
        setField(term48739, term48739.getClass(), "compressedSize", term48867);
        setField(term48739, term48739.getClass(), "relativeHeaderOffset", term48867);
        term48877 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term48878 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        setField(term48877, term48877.getClass(), "size", null);
        setField(term48878, term48878.getClass(), "value", null);
        setField(term48877, term48877.getClass(), "compressedSize", term48878);
        setField(term48877, term48877.getClass(), "relativeHeaderOffset", term48878);
        setField(term48877, term48877.getClass(), "diskStart", null);
        setField(term48877, term48877.getClass(), "rawCentralDirectoryData", null);
        term48872 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term48872, term48872.getClass(), "value", 16);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryLength", argTypes, term48739, args);
        assertTrue(recursiveEquals(term48739, term48877));
        assertTrue(recursiveEquals(retValue, term48872));
    }

};


