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

public class TarArchiveInputStream_paxHeaders_51667172395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36486;
     Object term37219;

    public TarArchiveInputStream_paxHeaders_51667172395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36486 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term36051 = (byte[]) newByteArray(234);
        setField(term36486, term36486.getClass(), "SINGLE", term36051);
        setBooleanField(term36486, term36486.getClass(), "hasHitEOF", true);
        term37219 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term37220 = (byte[]) newByteArray(234);
        setField(term37219, term37219.getClass(), "SMALL_BUF", null);
        setIntField(term37219, term37219.getClass(), "recordSize", 0);
        setIntField(term37219, term37219.getClass(), "blockSize", 0);
        setBooleanField(term37219, term37219.getClass(), "hasHitEOF", true);
        setLongField(term37219, term37219.getClass(), "entrySize", 0L);
        setLongField(term37219, term37219.getClass(), "entryOffset", 0L);
        setField(term37219, term37219.getClass(), "is", null);
        setField(term37219, term37219.getClass(), "currEntry", null);
        setField(term37219, term37219.getClass(), "encoding", null);
        setField(term37219, term37219.getClass(), "SINGLE", term37220);
        setLongField(term37219, term37219.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "paxHeaders", argTypes, term36486, args);
        assertTrue(recursiveEquals(term36486, term37219));
    }

};


