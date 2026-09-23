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

public class TarArchiveOutputStream_init_123922963028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term88225;

    public TarArchiveOutputStream_init_123922963028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = new Integer(568599855);
        term88225 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term88226 = (byte[]) newByteArray(512);
        byte[] term88227 = (byte[]) newByteArray(512);
        Object term88228 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term88229 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term88230 = newInstance(Class.forName("java.lang.Object"));
        byte[] term88231 = (byte[]) newByteArray(568599855);
        Object term88232 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term88235 = (byte[]) newByteArray(1);
        setLongField(term88225, term88225.getClass(), "currSize", 0L);
        setField(term88225, term88225.getClass(), "currName", null);
        setLongField(term88225, term88225.getClass(), "currBytes", 0L);
        setField(term88225, term88225.getClass(), "recordBuf", term88226);
        setIntField(term88225, term88225.getClass(), "assemLen", 0);
        setField(term88225, term88225.getClass(), "assemBuf", term88227);
        setField(term88228, term88228.getClass(), "inStream", null);
        setLongField(term88229, term88229.getClass(), "bytesWritten", 0L);
        setField(term88229, term88229.getClass(), "out", null);
        setBooleanField(term88229, term88229.getClass(), "closed", false);
        setField(term88229, term88229.getClass(), "closeLock", term88230);
        setField(term88228, term88228.getClass(), "outStream", term88229);
        setIntField(term88228, term88228.getClass(), "blockSize", 568599855);
        setIntField(term88228, term88228.getClass(), "recordSize", 512);
        setIntField(term88228, term88228.getClass(), "recsPerBlock", 1110546);
        setField(term88228, term88228.getClass(), "blockBuffer", term88231);
        setIntField(term88228, term88228.getClass(), "currBlkIdx", 0);
        setIntField(term88228, term88228.getClass(), "currRecIdx", 0);
        setField(term88225, term88225.getClass(), "buffer", term88228);
        setIntField(term88225, term88225.getClass(), "longFileMode", 0);
        setIntField(term88225, term88225.getClass(), "bigNumberMode", 0);
        setBooleanField(term88225, term88225.getClass(), "closed", false);
        setBooleanField(term88225, term88225.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term88225, term88225.getClass(), "finished", false);
        setField(term88225, term88225.getClass(), "out", term88229);
        setField(term88232, term88232.getClass(), "charset", "UTF8");
        setField(term88225, term88225.getClass(), "encoding", term88232);
        setBooleanField(term88225, term88225.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term88225, term88225.getClass(), "oneByte", term88235);
        setLongField(term88225, term88225.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term23;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term88225));
        assertTrue(recursiveEquals(term23, 568599855));
    }

};


