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
import java.io.IOException;
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class CpioArchiveOutputStream_putNextEntry_184662951823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101;
     Object term139;

    public CpioArchiveOutputStream_putNextEntry_184662951823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term132 = new HashMap();
        term101 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term102 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term102, term102.getClass(), "chksum", 6855071767938501807L);
        setShortField(term102, term102.getClass(), "fileFormat", (short) 30947);
        setLongField(term102, term102.getClass(), "filesize", -5892135042702373494L);
        setLongField(term102, term102.getClass(), "gid", 5262507301787091109L);
        setLongField(term102, term102.getClass(), "headerSize", -6823727938421990489L);
        setLongField(term102, term102.getClass(), "inode", -484994522244390100L);
        setLongField(term102, term102.getClass(), "maj", 1233889271256172047L);
        setLongField(term102, term102.getClass(), "min", 6617340557564669657L);
        setLongField(term102, term102.getClass(), "mode", 1439298019805881866L);
        setLongField(term102, term102.getClass(), "mtime", -8708192233349544946L);
        setField(term102, term102.getClass(), "name", "MuLcgQHgqz");
        setLongField(term102, term102.getClass(), "nlink", 5907001541142728739L);
        setLongField(term102, term102.getClass(), "rmaj", 4178434741742309755L);
        setLongField(term102, term102.getClass(), "rmin", -2068172595987555756L);
        setLongField(term102, term102.getClass(), "uid", -6292278961887936280L);
        setField(term101, term101.getClass(), "cpioEntry", term102);
        setBooleanField(term101, term101.getClass(), "closed", true);
        setBooleanField(term101, term101.getClass(), "finished", true);
        setShortField(term101, term101.getClass(), "entryFormat", (short) 27594);
        setField(term101, term101.getClass(), "names", term132);
        setLongField(term101, term101.getClass(), "crc", -6645965768855543712L);
        setLongField(term101, term101.getClass(), "written", 4784595517102746672L);
        setField(term101, term101.getClass(), "out", null);
        term139 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term139, term139.getClass(), "chksum", -7612550318181586304L);
        setShortField(term139, term139.getClass(), "fileFormat", (short) 7670);
        setLongField(term139, term139.getClass(), "filesize", -2170847986967241072L);
        setLongField(term139, term139.getClass(), "gid", 4044358158040652353L);
        setLongField(term139, term139.getClass(), "headerSize", -4443169559037975007L);
        setLongField(term139, term139.getClass(), "inode", -3842548265506930260L);
        setLongField(term139, term139.getClass(), "maj", -5788180182343976541L);
        setLongField(term139, term139.getClass(), "min", 2936323121573284007L);
        setLongField(term139, term139.getClass(), "mode", -1154553077993834885L);
        setLongField(term139, term139.getClass(), "mtime", -2850532706972744550L);
        setField(term139, term139.getClass(), "name", "xxtlPwDYFs");
        setLongField(term139, term139.getClass(), "nlink", -2644215923136513282L);
        setLongField(term139, term139.getClass(), "rmaj", -1468719814009985452L);
        setLongField(term139, term139.getClass(), "rmin", -7738503207562305297L);
        setLongField(term139, term139.getClass(), "uid", 3825396310311739952L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term139;
        try {
            callMethod(klass, "putNextEntry", argTypes, term101, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};
