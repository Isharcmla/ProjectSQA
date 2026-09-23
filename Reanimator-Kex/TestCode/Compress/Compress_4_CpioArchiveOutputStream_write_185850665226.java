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
import java.util.HashMap;
import java.lang.Integer;

public class CpioArchiveOutputStream_write_185850665226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term557;
     Object term603;
     Object term611;
     Object term613;

    public CpioArchiveOutputStream_write_185850665226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term589 = new HashMap();
        term557 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term558 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term596 = (byte[]) newByteArray(6);
        setShortField(term558, term558.getClass(), "fileFormat", (short) 24663);
        setIntField(term558, term558.getClass(), "headerSize", -2068769794);
        setIntField(term558, term558.getClass(), "alignmentBoundary", -117576464);
        setLongField(term558, term558.getClass(), "chksum", 8166095254618543564L);
        setLongField(term558, term558.getClass(), "filesize", -4598158870068953328L);
        setLongField(term558, term558.getClass(), "gid", 138235087558060686L);
        setLongField(term558, term558.getClass(), "inode", 5381386339318883012L);
        setLongField(term558, term558.getClass(), "maj", -1333707622307134180L);
        setLongField(term558, term558.getClass(), "min", -4360569253593381888L);
        setLongField(term558, term558.getClass(), "mode", 1457594663983990440L);
        setLongField(term558, term558.getClass(), "mtime", 3452833434644634217L);
        setField(term558, term558.getClass(), "name", "uuaPigETmJ");
        setLongField(term558, term558.getClass(), "nlink", -8603648071751666348L);
        setLongField(term558, term558.getClass(), "rmaj", -7884871963229073324L);
        setLongField(term558, term558.getClass(), "rmin", -8649738738252714180L);
        setLongField(term558, term558.getClass(), "uid", -7278883608542636188L);
        setField(term557, term557.getClass(), "entry", term558);
        setBooleanField(term557, term557.getClass(), "closed", false);
        setBooleanField(term557, term557.getClass(), "finished", true);
        setShortField(term557, term557.getClass(), "entryFormat", (short) 30329);
        setField(term557, term557.getClass(), "names", term589);
        setLongField(term557, term557.getClass(), "crc", -1539859611880912454L);
        setLongField(term557, term557.getClass(), "written", 4100236067313034103L);
        setField(term557, term557.getClass(), "out", null);
        setByteElement(term596, 0, (byte) -111);
        setByteElement(term596, 1, (byte) 23);
        setByteElement(term596, 2, (byte) -15);
        setByteElement(term596, 3, (byte) 36);
        setByteElement(term596, 4, (byte) 118);
        setByteElement(term596, 5, (byte) 106);
        setField(term557, term557.getClass(), "oneByte", term596);
        term603 = (byte[]) newByteArray(7);
        setByteElement(term603, 0, (byte) 98);
        setByteElement(term603, 1, (byte) 67);
        setByteElement(term603, 2, (byte) 66);
        setByteElement(term603, 3, (byte) -121);
        setByteElement(term603, 4, (byte) -119);
        setByteElement(term603, 5, (byte) 71);
        setByteElement(term603, 6, (byte) 80);
        term611 = new Integer(-1007160944);
        term613 = new Integer(1135664017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term603;
        args[1] = term611;
        args[2] = term613;
        try {
            callMethod(klass, "write", argTypes, term557, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


