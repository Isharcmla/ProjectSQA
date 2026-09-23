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
import java.lang.StringIndexOutOfBoundsException;
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Long;
import java.lang.Integer;

public class CpioArchiveOutputStream_writeAsciiLong_170422094731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term880;
     Object term922;
     Object term924;
     Object term926;

    public CpioArchiveOutputStream_writeAsciiLong_170422094731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term912 = new HashMap();
        term880 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term881 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term919 = (byte[]) newByteArray(2);
        setShortField(term881, term881.getClass(), "fileFormat", (short) 374);
        setIntField(term881, term881.getClass(), "headerSize", -1530420153);
        setIntField(term881, term881.getClass(), "alignmentBoundary", -469968304);
        setLongField(term881, term881.getClass(), "chksum", -1145146470850585022L);
        setLongField(term881, term881.getClass(), "filesize", 1993646237353405740L);
        setLongField(term881, term881.getClass(), "gid", -4043093655001688454L);
        setLongField(term881, term881.getClass(), "inode", -419800263764810394L);
        setLongField(term881, term881.getClass(), "maj", 5904678961906211249L);
        setLongField(term881, term881.getClass(), "min", -1820639665251914495L);
        setLongField(term881, term881.getClass(), "mode", 3238645206498300107L);
        setLongField(term881, term881.getClass(), "mtime", -1592696983130738594L);
        setField(term881, term881.getClass(), "name", "ZiaGIbnzTs");
        setLongField(term881, term881.getClass(), "nlink", 6902365338255307910L);
        setLongField(term881, term881.getClass(), "rmaj", -8019730974733786399L);
        setLongField(term881, term881.getClass(), "rmin", 394960377236392159L);
        setLongField(term881, term881.getClass(), "uid", -2955854401507097864L);
        setField(term880, term880.getClass(), "entry", term881);
        setBooleanField(term880, term880.getClass(), "closed", false);
        setBooleanField(term880, term880.getClass(), "finished", false);
        setShortField(term880, term880.getClass(), "entryFormat", (short) -406);
        setField(term880, term880.getClass(), "names", term912);
        setLongField(term880, term880.getClass(), "crc", 329213208496958131L);
        setLongField(term880, term880.getClass(), "written", 8107921244631636572L);
        setField(term880, term880.getClass(), "out", null);
        setByteElement(term919, 0, (byte) 98);
        setByteElement(term919, 1, (byte) 79);
        setField(term880, term880.getClass(), "oneByte", term919);
        term922 = new Long(-7904053112604879960L);
        term924 = new Integer(-1145578966);
        term926 = new Integer(679763016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = long.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term922;
        args[1] = term924;
        args[2] = term926;
        try {
            callMethod(klass, "writeAsciiLong", argTypes, term880, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


