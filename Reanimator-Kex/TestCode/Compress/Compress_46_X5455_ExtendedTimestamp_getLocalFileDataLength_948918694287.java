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

public class X5455_ExtendedTimestamp_getLocalFileDataLength_948918694287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57510;
     Object term57629;
     Object term57619;

    public X5455_ExtendedTimestamp_getLocalFileDataLength_948918694287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57510 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term57614 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term57510, term57510.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term57510, term57510.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term57510, term57510.getClass(), "bit2_createTimePresent", true);
        setField(term57510, term57510.getClass(), "createTime", term57614);
        term57629 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term57630 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term57629, term57629.getClass(), "flags", (byte) 0);
        setBooleanField(term57629, term57629.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term57629, term57629.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term57629, term57629.getClass(), "bit2_createTimePresent", true);
        setField(term57629, term57629.getClass(), "modifyTime", null);
        setField(term57629, term57629.getClass(), "accessTime", null);
        setLongField(term57630, term57630.getClass(), "value", 0L);
        setField(term57629, term57629.getClass(), "createTime", term57630);
        term57619 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term57619, term57619.getClass(), "value", 5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataLength", argTypes, term57510, args);
        assertTrue(recursiveEquals(term57510, term57629));
        assertTrue(recursiveEquals(retValue, term57619));
    }

};


