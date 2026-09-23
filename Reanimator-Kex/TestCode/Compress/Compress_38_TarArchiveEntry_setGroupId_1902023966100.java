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
import java.lang.Long;

public class TarArchiveEntry_setGroupId_1902023966100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4384;
     Object term4448;
     Object term26569;

    public TarArchiveEntry_setGroupId_1902023966100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26610 = Class.forName((String) "java.io.File$PathStatus");
        Field term26609 = ((Class) term26610).getDeclaredField((String) "CHECKED");
        ((Field) term26609).setAccessible(true);
        Object enum107 = ((Field) term26609).get((Object) null);
        term4384 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term4423 = newInstance(Class.forName("java.io.File"));
        setField(term4384, term4384.getClass(), "name", "");
        setBooleanField(term4384, term4384.getClass(), "preserveLeadingSlashes", true);
        setIntField(term4384, term4384.getClass(), "mode", 1063420942);
        setLongField(term4384, term4384.getClass(), "userId", 5836128569274066678L);
        setLongField(term4384, term4384.getClass(), "groupId", -2177368829816872572L);
        setLongField(term4384, term4384.getClass(), "size", -8463029266761149071L);
        setLongField(term4384, term4384.getClass(), "modTime", 3133860696238261492L);
        setBooleanField(term4384, term4384.getClass(), "checkSumOK", true);
        setByteField(term4384, term4384.getClass(), "linkFlag", (byte) 118);
        setField(term4384, term4384.getClass(), "linkName", "");
        setField(term4384, term4384.getClass(), "magic", "ustar ");
        setField(term4384, term4384.getClass(), "version", "00");
        setField(term4384, term4384.getClass(), "userName", "root");
        setField(term4384, term4384.getClass(), "groupName", "");
        setIntField(term4384, term4384.getClass(), "devMajor", 1375330971);
        setIntField(term4384, term4384.getClass(), "devMinor", -478195677);
        setBooleanField(term4384, term4384.getClass(), "isExtended", false);
        setLongField(term4384, term4384.getClass(), "realSize", 7247160664318067468L);
        setBooleanField(term4384, term4384.getClass(), "paxGNUSparse", false);
        setBooleanField(term4384, term4384.getClass(), "starSparse", true);
        setField(term4423, term4423.getClass(), "path", "OclPbYPkcH");
        setField(term4423, term4423.getClass(), "status", enum107);
        setIntField(term4423, term4423.getClass(), "prefixLength", 972867650);
        setField(term4423, term4423.getClass(), "filePath", null);
        setField(term4384, term4384.getClass(), "file", term4423);
        term4448 = new Long(2135754395358000892L);
        Class<? extends Object> term26775 = Class.forName((String) "java.io.File$PathStatus");
        Field term26774 = ((Class) term26775).getDeclaredField((String) "CHECKED");
        ((Field) term26774).setAccessible(true);
        Object enum108 = ((Field) term26774).get((Object) null);
        term26569 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term26582 = newInstance(Class.forName("java.io.File"));
        setField(term26569, term26569.getClass(), "name", "");
        setBooleanField(term26569, term26569.getClass(), "preserveLeadingSlashes", true);
        setIntField(term26569, term26569.getClass(), "mode", 1063420942);
        setLongField(term26569, term26569.getClass(), "userId", 5836128569274066678L);
        setLongField(term26569, term26569.getClass(), "groupId", 2135754395358000892L);
        setLongField(term26569, term26569.getClass(), "size", -8463029266761149071L);
        setLongField(term26569, term26569.getClass(), "modTime", 3133860696238261492L);
        setBooleanField(term26569, term26569.getClass(), "checkSumOK", true);
        setByteField(term26569, term26569.getClass(), "linkFlag", (byte) 118);
        setField(term26569, term26569.getClass(), "linkName", "");
        setField(term26569, term26569.getClass(), "magic", "ustar ");
        setField(term26569, term26569.getClass(), "version", "00");
        setField(term26569, term26569.getClass(), "userName", "root");
        setField(term26569, term26569.getClass(), "groupName", "");
        setIntField(term26569, term26569.getClass(), "devMajor", 1375330971);
        setIntField(term26569, term26569.getClass(), "devMinor", -478195677);
        setBooleanField(term26569, term26569.getClass(), "isExtended", false);
        setLongField(term26569, term26569.getClass(), "realSize", 7247160664318067468L);
        setBooleanField(term26569, term26569.getClass(), "paxGNUSparse", false);
        setBooleanField(term26569, term26569.getClass(), "starSparse", true);
        setField(term26582, term26582.getClass(), "path", "OclPbYPkcH");
        setField(term26582, term26582.getClass(), "status", enum108);
        setIntField(term26582, term26582.getClass(), "prefixLength", 972867650);
        setField(term26582, term26582.getClass(), "filePath", null);
        setField(term26569, term26569.getClass(), "file", term26582);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4448;
        callMethod(klass, "setGroupId", argTypes, term4384, args);
        assertTrue(recursiveEquals(term4384, term26569));
        assertTrue(recursiveEquals(term4448, 2135754395358000892L));
    }

};


