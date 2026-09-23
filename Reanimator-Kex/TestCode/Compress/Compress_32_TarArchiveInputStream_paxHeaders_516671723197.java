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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarArchiveInputStream_paxHeaders_516671723197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83326;

    public TarArchiveInputStream_paxHeaders_516671723197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83326 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term83087 = (byte[]) newByteArray(16);
        Object term83394 = newInstance(Class.forName("java.util.zip.GZIPInputStream$1"));
        setField(term83326, term83326.getClass(), "SINGLE", term83087);
        setBooleanField(term83326, term83326.getClass(), "hasHitEOF", false);
        setLongField(term83326, term83326.getClass(), "entryOffset", 412316860416L);
        setLongField(term83326, term83326.getClass(), "entrySize", 274877906945L);
        setField(term83326, term83326.getClass(), "currEntry", null);
        setIntField(term83326, term83326.getClass(), "recordSize", 0);
        setField(term83326, term83326.getClass(), "is", term83394);
        setLongField(term83326, term83326.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "paxHeaders", argTypes, term83326, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


