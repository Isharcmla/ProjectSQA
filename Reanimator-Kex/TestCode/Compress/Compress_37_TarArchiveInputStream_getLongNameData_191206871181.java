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

public class TarArchiveInputStream_getLongNameData_191206871181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30153;
     Object term31914;
     Object term31916;

    public TarArchiveInputStream_getLongNameData_191206871181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30153 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term29510 = (byte[]) newByteArray(489);
        setField(term30153, term30153.getClass(), "SMALL_BUF", term29510);
        setBooleanField(term30153, term30153.getClass(), "hasHitEOF", true);
        setField(term30153, term30153.getClass(), "currEntry", null);
        term31914 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term31915 = (byte[]) newByteArray(489);
        setField(term31914, term31914.getClass(), "SMALL_BUF", term31915);
        setIntField(term31914, term31914.getClass(), "recordSize", 0);
        setIntField(term31914, term31914.getClass(), "blockSize", 0);
        setBooleanField(term31914, term31914.getClass(), "hasHitEOF", true);
        setLongField(term31914, term31914.getClass(), "entrySize", 0L);
        setLongField(term31914, term31914.getClass(), "entryOffset", 0L);
        setField(term31914, term31914.getClass(), "is", null);
        setField(term31914, term31914.getClass(), "currEntry", null);
        setField(term31914, term31914.getClass(), "zipEncoding", null);
        setField(term31914, term31914.getClass(), "encoding", null);
        setField(term31914, term31914.getClass(), "globalPaxHeaders", null);
        setField(term31914, term31914.getClass(), "SINGLE", null);
        setLongField(term31914, term31914.getClass(), "bytesRead", 0L);
        term31916 = (byte[]) newByteArray(489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLongNameData", argTypes, term30153, args);
        assertTrue(recursiveEquals(term30153, term31914));
        assertTrue(recursiveEquals(retValue, null));
    }

};


