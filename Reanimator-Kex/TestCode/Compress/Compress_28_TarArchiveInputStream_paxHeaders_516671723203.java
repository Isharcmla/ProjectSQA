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

public class TarArchiveInputStream_paxHeaders_516671723203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98356;

    public TarArchiveInputStream_paxHeaders_516671723203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98356 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term97641 = (byte[]) newByteArray(12);
        Object term98488 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setByteElement(term97641, 0, (byte) 1);
        setByteElement(term97641, 1, (byte) 1);
        setByteElement(term97641, 2, (byte) 1);
        setByteElement(term97641, 3, (byte) 1);
        setByteElement(term97641, 4, (byte) 1);
        setByteElement(term97641, 5, (byte) 1);
        setByteElement(term97641, 6, (byte) 1);
        setByteElement(term97641, 7, (byte) 1);
        setByteElement(term97641, 8, (byte) 1);
        setByteElement(term97641, 9, (byte) 1);
        setByteElement(term97641, 10, (byte) 1);
        setByteElement(term97641, 11, (byte) 1);
        setField(term98356, term98356.getClass(), "SINGLE", term97641);
        setBooleanField(term98356, term98356.getClass(), "hasHitEOF", false);
        setLongField(term98356, term98356.getClass(), "entryOffset", 0L);
        setLongField(term98356, term98356.getClass(), "entrySize", -9223372036854775806L);
        setField(term98356, term98356.getClass(), "currEntry", null);
        setIntField(term98356, term98356.getClass(), "recordSize", 489);
        setBooleanField(term98488, term98488.getClass(), "hasHitEOF", false);
        setLongField(term98488, term98488.getClass(), "entryOffset", 0L);
        setLongField(term98488, term98488.getClass(), "entrySize", 1L);
        setField(term98356, term98356.getClass(), "is", term98488);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "paxHeaders", argTypes, term98356, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


