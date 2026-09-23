package org.apache.commons.compress.archivers.tar;

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
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.tar.EqualityUtils.*;
import java.lang.Object;

public class TarArchiveOutputStream_flush_287142803165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282223;
     Object term283112;

    public TarArchiveOutputStream_flush_287142803165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282223 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term282357 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term282509 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        setField(term282357, term282357.getClass(), "out", term282509);
        setField(term282223, term282223.getClass(), "out", term282357);
        term283112 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term283113 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term283114 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        setLongField(term283112, term283112.getClass(), "currSize", 0L);
        setField(term283112, term283112.getClass(), "currName", null);
        setLongField(term283112, term283112.getClass(), "currBytes", 0L);
        setField(term283112, term283112.getClass(), "recordBuf", null);
        setIntField(term283112, term283112.getClass(), "assemLen", 0);
        setField(term283112, term283112.getClass(), "assemBuf", null);
        setField(term283112, term283112.getClass(), "buffer", null);
        setIntField(term283112, term283112.getClass(), "longFileMode", 0);
        setIntField(term283112, term283112.getClass(), "bigNumberMode", 0);
        setBooleanField(term283112, term283112.getClass(), "closed", false);
        setBooleanField(term283112, term283112.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term283112, term283112.getClass(), "finished", false);
        setLongField(term283113, term283113.getClass(), "currSize", 0L);
        setField(term283113, term283113.getClass(), "currName", null);
        setLongField(term283113, term283113.getClass(), "currBytes", 0L);
        setField(term283113, term283113.getClass(), "recordBuf", null);
        setIntField(term283113, term283113.getClass(), "assemLen", 0);
        setField(term283113, term283113.getClass(), "assemBuf", null);
        setField(term283113, term283113.getClass(), "buffer", null);
        setIntField(term283113, term283113.getClass(), "longFileMode", 0);
        setIntField(term283113, term283113.getClass(), "bigNumberMode", 0);
        setBooleanField(term283113, term283113.getClass(), "closed", false);
        setBooleanField(term283113, term283113.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term283113, term283113.getClass(), "finished", false);
        setIntField(term283114, term283114.getClass(), "last", 0);
        setIntField(term283114, term283114.getClass(), "blockSize100k", 0);
        setIntField(term283114, term283114.getClass(), "bsBuff", 0);
        setIntField(term283114, term283114.getClass(), "bsLive", 0);
        setField(term283114, term283114.getClass(), "crc", null);
        setIntField(term283114, term283114.getClass(), "nInUse", 0);
        setIntField(term283114, term283114.getClass(), "nMTF", 0);
        setIntField(term283114, term283114.getClass(), "currentChar", 0);
        setIntField(term283114, term283114.getClass(), "runLength", 0);
        setIntField(term283114, term283114.getClass(), "blockCRC", 0);
        setIntField(term283114, term283114.getClass(), "combinedCRC", 0);
        setIntField(term283114, term283114.getClass(), "allowableBlockSize", 0);
        setField(term283114, term283114.getClass(), "data", null);
        setField(term283114, term283114.getClass(), "blockSorter", null);
        setField(term283114, term283114.getClass(), "out", null);
        setField(term283113, term283113.getClass(), "out", term283114);
        setField(term283113, term283113.getClass(), "encoding", null);
        setBooleanField(term283113, term283113.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term283113, term283113.getClass(), "oneByte", null);
        setLongField(term283113, term283113.getClass(), "bytesWritten", 0L);
        setField(term283112, term283112.getClass(), "out", term283113);
        setField(term283112, term283112.getClass(), "encoding", null);
        setBooleanField(term283112, term283112.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term283112, term283112.getClass(), "oneByte", null);
        setLongField(term283112, term283112.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "flush", argTypes, term282223, args);
        assertTrue(recursiveEquals(term282223, term283112));
    }

};


