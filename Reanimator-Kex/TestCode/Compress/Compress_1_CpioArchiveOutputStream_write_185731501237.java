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
import java.lang.Integer;

public class CpioArchiveOutputStream_write_185731501237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1013;
     Object term1051;

    public CpioArchiveOutputStream_write_185731501237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1044 = new HashMap();
        term1013 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term1014 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term1014, term1014.getClass(), "chksum", -5935517391653614345L);
        setShortField(term1014, term1014.getClass(), "fileFormat", (short) 23624);
        setLongField(term1014, term1014.getClass(), "filesize", -6521561238735301071L);
        setLongField(term1014, term1014.getClass(), "gid", -6609679920238945303L);
        setLongField(term1014, term1014.getClass(), "headerSize", -7296330380944173376L);
        setLongField(term1014, term1014.getClass(), "inode", -8890284990655172580L);
        setLongField(term1014, term1014.getClass(), "maj", -5951743062322506095L);
        setLongField(term1014, term1014.getClass(), "min", 768144790810175653L);
        setLongField(term1014, term1014.getClass(), "mode", -1497280900081695731L);
        setLongField(term1014, term1014.getClass(), "mtime", -3602825674339018793L);
        setField(term1014, term1014.getClass(), "name", "xOEqzGAmDU");
        setLongField(term1014, term1014.getClass(), "nlink", 3086974592680165932L);
        setLongField(term1014, term1014.getClass(), "rmaj", -532956263280568707L);
        setLongField(term1014, term1014.getClass(), "rmin", 6073193746616629086L);
        setLongField(term1014, term1014.getClass(), "uid", -2463629530824341661L);
        setField(term1013, term1013.getClass(), "cpioEntry", term1014);
        setBooleanField(term1013, term1013.getClass(), "closed", false);
        setBooleanField(term1013, term1013.getClass(), "finished", true);
        setShortField(term1013, term1013.getClass(), "entryFormat", (short) -31121);
        setField(term1013, term1013.getClass(), "names", term1044);
        setLongField(term1013, term1013.getClass(), "crc", 7800835025296877231L);
        setLongField(term1013, term1013.getClass(), "written", -187772971269812453L);
        setField(term1013, term1013.getClass(), "out", null);
        term1051 = new Integer(-1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1051;
        try {
            callMethod(klass, "write", argTypes, term1013, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
