package org.apache.commons.compress.archivers.cpio;

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
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CpioArchiveInputStream_getNextCPIOEntry_849217571153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62924;

    public CpioArchiveInputStream_getNextCPIOEntry_849217571153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62924 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term63048 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term61718 = (byte[]) newByteArray(512);
        setBooleanField(term62924, term62924.getClass(), "closed", false);
        setLongField(term63048, term63048.getClass(), "filesize", 0L);
        setIntField(term63048, term63048.getClass(), "alignmentBoundary", -1);
        setField(term62924, term62924.getClass(), "entry", term63048);
        setField(term62924, term62924.getClass(), "tmpbuf", term61718);
        setBooleanField(term62924, term62924.getClass(), "entryEOF", false);
        setLongField(term62924, term62924.getClass(), "entryBytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNextCPIOEntry", argTypes, term62924, args);
    }

};


