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

public class TarArchiveOutputStream_init_133247344613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22001;

    public TarArchiveOutputStream_init_133247344613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22001 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term22002 = (byte[]) newByteArray(512);
        byte[] term22003 = (byte[]) newByteArray(512);
        Object term22004 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term22005 = (byte[]) newByteArray(10240);
        byte[] term22006 = (byte[]) newByteArray(1);
        setLongField(term22001, term22001.getClass(), "currSize", 0L);
        setField(term22001, term22001.getClass(), "currName", null);
        setLongField(term22001, term22001.getClass(), "currBytes", 0L);
        setField(term22001, term22001.getClass(), "recordBuf", term22002);
        setIntField(term22001, term22001.getClass(), "assemLen", 0);
        setField(term22001, term22001.getClass(), "assemBuf", term22003);
        setField(term22004, term22004.getClass(), "inStream", null);
        setField(term22004, term22004.getClass(), "outStream", null);
        setField(term22004, term22004.getClass(), "blockBuffer", term22005);
        setIntField(term22004, term22004.getClass(), "currBlkIdx", 0);
        setIntField(term22004, term22004.getClass(), "currRecIdx", 0);
        setIntField(term22004, term22004.getClass(), "blockSize", 10240);
        setIntField(term22004, term22004.getClass(), "recordSize", 512);
        setIntField(term22004, term22004.getClass(), "recsPerBlock", 20);
        setField(term22001, term22001.getClass(), "buffer", term22004);
        setIntField(term22001, term22001.getClass(), "longFileMode", 0);
        setBooleanField(term22001, term22001.getClass(), "closed", false);
        setField(term22001, term22001.getClass(), "out", null);
        setField(term22001, term22001.getClass(), "oneByte", term22006);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.OutputStream");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term22001));
    }

};


