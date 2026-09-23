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

public class DumpArchiveInputStream_close_946491120144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96606;
     Object term96917;

    public DumpArchiveInputStream_close_946491120144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96606 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term96728 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term96864 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setBooleanField(term96606, term96606.getClass(), "isClosed", false);
        setBooleanField(term96864, term96864.getClass(), "isClosed", true);
        setField(term96728, term96728.getClass(), "in", term96864);
        setField(term96606, term96606.getClass(), "raw", term96728);
        term96917 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term96918 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term96919 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term96917, term96917.getClass(), "summary", null);
        setField(term96917, term96917.getClass(), "active", null);
        setBooleanField(term96917, term96917.getClass(), "isClosed", true);
        setBooleanField(term96917, term96917.getClass(), "hasHitEOF", false);
        setLongField(term96917, term96917.getClass(), "entrySize", 0L);
        setLongField(term96917, term96917.getClass(), "entryOffset", 0L);
        setIntField(term96917, term96917.getClass(), "readIdx", 0);
        setField(term96917, term96917.getClass(), "readBuf", null);
        setField(term96917, term96917.getClass(), "blockBuffer", null);
        setIntField(term96917, term96917.getClass(), "recordOffset", 0);
        setLongField(term96917, term96917.getClass(), "filepos", 0L);
        setField(term96918, term96918.getClass(), "blockBuffer", null);
        setIntField(term96918, term96918.getClass(), "currBlkIdx", 0);
        setIntField(term96918, term96918.getClass(), "blockSize", 0);
        setIntField(term96918, term96918.getClass(), "readOffset", 0);
        setBooleanField(term96918, term96918.getClass(), "isCompressed", false);
        setLongField(term96918, term96918.getClass(), "bytesRead", 0L);
        setField(term96919, term96919.getClass(), "summary", null);
        setField(term96919, term96919.getClass(), "active", null);
        setBooleanField(term96919, term96919.getClass(), "isClosed", true);
        setBooleanField(term96919, term96919.getClass(), "hasHitEOF", false);
        setLongField(term96919, term96919.getClass(), "entrySize", 0L);
        setLongField(term96919, term96919.getClass(), "entryOffset", 0L);
        setIntField(term96919, term96919.getClass(), "readIdx", 0);
        setField(term96919, term96919.getClass(), "readBuf", null);
        setField(term96919, term96919.getClass(), "blockBuffer", null);
        setIntField(term96919, term96919.getClass(), "recordOffset", 0);
        setLongField(term96919, term96919.getClass(), "filepos", 0L);
        setField(term96919, term96919.getClass(), "raw", null);
        setField(term96919, term96919.getClass(), "names", null);
        setField(term96919, term96919.getClass(), "pending", null);
        setField(term96919, term96919.getClass(), "queue", null);
        setField(term96919, term96919.getClass(), "zipEncoding", null);
        setField(term96919, term96919.getClass(), "SINGLE", null);
        setLongField(term96919, term96919.getClass(), "bytesRead", 0L);
        setField(term96918, term96918.getClass(), "in", term96919);
        setField(term96917, term96917.getClass(), "raw", term96918);
        setField(term96917, term96917.getClass(), "names", null);
        setField(term96917, term96917.getClass(), "pending", null);
        setField(term96917, term96917.getClass(), "queue", null);
        setField(term96917, term96917.getClass(), "zipEncoding", null);
        setField(term96917, term96917.getClass(), "SINGLE", null);
        setLongField(term96917, term96917.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term96606, args);
        assertTrue(recursiveEquals(term96606, term96917));
    }

};


