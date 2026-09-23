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

public class X5455_ExtendedTimestamp_toString_1129696005223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39783;
     Object term40107;

    public X5455_ExtendedTimestamp_toString_1129696005223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39783 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term39783, term39783.getClass(), "flags", (byte) 0);
        setBooleanField(term39783, term39783.getClass(), "bit0_modifyTimePresent", true);
        setField(term39783, term39783.getClass(), "modifyTime", null);
        setBooleanField(term39783, term39783.getClass(), "bit1_accessTimePresent", true);
        setField(term39783, term39783.getClass(), "accessTime", null);
        setBooleanField(term39783, term39783.getClass(), "bit2_createTimePresent", true);
        term40107 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term40107, term40107.getClass(), "flags", (byte) 0);
        setBooleanField(term40107, term40107.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term40107, term40107.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term40107, term40107.getClass(), "bit2_createTimePresent", true);
        setField(term40107, term40107.getClass(), "modifyTime", null);
        setField(term40107, term40107.getClass(), "accessTime", null);
        setField(term40107, term40107.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term39783, args);
        assertTrue(recursiveEquals(term39783, term40107));
        assertTrue(recursiveEquals(retValue, "0x5455 Zip Extra Field: Flags=0 "));
    }

};


