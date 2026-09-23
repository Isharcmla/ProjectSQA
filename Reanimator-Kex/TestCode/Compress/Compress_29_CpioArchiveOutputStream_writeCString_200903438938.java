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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class CpioArchiveOutputStream_writeCString_200903438938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1291;

    public CpioArchiveOutputStream_writeCString_200903438938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1323 = new HashMap();
        term1291 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term1292 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term1352 = (byte[]) newByteArray(3);
        setShortField(term1292, term1292.getClass(), "fileFormat", (short) 25437);
        setIntField(term1292, term1292.getClass(), "headerSize", 1655935355);
        setIntField(term1292, term1292.getClass(), "alignmentBoundary", -481533957);
        setLongField(term1292, term1292.getClass(), "chksum", 3104349415269466587L);
        setLongField(term1292, term1292.getClass(), "filesize", -7423063312741500355L);
        setLongField(term1292, term1292.getClass(), "gid", -8992404862613425105L);
        setLongField(term1292, term1292.getClass(), "inode", 3103198349031409063L);
        setLongField(term1292, term1292.getClass(), "maj", 753095050088595263L);
        setLongField(term1292, term1292.getClass(), "min", 3643973882575578879L);
        setLongField(term1292, term1292.getClass(), "mode", -1750555031444556464L);
        setLongField(term1292, term1292.getClass(), "mtime", -3231440836116263235L);
        setField(term1292, term1292.getClass(), "name", "GzFkzHGYFt");
        setLongField(term1292, term1292.getClass(), "nlink", 8010417010297313651L);
        setLongField(term1292, term1292.getClass(), "rmaj", 5845993504299821981L);
        setLongField(term1292, term1292.getClass(), "rmin", -1528017371096319990L);
        setLongField(term1292, term1292.getClass(), "uid", -1526328443223793465L);
        setField(term1291, term1291.getClass(), "entry", term1292);
        setBooleanField(term1291, term1291.getClass(), "closed", true);
        setBooleanField(term1291, term1291.getClass(), "finished", true);
        setShortField(term1291, term1291.getClass(), "entryFormat", (short) -14779);
        setField(term1291, term1291.getClass(), "names", term1323);
        setLongField(term1291, term1291.getClass(), "crc", 4096288569907305445L);
        setLongField(term1291, term1291.getClass(), "written", 6940486570215409900L);
        setField(term1291, term1291.getClass(), "out", null);
        setIntField(term1291, term1291.getClass(), "blockSize", 1090617576);
        setLongField(term1291, term1291.getClass(), "nextArtificalDeviceAndInode", -7370364068296402536L);
        setField(term1291, term1291.getClass(), "zipEncoding", null);
        setByteElement(term1352, 0, (byte) 61);
        setByteElement(term1352, 1, (byte) -92);
        setByteElement(term1352, 2, (byte) -42);
        setField(term1291, term1291.getClass(), "oneByte", term1352);
        setLongField(term1291, term1291.getClass(), "bytesWritten", -1084263688306617320L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xLbjWUgOIL";
        try {
            callMethod(klass, "writeCString", argTypes, term1291, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


