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

public class X5455_ExtendedTimestamp_getLocalFileDataLength_948918694197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34599;
     Object term34612;
     Object term34604;

    public X5455_ExtendedTimestamp_getLocalFileDataLength_948918694197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34599 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setBooleanField(term34599, term34599.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term34599, term34599.getClass(), "bit1_accessTimePresent", true);
        term34612 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term34612, term34612.getClass(), "flags", (byte) 0);
        setBooleanField(term34612, term34612.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term34612, term34612.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term34612, term34612.getClass(), "bit2_createTimePresent", false);
        setField(term34612, term34612.getClass(), "modifyTime", null);
        setField(term34612, term34612.getClass(), "accessTime", null);
        setField(term34612, term34612.getClass(), "createTime", null);
        term34604 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term34604, term34604.getClass(), "value", 5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataLength", argTypes, term34599, args);
        assertTrue(recursiveEquals(term34599, term34612));
        assertTrue(recursiveEquals(retValue, term34604));
    }

};


