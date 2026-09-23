package org.apache.commons.compress.archivers.tar;

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
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.tar.EqualityUtils.*;
import java.lang.Object;

public class TarArchiveEntry_init_563814011155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51282;

    public TarArchiveEntry_init_563814011155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term50965 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term50965, term50965.getClass(), "name", "");
        setLongField(term50965, term50965.getClass(), "userId", 0L);
        setLongField(term50965, term50965.getClass(), "groupId", 0L);
        setLongField(term50965, term50965.getClass(), "size", 0L);
        setField(term50965, term50965.getClass(), "linkName", "");
        setField(term50965, term50965.getClass(), "magic", "");
        setField(term50965, term50965.getClass(), "version", "");
        setField(term50965, term50965.getClass(), "groupName", "en");
        setIntField(term50965, term50965.getClass(), "devMajor", 0);
        setIntField(term50965, term50965.getClass(), "devMinor", 0);
        setField(term50965, term50965.getClass(), "userName", "");
        setField(term50965, term50965.getClass(), "file", null);
        setBooleanField(term50965, term50965.getClass(), "preserveLeadingSlashes", false);
        term51282 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term51282, term51282.getClass(), "name", "");
        setBooleanField(term51282, term51282.getClass(), "preserveLeadingSlashes", false);
        setIntField(term51282, term51282.getClass(), "mode", 33188);
        setLongField(term51282, term51282.getClass(), "userId", 0L);
        setLongField(term51282, term51282.getClass(), "groupId", 0L);
        setLongField(term51282, term51282.getClass(), "size", 0L);
        setLongField(term51282, term51282.getClass(), "modTime", 1790003313L);
        setBooleanField(term51282, term51282.getClass(), "checkSumOK", false);
        setByteField(term51282, term51282.getClass(), "linkFlag", (byte) 48);
        setField(term51282, term51282.getClass(), "linkName", "");
        setField(term51282, term51282.getClass(), "magic", "ustar ");
        setField(term51282, term51282.getClass(), "version", "00");
        setField(term51282, term51282.getClass(), "userName", "");
        setField(term51282, term51282.getClass(), "groupName", "");
        setIntField(term51282, term51282.getClass(), "devMajor", 0);
        setIntField(term51282, term51282.getClass(), "devMinor", 0);
        setBooleanField(term51282, term51282.getClass(), "isExtended", false);
        setLongField(term51282, term51282.getClass(), "realSize", 0L);
        setBooleanField(term51282, term51282.getClass(), "paxGNUSparse", false);
        setBooleanField(term51282, term51282.getClass(), "starSparse", false);
        setField(term51282, term51282.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term51282));
    }

};


