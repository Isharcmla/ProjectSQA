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

public class TarArchiveEntry_init_702366907205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64427;

    public TarArchiveEntry_init_702366907205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term64243 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term64311 = newInstance(Class.forName("java.io.File"));
        setField(term64243, term64243.getClass(), "name", null);
        setLongField(term64243, term64243.getClass(), "userId", 0L);
        setLongField(term64243, term64243.getClass(), "groupId", 0L);
        setLongField(term64243, term64243.getClass(), "size", 0L);
        setField(term64243, term64243.getClass(), "linkName", null);
        setField(term64243, term64243.getClass(), "magic", null);
        setField(term64243, term64243.getClass(), "version", null);
        setField(term64243, term64243.getClass(), "groupName", null);
        setIntField(term64243, term64243.getClass(), "devMajor", 0);
        setIntField(term64243, term64243.getClass(), "devMinor", 0);
        setField(term64243, term64243.getClass(), "userName", "");
        setField(term64243, term64243.getClass(), "file", term64311);
        setBooleanField(term64243, term64243.getClass(), "preserveLeadingSlashes", false);
        term64427 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term64427, term64427.getClass(), "name", "");
        setBooleanField(term64427, term64427.getClass(), "preserveLeadingSlashes", false);
        setIntField(term64427, term64427.getClass(), "mode", 33188);
        setLongField(term64427, term64427.getClass(), "userId", 0L);
        setLongField(term64427, term64427.getClass(), "groupId", 0L);
        setLongField(term64427, term64427.getClass(), "size", 0L);
        setLongField(term64427, term64427.getClass(), "modTime", 1790003320L);
        setBooleanField(term64427, term64427.getClass(), "checkSumOK", false);
        setByteField(term64427, term64427.getClass(), "linkFlag", (byte) 0);
        setField(term64427, term64427.getClass(), "linkName", "");
        setField(term64427, term64427.getClass(), "magic", "ustar ");
        setField(term64427, term64427.getClass(), "version", "00");
        setField(term64427, term64427.getClass(), "userName", "");
        setField(term64427, term64427.getClass(), "groupName", "");
        setIntField(term64427, term64427.getClass(), "devMajor", 0);
        setIntField(term64427, term64427.getClass(), "devMinor", 0);
        setBooleanField(term64427, term64427.getClass(), "isExtended", false);
        setLongField(term64427, term64427.getClass(), "realSize", 0L);
        setBooleanField(term64427, term64427.getClass(), "paxGNUSparse", false);
        setBooleanField(term64427, term64427.getClass(), "starSparse", false);
        setField(term64427, term64427.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = byte.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = "";
        args[1] = (byte) 0;
        args[2] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term64427));
    }

};


