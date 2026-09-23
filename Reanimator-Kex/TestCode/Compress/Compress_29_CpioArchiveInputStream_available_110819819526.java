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
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.cpio.EqualityUtils.*;
import java.lang.Object;

public class CpioArchiveInputStream_available_110819819526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49;
     Object term36138;

    public CpioArchiveInputStream_available_110819819526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term51 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term81 = (byte[]) newByteArray(5);
        byte[] term88 = (byte[]) newByteArray(4);
        byte[] term93 = (byte[]) newByteArray(3);
        byte[] term97 = (byte[]) newByteArray(4);
        byte[] term103 = (byte[]) newByteArray(1);
        setBooleanField(term49, term49.getClass(), "closed", false);
        setShortField(term51, term51.getClass(), "fileFormat", (short) 9519);
        setIntField(term51, term51.getClass(), "headerSize", 1484323161);
        setIntField(term51, term51.getClass(), "alignmentBoundary", 391863371);
        setLongField(term51, term51.getClass(), "chksum", 2442117782898005296L);
        setLongField(term51, term51.getClass(), "filesize", 6375119433582206027L);
        setLongField(term51, term51.getClass(), "gid", -8257434502486459194L);
        setLongField(term51, term51.getClass(), "inode", -8400487765614892086L);
        setLongField(term51, term51.getClass(), "maj", 5270370404989704783L);
        setLongField(term51, term51.getClass(), "min", 7411271909051562686L);
        setLongField(term51, term51.getClass(), "mode", 4872422362414183754L);
        setLongField(term51, term51.getClass(), "mtime", 6811161968424632369L);
        setField(term51, term51.getClass(), "name", "MuLcgQHgqz");
        setLongField(term51, term51.getClass(), "nlink", -7237588299778557629L);
        setLongField(term51, term51.getClass(), "rmaj", 6967924379644551255L);
        setLongField(term51, term51.getClass(), "rmin", -2813493605142626659L);
        setLongField(term51, term51.getClass(), "uid", -8885298608300233488L);
        setField(term49, term49.getClass(), "entry", term51);
        setLongField(term49, term49.getClass(), "entryBytesRead", -4325723315152823407L);
        setBooleanField(term49, term49.getClass(), "entryEOF", false);
        setByteElement(term81, 0, (byte) 47);
        setByteElement(term81, 1, (byte) 48);
        setByteElement(term81, 2, (byte) 89);
        setByteElement(term81, 3, (byte) 75);
        setByteElement(term81, 4, (byte) 18);
        setField(term49, term49.getClass(), "tmpbuf", term81);
        setLongField(term49, term49.getClass(), "crc", 2535595959091595249L);
        setField(term49, term49.getClass(), "in", null);
        setByteElement(term88, 0, (byte) -58);
        setByteElement(term88, 1, (byte) -29);
        setByteElement(term88, 2, (byte) -54);
        setByteElement(term88, 3, (byte) -10);
        setField(term49, term49.getClass(), "TWO_BYTES_BUF", term88);
        setByteElement(term93, 0, (byte) 79);
        setByteElement(term93, 1, (byte) -119);
        setByteElement(term93, 2, (byte) -66);
        setField(term49, term49.getClass(), "FOUR_BYTES_BUF", term93);
        setByteElement(term97, 0, (byte) 83);
        setByteElement(term97, 1, (byte) 74);
        setByteElement(term97, 2, (byte) -71);
        setByteElement(term97, 3, (byte) 49);
        setField(term49, term49.getClass(), "SIX_BYTES_BUF", term97);
        setIntField(term49, term49.getClass(), "blockSize", -1922583790);
        setField(term49, term49.getClass(), "zipEncoding", null);
        setByteElement(term103, 0, (byte) -54);
        setField(term49, term49.getClass(), "SINGLE", term103);
        setLongField(term49, term49.getClass(), "bytesRead", -5476826692763582090L);
        term36138 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term36139 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term36142 = (byte[]) newByteArray(5);
        byte[] term36143 = (byte[]) newByteArray(4);
        byte[] term36144 = (byte[]) newByteArray(3);
        byte[] term36145 = (byte[]) newByteArray(4);
        byte[] term36146 = (byte[]) newByteArray(1);
        setBooleanField(term36138, term36138.getClass(), "closed", false);
        setShortField(term36139, term36139.getClass(), "fileFormat", (short) 9519);
        setIntField(term36139, term36139.getClass(), "headerSize", 1484323161);
        setIntField(term36139, term36139.getClass(), "alignmentBoundary", 391863371);
        setLongField(term36139, term36139.getClass(), "chksum", 2442117782898005296L);
        setLongField(term36139, term36139.getClass(), "filesize", 6375119433582206027L);
        setLongField(term36139, term36139.getClass(), "gid", -8257434502486459194L);
        setLongField(term36139, term36139.getClass(), "inode", -8400487765614892086L);
        setLongField(term36139, term36139.getClass(), "maj", 5270370404989704783L);
        setLongField(term36139, term36139.getClass(), "min", 7411271909051562686L);
        setLongField(term36139, term36139.getClass(), "mode", 4872422362414183754L);
        setLongField(term36139, term36139.getClass(), "mtime", 6811161968424632369L);
        setField(term36139, term36139.getClass(), "name", "MuLcgQHgqz");
        setLongField(term36139, term36139.getClass(), "nlink", -7237588299778557629L);
        setLongField(term36139, term36139.getClass(), "rmaj", 6967924379644551255L);
        setLongField(term36139, term36139.getClass(), "rmin", -2813493605142626659L);
        setLongField(term36139, term36139.getClass(), "uid", -8885298608300233488L);
        setField(term36138, term36138.getClass(), "entry", term36139);
        setLongField(term36138, term36138.getClass(), "entryBytesRead", -4325723315152823407L);
        setBooleanField(term36138, term36138.getClass(), "entryEOF", false);
        setByteElement(term36142, 0, (byte) 47);
        setByteElement(term36142, 1, (byte) 48);
        setByteElement(term36142, 2, (byte) 89);
        setByteElement(term36142, 3, (byte) 75);
        setByteElement(term36142, 4, (byte) 18);
        setField(term36138, term36138.getClass(), "tmpbuf", term36142);
        setLongField(term36138, term36138.getClass(), "crc", 2535595959091595249L);
        setField(term36138, term36138.getClass(), "in", null);
        setByteElement(term36143, 0, (byte) -58);
        setByteElement(term36143, 1, (byte) -29);
        setByteElement(term36143, 2, (byte) -54);
        setByteElement(term36143, 3, (byte) -10);
        setField(term36138, term36138.getClass(), "TWO_BYTES_BUF", term36143);
        setByteElement(term36144, 0, (byte) 79);
        setByteElement(term36144, 1, (byte) -119);
        setByteElement(term36144, 2, (byte) -66);
        setField(term36138, term36138.getClass(), "FOUR_BYTES_BUF", term36144);
        setByteElement(term36145, 0, (byte) 83);
        setByteElement(term36145, 1, (byte) 74);
        setByteElement(term36145, 2, (byte) -71);
        setByteElement(term36145, 3, (byte) 49);
        setField(term36138, term36138.getClass(), "SIX_BYTES_BUF", term36145);
        setIntField(term36138, term36138.getClass(), "blockSize", -1922583790);
        setField(term36138, term36138.getClass(), "zipEncoding", null);
        setByteElement(term36146, 0, (byte) -54);
        setField(term36138, term36138.getClass(), "SINGLE", term36146);
        setLongField(term36138, term36138.getClass(), "bytesRead", -5476826692763582090L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "available", argTypes, term49, args);
        assertTrue(recursiveEquals(term49, term36138));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


