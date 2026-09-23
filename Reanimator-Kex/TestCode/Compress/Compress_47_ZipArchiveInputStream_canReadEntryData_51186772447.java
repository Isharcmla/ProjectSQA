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

public class ZipArchiveInputStream_canReadEntryData_51186772447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62845;

    public ZipArchiveInputStream_canReadEntryData_51186772447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62845 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term62845, term62845.getClass(), "zipEncoding", null);
        setField(term62845, term62845.getClass(), "encoding", null);
        setBooleanField(term62845, term62845.getClass(), "useUnicodeExtraFields", false);
        setField(term62845, term62845.getClass(), "in", null);
        setField(term62845, term62845.getClass(), "inf", null);
        setField(term62845, term62845.getClass(), "buf", null);
        setField(term62845, term62845.getClass(), "current", null);
        setBooleanField(term62845, term62845.getClass(), "closed", false);
        setBooleanField(term62845, term62845.getClass(), "hitCentralDirectory", false);
        setField(term62845, term62845.getClass(), "lastStoredEntry", null);
        setBooleanField(term62845, term62845.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term62845, term62845.getClass(), "lfhBuf", null);
        setField(term62845, term62845.getClass(), "skipBuf", null);
        setField(term62845, term62845.getClass(), "shortBuf", null);
        setField(term62845, term62845.getClass(), "wordBuf", null);
        setField(term62845, term62845.getClass(), "twoDwordBuf", null);
        setIntField(term62845, term62845.getClass(), "entriesRead", 0);
        setField(term62845, term62845.getClass(), "single", null);
        setLongField(term62845, term62845.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canReadEntryData", argTypes, term62845, args);
    }

};


