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

public class TarArchiveInputStream_available_85705187398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42750;
     Object term43046;

    public TarArchiveInputStream_available_85705187398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42750 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term42750, term42750.getClass(), "currEntry", null);
        term43046 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term43046, term43046.getClass(), "SMALL_BUF", null);
        setIntField(term43046, term43046.getClass(), "recordSize", 0);
        setIntField(term43046, term43046.getClass(), "blockSize", 0);
        setBooleanField(term43046, term43046.getClass(), "hasHitEOF", false);
        setLongField(term43046, term43046.getClass(), "entrySize", 0L);
        setLongField(term43046, term43046.getClass(), "entryOffset", 0L);
        setField(term43046, term43046.getClass(), "is", null);
        setField(term43046, term43046.getClass(), "currEntry", null);
        setField(term43046, term43046.getClass(), "zipEncoding", null);
        setField(term43046, term43046.getClass(), "encoding", null);
        setField(term43046, term43046.getClass(), "globalPaxHeaders", null);
        setField(term43046, term43046.getClass(), "SINGLE", null);
        setLongField(term43046, term43046.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "available", argTypes, term42750, args);
        assertTrue(recursiveEquals(term42750, term43046));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


