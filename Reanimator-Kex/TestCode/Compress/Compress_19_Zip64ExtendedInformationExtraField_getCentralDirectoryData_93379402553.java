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

public class Zip64ExtendedInformationExtraField_getCentralDirectoryData_93379402553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7359;
     Object term7395;
     Object term7392;

    public Zip64ExtendedInformationExtraField_getCentralDirectoryData_93379402553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7359 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        setField(term7359, term7359.getClass(), "size", null);
        term7395 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        setField(term7395, term7395.getClass(), "size", null);
        setField(term7395, term7395.getClass(), "compressedSize", null);
        setField(term7395, term7395.getClass(), "relativeHeaderOffset", null);
        setField(term7395, term7395.getClass(), "diskStart", null);
        setField(term7395, term7395.getClass(), "rawCentralDirectoryData", null);
        term7392 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryData", argTypes, term7359, args);
        assertTrue(recursiveEquals(term7359, term7395));
        assertTrue(recursiveEquals(retValue, term7392));
    }

};


