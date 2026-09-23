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

public class X5455_ExtendedTimestamp_getCentralDirectoryData_957298860315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64777;
     Object term65072;
     Object term65066;

    public X5455_ExtendedTimestamp_getCentralDirectoryData_957298860315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64777 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term64881 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term64985 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term64777, term64777.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term64777, term64777.getClass(), "bit1_accessTimePresent", true);
        setField(term64777, term64777.getClass(), "accessTime", term64881);
        setBooleanField(term64777, term64777.getClass(), "bit2_createTimePresent", true);
        setField(term64777, term64777.getClass(), "createTime", null);
        setField(term64777, term64777.getClass(), "modifyTime", term64985);
        term65072 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term65073 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term65074 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term65072, term65072.getClass(), "flags", (byte) 0);
        setBooleanField(term65072, term65072.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term65072, term65072.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term65072, term65072.getClass(), "bit2_createTimePresent", true);
        setLongField(term65073, term65073.getClass(), "value", 0L);
        setField(term65072, term65072.getClass(), "modifyTime", term65073);
        setLongField(term65074, term65074.getClass(), "value", 0L);
        setField(term65072, term65072.getClass(), "accessTime", term65074);
        setField(term65072, term65072.getClass(), "createTime", null);
        term65066 = (byte[]) newByteArray(5);
        setByteElement(term65066, 0, (byte) 3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryData", argTypes, term64777, args);
        assertTrue(recursiveEquals(term64777, term65072));
        assertTrue(recursiveEquals(retValue, term65066));
    }

};


