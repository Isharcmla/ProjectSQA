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

public class TarArchiveInputStream_paxHeaders_516671723179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79942;

    public TarArchiveInputStream_paxHeaders_516671723179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79942 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term79227 = (byte[]) newByteArray(12);
        Object term80074 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setByteElement(term79227, 0, (byte) 1);
        setByteElement(term79227, 1, (byte) 1);
        setByteElement(term79227, 2, (byte) 1);
        setByteElement(term79227, 3, (byte) 1);
        setByteElement(term79227, 4, (byte) 1);
        setByteElement(term79227, 5, (byte) 1);
        setByteElement(term79227, 6, (byte) 1);
        setByteElement(term79227, 7, (byte) 1);
        setByteElement(term79227, 8, (byte) 1);
        setByteElement(term79227, 9, (byte) 1);
        setByteElement(term79227, 10, (byte) 1);
        setByteElement(term79227, 11, (byte) 1);
        setField(term79942, term79942.getClass(), "SINGLE", term79227);
        setBooleanField(term79942, term79942.getClass(), "hasHitEOF", false);
        setLongField(term79942, term79942.getClass(), "entryOffset", 0L);
        setLongField(term79942, term79942.getClass(), "entrySize", -9223372036854775806L);
        setField(term79942, term79942.getClass(), "currEntry", null);
        setIntField(term79942, term79942.getClass(), "recordSize", 489);
        setBooleanField(term80074, term80074.getClass(), "hasHitEOF", false);
        setLongField(term80074, term80074.getClass(), "entryOffset", 0L);
        setLongField(term80074, term80074.getClass(), "entrySize", 1L);
        setField(term79942, term79942.getClass(), "is", term80074);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "paxHeaders", argTypes, term79942, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


