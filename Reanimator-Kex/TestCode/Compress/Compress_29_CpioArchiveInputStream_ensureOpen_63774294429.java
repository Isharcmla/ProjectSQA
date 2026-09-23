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

public class CpioArchiveInputStream_ensureOpen_63774294429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319;

    public CpioArchiveInputStream_ensureOpen_63774294429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term319 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term321 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term351 = (byte[]) newByteArray(1);
        byte[] term354 = (byte[]) newByteArray(0);
        byte[] term355 = (byte[]) newByteArray(2);
        byte[] term358 = (byte[]) newByteArray(8);
        byte[] term368 = (byte[]) newByteArray(6);
        setBooleanField(term319, term319.getClass(), "closed", true);
        setShortField(term321, term321.getClass(), "fileFormat", (short) 23627);
        setIntField(term321, term321.getClass(), "headerSize", -522618178);
        setIntField(term321, term321.getClass(), "alignmentBoundary", 1134449235);
        setLongField(term321, term321.getClass(), "chksum", -7612550318181586304L);
        setLongField(term321, term321.getClass(), "filesize", -2170847986967241072L);
        setLongField(term321, term321.getClass(), "gid", 4044358158040652353L);
        setLongField(term321, term321.getClass(), "inode", -4443169559037975007L);
        setLongField(term321, term321.getClass(), "maj", -3842548265506930260L);
        setLongField(term321, term321.getClass(), "min", -5788180182343976541L);
        setLongField(term321, term321.getClass(), "mode", 2936323121573284007L);
        setLongField(term321, term321.getClass(), "mtime", -1154553077993834885L);
        setField(term321, term321.getClass(), "name", "EGtDIRbSSb");
        setLongField(term321, term321.getClass(), "nlink", -2850532706972744550L);
        setLongField(term321, term321.getClass(), "rmaj", -2644215923136513282L);
        setLongField(term321, term321.getClass(), "rmin", -1468719814009985452L);
        setLongField(term321, term321.getClass(), "uid", -7738503207562305297L);
        setField(term319, term319.getClass(), "entry", term321);
        setLongField(term319, term319.getClass(), "entryBytesRead", 3825396310311739952L);
        setBooleanField(term319, term319.getClass(), "entryEOF", true);
        setByteElement(term351, 0, (byte) 116);
        setField(term319, term319.getClass(), "tmpbuf", term351);
        setLongField(term319, term319.getClass(), "crc", -3838084482494604218L);
        setField(term319, term319.getClass(), "in", null);
        setField(term319, term319.getClass(), "TWO_BYTES_BUF", term354);
        setByteElement(term355, 0, (byte) -81);
        setByteElement(term355, 1, (byte) 102);
        setField(term319, term319.getClass(), "FOUR_BYTES_BUF", term355);
        setByteElement(term358, 0, (byte) -118);
        setByteElement(term358, 1, (byte) -126);
        setByteElement(term358, 2, (byte) -91);
        setByteElement(term358, 3, (byte) -104);
        setByteElement(term358, 4, (byte) -89);
        setByteElement(term358, 5, (byte) 13);
        setByteElement(term358, 6, (byte) 44);
        setByteElement(term358, 7, (byte) -63);
        setField(term319, term319.getClass(), "SIX_BYTES_BUF", term358);
        setIntField(term319, term319.getClass(), "blockSize", -883034806);
        setField(term319, term319.getClass(), "zipEncoding", null);
        setByteElement(term368, 0, (byte) 15);
        setByteElement(term368, 1, (byte) 45);
        setByteElement(term368, 2, (byte) -39);
        setByteElement(term368, 3, (byte) -20);
        setByteElement(term368, 4, (byte) 10);
        setByteElement(term368, 5, (byte) 77);
        setField(term319, term319.getClass(), "SINGLE", term368);
        setLongField(term319, term319.getClass(), "bytesRead", 3892018155439224435L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "ensureOpen", argTypes, term319, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


