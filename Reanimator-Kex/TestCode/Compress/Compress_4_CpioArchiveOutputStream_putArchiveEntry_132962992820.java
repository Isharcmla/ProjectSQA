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

public class CpioArchiveOutputStream_putArchiveEntry_132962992820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63;

    public CpioArchiveOutputStream_putArchiveEntry_132962992820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term95 = new HashMap();
        term63 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term64 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term102 = (byte[]) newByteArray(4);
        setShortField(term64, term64.getClass(), "fileFormat", (short) 23627);
        setIntField(term64, term64.getClass(), "headerSize", 1484323161);
        setIntField(term64, term64.getClass(), "alignmentBoundary", 391863371);
        setLongField(term64, term64.getClass(), "chksum", -5476826692763582090L);
        setLongField(term64, term64.getClass(), "filesize", -872011222785455006L);
        setLongField(term64, term64.getClass(), "gid", -316468845751588286L);
        setLongField(term64, term64.getClass(), "inode", 5127676408959197577L);
        setLongField(term64, term64.getClass(), "maj", -6573104506744284592L);
        setLongField(term64, term64.getClass(), "min", -4920224193275732920L);
        setLongField(term64, term64.getClass(), "mode", 8428634514691209827L);
        setLongField(term64, term64.getClass(), "mtime", -2585684163342970173L);
        setField(term64, term64.getClass(), "name", "sjlJAEtRrb");
        setLongField(term64, term64.getClass(), "nlink", 8059786003080744426L);
        setLongField(term64, term64.getClass(), "rmaj", -4365849114644724155L);
        setLongField(term64, term64.getClass(), "rmin", 2486810210675247493L);
        setLongField(term64, term64.getClass(), "uid", 7009926388951271268L);
        setField(term63, term63.getClass(), "entry", term64);
        setBooleanField(term63, term63.getClass(), "closed", false);
        setBooleanField(term63, term63.getClass(), "finished", false);
        setShortField(term63, term63.getClass(), "entryFormat", (short) -19694);
        setField(term63, term63.getClass(), "names", term95);
        setLongField(term63, term63.getClass(), "crc", -7672528020740371001L);
        setLongField(term63, term63.getClass(), "written", -4502405999831680926L);
        setField(term63, term63.getClass(), "out", null);
        setByteElement(term102, 0, (byte) -58);
        setByteElement(term102, 1, (byte) -29);
        setByteElement(term102, 2, (byte) -54);
        setByteElement(term102, 3, (byte) -10);
        setField(term63, term63.getClass(), "oneByte", term102);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "putArchiveEntry", argTypes, term63, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


