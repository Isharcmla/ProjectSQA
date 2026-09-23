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

public class CpioArchiveOutputStream_closeArchiveEntry_68001739725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term503;

    public CpioArchiveOutputStream_closeArchiveEntry_68001739725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term535 = new HashMap();
        term503 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term504 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term542 = (byte[]) newByteArray(2);
        setShortField(term504, term504.getClass(), "fileFormat", (short) -1725);
        setIntField(term504, term504.getClass(), "headerSize", -655067527);
        setIntField(term504, term504.getClass(), "alignmentBoundary", -6029667);
        setLongField(term504, term504.getClass(), "chksum", 7489064039921396098L);
        setLongField(term504, term504.getClass(), "filesize", 6843866297465638866L);
        setLongField(term504, term504.getClass(), "gid", -4023935540989049732L);
        setLongField(term504, term504.getClass(), "inode", 855932984568615096L);
        setLongField(term504, term504.getClass(), "maj", -1616722610139554082L);
        setLongField(term504, term504.getClass(), "min", 7495904023107549024L);
        setLongField(term504, term504.getClass(), "mode", 8802866251294305945L);
        setLongField(term504, term504.getClass(), "mtime", 4513004407927379358L);
        setField(term504, term504.getClass(), "name", "NRdvgJlhkX");
        setLongField(term504, term504.getClass(), "nlink", -7115418542247301000L);
        setLongField(term504, term504.getClass(), "rmaj", 8034714140377562739L);
        setLongField(term504, term504.getClass(), "rmin", -2924531382671518368L);
        setLongField(term504, term504.getClass(), "uid", -3948863953565024517L);
        setField(term503, term503.getClass(), "entry", term504);
        setBooleanField(term503, term503.getClass(), "closed", true);
        setBooleanField(term503, term503.getClass(), "finished", false);
        setShortField(term503, term503.getClass(), "entryFormat", (short) 2638);
        setField(term503, term503.getClass(), "names", term535);
        setLongField(term503, term503.getClass(), "crc", -6587807377747738663L);
        setLongField(term503, term503.getClass(), "written", -6301101997917060727L);
        setField(term503, term503.getClass(), "out", null);
        setByteElement(term542, 0, (byte) -16);
        setByteElement(term542, 1, (byte) -112);
        setField(term503, term503.getClass(), "oneByte", term542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "closeArchiveEntry", argTypes, term503, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


