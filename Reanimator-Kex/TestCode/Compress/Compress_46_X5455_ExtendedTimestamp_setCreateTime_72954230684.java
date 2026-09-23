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

public class X5455_ExtendedTimestamp_setCreateTime_72954230684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5583;
     Object term5734;

    public X5455_ExtendedTimestamp_setCreateTime_72954230684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5583 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        term5734 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term5734, term5734.getClass(), "flags", (byte) 0);
        setBooleanField(term5734, term5734.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term5734, term5734.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term5734, term5734.getClass(), "bit2_createTimePresent", false);
        setField(term5734, term5734.getClass(), "modifyTime", null);
        setField(term5734, term5734.getClass(), "accessTime", null);
        setField(term5734, term5734.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipLong");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCreateTime", argTypes, term5583, args);
        assertTrue(recursiveEquals(term5583, term5734));
    }

};


