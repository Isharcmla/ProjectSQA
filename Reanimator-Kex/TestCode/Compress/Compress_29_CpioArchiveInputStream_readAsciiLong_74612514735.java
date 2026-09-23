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

public class CpioArchiveInputStream_readAsciiLong_74612514735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term913;
     Object term984;
     Object term986;

    public CpioArchiveInputStream_readAsciiLong_74612514735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term913 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term915 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term945 = (byte[]) newByteArray(8);
        byte[] term955 = (byte[]) newByteArray(9);
        byte[] term965 = (byte[]) newByteArray(7);
        byte[] term973 = (byte[]) newByteArray(3);
        byte[] term978 = (byte[]) newByteArray(4);
        setBooleanField(term913, term913.getClass(), "closed", false);
        setShortField(term915, term915.getClass(), "fileFormat", (short) -26033);
        setIntField(term915, term915.getClass(), "headerSize", -1087774327);
        setIntField(term915, term915.getClass(), "alignmentBoundary", -1530420153);
        setLongField(term915, term915.getClass(), "chksum", 855932984568615096L);
        setLongField(term915, term915.getClass(), "filesize", -1616722610139554082L);
        setLongField(term915, term915.getClass(), "gid", 7495904023107549024L);
        setLongField(term915, term915.getClass(), "inode", 8802866251294305945L);
        setLongField(term915, term915.getClass(), "maj", 4513004407927379358L);
        setLongField(term915, term915.getClass(), "min", -7115418542247301000L);
        setLongField(term915, term915.getClass(), "mode", 8034714140377562739L);
        setLongField(term915, term915.getClass(), "mtime", -2924531382671518368L);
        setField(term915, term915.getClass(), "name", "uuaPigETmJ");
        setLongField(term915, term915.getClass(), "nlink", -3948863953565024517L);
        setLongField(term915, term915.getClass(), "rmaj", -6587807377747738663L);
        setLongField(term915, term915.getClass(), "rmin", -6301101997917060727L);
        setLongField(term915, term915.getClass(), "uid", 8166095254618543564L);
        setField(term913, term913.getClass(), "entry", term915);
        setLongField(term913, term913.getClass(), "entryBytesRead", -4598158870068953328L);
        setBooleanField(term913, term913.getClass(), "entryEOF", true);
        setByteElement(term945, 0, (byte) -95);
        setByteElement(term945, 1, (byte) -6);
        setByteElement(term945, 2, (byte) 51);
        setByteElement(term945, 3, (byte) 122);
        setByteElement(term945, 4, (byte) 84);
        setByteElement(term945, 5, (byte) -36);
        setByteElement(term945, 6, (byte) 103);
        setByteElement(term945, 7, (byte) -63);
        setField(term913, term913.getClass(), "tmpbuf", term945);
        setLongField(term913, term913.getClass(), "crc", 138235087558060686L);
        setField(term913, term913.getClass(), "in", null);
        setByteElement(term955, 0, (byte) 39);
        setByteElement(term955, 1, (byte) -54);
        setByteElement(term955, 2, (byte) 9);
        setByteElement(term955, 3, (byte) 19);
        setByteElement(term955, 4, (byte) -103);
        setByteElement(term955, 5, (byte) 61);
        setByteElement(term955, 6, (byte) -90);
        setByteElement(term955, 7, (byte) -27);
        setByteElement(term955, 8, (byte) 119);
        setField(term913, term913.getClass(), "TWO_BYTES_BUF", term955);
        setByteElement(term965, 0, (byte) -125);
        setByteElement(term965, 1, (byte) 100);
        setByteElement(term965, 2, (byte) -1);
        setByteElement(term965, 3, (byte) -127);
        setByteElement(term965, 4, (byte) -118);
        setByteElement(term965, 5, (byte) 69);
        setByteElement(term965, 6, (byte) 112);
        setField(term913, term913.getClass(), "FOUR_BYTES_BUF", term965);
        setByteElement(term973, 0, (byte) 77);
        setByteElement(term973, 1, (byte) -1);
        setByteElement(term973, 2, (byte) -83);
        setField(term913, term913.getClass(), "SIX_BYTES_BUF", term973);
        setIntField(term913, term913.getClass(), "blockSize", -469968304);
        setField(term913, term913.getClass(), "zipEncoding", null);
        setByteElement(term978, 0, (byte) -63);
        setByteElement(term978, 1, (byte) 108);
        setByteElement(term978, 2, (byte) -105);
        setByteElement(term978, 3, (byte) 33);
        setField(term913, term913.getClass(), "SINGLE", term978);
        setLongField(term913, term913.getClass(), "bytesRead", 5381386339318883012L);
        term984 = new Integer(-1145578966);
        term986 = new Integer(679763016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term984;
        args[1] = term986;
        try {
            callMethod(klass, "readAsciiLong", argTypes, term913, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


