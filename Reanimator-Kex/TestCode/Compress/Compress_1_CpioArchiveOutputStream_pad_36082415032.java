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
import java.lang.Long;
import java.lang.Integer;

public class CpioArchiveOutputStream_pad_36082415032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term735;
     Object term773;
     Object term775;

    public CpioArchiveOutputStream_pad_36082415032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term766 = new HashMap();
        term735 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term736 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term736, term736.getClass(), "chksum", 8107921244631636572L);
        setShortField(term736, term736.getClass(), "fileFormat", (short) 374);
        setLongField(term736, term736.getClass(), "filesize", -7904053112604879960L);
        setLongField(term736, term736.getClass(), "gid", -6602460430714339690L);
        setLongField(term736, term736.getClass(), "headerSize", 21047099434645581L);
        setLongField(term736, term736.getClass(), "inode", -8862087040734407227L);
        setLongField(term736, term736.getClass(), "maj", -6394943900800506753L);
        setLongField(term736, term736.getClass(), "min", -4867941246533901410L);
        setLongField(term736, term736.getClass(), "mode", 1044883697493326351L);
        setLongField(term736, term736.getClass(), "mtime", -7406618974062419277L);
        setField(term736, term736.getClass(), "name", "ZiaGIbnzTs");
        setLongField(term736, term736.getClass(), "nlink", 868503089567085985L);
        setLongField(term736, term736.getClass(), "rmaj", -3277773415369003529L);
        setLongField(term736, term736.getClass(), "rmin", 1253549421411622358L);
        setLongField(term736, term736.getClass(), "uid", 3666226122807672448L);
        setField(term735, term735.getClass(), "cpioEntry", term736);
        setBooleanField(term735, term735.getClass(), "closed", true);
        setBooleanField(term735, term735.getClass(), "finished", true);
        setShortField(term735, term735.getClass(), "entryFormat", (short) -406);
        setField(term735, term735.getClass(), "names", term766);
        setLongField(term735, term735.getClass(), "crc", 3108750145697087661L);
        setLongField(term735, term735.getClass(), "written", 3752337209837437327L);
        setField(term735, term735.getClass(), "out", null);
        term773 = new Long(1860789353508856614L);
        term775 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term773;
        args[1] = term775;
        try {
            callMethod(klass, "pad", argTypes, term735, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
