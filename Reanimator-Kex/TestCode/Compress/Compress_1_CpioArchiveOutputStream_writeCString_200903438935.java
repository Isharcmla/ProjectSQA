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

public class CpioArchiveOutputStream_writeCString_200903438935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term895;

    public CpioArchiveOutputStream_writeCString_200903438935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term926 = new HashMap();
        term895 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term896 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term896, term896.getClass(), "chksum", 6130232388739280211L);
        setShortField(term896, term896.getClass(), "fileFormat", (short) -7799);
        setLongField(term896, term896.getClass(), "filesize", 3423965054378869855L);
        setLongField(term896, term896.getClass(), "gid", -593735869267672817L);
        setLongField(term896, term896.getClass(), "headerSize", 6041374912351843923L);
        setLongField(term896, term896.getClass(), "inode", 2535970782317488741L);
        setLongField(term896, term896.getClass(), "maj", -5258945362776941718L);
        setLongField(term896, term896.getClass(), "min", 24067105862153728L);
        setLongField(term896, term896.getClass(), "mode", -8477368071089201577L);
        setLongField(term896, term896.getClass(), "mtime", -1526729287349763895L);
        setField(term896, term896.getClass(), "name", "pCTimMblYc");
        setLongField(term896, term896.getClass(), "nlink", 7017605765544766728L);
        setLongField(term896, term896.getClass(), "rmaj", -6078481855513028760L);
        setLongField(term896, term896.getClass(), "rmin", -6985556670871089725L);
        setLongField(term896, term896.getClass(), "uid", -8469818909085103606L);
        setField(term895, term895.getClass(), "cpioEntry", term896);
        setBooleanField(term895, term895.getClass(), "closed", true);
        setBooleanField(term895, term895.getClass(), "finished", true);
        setShortField(term895, term895.getClass(), "entryFormat", (short) -23481);
        setField(term895, term895.getClass(), "names", term926);
        setLongField(term895, term895.getClass(), "crc", 11315815278355083L);
        setLongField(term895, term895.getClass(), "written", 7735460540091431012L);
        setField(term895, term895.getClass(), "out", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hNxWaHcfhY";
        try {
            callMethod(klass, "writeCString", argTypes, term895, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
