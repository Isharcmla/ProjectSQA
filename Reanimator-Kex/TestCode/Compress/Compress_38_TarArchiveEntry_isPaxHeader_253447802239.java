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

public class TarArchiveEntry_isPaxHeader_253447802239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74149;
     Object term74167;

    public TarArchiveEntry_isPaxHeader_253447802239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74149 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setByteField(term74149, term74149.getClass(), "linkFlag", (byte) 120);
        term74167 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term74167, term74167.getClass(), "name", null);
        setBooleanField(term74167, term74167.getClass(), "preserveLeadingSlashes", false);
        setIntField(term74167, term74167.getClass(), "mode", 0);
        setLongField(term74167, term74167.getClass(), "userId", 0L);
        setLongField(term74167, term74167.getClass(), "groupId", 0L);
        setLongField(term74167, term74167.getClass(), "size", 0L);
        setLongField(term74167, term74167.getClass(), "modTime", 0L);
        setBooleanField(term74167, term74167.getClass(), "checkSumOK", false);
        setByteField(term74167, term74167.getClass(), "linkFlag", (byte) 120);
        setField(term74167, term74167.getClass(), "linkName", null);
        setField(term74167, term74167.getClass(), "magic", null);
        setField(term74167, term74167.getClass(), "version", null);
        setField(term74167, term74167.getClass(), "userName", null);
        setField(term74167, term74167.getClass(), "groupName", null);
        setIntField(term74167, term74167.getClass(), "devMajor", 0);
        setIntField(term74167, term74167.getClass(), "devMinor", 0);
        setBooleanField(term74167, term74167.getClass(), "isExtended", false);
        setLongField(term74167, term74167.getClass(), "realSize", 0L);
        setBooleanField(term74167, term74167.getClass(), "paxGNUSparse", false);
        setBooleanField(term74167, term74167.getClass(), "starSparse", false);
        setField(term74167, term74167.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isPaxHeader", argTypes, term74149, args);
        assertTrue(recursiveEquals(term74149, term74167));
        assertTrue(recursiveEquals(retValue, true));
    }

};


