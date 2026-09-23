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

public class X5455_ExtendedTimestamp_getLocalFileDataData_2070398401345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71960;

    public X5455_ExtendedTimestamp_getLocalFileDataData_2070398401345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71960 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term72064 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term71960, term71960.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term71960, term71960.getClass(), "bit1_accessTimePresent", true);
        setField(term71960, term71960.getClass(), "accessTime", term72064);
        setBooleanField(term71960, term71960.getClass(), "bit2_createTimePresent", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getLocalFileDataData", argTypes, term71960, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


