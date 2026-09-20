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

public class CpioArchiveOutputStream_putNextEntry_1846629518194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94704;
     Object term95000;
     Object term95528;
     Object term95536;

    public CpioArchiveOutputStream_putNextEntry_1846629518194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term94876 = new HashMap();
        term94704 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term94828 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setBooleanField(term94704, term94704.getClass(), "closed", false);
        setLongField(term94828, term94828.getClass(), "filesize", 0L);
        setShortField(term94828, term94828.getClass(), "fileFormat", (short) 14);
        setField(term94704, term94704.getClass(), "cpioEntry", term94828);
        setLongField(term94704, term94704.getClass(), "written", 0L);
        setLongField(term94704, term94704.getClass(), "crc", 0L);
        setField(term94704, term94704.getClass(), "names", term94876);
        term95000 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term95000, term95000.getClass(), "mtime", 0L);
        setShortField(term95000, term95000.getClass(), "fileFormat", (short) -25840);
        setField(term95000, term95000.getClass(), "name", "");
        HashMap term95532 = new HashMap();
        term95528 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term95529 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term95529, term95529.getClass(), "chksum", 0L);
        setShortField(term95529, term95529.getClass(), "fileFormat", (short) -25840);
        setLongField(term95529, term95529.getClass(), "filesize", 0L);
        setLongField(term95529, term95529.getClass(), "gid", 0L);
        setLongField(term95529, term95529.getClass(), "headerSize", 0L);
        setLongField(term95529, term95529.getClass(), "inode", 0L);
        setLongField(term95529, term95529.getClass(), "maj", 0L);
        setLongField(term95529, term95529.getClass(), "min", 0L);
        setLongField(term95529, term95529.getClass(), "mode", 0L);
        setLongField(term95529, term95529.getClass(), "mtime", 0L);
        setField(term95529, term95529.getClass(), "name", "");
        setLongField(term95529, term95529.getClass(), "nlink", 0L);
        setLongField(term95529, term95529.getClass(), "rmaj", 0L);
        setLongField(term95529, term95529.getClass(), "rmin", 0L);
        setLongField(term95529, term95529.getClass(), "uid", 0L);
        setField(term95528, term95528.getClass(), "cpioEntry", term95529);
        setBooleanField(term95528, term95528.getClass(), "closed", false);
        setBooleanField(term95528, term95528.getClass(), "finished", false);
        setShortField(term95528, term95528.getClass(), "entryFormat", (short) 0);
        setField(term95528, term95528.getClass(), "names", term95532);
        setLongField(term95528, term95528.getClass(), "crc", 0L);
        setLongField(term95528, term95528.getClass(), "written", 0L);
        setField(term95528, term95528.getClass(), "out", null);
        term95536 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term95536, term95536.getClass(), "chksum", 0L);
        setShortField(term95536, term95536.getClass(), "fileFormat", (short) -25840);
        setLongField(term95536, term95536.getClass(), "filesize", 0L);
        setLongField(term95536, term95536.getClass(), "gid", 0L);
        setLongField(term95536, term95536.getClass(), "headerSize", 0L);
        setLongField(term95536, term95536.getClass(), "inode", 0L);
        setLongField(term95536, term95536.getClass(), "maj", 0L);
        setLongField(term95536, term95536.getClass(), "min", 0L);
        setLongField(term95536, term95536.getClass(), "mode", 0L);
        setLongField(term95536, term95536.getClass(), "mtime", 0L);
        setField(term95536, term95536.getClass(), "name", "");
        setLongField(term95536, term95536.getClass(), "nlink", 0L);
        setLongField(term95536, term95536.getClass(), "rmaj", 0L);
        setLongField(term95536, term95536.getClass(), "rmin", 0L);
        setLongField(term95536, term95536.getClass(), "uid", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term95000;
        callMethod(klass, "putNextEntry", argTypes, term94704, args);
        assertTrue(recursiveEquals(term94704, term95528));
        assertTrue(recursiveEquals(term95000, term95536));
    }

};
