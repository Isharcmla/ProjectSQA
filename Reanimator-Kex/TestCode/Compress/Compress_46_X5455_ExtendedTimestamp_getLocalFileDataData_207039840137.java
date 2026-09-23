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

public class X5455_ExtendedTimestamp_getLocalFileDataData_207039840137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34;
     Object term507;
     Object term497;

    public X5455_ExtendedTimestamp_getLocalFileDataData_207039840137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term39 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term41 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term43 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term34, term34.getClass(), "flags", (byte) 75);
        setBooleanField(term34, term34.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term34, term34.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term34, term34.getClass(), "bit2_createTimePresent", true);
        setLongField(term39, term39.getClass(), "value", 6967924379644551255L);
        setField(term34, term34.getClass(), "modifyTime", term39);
        setLongField(term41, term41.getClass(), "value", -2813493605142626659L);
        setField(term34, term34.getClass(), "accessTime", term41);
        setLongField(term43, term43.getClass(), "value", -8885298608300233488L);
        setField(term34, term34.getClass(), "createTime", term43);
        term507 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term508 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term509 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term510 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term507, term507.getClass(), "flags", (byte) 75);
        setBooleanField(term507, term507.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term507, term507.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term507, term507.getClass(), "bit2_createTimePresent", true);
        setLongField(term508, term508.getClass(), "value", 6967924379644551255L);
        setField(term507, term507.getClass(), "modifyTime", term508);
        setLongField(term509, term509.getClass(), "value", -2813493605142626659L);
        setField(term507, term507.getClass(), "accessTime", term509);
        setLongField(term510, term510.getClass(), "value", -8885298608300233488L);
        setField(term507, term507.getClass(), "createTime", term510);
        term497 = (byte[]) newByteArray(9);
        setByteElement(term497, 0, (byte) 5);
        setByteElement(term497, 1, (byte) 87);
        setByteElement(term497, 2, (byte) 96);
        setByteElement(term497, 3, (byte) 127);
        setByteElement(term497, 4, (byte) 62);
        setByteElement(term497, 5, (byte) -16);
        setByteElement(term497, 6, (byte) -20);
        setByteElement(term497, 7, (byte) -3);
        setByteElement(term497, 8, (byte) -8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataData", argTypes, term34, args);
        assertTrue(recursiveEquals(term34, term507));
        assertTrue(recursiveEquals(retValue, term497));
    }

};


