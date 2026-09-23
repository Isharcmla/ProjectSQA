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

public class ZipArchiveInputStream_getBytesInflated_62032565062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38400;

    public ZipArchiveInputStream_getBytesInflated_62032565062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38400 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term38400, term38400.getClass(), "zipEncoding", null);
        setBooleanField(term38400, term38400.getClass(), "useUnicodeExtraFields", false);
        setField(term38400, term38400.getClass(), "in", null);
        setField(term38400, term38400.getClass(), "inf", null);
        setField(term38400, term38400.getClass(), "buf", null);
        setField(term38400, term38400.getClass(), "current", null);
        setBooleanField(term38400, term38400.getClass(), "closed", false);
        setBooleanField(term38400, term38400.getClass(), "hitCentralDirectory", false);
        setField(term38400, term38400.getClass(), "lastStoredEntry", null);
        setBooleanField(term38400, term38400.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term38400, term38400.getClass(), "LFH_BUF", null);
        setField(term38400, term38400.getClass(), "SKIP_BUF", null);
        setField(term38400, term38400.getClass(), "SHORT_BUF", null);
        setField(term38400, term38400.getClass(), "WORD_BUF", null);
        setField(term38400, term38400.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term38400, term38400.getClass(), "entriesRead", 0);
        setField(term38400, term38400.getClass(), "SINGLE", null);
        setLongField(term38400, term38400.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBytesInflated", argTypes, term38400, args);
    }

};


