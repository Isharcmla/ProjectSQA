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
import java.lang.Object;

public class DumpArchiveInputStream_close_946491120222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219916;
     Object term220985;

    public DumpArchiveInputStream_close_946491120222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term219916 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term220038 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term220174 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term220296 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term220432 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term220554 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setBooleanField(term219916, term219916.getClass(), "isClosed", false);
        setBooleanField(term220174, term220174.getClass(), "isClosed", false);
        setBooleanField(term220432, term220432.getClass(), "isClosed", false);
        setField(term220432, term220432.getClass(), "raw", term220554);
        setField(term220296, term220296.getClass(), "in", term220432);
        setField(term220174, term220174.getClass(), "raw", term220296);
        setField(term220038, term220038.getClass(), "in", term220174);
        setField(term219916, term219916.getClass(), "raw", term220038);
        term220985 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term220986 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term220987 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term220988 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term220989 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term220985, term220985.getClass(), "summary", null);
        setField(term220985, term220985.getClass(), "active", null);
        setBooleanField(term220985, term220985.getClass(), "isClosed", true);
        setBooleanField(term220985, term220985.getClass(), "hasHitEOF", false);
        setLongField(term220985, term220985.getClass(), "entrySize", 0L);
        setLongField(term220985, term220985.getClass(), "entryOffset", 0L);
        setIntField(term220985, term220985.getClass(), "readIdx", 0);
        setField(term220985, term220985.getClass(), "readBuf", null);
        setField(term220985, term220985.getClass(), "blockBuffer", null);
        setIntField(term220985, term220985.getClass(), "recordOffset", 0);
        setLongField(term220985, term220985.getClass(), "filepos", 0L);
        setField(term220986, term220986.getClass(), "blockBuffer", null);
        setIntField(term220986, term220986.getClass(), "currBlkIdx", 0);
        setIntField(term220986, term220986.getClass(), "blockSize", 0);
        setIntField(term220986, term220986.getClass(), "readOffset", 0);
        setBooleanField(term220986, term220986.getClass(), "isCompressed", false);
        setLongField(term220986, term220986.getClass(), "bytesRead", 0L);
        setField(term220987, term220987.getClass(), "summary", null);
        setField(term220987, term220987.getClass(), "active", null);
        setBooleanField(term220987, term220987.getClass(), "isClosed", true);
        setBooleanField(term220987, term220987.getClass(), "hasHitEOF", false);
        setLongField(term220987, term220987.getClass(), "entrySize", 0L);
        setLongField(term220987, term220987.getClass(), "entryOffset", 0L);
        setIntField(term220987, term220987.getClass(), "readIdx", 0);
        setField(term220987, term220987.getClass(), "readBuf", null);
        setField(term220987, term220987.getClass(), "blockBuffer", null);
        setIntField(term220987, term220987.getClass(), "recordOffset", 0);
        setLongField(term220987, term220987.getClass(), "filepos", 0L);
        setField(term220988, term220988.getClass(), "blockBuffer", null);
        setIntField(term220988, term220988.getClass(), "currBlkIdx", 0);
        setIntField(term220988, term220988.getClass(), "blockSize", 0);
        setIntField(term220988, term220988.getClass(), "readOffset", 0);
        setBooleanField(term220988, term220988.getClass(), "isCompressed", false);
        setLongField(term220988, term220988.getClass(), "bytesRead", 0L);
        setField(term220989, term220989.getClass(), "summary", null);
        setField(term220989, term220989.getClass(), "active", null);
        setBooleanField(term220989, term220989.getClass(), "isClosed", true);
        setBooleanField(term220989, term220989.getClass(), "hasHitEOF", false);
        setLongField(term220989, term220989.getClass(), "entrySize", 0L);
        setLongField(term220989, term220989.getClass(), "entryOffset", 0L);
        setIntField(term220989, term220989.getClass(), "readIdx", 0);
        setField(term220989, term220989.getClass(), "readBuf", null);
        setField(term220989, term220989.getClass(), "blockBuffer", null);
        setIntField(term220989, term220989.getClass(), "recordOffset", 0);
        setLongField(term220989, term220989.getClass(), "filepos", 0L);
        setField(term220989, term220989.getClass(), "raw", null);
        setField(term220989, term220989.getClass(), "names", null);
        setField(term220989, term220989.getClass(), "pending", null);
        setField(term220989, term220989.getClass(), "queue", null);
        setField(term220989, term220989.getClass(), "zipEncoding", null);
        setField(term220989, term220989.getClass(), "SINGLE", null);
        setLongField(term220989, term220989.getClass(), "bytesRead", 0L);
        setField(term220988, term220988.getClass(), "in", term220989);
        setField(term220987, term220987.getClass(), "raw", term220988);
        setField(term220987, term220987.getClass(), "names", null);
        setField(term220987, term220987.getClass(), "pending", null);
        setField(term220987, term220987.getClass(), "queue", null);
        setField(term220987, term220987.getClass(), "zipEncoding", null);
        setField(term220987, term220987.getClass(), "SINGLE", null);
        setLongField(term220987, term220987.getClass(), "bytesRead", 0L);
        setField(term220986, term220986.getClass(), "in", term220987);
        setField(term220985, term220985.getClass(), "raw", term220986);
        setField(term220985, term220985.getClass(), "names", null);
        setField(term220985, term220985.getClass(), "pending", null);
        setField(term220985, term220985.getClass(), "queue", null);
        setField(term220985, term220985.getClass(), "zipEncoding", null);
        setField(term220985, term220985.getClass(), "SINGLE", null);
        setLongField(term220985, term220985.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term219916, args);
        assertTrue(recursiveEquals(term219916, term220985));
    }

};


