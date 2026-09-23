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

public class TarArchiveEntry_setLinkName_144243861692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2524;
     Object term23232;

    public TarArchiveEntry_setLinkName_144243861692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23275 = Class.forName((String) "java.io.File$PathStatus");
        Field term23274 = ((Class) term23275).getDeclaredField((String) "INVALID");
        ((Field) term23274).setAccessible(true);
        Object enum91 = ((Field) term23274).get((Object) null);
        term2524 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term2563 = newInstance(Class.forName("java.io.File"));
        setField(term2524, term2524.getClass(), "name", "");
        setBooleanField(term2524, term2524.getClass(), "preserveLeadingSlashes", true);
        setIntField(term2524, term2524.getClass(), "mode", -157887805);
        setLongField(term2524, term2524.getClass(), "userId", -5788180182343976541L);
        setLongField(term2524, term2524.getClass(), "groupId", 2936323121573284007L);
        setLongField(term2524, term2524.getClass(), "size", -1154553077993834885L);
        setLongField(term2524, term2524.getClass(), "modTime", -2850532706972744550L);
        setBooleanField(term2524, term2524.getClass(), "checkSumOK", false);
        setByteField(term2524, term2524.getClass(), "linkFlag", (byte) -99);
        setField(term2524, term2524.getClass(), "linkName", "");
        setField(term2524, term2524.getClass(), "magic", "ustar ");
        setField(term2524, term2524.getClass(), "version", "00");
        setField(term2524, term2524.getClass(), "userName", "root");
        setField(term2524, term2524.getClass(), "groupName", "");
        setIntField(term2524, term2524.getClass(), "devMajor", 1876565163);
        setIntField(term2524, term2524.getClass(), "devMinor", -817164822);
        setBooleanField(term2524, term2524.getClass(), "isExtended", true);
        setLongField(term2524, term2524.getClass(), "realSize", -2644215923136513282L);
        setBooleanField(term2524, term2524.getClass(), "paxGNUSparse", false);
        setBooleanField(term2524, term2524.getClass(), "starSparse", false);
        setField(term2563, term2563.getClass(), "path", "HyxfbSQYBe");
        setField(term2563, term2563.getClass(), "status", enum91);
        setIntField(term2563, term2563.getClass(), "prefixLength", -1016503459);
        setField(term2563, term2563.getClass(), "filePath", null);
        setField(term2524, term2524.getClass(), "file", term2563);
        Class<? extends Object> term23460 = Class.forName((String) "java.io.File$PathStatus");
        Field term23459 = ((Class) term23460).getDeclaredField((String) "INVALID");
        ((Field) term23459).setAccessible(true);
        Object enum92 = ((Field) term23459).get((Object) null);
        term23232 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term23245 = newInstance(Class.forName("java.io.File"));
        setField(term23232, term23232.getClass(), "name", "");
        setBooleanField(term23232, term23232.getClass(), "preserveLeadingSlashes", true);
        setIntField(term23232, term23232.getClass(), "mode", -157887805);
        setLongField(term23232, term23232.getClass(), "userId", -5788180182343976541L);
        setLongField(term23232, term23232.getClass(), "groupId", 2936323121573284007L);
        setLongField(term23232, term23232.getClass(), "size", -1154553077993834885L);
        setLongField(term23232, term23232.getClass(), "modTime", -2850532706972744550L);
        setBooleanField(term23232, term23232.getClass(), "checkSumOK", false);
        setByteField(term23232, term23232.getClass(), "linkFlag", (byte) -99);
        setField(term23232, term23232.getClass(), "linkName", "pCTimMblYc");
        setField(term23232, term23232.getClass(), "magic", "ustar ");
        setField(term23232, term23232.getClass(), "version", "00");
        setField(term23232, term23232.getClass(), "userName", "root");
        setField(term23232, term23232.getClass(), "groupName", "");
        setIntField(term23232, term23232.getClass(), "devMajor", 1876565163);
        setIntField(term23232, term23232.getClass(), "devMinor", -817164822);
        setBooleanField(term23232, term23232.getClass(), "isExtended", true);
        setLongField(term23232, term23232.getClass(), "realSize", -2644215923136513282L);
        setBooleanField(term23232, term23232.getClass(), "paxGNUSparse", false);
        setBooleanField(term23232, term23232.getClass(), "starSparse", false);
        setField(term23245, term23245.getClass(), "path", "HyxfbSQYBe");
        setField(term23245, term23245.getClass(), "status", enum92);
        setIntField(term23245, term23245.getClass(), "prefixLength", -1016503459);
        setField(term23245, term23245.getClass(), "filePath", null);
        setField(term23232, term23232.getClass(), "file", term23245);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pCTimMblYc";
        callMethod(klass, "setLinkName", argTypes, term2524, args);
        assertTrue(recursiveEquals(term2524, term23232));
    }

};


