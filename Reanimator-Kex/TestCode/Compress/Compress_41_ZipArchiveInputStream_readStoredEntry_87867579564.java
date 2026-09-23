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

public class ZipArchiveInputStream_readStoredEntry_87867579564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39439;

    public ZipArchiveInputStream_readStoredEntry_87867579564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39439 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term39439, term39439.getClass(), "zipEncoding", null);
        setField(term39439, term39439.getClass(), "encoding", null);
        setBooleanField(term39439, term39439.getClass(), "useUnicodeExtraFields", false);
        setField(term39439, term39439.getClass(), "in", null);
        setField(term39439, term39439.getClass(), "inf", null);
        setField(term39439, term39439.getClass(), "buf", null);
        setField(term39439, term39439.getClass(), "current", null);
        setBooleanField(term39439, term39439.getClass(), "closed", false);
        setBooleanField(term39439, term39439.getClass(), "hitCentralDirectory", false);
        setField(term39439, term39439.getClass(), "lastStoredEntry", null);
        setBooleanField(term39439, term39439.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term39439, term39439.getClass(), "LFH_BUF", null);
        setField(term39439, term39439.getClass(), "SKIP_BUF", null);
        setField(term39439, term39439.getClass(), "SHORT_BUF", null);
        setField(term39439, term39439.getClass(), "WORD_BUF", null);
        setField(term39439, term39439.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term39439, term39439.getClass(), "entriesRead", 0);
        setField(term39439, term39439.getClass(), "SINGLE", null);
        setLongField(term39439, term39439.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readStoredEntry", argTypes, term39439, args);
    }

};


