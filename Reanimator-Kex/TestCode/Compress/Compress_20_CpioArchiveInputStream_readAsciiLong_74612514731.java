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
import java.lang.NegativeArraySizeException;
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class CpioArchiveInputStream_readAsciiLong_74612514731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term867;
     Object term938;
     Object term940;

    public CpioArchiveInputStream_readAsciiLong_74612514731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term867 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term869 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term899 = (byte[]) newByteArray(8);
        byte[] term909 = (byte[]) newByteArray(9);
        byte[] term919 = (byte[]) newByteArray(7);
        byte[] term927 = (byte[]) newByteArray(3);
        byte[] term932 = (byte[]) newByteArray(4);
        setBooleanField(term867, term867.getClass(), "closed", false);
        setShortField(term869, term869.getClass(), "fileFormat", (short) -26033);
        setIntField(term869, term869.getClass(), "headerSize", 1193880199);
        setIntField(term869, term869.getClass(), "alignmentBoundary", -1087774327);
        setLongField(term869, term869.getClass(), "chksum", 855932984568615096L);
        setLongField(term869, term869.getClass(), "filesize", -1616722610139554082L);
        setLongField(term869, term869.getClass(), "gid", 7495904023107549024L);
        setLongField(term869, term869.getClass(), "inode", 8802866251294305945L);
        setLongField(term869, term869.getClass(), "maj", 4513004407927379358L);
        setLongField(term869, term869.getClass(), "min", -7115418542247301000L);
        setLongField(term869, term869.getClass(), "mode", 8034714140377562739L);
        setLongField(term869, term869.getClass(), "mtime", -2924531382671518368L);
        setField(term869, term869.getClass(), "name", "RMFIsYGgne");
        setLongField(term869, term869.getClass(), "nlink", -3948863953565024517L);
        setLongField(term869, term869.getClass(), "rmaj", -6587807377747738663L);
        setLongField(term869, term869.getClass(), "rmin", -6301101997917060727L);
        setLongField(term869, term869.getClass(), "uid", 8166095254618543564L);
        setField(term867, term867.getClass(), "entry", term869);
        setLongField(term867, term867.getClass(), "entryBytesRead", -4598158870068953328L);
        setBooleanField(term867, term867.getClass(), "entryEOF", true);
        setByteElement(term899, 0, (byte) -95);
        setByteElement(term899, 1, (byte) -6);
        setByteElement(term899, 2, (byte) 51);
        setByteElement(term899, 3, (byte) 122);
        setByteElement(term899, 4, (byte) 84);
        setByteElement(term899, 5, (byte) -36);
        setByteElement(term899, 6, (byte) 103);
        setByteElement(term899, 7, (byte) -63);
        setField(term867, term867.getClass(), "tmpbuf", term899);
        setLongField(term867, term867.getClass(), "crc", 138235087558060686L);
        setField(term867, term867.getClass(), "in", null);
        setByteElement(term909, 0, (byte) 39);
        setByteElement(term909, 1, (byte) -54);
        setByteElement(term909, 2, (byte) 9);
        setByteElement(term909, 3, (byte) 19);
        setByteElement(term909, 4, (byte) -103);
        setByteElement(term909, 5, (byte) 61);
        setByteElement(term909, 6, (byte) -90);
        setByteElement(term909, 7, (byte) -27);
        setByteElement(term909, 8, (byte) 119);
        setField(term867, term867.getClass(), "TWO_BYTES_BUF", term909);
        setByteElement(term919, 0, (byte) -125);
        setByteElement(term919, 1, (byte) 100);
        setByteElement(term919, 2, (byte) -1);
        setByteElement(term919, 3, (byte) -127);
        setByteElement(term919, 4, (byte) -118);
        setByteElement(term919, 5, (byte) 69);
        setByteElement(term919, 6, (byte) 112);
        setField(term867, term867.getClass(), "FOUR_BYTES_BUF", term919);
        setByteElement(term927, 0, (byte) 77);
        setByteElement(term927, 1, (byte) -1);
        setByteElement(term927, 2, (byte) -83);
        setField(term867, term867.getClass(), "SIX_BYTES_BUF", term927);
        setIntField(term867, term867.getClass(), "blockSize", -1530420153);
        setByteElement(term932, 0, (byte) -63);
        setByteElement(term932, 1, (byte) 108);
        setByteElement(term932, 2, (byte) -105);
        setByteElement(term932, 3, (byte) 33);
        setField(term867, term867.getClass(), "SINGLE", term932);
        setLongField(term867, term867.getClass(), "bytesRead", 5381386339318883012L);
        term938 = new Integer(-469968304);
        term940 = new Integer(-1145578966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term938;
        args[1] = term940;
        try {
            callMethod(klass, "readAsciiLong", argTypes, term867, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


