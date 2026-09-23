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

public class X5455_ExtendedTimestamp_toString_1129696005148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19406;
     Object term20237;

    public X5455_ExtendedTimestamp_toString_1129696005148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19406 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term19406, term19406.getClass(), "flags", (byte) 0);
        setBooleanField(term19406, term19406.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term19406, term19406.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term19406, term19406.getClass(), "bit2_createTimePresent", true);
        term20237 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term20237, term20237.getClass(), "flags", (byte) 0);
        setBooleanField(term20237, term20237.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term20237, term20237.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term20237, term20237.getClass(), "bit2_createTimePresent", true);
        setField(term20237, term20237.getClass(), "modifyTime", null);
        setField(term20237, term20237.getClass(), "accessTime", null);
        setField(term20237, term20237.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term19406, args);
        assertTrue(recursiveEquals(term19406, term20237));
        assertTrue(recursiveEquals(retValue, "0x5455 Zip Extra Field: Flags=0 "));
    }

};


