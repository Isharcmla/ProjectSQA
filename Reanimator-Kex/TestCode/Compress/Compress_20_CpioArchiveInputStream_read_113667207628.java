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

public class CpioArchiveInputStream_read_113667207628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term545;
     Object term607;
     Object term613;
     Object term615;

    public CpioArchiveInputStream_read_113667207628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term545 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term547 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term577 = (byte[]) newByteArray(6);
        byte[] term585 = (byte[]) newByteArray(6);
        byte[] term592 = (byte[]) newByteArray(2);
        byte[] term595 = (byte[]) newByteArray(5);
        byte[] term602 = (byte[]) newByteArray(3);
        setBooleanField(term545, term545.getClass(), "closed", false);
        setShortField(term547, term547.getClass(), "fileFormat", (short) 30947);
        setIntField(term547, term547.getClass(), "headerSize", -655067527);
        setIntField(term547, term547.getClass(), "alignmentBoundary", -6029667);
        setLongField(term547, term547.getClass(), "chksum", 6689117472719450333L);
        setLongField(term547, term547.getClass(), "filesize", 5836128569274066678L);
        setLongField(term547, term547.getClass(), "gid", -2177368829816872572L);
        setLongField(term547, term547.getClass(), "inode", -8463029266761149071L);
        setLongField(term547, term547.getClass(), "maj", 3133860696238261492L);
        setLongField(term547, term547.getClass(), "min", 7247160664318067468L);
        setLongField(term547, term547.getClass(), "mode", 2135754395358000892L);
        setLongField(term547, term547.getClass(), "mtime", -8085190702504231560L);
        setField(term547, term547.getClass(), "name", "SzjVpOQTyS");
        setLongField(term547, term547.getClass(), "nlink", 1672578078364590450L);
        setLongField(term547, term547.getClass(), "rmaj", 4949335493504695457L);
        setLongField(term547, term547.getClass(), "rmin", -5216789073301458893L);
        setLongField(term547, term547.getClass(), "uid", -1832940336320585644L);
        setField(term545, term545.getClass(), "entry", term547);
        setLongField(term545, term545.getClass(), "entryBytesRead", -8033714905181142681L);
        setBooleanField(term545, term545.getClass(), "entryEOF", true);
        setByteElement(term577, 0, (byte) 96);
        setByteElement(term577, 1, (byte) 51);
        setByteElement(term577, 2, (byte) -53);
        setByteElement(term577, 3, (byte) -8);
        setByteElement(term577, 4, (byte) -9);
        setByteElement(term577, 5, (byte) 97);
        setField(term545, term545.getClass(), "tmpbuf", term577);
        setLongField(term545, term545.getClass(), "crc", -9040825890007374809L);
        setField(term545, term545.getClass(), "in", null);
        setByteElement(term585, 0, (byte) -46);
        setByteElement(term585, 1, (byte) 14);
        setByteElement(term585, 2, (byte) 34);
        setByteElement(term585, 3, (byte) 126);
        setByteElement(term585, 4, (byte) 7);
        setByteElement(term585, 5, (byte) -96);
        setField(term545, term545.getClass(), "TWO_BYTES_BUF", term585);
        setByteElement(term592, 0, (byte) -22);
        setByteElement(term592, 1, (byte) -5);
        setField(term545, term545.getClass(), "FOUR_BYTES_BUF", term592);
        setByteElement(term595, 0, (byte) -124);
        setByteElement(term595, 1, (byte) -105);
        setByteElement(term595, 2, (byte) 25);
        setByteElement(term595, 3, (byte) 16);
        setByteElement(term595, 4, (byte) 39);
        setField(term545, term545.getClass(), "SIX_BYTES_BUF", term595);
        setIntField(term545, term545.getClass(), "blockSize", -2068769794);
        setByteElement(term602, 0, (byte) 123);
        setByteElement(term602, 1, (byte) 16);
        setByteElement(term602, 2, (byte) 2);
        setField(term545, term545.getClass(), "SINGLE", term602);
        setLongField(term545, term545.getClass(), "bytesRead", 1368340889161782793L);
        term607 = (byte[]) newByteArray(5);
        setByteElement(term607, 0, (byte) -120);
        setByteElement(term607, 1, (byte) 96);
        setByteElement(term607, 2, (byte) -41);
        setByteElement(term607, 3, (byte) -88);
        setByteElement(term607, 4, (byte) 39);
        term613 = new Integer(-117576464);
        term615 = new Integer(-1007160944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term607;
        args[1] = term613;
        args[2] = term615;
        try {
            callMethod(klass, "read", argTypes, term545, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


