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

public class CpioArchiveOutputStream_ensureOpen_109131233121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term1505;

    public CpioArchiveOutputStream_ensureOpen_109131233121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term34 = new HashMap();
        term3 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term4 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term4, term4.getClass(), "chksum", 2442117782898005296L);
        setShortField(term4, term4.getClass(), "fileFormat", (short) -10960);
        setLongField(term4, term4.getClass(), "filesize", 6375119433582206027L);
        setLongField(term4, term4.getClass(), "gid", -8257434502486459194L);
        setLongField(term4, term4.getClass(), "headerSize", -8400487765614892086L);
        setLongField(term4, term4.getClass(), "inode", 5270370404989704783L);
        setLongField(term4, term4.getClass(), "maj", 7411271909051562686L);
        setLongField(term4, term4.getClass(), "min", 4872422362414183754L);
        setLongField(term4, term4.getClass(), "mode", 6811161968424632369L);
        setLongField(term4, term4.getClass(), "mtime", -7237588299778557629L);
        setField(term4, term4.getClass(), "name", "PAEBtnZtTD");
        setLongField(term4, term4.getClass(), "nlink", 6967924379644551255L);
        setLongField(term4, term4.getClass(), "rmaj", -2813493605142626659L);
        setLongField(term4, term4.getClass(), "rmin", -8885298608300233488L);
        setLongField(term4, term4.getClass(), "uid", -4325723315152823407L);
        setField(term3, term3.getClass(), "cpioEntry", term4);
        setBooleanField(term3, term3.getClass(), "closed", false);
        setBooleanField(term3, term3.getClass(), "finished", false);
        setShortField(term3, term3.getClass(), "entryFormat", (short) -1703);
        setField(term3, term3.getClass(), "names", term34);
        setLongField(term3, term3.getClass(), "crc", 2535595959091595249L);
        setLongField(term3, term3.getClass(), "written", -5476826692763582090L);
        setField(term3, term3.getClass(), "out", null);
        HashMap term1509 = new HashMap();
        term1505 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term1506 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term1506, term1506.getClass(), "chksum", 2442117782898005296L);
        setShortField(term1506, term1506.getClass(), "fileFormat", (short) -10960);
        setLongField(term1506, term1506.getClass(), "filesize", 6375119433582206027L);
        setLongField(term1506, term1506.getClass(), "gid", -8257434502486459194L);
        setLongField(term1506, term1506.getClass(), "headerSize", -8400487765614892086L);
        setLongField(term1506, term1506.getClass(), "inode", 5270370404989704783L);
        setLongField(term1506, term1506.getClass(), "maj", 7411271909051562686L);
        setLongField(term1506, term1506.getClass(), "min", 4872422362414183754L);
        setLongField(term1506, term1506.getClass(), "mode", 6811161968424632369L);
        setLongField(term1506, term1506.getClass(), "mtime", -7237588299778557629L);
        setField(term1506, term1506.getClass(), "name", "PAEBtnZtTD");
        setLongField(term1506, term1506.getClass(), "nlink", 6967924379644551255L);
        setLongField(term1506, term1506.getClass(), "rmaj", -2813493605142626659L);
        setLongField(term1506, term1506.getClass(), "rmin", -8885298608300233488L);
        setLongField(term1506, term1506.getClass(), "uid", -4325723315152823407L);
        setField(term1505, term1505.getClass(), "cpioEntry", term1506);
        setBooleanField(term1505, term1505.getClass(), "closed", false);
        setBooleanField(term1505, term1505.getClass(), "finished", false);
        setShortField(term1505, term1505.getClass(), "entryFormat", (short) -1703);
        setField(term1505, term1505.getClass(), "names", term1509);
        setLongField(term1505, term1505.getClass(), "crc", 2535595959091595249L);
        setLongField(term1505, term1505.getClass(), "written", -5476826692763582090L);
        setField(term1505, term1505.getClass(), "out", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "ensureOpen", argTypes, term3, args);
        assertTrue(recursiveEquals(term3, term1505));
    }

};
