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

public class TarArchiveInputStream_init_927929389178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79216;
     Object term80733;
     Object term80740;

    public TarArchiveInputStream_init_927929389178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term78952 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term79084 = newInstance(Class.forName("org.apache.commons.compress.archivers.arj.ArjArchiveInputStream"));
        setField(term78952, term78952.getClass(), "SINGLE", null);
        setLongField(term78952, term78952.getClass(), "bytesRead", 0L);
        setField(term78952, term78952.getClass(), "SMALL_BUF", null);
        setField(term78952, term78952.getClass(), "is", term79084);
        setBooleanField(term78952, term78952.getClass(), "hasHitEOF", false);
        term79216 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        term80733 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term80734 = (byte[]) newByteArray(256);
        Object term80735 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term80736 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term80739 = (byte[]) newByteArray(1);
        setField(term80733, term80733.getClass(), "SMALL_BUF", term80734);
        setIntField(term80733, term80733.getClass(), "recordSize", 512);
        setIntField(term80733, term80733.getClass(), "blockSize", 0);
        setBooleanField(term80733, term80733.getClass(), "hasHitEOF", false);
        setLongField(term80733, term80733.getClass(), "entrySize", 0L);
        setLongField(term80733, term80733.getClass(), "entryOffset", 0L);
        setField(term80735, term80735.getClass(), "SMALL_BUF", null);
        setIntField(term80735, term80735.getClass(), "recordSize", 0);
        setIntField(term80735, term80735.getClass(), "blockSize", 0);
        setBooleanField(term80735, term80735.getClass(), "hasHitEOF", false);
        setLongField(term80735, term80735.getClass(), "entrySize", 0L);
        setLongField(term80735, term80735.getClass(), "entryOffset", 0L);
        setField(term80735, term80735.getClass(), "is", null);
        setField(term80735, term80735.getClass(), "currEntry", null);
        setField(term80735, term80735.getClass(), "zipEncoding", null);
        setField(term80735, term80735.getClass(), "SINGLE", null);
        setLongField(term80735, term80735.getClass(), "bytesRead", 0L);
        setField(term80733, term80733.getClass(), "is", term80735);
        setField(term80733, term80733.getClass(), "currEntry", null);
        setField(term80736, term80736.getClass(), "charsetName", "UTF8");
        setField(term80733, term80733.getClass(), "zipEncoding", term80736);
        setField(term80733, term80733.getClass(), "SINGLE", term80739);
        setLongField(term80733, term80733.getClass(), "bytesRead", 0L);
        term80740 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term80740, term80740.getClass(), "SMALL_BUF", null);
        setIntField(term80740, term80740.getClass(), "recordSize", 0);
        setIntField(term80740, term80740.getClass(), "blockSize", 0);
        setBooleanField(term80740, term80740.getClass(), "hasHitEOF", false);
        setLongField(term80740, term80740.getClass(), "entrySize", 0L);
        setLongField(term80740, term80740.getClass(), "entryOffset", 0L);
        setField(term80740, term80740.getClass(), "is", null);
        setField(term80740, term80740.getClass(), "currEntry", null);
        setField(term80740, term80740.getClass(), "zipEncoding", null);
        setField(term80740, term80740.getClass(), "SINGLE", null);
        setLongField(term80740, term80740.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term79216;
        args[1] = 0;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term80733));
        assertTrue(recursiveEquals(term79216, null));
    }

};


