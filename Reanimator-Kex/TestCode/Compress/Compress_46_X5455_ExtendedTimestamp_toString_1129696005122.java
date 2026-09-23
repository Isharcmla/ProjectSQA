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

public class X5455_ExtendedTimestamp_toString_1129696005122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12572;
     Object term12681;

    public X5455_ExtendedTimestamp_toString_1129696005122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12572 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term12572, term12572.getClass(), "flags", (byte) 0);
        term12681 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term12681, term12681.getClass(), "flags", (byte) 0);
        setBooleanField(term12681, term12681.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term12681, term12681.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term12681, term12681.getClass(), "bit2_createTimePresent", false);
        setField(term12681, term12681.getClass(), "modifyTime", null);
        setField(term12681, term12681.getClass(), "accessTime", null);
        setField(term12681, term12681.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term12572, args);
        assertTrue(recursiveEquals(term12572, term12681));
        assertTrue(recursiveEquals(retValue, "0x5455 Zip Extra Field: Flags=0 "));
    }

};


