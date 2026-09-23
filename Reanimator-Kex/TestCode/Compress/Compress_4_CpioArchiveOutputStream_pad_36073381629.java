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
import java.lang.Integer;

public class CpioArchiveOutputStream_pad_36073381629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term752;
     Object term797;
     Object term4624;

    public CpioArchiveOutputStream_pad_36073381629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term784 = new HashMap();
        term752 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term753 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term791 = (byte[]) newByteArray(5);
        setShortField(term753, term753.getClass(), "fileFormat", (short) -9327);
        setIntField(term753, term753.getClass(), "headerSize", -203030934);
        setIntField(term753, term753.getClass(), "alignmentBoundary", -1179120542);
        setLongField(term753, term753.getClass(), "chksum", -8327432141027603933L);
        setLongField(term753, term753.getClass(), "filesize", -433040798405298080L);
        setLongField(term753, term753.getClass(), "gid", -1505191021111100819L);
        setLongField(term753, term753.getClass(), "inode", -1000830646340880796L);
        setLongField(term753, term753.getClass(), "maj", 5973526439563541711L);
        setLongField(term753, term753.getClass(), "min", 5246058710498845622L);
        setLongField(term753, term753.getClass(), "mode", 4394651392080968777L);
        setLongField(term753, term753.getClass(), "mtime", -7310273014364148916L);
        setField(term753, term753.getClass(), "name", "oVcInYnLWB");
        setLongField(term753, term753.getClass(), "nlink", 8863790908271299748L);
        setLongField(term753, term753.getClass(), "rmaj", 9205327385733285058L);
        setLongField(term753, term753.getClass(), "rmin", 4199886998224701110L);
        setLongField(term753, term753.getClass(), "uid", 8540994973773607992L);
        setField(term752, term752.getClass(), "entry", term753);
        setBooleanField(term752, term752.getClass(), "closed", true);
        setBooleanField(term752, term752.getClass(), "finished", true);
        setShortField(term752, term752.getClass(), "entryFormat", (short) 16151);
        setField(term752, term752.getClass(), "names", term784);
        setLongField(term752, term752.getClass(), "crc", -2338103433822116635L);
        setLongField(term752, term752.getClass(), "written", -1885698929232124806L);
        setField(term752, term752.getClass(), "out", null);
        setByteElement(term791, 0, (byte) -22);
        setByteElement(term791, 1, (byte) 93);
        setByteElement(term791, 2, (byte) 69);
        setByteElement(term791, 3, (byte) -74);
        setByteElement(term791, 4, (byte) -123);
        setField(term752, term752.getClass(), "oneByte", term791);
        term797 = new Integer(-73683645);
        HashMap term4628 = new HashMap();
        term4624 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term4625 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        byte[] term4629 = (byte[]) newByteArray(5);
        setShortField(term4625, term4625.getClass(), "fileFormat", (short) -9327);
        setIntField(term4625, term4625.getClass(), "headerSize", -203030934);
        setIntField(term4625, term4625.getClass(), "alignmentBoundary", -1179120542);
        setLongField(term4625, term4625.getClass(), "chksum", -8327432141027603933L);
        setLongField(term4625, term4625.getClass(), "filesize", -433040798405298080L);
        setLongField(term4625, term4625.getClass(), "gid", -1505191021111100819L);
        setLongField(term4625, term4625.getClass(), "inode", -1000830646340880796L);
        setLongField(term4625, term4625.getClass(), "maj", 5973526439563541711L);
        setLongField(term4625, term4625.getClass(), "min", 5246058710498845622L);
        setLongField(term4625, term4625.getClass(), "mode", 4394651392080968777L);
        setLongField(term4625, term4625.getClass(), "mtime", -7310273014364148916L);
        setField(term4625, term4625.getClass(), "name", "oVcInYnLWB");
        setLongField(term4625, term4625.getClass(), "nlink", 8863790908271299748L);
        setLongField(term4625, term4625.getClass(), "rmaj", 9205327385733285058L);
        setLongField(term4625, term4625.getClass(), "rmin", 4199886998224701110L);
        setLongField(term4625, term4625.getClass(), "uid", 8540994973773607992L);
        setField(term4624, term4624.getClass(), "entry", term4625);
        setBooleanField(term4624, term4624.getClass(), "closed", true);
        setBooleanField(term4624, term4624.getClass(), "finished", true);
        setShortField(term4624, term4624.getClass(), "entryFormat", (short) 16151);
        setField(term4624, term4624.getClass(), "names", term4628);
        setLongField(term4624, term4624.getClass(), "crc", -2338103433822116635L);
        setLongField(term4624, term4624.getClass(), "written", -1885698929232124806L);
        setField(term4624, term4624.getClass(), "out", null);
        setByteElement(term4629, 0, (byte) -22);
        setByteElement(term4629, 1, (byte) 93);
        setByteElement(term4629, 2, (byte) 69);
        setByteElement(term4629, 3, (byte) -74);
        setByteElement(term4629, 4, (byte) -123);
        setField(term4624, term4624.getClass(), "oneByte", term4629);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term797;
        callMethod(klass, "pad", argTypes, term752, args);
        assertTrue(recursiveEquals(term752, term4624));
        assertTrue(recursiveEquals(term797, -73683645));
    }

};


