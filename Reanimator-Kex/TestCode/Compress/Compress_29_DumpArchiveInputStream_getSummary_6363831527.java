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

public class DumpArchiveInputStream_getSummary_6363831527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5621;
     Object term27075;

    public DumpArchiveInputStream_getSummary_6363831527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5621 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term5621, term5621.getClass(), "summary", null);
        setField(term5621, term5621.getClass(), "active", null);
        setBooleanField(term5621, term5621.getClass(), "isClosed", false);
        setBooleanField(term5621, term5621.getClass(), "hasHitEOF", false);
        setLongField(term5621, term5621.getClass(), "entrySize", 0L);
        setLongField(term5621, term5621.getClass(), "entryOffset", 0L);
        setIntField(term5621, term5621.getClass(), "readIdx", 0);
        setField(term5621, term5621.getClass(), "readBuf", null);
        setField(term5621, term5621.getClass(), "blockBuffer", null);
        setIntField(term5621, term5621.getClass(), "recordOffset", 0);
        setLongField(term5621, term5621.getClass(), "filepos", 0L);
        setField(term5621, term5621.getClass(), "raw", null);
        setField(term5621, term5621.getClass(), "names", null);
        setField(term5621, term5621.getClass(), "pending", null);
        setField(term5621, term5621.getClass(), "queue", null);
        setField(term5621, term5621.getClass(), "zipEncoding", null);
        setField(term5621, term5621.getClass(), "SINGLE", null);
        setLongField(term5621, term5621.getClass(), "bytesRead", 0L);
        term27075 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term27075, term27075.getClass(), "summary", null);
        setField(term27075, term27075.getClass(), "active", null);
        setBooleanField(term27075, term27075.getClass(), "isClosed", false);
        setBooleanField(term27075, term27075.getClass(), "hasHitEOF", false);
        setLongField(term27075, term27075.getClass(), "entrySize", 0L);
        setLongField(term27075, term27075.getClass(), "entryOffset", 0L);
        setIntField(term27075, term27075.getClass(), "readIdx", 0);
        setField(term27075, term27075.getClass(), "readBuf", null);
        setField(term27075, term27075.getClass(), "blockBuffer", null);
        setIntField(term27075, term27075.getClass(), "recordOffset", 0);
        setLongField(term27075, term27075.getClass(), "filepos", 0L);
        setField(term27075, term27075.getClass(), "raw", null);
        setField(term27075, term27075.getClass(), "names", null);
        setField(term27075, term27075.getClass(), "pending", null);
        setField(term27075, term27075.getClass(), "queue", null);
        setField(term27075, term27075.getClass(), "zipEncoding", null);
        setField(term27075, term27075.getClass(), "SINGLE", null);
        setLongField(term27075, term27075.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSummary", argTypes, term5621, args);
        assertTrue(recursiveEquals(term5621, term27075));
        assertTrue(recursiveEquals(retValue, null));
    }

};


