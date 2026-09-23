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

public class TarArchiveEntry_isPaxHeader_253447802128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10900;
     Object term38472;

    public TarArchiveEntry_isPaxHeader_253447802128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38514 = Class.forName((String) "java.io.File$PathStatus");
        Field term38513 = ((Class) term38514).getDeclaredField((String) "INVALID");
        ((Field) term38513).setAccessible(true);
        Object enum161 = ((Field) term38513).get((Object) null);
        term10900 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term10939 = newInstance(Class.forName("java.io.File"));
        setField(term10900, term10900.getClass(), "name", "");
        setBooleanField(term10900, term10900.getClass(), "preserveLeadingSlashes", true);
        setIntField(term10900, term10900.getClass(), "mode", -1899301124);
        setLongField(term10900, term10900.getClass(), "userId", -8862087040734407227L);
        setLongField(term10900, term10900.getClass(), "groupId", -6394943900800506753L);
        setLongField(term10900, term10900.getClass(), "size", -4867941246533901410L);
        setLongField(term10900, term10900.getClass(), "modTime", 1044883697493326351L);
        setBooleanField(term10900, term10900.getClass(), "checkSumOK", false);
        setByteField(term10900, term10900.getClass(), "linkFlag", (byte) 61);
        setField(term10900, term10900.getClass(), "linkName", "");
        setField(term10900, term10900.getClass(), "magic", "ustar ");
        setField(term10900, term10900.getClass(), "version", "00");
        setField(term10900, term10900.getClass(), "userName", "root");
        setField(term10900, term10900.getClass(), "groupName", "");
        setIntField(term10900, term10900.getClass(), "devMajor", -1882480155);
        setIntField(term10900, term10900.getClass(), "devMinor", -1410220680);
        setBooleanField(term10900, term10900.getClass(), "isExtended", true);
        setLongField(term10900, term10900.getClass(), "realSize", -7406618974062419277L);
        setBooleanField(term10900, term10900.getClass(), "paxGNUSparse", true);
        setBooleanField(term10900, term10900.getClass(), "starSparse", true);
        setField(term10939, term10939.getClass(), "path", "nHXjMycHlU");
        setField(term10939, term10939.getClass(), "status", enum161);
        setIntField(term10939, term10939.getClass(), "prefixLength", 389427431);
        setField(term10939, term10939.getClass(), "filePath", null);
        setField(term10900, term10900.getClass(), "file", term10939);
        Class<? extends Object> term38679 = Class.forName((String) "java.io.File$PathStatus");
        Field term38678 = ((Class) term38679).getDeclaredField((String) "INVALID");
        ((Field) term38678).setAccessible(true);
        Object enum162 = ((Field) term38678).get((Object) null);
        term38472 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term38485 = newInstance(Class.forName("java.io.File"));
        setField(term38472, term38472.getClass(), "name", "");
        setBooleanField(term38472, term38472.getClass(), "preserveLeadingSlashes", true);
        setIntField(term38472, term38472.getClass(), "mode", -1899301124);
        setLongField(term38472, term38472.getClass(), "userId", -8862087040734407227L);
        setLongField(term38472, term38472.getClass(), "groupId", -6394943900800506753L);
        setLongField(term38472, term38472.getClass(), "size", -4867941246533901410L);
        setLongField(term38472, term38472.getClass(), "modTime", 1044883697493326351L);
        setBooleanField(term38472, term38472.getClass(), "checkSumOK", false);
        setByteField(term38472, term38472.getClass(), "linkFlag", (byte) 61);
        setField(term38472, term38472.getClass(), "linkName", "");
        setField(term38472, term38472.getClass(), "magic", "ustar ");
        setField(term38472, term38472.getClass(), "version", "00");
        setField(term38472, term38472.getClass(), "userName", "root");
        setField(term38472, term38472.getClass(), "groupName", "");
        setIntField(term38472, term38472.getClass(), "devMajor", -1882480155);
        setIntField(term38472, term38472.getClass(), "devMinor", -1410220680);
        setBooleanField(term38472, term38472.getClass(), "isExtended", true);
        setLongField(term38472, term38472.getClass(), "realSize", -7406618974062419277L);
        setBooleanField(term38472, term38472.getClass(), "paxGNUSparse", true);
        setBooleanField(term38472, term38472.getClass(), "starSparse", true);
        setField(term38485, term38485.getClass(), "path", "nHXjMycHlU");
        setField(term38485, term38485.getClass(), "status", enum162);
        setIntField(term38485, term38485.getClass(), "prefixLength", 389427431);
        setField(term38485, term38485.getClass(), "filePath", null);
        setField(term38472, term38472.getClass(), "file", term38485);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isPaxHeader", argTypes, term10900, args);
        assertTrue(recursiveEquals(term10900, term38472));
        assertTrue(recursiveEquals(retValue, false));
    }

};


