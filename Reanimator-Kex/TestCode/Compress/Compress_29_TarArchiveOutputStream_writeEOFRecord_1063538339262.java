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

public class TarArchiveOutputStream_writeEOFRecord_1063538339262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148374;
     Object term150487;

    public TarArchiveOutputStream_writeEOFRecord_1063538339262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148374 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term147238 = (byte[]) newByteArray(489);
        Object term148424 = newInstance(Class.forName("java.io.OutputStream$1"));
        setField(term148374, term148374.getClass(), "recordBuf", term147238);
        setIntField(term148374, term148374.getClass(), "recordSize", 489);
        setField(term148374, term148374.getClass(), "out", term148424);
        term150487 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term150488 = (byte[]) newByteArray(489);
        Object term150489 = newInstance(Class.forName("java.io.OutputStream$1"));
        setLongField(term150487, term150487.getClass(), "currSize", 0L);
        setField(term150487, term150487.getClass(), "currName", null);
        setLongField(term150487, term150487.getClass(), "currBytes", 0L);
        setField(term150487, term150487.getClass(), "recordBuf", term150488);
        setIntField(term150487, term150487.getClass(), "assemLen", 0);
        setField(term150487, term150487.getClass(), "assemBuf", null);
        setIntField(term150487, term150487.getClass(), "longFileMode", 0);
        setIntField(term150487, term150487.getClass(), "bigNumberMode", 0);
        setIntField(term150487, term150487.getClass(), "recordsWritten", 1);
        setIntField(term150487, term150487.getClass(), "recordsPerBlock", 0);
        setIntField(term150487, term150487.getClass(), "recordSize", 489);
        setBooleanField(term150487, term150487.getClass(), "closed", false);
        setBooleanField(term150487, term150487.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term150487, term150487.getClass(), "finished", false);
        setBooleanField(term150489, term150489.getClass(), "closed", false);
        setField(term150487, term150487.getClass(), "out", term150489);
        setField(term150487, term150487.getClass(), "zipEncoding", null);
        setBooleanField(term150487, term150487.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term150487, term150487.getClass(), "oneByte", null);
        setLongField(term150487, term150487.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "writeEOFRecord", argTypes, term148374, args);
        assertTrue(recursiveEquals(term148374, term150487));
    }

};


