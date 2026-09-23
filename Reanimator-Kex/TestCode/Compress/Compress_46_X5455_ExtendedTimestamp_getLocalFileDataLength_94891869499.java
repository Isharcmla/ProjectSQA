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

public class X5455_ExtendedTimestamp_getLocalFileDataLength_94891869499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6820;
     Object term6832;
     Object term6824;

    public X5455_ExtendedTimestamp_getLocalFileDataLength_94891869499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6820 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setBooleanField(term6820, term6820.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term6820, term6820.getClass(), "bit1_accessTimePresent", false);
        term6832 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term6832, term6832.getClass(), "flags", (byte) 0);
        setBooleanField(term6832, term6832.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term6832, term6832.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term6832, term6832.getClass(), "bit2_createTimePresent", false);
        setField(term6832, term6832.getClass(), "modifyTime", null);
        setField(term6832, term6832.getClass(), "accessTime", null);
        setField(term6832, term6832.getClass(), "createTime", null);
        term6824 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term6824, term6824.getClass(), "value", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataLength", argTypes, term6820, args);
        assertTrue(recursiveEquals(term6820, term6832));
        assertTrue(recursiveEquals(retValue, term6824));
    }

};


