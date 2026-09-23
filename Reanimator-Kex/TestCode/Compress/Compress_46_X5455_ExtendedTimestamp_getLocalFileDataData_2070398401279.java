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

public class X5455_ExtendedTimestamp_getLocalFileDataData_2070398401279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55945;
     Object term56097;
     Object term56091;

    public X5455_ExtendedTimestamp_getLocalFileDataData_2070398401279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55945 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term56049 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term55945, term55945.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term55945, term55945.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term55945, term55945.getClass(), "bit2_createTimePresent", true);
        setField(term55945, term55945.getClass(), "createTime", null);
        setField(term55945, term55945.getClass(), "modifyTime", term56049);
        term56097 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term56098 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term56097, term56097.getClass(), "flags", (byte) 0);
        setBooleanField(term56097, term56097.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term56097, term56097.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term56097, term56097.getClass(), "bit2_createTimePresent", true);
        setLongField(term56098, term56098.getClass(), "value", 0L);
        setField(term56097, term56097.getClass(), "modifyTime", term56098);
        setField(term56097, term56097.getClass(), "accessTime", null);
        setField(term56097, term56097.getClass(), "createTime", null);
        term56091 = (byte[]) newByteArray(5);
        setByteElement(term56091, 0, (byte) 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataData", argTypes, term55945, args);
        assertTrue(recursiveEquals(term55945, term56097));
        assertTrue(recursiveEquals(retValue, term56091));
    }

};


