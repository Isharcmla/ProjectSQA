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

public class TarArchiveEntry_init_702366907153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50608;

    public TarArchiveEntry_init_702366907153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term50404 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term50404, term50404.getClass(), "name", "");
        setLongField(term50404, term50404.getClass(), "userId", 0L);
        setLongField(term50404, term50404.getClass(), "groupId", 0L);
        setLongField(term50404, term50404.getClass(), "size", 0L);
        setField(term50404, term50404.getClass(), "linkName", null);
        setField(term50404, term50404.getClass(), "magic", "en");
        setField(term50404, term50404.getClass(), "version", null);
        setField(term50404, term50404.getClass(), "groupName", null);
        setIntField(term50404, term50404.getClass(), "devMajor", 0);
        setIntField(term50404, term50404.getClass(), "devMinor", 0);
        setField(term50404, term50404.getClass(), "userName", "");
        setField(term50404, term50404.getClass(), "file", null);
        setBooleanField(term50404, term50404.getClass(), "preserveLeadingSlashes", false);
        term50608 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term50608, term50608.getClass(), "name", "");
        setBooleanField(term50608, term50608.getClass(), "preserveLeadingSlashes", true);
        setIntField(term50608, term50608.getClass(), "mode", 33188);
        setLongField(term50608, term50608.getClass(), "userId", 0L);
        setLongField(term50608, term50608.getClass(), "groupId", 0L);
        setLongField(term50608, term50608.getClass(), "size", 0L);
        setLongField(term50608, term50608.getClass(), "modTime", 1790003313L);
        setBooleanField(term50608, term50608.getClass(), "checkSumOK", false);
        setByteField(term50608, term50608.getClass(), "linkFlag", (byte) 0);
        setField(term50608, term50608.getClass(), "linkName", "");
        setField(term50608, term50608.getClass(), "magic", "ustar ");
        setField(term50608, term50608.getClass(), "version", "00");
        setField(term50608, term50608.getClass(), "userName", "");
        setField(term50608, term50608.getClass(), "groupName", "");
        setIntField(term50608, term50608.getClass(), "devMajor", 0);
        setIntField(term50608, term50608.getClass(), "devMinor", 0);
        setBooleanField(term50608, term50608.getClass(), "isExtended", false);
        setLongField(term50608, term50608.getClass(), "realSize", 0L);
        setBooleanField(term50608, term50608.getClass(), "paxGNUSparse", false);
        setBooleanField(term50608, term50608.getClass(), "starSparse", false);
        setField(term50608, term50608.getClass(), "file", null);
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
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term50608));
    }

};


