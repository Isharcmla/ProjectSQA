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

public class TarArchiveEntry_getRealSize_455445467121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9297;
     Object term35652;

    public TarArchiveEntry_getRealSize_455445467121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term35693 = Class.forName((String) "java.io.File$PathStatus");
        Field term35692 = ((Class) term35693).getDeclaredField((String) "INVALID");
        ((Field) term35692).setAccessible(true);
        Object enum149 = ((Field) term35692).get((Object) null);
        term9297 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term9336 = newInstance(Class.forName("java.io.File"));
        setField(term9297, term9297.getClass(), "name", "");
        setBooleanField(term9297, term9297.getClass(), "preserveLeadingSlashes", true);
        setIntField(term9297, term9297.getClass(), "mode", -243422082);
        setLongField(term9297, term9297.getClass(), "userId", 8540994973773607992L);
        setLongField(term9297, term9297.getClass(), "groupId", -2338103433822116635L);
        setLongField(term9297, term9297.getClass(), "size", -1885698929232124806L);
        setLongField(term9297, term9297.getClass(), "modTime", 5731563613239387113L);
        setBooleanField(term9297, term9297.getClass(), "checkSumOK", false);
        setByteField(term9297, term9297.getClass(), "linkFlag", (byte) -23);
        setField(term9297, term9297.getClass(), "linkName", "");
        setField(term9297, term9297.getClass(), "magic", "ustar ");
        setField(term9297, term9297.getClass(), "version", "00");
        setField(term9297, term9297.getClass(), "userName", "root");
        setField(term9297, term9297.getClass(), "groupName", "");
        setIntField(term9297, term9297.getClass(), "devMajor", 1384592638);
        setIntField(term9297, term9297.getClass(), "devMinor", -1002370457);
        setBooleanField(term9297, term9297.getClass(), "isExtended", true);
        setLongField(term9297, term9297.getClass(), "realSize", 3381333711768010594L);
        setBooleanField(term9297, term9297.getClass(), "paxGNUSparse", true);
        setBooleanField(term9297, term9297.getClass(), "starSparse", false);
        setField(term9336, term9336.getClass(), "path", "UoYtihxVaS");
        setField(term9336, term9336.getClass(), "status", enum149);
        setIntField(term9336, term9336.getClass(), "prefixLength", -2014576105);
        setField(term9336, term9336.getClass(), "filePath", null);
        setField(term9297, term9297.getClass(), "file", term9336);
        Class<? extends Object> term35858 = Class.forName((String) "java.io.File$PathStatus");
        Field term35857 = ((Class) term35858).getDeclaredField((String) "INVALID");
        ((Field) term35857).setAccessible(true);
        Object enum150 = ((Field) term35857).get((Object) null);
        term35652 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term35665 = newInstance(Class.forName("java.io.File"));
        setField(term35652, term35652.getClass(), "name", "");
        setBooleanField(term35652, term35652.getClass(), "preserveLeadingSlashes", true);
        setIntField(term35652, term35652.getClass(), "mode", -243422082);
        setLongField(term35652, term35652.getClass(), "userId", 8540994973773607992L);
        setLongField(term35652, term35652.getClass(), "groupId", -2338103433822116635L);
        setLongField(term35652, term35652.getClass(), "size", -1885698929232124806L);
        setLongField(term35652, term35652.getClass(), "modTime", 5731563613239387113L);
        setBooleanField(term35652, term35652.getClass(), "checkSumOK", false);
        setByteField(term35652, term35652.getClass(), "linkFlag", (byte) -23);
        setField(term35652, term35652.getClass(), "linkName", "");
        setField(term35652, term35652.getClass(), "magic", "ustar ");
        setField(term35652, term35652.getClass(), "version", "00");
        setField(term35652, term35652.getClass(), "userName", "root");
        setField(term35652, term35652.getClass(), "groupName", "");
        setIntField(term35652, term35652.getClass(), "devMajor", 1384592638);
        setIntField(term35652, term35652.getClass(), "devMinor", -1002370457);
        setBooleanField(term35652, term35652.getClass(), "isExtended", true);
        setLongField(term35652, term35652.getClass(), "realSize", 3381333711768010594L);
        setBooleanField(term35652, term35652.getClass(), "paxGNUSparse", true);
        setBooleanField(term35652, term35652.getClass(), "starSparse", false);
        setField(term35665, term35665.getClass(), "path", "UoYtihxVaS");
        setField(term35665, term35665.getClass(), "status", enum150);
        setIntField(term35665, term35665.getClass(), "prefixLength", -2014576105);
        setField(term35665, term35665.getClass(), "filePath", null);
        setField(term35652, term35652.getClass(), "file", term35665);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRealSize", argTypes, term9297, args);
        assertTrue(recursiveEquals(term9297, term35652));
        assertTrue(recursiveEquals(retValue, 3381333711768010594L));
    }

};


