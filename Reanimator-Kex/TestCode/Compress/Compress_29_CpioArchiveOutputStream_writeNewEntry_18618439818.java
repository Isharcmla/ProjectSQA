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
import java.lang.Object;
import java.util.HashMap;

public class CpioArchiveOutputStream_writeNewEntry_18618439818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336;
     Object term403;

    public CpioArchiveOutputStream_writeNewEntry_18618439818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term368 = new HashMap();
        term336 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term337 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term397 = (byte[]) newByteArray(4);
        setShortField(term337, term337.getClass(), "fileFormat", (short) -2742);
        setIntField(term337, term337.getClass(), "headerSize", 1048535127);
        setIntField(term337, term337.getClass(), "alignmentBoundary", -655067527);
        setLongField(term337, term337.getClass(), "chksum", 2135754395358000892L);
        setLongField(term337, term337.getClass(), "filesize", -8085190702504231560L);
        setLongField(term337, term337.getClass(), "gid", 1672578078364590450L);
        setLongField(term337, term337.getClass(), "inode", 4949335493504695457L);
        setLongField(term337, term337.getClass(), "maj", -5216789073301458893L);
        setLongField(term337, term337.getClass(), "min", -1832940336320585644L);
        setLongField(term337, term337.getClass(), "mode", -8033714905181142681L);
        setLongField(term337, term337.getClass(), "mtime", -9040825890007374809L);
        setField(term337, term337.getClass(), "name", "MxlszYVzRf");
        setLongField(term337, term337.getClass(), "nlink", 1368340889161782793L);
        setLongField(term337, term337.getClass(), "rmaj", -5786861555969446503L);
        setLongField(term337, term337.getClass(), "rmin", 2354625302846375590L);
        setLongField(term337, term337.getClass(), "uid", 7276637106827860087L);
        setField(term336, term336.getClass(), "entry", term337);
        setBooleanField(term336, term336.getClass(), "closed", true);
        setBooleanField(term336, term336.getClass(), "finished", true);
        setShortField(term336, term336.getClass(), "entryFormat", (short) 7097);
        setField(term336, term336.getClass(), "names", term368);
        setLongField(term336, term336.getClass(), "crc", 5671808784468963649L);
        setLongField(term336, term336.getClass(), "written", 2297097306706899827L);
        setField(term336, term336.getClass(), "out", null);
        setIntField(term336, term336.getClass(), "blockSize", -117576464);
        setLongField(term336, term336.getClass(), "nextArtificalDeviceAndInode", -900457279156388404L);
        setField(term336, term336.getClass(), "zipEncoding", null);
        setByteElement(term397, 0, (byte) 83);
        setByteElement(term397, 1, (byte) 74);
        setByteElement(term397, 2, (byte) -71);
        setByteElement(term397, 3, (byte) 49);
        setField(term336, term336.getClass(), "oneByte", term397);
        setLongField(term336, term336.getClass(), "bytesWritten", 1084801489398441516L);
        term403 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setShortField(term403, term403.getClass(), "fileFormat", (short) -5174);
        setIntField(term403, term403.getClass(), "headerSize", -1007160944);
        setIntField(term403, term403.getClass(), "alignmentBoundary", 1135664017);
        setLongField(term403, term403.getClass(), "chksum", 6273754186658578034L);
        setLongField(term403, term403.getClass(), "filesize", 3620247240684476031L);
        setLongField(term403, term403.getClass(), "gid", 8313800941204938919L);
        setLongField(term403, term403.getClass(), "inode", -1214968196781083707L);
        setLongField(term403, term403.getClass(), "maj", -1804015692891701666L);
        setLongField(term403, term403.getClass(), "min", -6432617521836576658L);
        setLongField(term403, term403.getClass(), "mode", -2255965562447970862L);
        setLongField(term403, term403.getClass(), "mtime", 148047808219672941L);
        setField(term403, term403.getClass(), "name", "aJlieCFVtF");
        setLongField(term403, term403.getClass(), "nlink", 7489064039921396098L);
        setLongField(term403, term403.getClass(), "rmaj", 6843866297465638866L);
        setLongField(term403, term403.getClass(), "rmin", -4023935540989049732L);
        setLongField(term403, term403.getClass(), "uid", 855932984568615096L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term403;
        callMethod(klass, "writeNewEntry", argTypes, term336, args);
    }

};


