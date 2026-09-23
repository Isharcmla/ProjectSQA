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

public class TarArchiveOutputStream_stripTo7Bits_65758611999 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71738;
     Object term72086;

    public TarArchiveOutputStream_stripTo7Bits_65758611999() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71738 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        term72086 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setLongField(term72086, term72086.getClass(), "currSize", 0L);
        setField(term72086, term72086.getClass(), "currName", null);
        setLongField(term72086, term72086.getClass(), "currBytes", 0L);
        setField(term72086, term72086.getClass(), "recordBuf", null);
        setIntField(term72086, term72086.getClass(), "assemLen", 0);
        setField(term72086, term72086.getClass(), "assemBuf", null);
        setIntField(term72086, term72086.getClass(), "longFileMode", 0);
        setIntField(term72086, term72086.getClass(), "bigNumberMode", 0);
        setIntField(term72086, term72086.getClass(), "recordsWritten", 0);
        setIntField(term72086, term72086.getClass(), "recordsPerBlock", 0);
        setIntField(term72086, term72086.getClass(), "recordSize", 0);
        setBooleanField(term72086, term72086.getClass(), "closed", false);
        setBooleanField(term72086, term72086.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term72086, term72086.getClass(), "finished", false);
        setField(term72086, term72086.getClass(), "out", null);
        setField(term72086, term72086.getClass(), "zipEncoding", null);
        setBooleanField(term72086, term72086.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term72086, term72086.getClass(), "oneByte", null);
        setLongField(term72086, term72086.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "stripTo7Bits", argTypes, term71738, args);
        assertTrue(recursiveEquals(term71738, term72086));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


