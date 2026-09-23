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

public class ZipArchiveInputStream_findEocdRecord_66249418569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63035;

    public ZipArchiveInputStream_findEocdRecord_66249418569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63035 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term63035, term63035.getClass(), "zipEncoding", null);
        setField(term63035, term63035.getClass(), "encoding", null);
        setBooleanField(term63035, term63035.getClass(), "useUnicodeExtraFields", false);
        setField(term63035, term63035.getClass(), "in", null);
        setField(term63035, term63035.getClass(), "inf", null);
        setField(term63035, term63035.getClass(), "buf", null);
        setField(term63035, term63035.getClass(), "current", null);
        setBooleanField(term63035, term63035.getClass(), "closed", false);
        setBooleanField(term63035, term63035.getClass(), "hitCentralDirectory", false);
        setField(term63035, term63035.getClass(), "lastStoredEntry", null);
        setBooleanField(term63035, term63035.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term63035, term63035.getClass(), "lfhBuf", null);
        setField(term63035, term63035.getClass(), "skipBuf", null);
        setField(term63035, term63035.getClass(), "shortBuf", null);
        setField(term63035, term63035.getClass(), "wordBuf", null);
        setField(term63035, term63035.getClass(), "twoDwordBuf", null);
        setIntField(term63035, term63035.getClass(), "entriesRead", 0);
        setField(term63035, term63035.getClass(), "single", null);
        setLongField(term63035, term63035.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findEocdRecord", argTypes, term63035, args);
    }

};


