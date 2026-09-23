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

public class TarArchiveOutputStream_closeArchiveEntry_113192567287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158717;
     Object term166528;
     Object term166529;

    public TarArchiveOutputStream_closeArchiveEntry_113192567287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158717 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term158553 = (byte[]) newByteArray(0);
        Object term158811 = newInstance(Class.forName("org.tukaani.xz.UncompressedLZMA2OutputStream"));
        setBooleanField(term158717, term158717.getClass(), "finished", false);
        setBooleanField(term158717, term158717.getClass(), "haveUnclosedEntry", true);
        setIntField(term158717, term158717.getClass(), "assemLen", 1022);
        setField(term158717, term158717.getClass(), "assemBuf", term158553);
        setIntField(term158717, term158717.getClass(), "recordSize", 0);
        setField(term158717, term158717.getClass(), "out", term158811);
        term166528 = newInstance(Class.forName("org.tukaani.xz.UncompressedLZMA2OutputStream"));
        setField(term166528, term166528.getClass(), "out", null);
        setField(term166528, term166528.getClass(), "outData", null);
        setField(term166528, term166528.getClass(), "uncompBuf", null);
        setIntField(term166528, term166528.getClass(), "uncompPos", 0);
        setBooleanField(term166528, term166528.getClass(), "dictResetNeeded", false);
        setBooleanField(term166528, term166528.getClass(), "finished", false);
        setField(term166528, term166528.getClass(), "exception", null);
        setField(term166528, term166528.getClass(), "tempBuf", null);
        term166529 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "closeArchiveEntry", argTypes, term158717, args);
        assertTrue(recursiveEquals(term158717, term166528));
    }

};


