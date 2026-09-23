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

public class CpioArchiveInputStream_readNewEntry_98397716932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term983;
     Object term1039;

    public CpioArchiveInputStream_readNewEntry_98397716932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term983 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term985 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term1015 = (byte[]) newByteArray(2);
        byte[] term1019 = (byte[]) newByteArray(5);
        byte[] term1025 = (byte[]) newByteArray(0);
        byte[] term1026 = (byte[]) newByteArray(2);
        byte[] term1030 = (byte[]) newByteArray(7);
        setBooleanField(term983, term983.getClass(), "closed", true);
        setShortField(term985, term985.getClass(), "fileFormat", (short) 8329);
        setIntField(term985, term985.getClass(), "headerSize", 679763016);
        setIntField(term985, term985.getClass(), "alignmentBoundary", 1962444399);
        setLongField(term985, term985.getClass(), "chksum", -1333707622307134180L);
        setLongField(term985, term985.getClass(), "filesize", -4360569253593381888L);
        setLongField(term985, term985.getClass(), "gid", 1457594663983990440L);
        setLongField(term985, term985.getClass(), "inode", 3452833434644634217L);
        setLongField(term985, term985.getClass(), "maj", -8603648071751666348L);
        setLongField(term985, term985.getClass(), "min", -7884871963229073324L);
        setLongField(term985, term985.getClass(), "mode", -8649738738252714180L);
        setLongField(term985, term985.getClass(), "mtime", -7278883608542636188L);
        setField(term985, term985.getClass(), "name", "NRdvgJlhkX");
        setLongField(term985, term985.getClass(), "nlink", -1539859611880912454L);
        setLongField(term985, term985.getClass(), "rmaj", 4100236067313034103L);
        setLongField(term985, term985.getClass(), "rmin", 1195529027276497124L);
        setLongField(term985, term985.getClass(), "uid", -2783999800714825789L);
        setField(term983, term983.getClass(), "entry", term985);
        setLongField(term983, term983.getClass(), "entryBytesRead", 4266570509071948633L);
        setBooleanField(term983, term983.getClass(), "entryEOF", true);
        setByteElement(term1015, 0, (byte) 109);
        setByteElement(term1015, 1, (byte) -54);
        setField(term983, term983.getClass(), "tmpbuf", term1015);
        setLongField(term983, term983.getClass(), "crc", -7291742736502427077L);
        setField(term983, term983.getClass(), "in", null);
        setByteElement(term1019, 0, (byte) -85);
        setByteElement(term1019, 1, (byte) 81);
        setByteElement(term1019, 2, (byte) -113);
        setByteElement(term1019, 3, (byte) 90);
        setByteElement(term1019, 4, (byte) 10);
        setField(term983, term983.getClass(), "TWO_BYTES_BUF", term1019);
        setField(term983, term983.getClass(), "FOUR_BYTES_BUF", term1025);
        setByteElement(term1026, 0, (byte) 87);
        setByteElement(term1026, 1, (byte) -35);
        setField(term983, term983.getClass(), "SIX_BYTES_BUF", term1026);
        setIntField(term983, term983.getClass(), "blockSize", 767834723);
        setByteElement(term1030, 0, (byte) -14);
        setByteElement(term1030, 1, (byte) 10);
        setByteElement(term1030, 2, (byte) 65);
        setByteElement(term1030, 3, (byte) -44);
        setByteElement(term1030, 4, (byte) 115);
        setByteElement(term1030, 5, (byte) -32);
        setByteElement(term1030, 6, (byte) -52);
        setField(term983, term983.getClass(), "SINGLE", term1030);
        setLongField(term983, term983.getClass(), "bytesRead", -8121849829073967555L);
        term1039 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1039;
        try {
            callMethod(klass, "readNewEntry", argTypes, term983, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


