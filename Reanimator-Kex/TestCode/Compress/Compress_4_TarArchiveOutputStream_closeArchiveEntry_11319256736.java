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

public class TarArchiveOutputStream_closeArchiveEntry_11319256736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82498;
     Object term82950;

    public TarArchiveOutputStream_closeArchiveEntry_11319256736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82498 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setIntField(term82498, term82498.getClass(), "assemLen", 0);
        setLongField(term82498, term82498.getClass(), "currBytes", 9223372036854775806L);
        setLongField(term82498, term82498.getClass(), "currSize", -9223372036854775808L);
        term82950 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setLongField(term82950, term82950.getClass(), "currSize", -9223372036854775808L);
        setField(term82950, term82950.getClass(), "currName", null);
        setLongField(term82950, term82950.getClass(), "currBytes", 9223372036854775806L);
        setField(term82950, term82950.getClass(), "recordBuf", null);
        setIntField(term82950, term82950.getClass(), "assemLen", 0);
        setField(term82950, term82950.getClass(), "assemBuf", null);
        setField(term82950, term82950.getClass(), "buffer", null);
        setIntField(term82950, term82950.getClass(), "longFileMode", 0);
        setBooleanField(term82950, term82950.getClass(), "closed", false);
        setBooleanField(term82950, term82950.getClass(), "haveUnclosedEntry", false);
        setField(term82950, term82950.getClass(), "out", null);
        setField(term82950, term82950.getClass(), "oneByte", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "closeArchiveEntry", argTypes, term82498, args);
        assertTrue(recursiveEquals(term82498, term82950));
    }

};


