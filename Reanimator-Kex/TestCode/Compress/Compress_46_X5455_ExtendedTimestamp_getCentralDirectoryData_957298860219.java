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

public class X5455_ExtendedTimestamp_getCentralDirectoryData_957298860219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38724;
     Object term38889;
     Object term38883;

    public X5455_ExtendedTimestamp_getCentralDirectoryData_957298860219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38724 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term38828 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term38724, term38724.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term38724, term38724.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term38724, term38724.getClass(), "bit2_createTimePresent", true);
        setField(term38724, term38724.getClass(), "createTime", null);
        setField(term38724, term38724.getClass(), "modifyTime", term38828);
        term38889 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term38890 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term38889, term38889.getClass(), "flags", (byte) 0);
        setBooleanField(term38889, term38889.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term38889, term38889.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term38889, term38889.getClass(), "bit2_createTimePresent", true);
        setLongField(term38890, term38890.getClass(), "value", 0L);
        setField(term38889, term38889.getClass(), "modifyTime", term38890);
        setField(term38889, term38889.getClass(), "accessTime", null);
        setField(term38889, term38889.getClass(), "createTime", null);
        term38883 = (byte[]) newByteArray(5);
        setByteElement(term38883, 0, (byte) 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryData", argTypes, term38724, args);
        assertTrue(recursiveEquals(term38724, term38889));
        assertTrue(recursiveEquals(retValue, term38883));
    }

};


