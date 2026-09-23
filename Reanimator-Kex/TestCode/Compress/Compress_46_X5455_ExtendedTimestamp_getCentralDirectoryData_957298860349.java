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

public class X5455_ExtendedTimestamp_getCentralDirectoryData_957298860349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73117;
     Object term73540;
     Object term73534;

    public X5455_ExtendedTimestamp_getCentralDirectoryData_957298860349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73117 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term73221 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term73325 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term73429 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term73117, term73117.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term73117, term73117.getClass(), "bit1_accessTimePresent", true);
        setField(term73117, term73117.getClass(), "accessTime", term73221);
        setBooleanField(term73117, term73117.getClass(), "bit2_createTimePresent", true);
        setField(term73117, term73117.getClass(), "createTime", term73325);
        setField(term73117, term73117.getClass(), "modifyTime", term73429);
        term73540 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term73541 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term73542 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term73543 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term73540, term73540.getClass(), "flags", (byte) 0);
        setBooleanField(term73540, term73540.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term73540, term73540.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term73540, term73540.getClass(), "bit2_createTimePresent", true);
        setLongField(term73541, term73541.getClass(), "value", 0L);
        setField(term73540, term73540.getClass(), "modifyTime", term73541);
        setLongField(term73542, term73542.getClass(), "value", 0L);
        setField(term73540, term73540.getClass(), "accessTime", term73542);
        setLongField(term73543, term73543.getClass(), "value", 0L);
        setField(term73540, term73540.getClass(), "createTime", term73543);
        term73534 = (byte[]) newByteArray(5);
        setByteElement(term73534, 0, (byte) 7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryData", argTypes, term73117, args);
        assertTrue(recursiveEquals(term73117, term73540));
        assertTrue(recursiveEquals(retValue, term73534));
    }

};


