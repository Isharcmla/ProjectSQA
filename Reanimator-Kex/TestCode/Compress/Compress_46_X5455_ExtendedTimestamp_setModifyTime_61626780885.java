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

public class X5455_ExtendedTimestamp_setModifyTime_61626780885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5726;
     Object term5742;

    public X5455_ExtendedTimestamp_setModifyTime_61626780885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5726 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        term5742 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term5742, term5742.getClass(), "flags", (byte) 0);
        setBooleanField(term5742, term5742.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term5742, term5742.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term5742, term5742.getClass(), "bit2_createTimePresent", false);
        setField(term5742, term5742.getClass(), "modifyTime", null);
        setField(term5742, term5742.getClass(), "accessTime", null);
        setField(term5742, term5742.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipLong");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setModifyTime", argTypes, term5726, args);
        assertTrue(recursiveEquals(term5726, term5742));
    }

};


