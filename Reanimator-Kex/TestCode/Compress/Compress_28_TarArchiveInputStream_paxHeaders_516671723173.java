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

public class TarArchiveInputStream_paxHeaders_516671723173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81033;
     Object term86759;

    public TarArchiveInputStream_paxHeaders_516671723173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81033 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term80587 = (byte[]) newByteArray(9);
        Object term81165 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setByteElement(term80587, 0, (byte) 1);
        setByteElement(term80587, 1, (byte) 1);
        setByteElement(term80587, 2, (byte) 1);
        setByteElement(term80587, 3, (byte) 1);
        setByteElement(term80587, 4, (byte) 1);
        setByteElement(term80587, 5, (byte) 1);
        setByteElement(term80587, 6, (byte) 1);
        setByteElement(term80587, 7, (byte) 1);
        setByteElement(term80587, 8, (byte) 1);
        setField(term81033, term81033.getClass(), "SINGLE", term80587);
        setBooleanField(term81033, term81033.getClass(), "hasHitEOF", false);
        setLongField(term81033, term81033.getClass(), "entryOffset", 0L);
        setLongField(term81033, term81033.getClass(), "entrySize", -9223372036854775807L);
        setField(term81033, term81033.getClass(), "currEntry", null);
        setIntField(term81033, term81033.getClass(), "recordSize", 233);
        setField(term81033, term81033.getClass(), "is", term81165);
        term86759 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term86760 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term86761 = (byte[]) newByteArray(9);
        setField(term86759, term86759.getClass(), "SMALL_BUF", null);
        setIntField(term86759, term86759.getClass(), "recordSize", 233);
        setIntField(term86759, term86759.getClass(), "blockSize", 0);
        setBooleanField(term86759, term86759.getClass(), "hasHitEOF", true);
        setLongField(term86759, term86759.getClass(), "entrySize", -9223372036854775807L);
        setLongField(term86759, term86759.getClass(), "entryOffset", 0L);
        setField(term86760, term86760.getClass(), "SMALL_BUF", null);
        setIntField(term86760, term86760.getClass(), "recordSize", 0);
        setIntField(term86760, term86760.getClass(), "blockSize", 0);
        setBooleanField(term86760, term86760.getClass(), "hasHitEOF", false);
        setLongField(term86760, term86760.getClass(), "entrySize", 0L);
        setLongField(term86760, term86760.getClass(), "entryOffset", 0L);
        setField(term86760, term86760.getClass(), "is", null);
        setField(term86760, term86760.getClass(), "currEntry", null);
        setField(term86760, term86760.getClass(), "encoding", null);
        setField(term86760, term86760.getClass(), "SINGLE", null);
        setLongField(term86760, term86760.getClass(), "bytesRead", 0L);
        setField(term86759, term86759.getClass(), "is", term86760);
        setField(term86759, term86759.getClass(), "currEntry", null);
        setField(term86759, term86759.getClass(), "encoding", null);
        setByteElement(term86761, 0, (byte) 1);
        setByteElement(term86761, 1, (byte) 1);
        setByteElement(term86761, 2, (byte) 1);
        setByteElement(term86761, 3, (byte) 1);
        setByteElement(term86761, 4, (byte) 1);
        setByteElement(term86761, 5, (byte) 1);
        setByteElement(term86761, 6, (byte) 1);
        setByteElement(term86761, 7, (byte) 1);
        setByteElement(term86761, 8, (byte) 1);
        setField(term86759, term86759.getClass(), "SINGLE", term86761);
        setLongField(term86759, term86759.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "paxHeaders", argTypes, term81033, args);
        assertTrue(recursiveEquals(term81033, term86759));
    }

};


