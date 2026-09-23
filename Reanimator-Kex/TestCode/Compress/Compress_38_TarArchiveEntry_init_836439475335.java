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

public class TarArchiveEntry_init_836439475335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350516;

    public TarArchiveEntry_init_836439475335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term350277 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term350277, term350277.getClass(), "name", "");
        setLongField(term350277, term350277.getClass(), "userId", 0L);
        setLongField(term350277, term350277.getClass(), "groupId", 0L);
        setLongField(term350277, term350277.getClass(), "size", 0L);
        setField(term350277, term350277.getClass(), "linkName", "");
        setField(term350277, term350277.getClass(), "magic", "");
        setField(term350277, term350277.getClass(), "version", "");
        setField(term350277, term350277.getClass(), "groupName", null);
        setIntField(term350277, term350277.getClass(), "devMajor", 0);
        setIntField(term350277, term350277.getClass(), "devMinor", 0);
        setField(term350277, term350277.getClass(), "userName", null);
        setField(term350277, term350277.getClass(), "file", null);
        setBooleanField(term350277, term350277.getClass(), "preserveLeadingSlashes", false);
        term350516 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term350516, term350516.getClass(), "name", "");
        setBooleanField(term350516, term350516.getClass(), "preserveLeadingSlashes", false);
        setIntField(term350516, term350516.getClass(), "mode", 33188);
        setLongField(term350516, term350516.getClass(), "userId", 0L);
        setLongField(term350516, term350516.getClass(), "groupId", 0L);
        setLongField(term350516, term350516.getClass(), "size", 0L);
        setLongField(term350516, term350516.getClass(), "modTime", 1790003338L);
        setBooleanField(term350516, term350516.getClass(), "checkSumOK", false);
        setByteField(term350516, term350516.getClass(), "linkFlag", (byte) 48);
        setField(term350516, term350516.getClass(), "linkName", "");
        setField(term350516, term350516.getClass(), "magic", "ustar ");
        setField(term350516, term350516.getClass(), "version", "00");
        setField(term350516, term350516.getClass(), "userName", "");
        setField(term350516, term350516.getClass(), "groupName", "");
        setIntField(term350516, term350516.getClass(), "devMajor", 0);
        setIntField(term350516, term350516.getClass(), "devMinor", 0);
        setBooleanField(term350516, term350516.getClass(), "isExtended", false);
        setLongField(term350516, term350516.getClass(), "realSize", 0L);
        setBooleanField(term350516, term350516.getClass(), "paxGNUSparse", false);
        setBooleanField(term350516, term350516.getClass(), "starSparse", false);
        setField(term350516, term350516.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term350516));
    }

};


