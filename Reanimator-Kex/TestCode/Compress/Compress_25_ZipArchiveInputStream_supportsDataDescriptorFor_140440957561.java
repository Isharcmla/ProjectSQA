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

public class ZipArchiveInputStream_supportsDataDescriptorFor_140440957561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36149;

    public ZipArchiveInputStream_supportsDataDescriptorFor_140440957561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36149 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term36149, term36149.getClass(), "zipEncoding", null);
        setBooleanField(term36149, term36149.getClass(), "useUnicodeExtraFields", false);
        setField(term36149, term36149.getClass(), "in", null);
        setField(term36149, term36149.getClass(), "inf", null);
        setField(term36149, term36149.getClass(), "buf", null);
        setField(term36149, term36149.getClass(), "current", null);
        setBooleanField(term36149, term36149.getClass(), "closed", false);
        setBooleanField(term36149, term36149.getClass(), "hitCentralDirectory", false);
        setField(term36149, term36149.getClass(), "lastStoredEntry", null);
        setBooleanField(term36149, term36149.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term36149, term36149.getClass(), "LFH_BUF", null);
        setField(term36149, term36149.getClass(), "SKIP_BUF", null);
        setField(term36149, term36149.getClass(), "SHORT_BUF", null);
        setField(term36149, term36149.getClass(), "WORD_BUF", null);
        setField(term36149, term36149.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term36149, term36149.getClass(), "entriesRead", 0);
        setField(term36149, term36149.getClass(), "SINGLE", null);
        setLongField(term36149, term36149.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "supportsDataDescriptorFor", argTypes, term36149, args);
    }

};


