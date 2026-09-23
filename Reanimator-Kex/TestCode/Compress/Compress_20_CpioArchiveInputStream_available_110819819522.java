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

public class CpioArchiveInputStream_available_110819819522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term18194;

    public CpioArchiveInputStream_available_110819819522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term5 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term35 = (byte[]) newByteArray(5);
        byte[] term42 = (byte[]) newByteArray(4);
        byte[] term47 = (byte[]) newByteArray(3);
        byte[] term51 = (byte[]) newByteArray(4);
        byte[] term57 = (byte[]) newByteArray(1);
        setBooleanField(term3, term3.getClass(), "closed", false);
        setShortField(term5, term5.getClass(), "fileFormat", (short) 9519);
        setIntField(term5, term5.getClass(), "headerSize", 1162663216);
        setIntField(term5, term5.getClass(), "alignmentBoundary", 1484323161);
        setLongField(term5, term5.getClass(), "chksum", 2442117782898005296L);
        setLongField(term5, term5.getClass(), "filesize", 6375119433582206027L);
        setLongField(term5, term5.getClass(), "gid", -8257434502486459194L);
        setLongField(term5, term5.getClass(), "inode", -8400487765614892086L);
        setLongField(term5, term5.getClass(), "maj", 5270370404989704783L);
        setLongField(term5, term5.getClass(), "min", 7411271909051562686L);
        setLongField(term5, term5.getClass(), "mode", 4872422362414183754L);
        setLongField(term5, term5.getClass(), "mtime", 6811161968424632369L);
        setField(term5, term5.getClass(), "name", "PAEBtnZtTD");
        setLongField(term5, term5.getClass(), "nlink", -7237588299778557629L);
        setLongField(term5, term5.getClass(), "rmaj", 6967924379644551255L);
        setLongField(term5, term5.getClass(), "rmin", -2813493605142626659L);
        setLongField(term5, term5.getClass(), "uid", -8885298608300233488L);
        setField(term3, term3.getClass(), "entry", term5);
        setLongField(term3, term3.getClass(), "entryBytesRead", -4325723315152823407L);
        setBooleanField(term3, term3.getClass(), "entryEOF", false);
        setByteElement(term35, 0, (byte) 47);
        setByteElement(term35, 1, (byte) 48);
        setByteElement(term35, 2, (byte) 89);
        setByteElement(term35, 3, (byte) 75);
        setByteElement(term35, 4, (byte) 18);
        setField(term3, term3.getClass(), "tmpbuf", term35);
        setLongField(term3, term3.getClass(), "crc", 2535595959091595249L);
        setField(term3, term3.getClass(), "in", null);
        setByteElement(term42, 0, (byte) -58);
        setByteElement(term42, 1, (byte) -29);
        setByteElement(term42, 2, (byte) -54);
        setByteElement(term42, 3, (byte) -10);
        setField(term3, term3.getClass(), "TWO_BYTES_BUF", term42);
        setByteElement(term47, 0, (byte) 79);
        setByteElement(term47, 1, (byte) -119);
        setByteElement(term47, 2, (byte) -66);
        setField(term3, term3.getClass(), "FOUR_BYTES_BUF", term47);
        setByteElement(term51, 0, (byte) 83);
        setByteElement(term51, 1, (byte) 74);
        setByteElement(term51, 2, (byte) -71);
        setByteElement(term51, 3, (byte) 49);
        setField(term3, term3.getClass(), "SIX_BYTES_BUF", term51);
        setIntField(term3, term3.getClass(), "blockSize", 391863371);
        setByteElement(term57, 0, (byte) -54);
        setField(term3, term3.getClass(), "SINGLE", term57);
        setLongField(term3, term3.getClass(), "bytesRead", -5476826692763582090L);
        term18194 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        Object term18195 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term18198 = (byte[]) newByteArray(5);
        byte[] term18199 = (byte[]) newByteArray(4);
        byte[] term18200 = (byte[]) newByteArray(3);
        byte[] term18201 = (byte[]) newByteArray(4);
        byte[] term18202 = (byte[]) newByteArray(1);
        setBooleanField(term18194, term18194.getClass(), "closed", false);
        setShortField(term18195, term18195.getClass(), "fileFormat", (short) 9519);
        setIntField(term18195, term18195.getClass(), "headerSize", 1162663216);
        setIntField(term18195, term18195.getClass(), "alignmentBoundary", 1484323161);
        setLongField(term18195, term18195.getClass(), "chksum", 2442117782898005296L);
        setLongField(term18195, term18195.getClass(), "filesize", 6375119433582206027L);
        setLongField(term18195, term18195.getClass(), "gid", -8257434502486459194L);
        setLongField(term18195, term18195.getClass(), "inode", -8400487765614892086L);
        setLongField(term18195, term18195.getClass(), "maj", 5270370404989704783L);
        setLongField(term18195, term18195.getClass(), "min", 7411271909051562686L);
        setLongField(term18195, term18195.getClass(), "mode", 4872422362414183754L);
        setLongField(term18195, term18195.getClass(), "mtime", 6811161968424632369L);
        setField(term18195, term18195.getClass(), "name", "PAEBtnZtTD");
        setLongField(term18195, term18195.getClass(), "nlink", -7237588299778557629L);
        setLongField(term18195, term18195.getClass(), "rmaj", 6967924379644551255L);
        setLongField(term18195, term18195.getClass(), "rmin", -2813493605142626659L);
        setLongField(term18195, term18195.getClass(), "uid", -8885298608300233488L);
        setField(term18194, term18194.getClass(), "entry", term18195);
        setLongField(term18194, term18194.getClass(), "entryBytesRead", -4325723315152823407L);
        setBooleanField(term18194, term18194.getClass(), "entryEOF", false);
        setByteElement(term18198, 0, (byte) 47);
        setByteElement(term18198, 1, (byte) 48);
        setByteElement(term18198, 2, (byte) 89);
        setByteElement(term18198, 3, (byte) 75);
        setByteElement(term18198, 4, (byte) 18);
        setField(term18194, term18194.getClass(), "tmpbuf", term18198);
        setLongField(term18194, term18194.getClass(), "crc", 2535595959091595249L);
        setField(term18194, term18194.getClass(), "in", null);
        setByteElement(term18199, 0, (byte) -58);
        setByteElement(term18199, 1, (byte) -29);
        setByteElement(term18199, 2, (byte) -54);
        setByteElement(term18199, 3, (byte) -10);
        setField(term18194, term18194.getClass(), "TWO_BYTES_BUF", term18199);
        setByteElement(term18200, 0, (byte) 79);
        setByteElement(term18200, 1, (byte) -119);
        setByteElement(term18200, 2, (byte) -66);
        setField(term18194, term18194.getClass(), "FOUR_BYTES_BUF", term18200);
        setByteElement(term18201, 0, (byte) 83);
        setByteElement(term18201, 1, (byte) 74);
        setByteElement(term18201, 2, (byte) -71);
        setByteElement(term18201, 3, (byte) 49);
        setField(term18194, term18194.getClass(), "SIX_BYTES_BUF", term18201);
        setIntField(term18194, term18194.getClass(), "blockSize", 391863371);
        setByteElement(term18202, 0, (byte) -54);
        setField(term18194, term18194.getClass(), "SINGLE", term18202);
        setLongField(term18194, term18194.getClass(), "bytesRead", -5476826692763582090L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "available", argTypes, term3, args);
        assertTrue(recursiveEquals(term3, term18194));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


