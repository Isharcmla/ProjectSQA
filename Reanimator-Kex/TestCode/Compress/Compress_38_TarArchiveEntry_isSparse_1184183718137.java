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

public class TarArchiveEntry_isSparse_1184183718137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12961;
     Object term42278;

    public TarArchiveEntry_isSparse_1184183718137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term42320 = Class.forName((String) "java.io.File$PathStatus");
        Field term42319 = ((Class) term42320).getDeclaredField((String) "CHECKED");
        ((Field) term42319).setAccessible(true);
        Object enum180 = ((Field) term42319).get((Object) null);
        term12961 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term13000 = newInstance(Class.forName("java.io.File"));
        setField(term12961, term12961.getClass(), "name", "");
        setBooleanField(term12961, term12961.getClass(), "preserveLeadingSlashes", false);
        setIntField(term12961, term12961.getClass(), "mode", 1270666529);
        setLongField(term12961, term12961.getClass(), "userId", 3423965054378869855L);
        setLongField(term12961, term12961.getClass(), "groupId", -593735869267672817L);
        setLongField(term12961, term12961.getClass(), "size", 6041374912351843923L);
        setLongField(term12961, term12961.getClass(), "modTime", 2535970782317488741L);
        setBooleanField(term12961, term12961.getClass(), "checkSumOK", false);
        setByteField(term12961, term12961.getClass(), "linkFlag", (byte) -104);
        setField(term12961, term12961.getClass(), "linkName", "");
        setField(term12961, term12961.getClass(), "magic", "ustar ");
        setField(term12961, term12961.getClass(), "version", "00");
        setField(term12961, term12961.getClass(), "userName", "root");
        setField(term12961, term12961.getClass(), "groupName", "");
        setIntField(term12961, term12961.getClass(), "devMajor", -1146679443);
        setIntField(term12961, term12961.getClass(), "devMinor", -860131894);
        setBooleanField(term12961, term12961.getClass(), "isExtended", false);
        setLongField(term12961, term12961.getClass(), "realSize", -5258945362776941718L);
        setBooleanField(term12961, term12961.getClass(), "paxGNUSparse", true);
        setBooleanField(term12961, term12961.getClass(), "starSparse", true);
        setField(term13000, term13000.getClass(), "path", "tPlsykYBqO");
        setField(term13000, term13000.getClass(), "status", enum180);
        setIntField(term13000, term13000.getClass(), "prefixLength", -1022990421);
        setField(term13000, term13000.getClass(), "filePath", null);
        setField(term12961, term12961.getClass(), "file", term13000);
        Class<? extends Object> term42485 = Class.forName((String) "java.io.File$PathStatus");
        Field term42484 = ((Class) term42485).getDeclaredField((String) "CHECKED");
        ((Field) term42484).setAccessible(true);
        Object enum181 = ((Field) term42484).get((Object) null);
        term42278 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term42291 = newInstance(Class.forName("java.io.File"));
        setField(term42278, term42278.getClass(), "name", "");
        setBooleanField(term42278, term42278.getClass(), "preserveLeadingSlashes", false);
        setIntField(term42278, term42278.getClass(), "mode", 1270666529);
        setLongField(term42278, term42278.getClass(), "userId", 3423965054378869855L);
        setLongField(term42278, term42278.getClass(), "groupId", -593735869267672817L);
        setLongField(term42278, term42278.getClass(), "size", 6041374912351843923L);
        setLongField(term42278, term42278.getClass(), "modTime", 2535970782317488741L);
        setBooleanField(term42278, term42278.getClass(), "checkSumOK", false);
        setByteField(term42278, term42278.getClass(), "linkFlag", (byte) -104);
        setField(term42278, term42278.getClass(), "linkName", "");
        setField(term42278, term42278.getClass(), "magic", "ustar ");
        setField(term42278, term42278.getClass(), "version", "00");
        setField(term42278, term42278.getClass(), "userName", "root");
        setField(term42278, term42278.getClass(), "groupName", "");
        setIntField(term42278, term42278.getClass(), "devMajor", -1146679443);
        setIntField(term42278, term42278.getClass(), "devMinor", -860131894);
        setBooleanField(term42278, term42278.getClass(), "isExtended", false);
        setLongField(term42278, term42278.getClass(), "realSize", -5258945362776941718L);
        setBooleanField(term42278, term42278.getClass(), "paxGNUSparse", true);
        setBooleanField(term42278, term42278.getClass(), "starSparse", true);
        setField(term42291, term42291.getClass(), "path", "tPlsykYBqO");
        setField(term42291, term42291.getClass(), "status", enum181);
        setIntField(term42291, term42291.getClass(), "prefixLength", -1022990421);
        setField(term42291, term42291.getClass(), "filePath", null);
        setField(term42278, term42278.getClass(), "file", term42291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isSparse", argTypes, term12961, args);
        assertTrue(recursiveEquals(term12961, term42278));
        assertTrue(recursiveEquals(retValue, true));
    }

};


