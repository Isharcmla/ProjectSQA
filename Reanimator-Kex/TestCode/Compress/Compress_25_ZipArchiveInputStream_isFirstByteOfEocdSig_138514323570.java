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

public class ZipArchiveInputStream_isFirstByteOfEocdSig_138514323570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36230;
     Object term36237;

    public ZipArchiveInputStream_isFirstByteOfEocdSig_138514323570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36230 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term36230, term36230.getClass(), "zipEncoding", null);
        setBooleanField(term36230, term36230.getClass(), "useUnicodeExtraFields", false);
        setField(term36230, term36230.getClass(), "in", null);
        setField(term36230, term36230.getClass(), "inf", null);
        setField(term36230, term36230.getClass(), "buf", null);
        setField(term36230, term36230.getClass(), "current", null);
        setBooleanField(term36230, term36230.getClass(), "closed", false);
        setBooleanField(term36230, term36230.getClass(), "hitCentralDirectory", false);
        setField(term36230, term36230.getClass(), "lastStoredEntry", null);
        setBooleanField(term36230, term36230.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term36230, term36230.getClass(), "LFH_BUF", null);
        setField(term36230, term36230.getClass(), "SKIP_BUF", null);
        setField(term36230, term36230.getClass(), "SHORT_BUF", null);
        setField(term36230, term36230.getClass(), "WORD_BUF", null);
        setField(term36230, term36230.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term36230, term36230.getClass(), "entriesRead", 0);
        setField(term36230, term36230.getClass(), "SINGLE", null);
        setLongField(term36230, term36230.getClass(), "bytesRead", 0L);
        term36237 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term36237;
        callMethod(klass, "isFirstByteOfEocdSig", argTypes, term36230, args);
    }

};


