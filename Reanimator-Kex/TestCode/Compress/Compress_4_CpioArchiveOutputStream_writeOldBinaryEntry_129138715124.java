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
import java.lang.Boolean;

public class CpioArchiveOutputStream_writeOldBinaryEntry_129138715124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401;
     Object term447;
     Object term475;

    public CpioArchiveOutputStream_writeOldBinaryEntry_129138715124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term433 = new HashMap();
        term401 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term402 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term440 = (byte[]) newByteArray(6);
        setShortField(term402, term402.getClass(), "fileFormat", (short) 7097);
        setIntField(term402, term402.getClass(), "headerSize", -1685132342);
        setIntField(term402, term402.getClass(), "alignmentBoundary", -1456670397);
        setLongField(term402, term402.getClass(), "chksum", 2354625302846375590L);
        setLongField(term402, term402.getClass(), "filesize", 7276637106827860087L);
        setLongField(term402, term402.getClass(), "gid", -3936701866695933852L);
        setLongField(term402, term402.getClass(), "inode", 1215116475929634177L);
        setLongField(term402, term402.getClass(), "maj", 1597484336218508869L);
        setLongField(term402, term402.getClass(), "min", -685023850445639859L);
        setLongField(term402, term402.getClass(), "mode", -6950146046121430355L);
        setLongField(term402, term402.getClass(), "mtime", 1667122142089513324L);
        setField(term402, term402.getClass(), "name", "hRNSzYYIrc");
        setLongField(term402, term402.getClass(), "nlink", -6342139649364011743L);
        setLongField(term402, term402.getClass(), "rmaj", -4924950707540628022L);
        setLongField(term402, term402.getClass(), "rmin", -4393710401270724527L);
        setLongField(term402, term402.getClass(), "uid", -4822736661741380518L);
        setField(term401, term401.getClass(), "entry", term402);
        setBooleanField(term401, term401.getClass(), "closed", false);
        setBooleanField(term401, term401.getClass(), "finished", true);
        setShortField(term401, term401.getClass(), "entryFormat", (short) -16335);
        setField(term401, term401.getClass(), "names", term433);
        setLongField(term401, term401.getClass(), "crc", -5386201758403679145L);
        setLongField(term401, term401.getClass(), "written", -7268507582722666254L);
        setField(term401, term401.getClass(), "out", null);
        setByteElement(term440, 0, (byte) 67);
        setByteElement(term440, 1, (byte) 78);
        setByteElement(term440, 2, (byte) 87);
        setByteElement(term440, 3, (byte) 121);
        setByteElement(term440, 4, (byte) -99);
        setByteElement(term440, 5, (byte) -2);
        setField(term401, term401.getClass(), "oneByte", term440);
        term447 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setShortField(term447, term447.getClass(), "fileFormat", (short) -5174);
        setIntField(term447, term447.getClass(), "headerSize", 1622346318);
        setIntField(term447, term447.getClass(), "alignmentBoundary", 1048535127);
        setLongField(term447, term447.getClass(), "chksum", 5671808784468963649L);
        setLongField(term447, term447.getClass(), "filesize", 2297097306706899827L);
        setLongField(term447, term447.getClass(), "gid", -900457279156388404L);
        setLongField(term447, term447.getClass(), "inode", 1084801489398441516L);
        setLongField(term447, term447.getClass(), "maj", 6273754186658578034L);
        setLongField(term447, term447.getClass(), "min", 3620247240684476031L);
        setLongField(term447, term447.getClass(), "mode", 8313800941204938919L);
        setLongField(term447, term447.getClass(), "mtime", -1214968196781083707L);
        setField(term447, term447.getClass(), "name", "RMFIsYGgne");
        setLongField(term447, term447.getClass(), "nlink", -1804015692891701666L);
        setLongField(term447, term447.getClass(), "rmaj", -6432617521836576658L);
        setLongField(term447, term447.getClass(), "rmin", -2255965562447970862L);
        setLongField(term447, term447.getClass(), "uid", 148047808219672941L);
        term475 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term447;
        args[1] = term475;
        try {
            callMethod(klass, "writeOldBinaryEntry", argTypes, term401, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


