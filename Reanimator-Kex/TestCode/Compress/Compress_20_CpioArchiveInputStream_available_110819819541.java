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
import static org.apache.commons.compress.archivers.cpio.EqualityUtils.*;

public class CpioArchiveInputStream_available_110819819541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23436;
     Object term23447;

    public CpioArchiveInputStream_available_110819819541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23436 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        setBooleanField(term23436, term23436.getClass(), "closed", false);
        setBooleanField(term23436, term23436.getClass(), "entryEOF", true);
        term23447 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        setBooleanField(term23447, term23447.getClass(), "closed", false);
        setField(term23447, term23447.getClass(), "entry", null);
        setLongField(term23447, term23447.getClass(), "entryBytesRead", 0L);
        setBooleanField(term23447, term23447.getClass(), "entryEOF", true);
        setField(term23447, term23447.getClass(), "tmpbuf", null);
        setLongField(term23447, term23447.getClass(), "crc", 0L);
        setField(term23447, term23447.getClass(), "in", null);
        setField(term23447, term23447.getClass(), "TWO_BYTES_BUF", null);
        setField(term23447, term23447.getClass(), "FOUR_BYTES_BUF", null);
        setField(term23447, term23447.getClass(), "SIX_BYTES_BUF", null);
        setIntField(term23447, term23447.getClass(), "blockSize", 0);
        setField(term23447, term23447.getClass(), "SINGLE", null);
        setLongField(term23447, term23447.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "available", argTypes, term23436, args);
        assertTrue(recursiveEquals(term23436, term23447));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


