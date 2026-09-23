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

public class CpioArchiveInputStream_getNextEntry_14577896037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1451;

    public CpioArchiveInputStream_getNextEntry_14577896037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1451 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term1453 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term1483 = (byte[]) newByteArray(6);
        byte[] term1491 = (byte[]) newByteArray(7);
        byte[] term1499 = (byte[]) newByteArray(0);
        byte[] term1500 = (byte[]) newByteArray(7);
        byte[] term1509 = (byte[]) newByteArray(1);
        setBooleanField(term1451, term1451.getClass(), "closed", true);
        setShortField(term1453, term1453.getClass(), "fileFormat", (short) -16335);
        setIntField(term1453, term1453.getClass(), "headerSize", 292681826);
        setIntField(term1453, term1453.getClass(), "alignmentBoundary", 458147407);
        setLongField(term1453, term1453.getClass(), "chksum", -8019730974733786399L);
        setLongField(term1453, term1453.getClass(), "filesize", 394960377236392159L);
        setLongField(term1453, term1453.getClass(), "gid", -2955854401507097864L);
        setLongField(term1453, term1453.getClass(), "inode", 329213208496958131L);
        setLongField(term1453, term1453.getClass(), "maj", 8107921244631636572L);
        setLongField(term1453, term1453.getClass(), "min", -7904053112604879960L);
        setLongField(term1453, term1453.getClass(), "mode", -6602460430714339690L);
        setLongField(term1453, term1453.getClass(), "mtime", 21047099434645581L);
        setField(term1453, term1453.getClass(), "name", "aJlieCFVtF");
        setLongField(term1453, term1453.getClass(), "nlink", -8862087040734407227L);
        setLongField(term1453, term1453.getClass(), "rmaj", -6394943900800506753L);
        setLongField(term1453, term1453.getClass(), "rmin", -4867941246533901410L);
        setLongField(term1453, term1453.getClass(), "uid", 1044883697493326351L);
        setField(term1451, term1451.getClass(), "entry", term1453);
        setLongField(term1451, term1451.getClass(), "entryBytesRead", -7406618974062419277L);
        setBooleanField(term1451, term1451.getClass(), "entryEOF", false);
        setByteElement(term1483, 0, (byte) 83);
        setByteElement(term1483, 1, (byte) -57);
        setByteElement(term1483, 2, (byte) 103);
        setByteElement(term1483, 3, (byte) 40);
        setByteElement(term1483, 4, (byte) -106);
        setByteElement(term1483, 5, (byte) -95);
        setField(term1451, term1451.getClass(), "tmpbuf", term1483);
        setLongField(term1451, term1451.getClass(), "crc", 868503089567085985L);
        setField(term1451, term1451.getClass(), "in", null);
        setByteElement(term1491, 0, (byte) 69);
        setByteElement(term1491, 1, (byte) 63);
        setByteElement(term1491, 2, (byte) -41);
        setByteElement(term1491, 3, (byte) -44);
        setByteElement(term1491, 4, (byte) -120);
        setByteElement(term1491, 5, (byte) -55);
        setByteElement(term1491, 6, (byte) 91);
        setField(term1451, term1451.getClass(), "TWO_BYTES_BUF", term1491);
        setField(term1451, term1451.getClass(), "FOUR_BYTES_BUF", term1499);
        setByteElement(term1500, 0, (byte) 55);
        setByteElement(term1500, 1, (byte) -5);
        setByteElement(term1500, 2, (byte) -4);
        setByteElement(term1500, 3, (byte) -61);
        setByteElement(term1500, 4, (byte) -34);
        setByteElement(term1500, 5, (byte) 73);
        setByteElement(term1500, 6, (byte) 10);
        setField(term1451, term1451.getClass(), "SIX_BYTES_BUF", term1500);
        setIntField(term1451, term1451.getClass(), "blockSize", -184153539);
        setByteElement(term1509, 0, (byte) 36);
        setField(term1451, term1451.getClass(), "SINGLE", term1509);
        setLongField(term1451, term1451.getClass(), "bytesRead", -3277773415369003529L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNextEntry", argTypes, term1451, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


