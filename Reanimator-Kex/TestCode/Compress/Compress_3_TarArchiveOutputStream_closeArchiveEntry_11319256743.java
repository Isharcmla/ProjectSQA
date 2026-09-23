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

public class TarArchiveOutputStream_closeArchiveEntry_11319256743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83845;
     Object term84103;

    public TarArchiveOutputStream_closeArchiveEntry_11319256743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83845 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setIntField(term83845, term83845.getClass(), "assemLen", 0);
        setLongField(term83845, term83845.getClass(), "currBytes", 9223372036854775806L);
        setLongField(term83845, term83845.getClass(), "currSize", -9223372036854775808L);
        term84103 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setLongField(term84103, term84103.getClass(), "currSize", -9223372036854775808L);
        setField(term84103, term84103.getClass(), "currName", null);
        setLongField(term84103, term84103.getClass(), "currBytes", 9223372036854775806L);
        setField(term84103, term84103.getClass(), "recordBuf", null);
        setIntField(term84103, term84103.getClass(), "assemLen", 0);
        setField(term84103, term84103.getClass(), "assemBuf", null);
        setField(term84103, term84103.getClass(), "buffer", null);
        setIntField(term84103, term84103.getClass(), "longFileMode", 0);
        setBooleanField(term84103, term84103.getClass(), "closed", false);
        setField(term84103, term84103.getClass(), "out", null);
        setField(term84103, term84103.getClass(), "oneByte", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "closeArchiveEntry", argTypes, term83845, args);
        assertTrue(recursiveEquals(term83845, term84103));
    }

};


