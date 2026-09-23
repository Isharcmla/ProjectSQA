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

public class TarArchiveInputStream_init_19412011623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term55015;

    public TarArchiveInputStream_init_19412011623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Integer(568599855);
        term55015 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term55016 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term55017 = (byte[]) newByteArray(568599855);
        byte[] term55018 = (byte[]) newByteArray(1);
        setBooleanField(term55015, term55015.getClass(), "hasHitEOF", false);
        setLongField(term55015, term55015.getClass(), "entrySize", 0L);
        setLongField(term55015, term55015.getClass(), "entryOffset", 0L);
        setField(term55015, term55015.getClass(), "readBuf", null);
        setField(term55016, term55016.getClass(), "inStream", null);
        setField(term55016, term55016.getClass(), "outStream", null);
        setField(term55016, term55016.getClass(), "blockBuffer", term55017);
        setIntField(term55016, term55016.getClass(), "currBlkIdx", 0);
        setIntField(term55016, term55016.getClass(), "currRecIdx", 0);
        setIntField(term55016, term55016.getClass(), "blockSize", 568599855);
        setIntField(term55016, term55016.getClass(), "recordSize", 512);
        setIntField(term55016, term55016.getClass(), "recsPerBlock", 1110546);
        setField(term55015, term55015.getClass(), "buffer", term55016);
        setField(term55015, term55015.getClass(), "currEntry", null);
        setField(term55015, term55015.getClass(), "SINGLE", term55018);
        setLongField(term55015, term55015.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term55015));
        assertTrue(recursiveEquals(term1, null));
    }

};


