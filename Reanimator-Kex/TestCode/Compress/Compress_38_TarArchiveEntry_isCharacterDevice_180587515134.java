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

public class TarArchiveEntry_isCharacterDevice_180587515134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12274;
     Object term40519;

    public TarArchiveEntry_isCharacterDevice_180587515134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40561 = Class.forName((String) "java.io.File$PathStatus");
        Field term40560 = ((Class) term40561).getDeclaredField((String) "CHECKED");
        ((Field) term40560).setAccessible(true);
        Object enum171 = ((Field) term40560).get((Object) null);
        term12274 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term12313 = newInstance(Class.forName("java.io.File"));
        setField(term12274, term12274.getClass(), "name", "");
        setBooleanField(term12274, term12274.getClass(), "preserveLeadingSlashes", false);
        setIntField(term12274, term12274.getClass(), "mode", -2131181468);
        setLongField(term12274, term12274.getClass(), "userId", 2209808079059619773L);
        setLongField(term12274, term12274.getClass(), "groupId", 8403492202041709902L);
        setLongField(term12274, term12274.getClass(), "size", -113028659747841511L);
        setLongField(term12274, term12274.getClass(), "modTime", 7271112616766426991L);
        setBooleanField(term12274, term12274.getClass(), "checkSumOK", false);
        setByteField(term12274, term12274.getClass(), "linkFlag", (byte) -118);
        setField(term12274, term12274.getClass(), "linkName", "");
        setField(term12274, term12274.getClass(), "magic", "ustar ");
        setField(term12274, term12274.getClass(), "version", "00");
        setField(term12274, term12274.getClass(), "userName", "root");
        setField(term12274, term12274.getClass(), "groupName", "");
        setIntField(term12274, term12274.getClass(), "devMajor", 282916351);
        setIntField(term12274, term12274.getClass(), "devMinor", 880977281);
        setBooleanField(term12274, term12274.getClass(), "isExtended", false);
        setLongField(term12274, term12274.getClass(), "realSize", -8514728180792822493L);
        setBooleanField(term12274, term12274.getClass(), "paxGNUSparse", true);
        setBooleanField(term12274, term12274.getClass(), "starSparse", false);
        setField(term12313, term12313.getClass(), "path", "uWHnvSvaPl");
        setField(term12313, term12313.getClass(), "status", enum171);
        setIntField(term12313, term12313.getClass(), "prefixLength", 371943306);
        setField(term12313, term12313.getClass(), "filePath", null);
        setField(term12274, term12274.getClass(), "file", term12313);
        Class<? extends Object> term40726 = Class.forName((String) "java.io.File$PathStatus");
        Field term40725 = ((Class) term40726).getDeclaredField((String) "CHECKED");
        ((Field) term40725).setAccessible(true);
        Object enum172 = ((Field) term40725).get((Object) null);
        term40519 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term40532 = newInstance(Class.forName("java.io.File"));
        setField(term40519, term40519.getClass(), "name", "");
        setBooleanField(term40519, term40519.getClass(), "preserveLeadingSlashes", false);
        setIntField(term40519, term40519.getClass(), "mode", -2131181468);
        setLongField(term40519, term40519.getClass(), "userId", 2209808079059619773L);
        setLongField(term40519, term40519.getClass(), "groupId", 8403492202041709902L);
        setLongField(term40519, term40519.getClass(), "size", -113028659747841511L);
        setLongField(term40519, term40519.getClass(), "modTime", 7271112616766426991L);
        setBooleanField(term40519, term40519.getClass(), "checkSumOK", false);
        setByteField(term40519, term40519.getClass(), "linkFlag", (byte) -118);
        setField(term40519, term40519.getClass(), "linkName", "");
        setField(term40519, term40519.getClass(), "magic", "ustar ");
        setField(term40519, term40519.getClass(), "version", "00");
        setField(term40519, term40519.getClass(), "userName", "root");
        setField(term40519, term40519.getClass(), "groupName", "");
        setIntField(term40519, term40519.getClass(), "devMajor", 282916351);
        setIntField(term40519, term40519.getClass(), "devMinor", 880977281);
        setBooleanField(term40519, term40519.getClass(), "isExtended", false);
        setLongField(term40519, term40519.getClass(), "realSize", -8514728180792822493L);
        setBooleanField(term40519, term40519.getClass(), "paxGNUSparse", true);
        setBooleanField(term40519, term40519.getClass(), "starSparse", false);
        setField(term40532, term40532.getClass(), "path", "uWHnvSvaPl");
        setField(term40532, term40532.getClass(), "status", enum172);
        setIntField(term40532, term40532.getClass(), "prefixLength", 371943306);
        setField(term40532, term40532.getClass(), "filePath", null);
        setField(term40519, term40519.getClass(), "file", term40532);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isCharacterDevice", argTypes, term12274, args);
        assertTrue(recursiveEquals(term12274, term40519));
        assertTrue(recursiveEquals(retValue, false));
    }

};


