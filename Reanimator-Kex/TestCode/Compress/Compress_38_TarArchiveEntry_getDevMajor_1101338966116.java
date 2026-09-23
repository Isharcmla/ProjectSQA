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

public class TarArchiveEntry_getDevMajor_1101338966116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8148;
     Object term33585;

    public TarArchiveEntry_getDevMajor_1101338966116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33627 = Class.forName((String) "java.io.File$PathStatus");
        Field term33626 = ((Class) term33627).getDeclaredField((String) "CHECKED");
        ((Field) term33626).setAccessible(true);
        Object enum139 = ((Field) term33626).get((Object) null);
        term8148 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term8187 = newInstance(Class.forName("java.io.File"));
        setField(term8148, term8148.getClass(), "name", "");
        setBooleanField(term8148, term8148.getClass(), "preserveLeadingSlashes", false);
        setIntField(term8148, term8148.getClass(), "mode", 344323424);
        setLongField(term8148, term8148.getClass(), "userId", -5447369594017685765L);
        setLongField(term8148, term8148.getClass(), "groupId", -5724112525188606013L);
        setLongField(term8148, term8148.getClass(), "size", -6100012593724108983L);
        setLongField(term8148, term8148.getClass(), "modTime", 5465527210299101732L);
        setBooleanField(term8148, term8148.getClass(), "checkSumOK", true);
        setByteField(term8148, term8148.getClass(), "linkFlag", (byte) -22);
        setField(term8148, term8148.getClass(), "linkName", "");
        setField(term8148, term8148.getClass(), "magic", "ustar ");
        setField(term8148, term8148.getClass(), "version", "00");
        setField(term8148, term8148.getClass(), "userName", "root");
        setField(term8148, term8148.getClass(), "groupName", "");
        setIntField(term8148, term8148.getClass(), "devMajor", 9726679);
        setIntField(term8148, term8148.getClass(), "devMinor", -25637976);
        setBooleanField(term8148, term8148.getClass(), "isExtended", false);
        setLongField(term8148, term8148.getClass(), "realSize", 4699157009689333952L);
        setBooleanField(term8148, term8148.getClass(), "paxGNUSparse", true);
        setBooleanField(term8148, term8148.getClass(), "starSparse", true);
        setField(term8187, term8187.getClass(), "path", "LvtrsXUliU");
        setField(term8187, term8187.getClass(), "status", enum139);
        setIntField(term8187, term8187.getClass(), "prefixLength", 1555897383);
        setField(term8187, term8187.getClass(), "filePath", null);
        setField(term8148, term8148.getClass(), "file", term8187);
        Class<? extends Object> term33856 = Class.forName((String) "java.io.File$PathStatus");
        Field term33855 = ((Class) term33856).getDeclaredField((String) "CHECKED");
        ((Field) term33855).setAccessible(true);
        Object enum140 = ((Field) term33855).get((Object) null);
        term33585 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term33598 = newInstance(Class.forName("java.io.File"));
        setField(term33585, term33585.getClass(), "name", "");
        setBooleanField(term33585, term33585.getClass(), "preserveLeadingSlashes", false);
        setIntField(term33585, term33585.getClass(), "mode", 344323424);
        setLongField(term33585, term33585.getClass(), "userId", -5447369594017685765L);
        setLongField(term33585, term33585.getClass(), "groupId", -5724112525188606013L);
        setLongField(term33585, term33585.getClass(), "size", -6100012593724108983L);
        setLongField(term33585, term33585.getClass(), "modTime", 5465527210299101732L);
        setBooleanField(term33585, term33585.getClass(), "checkSumOK", true);
        setByteField(term33585, term33585.getClass(), "linkFlag", (byte) -22);
        setField(term33585, term33585.getClass(), "linkName", "");
        setField(term33585, term33585.getClass(), "magic", "ustar ");
        setField(term33585, term33585.getClass(), "version", "00");
        setField(term33585, term33585.getClass(), "userName", "root");
        setField(term33585, term33585.getClass(), "groupName", "");
        setIntField(term33585, term33585.getClass(), "devMajor", 9726679);
        setIntField(term33585, term33585.getClass(), "devMinor", -25637976);
        setBooleanField(term33585, term33585.getClass(), "isExtended", false);
        setLongField(term33585, term33585.getClass(), "realSize", 4699157009689333952L);
        setBooleanField(term33585, term33585.getClass(), "paxGNUSparse", true);
        setBooleanField(term33585, term33585.getClass(), "starSparse", true);
        setField(term33598, term33598.getClass(), "path", "LvtrsXUliU");
        setField(term33598, term33598.getClass(), "status", enum140);
        setIntField(term33598, term33598.getClass(), "prefixLength", 1555897383);
        setField(term33598, term33598.getClass(), "filePath", null);
        setField(term33585, term33585.getClass(), "file", term33598);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDevMajor", argTypes, term8148, args);
        assertTrue(recursiveEquals(term8148, term33585));
        assertTrue(recursiveEquals(retValue, 9726679));
    }

};


