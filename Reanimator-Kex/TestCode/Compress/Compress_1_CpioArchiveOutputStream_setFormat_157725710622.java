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
import java.lang.IllegalArgumentException;
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Short;

public class CpioArchiveOutputStream_setFormat_157725710622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51;
     Object term89;

    public CpioArchiveOutputStream_setFormat_157725710622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term82 = new HashMap();
        term51 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term52 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term52, term52.getClass(), "chksum", -872011222785455006L);
        setShortField(term52, term52.getClass(), "fileFormat", (short) 23627);
        setLongField(term52, term52.getClass(), "filesize", -316468845751588286L);
        setLongField(term52, term52.getClass(), "gid", 5127676408959197577L);
        setLongField(term52, term52.getClass(), "headerSize", -6573104506744284592L);
        setLongField(term52, term52.getClass(), "inode", -4920224193275732920L);
        setLongField(term52, term52.getClass(), "maj", 8428634514691209827L);
        setLongField(term52, term52.getClass(), "min", -2585684163342970173L);
        setLongField(term52, term52.getClass(), "mode", 8059786003080744426L);
        setLongField(term52, term52.getClass(), "mtime", -4365849114644724155L);
        setField(term52, term52.getClass(), "name", "sjlJAEtRrb");
        setLongField(term52, term52.getClass(), "nlink", 2486810210675247493L);
        setLongField(term52, term52.getClass(), "rmaj", 7009926388951271268L);
        setLongField(term52, term52.getClass(), "rmin", -7672528020740371001L);
        setLongField(term52, term52.getClass(), "uid", -4502405999831680926L);
        setField(term51, term51.getClass(), "cpioEntry", term52);
        setBooleanField(term51, term51.getClass(), "closed", false);
        setBooleanField(term51, term51.getClass(), "finished", false);
        setShortField(term51, term51.getClass(), "entryFormat", (short) -19694);
        setField(term51, term51.getClass(), "names", term82);
        setLongField(term51, term51.getClass(), "crc", 1967728129628047933L);
        setLongField(term51, term51.getClass(), "written", 2120084523938730454L);
        setField(term51, term51.getClass(), "out", null);
        term89 = new Short((short) 31942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = short.class;
        Object[] args = new Object[1];
        args[0] = term89;
        try {
            callMethod(klass, "setFormat", argTypes, term51, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};
