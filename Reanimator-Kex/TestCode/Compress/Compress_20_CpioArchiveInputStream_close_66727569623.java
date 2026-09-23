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

public class CpioArchiveInputStream_close_66727569623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87;

    public CpioArchiveInputStream_close_66727569623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term89 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term119 = (byte[]) newByteArray(6);
        byte[] term127 = (byte[]) newByteArray(2);
        byte[] term130 = (byte[]) newByteArray(6);
        byte[] term137 = (byte[]) newByteArray(7);
        byte[] term146 = (byte[]) newByteArray(1);
        setBooleanField(term87, term87.getClass(), "closed", false);
        setShortField(term89, term89.getClass(), "fileFormat", (short) -10960);
        setIntField(term89, term89.getClass(), "headerSize", -1922583790);
        setIntField(term89, term89.getClass(), "alignmentBoundary", -616727354);
        setLongField(term89, term89.getClass(), "chksum", -872011222785455006L);
        setLongField(term89, term89.getClass(), "filesize", -316468845751588286L);
        setLongField(term89, term89.getClass(), "gid", 5127676408959197577L);
        setLongField(term89, term89.getClass(), "inode", -6573104506744284592L);
        setLongField(term89, term89.getClass(), "maj", -4920224193275732920L);
        setLongField(term89, term89.getClass(), "min", 8428634514691209827L);
        setLongField(term89, term89.getClass(), "mode", -2585684163342970173L);
        setLongField(term89, term89.getClass(), "mtime", 8059786003080744426L);
        setField(term89, term89.getClass(), "name", "sjlJAEtRrb");
        setLongField(term89, term89.getClass(), "nlink", -4365849114644724155L);
        setLongField(term89, term89.getClass(), "rmaj", 2486810210675247493L);
        setLongField(term89, term89.getClass(), "rmin", 7009926388951271268L);
        setLongField(term89, term89.getClass(), "uid", -7672528020740371001L);
        setField(term87, term87.getClass(), "entry", term89);
        setLongField(term87, term87.getClass(), "entryBytesRead", -4502405999831680926L);
        setBooleanField(term87, term87.getClass(), "entryEOF", false);
        setByteElement(term119, 0, (byte) 67);
        setByteElement(term119, 1, (byte) 78);
        setByteElement(term119, 2, (byte) 87);
        setByteElement(term119, 3, (byte) 121);
        setByteElement(term119, 4, (byte) -99);
        setByteElement(term119, 5, (byte) -2);
        setField(term87, term87.getClass(), "tmpbuf", term119);
        setLongField(term87, term87.getClass(), "crc", 1967728129628047933L);
        setField(term87, term87.getClass(), "in", null);
        setByteElement(term127, 0, (byte) -16);
        setByteElement(term127, 1, (byte) -112);
        setField(term87, term87.getClass(), "TWO_BYTES_BUF", term127);
        setByteElement(term130, 0, (byte) -111);
        setByteElement(term130, 1, (byte) 23);
        setByteElement(term130, 2, (byte) -15);
        setByteElement(term130, 3, (byte) 36);
        setByteElement(term130, 4, (byte) 118);
        setByteElement(term130, 5, (byte) 106);
        setField(term87, term87.getClass(), "FOUR_BYTES_BUF", term130);
        setByteElement(term137, 0, (byte) 98);
        setByteElement(term137, 1, (byte) 67);
        setByteElement(term137, 2, (byte) 66);
        setByteElement(term137, 3, (byte) -121);
        setByteElement(term137, 4, (byte) -119);
        setByteElement(term137, 5, (byte) 71);
        setByteElement(term137, 6, (byte) 80);
        setField(term87, term87.getClass(), "SIX_BYTES_BUF", term137);
        setIntField(term87, term87.getClass(), "blockSize", -1955890973);
        setByteElement(term146, 0, (byte) 42);
        setField(term87, term87.getClass(), "SINGLE", term146);
        setLongField(term87, term87.getClass(), "bytesRead", 2120084523938730454L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term87, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


