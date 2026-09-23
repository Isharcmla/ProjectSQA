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

public class CpioArchiveOutputStream_putArchiveEntry_1329629928142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60701;

    public CpioArchiveOutputStream_putArchiveEntry_1329629928142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60701 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term60825 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setBooleanField(term60701, term60701.getClass(), "finished", false);
        setBooleanField(term60701, term60701.getClass(), "closed", false);
        setLongField(term60825, term60825.getClass(), "filesize", 0L);
        setIntField(term60825, term60825.getClass(), "alignmentBoundary", 0);
        setShortField(term60825, term60825.getClass(), "fileFormat", (short) 2);
        setLongField(term60825, term60825.getClass(), "chksum", 261120L);
        setField(term60701, term60701.getClass(), "entry", term60825);
        setLongField(term60701, term60701.getClass(), "written", 0L);
        setLongField(term60701, term60701.getClass(), "crc", -261121L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "putArchiveEntry", argTypes, term60701, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


