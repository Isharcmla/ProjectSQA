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
import java.io.IOException;
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CpioArchiveOutputStream_closeArchiveEntry_680017397170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73096;

    public CpioArchiveOutputStream_closeArchiveEntry_680017397170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73096 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term73220 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setBooleanField(term73096, term73096.getClass(), "finished", false);
        setBooleanField(term73096, term73096.getClass(), "closed", false);
        setLongField(term73220, term73220.getClass(), "filesize", 0L);
        setIntField(term73220, term73220.getClass(), "alignmentBoundary", 0);
        setShortField(term73220, term73220.getClass(), "fileFormat", (short) 2);
        setLongField(term73220, term73220.getClass(), "chksum", 261120L);
        setField(term73096, term73096.getClass(), "entry", term73220);
        setLongField(term73096, term73096.getClass(), "written", 0L);
        setLongField(term73096, term73096.getClass(), "crc", -261121L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "closeArchiveEntry", argTypes, term73096, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


