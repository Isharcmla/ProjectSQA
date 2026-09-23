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

public class CpioArchiveInputStream_readOldAsciiEntry_6047552737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1113;

    public CpioArchiveInputStream_readOldAsciiEntry_6047552737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1113 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term1115 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term1145 = (byte[]) newByteArray(2);
        byte[] term1149 = (byte[]) newByteArray(9);
        byte[] term1159 = (byte[]) newByteArray(7);
        byte[] term1167 = (byte[]) newByteArray(6);
        byte[] term1175 = (byte[]) newByteArray(7);
        setBooleanField(term1113, term1113.getClass(), "closed", true);
        setShortField(term1115, term1115.getClass(), "fileFormat", (short) 31422);
        setIntField(term1115, term1115.getClass(), "headerSize", -157887805);
        setIntField(term1115, term1115.getClass(), "alignmentBoundary", 1876565163);
        setLongField(term1115, term1115.getClass(), "chksum", 5219030281405653303L);
        setLongField(term1115, term1115.getClass(), "filesize", -8471550651709805183L);
        setLongField(term1115, term1115.getClass(), "gid", -948292411727204525L);
        setLongField(term1115, term1115.getClass(), "inode", -8892586408602479513L);
        setLongField(term1115, term1115.getClass(), "maj", 4616440478358528406L);
        setLongField(term1115, term1115.getClass(), "min", 3427570961451840069L);
        setLongField(term1115, term1115.getClass(), "mode", 4502292577098212311L);
        setLongField(term1115, term1115.getClass(), "mtime", -3730936709704460408L);
        setField(term1115, term1115.getClass(), "name", "LQFpaHEwXR");
        setLongField(term1115, term1115.getClass(), "nlink", -8614778293741404325L);
        setLongField(term1115, term1115.getClass(), "rmaj", -5447369594017685765L);
        setLongField(term1115, term1115.getClass(), "rmin", -5724112525188606013L);
        setLongField(term1115, term1115.getClass(), "uid", -6100012593724108983L);
        setField(term1113, term1113.getClass(), "entry", term1115);
        setLongField(term1113, term1113.getClass(), "entryBytesRead", 5465527210299101732L);
        setBooleanField(term1113, term1113.getClass(), "entryEOF", false);
        setByteElement(term1145, 0, (byte) 53);
        setByteElement(term1145, 1, (byte) 44);
        setField(term1113, term1113.getClass(), "tmpbuf", term1145);
        setLongField(term1113, term1113.getClass(), "crc", 4699157009689333952L);
        setField(term1113, term1113.getClass(), "in", null);
        setByteElement(term1149, 0, (byte) 49);
        setByteElement(term1149, 1, (byte) 114);
        setByteElement(term1149, 2, (byte) -81);
        setByteElement(term1149, 3, (byte) 127);
        setByteElement(term1149, 4, (byte) -24);
        setByteElement(term1149, 5, (byte) -89);
        setByteElement(term1149, 6, (byte) -35);
        setByteElement(term1149, 7, (byte) -59);
        setByteElement(term1149, 8, (byte) 73);
        setField(term1113, term1113.getClass(), "TWO_BYTES_BUF", term1149);
        setByteElement(term1159, 0, (byte) 94);
        setByteElement(term1159, 1, (byte) 114);
        setByteElement(term1159, 2, (byte) 110);
        setByteElement(term1159, 3, (byte) 70);
        setByteElement(term1159, 4, (byte) -46);
        setByteElement(term1159, 5, (byte) -78);
        setByteElement(term1159, 6, (byte) 109);
        setField(term1113, term1113.getClass(), "FOUR_BYTES_BUF", term1159);
        setByteElement(term1167, 0, (byte) 17);
        setByteElement(term1167, 1, (byte) -126);
        setByteElement(term1167, 2, (byte) 35);
        setByteElement(term1167, 3, (byte) -46);
        setByteElement(term1167, 4, (byte) -14);
        setByteElement(term1167, 5, (byte) 124);
        setField(term1113, term1113.getClass(), "SIX_BYTES_BUF", term1167);
        setIntField(term1113, term1113.getClass(), "blockSize", -817164822);
        setField(term1113, term1113.getClass(), "zipEncoding", null);
        setByteElement(term1175, 0, (byte) -124);
        setByteElement(term1175, 1, (byte) -72);
        setByteElement(term1175, 2, (byte) 90);
        setByteElement(term1175, 3, (byte) -34);
        setByteElement(term1175, 4, (byte) -2);
        setByteElement(term1175, 5, (byte) 96);
        setByteElement(term1175, 6, (byte) 55);
        setField(term1113, term1113.getClass(), "SINGLE", term1175);
        setLongField(term1113, term1113.getClass(), "bytesRead", -78240609295693193L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "readOldAsciiEntry", argTypes, term1113, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


