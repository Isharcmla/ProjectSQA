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

public class TarArchiveEntry_isDirectory_1193896813305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97115;
     Object term337438;

    public TarArchiveEntry_isDirectory_1193896813305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97115 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term97115, term97115.getClass(), "file", null);
        setByteField(term97115, term97115.getClass(), "linkFlag", (byte) 53);
        term337438 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term337438, term337438.getClass(), "name", null);
        setBooleanField(term337438, term337438.getClass(), "preserveLeadingSlashes", false);
        setIntField(term337438, term337438.getClass(), "mode", 0);
        setLongField(term337438, term337438.getClass(), "userId", 0L);
        setLongField(term337438, term337438.getClass(), "groupId", 0L);
        setLongField(term337438, term337438.getClass(), "size", 0L);
        setLongField(term337438, term337438.getClass(), "modTime", 0L);
        setBooleanField(term337438, term337438.getClass(), "checkSumOK", false);
        setByteField(term337438, term337438.getClass(), "linkFlag", (byte) 53);
        setField(term337438, term337438.getClass(), "linkName", null);
        setField(term337438, term337438.getClass(), "magic", null);
        setField(term337438, term337438.getClass(), "version", null);
        setField(term337438, term337438.getClass(), "userName", null);
        setField(term337438, term337438.getClass(), "groupName", null);
        setIntField(term337438, term337438.getClass(), "devMajor", 0);
        setIntField(term337438, term337438.getClass(), "devMinor", 0);
        setBooleanField(term337438, term337438.getClass(), "isExtended", false);
        setLongField(term337438, term337438.getClass(), "realSize", 0L);
        setBooleanField(term337438, term337438.getClass(), "paxGNUSparse", false);
        setBooleanField(term337438, term337438.getClass(), "starSparse", false);
        setField(term337438, term337438.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDirectory", argTypes, term97115, args);
        assertTrue(recursiveEquals(term97115, term337438));
    }

};


