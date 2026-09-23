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
import java.lang.Object;

public class TarArchiveInputStream_paxHeaders_516671723224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103356;

    public TarArchiveInputStream_paxHeaders_516671723224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103356 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term102906 = (byte[]) newByteArray(9);
        Object term103422 = newInstance(Class.forName("org.tukaani.xz.LZMAInputStream"));
        setByteElement(term102906, 0, (byte) 2);
        setByteElement(term102906, 1, (byte) 2);
        setByteElement(term102906, 2, (byte) 2);
        setByteElement(term102906, 3, (byte) 2);
        setByteElement(term102906, 4, (byte) 2);
        setByteElement(term102906, 5, (byte) 2);
        setByteElement(term102906, 6, (byte) 2);
        setByteElement(term102906, 7, (byte) 2);
        setByteElement(term102906, 8, (byte) 2);
        setField(term103356, term103356.getClass(), "SINGLE", term102906);
        setBooleanField(term103356, term103356.getClass(), "hasHitEOF", false);
        setLongField(term103356, term103356.getClass(), "entryOffset", 0L);
        setLongField(term103356, term103356.getClass(), "entrySize", -9223372036854775806L);
        setField(term103356, term103356.getClass(), "currEntry", null);
        setIntField(term103356, term103356.getClass(), "recordSize", 236);
        setField(term103356, term103356.getClass(), "is", term103422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "paxHeaders", argTypes, term103356, args);
    }

};


