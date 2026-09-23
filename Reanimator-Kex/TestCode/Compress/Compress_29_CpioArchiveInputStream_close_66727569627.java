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

public class CpioArchiveInputStream_close_66727569627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133;

    public CpioArchiveInputStream_close_66727569627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term135 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term165 = (byte[]) newByteArray(6);
        byte[] term173 = (byte[]) newByteArray(2);
        byte[] term176 = (byte[]) newByteArray(6);
        byte[] term183 = (byte[]) newByteArray(7);
        byte[] term192 = (byte[]) newByteArray(1);
        setBooleanField(term133, term133.getClass(), "closed", false);
        setShortField(term135, term135.getClass(), "fileFormat", (short) -10960);
        setIntField(term135, term135.getClass(), "headerSize", -616727354);
        setIntField(term135, term135.getClass(), "alignmentBoundary", -1955890973);
        setLongField(term135, term135.getClass(), "chksum", -872011222785455006L);
        setLongField(term135, term135.getClass(), "filesize", -316468845751588286L);
        setLongField(term135, term135.getClass(), "gid", 5127676408959197577L);
        setLongField(term135, term135.getClass(), "inode", -6573104506744284592L);
        setLongField(term135, term135.getClass(), "maj", -4920224193275732920L);
        setLongField(term135, term135.getClass(), "min", 8428634514691209827L);
        setLongField(term135, term135.getClass(), "mode", -2585684163342970173L);
        setLongField(term135, term135.getClass(), "mtime", 8059786003080744426L);
        setField(term135, term135.getClass(), "name", "xxtlPwDYFs");
        setLongField(term135, term135.getClass(), "nlink", -4365849114644724155L);
        setLongField(term135, term135.getClass(), "rmaj", 2486810210675247493L);
        setLongField(term135, term135.getClass(), "rmin", 7009926388951271268L);
        setLongField(term135, term135.getClass(), "uid", -7672528020740371001L);
        setField(term133, term133.getClass(), "entry", term135);
        setLongField(term133, term133.getClass(), "entryBytesRead", -4502405999831680926L);
        setBooleanField(term133, term133.getClass(), "entryEOF", false);
        setByteElement(term165, 0, (byte) 67);
        setByteElement(term165, 1, (byte) 78);
        setByteElement(term165, 2, (byte) 87);
        setByteElement(term165, 3, (byte) 121);
        setByteElement(term165, 4, (byte) -99);
        setByteElement(term165, 5, (byte) -2);
        setField(term133, term133.getClass(), "tmpbuf", term165);
        setLongField(term133, term133.getClass(), "crc", 1967728129628047933L);
        setField(term133, term133.getClass(), "in", null);
        setByteElement(term173, 0, (byte) -16);
        setByteElement(term173, 1, (byte) -112);
        setField(term133, term133.getClass(), "TWO_BYTES_BUF", term173);
        setByteElement(term176, 0, (byte) -111);
        setByteElement(term176, 1, (byte) 23);
        setByteElement(term176, 2, (byte) -15);
        setByteElement(term176, 3, (byte) 36);
        setByteElement(term176, 4, (byte) 118);
        setByteElement(term176, 5, (byte) 106);
        setField(term133, term133.getClass(), "FOUR_BYTES_BUF", term176);
        setByteElement(term183, 0, (byte) 98);
        setByteElement(term183, 1, (byte) 67);
        setByteElement(term183, 2, (byte) 66);
        setByteElement(term183, 3, (byte) -121);
        setByteElement(term183, 4, (byte) -119);
        setByteElement(term183, 5, (byte) 71);
        setByteElement(term183, 6, (byte) 80);
        setField(term133, term133.getClass(), "SIX_BYTES_BUF", term183);
        setIntField(term133, term133.getClass(), "blockSize", -2038273078);
        setField(term133, term133.getClass(), "zipEncoding", null);
        setByteElement(term192, 0, (byte) 42);
        setField(term133, term133.getClass(), "SINGLE", term192);
        setLongField(term133, term133.getClass(), "bytesRead", 2120084523938730454L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term133, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


