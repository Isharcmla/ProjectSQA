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

public class CpioArchiveOutputStream_finish_41935233030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term639;
     Object term3888;

    public CpioArchiveOutputStream_finish_41935233030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term670 = new HashMap();
        term639 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term640 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term640, term640.getClass(), "chksum", -2338103433822116635L);
        setShortField(term640, term640.getClass(), "fileFormat", (short) -9327);
        setLongField(term640, term640.getClass(), "filesize", -1885698929232124806L);
        setLongField(term640, term640.getClass(), "gid", 5731563613239387113L);
        setLongField(term640, term640.getClass(), "headerSize", 3381333711768010594L);
        setLongField(term640, term640.getClass(), "inode", 3580984732036213717L);
        setLongField(term640, term640.getClass(), "maj", 5330761990446327930L);
        setLongField(term640, term640.getClass(), "min", -3954795081650780841L);
        setLongField(term640, term640.getClass(), "mode", 3288791194263207397L);
        setLongField(term640, term640.getClass(), "mtime", 3288941170644426558L);
        setField(term640, term640.getClass(), "name", "oVcInYnLWB");
        setLongField(term640, term640.getClass(), "nlink", -8338004844694486146L);
        setLongField(term640, term640.getClass(), "rmaj", 6426732259596412988L);
        setLongField(term640, term640.getClass(), "rmin", 185793058502220865L);
        setLongField(term640, term640.getClass(), "uid", -7698746988132548371L);
        setField(term639, term639.getClass(), "cpioEntry", term640);
        setBooleanField(term639, term639.getClass(), "closed", false);
        setBooleanField(term639, term639.getClass(), "finished", true);
        setShortField(term639, term639.getClass(), "entryFormat", (short) 16151);
        setField(term639, term639.getClass(), "names", term670);
        setLongField(term639, term639.getClass(), "crc", 2145420811068634601L);
        setLongField(term639, term639.getClass(), "written", 2191130532479601175L);
        setField(term639, term639.getClass(), "out", null);
        HashMap term3892 = new HashMap();
        term3888 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term3889 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term3889, term3889.getClass(), "chksum", -2338103433822116635L);
        setShortField(term3889, term3889.getClass(), "fileFormat", (short) -9327);
        setLongField(term3889, term3889.getClass(), "filesize", -1885698929232124806L);
        setLongField(term3889, term3889.getClass(), "gid", 5731563613239387113L);
        setLongField(term3889, term3889.getClass(), "headerSize", 3381333711768010594L);
        setLongField(term3889, term3889.getClass(), "inode", 3580984732036213717L);
        setLongField(term3889, term3889.getClass(), "maj", 5330761990446327930L);
        setLongField(term3889, term3889.getClass(), "min", -3954795081650780841L);
        setLongField(term3889, term3889.getClass(), "mode", 3288791194263207397L);
        setLongField(term3889, term3889.getClass(), "mtime", 3288941170644426558L);
        setField(term3889, term3889.getClass(), "name", "oVcInYnLWB");
        setLongField(term3889, term3889.getClass(), "nlink", -8338004844694486146L);
        setLongField(term3889, term3889.getClass(), "rmaj", 6426732259596412988L);
        setLongField(term3889, term3889.getClass(), "rmin", 185793058502220865L);
        setLongField(term3889, term3889.getClass(), "uid", -7698746988132548371L);
        setField(term3888, term3888.getClass(), "cpioEntry", term3889);
        setBooleanField(term3888, term3888.getClass(), "closed", false);
        setBooleanField(term3888, term3888.getClass(), "finished", true);
        setShortField(term3888, term3888.getClass(), "entryFormat", (short) 16151);
        setField(term3888, term3888.getClass(), "names", term3892);
        setLongField(term3888, term3888.getClass(), "crc", 2145420811068634601L);
        setLongField(term3888, term3888.getClass(), "written", 2191130532479601175L);
        setField(term3888, term3888.getClass(), "out", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "finish", argTypes, term639, args);
        assertTrue(recursiveEquals(term639, term3888));
    }

};
