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

public class X5455_ExtendedTimestamp_hashCode_1640455695243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45742;
     Object term45861;

    public X5455_ExtendedTimestamp_hashCode_1640455695243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45742 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term45846 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term45742, term45742.getClass(), "flags", (byte) 0);
        setField(term45742, term45742.getClass(), "modifyTime", null);
        setField(term45742, term45742.getClass(), "accessTime", null);
        setField(term45742, term45742.getClass(), "createTime", term45846);
        term45861 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term45862 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term45861, term45861.getClass(), "flags", (byte) 0);
        setBooleanField(term45861, term45861.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term45861, term45861.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term45861, term45861.getClass(), "bit2_createTimePresent", false);
        setField(term45861, term45861.getClass(), "modifyTime", null);
        setField(term45861, term45861.getClass(), "accessTime", null);
        setLongField(term45862, term45862.getClass(), "value", 0L);
        setField(term45861, term45861.getClass(), "createTime", term45862);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term45742, args);
        assertTrue(recursiveEquals(term45742, term45861));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


