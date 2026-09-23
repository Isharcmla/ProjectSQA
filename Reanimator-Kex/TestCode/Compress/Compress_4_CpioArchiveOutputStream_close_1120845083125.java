package org.apache.commons.compress.archivers.cpio;

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
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.cpio.EqualityUtils.*;
import java.lang.Object;

public class CpioArchiveOutputStream_close_1120845083125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42156;
     Object term60112;

    public CpioArchiveOutputStream_close_1120845083125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42156 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term42308 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        setBooleanField(term42156, term42156.getClass(), "closed", false);
        setBooleanField(term42156, term42156.getClass(), "finished", true);
        setField(term42156, term42156.getClass(), "out", term42308);
        term60112 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term60113 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        setField(term60112, term60112.getClass(), "entry", null);
        setBooleanField(term60112, term60112.getClass(), "closed", true);
        setBooleanField(term60112, term60112.getClass(), "finished", true);
        setShortField(term60112, term60112.getClass(), "entryFormat", (short) 0);
        setField(term60112, term60112.getClass(), "names", null);
        setLongField(term60112, term60112.getClass(), "crc", 0L);
        setLongField(term60112, term60112.getClass(), "written", 0L);
        setIntField(term60113, term60113.getClass(), "last", 0);
        setIntField(term60113, term60113.getClass(), "origPtr", 0);
        setIntField(term60113, term60113.getClass(), "blockSize100k", 0);
        setBooleanField(term60113, term60113.getClass(), "blockRandomised", false);
        setIntField(term60113, term60113.getClass(), "bsBuff", 0);
        setIntField(term60113, term60113.getClass(), "bsLive", 0);
        setField(term60113, term60113.getClass(), "crc", null);
        setIntField(term60113, term60113.getClass(), "nInUse", 0);
        setIntField(term60113, term60113.getClass(), "nMTF", 0);
        setIntField(term60113, term60113.getClass(), "workDone", 0);
        setIntField(term60113, term60113.getClass(), "workLimit", 0);
        setBooleanField(term60113, term60113.getClass(), "firstAttempt", false);
        setIntField(term60113, term60113.getClass(), "currentChar", 0);
        setIntField(term60113, term60113.getClass(), "runLength", 0);
        setIntField(term60113, term60113.getClass(), "blockCRC", 0);
        setIntField(term60113, term60113.getClass(), "combinedCRC", 0);
        setIntField(term60113, term60113.getClass(), "allowableBlockSize", 0);
        setField(term60113, term60113.getClass(), "data", null);
        setField(term60113, term60113.getClass(), "out", null);
        setField(term60112, term60112.getClass(), "out", term60113);
        setField(term60112, term60112.getClass(), "oneByte", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term42156, args);
        assertTrue(recursiveEquals(term42156, term60112));
    }

};


