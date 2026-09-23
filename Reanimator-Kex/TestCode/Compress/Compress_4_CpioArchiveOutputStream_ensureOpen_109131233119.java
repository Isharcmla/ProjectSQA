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
import java.util.HashMap;

public class CpioArchiveOutputStream_ensureOpen_109131233119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term1750;

    public CpioArchiveOutputStream_ensureOpen_109131233119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term35 = new HashMap();
        term3 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term4 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term42 = (byte[]) newByteArray(5);
        setShortField(term4, term4.getClass(), "fileFormat", (short) -10960);
        setIntField(term4, term4.getClass(), "headerSize", 568599855);
        setIntField(term4, term4.getClass(), "alignmentBoundary", 1162663216);
        setLongField(term4, term4.getClass(), "chksum", 2442117782898005296L);
        setLongField(term4, term4.getClass(), "filesize", 6375119433582206027L);
        setLongField(term4, term4.getClass(), "gid", -8257434502486459194L);
        setLongField(term4, term4.getClass(), "inode", -8400487765614892086L);
        setLongField(term4, term4.getClass(), "maj", 5270370404989704783L);
        setLongField(term4, term4.getClass(), "min", 7411271909051562686L);
        setLongField(term4, term4.getClass(), "mode", 4872422362414183754L);
        setLongField(term4, term4.getClass(), "mtime", 6811161968424632369L);
        setField(term4, term4.getClass(), "name", "PAEBtnZtTD");
        setLongField(term4, term4.getClass(), "nlink", -7237588299778557629L);
        setLongField(term4, term4.getClass(), "rmaj", 6967924379644551255L);
        setLongField(term4, term4.getClass(), "rmin", -2813493605142626659L);
        setLongField(term4, term4.getClass(), "uid", -8885298608300233488L);
        setField(term3, term3.getClass(), "entry", term4);
        setBooleanField(term3, term3.getClass(), "closed", false);
        setBooleanField(term3, term3.getClass(), "finished", false);
        setShortField(term3, term3.getClass(), "entryFormat", (short) -1703);
        setField(term3, term3.getClass(), "names", term35);
        setLongField(term3, term3.getClass(), "crc", -4325723315152823407L);
        setLongField(term3, term3.getClass(), "written", 2535595959091595249L);
        setField(term3, term3.getClass(), "out", null);
        setByteElement(term42, 0, (byte) 47);
        setByteElement(term42, 1, (byte) 48);
        setByteElement(term42, 2, (byte) 89);
        setByteElement(term42, 3, (byte) 75);
        setByteElement(term42, 4, (byte) 18);
        setField(term3, term3.getClass(), "oneByte", term42);
        HashMap term1754 = new HashMap();
        term1750 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term1751 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term1755 = (byte[]) newByteArray(5);
        setShortField(term1751, term1751.getClass(), "fileFormat", (short) -10960);
        setIntField(term1751, term1751.getClass(), "headerSize", 568599855);
        setIntField(term1751, term1751.getClass(), "alignmentBoundary", 1162663216);
        setLongField(term1751, term1751.getClass(), "chksum", 2442117782898005296L);
        setLongField(term1751, term1751.getClass(), "filesize", 6375119433582206027L);
        setLongField(term1751, term1751.getClass(), "gid", -8257434502486459194L);
        setLongField(term1751, term1751.getClass(), "inode", -8400487765614892086L);
        setLongField(term1751, term1751.getClass(), "maj", 5270370404989704783L);
        setLongField(term1751, term1751.getClass(), "min", 7411271909051562686L);
        setLongField(term1751, term1751.getClass(), "mode", 4872422362414183754L);
        setLongField(term1751, term1751.getClass(), "mtime", 6811161968424632369L);
        setField(term1751, term1751.getClass(), "name", "PAEBtnZtTD");
        setLongField(term1751, term1751.getClass(), "nlink", -7237588299778557629L);
        setLongField(term1751, term1751.getClass(), "rmaj", 6967924379644551255L);
        setLongField(term1751, term1751.getClass(), "rmin", -2813493605142626659L);
        setLongField(term1751, term1751.getClass(), "uid", -8885298608300233488L);
        setField(term1750, term1750.getClass(), "entry", term1751);
        setBooleanField(term1750, term1750.getClass(), "closed", false);
        setBooleanField(term1750, term1750.getClass(), "finished", false);
        setShortField(term1750, term1750.getClass(), "entryFormat", (short) -1703);
        setField(term1750, term1750.getClass(), "names", term1754);
        setLongField(term1750, term1750.getClass(), "crc", -4325723315152823407L);
        setLongField(term1750, term1750.getClass(), "written", 2535595959091595249L);
        setField(term1750, term1750.getClass(), "out", null);
        setByteElement(term1755, 0, (byte) 47);
        setByteElement(term1755, 1, (byte) 48);
        setByteElement(term1755, 2, (byte) 89);
        setByteElement(term1755, 3, (byte) 75);
        setByteElement(term1755, 4, (byte) 18);
        setField(term1750, term1750.getClass(), "oneByte", term1755);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "ensureOpen", argTypes, term3, args);
        assertTrue(recursiveEquals(term3, term1750));
    }

};


