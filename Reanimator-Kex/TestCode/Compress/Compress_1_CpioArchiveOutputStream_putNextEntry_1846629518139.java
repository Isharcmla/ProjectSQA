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

public class CpioArchiveOutputStream_putNextEntry_1846629518139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38526;
     Object term38698;
     Object term39107;
     Object term39112;

    public CpioArchiveOutputStream_putNextEntry_1846629518139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term38574 = new HashMap();
        term38526 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setBooleanField(term38526, term38526.getClass(), "closed", false);
        setField(term38526, term38526.getClass(), "cpioEntry", null);
        setField(term38526, term38526.getClass(), "names", term38574);
        term38698 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term38698, term38698.getClass(), "mtime", 0L);
        setShortField(term38698, term38698.getClass(), "fileFormat", (short) 0);
        setField(term38698, term38698.getClass(), "name", null);
        HashMap term39109 = new HashMap();
        term39107 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term39108 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term39108, term39108.getClass(), "chksum", 0L);
        setShortField(term39108, term39108.getClass(), "fileFormat", (short) 0);
        setLongField(term39108, term39108.getClass(), "filesize", 0L);
        setLongField(term39108, term39108.getClass(), "gid", 0L);
        setLongField(term39108, term39108.getClass(), "headerSize", 0L);
        setLongField(term39108, term39108.getClass(), "inode", 0L);
        setLongField(term39108, term39108.getClass(), "maj", 0L);
        setLongField(term39108, term39108.getClass(), "min", 0L);
        setLongField(term39108, term39108.getClass(), "mode", 0L);
        setLongField(term39108, term39108.getClass(), "mtime", 0L);
        setField(term39108, term39108.getClass(), "name", null);
        setLongField(term39108, term39108.getClass(), "nlink", 0L);
        setLongField(term39108, term39108.getClass(), "rmaj", 0L);
        setLongField(term39108, term39108.getClass(), "rmin", 0L);
        setLongField(term39108, term39108.getClass(), "uid", 0L);
        setField(term39107, term39107.getClass(), "cpioEntry", term39108);
        setBooleanField(term39107, term39107.getClass(), "closed", false);
        setBooleanField(term39107, term39107.getClass(), "finished", false);
        setShortField(term39107, term39107.getClass(), "entryFormat", (short) 0);
        setField(term39107, term39107.getClass(), "names", term39109);
        setLongField(term39107, term39107.getClass(), "crc", 0L);
        setLongField(term39107, term39107.getClass(), "written", 0L);
        setField(term39107, term39107.getClass(), "out", null);
        term39112 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term39112, term39112.getClass(), "chksum", 0L);
        setShortField(term39112, term39112.getClass(), "fileFormat", (short) 0);
        setLongField(term39112, term39112.getClass(), "filesize", 0L);
        setLongField(term39112, term39112.getClass(), "gid", 0L);
        setLongField(term39112, term39112.getClass(), "headerSize", 0L);
        setLongField(term39112, term39112.getClass(), "inode", 0L);
        setLongField(term39112, term39112.getClass(), "maj", 0L);
        setLongField(term39112, term39112.getClass(), "min", 0L);
        setLongField(term39112, term39112.getClass(), "mode", 0L);
        setLongField(term39112, term39112.getClass(), "mtime", 0L);
        setField(term39112, term39112.getClass(), "name", null);
        setLongField(term39112, term39112.getClass(), "nlink", 0L);
        setLongField(term39112, term39112.getClass(), "rmaj", 0L);
        setLongField(term39112, term39112.getClass(), "rmin", 0L);
        setLongField(term39112, term39112.getClass(), "uid", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term38698;
        callMethod(klass, "putNextEntry", argTypes, term38526, args);
        assertTrue(recursiveEquals(term38526, term39107));
        assertTrue(recursiveEquals(term38698, term39112));
    }

};
