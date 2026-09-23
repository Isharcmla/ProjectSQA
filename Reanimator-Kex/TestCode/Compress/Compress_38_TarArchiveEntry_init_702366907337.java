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

public class TarArchiveEntry_init_702366907337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term351146;

    public TarArchiveEntry_init_702366907337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term350898 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term350898, term350898.getClass(), "name", "");
        setLongField(term350898, term350898.getClass(), "userId", 0L);
        setLongField(term350898, term350898.getClass(), "groupId", 0L);
        setLongField(term350898, term350898.getClass(), "size", 0L);
        setField(term350898, term350898.getClass(), "linkName", "netware");
        setField(term350898, term350898.getClass(), "magic", null);
        setField(term350898, term350898.getClass(), "version", "");
        setField(term350898, term350898.getClass(), "groupName", "");
        setIntField(term350898, term350898.getClass(), "devMajor", 0);
        setIntField(term350898, term350898.getClass(), "devMinor", 0);
        setField(term350898, term350898.getClass(), "userName", null);
        setField(term350898, term350898.getClass(), "file", null);
        setBooleanField(term350898, term350898.getClass(), "preserveLeadingSlashes", false);
        term351146 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term351146, term351146.getClass(), "name", "");
        setBooleanField(term351146, term351146.getClass(), "preserveLeadingSlashes", false);
        setIntField(term351146, term351146.getClass(), "mode", 33188);
        setLongField(term351146, term351146.getClass(), "userId", 0L);
        setLongField(term351146, term351146.getClass(), "groupId", 0L);
        setLongField(term351146, term351146.getClass(), "size", 0L);
        setLongField(term351146, term351146.getClass(), "modTime", 1790003339L);
        setBooleanField(term351146, term351146.getClass(), "checkSumOK", false);
        setByteField(term351146, term351146.getClass(), "linkFlag", (byte) 0);
        setField(term351146, term351146.getClass(), "linkName", "");
        setField(term351146, term351146.getClass(), "magic", "ustar ");
        setField(term351146, term351146.getClass(), "version", "00");
        setField(term351146, term351146.getClass(), "userName", "");
        setField(term351146, term351146.getClass(), "groupName", "");
        setIntField(term351146, term351146.getClass(), "devMajor", 0);
        setIntField(term351146, term351146.getClass(), "devMinor", 0);
        setBooleanField(term351146, term351146.getClass(), "isExtended", false);
        setLongField(term351146, term351146.getClass(), "realSize", 0L);
        setBooleanField(term351146, term351146.getClass(), "paxGNUSparse", false);
        setBooleanField(term351146, term351146.getClass(), "starSparse", false);
        setField(term351146, term351146.getClass(), "file", null);
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
        assertTrue(recursiveEquals(instance, term351146));
    }

};


