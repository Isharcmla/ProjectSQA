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

public class X5455_ExtendedTimestamp_getLocalFileDataData_2070398401275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55171;
     Object term55195;
     Object term55193;

    public X5455_ExtendedTimestamp_getLocalFileDataData_2070398401275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55171 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setBooleanField(term55171, term55171.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term55171, term55171.getClass(), "bit1_accessTimePresent", true);
        setField(term55171, term55171.getClass(), "accessTime", null);
        setBooleanField(term55171, term55171.getClass(), "bit2_createTimePresent", true);
        term55195 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term55195, term55195.getClass(), "flags", (byte) 0);
        setBooleanField(term55195, term55195.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term55195, term55195.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term55195, term55195.getClass(), "bit2_createTimePresent", true);
        setField(term55195, term55195.getClass(), "modifyTime", null);
        setField(term55195, term55195.getClass(), "accessTime", null);
        setField(term55195, term55195.getClass(), "createTime", null);
        term55193 = (byte[]) newByteArray(1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataData", argTypes, term55171, args);
        assertTrue(recursiveEquals(term55171, term55195));
        assertTrue(recursiveEquals(retValue, term55193));
    }

};


