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
     Object term38468;
     Object term38475;

    public ZipArchiveInputStream_isFirstByteOfEocdSig_138514323570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38468 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term38468, term38468.getClass(), "zipEncoding", null);
        setBooleanField(term38468, term38468.getClass(), "useUnicodeExtraFields", false);
        setField(term38468, term38468.getClass(), "in", null);
        setField(term38468, term38468.getClass(), "inf", null);
        setField(term38468, term38468.getClass(), "buf", null);
        setField(term38468, term38468.getClass(), "current", null);
        setBooleanField(term38468, term38468.getClass(), "closed", false);
        setBooleanField(term38468, term38468.getClass(), "hitCentralDirectory", false);
        setField(term38468, term38468.getClass(), "lastStoredEntry", null);
        setBooleanField(term38468, term38468.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term38468, term38468.getClass(), "LFH_BUF", null);
        setField(term38468, term38468.getClass(), "SKIP_BUF", null);
        setField(term38468, term38468.getClass(), "SHORT_BUF", null);
        setField(term38468, term38468.getClass(), "WORD_BUF", null);
        setField(term38468, term38468.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term38468, term38468.getClass(), "entriesRead", 0);
        setField(term38468, term38468.getClass(), "SINGLE", null);
        setLongField(term38468, term38468.getClass(), "bytesRead", 0L);
        term38475 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term38475;
        callMethod(klass, "isFirstByteOfEocdSig", argTypes, term38468, args);
    }

};


