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

public class X5455_ExtendedTimestamp_getCentralDirectoryData_957298860245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46038;
     Object term46069;
     Object term46067;

    public X5455_ExtendedTimestamp_getCentralDirectoryData_957298860245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46038 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setBooleanField(term46038, term46038.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term46038, term46038.getClass(), "bit1_accessTimePresent", true);
        setField(term46038, term46038.getClass(), "accessTime", null);
        term46069 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term46069, term46069.getClass(), "flags", (byte) 0);
        setBooleanField(term46069, term46069.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term46069, term46069.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term46069, term46069.getClass(), "bit2_createTimePresent", false);
        setField(term46069, term46069.getClass(), "modifyTime", null);
        setField(term46069, term46069.getClass(), "accessTime", null);
        setField(term46069, term46069.getClass(), "createTime", null);
        term46067 = (byte[]) newByteArray(1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryData", argTypes, term46038, args);
        assertTrue(recursiveEquals(term46038, term46069));
        assertTrue(recursiveEquals(retValue, term46067));
    }

};


