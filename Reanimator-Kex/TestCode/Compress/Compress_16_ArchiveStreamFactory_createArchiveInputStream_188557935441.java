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

public class ArchiveStreamFactory_createArchiveInputStream_188557935441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64960;
     Object term65062;
     Object term95513;
     Object term95514;
     Object term85485;

    public ArchiveStreamFactory_createArchiveInputStream_188557935441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64960 = newInstance(Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory"));
        term65062 = newInstance(Class.forName("java.util.zip.GZIPInputStream"));
        term95513 = newInstance(Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory"));
        term95514 = newInstance(Class.forName("java.util.zip.GZIPInputStream"));
        setField(term95514, term95514.getClass(), "crc", null);
        setBooleanField(term95514, term95514.getClass(), "eos", false);
        setBooleanField(term95514, term95514.getClass(), "closed", false);
        setField(term95514, term95514.getClass(), "tmpbuf", null);
        setField(term95514, term95514.getClass(), "inf", null);
        setField(term95514, term95514.getClass(), "buf", null);
        setIntField(term95514, term95514.getClass(), "len", 0);
        setBooleanField(term95514, term95514.getClass(), "reachEOF", false);
        setBooleanField(term95514, term95514.getClass(), "usesDefaultInflater", false);
        setField(term95514, term95514.getClass(), "singleByteBuf", null);
        setField(term95514, term95514.getClass(), "b", null);
        setField(term95514, term95514.getClass(), "in", null);
        term85485 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term85489 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term85465 = newInstance(Class.forName("java.util.zip.GZIPInputStream"));
        byte[] term85493 = (byte[]) newByteArray(10240);
        Object term95497 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term95504 = (byte[]) newByteArray(1);
        setBooleanField(term85485, term85485.getClass(), "hasHitEOF", false);
        setLongField(term85485, term85485.getClass(), "entrySize", 0L);
        setLongField(term85485, term85485.getClass(), "entryOffset", 0L);
        setField(term85485, term85485.getClass(), "readBuf", null);
        setField(term85465, term85465.getClass(), "crc", null);
        setBooleanField(term85465, term85465.getClass(), "eos", false);
        setBooleanField(term85465, term85465.getClass(), "closed", false);
        setField(term85465, term85465.getClass(), "tmpbuf", null);
        setField(term85465, term85465.getClass(), "inf", null);
        setField(term85465, term85465.getClass(), "buf", null);
        setIntField(term85465, term85465.getClass(), "len", 0);
        setBooleanField(term85465, term85465.getClass(), "reachEOF", false);
        setBooleanField(term85465, term85465.getClass(), "usesDefaultInflater", false);
        setField(term85465, term85465.getClass(), "singleByteBuf", null);
        setField(term85465, term85465.getClass(), "b", null);
        setField(term85465, term85465.getClass(), "in", null);
        setField(term85489, term85489.getClass(), "inStream", term85465);
        setField(term85489, term85489.getClass(), "outStream", null);
        setIntField(term85489, term85489.getClass(), "blockSize", 10240);
        setIntField(term85489, term85489.getClass(), "recordSize", 512);
        setIntField(term85489, term85489.getClass(), "recsPerBlock", 20);
        setField(term85489, term85489.getClass(), "blockBuffer", term85493);
        setIntField(term85489, term85489.getClass(), "currBlkIdx", -1);
        setIntField(term85489, term85489.getClass(), "currRecIdx", 20);
        setField(term85485, term85485.getClass(), "buffer", term85489);
        setField(term85485, term85485.getClass(), "currEntry", null);
        setField(term95497, term95497.getClass(), "charset", "UTF8");
        setField(term85485, term85485.getClass(), "encoding", term95497);
        setField(term85485, term85485.getClass(), "SINGLE", term95504);
        setLongField(term85485, term85485.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ArchiveStreamFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.io.InputStream");
        Object[] args = new Object[2];
        args[0] = "tar";
        args[1] = term65062;
        Object retValue = callMethod(klass, "createArchiveInputStream", argTypes, term64960, args);
        assertTrue(recursiveEquals(term64960, term95513));
        assertTrue(recursiveEquals(term65062, "tar"));
        assertTrue(recursiveEquals(retValue, term85485));
    }

};


