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

public class ZipArchiveInputStream_readDataDescriptor_39033292560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36142;

    public ZipArchiveInputStream_readDataDescriptor_39033292560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36142 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term36142, term36142.getClass(), "zipEncoding", null);
        setBooleanField(term36142, term36142.getClass(), "useUnicodeExtraFields", false);
        setField(term36142, term36142.getClass(), "in", null);
        setField(term36142, term36142.getClass(), "inf", null);
        setField(term36142, term36142.getClass(), "buf", null);
        setField(term36142, term36142.getClass(), "current", null);
        setBooleanField(term36142, term36142.getClass(), "closed", false);
        setBooleanField(term36142, term36142.getClass(), "hitCentralDirectory", false);
        setField(term36142, term36142.getClass(), "lastStoredEntry", null);
        setBooleanField(term36142, term36142.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term36142, term36142.getClass(), "LFH_BUF", null);
        setField(term36142, term36142.getClass(), "SKIP_BUF", null);
        setField(term36142, term36142.getClass(), "SHORT_BUF", null);
        setField(term36142, term36142.getClass(), "WORD_BUF", null);
        setField(term36142, term36142.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term36142, term36142.getClass(), "entriesRead", 0);
        setField(term36142, term36142.getClass(), "SINGLE", null);
        setLongField(term36142, term36142.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readDataDescriptor", argTypes, term36142, args);
    }

};


