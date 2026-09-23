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

public class CpioArchiveInputStream_getNextCPIOEntry_849217571108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46661;

    public CpioArchiveInputStream_getNextCPIOEntry_849217571108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46661 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term46785 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term45450 = (byte[]) newByteArray(512);
        setBooleanField(term46661, term46661.getClass(), "closed", false);
        setLongField(term46785, term46785.getClass(), "filesize", 0L);
        setIntField(term46785, term46785.getClass(), "alignmentBoundary", 0);
        setShortField(term46785, term46785.getClass(), "fileFormat", (short) 2);
        setField(term46661, term46661.getClass(), "entry", term46785);
        setField(term46661, term46661.getClass(), "tmpbuf", term45450);
        setBooleanField(term46661, term46661.getClass(), "entryEOF", false);
        setLongField(term46661, term46661.getClass(), "entryBytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNextCPIOEntry", argTypes, term46661, args);
    }

};


