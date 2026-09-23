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

public class CpioArchiveInputStream_ensureOpen_63774294425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273;

    public CpioArchiveInputStream_ensureOpen_63774294425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term275 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term305 = (byte[]) newByteArray(1);
        byte[] term308 = (byte[]) newByteArray(0);
        byte[] term309 = (byte[]) newByteArray(2);
        byte[] term312 = (byte[]) newByteArray(8);
        byte[] term322 = (byte[]) newByteArray(6);
        setBooleanField(term273, term273.getClass(), "closed", true);
        setShortField(term275, term275.getClass(), "fileFormat", (short) 23627);
        setIntField(term275, term275.getClass(), "headerSize", 1725571209);
        setIntField(term275, term275.getClass(), "alignmentBoundary", -522618178);
        setLongField(term275, term275.getClass(), "chksum", -7612550318181586304L);
        setLongField(term275, term275.getClass(), "filesize", -2170847986967241072L);
        setLongField(term275, term275.getClass(), "gid", 4044358158040652353L);
        setLongField(term275, term275.getClass(), "inode", -4443169559037975007L);
        setLongField(term275, term275.getClass(), "maj", -3842548265506930260L);
        setLongField(term275, term275.getClass(), "min", -5788180182343976541L);
        setLongField(term275, term275.getClass(), "mode", 2936323121573284007L);
        setLongField(term275, term275.getClass(), "mtime", -1154553077993834885L);
        setField(term275, term275.getClass(), "name", "xxtlPwDYFs");
        setLongField(term275, term275.getClass(), "nlink", -2850532706972744550L);
        setLongField(term275, term275.getClass(), "rmaj", -2644215923136513282L);
        setLongField(term275, term275.getClass(), "rmin", -1468719814009985452L);
        setLongField(term275, term275.getClass(), "uid", -7738503207562305297L);
        setField(term273, term273.getClass(), "entry", term275);
        setLongField(term273, term273.getClass(), "entryBytesRead", 3825396310311739952L);
        setBooleanField(term273, term273.getClass(), "entryEOF", true);
        setByteElement(term305, 0, (byte) 116);
        setField(term273, term273.getClass(), "tmpbuf", term305);
        setLongField(term273, term273.getClass(), "crc", -3838084482494604218L);
        setField(term273, term273.getClass(), "in", null);
        setField(term273, term273.getClass(), "TWO_BYTES_BUF", term308);
        setByteElement(term309, 0, (byte) -81);
        setByteElement(term309, 1, (byte) 102);
        setField(term273, term273.getClass(), "FOUR_BYTES_BUF", term309);
        setByteElement(term312, 0, (byte) -118);
        setByteElement(term312, 1, (byte) -126);
        setByteElement(term312, 2, (byte) -91);
        setByteElement(term312, 3, (byte) -104);
        setByteElement(term312, 4, (byte) -89);
        setByteElement(term312, 5, (byte) 13);
        setByteElement(term312, 6, (byte) 44);
        setByteElement(term312, 7, (byte) -63);
        setField(term273, term273.getClass(), "SIX_BYTES_BUF", term312);
        setIntField(term273, term273.getClass(), "blockSize", 1134449235);
        setByteElement(term322, 0, (byte) 15);
        setByteElement(term322, 1, (byte) 45);
        setByteElement(term322, 2, (byte) -39);
        setByteElement(term322, 3, (byte) -20);
        setByteElement(term322, 4, (byte) 10);
        setByteElement(term322, 5, (byte) 77);
        setField(term273, term273.getClass(), "SINGLE", term322);
        setLongField(term273, term273.getClass(), "bytesRead", 3892018155439224435L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "ensureOpen", argTypes, term273, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


