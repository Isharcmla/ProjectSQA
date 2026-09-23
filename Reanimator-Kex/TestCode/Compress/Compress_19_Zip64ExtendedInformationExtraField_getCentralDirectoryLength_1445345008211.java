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

public class Zip64ExtendedInformationExtraField_getCentralDirectoryLength_1445345008211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52492;
     Object term52865;
     Object term52857;

    public Zip64ExtendedInformationExtraField_getCentralDirectoryLength_1445345008211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52492 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term52620 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term52748 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term52852 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(term52492, term52492.getClass(), "size", term52620);
        setField(term52492, term52492.getClass(), "compressedSize", null);
        setField(term52492, term52492.getClass(), "relativeHeaderOffset", term52748);
        setField(term52492, term52492.getClass(), "diskStart", term52852);
        term52865 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term52866 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term52867 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term52868 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(term52866, term52866.getClass(), "value", null);
        setField(term52865, term52865.getClass(), "size", term52866);
        setField(term52865, term52865.getClass(), "compressedSize", null);
        setField(term52867, term52867.getClass(), "value", null);
        setField(term52865, term52865.getClass(), "relativeHeaderOffset", term52867);
        setLongField(term52868, term52868.getClass(), "value", 0L);
        setField(term52865, term52865.getClass(), "diskStart", term52868);
        setField(term52865, term52865.getClass(), "rawCentralDirectoryData", null);
        term52857 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term52857, term52857.getClass(), "value", 20);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryLength", argTypes, term52492, args);
        assertTrue(recursiveEquals(term52492, term52865));
        assertTrue(recursiveEquals(retValue, term52857));
    }

};


