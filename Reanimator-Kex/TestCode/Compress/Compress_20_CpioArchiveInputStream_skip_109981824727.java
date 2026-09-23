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

public class CpioArchiveInputStream_skip_109981824727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term447;
     Object term510;

    public CpioArchiveInputStream_skip_109981824727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term447 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term449 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term479 = (byte[]) newByteArray(6);
        byte[] term487 = (byte[]) newByteArray(5);
        byte[] term493 = (byte[]) newByteArray(3);
        byte[] term497 = (byte[]) newByteArray(7);
        byte[] term506 = (byte[]) newByteArray(2);
        setBooleanField(term447, term447.getClass(), "closed", false);
        setShortField(term449, term449.getClass(), "fileFormat", (short) 31942);
        setIntField(term449, term449.getClass(), "headerSize", -1685132342);
        setIntField(term449, term449.getClass(), "alignmentBoundary", -1456670397);
        setLongField(term449, term449.getClass(), "chksum", -7291743527973326814L);
        setLongField(term449, term449.getClass(), "filesize", -5963439350418910964L);
        setLongField(term449, term449.getClass(), "gid", 9013624480170062917L);
        setLongField(term449, term449.getClass(), "inode", 7862575738391801707L);
        setLongField(term449, term449.getClass(), "maj", 50358265865610362L);
        setLongField(term449, term449.getClass(), "min", 5510783420697225605L);
        setLongField(term449, term449.getClass(), "mode", 6005241913654469005L);
        setLongField(term449, term449.getClass(), "mtime", -1983291584002806658L);
        setField(term449, term449.getClass(), "name", "EGtDIRbSSb");
        setLongField(term449, term449.getClass(), "nlink", 5946780097489996391L);
        setLongField(term449, term449.getClass(), "rmaj", -8652538484981166496L);
        setLongField(term449, term449.getClass(), "rmin", 2701184207686293431L);
        setLongField(term449, term449.getClass(), "uid", 4474998035090263139L);
        setField(term447, term447.getClass(), "entry", term449);
        setLongField(term447, term447.getClass(), "entryBytesRead", 2848819812340321742L);
        setBooleanField(term447, term447.getClass(), "entryEOF", true);
        setByteElement(term479, 0, (byte) 33);
        setByteElement(term479, 1, (byte) -74);
        setByteElement(term479, 2, (byte) -84);
        setByteElement(term479, 3, (byte) -53);
        setByteElement(term479, 4, (byte) -93);
        setByteElement(term479, 5, (byte) 82);
        setField(term447, term447.getClass(), "tmpbuf", term479);
        setLongField(term447, term447.getClass(), "crc", -8876856890348836498L);
        setField(term447, term447.getClass(), "in", null);
        setByteElement(term487, 0, (byte) -89);
        setByteElement(term487, 1, (byte) 24);
        setByteElement(term487, 2, (byte) 123);
        setByteElement(term487, 3, (byte) -101);
        setByteElement(term487, 4, (byte) -102);
        setField(term447, term447.getClass(), "TWO_BYTES_BUF", term487);
        setByteElement(term493, 0, (byte) -95);
        setByteElement(term493, 1, (byte) -2);
        setByteElement(term493, 2, (byte) 28);
        setField(term447, term447.getClass(), "FOUR_BYTES_BUF", term493);
        setByteElement(term497, 0, (byte) 84);
        setByteElement(term497, 1, (byte) 85);
        setByteElement(term497, 2, (byte) -17);
        setByteElement(term497, 3, (byte) -83);
        setByteElement(term497, 4, (byte) 48);
        setByteElement(term497, 5, (byte) -128);
        setByteElement(term497, 6, (byte) 70);
        setField(term447, term447.getClass(), "SIX_BYTES_BUF", term497);
        setIntField(term447, term447.getClass(), "blockSize", 1622346318);
        setByteElement(term506, 0, (byte) -28);
        setByteElement(term506, 1, (byte) 115);
        setField(term447, term447.getClass(), "SINGLE", term506);
        setLongField(term447, term447.getClass(), "bytesRead", 846579494941632714L);
        term510 = new Integer(1048535127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term510;
        try {
            callMethod(klass, "skip", argTypes, term447, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


