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

public class TarArchiveEntry_init_563814259157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51893;

    public TarArchiveEntry_init_563814259157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term51645 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term51645, term51645.getClass(), "name", "");
        setLongField(term51645, term51645.getClass(), "userId", 0L);
        setLongField(term51645, term51645.getClass(), "groupId", 0L);
        setLongField(term51645, term51645.getClass(), "size", 0L);
        setField(term51645, term51645.getClass(), "linkName", "netware");
        setField(term51645, term51645.getClass(), "magic", null);
        setField(term51645, term51645.getClass(), "version", "");
        setField(term51645, term51645.getClass(), "groupName", "");
        setIntField(term51645, term51645.getClass(), "devMajor", 0);
        setIntField(term51645, term51645.getClass(), "devMinor", 0);
        setField(term51645, term51645.getClass(), "userName", null);
        setField(term51645, term51645.getClass(), "file", null);
        setBooleanField(term51645, term51645.getClass(), "preserveLeadingSlashes", false);
        term51893 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term51893, term51893.getClass(), "name", "");
        setBooleanField(term51893, term51893.getClass(), "preserveLeadingSlashes", false);
        setIntField(term51893, term51893.getClass(), "mode", 33188);
        setLongField(term51893, term51893.getClass(), "userId", 0L);
        setLongField(term51893, term51893.getClass(), "groupId", 0L);
        setLongField(term51893, term51893.getClass(), "size", 0L);
        setLongField(term51893, term51893.getClass(), "modTime", 1790003314L);
        setBooleanField(term51893, term51893.getClass(), "checkSumOK", false);
        setByteField(term51893, term51893.getClass(), "linkFlag", (byte) 0);
        setField(term51893, term51893.getClass(), "linkName", "");
        setField(term51893, term51893.getClass(), "magic", "ustar ");
        setField(term51893, term51893.getClass(), "version", "00");
        setField(term51893, term51893.getClass(), "userName", "");
        setField(term51893, term51893.getClass(), "groupName", "");
        setIntField(term51893, term51893.getClass(), "devMajor", 0);
        setIntField(term51893, term51893.getClass(), "devMinor", 0);
        setBooleanField(term51893, term51893.getClass(), "isExtended", false);
        setLongField(term51893, term51893.getClass(), "realSize", 0L);
        setBooleanField(term51893, term51893.getClass(), "paxGNUSparse", false);
        setBooleanField(term51893, term51893.getClass(), "starSparse", false);
        setField(term51893, term51893.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = byte.class;
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = (byte) 0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term51893));
    }

};


