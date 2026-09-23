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

public class X5455_ExtendedTimestamp_equals_2089142370135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16401;
     Object term16641;
     Object term16818;
     Object term16820;

    public X5455_ExtendedTimestamp_equals_2089142370135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16401 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term16693 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term16401, term16401.getClass(), "flags", (byte) 0);
        setField(term16401, term16401.getClass(), "modifyTime", term16693);
        setField(term16401, term16401.getClass(), "accessTime", null);
        term16641 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term16797 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term16641, term16641.getClass(), "flags", (byte) 0);
        setField(term16641, term16641.getClass(), "modifyTime", term16693);
        setField(term16641, term16641.getClass(), "accessTime", term16797);
        term16818 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term16819 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term16818, term16818.getClass(), "flags", (byte) 0);
        setBooleanField(term16818, term16818.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term16818, term16818.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term16818, term16818.getClass(), "bit2_createTimePresent", false);
        setLongField(term16819, term16819.getClass(), "value", 0L);
        setField(term16818, term16818.getClass(), "modifyTime", term16819);
        setField(term16818, term16818.getClass(), "accessTime", null);
        setField(term16818, term16818.getClass(), "createTime", null);
        term16820 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term16821 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term16822 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term16820, term16820.getClass(), "flags", (byte) 0);
        setBooleanField(term16820, term16820.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term16820, term16820.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term16820, term16820.getClass(), "bit2_createTimePresent", false);
        setLongField(term16821, term16821.getClass(), "value", 0L);
        setField(term16820, term16820.getClass(), "modifyTime", term16821);
        setLongField(term16822, term16822.getClass(), "value", 0L);
        setField(term16820, term16820.getClass(), "accessTime", term16822);
        setField(term16820, term16820.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term16641;
        Object retValue = callMethod(klass, "equals", argTypes, term16401, args);
        assertTrue(recursiveEquals(term16401, term16818));
        assertTrue(recursiveEquals(term16641, term16820));
        assertTrue(recursiveEquals(retValue, false));
    }

};


