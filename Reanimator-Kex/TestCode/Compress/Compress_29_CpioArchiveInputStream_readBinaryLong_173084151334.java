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
import java.lang.Integer;
import java.lang.Boolean;

public class CpioArchiveInputStream_readBinaryLong_173084151334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term809;
     Object term874;
     Object term876;

    public CpioArchiveInputStream_readBinaryLong_173084151334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term809 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term811 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term841 = (byte[]) newByteArray(6);
        byte[] term849 = (byte[]) newByteArray(2);
        byte[] term852 = (byte[]) newByteArray(8);
        byte[] term861 = (byte[]) newByteArray(3);
        byte[] term866 = (byte[]) newByteArray(6);
        setBooleanField(term809, term809.getClass(), "closed", true);
        setShortField(term811, term811.getClass(), "fileFormat", (short) 7670);
        setIntField(term811, term811.getClass(), "headerSize", -1179120542);
        setIntField(term811, term811.getClass(), "alignmentBoundary", -73683645);
        setLongField(term811, term811.getClass(), "chksum", 5671808784468963649L);
        setLongField(term811, term811.getClass(), "filesize", 2297097306706899827L);
        setLongField(term811, term811.getClass(), "gid", -900457279156388404L);
        setLongField(term811, term811.getClass(), "inode", 1084801489398441516L);
        setLongField(term811, term811.getClass(), "maj", 6273754186658578034L);
        setLongField(term811, term811.getClass(), "min", 3620247240684476031L);
        setLongField(term811, term811.getClass(), "mode", 8313800941204938919L);
        setLongField(term811, term811.getClass(), "mtime", -1214968196781083707L);
        setField(term811, term811.getClass(), "name", "NRdvgJlhkX");
        setLongField(term811, term811.getClass(), "nlink", -1804015692891701666L);
        setLongField(term811, term811.getClass(), "rmaj", -6432617521836576658L);
        setLongField(term811, term811.getClass(), "rmin", -2255965562447970862L);
        setLongField(term811, term811.getClass(), "uid", 148047808219672941L);
        setField(term809, term809.getClass(), "entry", term811);
        setLongField(term809, term809.getClass(), "entryBytesRead", 7489064039921396098L);
        setBooleanField(term809, term809.getClass(), "entryEOF", true);
        setByteElement(term841, 0, (byte) -121);
        setByteElement(term841, 1, (byte) -50);
        setByteElement(term841, 2, (byte) -79);
        setByteElement(term841, 3, (byte) 110);
        setByteElement(term841, 4, (byte) -111);
        setByteElement(term841, 5, (byte) -54);
        setField(term809, term809.getClass(), "tmpbuf", term841);
        setLongField(term809, term809.getClass(), "crc", 6843866297465638866L);
        setField(term809, term809.getClass(), "in", null);
        setByteElement(term849, 0, (byte) -25);
        setByteElement(term849, 1, (byte) -35);
        setField(term809, term809.getClass(), "TWO_BYTES_BUF", term849);
        setByteElement(term852, 0, (byte) 3);
        setByteElement(term852, 1, (byte) -10);
        setByteElement(term852, 2, (byte) -106);
        setByteElement(term852, 3, (byte) -124);
        setByteElement(term852, 4, (byte) -71);
        setByteElement(term852, 5, (byte) 113);
        setByteElement(term852, 6, (byte) -77);
        setByteElement(term852, 7, (byte) -12);
        setField(term809, term809.getClass(), "FOUR_BYTES_BUF", term852);
        setByteElement(term861, 0, (byte) 58);
        setByteElement(term861, 1, (byte) 12);
        setByteElement(term861, 2, (byte) 79);
        setField(term809, term809.getClass(), "SIX_BYTES_BUF", term861);
        setIntField(term809, term809.getClass(), "blockSize", -226514366);
        setField(term809, term809.getClass(), "zipEncoding", null);
        setByteElement(term866, 0, (byte) -4);
        setByteElement(term866, 1, (byte) -27);
        setByteElement(term866, 2, (byte) 120);
        setByteElement(term866, 3, (byte) -25);
        setByteElement(term866, 4, (byte) 114);
        setByteElement(term866, 5, (byte) 105);
        setField(term809, term809.getClass(), "SINGLE", term866);
        setLongField(term809, term809.getClass(), "bytesRead", -4023935540989049732L);
        term874 = new Integer(1193880199);
        term876 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term874;
        args[1] = term876;
        try {
            callMethod(klass, "readBinaryLong", argTypes, term809, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


