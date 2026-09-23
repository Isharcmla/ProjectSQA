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

public class CpioArchiveInputStream_read_113667207632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term591;
     Object term653;
     Object term659;
     Object term661;

    public CpioArchiveInputStream_read_113667207632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term591 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term593 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term623 = (byte[]) newByteArray(6);
        byte[] term631 = (byte[]) newByteArray(6);
        byte[] term638 = (byte[]) newByteArray(2);
        byte[] term641 = (byte[]) newByteArray(5);
        byte[] term648 = (byte[]) newByteArray(3);
        setBooleanField(term591, term591.getClass(), "closed", false);
        setShortField(term593, term593.getClass(), "fileFormat", (short) 30947);
        setIntField(term593, term593.getClass(), "headerSize", -6029667);
        setIntField(term593, term593.getClass(), "alignmentBoundary", -2068769794);
        setLongField(term593, term593.getClass(), "chksum", 6689117472719450333L);
        setLongField(term593, term593.getClass(), "filesize", 5836128569274066678L);
        setLongField(term593, term593.getClass(), "gid", -2177368829816872572L);
        setLongField(term593, term593.getClass(), "inode", -8463029266761149071L);
        setLongField(term593, term593.getClass(), "maj", 3133860696238261492L);
        setLongField(term593, term593.getClass(), "min", 7247160664318067468L);
        setLongField(term593, term593.getClass(), "mode", 2135754395358000892L);
        setLongField(term593, term593.getClass(), "mtime", -8085190702504231560L);
        setField(term593, term593.getClass(), "name", "hRNSzYYIrc");
        setLongField(term593, term593.getClass(), "nlink", 1672578078364590450L);
        setLongField(term593, term593.getClass(), "rmaj", 4949335493504695457L);
        setLongField(term593, term593.getClass(), "rmin", -5216789073301458893L);
        setLongField(term593, term593.getClass(), "uid", -1832940336320585644L);
        setField(term591, term591.getClass(), "entry", term593);
        setLongField(term591, term591.getClass(), "entryBytesRead", -8033714905181142681L);
        setBooleanField(term591, term591.getClass(), "entryEOF", true);
        setByteElement(term623, 0, (byte) 96);
        setByteElement(term623, 1, (byte) 51);
        setByteElement(term623, 2, (byte) -53);
        setByteElement(term623, 3, (byte) -8);
        setByteElement(term623, 4, (byte) -9);
        setByteElement(term623, 5, (byte) 97);
        setField(term591, term591.getClass(), "tmpbuf", term623);
        setLongField(term591, term591.getClass(), "crc", -9040825890007374809L);
        setField(term591, term591.getClass(), "in", null);
        setByteElement(term631, 0, (byte) -46);
        setByteElement(term631, 1, (byte) 14);
        setByteElement(term631, 2, (byte) 34);
        setByteElement(term631, 3, (byte) 126);
        setByteElement(term631, 4, (byte) 7);
        setByteElement(term631, 5, (byte) -96);
        setField(term591, term591.getClass(), "TWO_BYTES_BUF", term631);
        setByteElement(term638, 0, (byte) -22);
        setByteElement(term638, 1, (byte) -5);
        setField(term591, term591.getClass(), "FOUR_BYTES_BUF", term638);
        setByteElement(term641, 0, (byte) -124);
        setByteElement(term641, 1, (byte) -105);
        setByteElement(term641, 2, (byte) 25);
        setByteElement(term641, 3, (byte) 16);
        setByteElement(term641, 4, (byte) 39);
        setField(term591, term591.getClass(), "SIX_BYTES_BUF", term641);
        setIntField(term591, term591.getClass(), "blockSize", -117576464);
        setField(term591, term591.getClass(), "zipEncoding", null);
        setByteElement(term648, 0, (byte) 123);
        setByteElement(term648, 1, (byte) 16);
        setByteElement(term648, 2, (byte) 2);
        setField(term591, term591.getClass(), "SINGLE", term648);
        setLongField(term591, term591.getClass(), "bytesRead", 1368340889161782793L);
        term653 = (byte[]) newByteArray(5);
        setByteElement(term653, 0, (byte) -120);
        setByteElement(term653, 1, (byte) 96);
        setByteElement(term653, 2, (byte) -41);
        setByteElement(term653, 3, (byte) -88);
        setByteElement(term653, 4, (byte) 39);
        term659 = new Integer(-1007160944);
        term661 = new Integer(1135664017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term653;
        args[1] = term659;
        args[2] = term661;
        try {
            callMethod(klass, "read", argTypes, term591, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


