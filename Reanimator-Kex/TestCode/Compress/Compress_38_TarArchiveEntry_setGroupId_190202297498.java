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

public class TarArchiveEntry_setGroupId_190202297498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3924;
     Object term3988;
     Object term25743;

    public TarArchiveEntry_setGroupId_190202297498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25784 = Class.forName((String) "java.io.File$PathStatus");
        Field term25783 = ((Class) term25784).getDeclaredField((String) "INVALID");
        ((Field) term25783).setAccessible(true);
        Object enum103 = ((Field) term25783).get((Object) null);
        term3924 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term3963 = newInstance(Class.forName("java.io.File"));
        setField(term3924, term3924.getClass(), "name", "");
        setBooleanField(term3924, term3924.getClass(), "preserveLeadingSlashes", true);
        setIntField(term3924, term3924.getClass(), "mode", -112921587);
        setLongField(term3924, term3924.getClass(), "userId", 6005241913654469005L);
        setLongField(term3924, term3924.getClass(), "groupId", -1983291584002806658L);
        setLongField(term3924, term3924.getClass(), "size", 5946780097489996391L);
        setLongField(term3924, term3924.getClass(), "modTime", -8652538484981166496L);
        setBooleanField(term3924, term3924.getClass(), "checkSumOK", false);
        setByteField(term3924, term3924.getClass(), "linkFlag", (byte) -15);
        setField(term3924, term3924.getClass(), "linkName", "");
        setField(term3924, term3924.getClass(), "magic", "ustar ");
        setField(term3924, term3924.getClass(), "version", "00");
        setField(term3924, term3924.getClass(), "userName", "root");
        setField(term3924, term3924.getClass(), "groupName", "");
        setIntField(term3924, term3924.getClass(), "devMajor", 933028652);
        setIntField(term3924, term3924.getClass(), "devMinor", 287287233);
        setBooleanField(term3924, term3924.getClass(), "isExtended", true);
        setLongField(term3924, term3924.getClass(), "realSize", 2701184207686293431L);
        setBooleanField(term3924, term3924.getClass(), "paxGNUSparse", false);
        setBooleanField(term3924, term3924.getClass(), "starSparse", true);
        setField(term3963, term3963.getClass(), "path", "vrQLuWIDJX");
        setField(term3963, term3963.getClass(), "status", enum103);
        setIntField(term3963, term3963.getClass(), "prefixLength", 962840079);
        setField(term3963, term3963.getClass(), "filePath", null);
        setField(term3924, term3924.getClass(), "file", term3963);
        term3988 = new Integer(1540719661);
        Class<? extends Object> term25949 = Class.forName((String) "java.io.File$PathStatus");
        Field term25948 = ((Class) term25949).getDeclaredField((String) "INVALID");
        ((Field) term25948).setAccessible(true);
        Object enum104 = ((Field) term25948).get((Object) null);
        term25743 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term25756 = newInstance(Class.forName("java.io.File"));
        setField(term25743, term25743.getClass(), "name", "");
        setBooleanField(term25743, term25743.getClass(), "preserveLeadingSlashes", true);
        setIntField(term25743, term25743.getClass(), "mode", -112921587);
        setLongField(term25743, term25743.getClass(), "userId", 6005241913654469005L);
        setLongField(term25743, term25743.getClass(), "groupId", 1540719661L);
        setLongField(term25743, term25743.getClass(), "size", 5946780097489996391L);
        setLongField(term25743, term25743.getClass(), "modTime", -8652538484981166496L);
        setBooleanField(term25743, term25743.getClass(), "checkSumOK", false);
        setByteField(term25743, term25743.getClass(), "linkFlag", (byte) -15);
        setField(term25743, term25743.getClass(), "linkName", "");
        setField(term25743, term25743.getClass(), "magic", "ustar ");
        setField(term25743, term25743.getClass(), "version", "00");
        setField(term25743, term25743.getClass(), "userName", "root");
        setField(term25743, term25743.getClass(), "groupName", "");
        setIntField(term25743, term25743.getClass(), "devMajor", 933028652);
        setIntField(term25743, term25743.getClass(), "devMinor", 287287233);
        setBooleanField(term25743, term25743.getClass(), "isExtended", true);
        setLongField(term25743, term25743.getClass(), "realSize", 2701184207686293431L);
        setBooleanField(term25743, term25743.getClass(), "paxGNUSparse", false);
        setBooleanField(term25743, term25743.getClass(), "starSparse", true);
        setField(term25756, term25756.getClass(), "path", "vrQLuWIDJX");
        setField(term25756, term25756.getClass(), "status", enum104);
        setIntField(term25756, term25756.getClass(), "prefixLength", 962840079);
        setField(term25756, term25756.getClass(), "filePath", null);
        setField(term25743, term25743.getClass(), "file", term25756);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3988;
        callMethod(klass, "setGroupId", argTypes, term3924, args);
        assertTrue(recursiveEquals(term3924, term25743));
        assertTrue(recursiveEquals(term3988, 1540719661));
    }

};


