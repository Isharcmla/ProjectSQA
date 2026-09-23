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

public class Zip64ExtendedInformationExtraField_getCentralDirectoryLength_144534500867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9428;
     Object term9702;
     Object term9698;

    public Zip64ExtendedInformationExtraField_getCentralDirectoryLength_144534500867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9428 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        setField(term9428, term9428.getClass(), "size", null);
        term9702 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        setField(term9702, term9702.getClass(), "size", null);
        setField(term9702, term9702.getClass(), "compressedSize", null);
        setField(term9702, term9702.getClass(), "relativeHeaderOffset", null);
        setField(term9702, term9702.getClass(), "diskStart", null);
        setField(term9702, term9702.getClass(), "rawCentralDirectoryData", null);
        term9698 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term9698, term9698.getClass(), "value", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryLength", argTypes, term9428, args);
        assertTrue(recursiveEquals(term9428, term9702));
        assertTrue(recursiveEquals(retValue, term9698));
    }

};


