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

public class TarArchiveEntry_equals_1801372482312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term340317;
     Object term341004;

    public TarArchiveEntry_equals_1801372482312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term340317 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        term341004 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term341004, term341004.getClass(), "name", null);
        setBooleanField(term341004, term341004.getClass(), "preserveLeadingSlashes", false);
        setIntField(term341004, term341004.getClass(), "mode", 0);
        setLongField(term341004, term341004.getClass(), "userId", 0L);
        setLongField(term341004, term341004.getClass(), "groupId", 0L);
        setLongField(term341004, term341004.getClass(), "size", 0L);
        setLongField(term341004, term341004.getClass(), "modTime", 0L);
        setBooleanField(term341004, term341004.getClass(), "checkSumOK", false);
        setByteField(term341004, term341004.getClass(), "linkFlag", (byte) 0);
        setField(term341004, term341004.getClass(), "linkName", null);
        setField(term341004, term341004.getClass(), "magic", null);
        setField(term341004, term341004.getClass(), "version", null);
        setField(term341004, term341004.getClass(), "userName", null);
        setField(term341004, term341004.getClass(), "groupName", null);
        setIntField(term341004, term341004.getClass(), "devMajor", 0);
        setIntField(term341004, term341004.getClass(), "devMinor", 0);
        setBooleanField(term341004, term341004.getClass(), "isExtended", false);
        setLongField(term341004, term341004.getClass(), "realSize", 0L);
        setBooleanField(term341004, term341004.getClass(), "paxGNUSparse", false);
        setBooleanField(term341004, term341004.getClass(), "starSparse", false);
        setField(term341004, term341004.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "equals", argTypes, term340317, args);
        assertTrue(recursiveEquals(term340317, term341004));
        assertTrue(recursiveEquals(retValue, false));
    }

};


