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
import java.util.HashMap;

public class CpioArchiveOutputStream_close_112084508334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term949;

    public CpioArchiveOutputStream_close_112084508334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term981 = new HashMap();
        term949 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term950 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term1010 = (byte[]) newByteArray(6);
        setShortField(term950, term950.getClass(), "fileFormat", (short) 10887);
        setIntField(term950, term950.getClass(), "headerSize", -184153539);
        setIntField(term950, term950.getClass(), "alignmentBoundary", 493620644);
        setLongField(term950, term950.getClass(), "chksum", 4689907154423223972L);
        setLongField(term950, term950.getClass(), "filesize", 8512025621149521819L);
        setLongField(term950, term950.getClass(), "gid", 2022482096970820459L);
        setLongField(term950, term950.getClass(), "inode", 6315101499811179240L);
        setLongField(term950, term950.getClass(), "maj", -3033337370154155851L);
        setLongField(term950, term950.getClass(), "min", -3130003589475815807L);
        setLongField(term950, term950.getClass(), "mode", -5344598381371854750L);
        setLongField(term950, term950.getClass(), "mtime", -3718250311794019732L);
        setField(term950, term950.getClass(), "name", "SbAoxhfrkn");
        setLongField(term950, term950.getClass(), "nlink", -5935517391653614345L);
        setLongField(term950, term950.getClass(), "rmaj", -6521561238735301071L);
        setLongField(term950, term950.getClass(), "rmin", -6609679920238945303L);
        setLongField(term950, term950.getClass(), "uid", -7296330380944173376L);
        setField(term949, term949.getClass(), "entry", term950);
        setBooleanField(term949, term949.getClass(), "closed", false);
        setBooleanField(term949, term949.getClass(), "finished", true);
        setShortField(term949, term949.getClass(), "entryFormat", (short) -7799);
        setField(term949, term949.getClass(), "names", term981);
        setLongField(term949, term949.getClass(), "crc", 4139034517298316285L);
        setLongField(term949, term949.getClass(), "written", 5797412846146719084L);
        setField(term949, term949.getClass(), "out", null);
        setIntField(term949, term949.getClass(), "blockSize", 97029295);
        setLongField(term949, term949.getClass(), "nextArtificalDeviceAndInode", 5319740127125920367L);
        setField(term949, term949.getClass(), "zipEncoding", null);
        setByteElement(term1010, 0, (byte) 72);
        setByteElement(term1010, 1, (byte) 111);
        setByteElement(term1010, 2, (byte) 99);
        setByteElement(term1010, 3, (byte) -12);
        setByteElement(term1010, 4, (byte) -61);
        setByteElement(term1010, 5, (byte) -85);
        setField(term949, term949.getClass(), "oneByte", term1010);
        setLongField(term949, term949.getClass(), "bytesWritten", 6465987664600701876L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term949, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


