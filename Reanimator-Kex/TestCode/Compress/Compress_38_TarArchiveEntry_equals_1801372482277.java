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

public class TarArchiveEntry_equals_1801372482277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85007;
     Object term85105;
     Object term85125;
     Object term85126;

    public TarArchiveEntry_equals_1801372482277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85007 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        term85105 = newInstance(Class.forName("java.util.Collections$SynchronizedNavigableMap"));
        term85125 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term85125, term85125.getClass(), "name", null);
        setBooleanField(term85125, term85125.getClass(), "preserveLeadingSlashes", false);
        setIntField(term85125, term85125.getClass(), "mode", 0);
        setLongField(term85125, term85125.getClass(), "userId", 0L);
        setLongField(term85125, term85125.getClass(), "groupId", 0L);
        setLongField(term85125, term85125.getClass(), "size", 0L);
        setLongField(term85125, term85125.getClass(), "modTime", 0L);
        setBooleanField(term85125, term85125.getClass(), "checkSumOK", false);
        setByteField(term85125, term85125.getClass(), "linkFlag", (byte) 0);
        setField(term85125, term85125.getClass(), "linkName", null);
        setField(term85125, term85125.getClass(), "magic", null);
        setField(term85125, term85125.getClass(), "version", null);
        setField(term85125, term85125.getClass(), "userName", null);
        setField(term85125, term85125.getClass(), "groupName", null);
        setIntField(term85125, term85125.getClass(), "devMajor", 0);
        setIntField(term85125, term85125.getClass(), "devMinor", 0);
        setBooleanField(term85125, term85125.getClass(), "isExtended", false);
        setLongField(term85125, term85125.getClass(), "realSize", 0L);
        setBooleanField(term85125, term85125.getClass(), "paxGNUSparse", false);
        setBooleanField(term85125, term85125.getClass(), "starSparse", false);
        setField(term85125, term85125.getClass(), "file", null);
        term85126 = newInstance(Class.forName("java.util.Collections$SynchronizedNavigableMap"));
        setField(term85126, term85126.getClass(), "nm", null);
        setField(term85126, term85126.getClass(), "sm", null);
        setField(term85126, term85126.getClass(), "m", null);
        setField(term85126, term85126.getClass(), "mutex", null);
        setField(term85126, term85126.getClass(), "keySet", null);
        setField(term85126, term85126.getClass(), "entrySet", null);
        setField(term85126, term85126.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term85105;
        Object retValue = callMethod(klass, "equals", argTypes, term85007, args);
        assertTrue(recursiveEquals(term85007, term85125));
        assertTrue(recursiveEquals(term85105, term85126));
        assertTrue(recursiveEquals(retValue, false));
    }

};


