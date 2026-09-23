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
import java.lang.ArithmeticException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarArchiveInputStream_paxHeaders_516671723229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90397;

    public TarArchiveInputStream_paxHeaders_516671723229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90397 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term90156 = (byte[]) newByteArray(16);
        Object term90521 = newInstance(Class.forName("org.apache.commons.compress.utils.CRC32VerifyingInputStream"));
        setField(term90397, term90397.getClass(), "SINGLE", term90156);
        setBooleanField(term90397, term90397.getClass(), "hasHitEOF", false);
        setLongField(term90397, term90397.getClass(), "entryOffset", 412316860416L);
        setLongField(term90397, term90397.getClass(), "entrySize", 274877906945L);
        setField(term90397, term90397.getClass(), "currEntry", null);
        setIntField(term90397, term90397.getClass(), "recordSize", 0);
        setField(term90397, term90397.getClass(), "is", term90521);
        setLongField(term90397, term90397.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "paxHeaders", argTypes, term90397, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


