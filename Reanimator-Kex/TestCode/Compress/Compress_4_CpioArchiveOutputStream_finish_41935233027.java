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

public class CpioArchiveOutputStream_finish_41935233027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term638;

    public CpioArchiveOutputStream_finish_41935233027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term670 = new HashMap();
        term638 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term639 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term677 = (byte[]) newByteArray(1);
        setShortField(term639, term639.getClass(), "fileFormat", (short) -355);
        setIntField(term639, term639.getClass(), "headerSize", 590364439);
        setIntField(term639, term639.getClass(), "alignmentBoundary", 865208305);
        setLongField(term639, term639.getClass(), "chksum", 1195529027276497124L);
        setLongField(term639, term639.getClass(), "filesize", -2783999800714825789L);
        setLongField(term639, term639.getClass(), "gid", 4266570509071948633L);
        setLongField(term639, term639.getClass(), "inode", -7291742736502427077L);
        setLongField(term639, term639.getClass(), "maj", -8121849829073967555L);
        setLongField(term639, term639.getClass(), "min", 5219030281405653303L);
        setLongField(term639, term639.getClass(), "mode", -8471550651709805183L);
        setLongField(term639, term639.getClass(), "mtime", -948292411727204525L);
        setField(term639, term639.getClass(), "name", "MxlszYVzRf");
        setLongField(term639, term639.getClass(), "nlink", -8892586408602479513L);
        setLongField(term639, term639.getClass(), "rmaj", 4616440478358528406L);
        setLongField(term639, term639.getClass(), "rmin", 3427570961451840069L);
        setLongField(term639, term639.getClass(), "uid", 4502292577098212311L);
        setField(term638, term638.getClass(), "entry", term639);
        setBooleanField(term638, term638.getClass(), "closed", true);
        setBooleanField(term638, term638.getClass(), "finished", false);
        setShortField(term638, term638.getClass(), "entryFormat", (short) 5118);
        setField(term638, term638.getClass(), "names", term670);
        setLongField(term638, term638.getClass(), "crc", -3730936709704460408L);
        setLongField(term638, term638.getClass(), "written", -8614778293741404325L);
        setField(term638, term638.getClass(), "out", null);
        setByteElement(term677, 0, (byte) 42);
        setField(term638, term638.getClass(), "oneByte", term677);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "finish", argTypes, term638, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


