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

public class Zip64ExtendedInformationExtraField_getLocalFileDataLength_92541385961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8615;
     Object term8632;
     Object term8628;

    public Zip64ExtendedInformationExtraField_getLocalFileDataLength_92541385961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8615 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        setField(term8615, term8615.getClass(), "size", null);
        term8632 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        setField(term8632, term8632.getClass(), "size", null);
        setField(term8632, term8632.getClass(), "compressedSize", null);
        setField(term8632, term8632.getClass(), "relativeHeaderOffset", null);
        setField(term8632, term8632.getClass(), "diskStart", null);
        setField(term8632, term8632.getClass(), "rawCentralDirectoryData", null);
        term8628 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term8628, term8628.getClass(), "value", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataLength", argTypes, term8615, args);
        assertTrue(recursiveEquals(term8615, term8632));
        assertTrue(recursiveEquals(retValue, term8628));
    }

};


