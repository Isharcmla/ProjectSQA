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

public class TarArchiveInputStream_paxHeaders_51667172362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210512;
     Object term227190;
     Object term227191;

    public TarArchiveInputStream_paxHeaders_51667172362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210512 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setBooleanField(term210512, term210512.getClass(), "hasHitEOF", true);
        term227190 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setBooleanField(term227190, term227190.getClass(), "hasHitEOF", true);
        setLongField(term227190, term227190.getClass(), "entrySize", 0L);
        setLongField(term227190, term227190.getClass(), "entryOffset", 0L);
        setField(term227190, term227190.getClass(), "readBuf", null);
        setField(term227190, term227190.getClass(), "buffer", null);
        setField(term227190, term227190.getClass(), "currEntry", null);
        setField(term227190, term227190.getClass(), "SINGLE", null);
        setLongField(term227190, term227190.getClass(), "bytesRead", 0L);
        term227191 = (byte[]) newByteArray(8192);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "paxHeaders", argTypes, term210512, args);
        assertTrue(recursiveEquals(term210512, term227190));
    }

};


