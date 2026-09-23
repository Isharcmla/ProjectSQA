package org.apache.commons.compress.archivers.dump;

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
import static org.apache.commons.compress.archivers.dump.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.dump.EqualityUtils.*;
import java.util.LinkedList;

public class DumpArchiveInputStream_getNextDumpEntry_89213874877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56564;
     Object term56975;

    public DumpArchiveInputStream_getNextDumpEntry_89213874877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term56618 = new LinkedList();
        term56564 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term56564, term56564.getClass(), "queue", term56618);
        setBooleanField(term56564, term56564.getClass(), "hasHitEOF", true);
        LinkedList term56976 = new LinkedList();
        term56975 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term56975, term56975.getClass(), "summary", null);
        setField(term56975, term56975.getClass(), "active", null);
        setBooleanField(term56975, term56975.getClass(), "isClosed", false);
        setBooleanField(term56975, term56975.getClass(), "hasHitEOF", true);
        setLongField(term56975, term56975.getClass(), "entrySize", 0L);
        setLongField(term56975, term56975.getClass(), "entryOffset", 0L);
        setIntField(term56975, term56975.getClass(), "readIdx", 0);
        setField(term56975, term56975.getClass(), "readBuf", null);
        setField(term56975, term56975.getClass(), "blockBuffer", null);
        setIntField(term56975, term56975.getClass(), "recordOffset", 0);
        setLongField(term56975, term56975.getClass(), "filepos", 0L);
        setField(term56975, term56975.getClass(), "raw", null);
        setField(term56975, term56975.getClass(), "names", null);
        setField(term56975, term56975.getClass(), "pending", null);
        setField(term56975, term56975.getClass(), "queue", term56976);
        setField(term56975, term56975.getClass(), "zipEncoding", null);
        setField(term56975, term56975.getClass(), "SINGLE", null);
        setLongField(term56975, term56975.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNextDumpEntry", argTypes, term56564, args);
        assertTrue(recursiveEquals(term56564, term56975));
        assertTrue(recursiveEquals(retValue, null));
    }

};


