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

public class ZipArchiveInputStream_readStored_178605038753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38321;
     Object term38328;
     Object term38330;

    public ZipArchiveInputStream_readStored_178605038753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38321 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term38321, term38321.getClass(), "zipEncoding", null);
        setBooleanField(term38321, term38321.getClass(), "useUnicodeExtraFields", false);
        setField(term38321, term38321.getClass(), "in", null);
        setField(term38321, term38321.getClass(), "inf", null);
        setField(term38321, term38321.getClass(), "buf", null);
        setField(term38321, term38321.getClass(), "current", null);
        setBooleanField(term38321, term38321.getClass(), "closed", false);
        setBooleanField(term38321, term38321.getClass(), "hitCentralDirectory", false);
        setField(term38321, term38321.getClass(), "lastStoredEntry", null);
        setBooleanField(term38321, term38321.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term38321, term38321.getClass(), "LFH_BUF", null);
        setField(term38321, term38321.getClass(), "SKIP_BUF", null);
        setField(term38321, term38321.getClass(), "SHORT_BUF", null);
        setField(term38321, term38321.getClass(), "WORD_BUF", null);
        setField(term38321, term38321.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term38321, term38321.getClass(), "entriesRead", 0);
        setField(term38321, term38321.getClass(), "SINGLE", null);
        setLongField(term38321, term38321.getClass(), "bytesRead", 0L);
        term38328 = new Integer(0);
        term38330 = new Integer(0);
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
        args[1] = term38328;
        args[2] = term38330;
        callMethod(klass, "readStored", argTypes, term38321, args);
    }

};


