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

public class CpioArchiveOutputStream_writeCString_200903438932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term940;

    public CpioArchiveOutputStream_writeCString_200903438932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term972 = new HashMap();
        term940 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term941 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term979 = (byte[]) newByteArray(3);
        setShortField(term941, term941.getClass(), "fileFormat", (short) 3170);
        setIntField(term941, term941.getClass(), "headerSize", 1962444399);
        setIntField(term941, term941.getClass(), "alignmentBoundary", 767834723);
        setLongField(term941, term941.getClass(), "chksum", -6602460430714339690L);
        setLongField(term941, term941.getClass(), "filesize", 21047099434645581L);
        setLongField(term941, term941.getClass(), "gid", -8862087040734407227L);
        setLongField(term941, term941.getClass(), "inode", -6394943900800506753L);
        setLongField(term941, term941.getClass(), "maj", -4867941246533901410L);
        setLongField(term941, term941.getClass(), "min", 1044883697493326351L);
        setLongField(term941, term941.getClass(), "mode", -7406618974062419277L);
        setLongField(term941, term941.getClass(), "mtime", 868503089567085985L);
        setField(term941, term941.getClass(), "name", "tbcdzjIfER");
        setLongField(term941, term941.getClass(), "nlink", -3277773415369003529L);
        setLongField(term941, term941.getClass(), "rmaj", 1253549421411622358L);
        setLongField(term941, term941.getClass(), "rmin", 3666226122807672448L);
        setLongField(term941, term941.getClass(), "uid", 3108750145697087661L);
        setField(term940, term940.getClass(), "entry", term941);
        setBooleanField(term940, term940.getClass(), "closed", true);
        setBooleanField(term940, term940.getClass(), "finished", true);
        setShortField(term940, term940.getClass(), "entryFormat", (short) -21181);
        setField(term940, term940.getClass(), "names", term972);
        setLongField(term940, term940.getClass(), "crc", 3752337209837437327L);
        setLongField(term940, term940.getClass(), "written", 1860789353508856614L);
        setField(term940, term940.getClass(), "out", null);
        setByteElement(term979, 0, (byte) 61);
        setByteElement(term979, 1, (byte) -92);
        setByteElement(term979, 2, (byte) -42);
        setField(term940, term940.getClass(), "oneByte", term979);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HyxfbSQYBe";
        try {
            callMethod(klass, "writeCString", argTypes, term940, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


