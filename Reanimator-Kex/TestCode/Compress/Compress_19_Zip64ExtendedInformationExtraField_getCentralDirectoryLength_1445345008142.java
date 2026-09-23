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

public class Zip64ExtendedInformationExtraField_getCentralDirectoryLength_1445345008142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30720;
     Object term31237;
     Object term31231;

    public Zip64ExtendedInformationExtraField_getCentralDirectoryLength_1445345008142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30720 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term30824 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(term30720, term30720.getClass(), "size", null);
        setField(term30720, term30720.getClass(), "compressedSize", null);
        setField(term30720, term30720.getClass(), "relativeHeaderOffset", null);
        setField(term30720, term30720.getClass(), "diskStart", term30824);
        term31237 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term31238 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(term31237, term31237.getClass(), "size", null);
        setField(term31237, term31237.getClass(), "compressedSize", null);
        setField(term31237, term31237.getClass(), "relativeHeaderOffset", null);
        setLongField(term31238, term31238.getClass(), "value", 0L);
        setField(term31237, term31237.getClass(), "diskStart", term31238);
        setField(term31237, term31237.getClass(), "rawCentralDirectoryData", null);
        term31231 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term31231, term31231.getClass(), "value", 4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryLength", argTypes, term30720, args);
        assertTrue(recursiveEquals(term30720, term31237));
        assertTrue(recursiveEquals(retValue, term31231));
    }

};


