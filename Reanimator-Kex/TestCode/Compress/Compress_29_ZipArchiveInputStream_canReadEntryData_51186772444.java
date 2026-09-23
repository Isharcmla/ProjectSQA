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

public class ZipArchiveInputStream_canReadEntryData_51186772444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38248;

    public ZipArchiveInputStream_canReadEntryData_51186772444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38248 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term38248, term38248.getClass(), "zipEncoding", null);
        setBooleanField(term38248, term38248.getClass(), "useUnicodeExtraFields", false);
        setField(term38248, term38248.getClass(), "in", null);
        setField(term38248, term38248.getClass(), "inf", null);
        setField(term38248, term38248.getClass(), "buf", null);
        setField(term38248, term38248.getClass(), "current", null);
        setBooleanField(term38248, term38248.getClass(), "closed", false);
        setBooleanField(term38248, term38248.getClass(), "hitCentralDirectory", false);
        setField(term38248, term38248.getClass(), "lastStoredEntry", null);
        setBooleanField(term38248, term38248.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term38248, term38248.getClass(), "LFH_BUF", null);
        setField(term38248, term38248.getClass(), "SKIP_BUF", null);
        setField(term38248, term38248.getClass(), "SHORT_BUF", null);
        setField(term38248, term38248.getClass(), "WORD_BUF", null);
        setField(term38248, term38248.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term38248, term38248.getClass(), "entriesRead", 0);
        setField(term38248, term38248.getClass(), "SINGLE", null);
        setLongField(term38248, term38248.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canReadEntryData", argTypes, term38248, args);
    }

};


