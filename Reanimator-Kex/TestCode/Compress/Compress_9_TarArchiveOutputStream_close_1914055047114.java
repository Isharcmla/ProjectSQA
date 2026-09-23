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

public class TarArchiveOutputStream_close_1914055047114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96589;
     Object term131122;

    public TarArchiveOutputStream_close_1914055047114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96589 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term96697 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term96849 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        setBooleanField(term96589, term96589.getClass(), "finished", true);
        setBooleanField(term96589, term96589.getClass(), "closed", false);
        setField(term96697, term96697.getClass(), "outStream", null);
        setField(term96697, term96697.getClass(), "inStream", null);
        setField(term96589, term96589.getClass(), "buffer", term96697);
        setField(term96589, term96589.getClass(), "out", term96849);
        term131122 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term131123 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term131124 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        setLongField(term131122, term131122.getClass(), "currSize", 0L);
        setField(term131122, term131122.getClass(), "currName", null);
        setLongField(term131122, term131122.getClass(), "currBytes", 0L);
        setField(term131122, term131122.getClass(), "recordBuf", null);
        setIntField(term131122, term131122.getClass(), "assemLen", 0);
        setField(term131122, term131122.getClass(), "assemBuf", null);
        setField(term131123, term131123.getClass(), "inStream", null);
        setField(term131123, term131123.getClass(), "outStream", null);
        setField(term131123, term131123.getClass(), "blockBuffer", null);
        setIntField(term131123, term131123.getClass(), "currBlkIdx", 0);
        setIntField(term131123, term131123.getClass(), "currRecIdx", 0);
        setIntField(term131123, term131123.getClass(), "blockSize", 0);
        setIntField(term131123, term131123.getClass(), "recordSize", 0);
        setIntField(term131123, term131123.getClass(), "recsPerBlock", 0);
        setField(term131122, term131122.getClass(), "buffer", term131123);
        setIntField(term131122, term131122.getClass(), "longFileMode", 0);
        setBooleanField(term131122, term131122.getClass(), "closed", true);
        setBooleanField(term131122, term131122.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term131122, term131122.getClass(), "finished", true);
        setIntField(term131124, term131124.getClass(), "last", 0);
        setIntField(term131124, term131124.getClass(), "origPtr", 0);
        setIntField(term131124, term131124.getClass(), "blockSize100k", 0);
        setBooleanField(term131124, term131124.getClass(), "blockRandomised", false);
        setIntField(term131124, term131124.getClass(), "bsBuff", 0);
        setIntField(term131124, term131124.getClass(), "bsLive", 0);
        setField(term131124, term131124.getClass(), "crc", null);
        setIntField(term131124, term131124.getClass(), "nInUse", 0);
        setIntField(term131124, term131124.getClass(), "nMTF", 0);
        setIntField(term131124, term131124.getClass(), "workDone", 0);
        setIntField(term131124, term131124.getClass(), "workLimit", 0);
        setBooleanField(term131124, term131124.getClass(), "firstAttempt", false);
        setIntField(term131124, term131124.getClass(), "currentChar", 0);
        setIntField(term131124, term131124.getClass(), "runLength", 0);
        setIntField(term131124, term131124.getClass(), "blockCRC", 0);
        setIntField(term131124, term131124.getClass(), "combinedCRC", 0);
        setIntField(term131124, term131124.getClass(), "allowableBlockSize", 0);
        setField(term131124, term131124.getClass(), "data", null);
        setField(term131124, term131124.getClass(), "out", null);
        setField(term131122, term131122.getClass(), "out", term131124);
        setField(term131122, term131122.getClass(), "oneByte", null);
        setLongField(term131122, term131122.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term96589, args);
        assertTrue(recursiveEquals(term96589, term131122));
    }

};


