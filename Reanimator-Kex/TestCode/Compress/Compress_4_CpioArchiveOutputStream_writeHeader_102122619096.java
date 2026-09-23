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

public class CpioArchiveOutputStream_writeHeader_102122619096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25885;
     Object term26009;
     Object term26368;
     Object term26369;

    public CpioArchiveOutputStream_writeHeader_102122619096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25885 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        term26009 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setShortField(term26009, term26009.getClass(), "fileFormat", (short) 3);
        term26368 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(term26368, term26368.getClass(), "entry", null);
        setBooleanField(term26368, term26368.getClass(), "closed", false);
        setBooleanField(term26368, term26368.getClass(), "finished", false);
        setShortField(term26368, term26368.getClass(), "entryFormat", (short) 0);
        setField(term26368, term26368.getClass(), "names", null);
        setLongField(term26368, term26368.getClass(), "crc", 0L);
        setLongField(term26368, term26368.getClass(), "written", 0L);
        setField(term26368, term26368.getClass(), "out", null);
        setField(term26368, term26368.getClass(), "oneByte", null);
        term26369 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setShortField(term26369, term26369.getClass(), "fileFormat", (short) 3);
        setIntField(term26369, term26369.getClass(), "headerSize", 0);
        setIntField(term26369, term26369.getClass(), "alignmentBoundary", 0);
        setLongField(term26369, term26369.getClass(), "chksum", 0L);
        setLongField(term26369, term26369.getClass(), "filesize", 0L);
        setLongField(term26369, term26369.getClass(), "gid", 0L);
        setLongField(term26369, term26369.getClass(), "inode", 0L);
        setLongField(term26369, term26369.getClass(), "maj", 0L);
        setLongField(term26369, term26369.getClass(), "min", 0L);
        setLongField(term26369, term26369.getClass(), "mode", 0L);
        setLongField(term26369, term26369.getClass(), "mtime", 0L);
        setField(term26369, term26369.getClass(), "name", null);
        setLongField(term26369, term26369.getClass(), "nlink", 0L);
        setLongField(term26369, term26369.getClass(), "rmaj", 0L);
        setLongField(term26369, term26369.getClass(), "rmin", 0L);
        setLongField(term26369, term26369.getClass(), "uid", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term26009;
        callMethod(klass, "writeHeader", argTypes, term25885, args);
        assertTrue(recursiveEquals(term25885, term26368));
        assertTrue(recursiveEquals(term26009, term26369));
    }

};


