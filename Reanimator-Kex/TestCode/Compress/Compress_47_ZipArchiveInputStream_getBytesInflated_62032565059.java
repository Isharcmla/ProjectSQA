package org.apache.commons.compress.archivers.zip;

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
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ZipArchiveInputStream_getBytesInflated_62032565059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62949;

    public ZipArchiveInputStream_getBytesInflated_62032565059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62949 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term62949, term62949.getClass(), "zipEncoding", null);
        setField(term62949, term62949.getClass(), "encoding", null);
        setBooleanField(term62949, term62949.getClass(), "useUnicodeExtraFields", false);
        setField(term62949, term62949.getClass(), "in", null);
        setField(term62949, term62949.getClass(), "inf", null);
        setField(term62949, term62949.getClass(), "buf", null);
        setField(term62949, term62949.getClass(), "current", null);
        setBooleanField(term62949, term62949.getClass(), "closed", false);
        setBooleanField(term62949, term62949.getClass(), "hitCentralDirectory", false);
        setField(term62949, term62949.getClass(), "lastStoredEntry", null);
        setBooleanField(term62949, term62949.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term62949, term62949.getClass(), "lfhBuf", null);
        setField(term62949, term62949.getClass(), "skipBuf", null);
        setField(term62949, term62949.getClass(), "shortBuf", null);
        setField(term62949, term62949.getClass(), "wordBuf", null);
        setField(term62949, term62949.getClass(), "twoDwordBuf", null);
        setIntField(term62949, term62949.getClass(), "entriesRead", 0);
        setField(term62949, term62949.getClass(), "single", null);
        setLongField(term62949, term62949.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBytesInflated", argTypes, term62949, args);
    }

};


