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
import java.lang.Boolean;

public class CpioArchiveInputStream_readOldBinaryEntry_174020098334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1179;
     Object term1247;

    public CpioArchiveInputStream_readOldBinaryEntry_174020098334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1179 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term1181 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term1211 = (byte[]) newByteArray(9);
        byte[] term1222 = (byte[]) newByteArray(7);
        byte[] term1230 = (byte[]) newByteArray(6);
        byte[] term1237 = (byte[]) newByteArray(6);
        byte[] term1245 = (byte[]) newByteArray(0);
        setBooleanField(term1179, term1179.getClass(), "closed", false);
        setShortField(term1181, term1181.getClass(), "fileFormat", (short) 21075);
        setIntField(term1181, term1181.getClass(), "headerSize", -817164822);
        setIntField(term1181, term1181.getClass(), "alignmentBoundary", -1016503459);
        setLongField(term1181, term1181.getClass(), "chksum", 3090901538358721367L);
        setLongField(term1181, term1181.getClass(), "filesize", -1677189124507026637L);
        setLongField(term1181, term1181.getClass(), "gid", 4795660804170399986L);
        setLongField(term1181, term1181.getClass(), "inode", -4030863184426321096L);
        setLongField(term1181, term1181.getClass(), "maj", -8010214112439224349L);
        setLongField(term1181, term1181.getClass(), "min", -6673920710396545553L);
        setLongField(term1181, term1181.getClass(), "mode", 3412644969878030772L);
        setLongField(term1181, term1181.getClass(), "mtime", 6698455537431331246L);
        setField(term1181, term1181.getClass(), "name", "MxlszYVzRf");
        setLongField(term1181, term1181.getClass(), "nlink", -8327432141027603933L);
        setLongField(term1181, term1181.getClass(), "rmaj", -433040798405298080L);
        setLongField(term1181, term1181.getClass(), "rmin", -1505191021111100819L);
        setLongField(term1181, term1181.getClass(), "uid", -1000830646340880796L);
        setField(term1179, term1179.getClass(), "entry", term1181);
        setLongField(term1179, term1179.getClass(), "entryBytesRead", 5973526439563541711L);
        setBooleanField(term1179, term1179.getClass(), "entryEOF", false);
        setByteElement(term1211, 0, (byte) -103);
        setByteElement(term1211, 1, (byte) -103);
        setByteElement(term1211, 2, (byte) -98);
        setByteElement(term1211, 3, (byte) -119);
        setByteElement(term1211, 4, (byte) 120);
        setByteElement(term1211, 5, (byte) -15);
        setByteElement(term1211, 6, (byte) 115);
        setByteElement(term1211, 7, (byte) 52);
        setByteElement(term1211, 8, (byte) 96);
        setField(term1179, term1179.getClass(), "tmpbuf", term1211);
        setLongField(term1179, term1179.getClass(), "crc", 5246058710498845622L);
        setField(term1179, term1179.getClass(), "in", null);
        setByteElement(term1222, 0, (byte) 40);
        setByteElement(term1222, 1, (byte) -5);
        setByteElement(term1222, 2, (byte) 24);
        setByteElement(term1222, 3, (byte) -39);
        setByteElement(term1222, 4, (byte) 30);
        setByteElement(term1222, 5, (byte) -119);
        setByteElement(term1222, 6, (byte) 94);
        setField(term1179, term1179.getClass(), "TWO_BYTES_BUF", term1222);
        setByteElement(term1230, 0, (byte) -52);
        setByteElement(term1230, 1, (byte) -33);
        setByteElement(term1230, 2, (byte) 16);
        setByteElement(term1230, 3, (byte) 20);
        setByteElement(term1230, 4, (byte) -114);
        setByteElement(term1230, 5, (byte) 93);
        setField(term1179, term1179.getClass(), "FOUR_BYTES_BUF", term1230);
        setByteElement(term1237, 0, (byte) -60);
        setByteElement(term1237, 1, (byte) -4);
        setByteElement(term1237, 2, (byte) 28);
        setByteElement(term1237, 3, (byte) 94);
        setByteElement(term1237, 5, (byte) -96);
        setField(term1179, term1179.getClass(), "SIX_BYTES_BUF", term1237);
        setIntField(term1179, term1179.getClass(), "blockSize", -1968847291);
        setField(term1179, term1179.getClass(), "SINGLE", term1245);
        setLongField(term1179, term1179.getClass(), "bytesRead", 4394651392080968777L);
        term1247 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1247;
        try {
            callMethod(klass, "readOldBinaryEntry", argTypes, term1179, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


