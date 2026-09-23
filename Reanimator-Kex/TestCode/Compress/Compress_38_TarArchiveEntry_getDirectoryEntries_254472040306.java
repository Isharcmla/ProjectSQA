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

public class TarArchiveEntry_getDirectoryEntries_254472040306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97267;
     Object term337456;
     Object term337440;

    public TarArchiveEntry_getDirectoryEntries_254472040306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97267 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term97267, term97267.getClass(), "file", null);
        term337456 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term337456, term337456.getClass(), "name", null);
        setBooleanField(term337456, term337456.getClass(), "preserveLeadingSlashes", false);
        setIntField(term337456, term337456.getClass(), "mode", 0);
        setLongField(term337456, term337456.getClass(), "userId", 0L);
        setLongField(term337456, term337456.getClass(), "groupId", 0L);
        setLongField(term337456, term337456.getClass(), "size", 0L);
        setLongField(term337456, term337456.getClass(), "modTime", 0L);
        setBooleanField(term337456, term337456.getClass(), "checkSumOK", false);
        setByteField(term337456, term337456.getClass(), "linkFlag", (byte) 0);
        setField(term337456, term337456.getClass(), "linkName", null);
        setField(term337456, term337456.getClass(), "magic", null);
        setField(term337456, term337456.getClass(), "version", null);
        setField(term337456, term337456.getClass(), "userName", null);
        setField(term337456, term337456.getClass(), "groupName", null);
        setIntField(term337456, term337456.getClass(), "devMajor", 0);
        setIntField(term337456, term337456.getClass(), "devMinor", 0);
        setBooleanField(term337456, term337456.getClass(), "isExtended", false);
        setLongField(term337456, term337456.getClass(), "realSize", 0L);
        setBooleanField(term337456, term337456.getClass(), "paxGNUSparse", false);
        setBooleanField(term337456, term337456.getClass(), "starSparse", false);
        setField(term337456, term337456.getClass(), "file", null);
        term337440 = (Object[]) newArray("org.apache.commons.compress.archivers.tar.TarArchiveEntry", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDirectoryEntries", argTypes, term97267, args);
        assertTrue(recursiveEquals(term97267, term337456));
        assertTrue(recursiveEquals(retValue, term337440));
    }

};


