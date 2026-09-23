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

public class X5455_ExtendedTimestamp_toString_1129696005187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31288;
     Object term32852;

    public X5455_ExtendedTimestamp_toString_1129696005187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31288 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term31288, term31288.getClass(), "flags", (byte) 0);
        setBooleanField(term31288, term31288.getClass(), "bit0_modifyTimePresent", true);
        setField(term31288, term31288.getClass(), "modifyTime", null);
        setBooleanField(term31288, term31288.getClass(), "bit1_accessTimePresent", true);
        term32852 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term32852, term32852.getClass(), "flags", (byte) 0);
        setBooleanField(term32852, term32852.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term32852, term32852.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term32852, term32852.getClass(), "bit2_createTimePresent", false);
        setField(term32852, term32852.getClass(), "modifyTime", null);
        setField(term32852, term32852.getClass(), "accessTime", null);
        setField(term32852, term32852.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term31288, args);
        assertTrue(recursiveEquals(term31288, term32852));
        assertTrue(recursiveEquals(retValue, "0x5455 Zip Extra Field: Flags=0 "));
    }

};


