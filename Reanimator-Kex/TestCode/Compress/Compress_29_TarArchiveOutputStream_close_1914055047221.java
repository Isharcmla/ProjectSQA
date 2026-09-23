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

public class TarArchiveOutputStream_close_1914055047221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125085;
     Object term125168;

    public TarArchiveOutputStream_close_1914055047221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125085 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term125149 = newInstance(Class.forName("java.io.ByteArrayOutputStream"));
        setBooleanField(term125085, term125085.getClass(), "finished", true);
        setBooleanField(term125085, term125085.getClass(), "closed", false);
        setField(term125085, term125085.getClass(), "out", term125149);
        term125168 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term125169 = newInstance(Class.forName("java.io.ByteArrayOutputStream"));
        setLongField(term125168, term125168.getClass(), "currSize", 0L);
        setField(term125168, term125168.getClass(), "currName", null);
        setLongField(term125168, term125168.getClass(), "currBytes", 0L);
        setField(term125168, term125168.getClass(), "recordBuf", null);
        setIntField(term125168, term125168.getClass(), "assemLen", 0);
        setField(term125168, term125168.getClass(), "assemBuf", null);
        setIntField(term125168, term125168.getClass(), "longFileMode", 0);
        setIntField(term125168, term125168.getClass(), "bigNumberMode", 0);
        setIntField(term125168, term125168.getClass(), "recordsWritten", 0);
        setIntField(term125168, term125168.getClass(), "recordsPerBlock", 0);
        setIntField(term125168, term125168.getClass(), "recordSize", 0);
        setBooleanField(term125168, term125168.getClass(), "closed", true);
        setBooleanField(term125168, term125168.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term125168, term125168.getClass(), "finished", true);
        setField(term125169, term125169.getClass(), "buf", null);
        setIntField(term125169, term125169.getClass(), "count", 0);
        setField(term125168, term125168.getClass(), "out", term125169);
        setField(term125168, term125168.getClass(), "zipEncoding", null);
        setBooleanField(term125168, term125168.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term125168, term125168.getClass(), "oneByte", null);
        setLongField(term125168, term125168.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term125085, args);
        assertTrue(recursiveEquals(term125085, term125168));
    }

};


