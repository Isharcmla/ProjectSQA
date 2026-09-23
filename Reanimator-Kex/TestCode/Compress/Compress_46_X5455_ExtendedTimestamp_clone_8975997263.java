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

public class X5455_ExtendedTimestamp_clone_8975997263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335;
     Object term3773;
     Object term3743;

    public X5455_ExtendedTimestamp_clone_8975997263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term335 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term340 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term342 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term344 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term335, term335.getClass(), "flags", (byte) 71);
        setBooleanField(term335, term335.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term335, term335.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term335, term335.getClass(), "bit2_createTimePresent", false);
        setLongField(term340, term340.getClass(), "value", 5946780097489996391L);
        setField(term335, term335.getClass(), "modifyTime", term340);
        setLongField(term342, term342.getClass(), "value", -8652538484981166496L);
        setField(term335, term335.getClass(), "accessTime", term342);
        setLongField(term344, term344.getClass(), "value", 2701184207686293431L);
        setField(term335, term335.getClass(), "createTime", term344);
        term3773 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term3774 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term3775 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term3776 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term3773, term3773.getClass(), "flags", (byte) 71);
        setBooleanField(term3773, term3773.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term3773, term3773.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term3773, term3773.getClass(), "bit2_createTimePresent", false);
        setLongField(term3774, term3774.getClass(), "value", 5946780097489996391L);
        setField(term3773, term3773.getClass(), "modifyTime", term3774);
        setLongField(term3775, term3775.getClass(), "value", -8652538484981166496L);
        setField(term3773, term3773.getClass(), "accessTime", term3775);
        setLongField(term3776, term3776.getClass(), "value", 2701184207686293431L);
        setField(term3773, term3773.getClass(), "createTime", term3776);
        term3743 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term3748 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term3750 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term3752 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term3743, term3743.getClass(), "flags", (byte) 71);
        setBooleanField(term3743, term3743.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term3743, term3743.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term3743, term3743.getClass(), "bit2_createTimePresent", false);
        setLongField(term3748, term3748.getClass(), "value", 5946780097489996391L);
        setField(term3743, term3743.getClass(), "modifyTime", term3748);
        setLongField(term3750, term3750.getClass(), "value", -8652538484981166496L);
        setField(term3743, term3743.getClass(), "accessTime", term3750);
        setLongField(term3752, term3752.getClass(), "value", 2701184207686293431L);
        setField(term3743, term3743.getClass(), "createTime", term3752);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term335, args);
        assertTrue(recursiveEquals(term335, term3773));
        assertTrue(recursiveEquals(retValue, term3743));
    }

};


