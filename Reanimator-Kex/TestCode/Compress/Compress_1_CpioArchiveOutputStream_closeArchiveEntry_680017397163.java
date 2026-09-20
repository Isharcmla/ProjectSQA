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
import java.lang.Object;

public class CpioArchiveOutputStream_closeArchiveEntry_680017397163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48162;
     Object term54732;

    public CpioArchiveOutputStream_closeArchiveEntry_680017397163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48162 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term48286 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setBooleanField(term48162, term48162.getClass(), "closed", false);
        setLongField(term48286, term48286.getClass(), "filesize", 0L);
        setShortField(term48286, term48286.getClass(), "fileFormat", (short) 2);
        setField(term48162, term48162.getClass(), "cpioEntry", term48286);
        setLongField(term48162, term48162.getClass(), "written", 0L);
        setLongField(term48162, term48162.getClass(), "crc", 0L);
        term54732 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(term54732, term54732.getClass(), "cpioEntry", null);
        setBooleanField(term54732, term54732.getClass(), "closed", false);
        setBooleanField(term54732, term54732.getClass(), "finished", false);
        setShortField(term54732, term54732.getClass(), "entryFormat", (short) 0);
        setField(term54732, term54732.getClass(), "names", null);
        setLongField(term54732, term54732.getClass(), "crc", 0L);
        setLongField(term54732, term54732.getClass(), "written", 0L);
        setField(term54732, term54732.getClass(), "out", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "closeArchiveEntry", argTypes, term48162, args);
        assertTrue(recursiveEquals(term48162, term54732));
    }

};
