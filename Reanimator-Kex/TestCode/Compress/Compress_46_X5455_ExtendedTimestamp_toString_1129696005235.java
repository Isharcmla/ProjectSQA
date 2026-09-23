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

public class X5455_ExtendedTimestamp_toString_1129696005235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43754;
     Object term43957;

    public X5455_ExtendedTimestamp_toString_1129696005235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43754 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term43858 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term43754, term43754.getClass(), "flags", (byte) 0);
        setBooleanField(term43754, term43754.getClass(), "bit0_modifyTimePresent", true);
        setField(term43754, term43754.getClass(), "modifyTime", null);
        setBooleanField(term43754, term43754.getClass(), "bit1_accessTimePresent", true);
        setField(term43754, term43754.getClass(), "accessTime", term43858);
        term43957 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term43958 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term43957, term43957.getClass(), "flags", (byte) 0);
        setBooleanField(term43957, term43957.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term43957, term43957.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term43957, term43957.getClass(), "bit2_createTimePresent", false);
        setField(term43957, term43957.getClass(), "modifyTime", null);
        setLongField(term43958, term43958.getClass(), "value", 0L);
        setField(term43957, term43957.getClass(), "accessTime", term43958);
        setField(term43957, term43957.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term43754, args);
        assertTrue(recursiveEquals(term43754, term43957));
        assertTrue(recursiveEquals(retValue, "0x5455 Zip Extra Field: Flags=0  Access:[Wed Dec 31 16:00:00 PST 1969] "));
    }

};


