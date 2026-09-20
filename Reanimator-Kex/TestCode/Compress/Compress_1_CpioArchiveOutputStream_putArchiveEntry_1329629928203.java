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

public class CpioArchiveOutputStream_putArchiveEntry_1329629928203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98236;
     Object term98532;
     Object term98701;
     Object term98709;

    public CpioArchiveOutputStream_putArchiveEntry_1329629928203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term98408 = new HashMap();
        term98236 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term98360 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setBooleanField(term98236, term98236.getClass(), "closed", false);
        setLongField(term98360, term98360.getClass(), "filesize", 0L);
        setShortField(term98360, term98360.getClass(), "fileFormat", (short) -32768);
        setField(term98236, term98236.getClass(), "cpioEntry", term98360);
        setLongField(term98236, term98236.getClass(), "written", 0L);
        setLongField(term98236, term98236.getClass(), "crc", 0L);
        setField(term98236, term98236.getClass(), "names", term98408);
        term98532 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term98532, term98532.getClass(), "mtime", 0L);
        setShortField(term98532, term98532.getClass(), "fileFormat", (short) -32768);
        setField(term98532, term98532.getClass(), "name", "");
        HashMap term98705 = new HashMap();
        term98701 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term98702 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term98702, term98702.getClass(), "chksum", 0L);
        setShortField(term98702, term98702.getClass(), "fileFormat", (short) -32768);
        setLongField(term98702, term98702.getClass(), "filesize", 0L);
        setLongField(term98702, term98702.getClass(), "gid", 0L);
        setLongField(term98702, term98702.getClass(), "headerSize", 0L);
        setLongField(term98702, term98702.getClass(), "inode", 0L);
        setLongField(term98702, term98702.getClass(), "maj", 0L);
        setLongField(term98702, term98702.getClass(), "min", 0L);
        setLongField(term98702, term98702.getClass(), "mode", 0L);
        setLongField(term98702, term98702.getClass(), "mtime", 0L);
        setField(term98702, term98702.getClass(), "name", "");
        setLongField(term98702, term98702.getClass(), "nlink", 0L);
        setLongField(term98702, term98702.getClass(), "rmaj", 0L);
        setLongField(term98702, term98702.getClass(), "rmin", 0L);
        setLongField(term98702, term98702.getClass(), "uid", 0L);
        setField(term98701, term98701.getClass(), "cpioEntry", term98702);
        setBooleanField(term98701, term98701.getClass(), "closed", false);
        setBooleanField(term98701, term98701.getClass(), "finished", false);
        setShortField(term98701, term98701.getClass(), "entryFormat", (short) 0);
        setField(term98701, term98701.getClass(), "names", term98705);
        setLongField(term98701, term98701.getClass(), "crc", 0L);
        setLongField(term98701, term98701.getClass(), "written", 0L);
        setField(term98701, term98701.getClass(), "out", null);
        term98709 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term98709, term98709.getClass(), "chksum", 0L);
        setShortField(term98709, term98709.getClass(), "fileFormat", (short) -32768);
        setLongField(term98709, term98709.getClass(), "filesize", 0L);
        setLongField(term98709, term98709.getClass(), "gid", 0L);
        setLongField(term98709, term98709.getClass(), "headerSize", 0L);
        setLongField(term98709, term98709.getClass(), "inode", 0L);
        setLongField(term98709, term98709.getClass(), "maj", 0L);
        setLongField(term98709, term98709.getClass(), "min", 0L);
        setLongField(term98709, term98709.getClass(), "mode", 0L);
        setLongField(term98709, term98709.getClass(), "mtime", 0L);
        setField(term98709, term98709.getClass(), "name", "");
        setLongField(term98709, term98709.getClass(), "nlink", 0L);
        setLongField(term98709, term98709.getClass(), "rmaj", 0L);
        setLongField(term98709, term98709.getClass(), "rmin", 0L);
        setLongField(term98709, term98709.getClass(), "uid", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term98532;
        callMethod(klass, "putArchiveEntry", argTypes, term98236, args);
        assertTrue(recursiveEquals(term98236, term98701));
        assertTrue(recursiveEquals(term98532, term98709));
    }

};
