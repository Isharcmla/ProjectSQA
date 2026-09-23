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

public class Zip64ExtendedInformationExtraField_getCentralDirectoryLength_1445345008160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35318;
     Object term35694;
     Object term35689;

    public Zip64ExtendedInformationExtraField_getCentralDirectoryLength_1445345008160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35318 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term35446 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        setField(term35318, term35318.getClass(), "size", term35446);
        setField(term35318, term35318.getClass(), "compressedSize", null);
        setField(term35318, term35318.getClass(), "relativeHeaderOffset", term35446);
        term35694 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term35695 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        setField(term35695, term35695.getClass(), "value", null);
        setField(term35694, term35694.getClass(), "size", term35695);
        setField(term35694, term35694.getClass(), "compressedSize", null);
        setField(term35694, term35694.getClass(), "relativeHeaderOffset", term35695);
        setField(term35694, term35694.getClass(), "diskStart", null);
        setField(term35694, term35694.getClass(), "rawCentralDirectoryData", null);
        term35689 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term35689, term35689.getClass(), "value", 16);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryLength", argTypes, term35318, args);
        assertTrue(recursiveEquals(term35318, term35694));
        assertTrue(recursiveEquals(retValue, term35689));
    }

};


