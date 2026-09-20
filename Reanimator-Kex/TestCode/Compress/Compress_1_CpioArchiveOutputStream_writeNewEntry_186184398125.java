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

public class CpioArchiveOutputStream_writeNewEntry_186184398125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271;
     Object term309;

    public CpioArchiveOutputStream_writeNewEntry_186184398125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term302 = new HashMap();
        term271 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term272 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term272, term272.getClass(), "chksum", 4474998035090263139L);
        setShortField(term272, term272.getClass(), "fileFormat", (short) 21075);
        setLongField(term272, term272.getClass(), "filesize", 2848819812340321742L);
        setLongField(term272, term272.getClass(), "gid", -8876856890348836498L);
        setLongField(term272, term272.getClass(), "headerSize", 846579494941632714L);
        setLongField(term272, term272.getClass(), "inode", 6689117472719450333L);
        setLongField(term272, term272.getClass(), "maj", 5836128569274066678L);
        setLongField(term272, term272.getClass(), "min", -2177368829816872572L);
        setLongField(term272, term272.getClass(), "mode", -8463029266761149071L);
        setLongField(term272, term272.getClass(), "mtime", 3133860696238261492L);
        setField(term272, term272.getClass(), "name", "SzjVpOQTyS");
        setLongField(term272, term272.getClass(), "nlink", 7247160664318067468L);
        setLongField(term272, term272.getClass(), "rmaj", 2135754395358000892L);
        setLongField(term272, term272.getClass(), "rmin", -8085190702504231560L);
        setLongField(term272, term272.getClass(), "uid", 1672578078364590450L);
        setField(term271, term271.getClass(), "cpioEntry", term272);
        setBooleanField(term271, term271.getClass(), "closed", false);
        setBooleanField(term271, term271.getClass(), "finished", true);
        setShortField(term271, term271.getClass(), "entryFormat", (short) -2742);
        setField(term271, term271.getClass(), "names", term302);
        setLongField(term271, term271.getClass(), "crc", 4949335493504695457L);
        setLongField(term271, term271.getClass(), "written", -5216789073301458893L);
        setField(term271, term271.getClass(), "out", null);
        term309 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term309, term309.getClass(), "chksum", -1832940336320585644L);
        setShortField(term309, term309.getClass(), "fileFormat", (short) 7097);
        setLongField(term309, term309.getClass(), "filesize", -8033714905181142681L);
        setLongField(term309, term309.getClass(), "gid", -9040825890007374809L);
        setLongField(term309, term309.getClass(), "headerSize", 1368340889161782793L);
        setLongField(term309, term309.getClass(), "inode", -5786861555969446503L);
        setLongField(term309, term309.getClass(), "maj", 2354625302846375590L);
        setLongField(term309, term309.getClass(), "min", 7276637106827860087L);
        setLongField(term309, term309.getClass(), "mode", -3936701866695933852L);
        setLongField(term309, term309.getClass(), "mtime", 1215116475929634177L);
        setField(term309, term309.getClass(), "name", "MjGYSRKTNF");
        setLongField(term309, term309.getClass(), "nlink", 1597484336218508869L);
        setLongField(term309, term309.getClass(), "rmaj", -685023850445639859L);
        setLongField(term309, term309.getClass(), "rmin", -6950146046121430355L);
        setLongField(term309, term309.getClass(), "uid", 1667122142089513324L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term309;
        try {
            callMethod(klass, "writeNewEntry", argTypes, term271, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
