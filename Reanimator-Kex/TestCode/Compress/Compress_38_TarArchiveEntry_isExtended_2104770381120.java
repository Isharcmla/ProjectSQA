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

public class TarArchiveEntry_isExtended_2104770381120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9068;
     Object term35239;

    public TarArchiveEntry_isExtended_2104770381120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term35280 = Class.forName((String) "java.io.File$PathStatus");
        Field term35279 = ((Class) term35280).getDeclaredField((String) "INVALID");
        ((Field) term35279).setAccessible(true);
        Object enum147 = ((Field) term35279).get((Object) null);
        term9068 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term9107 = newInstance(Class.forName("java.io.File"));
        setField(term9068, term9068.getClass(), "name", "");
        setBooleanField(term9068, term9068.getClass(), "preserveLeadingSlashes", false);
        setIntField(term9068, term9068.getClass(), "mode", -523949691);
        setLongField(term9068, term9068.getClass(), "userId", 4394651392080968777L);
        setLongField(term9068, term9068.getClass(), "groupId", -7310273014364148916L);
        setLongField(term9068, term9068.getClass(), "size", 8863790908271299748L);
        setLongField(term9068, term9068.getClass(), "modTime", 9205327385733285058L);
        setBooleanField(term9068, term9068.getClass(), "checkSumOK", true);
        setByteField(term9068, term9068.getClass(), "linkFlag", (byte) -123);
        setField(term9068, term9068.getClass(), "linkName", "");
        setField(term9068, term9068.getClass(), "magic", "ustar ");
        setField(term9068, term9068.getClass(), "version", "00");
        setField(term9068, term9068.getClass(), "userName", "root");
        setField(term9068, term9068.getClass(), "groupName", "");
        setIntField(term9068, term9068.getClass(), "devMajor", 1398204340);
        setIntField(term9068, term9068.getClass(), "devMinor", 229204365);
        setBooleanField(term9068, term9068.getClass(), "isExtended", true);
        setLongField(term9068, term9068.getClass(), "realSize", 4199886998224701110L);
        setBooleanField(term9068, term9068.getClass(), "paxGNUSparse", true);
        setBooleanField(term9068, term9068.getClass(), "starSparse", false);
        setField(term9107, term9107.getClass(), "path", "UiUYnPrcCi");
        setField(term9107, term9107.getClass(), "status", enum147);
        setIntField(term9107, term9107.getClass(), "prefixLength", -461771056);
        setField(term9107, term9107.getClass(), "filePath", null);
        setField(term9068, term9068.getClass(), "file", term9107);
        Class<? extends Object> term35446 = Class.forName((String) "java.io.File$PathStatus");
        Field term35445 = ((Class) term35446).getDeclaredField((String) "INVALID");
        ((Field) term35445).setAccessible(true);
        Object enum148 = ((Field) term35445).get((Object) null);
        term35239 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term35252 = newInstance(Class.forName("java.io.File"));
        setField(term35239, term35239.getClass(), "name", "");
        setBooleanField(term35239, term35239.getClass(), "preserveLeadingSlashes", false);
        setIntField(term35239, term35239.getClass(), "mode", -523949691);
        setLongField(term35239, term35239.getClass(), "userId", 4394651392080968777L);
        setLongField(term35239, term35239.getClass(), "groupId", -7310273014364148916L);
        setLongField(term35239, term35239.getClass(), "size", 8863790908271299748L);
        setLongField(term35239, term35239.getClass(), "modTime", 9205327385733285058L);
        setBooleanField(term35239, term35239.getClass(), "checkSumOK", true);
        setByteField(term35239, term35239.getClass(), "linkFlag", (byte) -123);
        setField(term35239, term35239.getClass(), "linkName", "");
        setField(term35239, term35239.getClass(), "magic", "ustar ");
        setField(term35239, term35239.getClass(), "version", "00");
        setField(term35239, term35239.getClass(), "userName", "root");
        setField(term35239, term35239.getClass(), "groupName", "");
        setIntField(term35239, term35239.getClass(), "devMajor", 1398204340);
        setIntField(term35239, term35239.getClass(), "devMinor", 229204365);
        setBooleanField(term35239, term35239.getClass(), "isExtended", true);
        setLongField(term35239, term35239.getClass(), "realSize", 4199886998224701110L);
        setBooleanField(term35239, term35239.getClass(), "paxGNUSparse", true);
        setBooleanField(term35239, term35239.getClass(), "starSparse", false);
        setField(term35252, term35252.getClass(), "path", "UiUYnPrcCi");
        setField(term35252, term35252.getClass(), "status", enum148);
        setIntField(term35252, term35252.getClass(), "prefixLength", -461771056);
        setField(term35252, term35252.getClass(), "filePath", null);
        setField(term35239, term35239.getClass(), "file", term35252);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isExtended", argTypes, term9068, args);
        assertTrue(recursiveEquals(term9068, term35239));
    }

};


