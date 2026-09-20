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
import java.lang.Integer;

public class CpioArchiveOutputStream_write_185850665229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term576;
     Object term614;
     Object term620;
     Object term622;

    public CpioArchiveOutputStream_write_185850665229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term607 = new HashMap();
        term576 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term577 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term577, term577.getClass(), "chksum", -6673920710396545553L);
        setShortField(term577, term577.getClass(), "fileFormat", (short) -4880);
        setLongField(term577, term577.getClass(), "filesize", 3412644969878030772L);
        setLongField(term577, term577.getClass(), "gid", 6698455537431331246L);
        setLongField(term577, term577.getClass(), "headerSize", -8327432141027603933L);
        setLongField(term577, term577.getClass(), "inode", -433040798405298080L);
        setLongField(term577, term577.getClass(), "maj", -1505191021111100819L);
        setLongField(term577, term577.getClass(), "min", -1000830646340880796L);
        setLongField(term577, term577.getClass(), "mode", 5973526439563541711L);
        setLongField(term577, term577.getClass(), "mtime", 5246058710498845622L);
        setField(term577, term577.getClass(), "name", "LQFpaHEwXR");
        setLongField(term577, term577.getClass(), "nlink", 4394651392080968777L);
        setLongField(term577, term577.getClass(), "rmaj", -7310273014364148916L);
        setLongField(term577, term577.getClass(), "rmin", 8863790908271299748L);
        setLongField(term577, term577.getClass(), "uid", 9205327385733285058L);
        setField(term576, term576.getClass(), "cpioEntry", term577);
        setBooleanField(term576, term576.getClass(), "closed", true);
        setBooleanField(term576, term576.getClass(), "finished", false);
        setShortField(term576, term576.getClass(), "entryFormat", (short) -3696);
        setField(term576, term576.getClass(), "names", term607);
        setLongField(term576, term576.getClass(), "crc", 4199886998224701110L);
        setLongField(term576, term576.getClass(), "written", 8540994973773607992L);
        setField(term576, term576.getClass(), "out", null);
        term614 = (byte[]) newByteArray(5);
        setByteElement(term614, 0, (byte) 47);
        setByteElement(term614, 1, (byte) 48);
        setByteElement(term614, 2, (byte) 89);
        setByteElement(term614, 3, (byte) 75);
        setByteElement(term614, 4, (byte) 18);
        term620 = new Integer(568599855);
        term622 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term614;
        args[1] = term620;
        args[2] = term622;
        try {
            callMethod(klass, "write", argTypes, term576, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};
