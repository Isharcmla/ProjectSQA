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

public class X5455_ExtendedTimestamp_getLocalFileDataData_2070398401357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74987;
     Object term75185;
     Object term75171;

    public X5455_ExtendedTimestamp_getLocalFileDataData_2070398401357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74987 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term75091 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term74987, term74987.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term74987, term74987.getClass(), "bit1_accessTimePresent", true);
        setField(term74987, term74987.getClass(), "accessTime", term75091);
        setBooleanField(term74987, term74987.getClass(), "bit2_createTimePresent", true);
        setField(term74987, term74987.getClass(), "createTime", term75091);
        setField(term74987, term74987.getClass(), "modifyTime", term75091);
        term75185 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term75186 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term75185, term75185.getClass(), "flags", (byte) 0);
        setBooleanField(term75185, term75185.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term75185, term75185.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term75185, term75185.getClass(), "bit2_createTimePresent", true);
        setLongField(term75186, term75186.getClass(), "value", 0L);
        setField(term75185, term75185.getClass(), "modifyTime", term75186);
        setField(term75185, term75185.getClass(), "accessTime", term75186);
        setField(term75185, term75185.getClass(), "createTime", term75186);
        term75171 = (byte[]) newByteArray(13);
        setByteElement(term75171, 0, (byte) 7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataData", argTypes, term74987, args);
        assertTrue(recursiveEquals(term74987, term75185));
        assertTrue(recursiveEquals(retValue, term75171));
    }

};


