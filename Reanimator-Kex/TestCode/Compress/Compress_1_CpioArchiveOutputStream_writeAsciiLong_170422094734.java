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

public class CpioArchiveOutputStream_writeAsciiLong_170422094734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term841;
     Object term879;
     Object term881;
     Object term883;

    public CpioArchiveOutputStream_writeAsciiLong_170422094734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term872 = new HashMap();
        term841 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term842 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term842, term842.getClass(), "chksum", 4255811647459029682L);
        setShortField(term842, term842.getClass(), "fileFormat", (short) -21950);
        setLongField(term842, term842.getClass(), "filesize", 8000844860910174690L);
        setLongField(term842, term842.getClass(), "gid", 2209808079059619773L);
        setLongField(term842, term842.getClass(), "headerSize", 8403492202041709902L);
        setLongField(term842, term842.getClass(), "inode", -113028659747841511L);
        setLongField(term842, term842.getClass(), "maj", 7271112616766426991L);
        setLongField(term842, term842.getClass(), "min", -8514728180792822493L);
        setLongField(term842, term842.getClass(), "mode", 5315236285592892506L);
        setLongField(term842, term842.getClass(), "mtime", -6969704322644192945L);
        setField(term842, term842.getClass(), "name", "HyxfbSQYBe");
        setLongField(term842, term842.getClass(), "nlink", -6685235643232255177L);
        setLongField(term842, term842.getClass(), "rmaj", -5656664340499957324L);
        setLongField(term842, term842.getClass(), "rmin", -5460517064177800852L);
        setLongField(term842, term842.getClass(), "uid", -5242567610844514867L);
        setField(term841, term841.getClass(), "cpioEntry", term842);
        setBooleanField(term841, term841.getClass(), "closed", true);
        setBooleanField(term841, term841.getClass(), "finished", true);
        setShortField(term841, term841.getClass(), "entryFormat", (short) 10887);
        setField(term841, term841.getClass(), "names", term872);
        setLongField(term841, term841.getClass(), "crc", -2951854704066477061L);
        setLongField(term841, term841.getClass(), "written", 174253963298276221L);
        setField(term841, term841.getClass(), "out", null);
        term879 = new Long(3713624957161771816L);
        term881 = new Integer(-1922583790);
        term883 = new Integer(-616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = long.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term879;
        args[1] = term881;
        args[2] = term883;
        try {
            callMethod(klass, "writeAsciiLong", argTypes, term841, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};
