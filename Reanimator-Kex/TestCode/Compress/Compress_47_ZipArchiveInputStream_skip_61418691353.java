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

public class ZipArchiveInputStream_skip_61418691353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62903;
     Object term62910;

    public ZipArchiveInputStream_skip_61418691353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62903 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term62903, term62903.getClass(), "zipEncoding", null);
        setField(term62903, term62903.getClass(), "encoding", null);
        setBooleanField(term62903, term62903.getClass(), "useUnicodeExtraFields", false);
        setField(term62903, term62903.getClass(), "in", null);
        setField(term62903, term62903.getClass(), "inf", null);
        setField(term62903, term62903.getClass(), "buf", null);
        setField(term62903, term62903.getClass(), "current", null);
        setBooleanField(term62903, term62903.getClass(), "closed", false);
        setBooleanField(term62903, term62903.getClass(), "hitCentralDirectory", false);
        setField(term62903, term62903.getClass(), "lastStoredEntry", null);
        setBooleanField(term62903, term62903.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term62903, term62903.getClass(), "lfhBuf", null);
        setField(term62903, term62903.getClass(), "skipBuf", null);
        setField(term62903, term62903.getClass(), "shortBuf", null);
        setField(term62903, term62903.getClass(), "wordBuf", null);
        setField(term62903, term62903.getClass(), "twoDwordBuf", null);
        setIntField(term62903, term62903.getClass(), "entriesRead", 0);
        setField(term62903, term62903.getClass(), "single", null);
        setLongField(term62903, term62903.getClass(), "bytesRead", 0L);
        term62910 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term62910;
        callMethod(klass, "skip", argTypes, term62903, args);
    }

};


