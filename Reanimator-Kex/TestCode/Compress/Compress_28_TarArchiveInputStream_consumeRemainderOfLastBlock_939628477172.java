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

public class TarArchiveInputStream_consumeRemainderOfLastBlock_939628477172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80576;
     Object term86435;

    public TarArchiveInputStream_consumeRemainderOfLastBlock_939628477172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80576 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setLongField(term80576, term80576.getClass(), "bytesRead", -7447913934923055118L);
        setIntField(term80576, term80576.getClass(), "blockSize", 13235);
        term86435 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term86435, term86435.getClass(), "SMALL_BUF", null);
        setIntField(term86435, term86435.getClass(), "recordSize", 0);
        setIntField(term86435, term86435.getClass(), "blockSize", 13235);
        setBooleanField(term86435, term86435.getClass(), "hasHitEOF", false);
        setLongField(term86435, term86435.getClass(), "entrySize", 0L);
        setLongField(term86435, term86435.getClass(), "entryOffset", 0L);
        setField(term86435, term86435.getClass(), "is", null);
        setField(term86435, term86435.getClass(), "currEntry", null);
        setField(term86435, term86435.getClass(), "encoding", null);
        setField(term86435, term86435.getClass(), "SINGLE", null);
        setLongField(term86435, term86435.getClass(), "bytesRead", -7447913934923055118L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "consumeRemainderOfLastBlock", argTypes, term80576, args);
        assertTrue(recursiveEquals(term80576, term86435));
    }

};


