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

public class ZipArchiveInputStream_processZip64Extra_195436523645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62831;

    public ZipArchiveInputStream_processZip64Extra_195436523645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62831 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term62831, term62831.getClass(), "zipEncoding", null);
        setField(term62831, term62831.getClass(), "encoding", null);
        setBooleanField(term62831, term62831.getClass(), "useUnicodeExtraFields", false);
        setField(term62831, term62831.getClass(), "in", null);
        setField(term62831, term62831.getClass(), "inf", null);
        setField(term62831, term62831.getClass(), "buf", null);
        setField(term62831, term62831.getClass(), "current", null);
        setBooleanField(term62831, term62831.getClass(), "closed", false);
        setBooleanField(term62831, term62831.getClass(), "hitCentralDirectory", false);
        setField(term62831, term62831.getClass(), "lastStoredEntry", null);
        setBooleanField(term62831, term62831.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term62831, term62831.getClass(), "lfhBuf", null);
        setField(term62831, term62831.getClass(), "skipBuf", null);
        setField(term62831, term62831.getClass(), "shortBuf", null);
        setField(term62831, term62831.getClass(), "wordBuf", null);
        setField(term62831, term62831.getClass(), "twoDwordBuf", null);
        setIntField(term62831, term62831.getClass(), "entriesRead", 0);
        setField(term62831, term62831.getClass(), "single", null);
        setLongField(term62831, term62831.getClass(), "bytesRead", 0L);
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
        callMethod(klass, "processZip64Extra", argTypes, term62831, args);
    }

};


