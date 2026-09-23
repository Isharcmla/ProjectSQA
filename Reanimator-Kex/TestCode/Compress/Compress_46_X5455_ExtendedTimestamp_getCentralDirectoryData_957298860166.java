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

public class X5455_ExtendedTimestamp_getCentralDirectoryData_957298860166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24016;
     Object term24447;
     Object term24445;

    public X5455_ExtendedTimestamp_getCentralDirectoryData_957298860166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24016 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setBooleanField(term24016, term24016.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term24016, term24016.getClass(), "bit1_accessTimePresent", false);
        term24447 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term24447, term24447.getClass(), "flags", (byte) 0);
        setBooleanField(term24447, term24447.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term24447, term24447.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term24447, term24447.getClass(), "bit2_createTimePresent", false);
        setField(term24447, term24447.getClass(), "modifyTime", null);
        setField(term24447, term24447.getClass(), "accessTime", null);
        setField(term24447, term24447.getClass(), "createTime", null);
        term24445 = (byte[]) newByteArray(1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryData", argTypes, term24016, args);
        assertTrue(recursiveEquals(term24016, term24447));
        assertTrue(recursiveEquals(retValue, term24445));
    }

};


