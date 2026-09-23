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

public class DumpArchiveInputStream_getNextEntry_133083675284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58638;
     Object term58714;

    public DumpArchiveInputStream_getNextEntry_133083675284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term58692 = new LinkedList();
        term58638 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term58638, term58638.getClass(), "queue", term58692);
        setBooleanField(term58638, term58638.getClass(), "hasHitEOF", true);
        LinkedList term58715 = new LinkedList();
        term58714 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term58714, term58714.getClass(), "summary", null);
        setField(term58714, term58714.getClass(), "active", null);
        setBooleanField(term58714, term58714.getClass(), "isClosed", false);
        setBooleanField(term58714, term58714.getClass(), "hasHitEOF", true);
        setLongField(term58714, term58714.getClass(), "entrySize", 0L);
        setLongField(term58714, term58714.getClass(), "entryOffset", 0L);
        setIntField(term58714, term58714.getClass(), "readIdx", 0);
        setField(term58714, term58714.getClass(), "readBuf", null);
        setField(term58714, term58714.getClass(), "blockBuffer", null);
        setIntField(term58714, term58714.getClass(), "recordOffset", 0);
        setLongField(term58714, term58714.getClass(), "filepos", 0L);
        setField(term58714, term58714.getClass(), "raw", null);
        setField(term58714, term58714.getClass(), "names", null);
        setField(term58714, term58714.getClass(), "pending", null);
        setField(term58714, term58714.getClass(), "queue", term58715);
        setField(term58714, term58714.getClass(), "zipEncoding", null);
        setField(term58714, term58714.getClass(), "SINGLE", null);
        setLongField(term58714, term58714.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNextEntry", argTypes, term58638, args);
        assertTrue(recursiveEquals(term58638, term58714));
        assertTrue(recursiveEquals(retValue, null));
    }

};


