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

public class CpioArchiveInputStream_getNextCPIOEntry_84921757126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357;

    public CpioArchiveInputStream_getNextCPIOEntry_84921757126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term357 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term359 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term389 = (byte[]) newByteArray(2);
        byte[] term393 = (byte[]) newByteArray(1);
        byte[] term395 = (byte[]) newByteArray(9);
        byte[] term405 = (byte[]) newByteArray(3);
        byte[] term410 = (byte[]) newByteArray(5);
        setBooleanField(term357, term357.getClass(), "closed", false);
        setShortField(term359, term359.getClass(), "fileFormat", (short) -19694);
        setIntField(term359, term359.getClass(), "headerSize", -883034806);
        setIntField(term359, term359.getClass(), "alignmentBoundary", 1585847225);
        setLongField(term359, term359.getClass(), "chksum", 5953383087795962419L);
        setLongField(term359, term359.getClass(), "filesize", 7994303628307559416L);
        setLongField(term359, term359.getClass(), "gid", 2443640364875054177L);
        setLongField(term359, term359.getClass(), "inode", -1610676979013636850L);
        setLongField(term359, term359.getClass(), "maj", 2062173786000223358L);
        setLongField(term359, term359.getClass(), "min", -8658027316505137504L);
        setLongField(term359, term359.getClass(), "mode", 414749984815662075L);
        setLongField(term359, term359.getClass(), "mtime", 463622836963501975L);
        setField(term359, term359.getClass(), "name", "jJCZpVmanW");
        setLongField(term359, term359.getClass(), "nlink", 305759998609888272L);
        setLongField(term359, term359.getClass(), "rmaj", -8654565919063661957L);
        setLongField(term359, term359.getClass(), "rmin", -5248475803419977214L);
        setLongField(term359, term359.getClass(), "uid", -6723783499250797216L);
        setField(term357, term357.getClass(), "entry", term359);
        setLongField(term357, term357.getClass(), "entryBytesRead", 41775768178052008L);
        setBooleanField(term357, term357.getClass(), "entryEOF", true);
        setByteElement(term389, 0, (byte) 14);
        setByteElement(term389, 1, (byte) -101);
        setField(term357, term357.getClass(), "tmpbuf", term389);
        setLongField(term357, term357.getClass(), "crc", 6682528376118987775L);
        setField(term357, term357.getClass(), "in", null);
        setByteElement(term393, 0, (byte) 35);
        setField(term357, term357.getClass(), "TWO_BYTES_BUF", term393);
        setByteElement(term395, 0, (byte) 66);
        setByteElement(term395, 1, (byte) 123);
        setByteElement(term395, 2, (byte) -5);
        setByteElement(term395, 3, (byte) 84);
        setByteElement(term395, 4, (byte) -97);
        setByteElement(term395, 5, (byte) -24);
        setByteElement(term395, 6, (byte) 88);
        setByteElement(term395, 7, (byte) 96);
        setByteElement(term395, 8, (byte) 70);
        setField(term357, term357.getClass(), "FOUR_BYTES_BUF", term395);
        setByteElement(term405, 0, (byte) 48);
        setByteElement(term405, 1, (byte) -46);
        setByteElement(term405, 2, (byte) -128);
        setField(term357, term357.getClass(), "SIX_BYTES_BUF", term405);
        setIntField(term357, term357.getClass(), "blockSize", 597278769);
        setByteElement(term410, 0, (byte) 66);
        setByteElement(term410, 1, (byte) -112);
        setByteElement(term410, 2, (byte) 81);
        setByteElement(term410, 3, (byte) 65);
        setByteElement(term410, 4, (byte) -44);
        setField(term357, term357.getClass(), "SINGLE", term410);
        setLongField(term357, term357.getClass(), "bytesRead", 682356318767179819L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNextCPIOEntry", argTypes, term357, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


