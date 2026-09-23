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

public class Zip64ExtendedInformationExtraField_getCentralDirectoryLength_1445345008146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31701;
     Object term32255;
     Object term32250;

    public Zip64ExtendedInformationExtraField_getCentralDirectoryLength_1445345008146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31701 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term31829 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        setField(term31701, term31701.getClass(), "size", null);
        setField(term31701, term31701.getClass(), "compressedSize", null);
        setField(term31701, term31701.getClass(), "relativeHeaderOffset", term31829);
        term32255 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term32256 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        setField(term32255, term32255.getClass(), "size", null);
        setField(term32255, term32255.getClass(), "compressedSize", null);
        setField(term32256, term32256.getClass(), "value", null);
        setField(term32255, term32255.getClass(), "relativeHeaderOffset", term32256);
        setField(term32255, term32255.getClass(), "diskStart", null);
        setField(term32255, term32255.getClass(), "rawCentralDirectoryData", null);
        term32250 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term32250, term32250.getClass(), "value", 8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryLength", argTypes, term31701, args);
        assertTrue(recursiveEquals(term31701, term32255));
        assertTrue(recursiveEquals(retValue, term32250));
    }

};


