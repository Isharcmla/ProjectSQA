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

public class CpioArchiveOutputStream_close_112084508331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term687;
     Object term3952;

    public CpioArchiveOutputStream_close_112084508331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term718 = new HashMap();
        term687 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term688 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term688, term688.getClass(), "chksum", 860079646007397083L);
        setShortField(term688, term688.getClass(), "fileFormat", (short) 2033);
        setLongField(term688, term688.getClass(), "filesize", 3230472384687362867L);
        setLongField(term688, term688.getClass(), "gid", -1145146470850585022L);
        setLongField(term688, term688.getClass(), "headerSize", 1993646237353405740L);
        setLongField(term688, term688.getClass(), "inode", -4043093655001688454L);
        setLongField(term688, term688.getClass(), "maj", -419800263764810394L);
        setLongField(term688, term688.getClass(), "min", 5904678961906211249L);
        setLongField(term688, term688.getClass(), "mode", -1820639665251914495L);
        setLongField(term688, term688.getClass(), "mtime", 3238645206498300107L);
        setField(term688, term688.getClass(), "name", "aJlieCFVtF");
        setLongField(term688, term688.getClass(), "nlink", -1592696983130738594L);
        setLongField(term688, term688.getClass(), "rmaj", 6902365338255307910L);
        setLongField(term688, term688.getClass(), "rmin", -8019730974733786399L);
        setLongField(term688, term688.getClass(), "uid", 394960377236392159L);
        setField(term687, term687.getClass(), "cpioEntry", term688);
        setBooleanField(term687, term687.getClass(), "closed", true);
        setBooleanField(term687, term687.getClass(), "finished", true);
        setShortField(term687, term687.getClass(), "entryFormat", (short) 26404);
        setField(term687, term687.getClass(), "names", term718);
        setLongField(term687, term687.getClass(), "crc", -2955854401507097864L);
        setLongField(term687, term687.getClass(), "written", 329213208496958131L);
        setField(term687, term687.getClass(), "out", null);
        HashMap term3956 = new HashMap();
        term3952 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term3953 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term3953, term3953.getClass(), "chksum", 860079646007397083L);
        setShortField(term3953, term3953.getClass(), "fileFormat", (short) 2033);
        setLongField(term3953, term3953.getClass(), "filesize", 3230472384687362867L);
        setLongField(term3953, term3953.getClass(), "gid", -1145146470850585022L);
        setLongField(term3953, term3953.getClass(), "headerSize", 1993646237353405740L);
        setLongField(term3953, term3953.getClass(), "inode", -4043093655001688454L);
        setLongField(term3953, term3953.getClass(), "maj", -419800263764810394L);
        setLongField(term3953, term3953.getClass(), "min", 5904678961906211249L);
        setLongField(term3953, term3953.getClass(), "mode", -1820639665251914495L);
        setLongField(term3953, term3953.getClass(), "mtime", 3238645206498300107L);
        setField(term3953, term3953.getClass(), "name", "aJlieCFVtF");
        setLongField(term3953, term3953.getClass(), "nlink", -1592696983130738594L);
        setLongField(term3953, term3953.getClass(), "rmaj", 6902365338255307910L);
        setLongField(term3953, term3953.getClass(), "rmin", -8019730974733786399L);
        setLongField(term3953, term3953.getClass(), "uid", 394960377236392159L);
        setField(term3952, term3952.getClass(), "cpioEntry", term3953);
        setBooleanField(term3952, term3952.getClass(), "closed", true);
        setBooleanField(term3952, term3952.getClass(), "finished", true);
        setShortField(term3952, term3952.getClass(), "entryFormat", (short) 26404);
        setField(term3952, term3952.getClass(), "names", term3956);
        setLongField(term3952, term3952.getClass(), "crc", -2955854401507097864L);
        setLongField(term3952, term3952.getClass(), "written", 329213208496958131L);
        setField(term3952, term3952.getClass(), "out", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term687, args);
        assertTrue(recursiveEquals(term687, term3952));
    }

};
