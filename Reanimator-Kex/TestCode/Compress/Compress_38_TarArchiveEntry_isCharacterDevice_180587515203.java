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

public class TarArchiveEntry_isCharacterDevice_180587515203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63873;
     Object term63891;

    public TarArchiveEntry_isCharacterDevice_180587515203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63873 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setByteField(term63873, term63873.getClass(), "linkFlag", (byte) 51);
        term63891 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term63891, term63891.getClass(), "name", null);
        setBooleanField(term63891, term63891.getClass(), "preserveLeadingSlashes", false);
        setIntField(term63891, term63891.getClass(), "mode", 0);
        setLongField(term63891, term63891.getClass(), "userId", 0L);
        setLongField(term63891, term63891.getClass(), "groupId", 0L);
        setLongField(term63891, term63891.getClass(), "size", 0L);
        setLongField(term63891, term63891.getClass(), "modTime", 0L);
        setBooleanField(term63891, term63891.getClass(), "checkSumOK", false);
        setByteField(term63891, term63891.getClass(), "linkFlag", (byte) 51);
        setField(term63891, term63891.getClass(), "linkName", null);
        setField(term63891, term63891.getClass(), "magic", null);
        setField(term63891, term63891.getClass(), "version", null);
        setField(term63891, term63891.getClass(), "userName", null);
        setField(term63891, term63891.getClass(), "groupName", null);
        setIntField(term63891, term63891.getClass(), "devMajor", 0);
        setIntField(term63891, term63891.getClass(), "devMinor", 0);
        setBooleanField(term63891, term63891.getClass(), "isExtended", false);
        setLongField(term63891, term63891.getClass(), "realSize", 0L);
        setBooleanField(term63891, term63891.getClass(), "paxGNUSparse", false);
        setBooleanField(term63891, term63891.getClass(), "starSparse", false);
        setField(term63891, term63891.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isCharacterDevice", argTypes, term63873, args);
        assertTrue(recursiveEquals(term63873, term63891));
        assertTrue(recursiveEquals(retValue, true));
    }

};


