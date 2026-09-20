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
import java.util.HashMap;
import java.lang.Object;

public class CpioArchiveOutputStream_putArchiveEntry_1329629928103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24680;
     Object term24852;
     Object term24951;
     Object term24959;

    public CpioArchiveOutputStream_putArchiveEntry_1329629928103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term24728 = new HashMap();
        term24680 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setBooleanField(term24680, term24680.getClass(), "closed", false);
        setField(term24680, term24680.getClass(), "cpioEntry", null);
        setField(term24680, term24680.getClass(), "names", term24728);
        term24852 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term24852, term24852.getClass(), "mtime", 0L);
        setShortField(term24852, term24852.getClass(), "fileFormat", (short) 0);
        setField(term24852, term24852.getClass(), "name", "");
        HashMap term24955 = new HashMap();
        term24951 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term24952 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term24952, term24952.getClass(), "chksum", 0L);
        setShortField(term24952, term24952.getClass(), "fileFormat", (short) 0);
        setLongField(term24952, term24952.getClass(), "filesize", 0L);
        setLongField(term24952, term24952.getClass(), "gid", 0L);
        setLongField(term24952, term24952.getClass(), "headerSize", 0L);
        setLongField(term24952, term24952.getClass(), "inode", 0L);
        setLongField(term24952, term24952.getClass(), "maj", 0L);
        setLongField(term24952, term24952.getClass(), "min", 0L);
        setLongField(term24952, term24952.getClass(), "mode", 0L);
        setLongField(term24952, term24952.getClass(), "mtime", 0L);
        setField(term24952, term24952.getClass(), "name", "");
        setLongField(term24952, term24952.getClass(), "nlink", 0L);
        setLongField(term24952, term24952.getClass(), "rmaj", 0L);
        setLongField(term24952, term24952.getClass(), "rmin", 0L);
        setLongField(term24952, term24952.getClass(), "uid", 0L);
        setField(term24951, term24951.getClass(), "cpioEntry", term24952);
        setBooleanField(term24951, term24951.getClass(), "closed", false);
        setBooleanField(term24951, term24951.getClass(), "finished", false);
        setShortField(term24951, term24951.getClass(), "entryFormat", (short) 0);
        setField(term24951, term24951.getClass(), "names", term24955);
        setLongField(term24951, term24951.getClass(), "crc", 0L);
        setLongField(term24951, term24951.getClass(), "written", 0L);
        setField(term24951, term24951.getClass(), "out", null);
        term24959 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term24959, term24959.getClass(), "chksum", 0L);
        setShortField(term24959, term24959.getClass(), "fileFormat", (short) 0);
        setLongField(term24959, term24959.getClass(), "filesize", 0L);
        setLongField(term24959, term24959.getClass(), "gid", 0L);
        setLongField(term24959, term24959.getClass(), "headerSize", 0L);
        setLongField(term24959, term24959.getClass(), "inode", 0L);
        setLongField(term24959, term24959.getClass(), "maj", 0L);
        setLongField(term24959, term24959.getClass(), "min", 0L);
        setLongField(term24959, term24959.getClass(), "mode", 0L);
        setLongField(term24959, term24959.getClass(), "mtime", 0L);
        setField(term24959, term24959.getClass(), "name", "");
        setLongField(term24959, term24959.getClass(), "nlink", 0L);
        setLongField(term24959, term24959.getClass(), "rmaj", 0L);
        setLongField(term24959, term24959.getClass(), "rmin", 0L);
        setLongField(term24959, term24959.getClass(), "uid", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term24852;
        callMethod(klass, "putArchiveEntry", argTypes, term24680, args);
        assertTrue(recursiveEquals(term24680, term24951));
        assertTrue(recursiveEquals(term24852, term24959));
    }

};
