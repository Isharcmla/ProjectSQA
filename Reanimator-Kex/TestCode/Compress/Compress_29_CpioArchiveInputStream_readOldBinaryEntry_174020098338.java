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

public class CpioArchiveInputStream_readOldBinaryEntry_174020098338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1225;
     Object term1293;

    public CpioArchiveInputStream_readOldBinaryEntry_174020098338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1225 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term1227 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term1257 = (byte[]) newByteArray(9);
        byte[] term1268 = (byte[]) newByteArray(7);
        byte[] term1276 = (byte[]) newByteArray(6);
        byte[] term1283 = (byte[]) newByteArray(6);
        byte[] term1291 = (byte[]) newByteArray(0);
        setBooleanField(term1225, term1225.getClass(), "closed", false);
        setShortField(term1227, term1227.getClass(), "fileFormat", (short) 21075);
        setIntField(term1227, term1227.getClass(), "headerSize", -1016503459);
        setIntField(term1227, term1227.getClass(), "alignmentBoundary", -1968847291);
        setLongField(term1227, term1227.getClass(), "chksum", 3090901538358721367L);
        setLongField(term1227, term1227.getClass(), "filesize", -1677189124507026637L);
        setLongField(term1227, term1227.getClass(), "gid", 4795660804170399986L);
        setLongField(term1227, term1227.getClass(), "inode", -4030863184426321096L);
        setLongField(term1227, term1227.getClass(), "maj", -8010214112439224349L);
        setLongField(term1227, term1227.getClass(), "min", -6673920710396545553L);
        setLongField(term1227, term1227.getClass(), "mode", 3412644969878030772L);
        setLongField(term1227, term1227.getClass(), "mtime", 6698455537431331246L);
        setField(term1227, term1227.getClass(), "name", "oVcInYnLWB");
        setLongField(term1227, term1227.getClass(), "nlink", -8327432141027603933L);
        setLongField(term1227, term1227.getClass(), "rmaj", -433040798405298080L);
        setLongField(term1227, term1227.getClass(), "rmin", -1505191021111100819L);
        setLongField(term1227, term1227.getClass(), "uid", -1000830646340880796L);
        setField(term1225, term1225.getClass(), "entry", term1227);
        setLongField(term1225, term1225.getClass(), "entryBytesRead", 5973526439563541711L);
        setBooleanField(term1225, term1225.getClass(), "entryEOF", false);
        setByteElement(term1257, 0, (byte) -103);
        setByteElement(term1257, 1, (byte) -103);
        setByteElement(term1257, 2, (byte) -98);
        setByteElement(term1257, 3, (byte) -119);
        setByteElement(term1257, 4, (byte) 120);
        setByteElement(term1257, 5, (byte) -15);
        setByteElement(term1257, 6, (byte) 115);
        setByteElement(term1257, 7, (byte) 52);
        setByteElement(term1257, 8, (byte) 96);
        setField(term1225, term1225.getClass(), "tmpbuf", term1257);
        setLongField(term1225, term1225.getClass(), "crc", 5246058710498845622L);
        setField(term1225, term1225.getClass(), "in", null);
        setByteElement(term1268, 0, (byte) 40);
        setByteElement(term1268, 1, (byte) -5);
        setByteElement(term1268, 2, (byte) 24);
        setByteElement(term1268, 3, (byte) -39);
        setByteElement(term1268, 4, (byte) 30);
        setByteElement(term1268, 5, (byte) -119);
        setByteElement(term1268, 6, (byte) 94);
        setField(term1225, term1225.getClass(), "TWO_BYTES_BUF", term1268);
        setByteElement(term1276, 0, (byte) -52);
        setByteElement(term1276, 1, (byte) -33);
        setByteElement(term1276, 2, (byte) 16);
        setByteElement(term1276, 3, (byte) 20);
        setByteElement(term1276, 4, (byte) -114);
        setByteElement(term1276, 5, (byte) 93);
        setField(term1225, term1225.getClass(), "FOUR_BYTES_BUF", term1276);
        setByteElement(term1283, 0, (byte) -60);
        setByteElement(term1283, 1, (byte) -4);
        setByteElement(term1283, 2, (byte) 28);
        setByteElement(term1283, 3, (byte) 94);
        setByteElement(term1283, 5, (byte) -96);
        setField(term1225, term1225.getClass(), "SIX_BYTES_BUF", term1283);
        setIntField(term1225, term1225.getClass(), "blockSize", 579005622);
        setField(term1225, term1225.getClass(), "zipEncoding", null);
        setField(term1225, term1225.getClass(), "SINGLE", term1291);
        setLongField(term1225, term1225.getClass(), "bytesRead", 4394651392080968777L);
        term1293 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1293;
        try {
            callMethod(klass, "readOldBinaryEntry", argTypes, term1225, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


