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

public class X5455_ExtendedTimestamp_setAccessTime_120632653855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255;
     Object term266;
     Object term1447;
     Object term1451;

    public X5455_ExtendedTimestamp_setAccessTime_120632653855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term260 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term262 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term264 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term255, term255.getClass(), "flags", (byte) 106);
        setBooleanField(term255, term255.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term255, term255.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term255, term255.getClass(), "bit2_createTimePresent", true);
        setLongField(term260, term260.getClass(), "value", 2443640364875054177L);
        setField(term255, term255.getClass(), "modifyTime", term260);
        setLongField(term262, term262.getClass(), "value", -1610676979013636850L);
        setField(term255, term255.getClass(), "accessTime", term262);
        setLongField(term264, term264.getClass(), "value", 2062173786000223358L);
        setField(term255, term255.getClass(), "createTime", term264);
        term266 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setLongField(term266, term266.getClass(), "value", -8658027316505137504L);
        term1447 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term1448 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term1449 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term1450 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term1447, term1447.getClass(), "flags", (byte) 106);
        setBooleanField(term1447, term1447.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term1447, term1447.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term1447, term1447.getClass(), "bit2_createTimePresent", true);
        setLongField(term1448, term1448.getClass(), "value", 2443640364875054177L);
        setField(term1447, term1447.getClass(), "modifyTime", term1448);
        setLongField(term1449, term1449.getClass(), "value", -8658027316505137504L);
        setField(term1447, term1447.getClass(), "accessTime", term1449);
        setLongField(term1450, term1450.getClass(), "value", 2062173786000223358L);
        setField(term1447, term1447.getClass(), "createTime", term1450);
        term1451 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setLongField(term1451, term1451.getClass(), "value", -8658027316505137504L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipLong");
        Object[] args = new Object[1];
        args[0] = term266;
        callMethod(klass, "setAccessTime", argTypes, term255, args);
        assertTrue(recursiveEquals(term255, term1447));
        assertTrue(recursiveEquals(term266, term1451));
    }

};


