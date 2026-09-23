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
import java.lang.IndexOutOfBoundsException;
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class CpioArchiveInputStream_readFully_145232551833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term700;
     Object term759;
     Object term768;
     Object term770;

    public CpioArchiveInputStream_readFully_145232551833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term700 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term702 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term732 = (byte[]) newByteArray(5);
        byte[] term739 = (byte[]) newByteArray(1);
        byte[] term741 = (byte[]) newByteArray(0);
        byte[] term742 = (byte[]) newByteArray(9);
        byte[] term753 = (byte[]) newByteArray(4);
        setBooleanField(term700, term700.getClass(), "closed", false);
        setShortField(term702, term702.getClass(), "fileFormat", (short) 27594);
        setIntField(term702, term702.getClass(), "headerSize", 590364439);
        setIntField(term702, term702.getClass(), "alignmentBoundary", 865208305);
        setLongField(term702, term702.getClass(), "chksum", -5786861555969446503L);
        setLongField(term702, term702.getClass(), "filesize", 2354625302846375590L);
        setLongField(term702, term702.getClass(), "gid", 7276637106827860087L);
        setLongField(term702, term702.getClass(), "inode", -3936701866695933852L);
        setLongField(term702, term702.getClass(), "maj", 1215116475929634177L);
        setLongField(term702, term702.getClass(), "min", 1597484336218508869L);
        setLongField(term702, term702.getClass(), "mode", -685023850445639859L);
        setLongField(term702, term702.getClass(), "mtime", -6950146046121430355L);
        setField(term702, term702.getClass(), "name", "RMFIsYGgne");
        setLongField(term702, term702.getClass(), "nlink", 1667122142089513324L);
        setLongField(term702, term702.getClass(), "rmaj", -6342139649364011743L);
        setLongField(term702, term702.getClass(), "rmin", -4924950707540628022L);
        setLongField(term702, term702.getClass(), "uid", -4393710401270724527L);
        setField(term700, term700.getClass(), "entry", term702);
        setLongField(term700, term700.getClass(), "entryBytesRead", -4822736661741380518L);
        setBooleanField(term700, term700.getClass(), "entryEOF", false);
        setByteElement(term732, 0, (byte) -1);
        setByteElement(term732, 1, (byte) 117);
        setByteElement(term732, 2, (byte) 43);
        setByteElement(term732, 3, (byte) -27);
        setByteElement(term732, 4, (byte) 34);
        setField(term700, term700.getClass(), "tmpbuf", term732);
        setLongField(term700, term700.getClass(), "crc", -5386201758403679145L);
        setField(term700, term700.getClass(), "in", null);
        setByteElement(term739, 0, (byte) -126);
        setField(term700, term700.getClass(), "TWO_BYTES_BUF", term739);
        setField(term700, term700.getClass(), "FOUR_BYTES_BUF", term741);
        setByteElement(term742, 0, (byte) 12);
        setByteElement(term742, 1, (byte) -75);
        setByteElement(term742, 2, (byte) 69);
        setByteElement(term742, 3, (byte) -6);
        setByteElement(term742, 4, (byte) 107);
        setByteElement(term742, 5, (byte) -109);
        setByteElement(term742, 6, (byte) 122);
        setByteElement(term742, 7, (byte) 83);
        setByteElement(term742, 8, (byte) -123);
        setField(term700, term700.getClass(), "SIX_BYTES_BUF", term742);
        setIntField(term700, term700.getClass(), "blockSize", -1275173084);
        setField(term700, term700.getClass(), "zipEncoding", null);
        setByteElement(term753, 0, (byte) -76);
        setByteElement(term753, 1, (byte) -115);
        setByteElement(term753, 2, (byte) -48);
        setByteElement(term753, 3, (byte) 126);
        setField(term700, term700.getClass(), "SINGLE", term753);
        setLongField(term700, term700.getClass(), "bytesRead", -7268507582722666254L);
        term759 = (byte[]) newByteArray(8);
        setByteElement(term759, 0, (byte) -2);
        setByteElement(term759, 1, (byte) 103);
        setByteElement(term759, 2, (byte) 23);
        setByteElement(term759, 3, (byte) 96);
        setByteElement(term759, 4, (byte) -70);
        setByteElement(term759, 5, (byte) -73);
        setByteElement(term759, 6, (byte) 1);
        setByteElement(term759, 7, (byte) 99);
        term768 = new Integer(-244121226);
        term770 = new Integer(-203030934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term759;
        args[1] = term768;
        args[2] = term770;
        try {
            callMethod(klass, "readFully", argTypes, term700, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


