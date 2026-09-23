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

public class TarArchiveInputStream_paxHeaders_51667172375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26720;
     Object term26781;

    public TarArchiveInputStream_paxHeaders_51667172375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26720 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term26720, term26720.getClass(), "SINGLE", null);
        setBooleanField(term26720, term26720.getClass(), "hasHitEOF", true);
        term26781 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term26781, term26781.getClass(), "SMALL_BUF", null);
        setIntField(term26781, term26781.getClass(), "recordSize", 0);
        setIntField(term26781, term26781.getClass(), "blockSize", 0);
        setBooleanField(term26781, term26781.getClass(), "hasHitEOF", true);
        setLongField(term26781, term26781.getClass(), "entrySize", 0L);
        setLongField(term26781, term26781.getClass(), "entryOffset", 0L);
        setField(term26781, term26781.getClass(), "is", null);
        setField(term26781, term26781.getClass(), "currEntry", null);
        setField(term26781, term26781.getClass(), "zipEncoding", null);
        setField(term26781, term26781.getClass(), "encoding", null);
        setField(term26781, term26781.getClass(), "SINGLE", null);
        setLongField(term26781, term26781.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "paxHeaders", argTypes, term26720, args);
        assertTrue(recursiveEquals(term26720, term26781));
    }

};


