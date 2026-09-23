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

public class TarArchiveOutputStream_init_133247344626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23670;

    public TarArchiveOutputStream_init_133247344626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23670 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term23671 = (byte[]) newByteArray(512);
        byte[] term23672 = (byte[]) newByteArray(512);
        Object term23673 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term23674 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term23675 = newInstance(Class.forName("java.lang.Object"));
        byte[] term23676 = (byte[]) newByteArray(10240);
        Object term23677 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term23680 = (byte[]) newByteArray(1);
        setLongField(term23670, term23670.getClass(), "currSize", 0L);
        setField(term23670, term23670.getClass(), "currName", null);
        setLongField(term23670, term23670.getClass(), "currBytes", 0L);
        setField(term23670, term23670.getClass(), "recordBuf", term23671);
        setIntField(term23670, term23670.getClass(), "assemLen", 0);
        setField(term23670, term23670.getClass(), "assemBuf", term23672);
        setField(term23673, term23673.getClass(), "inStream", null);
        setLongField(term23674, term23674.getClass(), "bytesWritten", 0L);
        setField(term23674, term23674.getClass(), "out", null);
        setBooleanField(term23674, term23674.getClass(), "closed", false);
        setField(term23674, term23674.getClass(), "closeLock", term23675);
        setField(term23673, term23673.getClass(), "outStream", term23674);
        setIntField(term23673, term23673.getClass(), "blockSize", 10240);
        setIntField(term23673, term23673.getClass(), "recordSize", 512);
        setIntField(term23673, term23673.getClass(), "recsPerBlock", 20);
        setField(term23673, term23673.getClass(), "blockBuffer", term23676);
        setIntField(term23673, term23673.getClass(), "currBlkIdx", 0);
        setIntField(term23673, term23673.getClass(), "currRecIdx", 0);
        setField(term23670, term23670.getClass(), "buffer", term23673);
        setIntField(term23670, term23670.getClass(), "longFileMode", 0);
        setIntField(term23670, term23670.getClass(), "bigNumberMode", 0);
        setBooleanField(term23670, term23670.getClass(), "closed", false);
        setBooleanField(term23670, term23670.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term23670, term23670.getClass(), "finished", false);
        setField(term23670, term23670.getClass(), "out", term23674);
        setField(term23677, term23677.getClass(), "charset", "UTF8");
        setField(term23670, term23670.getClass(), "encoding", term23677);
        setBooleanField(term23670, term23670.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term23670, term23670.getClass(), "oneByte", term23680);
        setLongField(term23670, term23670.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.OutputStream");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term23670));
    }

};


