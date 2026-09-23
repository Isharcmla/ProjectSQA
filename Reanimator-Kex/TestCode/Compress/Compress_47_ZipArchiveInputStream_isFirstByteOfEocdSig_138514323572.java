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

public class ZipArchiveInputStream_isFirstByteOfEocdSig_138514323572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63058;
     Object term63065;

    public ZipArchiveInputStream_isFirstByteOfEocdSig_138514323572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63058 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term63058, term63058.getClass(), "zipEncoding", null);
        setField(term63058, term63058.getClass(), "encoding", null);
        setBooleanField(term63058, term63058.getClass(), "useUnicodeExtraFields", false);
        setField(term63058, term63058.getClass(), "in", null);
        setField(term63058, term63058.getClass(), "inf", null);
        setField(term63058, term63058.getClass(), "buf", null);
        setField(term63058, term63058.getClass(), "current", null);
        setBooleanField(term63058, term63058.getClass(), "closed", false);
        setBooleanField(term63058, term63058.getClass(), "hitCentralDirectory", false);
        setField(term63058, term63058.getClass(), "lastStoredEntry", null);
        setBooleanField(term63058, term63058.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term63058, term63058.getClass(), "lfhBuf", null);
        setField(term63058, term63058.getClass(), "skipBuf", null);
        setField(term63058, term63058.getClass(), "shortBuf", null);
        setField(term63058, term63058.getClass(), "wordBuf", null);
        setField(term63058, term63058.getClass(), "twoDwordBuf", null);
        setIntField(term63058, term63058.getClass(), "entriesRead", 0);
        setField(term63058, term63058.getClass(), "single", null);
        setLongField(term63058, term63058.getClass(), "bytesRead", 0L);
        term63065 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term63065;
        callMethod(klass, "isFirstByteOfEocdSig", argTypes, term63058, args);
    }

};


