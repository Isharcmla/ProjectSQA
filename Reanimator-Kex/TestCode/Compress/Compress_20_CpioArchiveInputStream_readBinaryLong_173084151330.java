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
import java.lang.Boolean;

public class CpioArchiveInputStream_readBinaryLong_173084151330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term763;
     Object term828;
     Object term830;

    public CpioArchiveInputStream_readBinaryLong_173084151330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term763 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term765 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term795 = (byte[]) newByteArray(6);
        byte[] term803 = (byte[]) newByteArray(2);
        byte[] term806 = (byte[]) newByteArray(8);
        byte[] term815 = (byte[]) newByteArray(3);
        byte[] term820 = (byte[]) newByteArray(6);
        setBooleanField(term763, term763.getClass(), "closed", true);
        setShortField(term765, term765.getClass(), "fileFormat", (short) 7670);
        setIntField(term765, term765.getClass(), "headerSize", -203030934);
        setIntField(term765, term765.getClass(), "alignmentBoundary", -1179120542);
        setLongField(term765, term765.getClass(), "chksum", 5671808784468963649L);
        setLongField(term765, term765.getClass(), "filesize", 2297097306706899827L);
        setLongField(term765, term765.getClass(), "gid", -900457279156388404L);
        setLongField(term765, term765.getClass(), "inode", 1084801489398441516L);
        setLongField(term765, term765.getClass(), "maj", 6273754186658578034L);
        setLongField(term765, term765.getClass(), "min", 3620247240684476031L);
        setLongField(term765, term765.getClass(), "mode", 8313800941204938919L);
        setLongField(term765, term765.getClass(), "mtime", -1214968196781083707L);
        setField(term765, term765.getClass(), "name", "hRNSzYYIrc");
        setLongField(term765, term765.getClass(), "nlink", -1804015692891701666L);
        setLongField(term765, term765.getClass(), "rmaj", -6432617521836576658L);
        setLongField(term765, term765.getClass(), "rmin", -2255965562447970862L);
        setLongField(term765, term765.getClass(), "uid", 148047808219672941L);
        setField(term763, term763.getClass(), "entry", term765);
        setLongField(term763, term763.getClass(), "entryBytesRead", 7489064039921396098L);
        setBooleanField(term763, term763.getClass(), "entryEOF", true);
        setByteElement(term795, 0, (byte) -121);
        setByteElement(term795, 1, (byte) -50);
        setByteElement(term795, 2, (byte) -79);
        setByteElement(term795, 3, (byte) 110);
        setByteElement(term795, 4, (byte) -111);
        setByteElement(term795, 5, (byte) -54);
        setField(term763, term763.getClass(), "tmpbuf", term795);
        setLongField(term763, term763.getClass(), "crc", 6843866297465638866L);
        setField(term763, term763.getClass(), "in", null);
        setByteElement(term803, 0, (byte) -25);
        setByteElement(term803, 1, (byte) -35);
        setField(term763, term763.getClass(), "TWO_BYTES_BUF", term803);
        setByteElement(term806, 0, (byte) 3);
        setByteElement(term806, 1, (byte) -10);
        setByteElement(term806, 2, (byte) -106);
        setByteElement(term806, 3, (byte) -124);
        setByteElement(term806, 4, (byte) -71);
        setByteElement(term806, 5, (byte) 113);
        setByteElement(term806, 6, (byte) -77);
        setByteElement(term806, 7, (byte) -12);
        setField(term763, term763.getClass(), "FOUR_BYTES_BUF", term806);
        setByteElement(term815, 0, (byte) 58);
        setByteElement(term815, 1, (byte) 12);
        setByteElement(term815, 2, (byte) 79);
        setField(term763, term763.getClass(), "SIX_BYTES_BUF", term815);
        setIntField(term763, term763.getClass(), "blockSize", -73683645);
        setByteElement(term820, 0, (byte) -4);
        setByteElement(term820, 1, (byte) -27);
        setByteElement(term820, 2, (byte) 120);
        setByteElement(term820, 3, (byte) -25);
        setByteElement(term820, 4, (byte) 114);
        setByteElement(term820, 5, (byte) 105);
        setField(term763, term763.getClass(), "SINGLE", term820);
        setLongField(term763, term763.getClass(), "bytesRead", -4023935540989049732L);
        term828 = new Integer(-226514366);
        term830 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term828;
        args[1] = term830;
        try {
            callMethod(klass, "readBinaryLong", argTypes, term763, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


