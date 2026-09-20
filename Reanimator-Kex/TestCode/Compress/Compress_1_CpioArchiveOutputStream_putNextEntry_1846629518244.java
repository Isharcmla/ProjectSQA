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
import java.util.HashMap;

public class CpioArchiveOutputStream_putNextEntry_1846629518244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170078;
     Object term170374;
     Object term179910;
     Object term179918;

    public CpioArchiveOutputStream_putNextEntry_1846629518244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term170250 = new HashMap();
        term170078 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term170202 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setBooleanField(term170078, term170078.getClass(), "closed", false);
        setLongField(term170202, term170202.getClass(), "filesize", 0L);
        setShortField(term170202, term170202.getClass(), "fileFormat", (short) 8);
        setField(term170078, term170078.getClass(), "cpioEntry", term170202);
        setLongField(term170078, term170078.getClass(), "written", 0L);
        setLongField(term170078, term170078.getClass(), "crc", 0L);
        setField(term170078, term170078.getClass(), "names", term170250);
        term170374 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term170374, term170374.getClass(), "mtime", 0L);
        setShortField(term170374, term170374.getClass(), "fileFormat", (short) 0);
        setField(term170374, term170374.getClass(), "name", "");
        HashMap term179914 = new HashMap();
        term179910 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term179911 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term179911, term179911.getClass(), "chksum", 0L);
        setShortField(term179911, term179911.getClass(), "fileFormat", (short) 0);
        setLongField(term179911, term179911.getClass(), "filesize", 0L);
        setLongField(term179911, term179911.getClass(), "gid", 0L);
        setLongField(term179911, term179911.getClass(), "headerSize", 0L);
        setLongField(term179911, term179911.getClass(), "inode", 0L);
        setLongField(term179911, term179911.getClass(), "maj", 0L);
        setLongField(term179911, term179911.getClass(), "min", 0L);
        setLongField(term179911, term179911.getClass(), "mode", 0L);
        setLongField(term179911, term179911.getClass(), "mtime", 0L);
        setField(term179911, term179911.getClass(), "name", "");
        setLongField(term179911, term179911.getClass(), "nlink", 0L);
        setLongField(term179911, term179911.getClass(), "rmaj", 0L);
        setLongField(term179911, term179911.getClass(), "rmin", 0L);
        setLongField(term179911, term179911.getClass(), "uid", 0L);
        setField(term179910, term179910.getClass(), "cpioEntry", term179911);
        setBooleanField(term179910, term179910.getClass(), "closed", false);
        setBooleanField(term179910, term179910.getClass(), "finished", false);
        setShortField(term179910, term179910.getClass(), "entryFormat", (short) 0);
        setField(term179910, term179910.getClass(), "names", term179914);
        setLongField(term179910, term179910.getClass(), "crc", 0L);
        setLongField(term179910, term179910.getClass(), "written", 0L);
        setField(term179910, term179910.getClass(), "out", null);
        term179918 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term179918, term179918.getClass(), "chksum", 0L);
        setShortField(term179918, term179918.getClass(), "fileFormat", (short) 0);
        setLongField(term179918, term179918.getClass(), "filesize", 0L);
        setLongField(term179918, term179918.getClass(), "gid", 0L);
        setLongField(term179918, term179918.getClass(), "headerSize", 0L);
        setLongField(term179918, term179918.getClass(), "inode", 0L);
        setLongField(term179918, term179918.getClass(), "maj", 0L);
        setLongField(term179918, term179918.getClass(), "min", 0L);
        setLongField(term179918, term179918.getClass(), "mode", 0L);
        setLongField(term179918, term179918.getClass(), "mtime", 0L);
        setField(term179918, term179918.getClass(), "name", "");
        setLongField(term179918, term179918.getClass(), "nlink", 0L);
        setLongField(term179918, term179918.getClass(), "rmaj", 0L);
        setLongField(term179918, term179918.getClass(), "rmin", 0L);
        setLongField(term179918, term179918.getClass(), "uid", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term170374;
        callMethod(klass, "putNextEntry", argTypes, term170078, args);
        assertTrue(recursiveEquals(term170078, term179910));
        assertTrue(recursiveEquals(term170374, term179918));
    }

};
