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

public class ZipArchiveInputStream_readDataDescriptor_39033292563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38407;

    public ZipArchiveInputStream_readDataDescriptor_39033292563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38407 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term38407, term38407.getClass(), "zipEncoding", null);
        setBooleanField(term38407, term38407.getClass(), "useUnicodeExtraFields", false);
        setField(term38407, term38407.getClass(), "in", null);
        setField(term38407, term38407.getClass(), "inf", null);
        setField(term38407, term38407.getClass(), "buf", null);
        setField(term38407, term38407.getClass(), "current", null);
        setBooleanField(term38407, term38407.getClass(), "closed", false);
        setBooleanField(term38407, term38407.getClass(), "hitCentralDirectory", false);
        setField(term38407, term38407.getClass(), "lastStoredEntry", null);
        setBooleanField(term38407, term38407.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term38407, term38407.getClass(), "LFH_BUF", null);
        setField(term38407, term38407.getClass(), "SKIP_BUF", null);
        setField(term38407, term38407.getClass(), "SHORT_BUF", null);
        setField(term38407, term38407.getClass(), "WORD_BUF", null);
        setField(term38407, term38407.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term38407, term38407.getClass(), "entriesRead", 0);
        setField(term38407, term38407.getClass(), "SINGLE", null);
        setLongField(term38407, term38407.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readDataDescriptor", argTypes, term38407, args);
    }

};


