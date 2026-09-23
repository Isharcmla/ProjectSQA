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

public class TarArchiveOutputStream_init_1239229630102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225472;
     Object term226822;
     Object term226834;

    public TarArchiveOutputStream_init_1239229630102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term225358 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setField(term225358, term225358.getClass(), "oneByte", null);
        setLongField(term225358, term225358.getClass(), "bytesWritten", 0L);
        setIntField(term225358, term225358.getClass(), "longFileMode", 0);
        setIntField(term225358, term225358.getClass(), "bigNumberMode", 0);
        setBooleanField(term225358, term225358.getClass(), "closed", false);
        setBooleanField(term225358, term225358.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term225358, term225358.getClass(), "finished", false);
        setBooleanField(term225358, term225358.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term225358, term225358.getClass(), "out", null);
        setField(term225358, term225358.getClass(), "encoding", null);
        term225472 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        term226822 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term226823 = (byte[]) newByteArray(512);
        byte[] term226824 = (byte[]) newByteArray(512);
        Object term226825 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term226826 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term226827 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term226828 = newInstance(Class.forName("java.lang.Object"));
        byte[] term226829 = (byte[]) newByteArray(0);
        Object term226830 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term226833 = (byte[]) newByteArray(1);
        setLongField(term226822, term226822.getClass(), "currSize", 0L);
        setField(term226822, term226822.getClass(), "currName", null);
        setLongField(term226822, term226822.getClass(), "currBytes", 0L);
        setField(term226822, term226822.getClass(), "recordBuf", term226823);
        setIntField(term226822, term226822.getClass(), "assemLen", 0);
        setField(term226822, term226822.getClass(), "assemBuf", term226824);
        setField(term226825, term226825.getClass(), "inStream", null);
        setLongField(term226826, term226826.getClass(), "bytesWritten", 0L);
        setLongField(term226827, term226827.getClass(), "bytesWritten", 0L);
        setField(term226827, term226827.getClass(), "out", null);
        setBooleanField(term226827, term226827.getClass(), "closed", false);
        setField(term226827, term226827.getClass(), "closeLock", null);
        setField(term226826, term226826.getClass(), "out", term226827);
        setBooleanField(term226826, term226826.getClass(), "closed", false);
        setField(term226826, term226826.getClass(), "closeLock", term226828);
        setField(term226825, term226825.getClass(), "outStream", term226826);
        setIntField(term226825, term226825.getClass(), "blockSize", 0);
        setIntField(term226825, term226825.getClass(), "recordSize", 512);
        setIntField(term226825, term226825.getClass(), "recsPerBlock", 0);
        setField(term226825, term226825.getClass(), "blockBuffer", term226829);
        setIntField(term226825, term226825.getClass(), "currBlkIdx", 0);
        setIntField(term226825, term226825.getClass(), "currRecIdx", 0);
        setField(term226822, term226822.getClass(), "buffer", term226825);
        setIntField(term226822, term226822.getClass(), "longFileMode", 0);
        setIntField(term226822, term226822.getClass(), "bigNumberMode", 0);
        setBooleanField(term226822, term226822.getClass(), "closed", false);
        setBooleanField(term226822, term226822.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term226822, term226822.getClass(), "finished", false);
        setField(term226822, term226822.getClass(), "out", term226826);
        setField(term226830, term226830.getClass(), "charset", "UTF8");
        setField(term226822, term226822.getClass(), "encoding", term226830);
        setBooleanField(term226822, term226822.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term226822, term226822.getClass(), "oneByte", term226833);
        setLongField(term226822, term226822.getClass(), "bytesWritten", 0L);
        term226834 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        setLongField(term226834, term226834.getClass(), "bytesWritten", 0L);
        setField(term226834, term226834.getClass(), "out", null);
        setBooleanField(term226834, term226834.getClass(), "closed", false);
        setField(term226834, term226834.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term225472;
        args[1] = 0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term226822));
        assertTrue(recursiveEquals(term225472, term226834));
    }

};


