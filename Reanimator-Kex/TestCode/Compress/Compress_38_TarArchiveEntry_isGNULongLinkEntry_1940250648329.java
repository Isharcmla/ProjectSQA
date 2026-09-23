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

public class TarArchiveEntry_isGNULongLinkEntry_1940250648329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349110;
     Object term349128;

    public TarArchiveEntry_isGNULongLinkEntry_1940250648329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term349110 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setByteField(term349110, term349110.getClass(), "linkFlag", (byte) 75);
        term349128 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term349128, term349128.getClass(), "name", null);
        setBooleanField(term349128, term349128.getClass(), "preserveLeadingSlashes", false);
        setIntField(term349128, term349128.getClass(), "mode", 0);
        setLongField(term349128, term349128.getClass(), "userId", 0L);
        setLongField(term349128, term349128.getClass(), "groupId", 0L);
        setLongField(term349128, term349128.getClass(), "size", 0L);
        setLongField(term349128, term349128.getClass(), "modTime", 0L);
        setBooleanField(term349128, term349128.getClass(), "checkSumOK", false);
        setByteField(term349128, term349128.getClass(), "linkFlag", (byte) 75);
        setField(term349128, term349128.getClass(), "linkName", null);
        setField(term349128, term349128.getClass(), "magic", null);
        setField(term349128, term349128.getClass(), "version", null);
        setField(term349128, term349128.getClass(), "userName", null);
        setField(term349128, term349128.getClass(), "groupName", null);
        setIntField(term349128, term349128.getClass(), "devMajor", 0);
        setIntField(term349128, term349128.getClass(), "devMinor", 0);
        setBooleanField(term349128, term349128.getClass(), "isExtended", false);
        setLongField(term349128, term349128.getClass(), "realSize", 0L);
        setBooleanField(term349128, term349128.getClass(), "paxGNUSparse", false);
        setBooleanField(term349128, term349128.getClass(), "starSparse", false);
        setField(term349128, term349128.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isGNULongLinkEntry", argTypes, term349110, args);
        assertTrue(recursiveEquals(term349110, term349128));
        assertTrue(recursiveEquals(retValue, true));
    }

};


