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

public class Zip64ExtendedInformationExtraField_getCentralDirectoryLength_1445345008169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37911;
     Object term38575;
     Object term38567;

    public Zip64ExtendedInformationExtraField_getCentralDirectoryLength_1445345008169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37911 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term38039 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term38167 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term38271 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(term37911, term37911.getClass(), "size", term38039);
        setField(term37911, term37911.getClass(), "compressedSize", term38167);
        setField(term37911, term37911.getClass(), "relativeHeaderOffset", null);
        setField(term37911, term37911.getClass(), "diskStart", term38271);
        term38575 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term38576 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term38577 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term38578 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(term38576, term38576.getClass(), "value", null);
        setField(term38575, term38575.getClass(), "size", term38576);
        setField(term38577, term38577.getClass(), "value", null);
        setField(term38575, term38575.getClass(), "compressedSize", term38577);
        setField(term38575, term38575.getClass(), "relativeHeaderOffset", null);
        setLongField(term38578, term38578.getClass(), "value", 0L);
        setField(term38575, term38575.getClass(), "diskStart", term38578);
        setField(term38575, term38575.getClass(), "rawCentralDirectoryData", null);
        term38567 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term38567, term38567.getClass(), "value", 20);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryLength", argTypes, term37911, args);
        assertTrue(recursiveEquals(term37911, term38575));
        assertTrue(recursiveEquals(retValue, term38567));
    }

};


