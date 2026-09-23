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

public class TarArchiveInputStream_init_108018443424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term5;
     Object term85047;

    public TarArchiveInputStream_init_108018443424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = new Integer(1162663216);
        term5 = new Integer(1484323161);
        term85047 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term85048 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term85049 = (byte[]) newByteArray(1162663216);
        byte[] term85050 = (byte[]) newByteArray(1);
        setBooleanField(term85047, term85047.getClass(), "hasHitEOF", false);
        setLongField(term85047, term85047.getClass(), "entrySize", 0L);
        setLongField(term85047, term85047.getClass(), "entryOffset", 0L);
        setField(term85047, term85047.getClass(), "readBuf", null);
        setField(term85048, term85048.getClass(), "inStream", null);
        setField(term85048, term85048.getClass(), "outStream", null);
        setField(term85048, term85048.getClass(), "blockBuffer", term85049);
        setIntField(term85048, term85048.getClass(), "currBlkIdx", 0);
        setIntField(term85048, term85048.getClass(), "currRecIdx", 0);
        setIntField(term85048, term85048.getClass(), "blockSize", 1162663216);
        setIntField(term85048, term85048.getClass(), "recordSize", 1484323161);
        setIntField(term85048, term85048.getClass(), "recsPerBlock", 0);
        setField(term85047, term85047.getClass(), "buffer", term85048);
        setField(term85047, term85047.getClass(), "currEntry", null);
        setField(term85047, term85047.getClass(), "SINGLE", term85050);
        setLongField(term85047, term85047.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term3;
        args[2] = term5;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term85047));
        assertTrue(recursiveEquals(term3, 1484323161));
        assertTrue(recursiveEquals(term5, null));
    }

};


