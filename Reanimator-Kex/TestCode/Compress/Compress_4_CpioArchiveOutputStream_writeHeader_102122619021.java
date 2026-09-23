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

public class CpioArchiveOutputStream_writeHeader_102122619021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121;
     Object term164;
     Object term2333;
     Object term2339;

    public CpioArchiveOutputStream_writeHeader_102122619021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term153 = new HashMap();
        term121 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term122 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term160 = (byte[]) newByteArray(3);
        setShortField(term122, term122.getClass(), "fileFormat", (short) 31942);
        setIntField(term122, term122.getClass(), "headerSize", -1922583790);
        setIntField(term122, term122.getClass(), "alignmentBoundary", -616727354);
        setLongField(term122, term122.getClass(), "chksum", 1967728129628047933L);
        setLongField(term122, term122.getClass(), "filesize", 2120084523938730454L);
        setLongField(term122, term122.getClass(), "gid", 6855071767938501807L);
        setLongField(term122, term122.getClass(), "inode", -5892135042702373494L);
        setLongField(term122, term122.getClass(), "maj", 5262507301787091109L);
        setLongField(term122, term122.getClass(), "min", -6823727938421990489L);
        setLongField(term122, term122.getClass(), "mode", -484994522244390100L);
        setLongField(term122, term122.getClass(), "mtime", 1233889271256172047L);
        setField(term122, term122.getClass(), "name", "MuLcgQHgqz");
        setLongField(term122, term122.getClass(), "nlink", 6617340557564669657L);
        setLongField(term122, term122.getClass(), "rmaj", 1439298019805881866L);
        setLongField(term122, term122.getClass(), "rmin", -8708192233349544946L);
        setLongField(term122, term122.getClass(), "uid", 5907001541142728739L);
        setField(term121, term121.getClass(), "entry", term122);
        setBooleanField(term121, term121.getClass(), "closed", true);
        setBooleanField(term121, term121.getClass(), "finished", true);
        setShortField(term121, term121.getClass(), "entryFormat", (short) 30947);
        setField(term121, term121.getClass(), "names", term153);
        setLongField(term121, term121.getClass(), "crc", 4178434741742309755L);
        setLongField(term121, term121.getClass(), "written", -2068172595987555756L);
        setField(term121, term121.getClass(), "out", null);
        setByteElement(term160, 0, (byte) 79);
        setByteElement(term160, 1, (byte) -119);
        setByteElement(term160, 2, (byte) -66);
        setField(term121, term121.getClass(), "oneByte", term160);
        term164 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setShortField(term164, term164.getClass(), "fileFormat", (short) 27594);
        setIntField(term164, term164.getClass(), "headerSize", -1955890973);
        setIntField(term164, term164.getClass(), "alignmentBoundary", -2038273078);
        setLongField(term164, term164.getClass(), "chksum", -6292278961887936280L);
        setLongField(term164, term164.getClass(), "filesize", -6645965768855543712L);
        setLongField(term164, term164.getClass(), "gid", 4784595517102746672L);
        setLongField(term164, term164.getClass(), "inode", -7612550318181586304L);
        setLongField(term164, term164.getClass(), "maj", -2170847986967241072L);
        setLongField(term164, term164.getClass(), "min", 4044358158040652353L);
        setLongField(term164, term164.getClass(), "mode", -4443169559037975007L);
        setLongField(term164, term164.getClass(), "mtime", -3842548265506930260L);
        setField(term164, term164.getClass(), "name", "xxtlPwDYFs");
        setLongField(term164, term164.getClass(), "nlink", -5788180182343976541L);
        setLongField(term164, term164.getClass(), "rmaj", 2936323121573284007L);
        setLongField(term164, term164.getClass(), "rmin", -1154553077993834885L);
        setLongField(term164, term164.getClass(), "uid", -2850532706972744550L);
        HashMap term2337 = new HashMap();
        term2333 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term2334 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term2338 = (byte[]) newByteArray(3);
        setShortField(term2334, term2334.getClass(), "fileFormat", (short) 31942);
        setIntField(term2334, term2334.getClass(), "headerSize", -1922583790);
        setIntField(term2334, term2334.getClass(), "alignmentBoundary", -616727354);
        setLongField(term2334, term2334.getClass(), "chksum", 1967728129628047933L);
        setLongField(term2334, term2334.getClass(), "filesize", 2120084523938730454L);
        setLongField(term2334, term2334.getClass(), "gid", 6855071767938501807L);
        setLongField(term2334, term2334.getClass(), "inode", -5892135042702373494L);
        setLongField(term2334, term2334.getClass(), "maj", 5262507301787091109L);
        setLongField(term2334, term2334.getClass(), "min", -6823727938421990489L);
        setLongField(term2334, term2334.getClass(), "mode", -484994522244390100L);
        setLongField(term2334, term2334.getClass(), "mtime", 1233889271256172047L);
        setField(term2334, term2334.getClass(), "name", "MuLcgQHgqz");
        setLongField(term2334, term2334.getClass(), "nlink", 6617340557564669657L);
        setLongField(term2334, term2334.getClass(), "rmaj", 1439298019805881866L);
        setLongField(term2334, term2334.getClass(), "rmin", -8708192233349544946L);
        setLongField(term2334, term2334.getClass(), "uid", 5907001541142728739L);
        setField(term2333, term2333.getClass(), "entry", term2334);
        setBooleanField(term2333, term2333.getClass(), "closed", true);
        setBooleanField(term2333, term2333.getClass(), "finished", true);
        setShortField(term2333, term2333.getClass(), "entryFormat", (short) 30947);
        setField(term2333, term2333.getClass(), "names", term2337);
        setLongField(term2333, term2333.getClass(), "crc", 4178434741742309755L);
        setLongField(term2333, term2333.getClass(), "written", -2068172595987555756L);
        setField(term2333, term2333.getClass(), "out", null);
        setByteElement(term2338, 0, (byte) 79);
        setByteElement(term2338, 1, (byte) -119);
        setByteElement(term2338, 2, (byte) -66);
        setField(term2333, term2333.getClass(), "oneByte", term2338);
        term2339 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setShortField(term2339, term2339.getClass(), "fileFormat", (short) 27594);
        setIntField(term2339, term2339.getClass(), "headerSize", -1955890973);
        setIntField(term2339, term2339.getClass(), "alignmentBoundary", -2038273078);
        setLongField(term2339, term2339.getClass(), "chksum", -6292278961887936280L);
        setLongField(term2339, term2339.getClass(), "filesize", -6645965768855543712L);
        setLongField(term2339, term2339.getClass(), "gid", 4784595517102746672L);
        setLongField(term2339, term2339.getClass(), "inode", -7612550318181586304L);
        setLongField(term2339, term2339.getClass(), "maj", -2170847986967241072L);
        setLongField(term2339, term2339.getClass(), "min", 4044358158040652353L);
        setLongField(term2339, term2339.getClass(), "mode", -4443169559037975007L);
        setLongField(term2339, term2339.getClass(), "mtime", -3842548265506930260L);
        setField(term2339, term2339.getClass(), "name", "xxtlPwDYFs");
        setLongField(term2339, term2339.getClass(), "nlink", -5788180182343976541L);
        setLongField(term2339, term2339.getClass(), "rmaj", 2936323121573284007L);
        setLongField(term2339, term2339.getClass(), "rmin", -1154553077993834885L);
        setLongField(term2339, term2339.getClass(), "uid", -2850532706972744550L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term164;
        callMethod(klass, "writeHeader", argTypes, term121, args);
        assertTrue(recursiveEquals(term121, term2333));
        assertTrue(recursiveEquals(term164, term2339));
    }

};


