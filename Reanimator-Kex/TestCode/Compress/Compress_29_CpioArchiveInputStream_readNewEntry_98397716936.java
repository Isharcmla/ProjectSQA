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

public class CpioArchiveInputStream_readNewEntry_98397716936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1029;
     Object term1085;

    public CpioArchiveInputStream_readNewEntry_98397716936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1029 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term1031 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term1061 = (byte[]) newByteArray(2);
        byte[] term1065 = (byte[]) newByteArray(5);
        byte[] term1071 = (byte[]) newByteArray(0);
        byte[] term1072 = (byte[]) newByteArray(2);
        byte[] term1076 = (byte[]) newByteArray(7);
        setBooleanField(term1029, term1029.getClass(), "closed", true);
        setShortField(term1031, term1031.getClass(), "fileFormat", (short) 8329);
        setIntField(term1031, term1031.getClass(), "headerSize", 1962444399);
        setIntField(term1031, term1031.getClass(), "alignmentBoundary", 767834723);
        setLongField(term1031, term1031.getClass(), "chksum", -1333707622307134180L);
        setLongField(term1031, term1031.getClass(), "filesize", -4360569253593381888L);
        setLongField(term1031, term1031.getClass(), "gid", 1457594663983990440L);
        setLongField(term1031, term1031.getClass(), "inode", 3452833434644634217L);
        setLongField(term1031, term1031.getClass(), "maj", -8603648071751666348L);
        setLongField(term1031, term1031.getClass(), "min", -7884871963229073324L);
        setLongField(term1031, term1031.getClass(), "mode", -8649738738252714180L);
        setLongField(term1031, term1031.getClass(), "mtime", -7278883608542636188L);
        setField(term1031, term1031.getClass(), "name", "MxlszYVzRf");
        setLongField(term1031, term1031.getClass(), "nlink", -1539859611880912454L);
        setLongField(term1031, term1031.getClass(), "rmaj", 4100236067313034103L);
        setLongField(term1031, term1031.getClass(), "rmin", 1195529027276497124L);
        setLongField(term1031, term1031.getClass(), "uid", -2783999800714825789L);
        setField(term1029, term1029.getClass(), "entry", term1031);
        setLongField(term1029, term1029.getClass(), "entryBytesRead", 4266570509071948633L);
        setBooleanField(term1029, term1029.getClass(), "entryEOF", true);
        setByteElement(term1061, 0, (byte) 109);
        setByteElement(term1061, 1, (byte) -54);
        setField(term1029, term1029.getClass(), "tmpbuf", term1061);
        setLongField(term1029, term1029.getClass(), "crc", -7291742736502427077L);
        setField(term1029, term1029.getClass(), "in", null);
        setByteElement(term1065, 0, (byte) -85);
        setByteElement(term1065, 1, (byte) 81);
        setByteElement(term1065, 2, (byte) -113);
        setByteElement(term1065, 3, (byte) 90);
        setByteElement(term1065, 4, (byte) 10);
        setField(term1029, term1029.getClass(), "TWO_BYTES_BUF", term1065);
        setField(term1029, term1029.getClass(), "FOUR_BYTES_BUF", term1071);
        setByteElement(term1072, 0, (byte) 87);
        setByteElement(term1072, 1, (byte) -35);
        setField(term1029, term1029.getClass(), "SIX_BYTES_BUF", term1072);
        setIntField(term1029, term1029.getClass(), "blockSize", -602026508);
        setField(term1029, term1029.getClass(), "zipEncoding", null);
        setByteElement(term1076, 0, (byte) -14);
        setByteElement(term1076, 1, (byte) 10);
        setByteElement(term1076, 2, (byte) 65);
        setByteElement(term1076, 3, (byte) -44);
        setByteElement(term1076, 4, (byte) 115);
        setByteElement(term1076, 5, (byte) -32);
        setByteElement(term1076, 6, (byte) -52);
        setField(term1029, term1029.getClass(), "SINGLE", term1076);
        setLongField(term1029, term1029.getClass(), "bytesRead", -8121849829073967555L);
        term1085 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1085;
        try {
            callMethod(klass, "readNewEntry", argTypes, term1029, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


