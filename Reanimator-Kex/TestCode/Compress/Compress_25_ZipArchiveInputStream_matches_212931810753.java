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
import java.lang.Integer;

public class ZipArchiveInputStream_matches_212931810753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36091;
     Object term36098;

    public ZipArchiveInputStream_matches_212931810753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36091 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term36091, term36091.getClass(), "zipEncoding", null);
        setBooleanField(term36091, term36091.getClass(), "useUnicodeExtraFields", false);
        setField(term36091, term36091.getClass(), "in", null);
        setField(term36091, term36091.getClass(), "inf", null);
        setField(term36091, term36091.getClass(), "buf", null);
        setField(term36091, term36091.getClass(), "current", null);
        setBooleanField(term36091, term36091.getClass(), "closed", false);
        setBooleanField(term36091, term36091.getClass(), "hitCentralDirectory", false);
        setField(term36091, term36091.getClass(), "lastStoredEntry", null);
        setBooleanField(term36091, term36091.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term36091, term36091.getClass(), "LFH_BUF", null);
        setField(term36091, term36091.getClass(), "SKIP_BUF", null);
        setField(term36091, term36091.getClass(), "SHORT_BUF", null);
        setField(term36091, term36091.getClass(), "WORD_BUF", null);
        setField(term36091, term36091.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term36091, term36091.getClass(), "entriesRead", 0);
        setField(term36091, term36091.getClass(), "SINGLE", null);
        setLongField(term36091, term36091.getClass(), "bytesRead", 0L);
        term36098 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term36098;
        callMethod(klass, "matches", argTypes, term36091, args);
    }

};


