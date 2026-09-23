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

public class Zip64ExtendedInformationExtraField_getCentralDirectoryLength_1445345008219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55632;
     Object term56005;
     Object term55997;

    public Zip64ExtendedInformationExtraField_getCentralDirectoryLength_1445345008219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55632 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term55760 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term55888 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term55992 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(term55632, term55632.getClass(), "size", null);
        setField(term55632, term55632.getClass(), "compressedSize", term55760);
        setField(term55632, term55632.getClass(), "relativeHeaderOffset", term55888);
        setField(term55632, term55632.getClass(), "diskStart", term55992);
        term56005 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term56006 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term56007 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term56008 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(term56005, term56005.getClass(), "size", null);
        setField(term56006, term56006.getClass(), "value", null);
        setField(term56005, term56005.getClass(), "compressedSize", term56006);
        setField(term56007, term56007.getClass(), "value", null);
        setField(term56005, term56005.getClass(), "relativeHeaderOffset", term56007);
        setLongField(term56008, term56008.getClass(), "value", 0L);
        setField(term56005, term56005.getClass(), "diskStart", term56008);
        setField(term56005, term56005.getClass(), "rawCentralDirectoryData", null);
        term55997 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term55997, term55997.getClass(), "value", 20);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryLength", argTypes, term55632, args);
        assertTrue(recursiveEquals(term55632, term56005));
        assertTrue(recursiveEquals(retValue, term55997));
    }

};


