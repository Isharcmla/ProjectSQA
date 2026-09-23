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

public class CpioArchiveInputStream_getNextCPIOEntry_84921757130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403;

    public CpioArchiveInputStream_getNextCPIOEntry_84921757130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term405 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term435 = (byte[]) newByteArray(2);
        byte[] term439 = (byte[]) newByteArray(1);
        byte[] term441 = (byte[]) newByteArray(9);
        byte[] term451 = (byte[]) newByteArray(3);
        byte[] term456 = (byte[]) newByteArray(5);
        setBooleanField(term403, term403.getClass(), "closed", false);
        setShortField(term405, term405.getClass(), "fileFormat", (short) -19694);
        setIntField(term405, term405.getClass(), "headerSize", 1585847225);
        setIntField(term405, term405.getClass(), "alignmentBoundary", 597278769);
        setLongField(term405, term405.getClass(), "chksum", 5953383087795962419L);
        setLongField(term405, term405.getClass(), "filesize", 7994303628307559416L);
        setLongField(term405, term405.getClass(), "gid", 2443640364875054177L);
        setLongField(term405, term405.getClass(), "inode", -1610676979013636850L);
        setLongField(term405, term405.getClass(), "maj", 2062173786000223358L);
        setLongField(term405, term405.getClass(), "min", -8658027316505137504L);
        setLongField(term405, term405.getClass(), "mode", 414749984815662075L);
        setLongField(term405, term405.getClass(), "mtime", 463622836963501975L);
        setField(term405, term405.getClass(), "name", "SzjVpOQTyS");
        setLongField(term405, term405.getClass(), "nlink", 305759998609888272L);
        setLongField(term405, term405.getClass(), "rmaj", -8654565919063661957L);
        setLongField(term405, term405.getClass(), "rmin", -5248475803419977214L);
        setLongField(term405, term405.getClass(), "uid", -6723783499250797216L);
        setField(term403, term403.getClass(), "entry", term405);
        setLongField(term403, term403.getClass(), "entryBytesRead", 41775768178052008L);
        setBooleanField(term403, term403.getClass(), "entryEOF", true);
        setByteElement(term435, 0, (byte) 14);
        setByteElement(term435, 1, (byte) -101);
        setField(term403, term403.getClass(), "tmpbuf", term435);
        setLongField(term403, term403.getClass(), "crc", 6682528376118987775L);
        setField(term403, term403.getClass(), "in", null);
        setByteElement(term439, 0, (byte) 35);
        setField(term403, term403.getClass(), "TWO_BYTES_BUF", term439);
        setByteElement(term441, 0, (byte) 66);
        setByteElement(term441, 1, (byte) 123);
        setByteElement(term441, 2, (byte) -5);
        setByteElement(term441, 3, (byte) 84);
        setByteElement(term441, 4, (byte) -97);
        setByteElement(term441, 5, (byte) -24);
        setByteElement(term441, 6, (byte) 88);
        setByteElement(term441, 7, (byte) 96);
        setByteElement(term441, 8, (byte) 70);
        setField(term403, term403.getClass(), "FOUR_BYTES_BUF", term441);
        setByteElement(term451, 0, (byte) 48);
        setByteElement(term451, 1, (byte) -46);
        setByteElement(term451, 2, (byte) -128);
        setField(term403, term403.getClass(), "SIX_BYTES_BUF", term451);
        setIntField(term403, term403.getClass(), "blockSize", -1685132342);
        setField(term403, term403.getClass(), "zipEncoding", null);
        setByteElement(term456, 0, (byte) 66);
        setByteElement(term456, 1, (byte) -112);
        setByteElement(term456, 2, (byte) 81);
        setByteElement(term456, 3, (byte) 65);
        setByteElement(term456, 4, (byte) -44);
        setField(term403, term403.getClass(), "SINGLE", term456);
        setLongField(term403, term403.getClass(), "bytesRead", 682356318767179819L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNextCPIOEntry", argTypes, term403, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


