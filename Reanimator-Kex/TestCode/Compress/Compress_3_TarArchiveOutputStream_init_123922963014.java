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

public class TarArchiveOutputStream_init_123922963014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term54086;

    public TarArchiveOutputStream_init_123922963014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Integer(568599855);
        term54086 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term54087 = (byte[]) newByteArray(512);
        byte[] term54088 = (byte[]) newByteArray(512);
        Object term54089 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term54090 = (byte[]) newByteArray(568599855);
        byte[] term54091 = (byte[]) newByteArray(1);
        setLongField(term54086, term54086.getClass(), "currSize", 0L);
        setField(term54086, term54086.getClass(), "currName", null);
        setLongField(term54086, term54086.getClass(), "currBytes", 0L);
        setField(term54086, term54086.getClass(), "recordBuf", term54087);
        setIntField(term54086, term54086.getClass(), "assemLen", 0);
        setField(term54086, term54086.getClass(), "assemBuf", term54088);
        setField(term54089, term54089.getClass(), "inStream", null);
        setField(term54089, term54089.getClass(), "outStream", null);
        setField(term54089, term54089.getClass(), "blockBuffer", term54090);
        setIntField(term54089, term54089.getClass(), "currBlkIdx", 0);
        setIntField(term54089, term54089.getClass(), "currRecIdx", 0);
        setIntField(term54089, term54089.getClass(), "blockSize", 568599855);
        setIntField(term54089, term54089.getClass(), "recordSize", 512);
        setIntField(term54089, term54089.getClass(), "recsPerBlock", 1110546);
        setField(term54086, term54086.getClass(), "buffer", term54089);
        setIntField(term54086, term54086.getClass(), "longFileMode", 0);
        setBooleanField(term54086, term54086.getClass(), "closed", false);
        setField(term54086, term54086.getClass(), "out", null);
        setField(term54086, term54086.getClass(), "oneByte", term54091);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term54086));
        assertTrue(recursiveEquals(term1, null));
    }

};


