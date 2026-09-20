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
import java.lang.UnsupportedOperationException;
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class CpioArchiveOutputStream_writeOldAsciiEntry_123040609126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356;
     Object term394;

    public CpioArchiveOutputStream_writeOldAsciiEntry_123040609126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term387 = new HashMap();
        term356 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term357 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term357, term357.getClass(), "chksum", -6342139649364011743L);
        setShortField(term357, term357.getClass(), "fileFormat", (short) -16335);
        setLongField(term357, term357.getClass(), "filesize", -4924950707540628022L);
        setLongField(term357, term357.getClass(), "gid", -4393710401270724527L);
        setLongField(term357, term357.getClass(), "headerSize", -4822736661741380518L);
        setLongField(term357, term357.getClass(), "inode", -5386201758403679145L);
        setLongField(term357, term357.getClass(), "maj", -7268507582722666254L);
        setLongField(term357, term357.getClass(), "min", 5671808784468963649L);
        setLongField(term357, term357.getClass(), "mode", 2297097306706899827L);
        setLongField(term357, term357.getClass(), "mtime", -900457279156388404L);
        setField(term357, term357.getClass(), "name", "hRNSzYYIrc");
        setLongField(term357, term357.getClass(), "nlink", 1084801489398441516L);
        setLongField(term357, term357.getClass(), "rmaj", 6273754186658578034L);
        setLongField(term357, term357.getClass(), "rmin", 3620247240684476031L);
        setLongField(term357, term357.getClass(), "uid", 8313800941204938919L);
        setField(term356, term356.getClass(), "cpioEntry", term357);
        setBooleanField(term356, term356.getClass(), "closed", false);
        setBooleanField(term356, term356.getClass(), "finished", true);
        setShortField(term356, term356.getClass(), "entryFormat", (short) -5174);
        setField(term356, term356.getClass(), "names", term387);
        setLongField(term356, term356.getClass(), "crc", -1214968196781083707L);
        setLongField(term356, term356.getClass(), "written", -1804015692891701666L);
        setField(term356, term356.getClass(), "out", null);
        term394 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term394, term394.getClass(), "chksum", -6432617521836576658L);
        setShortField(term394, term394.getClass(), "fileFormat", (short) -1725);
        setLongField(term394, term394.getClass(), "filesize", -2255965562447970862L);
        setLongField(term394, term394.getClass(), "gid", 148047808219672941L);
        setLongField(term394, term394.getClass(), "headerSize", 7489064039921396098L);
        setLongField(term394, term394.getClass(), "inode", 6843866297465638866L);
        setLongField(term394, term394.getClass(), "maj", -4023935540989049732L);
        setLongField(term394, term394.getClass(), "min", 855932984568615096L);
        setLongField(term394, term394.getClass(), "mode", -1616722610139554082L);
        setLongField(term394, term394.getClass(), "mtime", 7495904023107549024L);
        setField(term394, term394.getClass(), "name", "RMFIsYGgne");
        setLongField(term394, term394.getClass(), "nlink", 8802866251294305945L);
        setLongField(term394, term394.getClass(), "rmaj", 4513004407927379358L);
        setLongField(term394, term394.getClass(), "rmin", -7115418542247301000L);
        setLongField(term394, term394.getClass(), "uid", 8034714140377562739L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term394;
        try {
            callMethod(klass, "writeOldAsciiEntry", argTypes, term356, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};
