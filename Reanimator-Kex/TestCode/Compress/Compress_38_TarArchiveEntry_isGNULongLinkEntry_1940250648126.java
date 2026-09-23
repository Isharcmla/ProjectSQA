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

public class TarArchiveEntry_isGNULongLinkEntry_1940250648126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10442;
     Object term38123;

    public TarArchiveEntry_isGNULongLinkEntry_1940250648126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38165 = Class.forName((String) "java.io.File$PathStatus");
        Field term38164 = ((Class) term38165).getDeclaredField((String) "CHECKED");
        ((Field) term38164).setAccessible(true);
        Object enum159 = ((Field) term38164).get((Object) null);
        term10442 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term10481 = newInstance(Class.forName("java.io.File"));
        setField(term10442, term10442.getClass(), "name", "");
        setBooleanField(term10442, term10442.getClass(), "preserveLeadingSlashes", true);
        setIntField(term10442, term10442.getClass(), "mode", -507387516);
        setLongField(term10442, term10442.getClass(), "userId", -1592696983130738594L);
        setLongField(term10442, term10442.getClass(), "groupId", 6902365338255307910L);
        setLongField(term10442, term10442.getClass(), "size", -8019730974733786399L);
        setLongField(term10442, term10442.getClass(), "modTime", 394960377236392159L);
        setBooleanField(term10442, term10442.getClass(), "checkSumOK", true);
        setByteField(term10442, term10442.getClass(), "linkFlag", (byte) 98);
        setField(term10442, term10442.getClass(), "linkName", "");
        setField(term10442, term10442.getClass(), "magic", "ustar ");
        setField(term10442, term10442.getClass(), "version", "00");
        setField(term10442, term10442.getClass(), "userName", "root");
        setField(term10442, term10442.getClass(), "groupName", "");
        setIntField(term10442, term10442.getClass(), "devMajor", -1970452551);
        setIntField(term10442, term10442.getClass(), "devMinor", -1896376975);
        setBooleanField(term10442, term10442.getClass(), "isExtended", true);
        setLongField(term10442, term10442.getClass(), "realSize", -2955854401507097864L);
        setBooleanField(term10442, term10442.getClass(), "paxGNUSparse", true);
        setBooleanField(term10442, term10442.getClass(), "starSparse", false);
        setField(term10481, term10481.getClass(), "path", "MLqYREekMl");
        setField(term10481, term10481.getClass(), "status", enum159);
        setIntField(term10481, term10481.getClass(), "prefixLength", 729658803);
        setField(term10481, term10481.getClass(), "filePath", null);
        setField(term10442, term10442.getClass(), "file", term10481);
        Class<? extends Object> term38330 = Class.forName((String) "java.io.File$PathStatus");
        Field term38329 = ((Class) term38330).getDeclaredField((String) "CHECKED");
        ((Field) term38329).setAccessible(true);
        Object enum160 = ((Field) term38329).get((Object) null);
        term38123 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term38136 = newInstance(Class.forName("java.io.File"));
        setField(term38123, term38123.getClass(), "name", "");
        setBooleanField(term38123, term38123.getClass(), "preserveLeadingSlashes", true);
        setIntField(term38123, term38123.getClass(), "mode", -507387516);
        setLongField(term38123, term38123.getClass(), "userId", -1592696983130738594L);
        setLongField(term38123, term38123.getClass(), "groupId", 6902365338255307910L);
        setLongField(term38123, term38123.getClass(), "size", -8019730974733786399L);
        setLongField(term38123, term38123.getClass(), "modTime", 394960377236392159L);
        setBooleanField(term38123, term38123.getClass(), "checkSumOK", true);
        setByteField(term38123, term38123.getClass(), "linkFlag", (byte) 98);
        setField(term38123, term38123.getClass(), "linkName", "");
        setField(term38123, term38123.getClass(), "magic", "ustar ");
        setField(term38123, term38123.getClass(), "version", "00");
        setField(term38123, term38123.getClass(), "userName", "root");
        setField(term38123, term38123.getClass(), "groupName", "");
        setIntField(term38123, term38123.getClass(), "devMajor", -1970452551);
        setIntField(term38123, term38123.getClass(), "devMinor", -1896376975);
        setBooleanField(term38123, term38123.getClass(), "isExtended", true);
        setLongField(term38123, term38123.getClass(), "realSize", -2955854401507097864L);
        setBooleanField(term38123, term38123.getClass(), "paxGNUSparse", true);
        setBooleanField(term38123, term38123.getClass(), "starSparse", false);
        setField(term38136, term38136.getClass(), "path", "MLqYREekMl");
        setField(term38136, term38136.getClass(), "status", enum160);
        setIntField(term38136, term38136.getClass(), "prefixLength", 729658803);
        setField(term38136, term38136.getClass(), "filePath", null);
        setField(term38123, term38123.getClass(), "file", term38136);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isGNULongLinkEntry", argTypes, term10442, args);
        assertTrue(recursiveEquals(term10442, term38123));
        assertTrue(recursiveEquals(retValue, false));
    }

};


