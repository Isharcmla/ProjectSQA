package org.apache.commons.compress.archivers;

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
import static org.apache.commons.compress.archivers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.EqualityUtils.*;
import java.lang.Object;

public class ArchiveStreamFactory_createArchiveInputStream_198450842539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56084;
     Object term56146;
     Object term132166;
     Object term132167;
     Object term122150;

    public ArchiveStreamFactory_createArchiveInputStream_198450842539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56084 = newInstance(Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory"));
        term56146 = newInstance(Class.forName("java.io.ByteArrayInputStream"));
        term132166 = newInstance(Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory"));
        term132167 = newInstance(Class.forName("java.io.ByteArrayInputStream"));
        setField(term132167, term132167.getClass(), "buf", null);
        setIntField(term132167, term132167.getClass(), "pos", 0);
        setIntField(term132167, term132167.getClass(), "mark", 0);
        setIntField(term132167, term132167.getClass(), "count", 0);
        term122150 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term122154 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term122146 = newInstance(Class.forName("java.io.ByteArrayInputStream"));
        byte[] term122155 = (byte[]) newByteArray(10240);
        byte[] term132162 = (byte[]) newByteArray(1);
        setBooleanField(term122150, term122150.getClass(), "hasHitEOF", false);
        setLongField(term122150, term122150.getClass(), "entrySize", 0L);
        setLongField(term122150, term122150.getClass(), "entryOffset", 0L);
        setField(term122150, term122150.getClass(), "readBuf", null);
        setField(term122146, term122146.getClass(), "buf", null);
        setIntField(term122146, term122146.getClass(), "pos", 0);
        setIntField(term122146, term122146.getClass(), "mark", 0);
        setIntField(term122146, term122146.getClass(), "count", 0);
        setField(term122154, term122154.getClass(), "inStream", term122146);
        setField(term122154, term122154.getClass(), "outStream", null);
        setField(term122154, term122154.getClass(), "blockBuffer", term122155);
        setIntField(term122154, term122154.getClass(), "currBlkIdx", -1);
        setIntField(term122154, term122154.getClass(), "currRecIdx", 20);
        setIntField(term122154, term122154.getClass(), "blockSize", 10240);
        setIntField(term122154, term122154.getClass(), "recordSize", 512);
        setIntField(term122154, term122154.getClass(), "recsPerBlock", 20);
        setField(term122150, term122150.getClass(), "buffer", term122154);
        setField(term122150, term122150.getClass(), "currEntry", null);
        setField(term122150, term122150.getClass(), "SINGLE", term132162);
        setLongField(term122150, term122150.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = term56146;
        Object retValue = callMethod(klass, "createArchiveInputStream", argTypes, term56084, args);
        assertTrue(recursiveEquals(term56084, term132166));
        assertTrue(recursiveEquals(term56146, term132167));
        assertTrue(recursiveEquals(retValue, term122150));
    }

};


