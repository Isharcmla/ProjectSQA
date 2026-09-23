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
import static org.apache.commons.compress.archivers.tar.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class TarArchiveEntry_setMode_203641294990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2064;
     Object term2128;
     Object term22384;

    public TarArchiveEntry_setMode_203641294990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22425 = Class.forName((String) "java.io.File$PathStatus");
        Field term22424 = ((Class) term22425).getDeclaredField((String) "INVALID");
        ((Field) term22424).setAccessible(true);
        Object enum87 = ((Field) term22424).get((Object) null);
        term2064 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term2103 = newInstance(Class.forName("java.io.File"));
        setField(term2064, term2064.getClass(), "name", "");
        setBooleanField(term2064, term2064.getClass(), "preserveLeadingSlashes", true);
        setIntField(term2064, term2064.getClass(), "mode", 1193880199);
        setLongField(term2064, term2064.getClass(), "userId", 4178434741742309755L);
        setLongField(term2064, term2064.getClass(), "groupId", -2068172595987555756L);
        setLongField(term2064, term2064.getClass(), "size", -6292278961887936280L);
        setLongField(term2064, term2064.getClass(), "modTime", -6645965768855543712L);
        setBooleanField(term2064, term2064.getClass(), "checkSumOK", true);
        setByteField(term2064, term2064.getClass(), "linkFlag", (byte) 87);
        setField(term2064, term2064.getClass(), "linkName", "");
        setField(term2064, term2064.getClass(), "magic", "ustar ");
        setField(term2064, term2064.getClass(), "version", "00");
        setField(term2064, term2064.getClass(), "userName", "root");
        setField(term2064, term2064.getClass(), "groupName", "");
        setIntField(term2064, term2064.getClass(), "devMajor", -1087774327);
        setIntField(term2064, term2064.getClass(), "devMinor", -1530420153);
        setBooleanField(term2064, term2064.getClass(), "isExtended", false);
        setLongField(term2064, term2064.getClass(), "realSize", 4784595517102746672L);
        setBooleanField(term2064, term2064.getClass(), "paxGNUSparse", true);
        setBooleanField(term2064, term2064.getClass(), "starSparse", true);
        setField(term2103, term2103.getClass(), "path", "ZiaGIbnzTs");
        setField(term2103, term2103.getClass(), "status", enum87);
        setIntField(term2103, term2103.getClass(), "prefixLength", -469968304);
        setField(term2103, term2103.getClass(), "filePath", null);
        setField(term2064, term2064.getClass(), "file", term2103);
        term2128 = new Integer(-1145578966);
        Class<? extends Object> term22592 = Class.forName((String) "java.io.File$PathStatus");
        Field term22591 = ((Class) term22592).getDeclaredField((String) "INVALID");
        ((Field) term22591).setAccessible(true);
        Object enum88 = ((Field) term22591).get((Object) null);
        term22384 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term22397 = newInstance(Class.forName("java.io.File"));
        setField(term22384, term22384.getClass(), "name", "");
        setBooleanField(term22384, term22384.getClass(), "preserveLeadingSlashes", true);
        setIntField(term22384, term22384.getClass(), "mode", -1145578966);
        setLongField(term22384, term22384.getClass(), "userId", 4178434741742309755L);
        setLongField(term22384, term22384.getClass(), "groupId", -2068172595987555756L);
        setLongField(term22384, term22384.getClass(), "size", -6292278961887936280L);
        setLongField(term22384, term22384.getClass(), "modTime", -6645965768855543712L);
        setBooleanField(term22384, term22384.getClass(), "checkSumOK", true);
        setByteField(term22384, term22384.getClass(), "linkFlag", (byte) 87);
        setField(term22384, term22384.getClass(), "linkName", "");
        setField(term22384, term22384.getClass(), "magic", "ustar ");
        setField(term22384, term22384.getClass(), "version", "00");
        setField(term22384, term22384.getClass(), "userName", "root");
        setField(term22384, term22384.getClass(), "groupName", "");
        setIntField(term22384, term22384.getClass(), "devMajor", -1087774327);
        setIntField(term22384, term22384.getClass(), "devMinor", -1530420153);
        setBooleanField(term22384, term22384.getClass(), "isExtended", false);
        setLongField(term22384, term22384.getClass(), "realSize", 4784595517102746672L);
        setBooleanField(term22384, term22384.getClass(), "paxGNUSparse", true);
        setBooleanField(term22384, term22384.getClass(), "starSparse", true);
        setField(term22397, term22397.getClass(), "path", "ZiaGIbnzTs");
        setField(term22397, term22397.getClass(), "status", enum88);
        setIntField(term22397, term22397.getClass(), "prefixLength", -469968304);
        setField(term22397, term22397.getClass(), "filePath", null);
        setField(term22384, term22384.getClass(), "file", term22397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2128;
        callMethod(klass, "setMode", argTypes, term2064, args);
        assertTrue(recursiveEquals(term2064, term22384));
        assertTrue(recursiveEquals(term2128, -1145578966));
    }

};


