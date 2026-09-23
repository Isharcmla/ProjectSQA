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

public class TarArchiveInputStream_readRecord_483919353105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31922;
     Object term31945;
     Object term31944;

    public TarArchiveInputStream_readRecord_483919353105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31922 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setIntField(term31922, term31922.getClass(), "recordSize", 0);
        term31945 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term31945, term31945.getClass(), "SMALL_BUF", null);
        setIntField(term31945, term31945.getClass(), "recordSize", 0);
        setIntField(term31945, term31945.getClass(), "blockSize", 0);
        setBooleanField(term31945, term31945.getClass(), "hasHitEOF", false);
        setLongField(term31945, term31945.getClass(), "entrySize", 0L);
        setLongField(term31945, term31945.getClass(), "entryOffset", 0L);
        setField(term31945, term31945.getClass(), "is", null);
        setField(term31945, term31945.getClass(), "currEntry", null);
        setField(term31945, term31945.getClass(), "zipEncoding", null);
        setField(term31945, term31945.getClass(), "SINGLE", null);
        setLongField(term31945, term31945.getClass(), "bytesRead", 0L);
        term31944 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "readRecord", argTypes, term31922, args);
        assertTrue(recursiveEquals(term31922, term31945));
        assertTrue(recursiveEquals(retValue, term31944));
    }

};


