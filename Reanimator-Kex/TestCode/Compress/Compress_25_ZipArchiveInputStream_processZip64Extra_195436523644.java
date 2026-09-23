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

public class ZipArchiveInputStream_processZip64Extra_195436523644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36010;

    public ZipArchiveInputStream_processZip64Extra_195436523644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36010 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term36010, term36010.getClass(), "zipEncoding", null);
        setBooleanField(term36010, term36010.getClass(), "useUnicodeExtraFields", false);
        setField(term36010, term36010.getClass(), "in", null);
        setField(term36010, term36010.getClass(), "inf", null);
        setField(term36010, term36010.getClass(), "buf", null);
        setField(term36010, term36010.getClass(), "current", null);
        setBooleanField(term36010, term36010.getClass(), "closed", false);
        setBooleanField(term36010, term36010.getClass(), "hitCentralDirectory", false);
        setField(term36010, term36010.getClass(), "lastStoredEntry", null);
        setBooleanField(term36010, term36010.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term36010, term36010.getClass(), "LFH_BUF", null);
        setField(term36010, term36010.getClass(), "SKIP_BUF", null);
        setField(term36010, term36010.getClass(), "SHORT_BUF", null);
        setField(term36010, term36010.getClass(), "WORD_BUF", null);
        setField(term36010, term36010.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term36010, term36010.getClass(), "entriesRead", 0);
        setField(term36010, term36010.getClass(), "SINGLE", null);
        setLongField(term36010, term36010.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipLong");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.zip.ZipLong");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "processZip64Extra", argTypes, term36010, args);
    }

};


