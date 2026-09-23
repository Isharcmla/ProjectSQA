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

public class ZipArchiveInputStream_canReadEntryData_51186772446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36024;

    public ZipArchiveInputStream_canReadEntryData_51186772446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36024 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term36024, term36024.getClass(), "zipEncoding", null);
        setBooleanField(term36024, term36024.getClass(), "useUnicodeExtraFields", false);
        setField(term36024, term36024.getClass(), "in", null);
        setField(term36024, term36024.getClass(), "inf", null);
        setField(term36024, term36024.getClass(), "buf", null);
        setField(term36024, term36024.getClass(), "current", null);
        setBooleanField(term36024, term36024.getClass(), "closed", false);
        setBooleanField(term36024, term36024.getClass(), "hitCentralDirectory", false);
        setField(term36024, term36024.getClass(), "lastStoredEntry", null);
        setBooleanField(term36024, term36024.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term36024, term36024.getClass(), "LFH_BUF", null);
        setField(term36024, term36024.getClass(), "SKIP_BUF", null);
        setField(term36024, term36024.getClass(), "SHORT_BUF", null);
        setField(term36024, term36024.getClass(), "WORD_BUF", null);
        setField(term36024, term36024.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term36024, term36024.getClass(), "entriesRead", 0);
        setField(term36024, term36024.getClass(), "SINGLE", null);
        setLongField(term36024, term36024.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canReadEntryData", argTypes, term36024, args);
    }

};


