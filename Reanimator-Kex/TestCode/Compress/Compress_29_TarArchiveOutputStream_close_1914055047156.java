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

public class TarArchiveOutputStream_close_1914055047156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88571;
     Object term88812;

    public TarArchiveOutputStream_close_1914055047156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88571 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setBooleanField(term88571, term88571.getClass(), "finished", true);
        setBooleanField(term88571, term88571.getClass(), "closed", true);
        term88812 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setLongField(term88812, term88812.getClass(), "currSize", 0L);
        setField(term88812, term88812.getClass(), "currName", null);
        setLongField(term88812, term88812.getClass(), "currBytes", 0L);
        setField(term88812, term88812.getClass(), "recordBuf", null);
        setIntField(term88812, term88812.getClass(), "assemLen", 0);
        setField(term88812, term88812.getClass(), "assemBuf", null);
        setIntField(term88812, term88812.getClass(), "longFileMode", 0);
        setIntField(term88812, term88812.getClass(), "bigNumberMode", 0);
        setIntField(term88812, term88812.getClass(), "recordsWritten", 0);
        setIntField(term88812, term88812.getClass(), "recordsPerBlock", 0);
        setIntField(term88812, term88812.getClass(), "recordSize", 0);
        setBooleanField(term88812, term88812.getClass(), "closed", true);
        setBooleanField(term88812, term88812.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term88812, term88812.getClass(), "finished", true);
        setField(term88812, term88812.getClass(), "out", null);
        setField(term88812, term88812.getClass(), "zipEncoding", null);
        setBooleanField(term88812, term88812.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term88812, term88812.getClass(), "oneByte", null);
        setLongField(term88812, term88812.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term88571, args);
        assertTrue(recursiveEquals(term88571, term88812));
    }

};


