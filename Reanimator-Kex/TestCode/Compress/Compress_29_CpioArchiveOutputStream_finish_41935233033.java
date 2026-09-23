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
import java.util.HashMap;

public class CpioArchiveOutputStream_finish_41935233033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term874;

    public CpioArchiveOutputStream_finish_41935233033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term906 = new HashMap();
        term874 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term875 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term935 = (byte[]) newByteArray(1);
        setShortField(term875, term875.getClass(), "fileFormat", (short) 3170);
        setIntField(term875, term875.getClass(), "headerSize", -1786399638);
        setIntField(term875, term875.getClass(), "alignmentBoundary", 2055867847);
        setLongField(term875, term875.getClass(), "chksum", -5656664340499957324L);
        setLongField(term875, term875.getClass(), "filesize", -5460517064177800852L);
        setLongField(term875, term875.getClass(), "gid", -5242567610844514867L);
        setLongField(term875, term875.getClass(), "inode", -2951854704066477061L);
        setLongField(term875, term875.getClass(), "maj", 174253963298276221L);
        setLongField(term875, term875.getClass(), "min", 3713624957161771816L);
        setLongField(term875, term875.getClass(), "mode", 6130232388739280211L);
        setLongField(term875, term875.getClass(), "mtime", 3423965054378869855L);
        setField(term875, term875.getClass(), "name", "OWDIEULEFu");
        setLongField(term875, term875.getClass(), "nlink", -593735869267672817L);
        setLongField(term875, term875.getClass(), "rmaj", 6041374912351843923L);
        setLongField(term875, term875.getClass(), "rmin", 2535970782317488741L);
        setLongField(term875, term875.getClass(), "uid", -5258945362776941718L);
        setField(term874, term874.getClass(), "entry", term875);
        setBooleanField(term874, term874.getClass(), "closed", true);
        setBooleanField(term874, term874.getClass(), "finished", false);
        setShortField(term874, term874.getClass(), "entryFormat", (short) -21181);
        setField(term874, term874.getClass(), "names", term906);
        setLongField(term874, term874.getClass(), "crc", 7998051124369147543L);
        setLongField(term874, term874.getClass(), "written", -1481367303699139651L);
        setField(term874, term874.getClass(), "out", null);
        setIntField(term874, term874.getClass(), "blockSize", 458147407);
        setLongField(term874, term874.getClass(), "nextArtificalDeviceAndInode", -7709317346333670618L);
        setField(term874, term874.getClass(), "zipEncoding", null);
        setByteElement(term935, 0, (byte) 42);
        setField(term874, term874.getClass(), "oneByte", term935);
        setLongField(term874, term874.getClass(), "bytesWritten", -1964501434345816975L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "finish", argTypes, term874, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


