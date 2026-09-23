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

public class TarArchiveInputStream_paxHeaders_516671723131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43420;
     Object term44153;

    public TarArchiveInputStream_paxHeaders_516671723131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43420 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term42985 = (byte[]) newByteArray(234);
        setField(term43420, term43420.getClass(), "SINGLE", term42985);
        setBooleanField(term43420, term43420.getClass(), "hasHitEOF", true);
        term44153 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term44154 = (byte[]) newByteArray(234);
        setField(term44153, term44153.getClass(), "SMALL_BUF", null);
        setIntField(term44153, term44153.getClass(), "recordSize", 0);
        setIntField(term44153, term44153.getClass(), "blockSize", 0);
        setBooleanField(term44153, term44153.getClass(), "hasHitEOF", true);
        setLongField(term44153, term44153.getClass(), "entrySize", 0L);
        setLongField(term44153, term44153.getClass(), "entryOffset", 0L);
        setField(term44153, term44153.getClass(), "is", null);
        setField(term44153, term44153.getClass(), "currEntry", null);
        setField(term44153, term44153.getClass(), "zipEncoding", null);
        setField(term44153, term44153.getClass(), "SINGLE", term44154);
        setLongField(term44153, term44153.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "paxHeaders", argTypes, term43420, args);
        assertTrue(recursiveEquals(term43420, term44153));
    }

};


