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

public class ArchiveStreamFactory_createArchiveInputStream_188557935427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5103;
     Object term5195;
     Object term38187;
     Object term38188;
     Object term28166;

    public ArchiveStreamFactory_createArchiveInputStream_188557935427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5103 = newInstance(Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory"));
        term5195 = newInstance(Class.forName("java.io.PipedInputStream"));
        term38187 = newInstance(Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory"));
        term38188 = newInstance(Class.forName("java.io.PipedInputStream"));
        setBooleanField(term38188, term38188.getClass(), "closedByWriter", false);
        setBooleanField(term38188, term38188.getClass(), "closedByReader", false);
        setBooleanField(term38188, term38188.getClass(), "connected", false);
        setField(term38188, term38188.getClass(), "readSide", null);
        setField(term38188, term38188.getClass(), "writeSide", null);
        setField(term38188, term38188.getClass(), "buffer", null);
        setIntField(term38188, term38188.getClass(), "in", 0);
        setIntField(term38188, term38188.getClass(), "out", 0);
        term28166 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term28170 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term28160 = newInstance(Class.forName("java.io.PipedInputStream"));
        byte[] term28171 = (byte[]) newByteArray(10240);
        byte[] term38178 = (byte[]) newByteArray(1);
        setBooleanField(term28166, term28166.getClass(), "hasHitEOF", false);
        setLongField(term28166, term28166.getClass(), "entrySize", 0L);
        setLongField(term28166, term28166.getClass(), "entryOffset", 0L);
        setField(term28166, term28166.getClass(), "readBuf", null);
        setBooleanField(term28160, term28160.getClass(), "closedByWriter", false);
        setBooleanField(term28160, term28160.getClass(), "closedByReader", false);
        setBooleanField(term28160, term28160.getClass(), "connected", false);
        setField(term28160, term28160.getClass(), "readSide", null);
        setField(term28160, term28160.getClass(), "writeSide", null);
        setField(term28160, term28160.getClass(), "buffer", null);
        setIntField(term28160, term28160.getClass(), "in", 0);
        setIntField(term28160, term28160.getClass(), "out", 0);
        setField(term28170, term28170.getClass(), "inStream", term28160);
        setField(term28170, term28170.getClass(), "outStream", null);
        setField(term28170, term28170.getClass(), "blockBuffer", term28171);
        setIntField(term28170, term28170.getClass(), "currBlkIdx", -1);
        setIntField(term28170, term28170.getClass(), "currRecIdx", 20);
        setIntField(term28170, term28170.getClass(), "blockSize", 10240);
        setIntField(term28170, term28170.getClass(), "recordSize", 512);
        setIntField(term28170, term28170.getClass(), "recsPerBlock", 20);
        setField(term28166, term28166.getClass(), "buffer", term28170);
        setField(term28166, term28166.getClass(), "currEntry", null);
        setField(term28166, term28166.getClass(), "SINGLE", term38178);
        setLongField(term28166, term28166.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.io.InputStream");
        Object[] args = new Object[2];
        args[0] = "tar";
        args[1] = term5195;
        Object retValue = callMethod(klass, "createArchiveInputStream", argTypes, term5103, args);
        assertTrue(recursiveEquals(term5103, term38187));
        assertTrue(recursiveEquals(term5195, "tar"));
        assertTrue(recursiveEquals(retValue, term28166));
    }

};


