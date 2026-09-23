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

public class ZipArchiveInputStream_readDeflated_53837355954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38332;
     Object term38339;
     Object term38341;

    public ZipArchiveInputStream_readDeflated_53837355954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38332 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term38332, term38332.getClass(), "zipEncoding", null);
        setBooleanField(term38332, term38332.getClass(), "useUnicodeExtraFields", false);
        setField(term38332, term38332.getClass(), "in", null);
        setField(term38332, term38332.getClass(), "inf", null);
        setField(term38332, term38332.getClass(), "buf", null);
        setField(term38332, term38332.getClass(), "current", null);
        setBooleanField(term38332, term38332.getClass(), "closed", false);
        setBooleanField(term38332, term38332.getClass(), "hitCentralDirectory", false);
        setField(term38332, term38332.getClass(), "lastStoredEntry", null);
        setBooleanField(term38332, term38332.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term38332, term38332.getClass(), "LFH_BUF", null);
        setField(term38332, term38332.getClass(), "SKIP_BUF", null);
        setField(term38332, term38332.getClass(), "SHORT_BUF", null);
        setField(term38332, term38332.getClass(), "WORD_BUF", null);
        setField(term38332, term38332.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term38332, term38332.getClass(), "entriesRead", 0);
        setField(term38332, term38332.getClass(), "SINGLE", null);
        setLongField(term38332, term38332.getClass(), "bytesRead", 0L);
        term38339 = new Integer(0);
        term38341 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term38339;
        args[2] = term38341;
        callMethod(klass, "readDeflated", argTypes, term38332, args);
    }

};


