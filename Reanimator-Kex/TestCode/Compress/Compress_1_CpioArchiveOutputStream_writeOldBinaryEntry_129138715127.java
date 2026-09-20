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

public class CpioArchiveOutputStream_writeOldBinaryEntry_129138715127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term441;
     Object term479;
     Object term506;

    public CpioArchiveOutputStream_writeOldBinaryEntry_129138715127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term472 = new HashMap();
        term441 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term442 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term442, term442.getClass(), "chksum", -2924531382671518368L);
        setShortField(term442, term442.getClass(), "fileFormat", (short) 2638);
        setLongField(term442, term442.getClass(), "filesize", -3948863953565024517L);
        setLongField(term442, term442.getClass(), "gid", -6587807377747738663L);
        setLongField(term442, term442.getClass(), "headerSize", -6301101997917060727L);
        setLongField(term442, term442.getClass(), "inode", 8166095254618543564L);
        setLongField(term442, term442.getClass(), "maj", -4598158870068953328L);
        setLongField(term442, term442.getClass(), "min", 138235087558060686L);
        setLongField(term442, term442.getClass(), "mode", 5381386339318883012L);
        setLongField(term442, term442.getClass(), "mtime", -1333707622307134180L);
        setField(term442, term442.getClass(), "name", "NRdvgJlhkX");
        setLongField(term442, term442.getClass(), "nlink", -4360569253593381888L);
        setLongField(term442, term442.getClass(), "rmaj", 1457594663983990440L);
        setLongField(term442, term442.getClass(), "rmin", 3452833434644634217L);
        setLongField(term442, term442.getClass(), "uid", -8603648071751666348L);
        setField(term441, term441.getClass(), "cpioEntry", term442);
        setBooleanField(term441, term441.getClass(), "closed", false);
        setBooleanField(term441, term441.getClass(), "finished", true);
        setShortField(term441, term441.getClass(), "entryFormat", (short) 24663);
        setField(term441, term441.getClass(), "names", term472);
        setLongField(term441, term441.getClass(), "crc", -7884871963229073324L);
        setLongField(term441, term441.getClass(), "written", -8649738738252714180L);
        setField(term441, term441.getClass(), "out", null);
        term479 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term479, term479.getClass(), "chksum", -7278883608542636188L);
        setShortField(term479, term479.getClass(), "fileFormat", (short) 30329);
        setLongField(term479, term479.getClass(), "filesize", -1539859611880912454L);
        setLongField(term479, term479.getClass(), "gid", 4100236067313034103L);
        setLongField(term479, term479.getClass(), "headerSize", 1195529027276497124L);
        setLongField(term479, term479.getClass(), "inode", -2783999800714825789L);
        setLongField(term479, term479.getClass(), "maj", 4266570509071948633L);
        setLongField(term479, term479.getClass(), "min", -7291742736502427077L);
        setLongField(term479, term479.getClass(), "mode", -8121849829073967555L);
        setLongField(term479, term479.getClass(), "mtime", 5219030281405653303L);
        setField(term479, term479.getClass(), "name", "uuaPigETmJ");
        setLongField(term479, term479.getClass(), "nlink", -8471550651709805183L);
        setLongField(term479, term479.getClass(), "rmaj", -948292411727204525L);
        setLongField(term479, term479.getClass(), "rmin", -8892586408602479513L);
        setLongField(term479, term479.getClass(), "uid", 4616440478358528406L);
        term506 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term479;
        args[1] = term506;
        try {
            callMethod(klass, "writeOldBinaryEntry", argTypes, term441, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
