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
import java.lang.Byte;

public class TarArchiveEntry_init_56381425978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59;
     Object term16508;

    public TarArchiveEntry_init_56381425978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59 = new Byte((byte) 47);
        term16508 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term16508, term16508.getClass(), "name", "MuLcgQHgqz");
        setBooleanField(term16508, term16508.getClass(), "preserveLeadingSlashes", false);
        setIntField(term16508, term16508.getClass(), "mode", 33188);
        setLongField(term16508, term16508.getClass(), "userId", 0L);
        setLongField(term16508, term16508.getClass(), "groupId", 0L);
        setLongField(term16508, term16508.getClass(), "size", 0L);
        setLongField(term16508, term16508.getClass(), "modTime", 1790003307L);
        setBooleanField(term16508, term16508.getClass(), "checkSumOK", false);
        setByteField(term16508, term16508.getClass(), "linkFlag", (byte) 47);
        setField(term16508, term16508.getClass(), "linkName", "");
        setField(term16508, term16508.getClass(), "magic", "ustar ");
        setField(term16508, term16508.getClass(), "version", "00");
        setField(term16508, term16508.getClass(), "userName", "");
        setField(term16508, term16508.getClass(), "groupName", "");
        setIntField(term16508, term16508.getClass(), "devMajor", 0);
        setIntField(term16508, term16508.getClass(), "devMinor", 0);
        setBooleanField(term16508, term16508.getClass(), "isExtended", false);
        setLongField(term16508, term16508.getClass(), "realSize", 0L);
        setBooleanField(term16508, term16508.getClass(), "paxGNUSparse", false);
        setBooleanField(term16508, term16508.getClass(), "starSparse", false);
        setField(term16508, term16508.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = byte.class;
        Object[] args = new Object[2];
        args[0] = "MuLcgQHgqz";
        args[1] = term59;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term16508));
        assertTrue(recursiveEquals(term59, (byte) 47));
    }

};


