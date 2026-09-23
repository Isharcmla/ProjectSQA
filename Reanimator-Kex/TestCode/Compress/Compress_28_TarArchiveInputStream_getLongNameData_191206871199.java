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

public class TarArchiveInputStream_getLongNameData_191206871199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38549;
     Object term40328;
     Object term40330;

    public TarArchiveInputStream_getLongNameData_191206871199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38549 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term37906 = (byte[]) newByteArray(489);
        setField(term38549, term38549.getClass(), "SMALL_BUF", term37906);
        setBooleanField(term38549, term38549.getClass(), "hasHitEOF", true);
        setField(term38549, term38549.getClass(), "currEntry", null);
        term40328 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term40329 = (byte[]) newByteArray(489);
        setField(term40328, term40328.getClass(), "SMALL_BUF", term40329);
        setIntField(term40328, term40328.getClass(), "recordSize", 0);
        setIntField(term40328, term40328.getClass(), "blockSize", 0);
        setBooleanField(term40328, term40328.getClass(), "hasHitEOF", true);
        setLongField(term40328, term40328.getClass(), "entrySize", 0L);
        setLongField(term40328, term40328.getClass(), "entryOffset", 0L);
        setField(term40328, term40328.getClass(), "is", null);
        setField(term40328, term40328.getClass(), "currEntry", null);
        setField(term40328, term40328.getClass(), "encoding", null);
        setField(term40328, term40328.getClass(), "SINGLE", null);
        setLongField(term40328, term40328.getClass(), "bytesRead", 0L);
        term40330 = (byte[]) newByteArray(489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLongNameData", argTypes, term38549, args);
        assertTrue(recursiveEquals(term38549, term40328));
        assertTrue(recursiveEquals(retValue, null));
    }

};


