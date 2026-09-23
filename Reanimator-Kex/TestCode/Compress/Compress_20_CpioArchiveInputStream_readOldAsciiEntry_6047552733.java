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

public class CpioArchiveInputStream_readOldAsciiEntry_6047552733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1067;

    public CpioArchiveInputStream_readOldAsciiEntry_6047552733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1067 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term1069 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term1099 = (byte[]) newByteArray(2);
        byte[] term1103 = (byte[]) newByteArray(9);
        byte[] term1113 = (byte[]) newByteArray(7);
        byte[] term1121 = (byte[]) newByteArray(6);
        byte[] term1129 = (byte[]) newByteArray(7);
        setBooleanField(term1067, term1067.getClass(), "closed", true);
        setShortField(term1069, term1069.getClass(), "fileFormat", (short) 31422);
        setIntField(term1069, term1069.getClass(), "headerSize", -602026508);
        setIntField(term1069, term1069.getClass(), "alignmentBoundary", -157887805);
        setLongField(term1069, term1069.getClass(), "chksum", 5219030281405653303L);
        setLongField(term1069, term1069.getClass(), "filesize", -8471550651709805183L);
        setLongField(term1069, term1069.getClass(), "gid", -948292411727204525L);
        setLongField(term1069, term1069.getClass(), "inode", -8892586408602479513L);
        setLongField(term1069, term1069.getClass(), "maj", 4616440478358528406L);
        setLongField(term1069, term1069.getClass(), "min", 3427570961451840069L);
        setLongField(term1069, term1069.getClass(), "mode", 4502292577098212311L);
        setLongField(term1069, term1069.getClass(), "mtime", -3730936709704460408L);
        setField(term1069, term1069.getClass(), "name", "uuaPigETmJ");
        setLongField(term1069, term1069.getClass(), "nlink", -8614778293741404325L);
        setLongField(term1069, term1069.getClass(), "rmaj", -5447369594017685765L);
        setLongField(term1069, term1069.getClass(), "rmin", -5724112525188606013L);
        setLongField(term1069, term1069.getClass(), "uid", -6100012593724108983L);
        setField(term1067, term1067.getClass(), "entry", term1069);
        setLongField(term1067, term1067.getClass(), "entryBytesRead", 5465527210299101732L);
        setBooleanField(term1067, term1067.getClass(), "entryEOF", false);
        setByteElement(term1099, 0, (byte) 53);
        setByteElement(term1099, 1, (byte) 44);
        setField(term1067, term1067.getClass(), "tmpbuf", term1099);
        setLongField(term1067, term1067.getClass(), "crc", 4699157009689333952L);
        setField(term1067, term1067.getClass(), "in", null);
        setByteElement(term1103, 0, (byte) 49);
        setByteElement(term1103, 1, (byte) 114);
        setByteElement(term1103, 2, (byte) -81);
        setByteElement(term1103, 3, (byte) 127);
        setByteElement(term1103, 4, (byte) -24);
        setByteElement(term1103, 5, (byte) -89);
        setByteElement(term1103, 6, (byte) -35);
        setByteElement(term1103, 7, (byte) -59);
        setByteElement(term1103, 8, (byte) 73);
        setField(term1067, term1067.getClass(), "TWO_BYTES_BUF", term1103);
        setByteElement(term1113, 0, (byte) 94);
        setByteElement(term1113, 1, (byte) 114);
        setByteElement(term1113, 2, (byte) 110);
        setByteElement(term1113, 3, (byte) 70);
        setByteElement(term1113, 4, (byte) -46);
        setByteElement(term1113, 5, (byte) -78);
        setByteElement(term1113, 6, (byte) 109);
        setField(term1067, term1067.getClass(), "FOUR_BYTES_BUF", term1113);
        setByteElement(term1121, 0, (byte) 17);
        setByteElement(term1121, 1, (byte) -126);
        setByteElement(term1121, 2, (byte) 35);
        setByteElement(term1121, 3, (byte) -46);
        setByteElement(term1121, 4, (byte) -14);
        setByteElement(term1121, 5, (byte) 124);
        setField(term1067, term1067.getClass(), "SIX_BYTES_BUF", term1121);
        setIntField(term1067, term1067.getClass(), "blockSize", 1876565163);
        setByteElement(term1129, 0, (byte) -124);
        setByteElement(term1129, 1, (byte) -72);
        setByteElement(term1129, 2, (byte) 90);
        setByteElement(term1129, 3, (byte) -34);
        setByteElement(term1129, 4, (byte) -2);
        setByteElement(term1129, 5, (byte) 96);
        setByteElement(term1129, 6, (byte) 55);
        setField(term1067, term1067.getClass(), "SINGLE", term1129);
        setLongField(term1067, term1067.getClass(), "bytesRead", -78240609295693193L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "readOldAsciiEntry", argTypes, term1067, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


