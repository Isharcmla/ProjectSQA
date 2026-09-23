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
import java.lang.Long;

public class ZipArchiveInputStream_skip_61418691357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38361;
     Object term38368;

    public ZipArchiveInputStream_skip_61418691357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38361 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term38361, term38361.getClass(), "zipEncoding", null);
        setBooleanField(term38361, term38361.getClass(), "useUnicodeExtraFields", false);
        setField(term38361, term38361.getClass(), "in", null);
        setField(term38361, term38361.getClass(), "inf", null);
        setField(term38361, term38361.getClass(), "buf", null);
        setField(term38361, term38361.getClass(), "current", null);
        setBooleanField(term38361, term38361.getClass(), "closed", false);
        setBooleanField(term38361, term38361.getClass(), "hitCentralDirectory", false);
        setField(term38361, term38361.getClass(), "lastStoredEntry", null);
        setBooleanField(term38361, term38361.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term38361, term38361.getClass(), "LFH_BUF", null);
        setField(term38361, term38361.getClass(), "SKIP_BUF", null);
        setField(term38361, term38361.getClass(), "SHORT_BUF", null);
        setField(term38361, term38361.getClass(), "WORD_BUF", null);
        setField(term38361, term38361.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term38361, term38361.getClass(), "entriesRead", 0);
        setField(term38361, term38361.getClass(), "SINGLE", null);
        setLongField(term38361, term38361.getClass(), "bytesRead", 0L);
        term38368 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term38368;
        callMethod(klass, "skip", argTypes, term38361, args);
    }

};


