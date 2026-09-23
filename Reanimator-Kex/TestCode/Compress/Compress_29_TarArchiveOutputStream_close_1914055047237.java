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

public class TarArchiveOutputStream_close_1914055047237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137381;
     Object term137562;

    public TarArchiveOutputStream_close_1914055047237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137381 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term137515 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setBooleanField(term137381, term137381.getClass(), "finished", true);
        setBooleanField(term137381, term137381.getClass(), "closed", false);
        setBooleanField(term137515, term137515.getClass(), "finished", true);
        setBooleanField(term137515, term137515.getClass(), "closed", true);
        setField(term137381, term137381.getClass(), "out", term137515);
        term137562 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term137563 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setLongField(term137562, term137562.getClass(), "currSize", 0L);
        setField(term137562, term137562.getClass(), "currName", null);
        setLongField(term137562, term137562.getClass(), "currBytes", 0L);
        setField(term137562, term137562.getClass(), "recordBuf", null);
        setIntField(term137562, term137562.getClass(), "assemLen", 0);
        setField(term137562, term137562.getClass(), "assemBuf", null);
        setIntField(term137562, term137562.getClass(), "longFileMode", 0);
        setIntField(term137562, term137562.getClass(), "bigNumberMode", 0);
        setIntField(term137562, term137562.getClass(), "recordsWritten", 0);
        setIntField(term137562, term137562.getClass(), "recordsPerBlock", 0);
        setIntField(term137562, term137562.getClass(), "recordSize", 0);
        setBooleanField(term137562, term137562.getClass(), "closed", true);
        setBooleanField(term137562, term137562.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term137562, term137562.getClass(), "finished", true);
        setLongField(term137563, term137563.getClass(), "currSize", 0L);
        setField(term137563, term137563.getClass(), "currName", null);
        setLongField(term137563, term137563.getClass(), "currBytes", 0L);
        setField(term137563, term137563.getClass(), "recordBuf", null);
        setIntField(term137563, term137563.getClass(), "assemLen", 0);
        setField(term137563, term137563.getClass(), "assemBuf", null);
        setIntField(term137563, term137563.getClass(), "longFileMode", 0);
        setIntField(term137563, term137563.getClass(), "bigNumberMode", 0);
        setIntField(term137563, term137563.getClass(), "recordsWritten", 0);
        setIntField(term137563, term137563.getClass(), "recordsPerBlock", 0);
        setIntField(term137563, term137563.getClass(), "recordSize", 0);
        setBooleanField(term137563, term137563.getClass(), "closed", true);
        setBooleanField(term137563, term137563.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term137563, term137563.getClass(), "finished", true);
        setField(term137563, term137563.getClass(), "out", null);
        setField(term137563, term137563.getClass(), "zipEncoding", null);
        setBooleanField(term137563, term137563.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term137563, term137563.getClass(), "oneByte", null);
        setLongField(term137563, term137563.getClass(), "bytesWritten", 0L);
        setField(term137562, term137562.getClass(), "out", term137563);
        setField(term137562, term137562.getClass(), "zipEncoding", null);
        setBooleanField(term137562, term137562.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term137562, term137562.getClass(), "oneByte", null);
        setLongField(term137562, term137562.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term137381, args);
        assertTrue(recursiveEquals(term137381, term137562));
    }

};


