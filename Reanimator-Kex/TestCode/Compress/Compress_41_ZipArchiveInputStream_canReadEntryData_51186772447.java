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
     Object term39300;

    public ZipArchiveInputStream_canReadEntryData_51186772447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39300 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term39300, term39300.getClass(), "zipEncoding", null);
        setField(term39300, term39300.getClass(), "encoding", null);
        setBooleanField(term39300, term39300.getClass(), "useUnicodeExtraFields", false);
        setField(term39300, term39300.getClass(), "in", null);
        setField(term39300, term39300.getClass(), "inf", null);
        setField(term39300, term39300.getClass(), "buf", null);
        setField(term39300, term39300.getClass(), "current", null);
        setBooleanField(term39300, term39300.getClass(), "closed", false);
        setBooleanField(term39300, term39300.getClass(), "hitCentralDirectory", false);
        setField(term39300, term39300.getClass(), "lastStoredEntry", null);
        setBooleanField(term39300, term39300.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term39300, term39300.getClass(), "LFH_BUF", null);
        setField(term39300, term39300.getClass(), "SKIP_BUF", null);
        setField(term39300, term39300.getClass(), "SHORT_BUF", null);
        setField(term39300, term39300.getClass(), "WORD_BUF", null);
        setField(term39300, term39300.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term39300, term39300.getClass(), "entriesRead", 0);
        setField(term39300, term39300.getClass(), "SINGLE", null);
        setLongField(term39300, term39300.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canReadEntryData", argTypes, term39300, args);
    }

};


