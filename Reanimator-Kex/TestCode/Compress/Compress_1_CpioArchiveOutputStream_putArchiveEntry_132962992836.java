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

public class CpioArchiveOutputStream_putArchiveEntry_132962992836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term965;

    public CpioArchiveOutputStream_putArchiveEntry_132962992836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term996 = new HashMap();
        term965 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term966 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term966, term966.getClass(), "chksum", 1346299551708610248L);
        setShortField(term966, term966.getClass(), "fileFormat", (short) -9648);
        setLongField(term966, term966.getClass(), "filesize", -7191625829563442696L);
        setLongField(term966, term966.getClass(), "gid", 1463379874413441830L);
        setLongField(term966, term966.getClass(), "headerSize", 7998051124369147543L);
        setLongField(term966, term966.getClass(), "inode", -1481367303699139651L);
        setLongField(term966, term966.getClass(), "maj", -7709317346333670618L);
        setLongField(term966, term966.getClass(), "min", -1964501434345816975L);
        setLongField(term966, term966.getClass(), "mode", 4689907154423223972L);
        setLongField(term966, term966.getClass(), "mtime", 8512025621149521819L);
        setField(term966, term966.getClass(), "name", "RkybSrpybU");
        setLongField(term966, term966.getClass(), "nlink", 2022482096970820459L);
        setLongField(term966, term966.getClass(), "rmaj", 6315101499811179240L);
        setLongField(term966, term966.getClass(), "rmin", -3033337370154155851L);
        setLongField(term966, term966.getClass(), "uid", -3130003589475815807L);
        setField(term965, term965.getClass(), "cpioEntry", term966);
        setBooleanField(term965, term965.getClass(), "closed", true);
        setBooleanField(term965, term965.getClass(), "finished", true);
        setShortField(term965, term965.getClass(), "entryFormat", (short) -9686);
        setField(term965, term965.getClass(), "names", term996);
        setLongField(term965, term965.getClass(), "crc", -5344598381371854750L);
        setLongField(term965, term965.getClass(), "written", -3718250311794019732L);
        setField(term965, term965.getClass(), "out", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "putArchiveEntry", argTypes, term965, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};
