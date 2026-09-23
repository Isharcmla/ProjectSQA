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

public class TarArchiveOutputStream_stripTo7Bits_65758611971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214868;
     Object term215171;

    public TarArchiveOutputStream_stripTo7Bits_65758611971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term214868 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        term215171 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setLongField(term215171, term215171.getClass(), "currSize", 0L);
        setField(term215171, term215171.getClass(), "currName", null);
        setLongField(term215171, term215171.getClass(), "currBytes", 0L);
        setField(term215171, term215171.getClass(), "recordBuf", null);
        setIntField(term215171, term215171.getClass(), "assemLen", 0);
        setField(term215171, term215171.getClass(), "assemBuf", null);
        setField(term215171, term215171.getClass(), "buffer", null);
        setIntField(term215171, term215171.getClass(), "longFileMode", 0);
        setIntField(term215171, term215171.getClass(), "bigNumberMode", 0);
        setBooleanField(term215171, term215171.getClass(), "closed", false);
        setBooleanField(term215171, term215171.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term215171, term215171.getClass(), "finished", false);
        setField(term215171, term215171.getClass(), "out", null);
        setField(term215171, term215171.getClass(), "encoding", null);
        setBooleanField(term215171, term215171.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term215171, term215171.getClass(), "oneByte", null);
        setLongField(term215171, term215171.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "stripTo7Bits", argTypes, term214868, args);
        assertTrue(recursiveEquals(term214868, term215171));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


