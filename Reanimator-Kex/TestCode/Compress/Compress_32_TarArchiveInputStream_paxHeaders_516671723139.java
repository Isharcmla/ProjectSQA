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

public class TarArchiveInputStream_paxHeaders_516671723139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57606;
     Object term58339;

    public TarArchiveInputStream_paxHeaders_516671723139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57606 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term57171 = (byte[]) newByteArray(234);
        setField(term57606, term57606.getClass(), "SINGLE", term57171);
        setBooleanField(term57606, term57606.getClass(), "hasHitEOF", true);
        term58339 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term58340 = (byte[]) newByteArray(234);
        setField(term58339, term58339.getClass(), "SMALL_BUF", null);
        setIntField(term58339, term58339.getClass(), "recordSize", 0);
        setIntField(term58339, term58339.getClass(), "blockSize", 0);
        setBooleanField(term58339, term58339.getClass(), "hasHitEOF", true);
        setLongField(term58339, term58339.getClass(), "entrySize", 0L);
        setLongField(term58339, term58339.getClass(), "entryOffset", 0L);
        setField(term58339, term58339.getClass(), "is", null);
        setField(term58339, term58339.getClass(), "currEntry", null);
        setField(term58339, term58339.getClass(), "zipEncoding", null);
        setField(term58339, term58339.getClass(), "encoding", null);
        setField(term58339, term58339.getClass(), "SINGLE", term58340);
        setLongField(term58339, term58339.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "paxHeaders", argTypes, term57606, args);
        assertTrue(recursiveEquals(term57606, term58339));
    }

};


