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

public class X5455_ExtendedTimestamp_getAccessTime_189228743848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185;
     Object term1321;
     Object term1310;

    public X5455_ExtendedTimestamp_getAccessTime_189228743848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term190 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term192 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term194 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term185, term185.getClass(), "flags", (byte) -112);
        setBooleanField(term185, term185.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term185, term185.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term185, term185.getClass(), "bit2_createTimePresent", false);
        setLongField(term190, term190.getClass(), "value", -6292278961887936280L);
        setField(term185, term185.getClass(), "modifyTime", term190);
        setLongField(term192, term192.getClass(), "value", -6645965768855543712L);
        setField(term185, term185.getClass(), "accessTime", term192);
        setLongField(term194, term194.getClass(), "value", 4784595517102746672L);
        setField(term185, term185.getClass(), "createTime", term194);
        term1321 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term1324 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term1325 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term1326 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term1321, term1321.getClass(), "flags", (byte) -112);
        setBooleanField(term1321, term1321.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term1321, term1321.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term1321, term1321.getClass(), "bit2_createTimePresent", false);
        setLongField(term1324, term1324.getClass(), "value", -6292278961887936280L);
        setField(term1321, term1321.getClass(), "modifyTime", term1324);
        setLongField(term1325, term1325.getClass(), "value", -6645965768855543712L);
        setField(term1321, term1321.getClass(), "accessTime", term1325);
        setLongField(term1326, term1326.getClass(), "value", 4784595517102746672L);
        setField(term1321, term1321.getClass(), "createTime", term1326);
        term1310 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setLongField(term1310, term1310.getClass(), "value", -6645965768855543712L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAccessTime", argTypes, term185, args);
        assertTrue(recursiveEquals(term185, term1321));
        assertTrue(recursiveEquals(retValue, term1310));
    }

};


