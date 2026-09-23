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

public class TarArchiveEntry_equals_1801372482265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81835;
     Object term81933;
     Object term81954;
     Object term81955;

    public TarArchiveEntry_equals_1801372482265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81835 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        term81933 = newInstance(Class.forName("java.util.concurrent.CompletableFuture$BiRelay"));
        term81954 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term81954, term81954.getClass(), "name", null);
        setBooleanField(term81954, term81954.getClass(), "preserveLeadingSlashes", false);
        setIntField(term81954, term81954.getClass(), "mode", 0);
        setLongField(term81954, term81954.getClass(), "userId", 0L);
        setLongField(term81954, term81954.getClass(), "groupId", 0L);
        setLongField(term81954, term81954.getClass(), "size", 0L);
        setLongField(term81954, term81954.getClass(), "modTime", 0L);
        setBooleanField(term81954, term81954.getClass(), "checkSumOK", false);
        setByteField(term81954, term81954.getClass(), "linkFlag", (byte) 0);
        setField(term81954, term81954.getClass(), "linkName", null);
        setField(term81954, term81954.getClass(), "magic", null);
        setField(term81954, term81954.getClass(), "version", null);
        setField(term81954, term81954.getClass(), "userName", null);
        setField(term81954, term81954.getClass(), "groupName", null);
        setIntField(term81954, term81954.getClass(), "devMajor", 0);
        setIntField(term81954, term81954.getClass(), "devMinor", 0);
        setBooleanField(term81954, term81954.getClass(), "isExtended", false);
        setLongField(term81954, term81954.getClass(), "realSize", 0L);
        setBooleanField(term81954, term81954.getClass(), "paxGNUSparse", false);
        setBooleanField(term81954, term81954.getClass(), "starSparse", false);
        setField(term81954, term81954.getClass(), "file", null);
        term81955 = newInstance(Class.forName("java.util.concurrent.CompletableFuture$BiRelay"));
        setField(term81955, term81955.getClass(), "snd", null);
        setField(term81955, term81955.getClass(), "executor", null);
        setField(term81955, term81955.getClass(), "dep", null);
        setField(term81955, term81955.getClass(), "src", null);
        setField(term81955, term81955.getClass(), "next", null);
        setIntField(term81955, term81955.getClass(), "status", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term81933;
        Object retValue = callMethod(klass, "equals", argTypes, term81835, args);
        assertTrue(recursiveEquals(term81835, term81954));
        assertTrue(recursiveEquals(term81933, term81955));
        assertTrue(recursiveEquals(retValue, false));
    }

};


