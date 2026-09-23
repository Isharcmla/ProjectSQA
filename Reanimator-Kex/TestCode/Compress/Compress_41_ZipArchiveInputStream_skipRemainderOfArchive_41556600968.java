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
     Object term39483;

    public ZipArchiveInputStream_skipRemainderOfArchive_41556600968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39483 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term39483, term39483.getClass(), "zipEncoding", null);
        setField(term39483, term39483.getClass(), "encoding", null);
        setBooleanField(term39483, term39483.getClass(), "useUnicodeExtraFields", false);
        setField(term39483, term39483.getClass(), "in", null);
        setField(term39483, term39483.getClass(), "inf", null);
        setField(term39483, term39483.getClass(), "buf", null);
        setField(term39483, term39483.getClass(), "current", null);
        setBooleanField(term39483, term39483.getClass(), "closed", false);
        setBooleanField(term39483, term39483.getClass(), "hitCentralDirectory", false);
        setField(term39483, term39483.getClass(), "lastStoredEntry", null);
        setBooleanField(term39483, term39483.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term39483, term39483.getClass(), "LFH_BUF", null);
        setField(term39483, term39483.getClass(), "SKIP_BUF", null);
        setField(term39483, term39483.getClass(), "SHORT_BUF", null);
        setField(term39483, term39483.getClass(), "WORD_BUF", null);
        setField(term39483, term39483.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term39483, term39483.getClass(), "entriesRead", 0);
        setField(term39483, term39483.getClass(), "SINGLE", null);
        setLongField(term39483, term39483.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "skipRemainderOfArchive", argTypes, term39483, args);
    }

};


