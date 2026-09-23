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

public class CpioArchiveInputStream_readFully_145232551829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term654;
     Object term713;
     Object term722;
     Object term724;

    public CpioArchiveInputStream_readFully_145232551829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term654 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term656 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term686 = (byte[]) newByteArray(5);
        byte[] term693 = (byte[]) newByteArray(1);
        byte[] term695 = (byte[]) newByteArray(0);
        byte[] term696 = (byte[]) newByteArray(9);
        byte[] term707 = (byte[]) newByteArray(4);
        setBooleanField(term654, term654.getClass(), "closed", false);
        setShortField(term656, term656.getClass(), "fileFormat", (short) 27594);
        setIntField(term656, term656.getClass(), "headerSize", 1135664017);
        setIntField(term656, term656.getClass(), "alignmentBoundary", 590364439);
        setLongField(term656, term656.getClass(), "chksum", -5786861555969446503L);
        setLongField(term656, term656.getClass(), "filesize", 2354625302846375590L);
        setLongField(term656, term656.getClass(), "gid", 7276637106827860087L);
        setLongField(term656, term656.getClass(), "inode", -3936701866695933852L);
        setLongField(term656, term656.getClass(), "maj", 1215116475929634177L);
        setLongField(term656, term656.getClass(), "min", 1597484336218508869L);
        setLongField(term656, term656.getClass(), "mode", -685023850445639859L);
        setLongField(term656, term656.getClass(), "mtime", -6950146046121430355L);
        setField(term656, term656.getClass(), "name", "MjGYSRKTNF");
        setLongField(term656, term656.getClass(), "nlink", 1667122142089513324L);
        setLongField(term656, term656.getClass(), "rmaj", -6342139649364011743L);
        setLongField(term656, term656.getClass(), "rmin", -4924950707540628022L);
        setLongField(term656, term656.getClass(), "uid", -4393710401270724527L);
        setField(term654, term654.getClass(), "entry", term656);
        setLongField(term654, term654.getClass(), "entryBytesRead", -4822736661741380518L);
        setBooleanField(term654, term654.getClass(), "entryEOF", false);
        setByteElement(term686, 0, (byte) -1);
        setByteElement(term686, 1, (byte) 117);
        setByteElement(term686, 2, (byte) 43);
        setByteElement(term686, 3, (byte) -27);
        setByteElement(term686, 4, (byte) 34);
        setField(term654, term654.getClass(), "tmpbuf", term686);
        setLongField(term654, term654.getClass(), "crc", -5386201758403679145L);
        setField(term654, term654.getClass(), "in", null);
        setByteElement(term693, 0, (byte) -126);
        setField(term654, term654.getClass(), "TWO_BYTES_BUF", term693);
        setField(term654, term654.getClass(), "FOUR_BYTES_BUF", term695);
        setByteElement(term696, 0, (byte) 12);
        setByteElement(term696, 1, (byte) -75);
        setByteElement(term696, 2, (byte) 69);
        setByteElement(term696, 3, (byte) -6);
        setByteElement(term696, 4, (byte) 107);
        setByteElement(term696, 5, (byte) -109);
        setByteElement(term696, 6, (byte) 122);
        setByteElement(term696, 7, (byte) 83);
        setByteElement(term696, 8, (byte) -123);
        setField(term654, term654.getClass(), "SIX_BYTES_BUF", term696);
        setIntField(term654, term654.getClass(), "blockSize", 865208305);
        setByteElement(term707, 0, (byte) -76);
        setByteElement(term707, 1, (byte) -115);
        setByteElement(term707, 2, (byte) -48);
        setByteElement(term707, 3, (byte) 126);
        setField(term654, term654.getClass(), "SINGLE", term707);
        setLongField(term654, term654.getClass(), "bytesRead", -7268507582722666254L);
        term713 = (byte[]) newByteArray(8);
        setByteElement(term713, 0, (byte) -2);
        setByteElement(term713, 1, (byte) 103);
        setByteElement(term713, 2, (byte) 23);
        setByteElement(term713, 3, (byte) 96);
        setByteElement(term713, 4, (byte) -70);
        setByteElement(term713, 5, (byte) -73);
        setByteElement(term713, 6, (byte) 1);
        setByteElement(term713, 7, (byte) 99);
        term722 = new Integer(-1275173084);
        term724 = new Integer(-244121226);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term713;
        args[1] = term722;
        args[2] = term724;
        try {
            callMethod(klass, "readFully", argTypes, term654, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


