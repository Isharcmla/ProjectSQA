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
import java.lang.Integer;

public class CpioArchiveInputStream_skip_109981824731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term493;
     Object term556;
     Object term37543;

    public CpioArchiveInputStream_skip_109981824731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term493 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term495 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term525 = (byte[]) newByteArray(6);
        byte[] term533 = (byte[]) newByteArray(5);
        byte[] term539 = (byte[]) newByteArray(3);
        byte[] term543 = (byte[]) newByteArray(7);
        byte[] term552 = (byte[]) newByteArray(2);
        setBooleanField(term493, term493.getClass(), "closed", false);
        setShortField(term495, term495.getClass(), "fileFormat", (short) 31942);
        setIntField(term495, term495.getClass(), "headerSize", -1456670397);
        setIntField(term495, term495.getClass(), "alignmentBoundary", 1622346318);
        setLongField(term495, term495.getClass(), "chksum", -7291743527973326814L);
        setLongField(term495, term495.getClass(), "filesize", -5963439350418910964L);
        setLongField(term495, term495.getClass(), "gid", 9013624480170062917L);
        setLongField(term495, term495.getClass(), "inode", 7862575738391801707L);
        setLongField(term495, term495.getClass(), "maj", 50358265865610362L);
        setLongField(term495, term495.getClass(), "min", 5510783420697225605L);
        setLongField(term495, term495.getClass(), "mode", 6005241913654469005L);
        setLongField(term495, term495.getClass(), "mtime", -1983291584002806658L);
        setField(term495, term495.getClass(), "name", "MjGYSRKTNF");
        setLongField(term495, term495.getClass(), "nlink", 5946780097489996391L);
        setLongField(term495, term495.getClass(), "rmaj", -8652538484981166496L);
        setLongField(term495, term495.getClass(), "rmin", 2701184207686293431L);
        setLongField(term495, term495.getClass(), "uid", 4474998035090263139L);
        setField(term493, term493.getClass(), "entry", term495);
        setLongField(term493, term493.getClass(), "entryBytesRead", 2848819812340321742L);
        setBooleanField(term493, term493.getClass(), "entryEOF", true);
        setByteElement(term525, 0, (byte) 33);
        setByteElement(term525, 1, (byte) -74);
        setByteElement(term525, 2, (byte) -84);
        setByteElement(term525, 3, (byte) -53);
        setByteElement(term525, 4, (byte) -93);
        setByteElement(term525, 5, (byte) 82);
        setField(term493, term493.getClass(), "tmpbuf", term525);
        setLongField(term493, term493.getClass(), "crc", -8876856890348836498L);
        setField(term493, term493.getClass(), "in", null);
        setByteElement(term533, 0, (byte) -89);
        setByteElement(term533, 1, (byte) 24);
        setByteElement(term533, 2, (byte) 123);
        setByteElement(term533, 3, (byte) -101);
        setByteElement(term533, 4, (byte) -102);
        setField(term493, term493.getClass(), "TWO_BYTES_BUF", term533);
        setByteElement(term539, 0, (byte) -95);
        setByteElement(term539, 1, (byte) -2);
        setByteElement(term539, 2, (byte) 28);
        setField(term493, term493.getClass(), "FOUR_BYTES_BUF", term539);
        setByteElement(term543, 0, (byte) 84);
        setByteElement(term543, 1, (byte) 85);
        setByteElement(term543, 2, (byte) -17);
        setByteElement(term543, 3, (byte) -83);
        setByteElement(term543, 4, (byte) 48);
        setByteElement(term543, 5, (byte) -128);
        setByteElement(term543, 6, (byte) 70);
        setField(term493, term493.getClass(), "SIX_BYTES_BUF", term543);
        setIntField(term493, term493.getClass(), "blockSize", 1048535127);
        setField(term493, term493.getClass(), "zipEncoding", null);
        setByteElement(term552, 0, (byte) -28);
        setByteElement(term552, 1, (byte) 115);
        setField(term493, term493.getClass(), "SINGLE", term552);
        setLongField(term493, term493.getClass(), "bytesRead", 846579494941632714L);
        term556 = new Integer(-655067527);
        term37543 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term37544 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term37547 = (byte[]) newByteArray(6);
        byte[] term37548 = (byte[]) newByteArray(5);
        byte[] term37549 = (byte[]) newByteArray(3);
        byte[] term37550 = (byte[]) newByteArray(7);
        byte[] term37551 = (byte[]) newByteArray(2);
        setBooleanField(term37543, term37543.getClass(), "closed", false);
        setShortField(term37544, term37544.getClass(), "fileFormat", (short) 31942);
        setIntField(term37544, term37544.getClass(), "headerSize", -1456670397);
        setIntField(term37544, term37544.getClass(), "alignmentBoundary", 1622346318);
        setLongField(term37544, term37544.getClass(), "chksum", -7291743527973326814L);
        setLongField(term37544, term37544.getClass(), "filesize", -5963439350418910964L);
        setLongField(term37544, term37544.getClass(), "gid", 9013624480170062917L);
        setLongField(term37544, term37544.getClass(), "inode", 7862575738391801707L);
        setLongField(term37544, term37544.getClass(), "maj", 50358265865610362L);
        setLongField(term37544, term37544.getClass(), "min", 5510783420697225605L);
        setLongField(term37544, term37544.getClass(), "mode", 6005241913654469005L);
        setLongField(term37544, term37544.getClass(), "mtime", -1983291584002806658L);
        setField(term37544, term37544.getClass(), "name", "MjGYSRKTNF");
        setLongField(term37544, term37544.getClass(), "nlink", 5946780097489996391L);
        setLongField(term37544, term37544.getClass(), "rmaj", -8652538484981166496L);
        setLongField(term37544, term37544.getClass(), "rmin", 2701184207686293431L);
        setLongField(term37544, term37544.getClass(), "uid", 4474998035090263139L);
        setField(term37543, term37543.getClass(), "entry", term37544);
        setLongField(term37543, term37543.getClass(), "entryBytesRead", 2848819812340321742L);
        setBooleanField(term37543, term37543.getClass(), "entryEOF", true);
        setByteElement(term37547, 0, (byte) 33);
        setByteElement(term37547, 1, (byte) -74);
        setByteElement(term37547, 2, (byte) -84);
        setByteElement(term37547, 3, (byte) -53);
        setByteElement(term37547, 4, (byte) -93);
        setByteElement(term37547, 5, (byte) 82);
        setField(term37543, term37543.getClass(), "tmpbuf", term37547);
        setLongField(term37543, term37543.getClass(), "crc", -8876856890348836498L);
        setField(term37543, term37543.getClass(), "in", null);
        setByteElement(term37548, 0, (byte) -89);
        setByteElement(term37548, 1, (byte) 24);
        setByteElement(term37548, 2, (byte) 123);
        setByteElement(term37548, 3, (byte) -101);
        setByteElement(term37548, 4, (byte) -102);
        setField(term37543, term37543.getClass(), "TWO_BYTES_BUF", term37548);
        setByteElement(term37549, 0, (byte) -95);
        setByteElement(term37549, 1, (byte) -2);
        setByteElement(term37549, 2, (byte) 28);
        setField(term37543, term37543.getClass(), "FOUR_BYTES_BUF", term37549);
        setByteElement(term37550, 0, (byte) 84);
        setByteElement(term37550, 1, (byte) 85);
        setByteElement(term37550, 2, (byte) -17);
        setByteElement(term37550, 3, (byte) -83);
        setByteElement(term37550, 4, (byte) 48);
        setByteElement(term37550, 5, (byte) -128);
        setByteElement(term37550, 6, (byte) 70);
        setField(term37543, term37543.getClass(), "SIX_BYTES_BUF", term37550);
        setIntField(term37543, term37543.getClass(), "blockSize", 1048535127);
        setField(term37543, term37543.getClass(), "zipEncoding", null);
        setByteElement(term37551, 0, (byte) -28);
        setByteElement(term37551, 1, (byte) 115);
        setField(term37543, term37543.getClass(), "SINGLE", term37551);
        setLongField(term37543, term37543.getClass(), "bytesRead", 846579494941632714L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term556;
        callMethod(klass, "skip", argTypes, term493, args);
        assertTrue(recursiveEquals(term493, term37543));
        assertTrue(recursiveEquals(term556, -655067527));
    }

};


