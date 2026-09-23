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

public class X5455_ExtendedTimestamp_getModifyJavaTime_100992134397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6659;
     Object term6666;

    public X5455_ExtendedTimestamp_getModifyJavaTime_100992134397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6659 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setField(term6659, term6659.getClass(), "modifyTime", null);
        term6666 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term6666, term6666.getClass(), "flags", (byte) 0);
        setBooleanField(term6666, term6666.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term6666, term6666.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term6666, term6666.getClass(), "bit2_createTimePresent", false);
        setField(term6666, term6666.getClass(), "modifyTime", null);
        setField(term6666, term6666.getClass(), "accessTime", null);
        setField(term6666, term6666.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getModifyJavaTime", argTypes, term6659, args);
        assertTrue(recursiveEquals(term6659, term6666));
        assertTrue(recursiveEquals(retValue, null));
    }

};


