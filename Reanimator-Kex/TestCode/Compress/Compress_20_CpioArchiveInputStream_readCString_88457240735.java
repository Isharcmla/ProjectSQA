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

public class CpioArchiveInputStream_readCString_88457240735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1287;
     Object term1345;

    public CpioArchiveInputStream_readCString_88457240735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1287 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term1289 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term1319 = (byte[]) newByteArray(6);
        byte[] term1327 = (byte[]) newByteArray(5);
        byte[] term1333 = (byte[]) newByteArray(1);
        byte[] term1335 = (byte[]) newByteArray(0);
        byte[] term1337 = (byte[]) newByteArray(6);
        setBooleanField(term1287, term1287.getClass(), "closed", true);
        setShortField(term1289, term1289.getClass(), "fileFormat", (short) -2742);
        setIntField(term1289, term1289.getClass(), "headerSize", 579005622);
        setIntField(term1289, term1289.getClass(), "alignmentBoundary", -14890619);
        setLongField(term1289, term1289.getClass(), "chksum", -7310273014364148916L);
        setLongField(term1289, term1289.getClass(), "filesize", 8863790908271299748L);
        setLongField(term1289, term1289.getClass(), "gid", 9205327385733285058L);
        setLongField(term1289, term1289.getClass(), "inode", 4199886998224701110L);
        setLongField(term1289, term1289.getClass(), "maj", 8540994973773607992L);
        setLongField(term1289, term1289.getClass(), "min", -2338103433822116635L);
        setLongField(term1289, term1289.getClass(), "mode", -1885698929232124806L);
        setLongField(term1289, term1289.getClass(), "mtime", 5731563613239387113L);
        setField(term1289, term1289.getClass(), "name", "LQFpaHEwXR");
        setLongField(term1289, term1289.getClass(), "nlink", 3381333711768010594L);
        setLongField(term1289, term1289.getClass(), "rmaj", 3580984732036213717L);
        setLongField(term1289, term1289.getClass(), "rmin", 5330761990446327930L);
        setLongField(term1289, term1289.getClass(), "uid", -3954795081650780841L);
        setField(term1287, term1287.getClass(), "entry", term1289);
        setLongField(term1287, term1287.getClass(), "entryBytesRead", 3288791194263207397L);
        setBooleanField(term1287, term1287.getClass(), "entryEOF", true);
        setByteElement(term1319, 0, (byte) -88);
        setByteElement(term1319, 1, (byte) -73);
        setByteElement(term1319, 2, (byte) 105);
        setByteElement(term1319, 3, (byte) -86);
        setByteElement(term1319, 4, (byte) 84);
        setByteElement(term1319, 5, (byte) -70);
        setField(term1287, term1287.getClass(), "tmpbuf", term1319);
        setLongField(term1287, term1287.getClass(), "crc", 3288941170644426558L);
        setField(term1287, term1287.getClass(), "in", null);
        setByteElement(term1327, 0, (byte) 84);
        setByteElement(term1327, 1, (byte) 114);
        setByteElement(term1327, 2, (byte) 60);
        setByteElement(term1327, 3, (byte) -20);
        setByteElement(term1327, 4, (byte) 100);
        setField(term1287, term1287.getClass(), "TWO_BYTES_BUF", term1327);
        setByteElement(term1333, 0, (byte) -41);
        setField(term1287, term1287.getClass(), "FOUR_BYTES_BUF", term1333);
        setField(term1287, term1287.getClass(), "SIX_BYTES_BUF", term1335);
        setIntField(term1287, term1287.getClass(), "blockSize", 1632125673);
        setByteElement(term1337, 0, (byte) -70);
        setByteElement(term1337, 1, (byte) -5);
        setByteElement(term1337, 2, (byte) 119);
        setByteElement(term1337, 3, (byte) 81);
        setByteElement(term1337, 4, (byte) -28);
        setByteElement(term1337, 5, (byte) -18);
        setField(term1287, term1287.getClass(), "SINGLE", term1337);
        setLongField(term1287, term1287.getClass(), "bytesRead", -8338004844694486146L);
        term1345 = new Integer(454281060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1345;
        try {
            callMethod(klass, "readCString", argTypes, term1287, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


