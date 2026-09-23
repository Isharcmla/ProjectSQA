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

public class ZipArchiveInputStream_skipRemainderOfArchive_41556600968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63028;

    public ZipArchiveInputStream_skipRemainderOfArchive_41556600968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63028 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term63028, term63028.getClass(), "zipEncoding", null);
        setField(term63028, term63028.getClass(), "encoding", null);
        setBooleanField(term63028, term63028.getClass(), "useUnicodeExtraFields", false);
        setField(term63028, term63028.getClass(), "in", null);
        setField(term63028, term63028.getClass(), "inf", null);
        setField(term63028, term63028.getClass(), "buf", null);
        setField(term63028, term63028.getClass(), "current", null);
        setBooleanField(term63028, term63028.getClass(), "closed", false);
        setBooleanField(term63028, term63028.getClass(), "hitCentralDirectory", false);
        setField(term63028, term63028.getClass(), "lastStoredEntry", null);
        setBooleanField(term63028, term63028.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term63028, term63028.getClass(), "lfhBuf", null);
        setField(term63028, term63028.getClass(), "skipBuf", null);
        setField(term63028, term63028.getClass(), "shortBuf", null);
        setField(term63028, term63028.getClass(), "wordBuf", null);
        setField(term63028, term63028.getClass(), "twoDwordBuf", null);
        setIntField(term63028, term63028.getClass(), "entriesRead", 0);
        setField(term63028, term63028.getClass(), "single", null);
        setLongField(term63028, term63028.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "skipRemainderOfArchive", argTypes, term63028, args);
    }

};


