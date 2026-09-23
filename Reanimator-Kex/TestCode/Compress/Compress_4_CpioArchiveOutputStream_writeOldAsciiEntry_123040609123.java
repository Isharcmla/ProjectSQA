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

public class CpioArchiveOutputStream_writeOldAsciiEntry_123040609123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term311;
     Object term352;

    public CpioArchiveOutputStream_writeOldAsciiEntry_123040609123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term343 = new HashMap();
        term311 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term312 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term350 = (byte[]) newByteArray(1);
        setShortField(term312, term312.getClass(), "fileFormat", (short) 31422);
        setIntField(term312, term312.getClass(), "headerSize", 1134449235);
        setIntField(term312, term312.getClass(), "alignmentBoundary", -883034806);
        setLongField(term312, term312.getClass(), "chksum", 5510783420697225605L);
        setLongField(term312, term312.getClass(), "filesize", 6005241913654469005L);
        setLongField(term312, term312.getClass(), "gid", -1983291584002806658L);
        setLongField(term312, term312.getClass(), "inode", 5946780097489996391L);
        setLongField(term312, term312.getClass(), "maj", -8652538484981166496L);
        setLongField(term312, term312.getClass(), "min", 2701184207686293431L);
        setLongField(term312, term312.getClass(), "mode", 4474998035090263139L);
        setLongField(term312, term312.getClass(), "mtime", 2848819812340321742L);
        setField(term312, term312.getClass(), "name", "SzjVpOQTyS");
        setLongField(term312, term312.getClass(), "nlink", -8876856890348836498L);
        setLongField(term312, term312.getClass(), "rmaj", 846579494941632714L);
        setLongField(term312, term312.getClass(), "rmin", 6689117472719450333L);
        setLongField(term312, term312.getClass(), "uid", 5836128569274066678L);
        setField(term311, term311.getClass(), "entry", term312);
        setBooleanField(term311, term311.getClass(), "closed", false);
        setBooleanField(term311, term311.getClass(), "finished", true);
        setShortField(term311, term311.getClass(), "entryFormat", (short) 21075);
        setField(term311, term311.getClass(), "names", term343);
        setLongField(term311, term311.getClass(), "crc", -2177368829816872572L);
        setLongField(term311, term311.getClass(), "written", -8463029266761149071L);
        setField(term311, term311.getClass(), "out", null);
        setByteElement(term350, 0, (byte) -54);
        setField(term311, term311.getClass(), "oneByte", term350);
        term352 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setShortField(term352, term352.getClass(), "fileFormat", (short) -2742);
        setIntField(term352, term352.getClass(), "headerSize", 1585847225);
        setIntField(term352, term352.getClass(), "alignmentBoundary", 597278769);
        setLongField(term352, term352.getClass(), "chksum", 3133860696238261492L);
        setLongField(term352, term352.getClass(), "filesize", 7247160664318067468L);
        setLongField(term352, term352.getClass(), "gid", 2135754395358000892L);
        setLongField(term352, term352.getClass(), "inode", -8085190702504231560L);
        setLongField(term352, term352.getClass(), "maj", 1672578078364590450L);
        setLongField(term352, term352.getClass(), "min", 4949335493504695457L);
        setLongField(term352, term352.getClass(), "mode", -5216789073301458893L);
        setLongField(term352, term352.getClass(), "mtime", -1832940336320585644L);
        setField(term352, term352.getClass(), "name", "MjGYSRKTNF");
        setLongField(term352, term352.getClass(), "nlink", -8033714905181142681L);
        setLongField(term352, term352.getClass(), "rmaj", -9040825890007374809L);
        setLongField(term352, term352.getClass(), "rmin", 1368340889161782793L);
        setLongField(term352, term352.getClass(), "uid", -5786861555969446503L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term352;
        try {
            callMethod(klass, "writeOldAsciiEntry", argTypes, term311, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


