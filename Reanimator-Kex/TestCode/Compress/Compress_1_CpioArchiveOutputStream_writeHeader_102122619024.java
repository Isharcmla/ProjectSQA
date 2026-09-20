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

public class CpioArchiveOutputStream_writeHeader_102122619024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186;
     Object term224;
     Object term2159;
     Object term2164;

    public CpioArchiveOutputStream_writeHeader_102122619024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term217 = new HashMap();
        term186 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term187 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term187, term187.getClass(), "chksum", -3838084482494604218L);
        setShortField(term187, term187.getClass(), "fileFormat", (short) -26033);
        setLongField(term187, term187.getClass(), "filesize", 3892018155439224435L);
        setLongField(term187, term187.getClass(), "gid", 5953383087795962419L);
        setLongField(term187, term187.getClass(), "headerSize", 7994303628307559416L);
        setLongField(term187, term187.getClass(), "inode", 2443640364875054177L);
        setLongField(term187, term187.getClass(), "maj", -1610676979013636850L);
        setLongField(term187, term187.getClass(), "min", 2062173786000223358L);
        setLongField(term187, term187.getClass(), "mode", -8658027316505137504L);
        setLongField(term187, term187.getClass(), "mtime", 414749984815662075L);
        setField(term187, term187.getClass(), "name", "jJCZpVmanW");
        setLongField(term187, term187.getClass(), "nlink", 463622836963501975L);
        setLongField(term187, term187.getClass(), "rmaj", 305759998609888272L);
        setLongField(term187, term187.getClass(), "rmin", -8654565919063661957L);
        setLongField(term187, term187.getClass(), "uid", -5248475803419977214L);
        setField(term186, term186.getClass(), "cpioEntry", term187);
        setBooleanField(term186, term186.getClass(), "closed", true);
        setBooleanField(term186, term186.getClass(), "finished", true);
        setShortField(term186, term186.getClass(), "entryFormat", (short) 8329);
        setField(term186, term186.getClass(), "names", term217);
        setLongField(term186, term186.getClass(), "crc", -6723783499250797216L);
        setLongField(term186, term186.getClass(), "written", 41775768178052008L);
        setField(term186, term186.getClass(), "out", null);
        term224 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term224, term224.getClass(), "chksum", 6682528376118987775L);
        setShortField(term224, term224.getClass(), "fileFormat", (short) 31422);
        setLongField(term224, term224.getClass(), "filesize", 682356318767179819L);
        setLongField(term224, term224.getClass(), "gid", -7291743527973326814L);
        setLongField(term224, term224.getClass(), "headerSize", -5963439350418910964L);
        setLongField(term224, term224.getClass(), "inode", 9013624480170062917L);
        setLongField(term224, term224.getClass(), "maj", 7862575738391801707L);
        setLongField(term224, term224.getClass(), "min", 50358265865610362L);
        setLongField(term224, term224.getClass(), "mode", 5510783420697225605L);
        setLongField(term224, term224.getClass(), "mtime", 6005241913654469005L);
        setField(term224, term224.getClass(), "name", "EGtDIRbSSb");
        setLongField(term224, term224.getClass(), "nlink", -1983291584002806658L);
        setLongField(term224, term224.getClass(), "rmaj", 5946780097489996391L);
        setLongField(term224, term224.getClass(), "rmin", -8652538484981166496L);
        setLongField(term224, term224.getClass(), "uid", 2701184207686293431L);
        HashMap term2163 = new HashMap();
        term2159 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term2160 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term2160, term2160.getClass(), "chksum", -3838084482494604218L);
        setShortField(term2160, term2160.getClass(), "fileFormat", (short) -26033);
        setLongField(term2160, term2160.getClass(), "filesize", 3892018155439224435L);
        setLongField(term2160, term2160.getClass(), "gid", 5953383087795962419L);
        setLongField(term2160, term2160.getClass(), "headerSize", 7994303628307559416L);
        setLongField(term2160, term2160.getClass(), "inode", 2443640364875054177L);
        setLongField(term2160, term2160.getClass(), "maj", -1610676979013636850L);
        setLongField(term2160, term2160.getClass(), "min", 2062173786000223358L);
        setLongField(term2160, term2160.getClass(), "mode", -8658027316505137504L);
        setLongField(term2160, term2160.getClass(), "mtime", 414749984815662075L);
        setField(term2160, term2160.getClass(), "name", "jJCZpVmanW");
        setLongField(term2160, term2160.getClass(), "nlink", 463622836963501975L);
        setLongField(term2160, term2160.getClass(), "rmaj", 305759998609888272L);
        setLongField(term2160, term2160.getClass(), "rmin", -8654565919063661957L);
        setLongField(term2160, term2160.getClass(), "uid", -5248475803419977214L);
        setField(term2159, term2159.getClass(), "cpioEntry", term2160);
        setBooleanField(term2159, term2159.getClass(), "closed", true);
        setBooleanField(term2159, term2159.getClass(), "finished", true);
        setShortField(term2159, term2159.getClass(), "entryFormat", (short) 8329);
        setField(term2159, term2159.getClass(), "names", term2163);
        setLongField(term2159, term2159.getClass(), "crc", -6723783499250797216L);
        setLongField(term2159, term2159.getClass(), "written", 41775768178052008L);
        setField(term2159, term2159.getClass(), "out", null);
        term2164 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term2164, term2164.getClass(), "chksum", 6682528376118987775L);
        setShortField(term2164, term2164.getClass(), "fileFormat", (short) 31422);
        setLongField(term2164, term2164.getClass(), "filesize", 682356318767179819L);
        setLongField(term2164, term2164.getClass(), "gid", -7291743527973326814L);
        setLongField(term2164, term2164.getClass(), "headerSize", -5963439350418910964L);
        setLongField(term2164, term2164.getClass(), "inode", 9013624480170062917L);
        setLongField(term2164, term2164.getClass(), "maj", 7862575738391801707L);
        setLongField(term2164, term2164.getClass(), "min", 50358265865610362L);
        setLongField(term2164, term2164.getClass(), "mode", 5510783420697225605L);
        setLongField(term2164, term2164.getClass(), "mtime", 6005241913654469005L);
        setField(term2164, term2164.getClass(), "name", "EGtDIRbSSb");
        setLongField(term2164, term2164.getClass(), "nlink", -1983291584002806658L);
        setLongField(term2164, term2164.getClass(), "rmaj", 5946780097489996391L);
        setLongField(term2164, term2164.getClass(), "rmin", -8652538484981166496L);
        setLongField(term2164, term2164.getClass(), "uid", 2701184207686293431L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term224;
        callMethod(klass, "writeHeader", argTypes, term186, args);
        assertTrue(recursiveEquals(term186, term2159));
        assertTrue(recursiveEquals(term224, term2164));
    }

};
