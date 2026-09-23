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
import java.lang.Integer;
import java.lang.Object;

public class TarArchiveOutputStream_init_180358371129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;
     Object term120620;

    public TarArchiveOutputStream_init_180358371129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25 = new Integer(1162663216);
        term120620 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term120621 = (byte[]) newByteArray(512);
        byte[] term120622 = (byte[]) newByteArray(512);
        Object term120623 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term120624 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term120625 = newInstance(Class.forName("java.lang.Object"));
        byte[] term120626 = (byte[]) newByteArray(1162663216);
        Object term120627 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term120630 = (byte[]) newByteArray(1);
        setLongField(term120620, term120620.getClass(), "currSize", 0L);
        setField(term120620, term120620.getClass(), "currName", null);
        setLongField(term120620, term120620.getClass(), "currBytes", 0L);
        setField(term120620, term120620.getClass(), "recordBuf", term120621);
        setIntField(term120620, term120620.getClass(), "assemLen", 0);
        setField(term120620, term120620.getClass(), "assemBuf", term120622);
        setField(term120623, term120623.getClass(), "inStream", null);
        setLongField(term120624, term120624.getClass(), "bytesWritten", 0L);
        setField(term120624, term120624.getClass(), "out", null);
        setBooleanField(term120624, term120624.getClass(), "closed", false);
        setField(term120624, term120624.getClass(), "closeLock", term120625);
        setField(term120623, term120623.getClass(), "outStream", term120624);
        setIntField(term120623, term120623.getClass(), "blockSize", 1162663216);
        setIntField(term120623, term120623.getClass(), "recordSize", 512);
        setIntField(term120623, term120623.getClass(), "recsPerBlock", 2270826);
        setField(term120623, term120623.getClass(), "blockBuffer", term120626);
        setIntField(term120623, term120623.getClass(), "currBlkIdx", 0);
        setIntField(term120623, term120623.getClass(), "currRecIdx", 0);
        setField(term120620, term120620.getClass(), "buffer", term120623);
        setIntField(term120620, term120620.getClass(), "longFileMode", 0);
        setIntField(term120620, term120620.getClass(), "bigNumberMode", 0);
        setBooleanField(term120620, term120620.getClass(), "closed", false);
        setBooleanField(term120620, term120620.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term120620, term120620.getClass(), "finished", false);
        setField(term120620, term120620.getClass(), "out", term120624);
        setField(term120627, term120627.getClass(), "charset", "sjlJAEtRrb");
        setField(term120620, term120620.getClass(), "encoding", term120627);
        setBooleanField(term120620, term120620.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term120620, term120620.getClass(), "oneByte", term120630);
        setLongField(term120620, term120620.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term25;
        args[2] = "sjlJAEtRrb";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term120620));
        assertTrue(recursiveEquals(term25, "sjlJAEtRrb"));
    }

};


