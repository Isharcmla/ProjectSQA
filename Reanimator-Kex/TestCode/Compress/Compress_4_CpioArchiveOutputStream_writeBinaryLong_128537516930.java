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
import java.lang.NegativeArraySizeException;
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;

public class CpioArchiveOutputStream_writeBinaryLong_128537516930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term814;
     Object term859;
     Object term861;
     Object term863;

    public CpioArchiveOutputStream_writeBinaryLong_128537516930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term846 = new HashMap();
        term814 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term815 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term853 = (byte[]) newByteArray(5);
        setShortField(term815, term815.getClass(), "fileFormat", (short) 2033);
        setIntField(term815, term815.getClass(), "headerSize", -226514366);
        setIntField(term815, term815.getClass(), "alignmentBoundary", 1193880199);
        setLongField(term815, term815.getClass(), "chksum", 5731563613239387113L);
        setLongField(term815, term815.getClass(), "filesize", 3381333711768010594L);
        setLongField(term815, term815.getClass(), "gid", 3580984732036213717L);
        setLongField(term815, term815.getClass(), "inode", 5330761990446327930L);
        setLongField(term815, term815.getClass(), "maj", -3954795081650780841L);
        setLongField(term815, term815.getClass(), "min", 3288791194263207397L);
        setLongField(term815, term815.getClass(), "mode", 3288941170644426558L);
        setLongField(term815, term815.getClass(), "mtime", -8338004844694486146L);
        setField(term815, term815.getClass(), "name", "aJlieCFVtF");
        setLongField(term815, term815.getClass(), "nlink", 6426732259596412988L);
        setLongField(term815, term815.getClass(), "rmaj", 185793058502220865L);
        setLongField(term815, term815.getClass(), "rmin", -7698746988132548371L);
        setLongField(term815, term815.getClass(), "uid", 2145420811068634601L);
        setField(term814, term814.getClass(), "entry", term815);
        setBooleanField(term814, term814.getClass(), "closed", true);
        setBooleanField(term814, term814.getClass(), "finished", true);
        setShortField(term814, term814.getClass(), "entryFormat", (short) 26404);
        setField(term814, term814.getClass(), "names", term846);
        setLongField(term814, term814.getClass(), "crc", 2191130532479601175L);
        setLongField(term814, term814.getClass(), "written", 860079646007397083L);
        setField(term814, term814.getClass(), "out", null);
        setByteElement(term853, 0, (byte) -23);
        setByteElement(term853, 1, (byte) 100);
        setByteElement(term853, 2, (byte) 106);
        setByteElement(term853, 3, (byte) -57);
        setByteElement(term853, 4, (byte) -103);
        setField(term814, term814.getClass(), "oneByte", term853);
        term859 = new Long(3230472384687362867L);
        term861 = new Integer(-1087774327);
        term863 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = long.class;
        argTypes[1] = int.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term859;
        args[1] = term861;
        args[2] = term863;
        try {
            callMethod(klass, "writeBinaryLong", argTypes, term814, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


