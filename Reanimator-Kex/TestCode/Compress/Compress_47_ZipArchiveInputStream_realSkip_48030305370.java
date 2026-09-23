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

public class ZipArchiveInputStream_realSkip_48030305370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63042;
     Object term63049;

    public ZipArchiveInputStream_realSkip_48030305370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63042 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        setField(term63042, term63042.getClass(), "zipEncoding", null);
        setField(term63042, term63042.getClass(), "encoding", null);
        setBooleanField(term63042, term63042.getClass(), "useUnicodeExtraFields", false);
        setField(term63042, term63042.getClass(), "in", null);
        setField(term63042, term63042.getClass(), "inf", null);
        setField(term63042, term63042.getClass(), "buf", null);
        setField(term63042, term63042.getClass(), "current", null);
        setBooleanField(term63042, term63042.getClass(), "closed", false);
        setBooleanField(term63042, term63042.getClass(), "hitCentralDirectory", false);
        setField(term63042, term63042.getClass(), "lastStoredEntry", null);
        setBooleanField(term63042, term63042.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term63042, term63042.getClass(), "lfhBuf", null);
        setField(term63042, term63042.getClass(), "skipBuf", null);
        setField(term63042, term63042.getClass(), "shortBuf", null);
        setField(term63042, term63042.getClass(), "wordBuf", null);
        setField(term63042, term63042.getClass(), "twoDwordBuf", null);
        setIntField(term63042, term63042.getClass(), "entriesRead", 0);
        setField(term63042, term63042.getClass(), "single", null);
        setLongField(term63042, term63042.getClass(), "bytesRead", 0L);
        term63049 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term63049;
        callMethod(klass, "realSkip", argTypes, term63042, args);
    }

};


