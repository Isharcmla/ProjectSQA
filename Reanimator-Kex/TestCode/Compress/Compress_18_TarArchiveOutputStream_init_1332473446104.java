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

public class TarArchiveOutputStream_init_1332473446104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249211;

    public TarArchiveOutputStream_init_1332473446104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term225725 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term225550 = (byte[]) newByteArray(0);
        setField(term225725, term225725.getClass(), "oneByte", term225550);
        setLongField(term225725, term225725.getClass(), "bytesWritten", 0L);
        setIntField(term225725, term225725.getClass(), "longFileMode", 0);
        setIntField(term225725, term225725.getClass(), "bigNumberMode", 0);
        setBooleanField(term225725, term225725.getClass(), "closed", false);
        setBooleanField(term225725, term225725.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term225725, term225725.getClass(), "finished", false);
        setBooleanField(term225725, term225725.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term225725, term225725.getClass(), "out", null);
        term249211 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term249212 = (byte[]) newByteArray(512);
        byte[] term249213 = (byte[]) newByteArray(512);
        Object term249214 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term249215 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term249216 = newInstance(Class.forName("java.lang.Object"));
        byte[] term249217 = (byte[]) newByteArray(10240);
        Object term249218 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term249221 = (byte[]) newByteArray(1);
        setLongField(term249211, term249211.getClass(), "currSize", 0L);
        setField(term249211, term249211.getClass(), "currName", null);
        setLongField(term249211, term249211.getClass(), "currBytes", 0L);
        setField(term249211, term249211.getClass(), "recordBuf", term249212);
        setIntField(term249211, term249211.getClass(), "assemLen", 0);
        setField(term249211, term249211.getClass(), "assemBuf", term249213);
        setField(term249214, term249214.getClass(), "inStream", null);
        setLongField(term249215, term249215.getClass(), "bytesWritten", 0L);
        setField(term249215, term249215.getClass(), "out", null);
        setBooleanField(term249215, term249215.getClass(), "closed", false);
        setField(term249215, term249215.getClass(), "closeLock", term249216);
        setField(term249214, term249214.getClass(), "outStream", term249215);
        setIntField(term249214, term249214.getClass(), "blockSize", 10240);
        setIntField(term249214, term249214.getClass(), "recordSize", 512);
        setIntField(term249214, term249214.getClass(), "recsPerBlock", 20);
        setField(term249214, term249214.getClass(), "blockBuffer", term249217);
        setIntField(term249214, term249214.getClass(), "currBlkIdx", 0);
        setIntField(term249214, term249214.getClass(), "currRecIdx", 0);
        setField(term249211, term249211.getClass(), "buffer", term249214);
        setIntField(term249211, term249211.getClass(), "longFileMode", 0);
        setIntField(term249211, term249211.getClass(), "bigNumberMode", 0);
        setBooleanField(term249211, term249211.getClass(), "closed", false);
        setBooleanField(term249211, term249211.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term249211, term249211.getClass(), "finished", false);
        setField(term249211, term249211.getClass(), "out", term249215);
        setField(term249218, term249218.getClass(), "charset", "UTF8");
        setField(term249211, term249211.getClass(), "encoding", term249218);
        setBooleanField(term249211, term249211.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term249211, term249211.getClass(), "oneByte", term249221);
        setLongField(term249211, term249211.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.OutputStream");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term249211));
    }

};


