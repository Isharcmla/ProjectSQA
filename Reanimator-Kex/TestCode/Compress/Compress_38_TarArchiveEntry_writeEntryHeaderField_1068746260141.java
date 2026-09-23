package org.apache.commons.compress.archivers.tar;

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
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;

public class TarArchiveEntry_writeEntryHeaderField_1068746260141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44265;
     Object term44280;
     Object term44282;
     Object term44284;
     Object term44286;

    public TarArchiveEntry_writeEntryHeaderField_1068746260141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44265 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term44265, term44265.getClass(), "name", null);
        setBooleanField(term44265, term44265.getClass(), "preserveLeadingSlashes", false);
        setIntField(term44265, term44265.getClass(), "mode", 0);
        setLongField(term44265, term44265.getClass(), "userId", 0L);
        setLongField(term44265, term44265.getClass(), "groupId", 0L);
        setLongField(term44265, term44265.getClass(), "size", 0L);
        setLongField(term44265, term44265.getClass(), "modTime", 0L);
        setBooleanField(term44265, term44265.getClass(), "checkSumOK", false);
        setByteField(term44265, term44265.getClass(), "linkFlag", (byte) 0);
        setField(term44265, term44265.getClass(), "linkName", null);
        setField(term44265, term44265.getClass(), "magic", null);
        setField(term44265, term44265.getClass(), "version", null);
        setField(term44265, term44265.getClass(), "userName", null);
        setField(term44265, term44265.getClass(), "groupName", null);
        setIntField(term44265, term44265.getClass(), "devMajor", 0);
        setIntField(term44265, term44265.getClass(), "devMinor", 0);
        setBooleanField(term44265, term44265.getClass(), "isExtended", false);
        setLongField(term44265, term44265.getClass(), "realSize", 0L);
        setBooleanField(term44265, term44265.getClass(), "paxGNUSparse", false);
        setBooleanField(term44265, term44265.getClass(), "starSparse", false);
        setField(term44265, term44265.getClass(), "file", null);
        term44280 = new Long(0L);
        term44282 = new Integer(0);
        term44284 = new Integer(0);
        term44286 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = long.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = term44280;
        args[1] = null;
        args[2] = term44282;
        args[3] = term44284;
        args[4] = term44286;
        callMethod(klass, "writeEntryHeaderField", argTypes, term44265, args);
    }

};


