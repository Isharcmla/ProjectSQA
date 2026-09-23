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

public class ZipArchiveInputStream_realSkip_48030305368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36214;
     Object term36221;

    public ZipArchiveInputStream_realSkip_48030305368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36214 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term36214, term36214.getClass(), "zipEncoding", null);
        setBooleanField(term36214, term36214.getClass(), "useUnicodeExtraFields", false);
        setField(term36214, term36214.getClass(), "in", null);
        setField(term36214, term36214.getClass(), "inf", null);
        setField(term36214, term36214.getClass(), "buf", null);
        setField(term36214, term36214.getClass(), "current", null);
        setBooleanField(term36214, term36214.getClass(), "closed", false);
        setBooleanField(term36214, term36214.getClass(), "hitCentralDirectory", false);
        setField(term36214, term36214.getClass(), "lastStoredEntry", null);
        setBooleanField(term36214, term36214.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term36214, term36214.getClass(), "LFH_BUF", null);
        setField(term36214, term36214.getClass(), "SKIP_BUF", null);
        setField(term36214, term36214.getClass(), "SHORT_BUF", null);
        setField(term36214, term36214.getClass(), "WORD_BUF", null);
        setField(term36214, term36214.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term36214, term36214.getClass(), "entriesRead", 0);
        setField(term36214, term36214.getClass(), "SINGLE", null);
        setLongField(term36214, term36214.getClass(), "bytesRead", 0L);
        term36221 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term36221;
        callMethod(klass, "realSkip", argTypes, term36214, args);
    }

};


