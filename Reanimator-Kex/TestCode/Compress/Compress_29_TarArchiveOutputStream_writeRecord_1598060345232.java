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

public class TarArchiveOutputStream_writeRecord_1598060345232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132590;
     Object term131678;
     Object term134773;
     Object term134776;

    public TarArchiveOutputStream_writeRecord_1598060345232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132590 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term132742 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term132894 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        setIntField(term132590, term132590.getClass(), "recordSize", 1081981953);
        setField(term132742, term132742.getClass(), "out", term132894);
        setField(term132590, term132590.getClass(), "out", term132742);
        term131678 = (byte[]) newByteArray(744);
        term134773 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term134774 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term134775 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        setLongField(term134773, term134773.getClass(), "currSize", 0L);
        setField(term134773, term134773.getClass(), "currName", null);
        setLongField(term134773, term134773.getClass(), "currBytes", 0L);
        setField(term134773, term134773.getClass(), "recordBuf", null);
        setIntField(term134773, term134773.getClass(), "assemLen", 0);
        setField(term134773, term134773.getClass(), "assemBuf", null);
        setIntField(term134773, term134773.getClass(), "longFileMode", 0);
        setIntField(term134773, term134773.getClass(), "bigNumberMode", 0);
        setIntField(term134773, term134773.getClass(), "recordsWritten", 1);
        setIntField(term134773, term134773.getClass(), "recordsPerBlock", 0);
        setIntField(term134773, term134773.getClass(), "recordSize", 1081981953);
        setBooleanField(term134773, term134773.getClass(), "closed", false);
        setBooleanField(term134773, term134773.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term134773, term134773.getClass(), "finished", false);
        setIntField(term134774, term134774.getClass(), "last", 0);
        setIntField(term134774, term134774.getClass(), "blockSize100k", 0);
        setIntField(term134774, term134774.getClass(), "bsBuff", 0);
        setIntField(term134774, term134774.getClass(), "bsLive", 0);
        setField(term134774, term134774.getClass(), "crc", null);
        setIntField(term134774, term134774.getClass(), "nInUse", 0);
        setIntField(term134774, term134774.getClass(), "nMTF", 0);
        setIntField(term134774, term134774.getClass(), "currentChar", 0);
        setIntField(term134774, term134774.getClass(), "runLength", 0);
        setIntField(term134774, term134774.getClass(), "blockCRC", 0);
        setIntField(term134774, term134774.getClass(), "combinedCRC", 0);
        setIntField(term134774, term134774.getClass(), "allowableBlockSize", 0);
        setField(term134774, term134774.getClass(), "data", null);
        setField(term134774, term134774.getClass(), "blockSorter", null);
        setIntField(term134775, term134775.getClass(), "last", 0);
        setIntField(term134775, term134775.getClass(), "blockSize100k", 0);
        setIntField(term134775, term134775.getClass(), "bsBuff", 0);
        setIntField(term134775, term134775.getClass(), "bsLive", 0);
        setField(term134775, term134775.getClass(), "crc", null);
        setIntField(term134775, term134775.getClass(), "nInUse", 0);
        setIntField(term134775, term134775.getClass(), "nMTF", 0);
        setIntField(term134775, term134775.getClass(), "currentChar", 0);
        setIntField(term134775, term134775.getClass(), "runLength", 0);
        setIntField(term134775, term134775.getClass(), "blockCRC", 0);
        setIntField(term134775, term134775.getClass(), "combinedCRC", 0);
        setIntField(term134775, term134775.getClass(), "allowableBlockSize", 0);
        setField(term134775, term134775.getClass(), "data", null);
        setField(term134775, term134775.getClass(), "blockSorter", null);
        setField(term134775, term134775.getClass(), "out", null);
        setField(term134774, term134774.getClass(), "out", term134775);
        setField(term134773, term134773.getClass(), "out", term134774);
        setField(term134773, term134773.getClass(), "zipEncoding", null);
        setBooleanField(term134773, term134773.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term134773, term134773.getClass(), "oneByte", null);
        setLongField(term134773, term134773.getClass(), "bytesWritten", 0L);
        term134776 = (byte[]) newByteArray(744);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term131678;
        args[1] = 1067160583;
        callMethod(klass, "writeRecord", argTypes, term132590, args);
        assertTrue(recursiveEquals(term132590, term134773));
        assertTrue(recursiveEquals(term131678, term134776));
    }

};


