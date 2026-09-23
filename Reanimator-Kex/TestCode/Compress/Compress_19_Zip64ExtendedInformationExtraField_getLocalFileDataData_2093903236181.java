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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Zip64ExtendedInformationExtraField_getLocalFileDataData_2093903236181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42935;

    public Zip64ExtendedInformationExtraField_getLocalFileDataData_2093903236181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42935 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        Object term43063 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        Object term43191 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipEightByteInteger"));
        setField(term43063, term43063.getClass(), "value", null);
        setField(term42935, term42935.getClass(), "size", term43063);
        setField(term42935, term42935.getClass(), "compressedSize", term43191);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getLocalFileDataData", argTypes, term42935, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


